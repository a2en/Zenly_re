package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* renamed from: androidx.media.b */
class C0934b implements C0933a {

    /* renamed from: a */
    AudioAttributes f3611a;

    /* renamed from: b */
    int f3612b = -1;

    C0934b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0934b)) {
            return false;
        }
        return this.f3611a.equals(((C0934b) obj).f3611a);
    }

    public int hashCode() {
        return this.f3611a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.f3611a);
        return sb.toString();
    }
}
