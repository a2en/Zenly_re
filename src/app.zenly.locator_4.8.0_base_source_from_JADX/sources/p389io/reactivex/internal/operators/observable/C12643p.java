package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Action;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.QueueDisposable;
import p389io.reactivex.internal.observers.C12463b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.p */
public final class C12643p<T> extends C12538a<T, T> {

    /* renamed from: f */
    final Action f32906f;

    /* renamed from: io.reactivex.internal.operators.observable.p$a */
    static final class C12644a<T> extends C12463b<T> implements Observer<T> {
        private static final long serialVersionUID = 4109457741734051389L;

        /* renamed from: e */
        final Observer<? super T> f32907e;

        /* renamed from: f */
        final Action f32908f;

        /* renamed from: g */
        Disposable f32909g;

        /* renamed from: h */
        QueueDisposable<T> f32910h;

        /* renamed from: i */
        boolean f32911i;

        C12644a(Observer<? super T> observer, Action action) {
            this.f32907e = observer;
            this.f32908f = action;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36787a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f32908f.run();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    C12768a.m33415b(th);
                }
            }
        }

        public void clear() {
            this.f32910h.clear();
        }

        public void dispose() {
            this.f32909g.dispose();
            mo36787a();
        }

        public boolean isDisposed() {
            return this.f32909g.isDisposed();
        }

        public boolean isEmpty() {
            return this.f32910h.isEmpty();
        }

        public void onComplete() {
            this.f32907e.onComplete();
            mo36787a();
        }

        public void onError(Throwable th) {
            this.f32907e.onError(th);
            mo36787a();
        }

        public void onNext(T t) {
            this.f32907e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32909g, disposable)) {
                this.f32909g = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f32910h = (QueueDisposable) disposable;
                }
                this.f32907e.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            T poll = this.f32910h.poll();
            if (poll == null && this.f32911i) {
                mo36787a();
            }
            return poll;
        }

        public int requestFusion(int i) {
            QueueDisposable<T> queueDisposable = this.f32910h;
            if (queueDisposable == null || (i & 4) != 0) {
                return 0;
            }
            int requestFusion = queueDisposable.requestFusion(i);
            if (requestFusion != 0) {
                boolean z = true;
                if (requestFusion != 1) {
                    z = false;
                }
                this.f32911i = z;
            }
            return requestFusion;
        }
    }

    public C12643p(ObservableSource<T> observableSource, Action action) {
        super(observableSource);
        this.f32906f = action;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12644a(observer, this.f32906f));
    }
}
