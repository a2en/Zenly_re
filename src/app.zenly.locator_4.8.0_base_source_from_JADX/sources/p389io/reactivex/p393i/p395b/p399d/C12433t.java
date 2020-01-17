package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.d.t */
public final class C12433t<T> extends C12291g<T> {

    /* renamed from: e */
    final SingleSource<T> f32249e;

    /* renamed from: f */
    final long f32250f;

    /* renamed from: g */
    final TimeUnit f32251g;

    /* renamed from: h */
    final C12286f f32252h;

    /* renamed from: i */
    final SingleSource<? extends T> f32253i;

    /* renamed from: io.reactivex.i.b.d.t$a */
    static final class C12434a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Runnable, Disposable {
        private static final long serialVersionUID = 37497744973048446L;

        /* renamed from: e */
        final SingleObserver<? super T> f32254e;

        /* renamed from: f */
        final AtomicReference<Disposable> f32255f = new AtomicReference<>();

        /* renamed from: g */
        final C12435a<T> f32256g;

        /* renamed from: h */
        SingleSource<? extends T> f32257h;

        /* renamed from: i */
        final long f32258i;

        /* renamed from: j */
        final TimeUnit f32259j;

        /* renamed from: io.reactivex.i.b.d.t$a$a */
        static final class C12435a<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = 2071387740092105509L;

            /* renamed from: e */
            final SingleObserver<? super T> f32260e;

            C12435a(SingleObserver<? super T> singleObserver) {
                this.f32260e = singleObserver;
            }

            public void onError(Throwable th) {
                this.f32260e.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32978c(this, disposable);
            }

            public void onSuccess(T t) {
                this.f32260e.onSuccess(t);
            }
        }

        C12434a(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource, long j, TimeUnit timeUnit) {
            this.f32254e = singleObserver;
            this.f32257h = singleSource;
            this.f32258i = j;
            this.f32259j = timeUnit;
            if (singleSource != null) {
                this.f32256g = new C12435a<>(singleObserver);
            } else {
                this.f32256g = null;
            }
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
            C12458b.m32975a(this.f32255f);
            C12435a<T> aVar = this.f32256g;
            if (aVar != null) {
                C12458b.m32975a((AtomicReference<Disposable>) aVar);
            }
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onError(Throwable th) {
            Disposable disposable = (Disposable) get();
            C12458b bVar = C12458b.DISPOSED;
            if (disposable == bVar || !compareAndSet(disposable, bVar)) {
                C12768a.m33415b(th);
                return;
            }
            C12458b.m32975a(this.f32255f);
            this.f32254e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void onSuccess(T t) {
            Disposable disposable = (Disposable) get();
            C12458b bVar = C12458b.DISPOSED;
            if (disposable != bVar && compareAndSet(disposable, bVar)) {
                C12458b.m32975a(this.f32255f);
                this.f32254e.onSuccess(t);
            }
        }

        public void run() {
            Disposable disposable = (Disposable) get();
            C12458b bVar = C12458b.DISPOSED;
            if (disposable != bVar && compareAndSet(disposable, bVar)) {
                if (disposable != null) {
                    disposable.dispose();
                }
                SingleSource<? extends T> singleSource = this.f32257h;
                if (singleSource == null) {
                    this.f32254e.onError(new TimeoutException(C12757g.m33351a(this.f32258i, this.f32259j)));
                    return;
                }
                this.f32257h = null;
                singleSource.subscribe(this.f32256g);
            }
        }
    }

    public C12433t(SingleSource<T> singleSource, long j, TimeUnit timeUnit, C12286f fVar, SingleSource<? extends T> singleSource2) {
        this.f32249e = singleSource;
        this.f32250f = j;
        this.f32251g = timeUnit;
        this.f32252h = fVar;
        this.f32253i = singleSource2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        C12434a aVar = new C12434a(singleObserver, this.f32253i, this.f32250f, this.f32251g);
        singleObserver.onSubscribe(aVar);
        C12458b.m32976a(aVar.f32255f, this.f32252h.mo6572a(aVar, this.f32250f, this.f32251g));
        this.f32249e.subscribe(aVar);
    }
}
