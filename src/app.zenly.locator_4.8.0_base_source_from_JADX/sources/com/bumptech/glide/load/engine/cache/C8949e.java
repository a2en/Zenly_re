package com.bumptech.glide.load.engine.cache;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener;
import com.bumptech.glide.p301o.C9213g;

/* renamed from: com.bumptech.glide.load.engine.cache.e */
public class C8949e extends C9213g<Key, Resource<?>> implements MemoryCache {

    /* renamed from: e */
    private ResourceRemovedListener f23312e;

    public C8949e(long j) {
        super(j);
    }

    public /* bridge */ /* synthetic */ Resource put(Key key, Resource resource) {
        return (Resource) super.mo24824b(key, resource);
    }

    public /* bridge */ /* synthetic */ Resource remove(Key key) {
        return (Resource) super.mo24825c(key);
    }

    public void setResourceRemovedListener(ResourceRemovedListener resourceRemovedListener) {
        this.f23312e = resourceRemovedListener;
    }

    @SuppressLint({"InlinedApi"})
    public void trimMemory(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            mo24823a(getMaxSize() / 2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24386a(Key key, Resource<?> resource) {
        ResourceRemovedListener resourceRemovedListener = this.f23312e;
        if (resourceRemovedListener != null && resource != null) {
            resourceRemovedListener.onResourceRemoved(resource);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo24387b(Resource<?> resource) {
        if (resource == null) {
            return super.mo24387b(null);
        }
        return resource.getSize();
    }
}
