package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.engine.cache.DiskCache.Factory;
import java.io.File;

public class DiskLruCacheFactory implements Factory {

    /* renamed from: a */
    private final long f23298a;

    /* renamed from: b */
    private final CacheDirectoryGetter f23299b;

    public interface CacheDirectoryGetter {
        File getCacheDirectory();
    }

    public DiskLruCacheFactory(CacheDirectoryGetter cacheDirectoryGetter, long j) {
        this.f23298a = j;
        this.f23299b = cacheDirectoryGetter;
    }

    public DiskCache build() {
        File cacheDirectory = this.f23299b.getCacheDirectory();
        if (cacheDirectory == null) {
            return null;
        }
        if (cacheDirectory.mkdirs() || (cacheDirectory.exists() && cacheDirectory.isDirectory())) {
            return C8946c.m21493a(cacheDirectory, this.f23298a);
        }
        return null;
    }
}
