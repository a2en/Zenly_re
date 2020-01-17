package com.facebook.cache.common;

import com.facebook.cache.common.CacheEventListener.C9482a;
import java.io.IOException;

public interface CacheEvent {
    CacheKey getCacheKey();

    long getCacheLimit();

    long getCacheSize();

    C9482a getEvictionReason();

    IOException getException();

    long getItemSize();

    String getResourceId();
}
