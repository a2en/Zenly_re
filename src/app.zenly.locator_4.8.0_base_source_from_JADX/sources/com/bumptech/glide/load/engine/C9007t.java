package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.p301o.C9213g;
import com.bumptech.glide.p301o.C9217k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.engine.t */
final class C9007t implements Key {

    /* renamed from: j */
    private static final C9213g<Class<?>, byte[]> f23522j = new C9213g<>(50);

    /* renamed from: b */
    private final ArrayPool f23523b;

    /* renamed from: c */
    private final Key f23524c;

    /* renamed from: d */
    private final Key f23525d;

    /* renamed from: e */
    private final int f23526e;

    /* renamed from: f */
    private final int f23527f;

    /* renamed from: g */
    private final Class<?> f23528g;

    /* renamed from: h */
    private final C9011f f23529h;

    /* renamed from: i */
    private final Transformation<?> f23530i;

    C9007t(ArrayPool arrayPool, Key key, Key key2, int i, int i2, Transformation<?> transformation, Class<?> cls, C9011f fVar) {
        this.f23523b = arrayPool;
        this.f23524c = key;
        this.f23525d = key2;
        this.f23526e = i;
        this.f23527f = i2;
        this.f23530i = transformation;
        this.f23528g = cls;
        this.f23529h = fVar;
    }

    /* renamed from: a */
    private byte[] m21667a() {
        byte[] bArr = (byte[]) f23522j.mo24822a(this.f23528g);
        if (bArr != null) {
            return bArr;
        }
        byte[] bytes = this.f23528g.getName().getBytes(Key.f23163a);
        f23522j.mo24824b(this.f23528g, bytes);
        return bytes;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9007t)) {
            return false;
        }
        C9007t tVar = (C9007t) obj;
        if (this.f23527f != tVar.f23527f || this.f23526e != tVar.f23526e || !C9217k.m22105b((Object) this.f23530i, (Object) tVar.f23530i) || !this.f23528g.equals(tVar.f23528g) || !this.f23524c.equals(tVar.f23524c) || !this.f23525d.equals(tVar.f23525d) || !this.f23529h.equals(tVar.f23529h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((this.f23524c.hashCode() * 31) + this.f23525d.hashCode()) * 31) + this.f23526e) * 31) + this.f23527f;
        Transformation<?> transformation = this.f23530i;
        if (transformation != null) {
            hashCode = (hashCode * 31) + transformation.hashCode();
        }
        return (((hashCode * 31) + this.f23528g.hashCode()) * 31) + this.f23529h.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResourceCacheKey{sourceKey=");
        sb.append(this.f23524c);
        sb.append(", signature=");
        sb.append(this.f23525d);
        sb.append(", width=");
        sb.append(this.f23526e);
        sb.append(", height=");
        sb.append(this.f23527f);
        sb.append(", decodedResourceClass=");
        sb.append(this.f23528g);
        sb.append(", transformation='");
        sb.append(this.f23530i);
        sb.append('\'');
        sb.append(", options=");
        sb.append(this.f23529h);
        sb.append('}');
        return sb.toString();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f23523b.getExact(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f23526e).putInt(this.f23527f).array();
        this.f23525d.updateDiskCacheKey(messageDigest);
        this.f23524c.updateDiskCacheKey(messageDigest);
        messageDigest.update(bArr);
        Transformation<?> transformation = this.f23530i;
        if (transformation != null) {
            transformation.updateDiskCacheKey(messageDigest);
        }
        this.f23529h.updateDiskCacheKey(messageDigest);
        messageDigest.update(m21667a());
        this.f23523b.put(bArr);
    }
}
