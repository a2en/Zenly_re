package androidx.media;

import android.media.AudioAttributes;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplApi21Parcelizer {
    public static C0934b read(VersionedParcel versionedParcel) {
        C0934b bVar = new C0934b();
        bVar.f3611a = (AudioAttributes) versionedParcel.mo6287a(bVar.f3611a, 1);
        bVar.f3612b = versionedParcel.mo6286a(bVar.f3612b, 2);
        return bVar;
    }

    public static void write(C0934b bVar, VersionedParcel versionedParcel) {
        versionedParcel.mo6299a(false, false);
        versionedParcel.mo6307b((Parcelable) bVar.f3611a, 1);
        versionedParcel.mo6306b(bVar.f3612b, 2);
    }
}
