package p389io.reactivex.internal.observers;

import p389io.reactivex.Observer;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.observers.i */
public class C12470i<T> extends C12463b<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: e */
    protected final Observer<? super T> f32337e;

    /* renamed from: f */
    protected T f32338f;

    public C12470i(Observer<? super T> observer) {
        this.f32337e = observer;
    }

    /* renamed from: a */
    public final void mo36676a(T t) {
        int i = get();
        if ((i & 54) == 0) {
            Observer<? super T> observer = this.f32337e;
            if (i == 8) {
                this.f32338f = t;
                lazySet(16);
                observer.onNext(null);
            } else {
                lazySet(2);
                observer.onNext(t);
            }
            if (get() != 4) {
                observer.onComplete();
            }
        }
    }

    public final void clear() {
        lazySet(32);
        this.f32338f = null;
    }

    public void dispose() {
        set(4);
        this.f32338f = null;
    }

    public final boolean isDisposed() {
        return get() == 4;
    }

    public final boolean isEmpty() {
        return get() != 16;
    }

    public final T poll() throws Exception {
        if (get() != 16) {
            return null;
        }
        T t = this.f32338f;
        this.f32338f = null;
        lazySet(32);
        return t;
    }

    public final int requestFusion(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    /* renamed from: a */
    public final void mo36677a(Throwable th) {
        if ((get() & 54) != 0) {
            C12768a.m33415b(th);
            return;
        }
        lazySet(2);
        this.f32337e.onError(th);
    }

    /* renamed from: a */
    public final void mo36675a() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.f32337e.onComplete();
        }
    }
}
