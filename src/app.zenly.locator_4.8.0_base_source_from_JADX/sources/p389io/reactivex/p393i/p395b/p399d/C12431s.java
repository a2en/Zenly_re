package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12461e;

/* renamed from: io.reactivex.i.b.d.s */
public final class C12431s<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<? extends T> f32244e;

    /* renamed from: f */
    final C12286f f32245f;

    /* renamed from: io.reactivex.i.b.d.s$a */
    static final class C12432a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: e */
        final SingleObserver<? super T> f32246e;

        /* renamed from: f */
        final C12461e f32247f = new C12461e();

        /* renamed from: g */
        final SingleSource<? extends T> f32248g;

        C12432a(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.f32246e = singleObserver;
            this.f32248g = singleSource;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
            this.f32247f.dispose();
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onError(Throwable th) {
            this.f32246e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void onSuccess(T t) {
            this.f32246e.onSuccess(t);
        }

        public void run() {
            this.f32248g.subscribe(this);
        }
    }

    public C12431s(SingleSource<? extends T> singleSource, C12286f fVar) {
        this.f32244e = singleSource;
        this.f32245f = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        C12432a aVar = new C12432a(singleObserver, this.f32244e);
        singleObserver.onSubscribe(aVar);
        aVar.f32247f.mo36653a(this.f32245f.mo6570a(aVar));
    }
}
