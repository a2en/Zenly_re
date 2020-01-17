package p389io.reactivex.p393i.p401d;

import org.reactivestreams.Subscriber;

/* renamed from: io.reactivex.i.d.c */
public class C12452c<T> extends C12450a<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: e */
    protected final Subscriber<? super T> f32297e;

    /* renamed from: f */
    protected T f32298f;

    public C12452c(Subscriber<? super T> subscriber) {
        this.f32297e = subscriber;
    }

    /* renamed from: a */
    public final void mo36644a(T t) {
        int i = get();
        while (i != 8) {
            if ((i & -3) == 0) {
                if (i == 2) {
                    lazySet(3);
                    Subscriber<? super T> subscriber = this.f32297e;
                    subscriber.onNext(t);
                    if (get() != 4) {
                        subscriber.onComplete();
                    }
                    return;
                }
                this.f32298f = t;
                if (!compareAndSet(0, 1)) {
                    i = get();
                    if (i == 4) {
                        this.f32298f = null;
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f32298f = t;
        lazySet(16);
        Subscriber<? super T> subscriber2 = this.f32297e;
        subscriber2.onNext(t);
        if (get() != 4) {
            subscriber2.onComplete();
        }
    }

    public void cancel() {
        set(4);
        this.f32298f = null;
    }

    public final void clear() {
        lazySet(32);
        this.f32298f = null;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f32298f;
        this.f32298f = null;
        return t;
    }

    public final void request(long j) {
        if (C12456g.m32971b(j)) {
            do {
                int i = get();
                if ((i & -2) == 0) {
                    if (i == 1) {
                        if (compareAndSet(1, 3)) {
                            T t = this.f32298f;
                            if (t != null) {
                                this.f32298f = null;
                                Subscriber<? super T> subscriber = this.f32297e;
                                subscriber.onNext(t);
                                if (get() != 4) {
                                    subscriber.onComplete();
                                }
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }
}
