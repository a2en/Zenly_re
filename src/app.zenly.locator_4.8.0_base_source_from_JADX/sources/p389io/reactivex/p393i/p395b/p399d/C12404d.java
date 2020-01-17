package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12291g;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.observers.C12479r;

/* renamed from: io.reactivex.i.b.d.d */
public final class C12404d<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<T> f32189e;

    /* renamed from: f */
    final CompletableSource f32190f;

    /* renamed from: io.reactivex.i.b.d.d$a */
    static final class C12405a<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        private static final long serialVersionUID = -8565274649390031272L;

        /* renamed from: e */
        final SingleObserver<? super T> f32191e;

        /* renamed from: f */
        final SingleSource<T> f32192f;

        C12405a(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f32191e = singleObserver;
            this.f32192f = singleSource;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            this.f32192f.subscribe(new C12479r(this, this.f32191e));
        }

        public void onError(Throwable th) {
            this.f32191e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32191e.onSubscribe(this);
            }
        }
    }

    public C12404d(SingleSource<T> singleSource, CompletableSource completableSource) {
        this.f32189e = singleSource;
        this.f32190f = completableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32190f.subscribe(new C12405a(singleObserver, this.f32189e));
    }
}
