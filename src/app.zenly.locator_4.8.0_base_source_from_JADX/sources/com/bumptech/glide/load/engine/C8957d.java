package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.d */
final class C8957d implements Key {

    /* renamed from: b */
    private final Key f23331b;

    /* renamed from: c */
    private final Key f23332c;

    C8957d(Key key, Key key2) {
        this.f23331b = key;
        this.f23332c = key2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8957d)) {
            return false;
        }
        C8957d dVar = (C8957d) obj;
        if (!this.f23331b.equals(dVar.f23331b) || !this.f23332c.equals(dVar.f23332c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f23331b.hashCode() * 31) + this.f23332c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataCacheKey{sourceKey=");
        sb.append(this.f23331b);
        sb.append(", signature=");
        sb.append(this.f23332c);
        sb.append('}');
        return sb.toString();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f23331b.updateDiskCacheKey(messageDigest);
        this.f23332c.updateDiskCacheKey(messageDigest);
    }
}
