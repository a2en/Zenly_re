package com.facebook.imagepipeline.core;

import com.facebook.cache.disk.C9500c;
import com.facebook.cache.disk.DiskStorage;

public interface DiskStorageFactory {
    DiskStorage get(C9500c cVar);
}
