package p389io.reactivex.p393i.p395b.p399d;

import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.d.o */
public final class C12424o<T, R> extends C12291g<R> {

    /* renamed from: e */
    final SingleSource<? extends T> f32228e;

    /* renamed from: f */
    final Function<? super T, ? extends R> f32229f;

    /* renamed from: io.reactivex.i.b.d.o$a */
    static final class C12425a<T, R> implements SingleObserver<T> {

        /* renamed from: e */
        final SingleObserver<? super R> f32230e;

        /* renamed from: f */
        final Function<? super T, ? extends R> f32231f;

        C12425a(SingleObserver<? super R> singleObserver, Function<? super T, ? extends R> function) {
            this.f32230e = singleObserver;
            this.f32231f = function;
        }

        public void onError(Throwable th) {
            this.f32230e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32230e.onSubscribe(disposable);
        }

        public void onSuccess(T t) {
            try {
                this.f32230e.onSuccess(C12324b.m32836a(this.f32231f.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                C12285a.m32748b(th);
                onError(th);
            }
        }
    }

    public C12424o(SingleSource<? extends T> singleSource, Function<? super T, ? extends R> function) {
        this.f32228e = singleSource;
        this.f32229f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super R> singleObserver) {
        this.f32228e.subscribe(new C12425a(singleObserver, this.f32229f));
    }
}
