package com.facebook.imagepipeline.common;

import com.facebook.common.util.C9555a;

/* renamed from: com.facebook.imagepipeline.common.f */
public class C9702f {

    /* renamed from: c */
    private static final C9702f f25359c = new C9702f(-1, false);

    /* renamed from: d */
    private static final C9702f f25360d = new C9702f(-1, true);

    /* renamed from: a */
    private final int f25361a;

    /* renamed from: b */
    private final boolean f25362b;

    static {
        new C9702f(-2, false);
    }

    private C9702f(int i, boolean z) {
        this.f25361a = i;
        this.f25362b = z;
    }

    /* renamed from: e */
    public static C9702f m23854e() {
        return f25359c;
    }

    /* renamed from: f */
    public static C9702f m23855f() {
        return f25360d;
    }

    /* renamed from: a */
    public boolean mo26271a() {
        return this.f25362b;
    }

    /* renamed from: b */
    public int mo26272b() {
        if (!mo26274d()) {
            return this.f25361a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    /* renamed from: c */
    public boolean mo26273c() {
        return this.f25361a != -2;
    }

    /* renamed from: d */
    public boolean mo26274d() {
        return this.f25361a == -1;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9702f)) {
            return false;
        }
        C9702f fVar = (C9702f) obj;
        if (!(this.f25361a == fVar.f25361a && this.f25362b == fVar.f25362b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C9555a.m23378a((Object) Integer.valueOf(this.f25361a), (Object) Boolean.valueOf(this.f25362b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", new Object[]{Integer.valueOf(this.f25361a), Boolean.valueOf(this.f25362b)});
    }
}
