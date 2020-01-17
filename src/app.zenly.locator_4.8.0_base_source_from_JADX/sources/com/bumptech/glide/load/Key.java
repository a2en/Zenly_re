package com.bumptech.glide.load;

import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface Key {

    /* renamed from: a */
    public static final Charset f23163a = Charset.forName("UTF-8");

    boolean equals(Object obj);

    int hashCode();

    void updateDiskCacheKey(MessageDigest messageDigest);
}
