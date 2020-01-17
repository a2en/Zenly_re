package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.QueueDisposable;
import p389io.reactivex.internal.fuseable.SimpleQueue;
import p389io.reactivex.internal.observers.C12463b;
import p389io.reactivex.internal.schedulers.C12741m;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.o0 */
public final class C12635o0<T> extends C12538a<T, T> {

    /* renamed from: f */
    final C12286f f32870f;

    /* renamed from: g */
    final boolean f32871g;

    /* renamed from: h */
    final int f32872h;

    /* renamed from: io.reactivex.internal.operators.observable.o0$a */
    static final class C12636a<T> extends C12463b<T> implements Observer<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: e */
        final Observer<? super T> f32873e;

        /* renamed from: f */
        final C12289c f32874f;

        /* renamed from: g */
        final boolean f32875g;

        /* renamed from: h */
        final int f32876h;

        /* renamed from: i */
        SimpleQueue<T> f32877i;

        /* renamed from: j */
        Disposable f32878j;

        /* renamed from: k */
        Throwable f32879k;

        /* renamed from: l */
        volatile boolean f32880l;

        /* renamed from: m */
        volatile boolean f32881m;

        /* renamed from: n */
        int f32882n;

        /* renamed from: o */
        boolean f32883o;

        C12636a(Observer<? super T> observer, C12289c cVar, boolean z, int i) {
            this.f32873e = observer;
            this.f32874f = cVar;
            this.f32875g = z;
            this.f32876h = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36778a() {
            int i = 1;
            while (!this.f32881m) {
                boolean z = this.f32880l;
                Throwable th = this.f32879k;
                if (this.f32875g || !z || th == null) {
                    this.f32873e.onNext(null);
                    if (z) {
                        this.f32881m = true;
                        Throwable th2 = this.f32879k;
                        if (th2 != null) {
                            this.f32873e.onError(th2);
                        } else {
                            this.f32873e.onComplete();
                        }
                        this.f32874f.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f32881m = true;
                    this.f32873e.onError(th);
                    this.f32874f.dispose();
                    return;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36780b() {
            SimpleQueue<T> simpleQueue = this.f32877i;
            Observer<? super T> observer = this.f32873e;
            int i = 1;
            while (!mo36779a(this.f32880l, simpleQueue.isEmpty(), observer)) {
                while (true) {
                    boolean z = this.f32880l;
                    try {
                        Object poll = simpleQueue.poll();
                        boolean z2 = poll == null;
                        if (!mo36779a(z, z2, observer)) {
                            if (z2) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                observer.onNext(poll);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        this.f32881m = true;
                        this.f32878j.dispose();
                        simpleQueue.clear();
                        observer.onError(th);
                        this.f32874f.dispose();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36781c() {
            if (getAndIncrement() == 0) {
                this.f32874f.mo6574a((Runnable) this);
            }
        }

        public void clear() {
            this.f32877i.clear();
        }

        public void dispose() {
            if (!this.f32881m) {
                this.f32881m = true;
                this.f32878j.dispose();
                this.f32874f.dispose();
                if (getAndIncrement() == 0) {
                    this.f32877i.clear();
                }
            }
        }

        public boolean isDisposed() {
            return this.f32881m;
        }

        public boolean isEmpty() {
            return this.f32877i.isEmpty();
        }

        public void onComplete() {
            if (!this.f32880l) {
                this.f32880l = true;
                mo36781c();
            }
        }

        public void onError(Throwable th) {
            if (this.f32880l) {
                C12768a.m33415b(th);
                return;
            }
            this.f32879k = th;
            this.f32880l = true;
            mo36781c();
        }

        public void onNext(T t) {
            if (!this.f32880l) {
                if (this.f32882n != 2) {
                    this.f32877i.offer(t);
                }
                mo36781c();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32878j, disposable)) {
                this.f32878j = disposable;
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f32882n = requestFusion;
                        this.f32877i = queueDisposable;
                        this.f32880l = true;
                        this.f32873e.onSubscribe(this);
                        mo36781c();
                        return;
                    } else if (requestFusion == 2) {
                        this.f32882n = requestFusion;
                        this.f32877i = queueDisposable;
                        this.f32873e.onSubscribe(this);
                        return;
                    }
                }
                this.f32877i = new C12449c(this.f32876h);
                this.f32873e.onSubscribe(this);
            }
        }

        public T poll() throws Exception {
            return this.f32877i.poll();
        }

        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f32883o = true;
            return 2;
        }

        public void run() {
            if (this.f32883o) {
                mo36778a();
            } else {
                mo36780b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36779a(boolean z, boolean z2, Observer<? super T> observer) {
            if (this.f32881m) {
                this.f32877i.clear();
                return true;
            }
            if (z) {
                Throwable th = this.f32879k;
                if (this.f32875g) {
                    if (z2) {
                        this.f32881m = true;
                        if (th != null) {
                            observer.onError(th);
                        } else {
                            observer.onComplete();
                        }
                        this.f32874f.dispose();
                        return true;
                    }
                } else if (th != null) {
                    this.f32881m = true;
                    this.f32877i.clear();
                    observer.onError(th);
                    this.f32874f.dispose();
                    return true;
                } else if (z2) {
                    this.f32881m = true;
                    observer.onComplete();
                    this.f32874f.dispose();
                    return true;
                }
            }
            return false;
        }
    }

    public C12635o0(ObservableSource<T> observableSource, C12286f fVar, boolean z, int i) {
        super(observableSource);
        this.f32870f = fVar;
        this.f32871g = z;
        this.f32872h = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12286f fVar = this.f32870f;
        if (fVar instanceof C12741m) {
            this.f32549e.subscribe(observer);
            return;
        }
        this.f32549e.subscribe(new C12636a(observer, fVar.mo6573a(), this.f32871g, this.f32872h));
    }
}
