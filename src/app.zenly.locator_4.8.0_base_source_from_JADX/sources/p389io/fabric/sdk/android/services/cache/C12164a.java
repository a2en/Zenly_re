package p389io.fabric.sdk.android.services.cache;

import android.content.Context;

/* renamed from: io.fabric.sdk.android.services.cache.a */
public abstract class C12164a<T> implements ValueCache<T> {

    /* renamed from: a */
    private final ValueCache<T> f31626a;

    public C12164a(ValueCache<T> valueCache) {
        this.f31626a = valueCache;
    }

    /* renamed from: b */
    private void m32174b(Context context, T t) {
        if (t != null) {
            mo36027a(context, t);
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36026a(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36027a(Context context, T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo36028b(Context context);

    public final synchronized T get(Context context, ValueLoader<T> valueLoader) throws Exception {
        T b;
        b = mo36028b(context);
        if (b == null) {
            b = this.f31626a != null ? this.f31626a.get(context, valueLoader) : valueLoader.load(context);
            m32174b(context, b);
        }
        return b;
    }

    public final synchronized void invalidate(Context context) {
        mo36026a(context);
    }
}
