package androidx.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import androidx.core.util.C0602d;

/* renamed from: androidx.media.g */
final class C0939g implements C0938f {

    /* renamed from: a */
    final RemoteUserInfo f3618a;

    C0939g(String str, int i, int i2) {
        this.f3618a = new RemoteUserInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0939g)) {
            return false;
        }
        return this.f3618a.equals(((C0939g) obj).f3618a);
    }

    public int hashCode() {
        return C0602d.m2767a(this.f3618a);
    }
}
