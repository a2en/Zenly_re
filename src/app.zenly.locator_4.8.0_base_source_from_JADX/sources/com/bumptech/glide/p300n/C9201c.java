package com.bumptech.glide.p300n;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.n.c */
public final class C9201c implements Key {

    /* renamed from: b */
    private static final C9201c f23861b = new C9201c();

    private C9201c() {
    }

    /* renamed from: a */
    public static C9201c m22054a() {
        return f23861b;
    }

    public String toString() {
        return "EmptySignature";
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
