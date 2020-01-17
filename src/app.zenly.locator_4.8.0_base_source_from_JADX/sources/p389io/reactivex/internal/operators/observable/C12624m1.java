package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.C12800a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.m1 */
public final class C12624m1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f32829f;

    /* renamed from: g */
    final TimeUnit f32830g;

    /* renamed from: h */
    final C12286f f32831h;

    /* renamed from: io.reactivex.internal.operators.observable.m1$a */
    static final class C12625a<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = 786994795061867455L;

        /* renamed from: e */
        final Observer<? super T> f32832e;

        /* renamed from: f */
        final long f32833f;

        /* renamed from: g */
        final TimeUnit f32834g;

        /* renamed from: h */
        final C12289c f32835h;

        /* renamed from: i */
        Disposable f32836i;

        /* renamed from: j */
        volatile boolean f32837j;

        /* renamed from: k */
        boolean f32838k;

        C12625a(Observer<? super T> observer, long j, TimeUnit timeUnit, C12289c cVar) {
            this.f32832e = observer;
            this.f32833f = j;
            this.f32834g = timeUnit;
            this.f32835h = cVar;
        }

        public void dispose() {
            this.f32836i.dispose();
            this.f32835h.dispose();
        }

        public boolean isDisposed() {
            return this.f32835h.isDisposed();
        }

        public void onComplete() {
            if (!this.f32838k) {
                this.f32838k = true;
                this.f32832e.onComplete();
                this.f32835h.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f32838k) {
                C12768a.m33415b(th);
                return;
            }
            this.f32838k = true;
            this.f32832e.onError(th);
            this.f32835h.dispose();
        }

        public void onNext(T t) {
            if (!this.f32837j && !this.f32838k) {
                this.f32837j = true;
                this.f32832e.onNext(t);
                Disposable disposable = (Disposable) get();
                if (disposable != null) {
                    disposable.dispose();
                }
                C12458b.m32976a((AtomicReference<Disposable>) this, this.f32835h.mo6576a(this, this.f32833f, this.f32834g));
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32836i, disposable)) {
                this.f32836i = disposable;
                this.f32832e.onSubscribe(this);
            }
        }

        public void run() {
            this.f32837j = false;
        }
    }

    public C12624m1(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C12286f fVar) {
        super(observableSource);
        this.f32829f = j;
        this.f32830g = timeUnit;
        this.f32831h = fVar;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.f32549e;
        C12625a aVar = new C12625a(new C12800a(observer), this.f32829f, this.f32830g, this.f32831h.mo6573a());
        observableSource.subscribe(aVar);
    }
}
