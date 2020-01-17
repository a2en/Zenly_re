package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.cache.CountingMemoryCache.CacheTrimStrategy;
import com.facebook.imagepipeline.image.C9730c;

/* renamed from: com.facebook.imagepipeline.cache.a */
public class C9671a {

    /* renamed from: com.facebook.imagepipeline.cache.a$a */
    static class C9672a implements ValueDescriptor<C9730c> {
        C9672a() {
        }

        /* renamed from: a */
        public int getSizeInBytes(C9730c cVar) {
            return cVar.mo26406a();
        }
    }

    /* renamed from: a */
    public static CountingMemoryCache<CacheKey, C9730c> m23794a(Supplier<C9692m> supplier, MemoryTrimmableRegistry memoryTrimmableRegistry, CacheTrimStrategy cacheTrimStrategy) {
        CountingMemoryCache<CacheKey, C9730c> countingMemoryCache = new CountingMemoryCache<>(new C9672a(), cacheTrimStrategy, supplier);
        memoryTrimmableRegistry.registerMemoryTrimmable(countingMemoryCache);
        return countingMemoryCache;
    }
}
