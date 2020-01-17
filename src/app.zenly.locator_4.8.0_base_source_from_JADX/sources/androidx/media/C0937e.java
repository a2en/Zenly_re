package androidx.media;

import android.os.Build.VERSION;

/* renamed from: androidx.media.e */
public final class C0937e {

    /* renamed from: a */
    C0938f f3617a;

    public C0937e(String str, int i, int i2) {
        if (VERSION.SDK_INT >= 28) {
            this.f3617a = new C0939g(str, i, i2);
        } else {
            this.f3617a = new C0940h(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0937e)) {
            return false;
        }
        return this.f3617a.equals(((C0937e) obj).f3617a);
    }

    public int hashCode() {
        return this.f3617a.hashCode();
    }
}
