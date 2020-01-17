package com.facebook.imagepipeline.animated.factory;

import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.image.C9730c;
import p333g.p339c.p352d.p355b.C12058f;

/* renamed from: com.facebook.imagepipeline.animated.factory.a */
public class C9658a {

    /* renamed from: a */
    private static boolean f25233a;

    /* renamed from: b */
    private static AnimatedFactory f25234b;

    /* renamed from: a */
    public static AnimatedFactory m23745a(C12058f fVar, ExecutorSupplier executorSupplier, CountingMemoryCache<CacheKey, C9730c> countingMemoryCache, boolean z) {
        if (!f25233a) {
            try {
                f25234b = (AnimatedFactory) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(new Class[]{C12058f.class, ExecutorSupplier.class, CountingMemoryCache.class, Boolean.TYPE}).newInstance(new Object[]{fVar, executorSupplier, countingMemoryCache, Boolean.valueOf(z)});
            } catch (Throwable unused) {
            }
            if (f25234b != null) {
                f25233a = true;
            }
        }
        return f25234b;
    }
}
