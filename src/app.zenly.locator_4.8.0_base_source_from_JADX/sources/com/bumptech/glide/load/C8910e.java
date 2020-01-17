package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: com.bumptech.glide.load.e */
public class C8910e<T> implements Transformation<T> {

    /* renamed from: b */
    private final Collection<? extends Transformation<T>> f23224b;

    @SafeVarargs
    public C8910e(Transformation<T>... transformationArr) {
        if (transformationArr.length != 0) {
            this.f23224b = Arrays.asList(transformationArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8910e)) {
            return false;
        }
        return this.f23224b.equals(((C8910e) obj).f23224b);
    }

    public int hashCode() {
        return this.f23224b.hashCode();
    }

    public Resource<T> transform(Context context, Resource<T> resource, int i, int i2) {
        Resource<T> resource2 = resource;
        for (Transformation transform : this.f23224b) {
            Resource<T> transform2 = transform.transform(context, resource2, i, i2);
            if (resource2 != null && !resource2.equals(resource) && !resource2.equals(transform2)) {
                resource2.recycle();
            }
            resource2 = transform2;
        }
        return resource2;
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        for (Transformation updateDiskCacheKey : this.f23224b) {
            updateDiskCacheKey.updateDiskCacheKey(messageDigest);
        }
    }
}
