package p389io.reactivex.p393i.p395b.p396a;

import java.util.concurrent.Callable;
import p389io.reactivex.C12291g;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;

/* renamed from: io.reactivex.i.b.a.k */
public final class C12344k<T> extends C12291g<T> {

    /* renamed from: e */
    final CompletableSource f32046e;

    /* renamed from: f */
    final Callable<? extends T> f32047f;

    /* renamed from: g */
    final T f32048g;

    /* renamed from: io.reactivex.i.b.a.k$a */
    final class C12345a implements CompletableObserver {

        /* renamed from: e */
        private final SingleObserver<? super T> f32049e;

        C12345a(SingleObserver<? super T> singleObserver) {
            this.f32049e = singleObserver;
        }

        public void onComplete() {
            T t;
            C12344k kVar = C12344k.this;
            Callable<? extends T> callable = kVar.f32047f;
            if (callable != null) {
                try {
                    t = callable.call();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32049e.onError(th);
                    return;
                }
            } else {
                t = kVar.f32048g;
            }
            if (t == null) {
                this.f32049e.onError(new NullPointerException("The value supplied is null"));
            } else {
                this.f32049e.onSuccess(t);
            }
        }

        public void onError(Throwable th) {
            this.f32049e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32049e.onSubscribe(disposable);
        }
    }

    public C12344k(CompletableSource completableSource, Callable<? extends T> callable, T t) {
        this.f32046e = completableSource;
        this.f32048g = t;
        this.f32047f = callable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32046e.subscribe(new C12345a(singleObserver));
    }
}
