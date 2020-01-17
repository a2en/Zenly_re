package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.PooledByteBuffer;

/* renamed from: com.facebook.imagepipeline.cache.j */
public class C9687j {

    /* renamed from: com.facebook.imagepipeline.cache.j$a */
    static class C9688a implements ValueDescriptor<PooledByteBuffer> {
        C9688a() {
        }

        /* renamed from: a */
        public int getSizeInBytes(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    /* renamed from: a */
    public static CountingMemoryCache<CacheKey, PooledByteBuffer> m23826a(Supplier<C9692m> supplier, MemoryTrimmableRegistry memoryTrimmableRegistry) {
        CountingMemoryCache<CacheKey, PooledByteBuffer> countingMemoryCache = new CountingMemoryCache<>(new C9688a(), new C9693n(), supplier);
        memoryTrimmableRegistry.registerMemoryTrimmable(countingMemoryCache);
        return countingMemoryCache;
    }
}
