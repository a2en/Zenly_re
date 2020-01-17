package com.bumptech.glide.load.p294h;

import android.content.Context;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.h.c */
public final class C9017c<T> implements Transformation<T> {

    /* renamed from: b */
    private static final Transformation<?> f23553b = new C9017c();

    private C9017c() {
    }

    /* renamed from: a */
    public static <T> C9017c<T> m21679a() {
        return (C9017c) f23553b;
    }

    public Resource<T> transform(Context context, Resource<T> resource, int i, int i2) {
        return resource;
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
