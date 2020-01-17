package app.zenly.locator.core.util;

/* renamed from: app.zenly.locator.core.util.x */
public abstract class C3243x<T> extends C3193b<T> {
    public C3243x(int i) {
        super(i);
    }

    public T acquire() {
        T acquire;
        synchronized (this) {
            acquire = super.acquire();
        }
        return acquire;
    }

    public boolean release(T t) {
        boolean release;
        synchronized (this) {
            release = super.release(t);
        }
        return release;
    }
}
