package p389io.fabric.sdk.android.services.cache;

import android.content.Context;

/* renamed from: io.fabric.sdk.android.services.cache.b */
public class C12165b<T> extends C12164a<T> {

    /* renamed from: b */
    private T f31627b;

    public C12165b() {
        this(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36026a(Context context) {
        this.f31627b = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public T mo36028b(Context context) {
        return this.f31627b;
    }

    public C12165b(ValueCache<T> valueCache) {
        super(valueCache);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36027a(Context context, T t) {
        this.f31627b = t;
    }
}
