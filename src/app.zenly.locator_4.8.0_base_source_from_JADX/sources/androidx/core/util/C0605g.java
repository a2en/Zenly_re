package androidx.core.util;

/* renamed from: androidx.core.util.g */
public class C0605g<T> implements Pools$Pool<T> {

    /* renamed from: a */
    private final Object[] f2738a;

    /* renamed from: b */
    private int f2739b;

    public C0605g(int i) {
        if (i > 0) {
            this.f2738a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    private boolean m2770a(T t) {
        for (int i = 0; i < this.f2739b; i++) {
            if (this.f2738a[i] == t) {
                return true;
            }
        }
        return false;
    }

    public T acquire() {
        int i = this.f2739b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f2738a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f2739b = i - 1;
        return t;
    }

    public boolean release(T t) {
        if (!m2770a(t)) {
            int i = this.f2739b;
            Object[] objArr = this.f2738a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2739b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }
}
