package p389io.reactivex.p393i.p395b.p399d;

import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Function;

/* renamed from: io.reactivex.i.b.d.r */
public final class C12429r<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<? extends T> f32239e;

    /* renamed from: f */
    final Function<? super Throwable, ? extends T> f32240f;

    /* renamed from: g */
    final T f32241g;

    /* renamed from: io.reactivex.i.b.d.r$a */
    final class C12430a implements SingleObserver<T> {

        /* renamed from: e */
        private final SingleObserver<? super T> f32242e;

        C12430a(SingleObserver<? super T> singleObserver) {
            this.f32242e = singleObserver;
        }

        public void onError(Throwable th) {
            T t;
            C12429r rVar = C12429r.this;
            Function<? super Throwable, ? extends T> function = rVar.f32240f;
            if (function != null) {
                try {
                    t = function.apply(th);
                } catch (Throwable th2) {
                    C12285a.m32748b(th2);
                    this.f32242e.onError(new CompositeException(th, th2));
                    return;
                }
            } else {
                t = rVar.f32241g;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
                nullPointerException.initCause(th);
                this.f32242e.onError(nullPointerException);
                return;
            }
            this.f32242e.onSuccess(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32242e.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            this.f32242e.onSuccess(t);
        }
    }

    public C12429r(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends T> function, T t) {
        this.f32239e = singleSource;
        this.f32240f = function;
        this.f32241g = t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32239e.subscribe(new C12430a(singleObserver));
    }
}
