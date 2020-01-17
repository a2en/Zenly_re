package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3525a = (C0933a) versionedParcel.mo6288a(audioAttributesCompat.f3525a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo6299a(false, false);
        versionedParcel.mo6308b((VersionedParcelable) audioAttributesCompat.f3525a, 1);
    }
}
