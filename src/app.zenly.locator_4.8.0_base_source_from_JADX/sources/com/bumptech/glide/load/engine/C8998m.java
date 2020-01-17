package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.p301o.C9216j;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.m */
class C8998m implements Key {

    /* renamed from: b */
    private final Object f23486b;

    /* renamed from: c */
    private final int f23487c;

    /* renamed from: d */
    private final int f23488d;

    /* renamed from: e */
    private final Class<?> f23489e;

    /* renamed from: f */
    private final Class<?> f23490f;

    /* renamed from: g */
    private final Key f23491g;

    /* renamed from: h */
    private final Map<Class<?>, Transformation<?>> f23492h;

    /* renamed from: i */
    private final C9011f f23493i;

    /* renamed from: j */
    private int f23494j;

    C8998m(Object obj, Key key, int i, int i2, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, C9011f fVar) {
        C9216j.m22083a(obj);
        this.f23486b = obj;
        C9216j.m22084a(key, "Signature must not be null");
        this.f23491g = key;
        this.f23487c = i;
        this.f23488d = i2;
        C9216j.m22083a(map);
        this.f23492h = map;
        C9216j.m22084a(cls, "Resource class must not be null");
        this.f23489e = cls;
        C9216j.m22084a(cls2, "Transcode class must not be null");
        this.f23490f = cls2;
        C9216j.m22083a(fVar);
        this.f23493i = fVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8998m)) {
            return false;
        }
        C8998m mVar = (C8998m) obj;
        if (!this.f23486b.equals(mVar.f23486b) || !this.f23491g.equals(mVar.f23491g) || this.f23488d != mVar.f23488d || this.f23487c != mVar.f23487c || !this.f23492h.equals(mVar.f23492h) || !this.f23489e.equals(mVar.f23489e) || !this.f23490f.equals(mVar.f23490f) || !this.f23493i.equals(mVar.f23493i)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f23494j == 0) {
            this.f23494j = this.f23486b.hashCode();
            this.f23494j = (this.f23494j * 31) + this.f23491g.hashCode();
            this.f23494j = (this.f23494j * 31) + this.f23487c;
            this.f23494j = (this.f23494j * 31) + this.f23488d;
            this.f23494j = (this.f23494j * 31) + this.f23492h.hashCode();
            this.f23494j = (this.f23494j * 31) + this.f23489e.hashCode();
            this.f23494j = (this.f23494j * 31) + this.f23490f.hashCode();
            this.f23494j = (this.f23494j * 31) + this.f23493i.hashCode();
        }
        return this.f23494j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EngineKey{model=");
        sb.append(this.f23486b);
        sb.append(", width=");
        sb.append(this.f23487c);
        sb.append(", height=");
        sb.append(this.f23488d);
        sb.append(", resourceClass=");
        sb.append(this.f23489e);
        sb.append(", transcodeClass=");
        sb.append(this.f23490f);
        sb.append(", signature=");
        sb.append(this.f23491g);
        sb.append(", hashCode=");
        sb.append(this.f23494j);
        sb.append(", transformations=");
        sb.append(this.f23492h);
        sb.append(", options=");
        sb.append(this.f23493i);
        sb.append('}');
        return sb.toString();
    }

    public void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
