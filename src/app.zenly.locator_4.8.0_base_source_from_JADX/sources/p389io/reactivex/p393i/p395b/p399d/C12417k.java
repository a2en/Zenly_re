package p389io.reactivex.p393i.p395b.p399d;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.d.k */
public final class C12417k<T, R> extends C12291g<R> {

    /* renamed from: e */
    final SingleSource<? extends T> f32216e;

    /* renamed from: f */
    final Function<? super T, ? extends SingleSource<? extends R>> f32217f;

    /* renamed from: io.reactivex.i.b.d.k$a */
    static final class C12418a<T, R> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = 3258103020495908596L;

        /* renamed from: e */
        final SingleObserver<? super R> f32218e;

        /* renamed from: f */
        final Function<? super T, ? extends SingleSource<? extends R>> f32219f;

        /* renamed from: io.reactivex.i.b.d.k$a$a */
        static final class C12419a<R> implements SingleObserver<R> {

            /* renamed from: e */
            final AtomicReference<Disposable> f32220e;

            /* renamed from: f */
            final SingleObserver<? super R> f32221f;

            C12419a(AtomicReference<Disposable> atomicReference, SingleObserver<? super R> singleObserver) {
                this.f32220e = atomicReference;
                this.f32221f = singleObserver;
            }

            public void onError(Throwable th) {
                this.f32221f.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32976a(this.f32220e, disposable);
            }

            public void onSuccess(R r) {
                this.f32221f.onSuccess(r);
            }
        }

        C12418a(SingleObserver<? super R> singleObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f32218e = singleObserver;
            this.f32219f = function;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onError(Throwable th) {
            this.f32218e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32218e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                SingleSource singleSource = (SingleSource) C12324b.m32836a(this.f32219f.apply(t), "The single returned by the mapper is null");
                if (!isDisposed()) {
                    singleSource.subscribe(new C12419a(this, this.f32218e));
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32218e.onError(th);
            }
        }
    }

    public C12417k(SingleSource<? extends T> singleSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.f32217f = function;
        this.f32216e = singleSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36541a(SingleObserver<? super R> singleObserver) {
        this.f32216e.subscribe(new C12418a(singleObserver, this.f32217f));
    }
}
