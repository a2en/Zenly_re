package com.wonderkiln.camerakit;

/* renamed from: com.wonderkiln.camerakit.r */
public class C11991r implements Comparable<C11991r> {

    /* renamed from: e */
    private final int f31255e;

    /* renamed from: f */
    private final int f31256f;

    public C11991r(int i, int i2) {
        this.f31255e = i;
        this.f31256f = i2;
    }

    /* renamed from: a */
    public int mo35598a() {
        return this.f31256f;
    }

    /* renamed from: b */
    public int mo35600b() {
        return this.f31255e;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11991r) {
            C11991r rVar = (C11991r) obj;
            if (this.f31255e == rVar.f31255e && this.f31256f == rVar.f31256f) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        int i = this.f31256f;
        int i2 = this.f31255e;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f31255e);
        sb.append("x");
        sb.append(this.f31256f);
        return sb.toString();
    }

    /* renamed from: a */
    public int compareTo(C11991r rVar) {
        return (this.f31255e * this.f31256f) - (rVar.f31255e * rVar.f31256f);
    }
}
