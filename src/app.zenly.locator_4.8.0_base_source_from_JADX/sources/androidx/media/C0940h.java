package androidx.media;

import android.text.TextUtils;
import androidx.core.util.C0602d;

/* renamed from: androidx.media.h */
class C0940h implements C0938f {

    /* renamed from: a */
    private String f3619a;

    /* renamed from: b */
    private int f3620b;

    /* renamed from: c */
    private int f3621c;

    C0940h(String str, int i, int i2) {
        this.f3619a = str;
        this.f3620b = i;
        this.f3621c = i2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0940h)) {
            return false;
        }
        C0940h hVar = (C0940h) obj;
        if (!(TextUtils.equals(this.f3619a, hVar.f3619a) && this.f3620b == hVar.f3620b && this.f3621c == hVar.f3621c)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C0602d.m2767a(this.f3619a, Integer.valueOf(this.f3620b), Integer.valueOf(this.f3621c));
    }
}
