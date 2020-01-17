package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.C9500c;
import com.facebook.cache.disk.FileCache;

public interface FileCacheFactory {
    FileCache get(C9500c cVar);
}
