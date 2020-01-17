package p389io.fabric.sdk.android.services.cache;

import android.content.Context;

/* renamed from: io.fabric.sdk.android.services.cache.ValueCache */
public interface ValueCache<T> {
    T get(Context context, ValueLoader<T> valueLoader) throws Exception;

    void invalidate(Context context);
}
