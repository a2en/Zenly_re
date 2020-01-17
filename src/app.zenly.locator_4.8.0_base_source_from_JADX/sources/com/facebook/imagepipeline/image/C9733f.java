package com.facebook.imagepipeline.image;

/* renamed from: com.facebook.imagepipeline.image.f */
public class C9733f implements QualityInfo {

    /* renamed from: d */
    public static final QualityInfo f25573d = m24099a(Integer.MAX_VALUE, true, true);

    /* renamed from: a */
    int f25574a;

    /* renamed from: b */
    boolean f25575b;

    /* renamed from: c */
    boolean f25576c;

    private C9733f(int i, boolean z, boolean z2) {
        this.f25574a = i;
        this.f25575b = z;
        this.f25576c = z2;
    }

    /* renamed from: a */
    public static QualityInfo m24099a(int i, boolean z, boolean z2) {
        return new C9733f(i, z, z2);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9733f)) {
            return false;
        }
        C9733f fVar = (C9733f) obj;
        if (!(this.f25574a == fVar.f25574a && this.f25575b == fVar.f25575b && this.f25576c == fVar.f25576c)) {
            z = false;
        }
        return z;
    }

    public int getQuality() {
        return this.f25574a;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.f25574a ^ (this.f25575b ? 4194304 : 0);
        if (this.f25576c) {
            i = 8388608;
        }
        return i2 ^ i;
    }

    public boolean isOfFullQuality() {
        return this.f25576c;
    }

    public boolean isOfGoodEnoughQuality() {
        return this.f25575b;
    }
}
