package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.Supplier;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.imagepipeline.cache.i */
public class C9686i implements Supplier<C9692m> {

    /* renamed from: a */
    private static final long f25316a = TimeUnit.MINUTES.toMillis(5);

    /* renamed from: a */
    private int m23825a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 1048576;
        }
        return min < 33554432 ? 2097152 : 4194304;
    }

    public C9692m get() {
        int a = m23825a();
        C9692m mVar = new C9692m(a, Integer.MAX_VALUE, a, Integer.MAX_VALUE, a / 8, f25316a);
        return mVar;
    }
}
