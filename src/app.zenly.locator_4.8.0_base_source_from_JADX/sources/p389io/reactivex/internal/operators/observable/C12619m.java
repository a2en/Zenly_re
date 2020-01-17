package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.C12800a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.m */
public final class C12619m<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f32810f;

    /* renamed from: g */
    final TimeUnit f32811g;

    /* renamed from: h */
    final C12286f f32812h;

    /* renamed from: io.reactivex.internal.operators.observable.m$a */
    static final class C12620a<T> extends AtomicReference<Disposable> implements Runnable, Disposable {
        private static final long serialVersionUID = 6812032969491025141L;

        /* renamed from: e */
        final T f32813e;

        /* renamed from: f */
        final long f32814f;

        /* renamed from: g */
        final C12621b<T> f32815g;

        /* renamed from: h */
        final AtomicBoolean f32816h = new AtomicBoolean();

        C12620a(T t, long j, C12621b<T> bVar) {
            this.f32813e = t;
            this.f32814f = j;
            this.f32815g = bVar;
        }

        /* renamed from: a */
        public void mo36772a(Disposable disposable) {
            C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return get() == C12458b.DISPOSED;
        }

        public void run() {
            if (this.f32816h.compareAndSet(false, true)) {
                this.f32815g.mo36774a(this.f32814f, this.f32813e, this);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.m$b */
    static final class C12621b<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32817e;

        /* renamed from: f */
        final long f32818f;

        /* renamed from: g */
        final TimeUnit f32819g;

        /* renamed from: h */
        final C12289c f32820h;

        /* renamed from: i */
        Disposable f32821i;

        /* renamed from: j */
        Disposable f32822j;

        /* renamed from: k */
        volatile long f32823k;

        /* renamed from: l */
        boolean f32824l;

        C12621b(Observer<? super T> observer, long j, TimeUnit timeUnit, C12289c cVar) {
            this.f32817e = observer;
            this.f32818f = j;
            this.f32819g = timeUnit;
            this.f32820h = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36774a(long j, T t, C12620a<T> aVar) {
            if (j == this.f32823k) {
                this.f32817e.onNext(t);
                aVar.dispose();
            }
        }

        public void dispose() {
            this.f32821i.dispose();
            this.f32820h.dispose();
        }

        public boolean isDisposed() {
            return this.f32820h.isDisposed();
        }

        public void onComplete() {
            if (!this.f32824l) {
                this.f32824l = true;
                Disposable disposable = this.f32822j;
                if (disposable != null) {
                    disposable.dispose();
                }
                C12620a aVar = (C12620a) disposable;
                if (aVar != null) {
                    aVar.run();
                }
                this.f32817e.onComplete();
                this.f32820h.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f32824l) {
                C12768a.m33415b(th);
                return;
            }
            Disposable disposable = this.f32822j;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f32824l = true;
            this.f32817e.onError(th);
            this.f32820h.dispose();
        }

        public void onNext(T t) {
            if (!this.f32824l) {
                long j = this.f32823k + 1;
                this.f32823k = j;
                Disposable disposable = this.f32822j;
                if (disposable != null) {
                    disposable.dispose();
                }
                C12620a aVar = new C12620a(t, j, this);
                this.f32822j = aVar;
                aVar.mo36772a(this.f32820h.mo6576a(aVar, this.f32818f, this.f32819g));
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32821i, disposable)) {
                this.f32821i = disposable;
                this.f32817e.onSubscribe(this);
            }
        }
    }

    public C12619m(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C12286f fVar) {
        super(observableSource);
        this.f32810f = j;
        this.f32811g = timeUnit;
        this.f32812h = fVar;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.f32549e;
        C12621b bVar = new C12621b(new C12800a(observer), this.f32810f, this.f32811g, this.f32812h.mo6573a());
        observableSource.subscribe(bVar);
    }
}
