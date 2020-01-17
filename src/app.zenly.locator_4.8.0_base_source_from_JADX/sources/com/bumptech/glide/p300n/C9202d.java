package com.bumptech.glide.p300n;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.p301o.C9216j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.n.d */
public final class C9202d implements Key {

    /* renamed from: b */
    private final Object f23862b;

    public C9202d(Object obj) {
        C9216j.m22083a(obj);
        this.f23862b = obj;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9202d)) {
            return false;
        }
        return this.f23862b.equals(((C9202d) obj).f23862b);
    }

    public int hashCode() {
        return this.f23862b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ObjectKey{object=");
        sb.append(this.f23862b);
        sb.append('}');
        return sb.toString();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f23862b.toString().getBytes(Key.f23163a));
    }
}
