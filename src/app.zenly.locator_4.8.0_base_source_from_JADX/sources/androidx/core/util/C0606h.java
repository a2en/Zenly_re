package androidx.core.util;

/* renamed from: androidx.core.util.h */
public class C0606h<T> extends C0605g<T> {

    /* renamed from: c */
    private final Object f2740c = new Object();

    public C0606h(int i) {
        super(i);
    }

    public T acquire() {
        T acquire;
        synchronized (this.f2740c) {
            acquire = super.acquire();
        }
        return acquire;
    }

    public boolean release(T t) {
        boolean release;
        synchronized (this.f2740c) {
            release = super.release(t);
        }
        return release;
    }
}
