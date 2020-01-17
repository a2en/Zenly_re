package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableEmitter;
import p389io.reactivex.ObservableOnSubscribe;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Cancellable;
import p389io.reactivex.internal.disposables.C12457a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.l */
public final class C12613l<T> extends C12279e<T> {

    /* renamed from: e */
    final ObservableOnSubscribe<T> f32798e;

    /* renamed from: io.reactivex.internal.operators.observable.l$a */
    static final class C12614a<T> extends AtomicReference<Disposable> implements ObservableEmitter<T>, Disposable {
        private static final long serialVersionUID = -3434801548987643227L;

        /* renamed from: e */
        final Observer<? super T> f32799e;

        C12614a(Observer<? super T> observer) {
            this.f32799e = observer;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            if (!isDisposed()) {
                try {
                    this.f32799e.onComplete();
                } finally {
                    dispose();
                }
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C12768a.m33415b(th);
            }
        }

        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            if (!isDisposed()) {
                this.f32799e.onNext(t);
            }
        }

        public ObservableEmitter<T> serialize() {
            return new C12615b(this);
        }

        public void setCancellable(Cancellable cancellable) {
            setDisposable(new C12457a(cancellable));
        }

        public void setDisposable(Disposable disposable) {
            C12458b.m32977b(this, disposable);
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{C12614a.class.getSimpleName(), super.toString()});
        }

        /* JADX INFO: finally extract failed */
        public boolean tryOnError(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f32799e.onError(th);
                dispose();
                return true;
            } catch (Throwable th2) {
                dispose();
                throw th2;
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.l$b */
    static final class C12615b<T> extends AtomicInteger implements ObservableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;

        /* renamed from: e */
        final ObservableEmitter<T> f32800e;

        /* renamed from: f */
        final C12752b f32801f = new C12752b();

        /* renamed from: g */
        final C12449c<T> f32802g = new C12449c<>(16);

        /* renamed from: h */
        volatile boolean f32803h;

        C12615b(ObservableEmitter<T> observableEmitter) {
            this.f32800e = observableEmitter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36769a() {
            if (getAndIncrement() == 0) {
                mo36770b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36770b() {
            ObservableEmitter<T> observableEmitter = this.f32800e;
            C12449c<T> cVar = this.f32802g;
            C12752b bVar = this.f32801f;
            int i = 1;
            while (!observableEmitter.isDisposed()) {
                if (bVar.get() != null) {
                    cVar.clear();
                    observableEmitter.onError(bVar.mo36928a());
                    return;
                }
                boolean z = this.f32803h;
                Object poll = cVar.poll();
                boolean z2 = poll == null;
                if (z && z2) {
                    observableEmitter.onComplete();
                    return;
                } else if (z2) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    observableEmitter.onNext(poll);
                }
            }
            cVar.clear();
        }

        public boolean isDisposed() {
            return this.f32800e.isDisposed();
        }

        public void onComplete() {
            if (!this.f32800e.isDisposed() && !this.f32803h) {
                this.f32803h = true;
                mo36769a();
            }
        }

        public void onError(Throwable th) {
            if (!tryOnError(th)) {
                C12768a.m33415b(th);
            }
        }

        public void onNext(T t) {
            if (!this.f32800e.isDisposed() && !this.f32803h) {
                if (t == null) {
                    onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                    return;
                }
                if (get() != 0 || !compareAndSet(0, 1)) {
                    C12449c<T> cVar = this.f32802g;
                    synchronized (cVar) {
                        cVar.offer(t);
                    }
                    if (getAndIncrement() != 0) {
                        return;
                    }
                } else {
                    this.f32800e.onNext(t);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
                mo36770b();
            }
        }

        public ObservableEmitter<T> serialize() {
            return this;
        }

        public void setCancellable(Cancellable cancellable) {
            this.f32800e.setCancellable(cancellable);
        }

        public void setDisposable(Disposable disposable) {
            this.f32800e.setDisposable(disposable);
        }

        public String toString() {
            return this.f32800e.toString();
        }

        public boolean tryOnError(Throwable th) {
            if (!this.f32800e.isDisposed() && !this.f32803h) {
                if (th == null) {
                    th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                }
                if (this.f32801f.mo36929a(th)) {
                    this.f32803h = true;
                    mo36769a();
                    return true;
                }
            }
            return false;
        }
    }

    public C12613l(ObservableOnSubscribe<T> observableOnSubscribe) {
        this.f32798e = observableOnSubscribe;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12614a aVar = new C12614a(observer);
        observer.onSubscribe(aVar);
        try {
            this.f32798e.subscribe(aVar);
        } catch (Throwable th) {
            C12285a.m32748b(th);
            aVar.onError(th);
        }
    }
}
