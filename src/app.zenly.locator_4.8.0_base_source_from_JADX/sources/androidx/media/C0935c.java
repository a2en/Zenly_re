package androidx.media;

import java.util.Arrays;

/* renamed from: androidx.media.c */
class C0935c implements C0933a {

    /* renamed from: a */
    int f3613a = 0;

    /* renamed from: b */
    int f3614b = 0;

    /* renamed from: c */
    int f3615c = 0;

    /* renamed from: d */
    int f3616d = -1;

    C0935c() {
    }

    /* renamed from: a */
    public int mo4606a() {
        return this.f3614b;
    }

    /* renamed from: b */
    public int mo4607b() {
        int i = this.f3615c;
        int c = mo4608c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo4608c() {
        int i = this.f3616d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m4124a(false, this.f3615c, this.f3613a);
    }

    /* renamed from: d */
    public int mo4609d() {
        return this.f3613a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C0935c)) {
            return false;
        }
        C0935c cVar = (C0935c) obj;
        if (this.f3614b == cVar.mo4606a() && this.f3615c == cVar.mo4607b() && this.f3613a == cVar.mo4609d() && this.f3616d == cVar.f3616d) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3614b), Integer.valueOf(this.f3615c), Integer.valueOf(this.f3613a), Integer.valueOf(this.f3616d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3616d != -1) {
            sb.append(" stream=");
            sb.append(this.f3616d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4125a(this.f3613a));
        sb.append(" content=");
        sb.append(this.f3614b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3615c).toUpperCase());
        return sb.toString();
    }
}
