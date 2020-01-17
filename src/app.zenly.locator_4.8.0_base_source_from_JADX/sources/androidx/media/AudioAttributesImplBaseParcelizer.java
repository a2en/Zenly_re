package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

public final class AudioAttributesImplBaseParcelizer {
    public static C0935c read(VersionedParcel versionedParcel) {
        C0935c cVar = new C0935c();
        cVar.f3613a = versionedParcel.mo6286a(cVar.f3613a, 1);
        cVar.f3614b = versionedParcel.mo6286a(cVar.f3614b, 2);
        cVar.f3615c = versionedParcel.mo6286a(cVar.f3615c, 3);
        cVar.f3616d = versionedParcel.mo6286a(cVar.f3616d, 4);
        return cVar;
    }

    public static void write(C0935c cVar, VersionedParcel versionedParcel) {
        versionedParcel.mo6299a(false, false);
        versionedParcel.mo6306b(cVar.f3613a, 1);
        versionedParcel.mo6306b(cVar.f3614b, 2);
        versionedParcel.mo6306b(cVar.f3615c, 3);
        versionedParcel.mo6306b(cVar.f3616d, 4);
    }
}
