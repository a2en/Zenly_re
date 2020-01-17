package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;

public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2605a = versionedParcel.mo6286a(iconCompat.f2605a, 1);
        iconCompat.f2607c = versionedParcel.mo6303a(iconCompat.f2607c, 2);
        iconCompat.f2608d = versionedParcel.mo6287a(iconCompat.f2608d, 3);
        iconCompat.f2609e = versionedParcel.mo6286a(iconCompat.f2609e, 4);
        iconCompat.f2610f = versionedParcel.mo6286a(iconCompat.f2610f, 5);
        iconCompat.f2611g = (ColorStateList) versionedParcel.mo6287a(iconCompat.f2611g, 6);
        iconCompat.f2613i = versionedParcel.mo6291a(iconCompat.f2613i, 7);
        iconCompat.mo3108c();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo6299a(true, true);
        iconCompat.mo3106a(versionedParcel.mo6314c());
        int i = iconCompat.f2605a;
        if (-1 != i) {
            versionedParcel.mo6306b(i, 1);
        }
        byte[] bArr = iconCompat.f2607c;
        if (bArr != null) {
            versionedParcel.mo6312b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2608d;
        if (parcelable != null) {
            versionedParcel.mo6307b(parcelable, 3);
        }
        int i2 = iconCompat.f2609e;
        if (i2 != 0) {
            versionedParcel.mo6306b(i2, 4);
        }
        int i3 = iconCompat.f2610f;
        if (i3 != 0) {
            versionedParcel.mo6306b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2611g;
        if (colorStateList != null) {
            versionedParcel.mo6307b((Parcelable) colorStateList, 6);
        }
        String str = iconCompat.f2613i;
        if (str != null) {
            versionedParcel.mo6310b(str, 7);
        }
    }
}
