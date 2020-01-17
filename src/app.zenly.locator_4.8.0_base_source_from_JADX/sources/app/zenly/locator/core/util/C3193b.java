package app.zenly.locator.core.util;

import androidx.core.util.C0605g;

/* renamed from: app.zenly.locator.core.util.b */
public abstract class C3193b<T> extends C0605g<T> {
    public C3193b(int i) {
        super(i);
    }

    /* renamed from: a */
    public abstract T mo8797a();

    public T acquire() {
        T acquire = super.acquire();
        return acquire == null ? mo8797a() : acquire;
    }
}
