package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f2486a = (IconCompat) versionedParcel.mo6288a(remoteActionCompat.f2486a, 1);
        remoteActionCompat.f2487b = versionedParcel.mo6290a(remoteActionCompat.f2487b, 2);
        remoteActionCompat.f2488c = versionedParcel.mo6290a(remoteActionCompat.f2488c, 3);
        remoteActionCompat.f2489d = (PendingIntent) versionedParcel.mo6287a(remoteActionCompat.f2489d, 4);
        remoteActionCompat.f2490e = versionedParcel.mo6302a(remoteActionCompat.f2490e, 5);
        remoteActionCompat.f2491f = versionedParcel.mo6302a(remoteActionCompat.f2491f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo6299a(false, false);
        versionedParcel.mo6308b((VersionedParcelable) remoteActionCompat.f2486a, 1);
        versionedParcel.mo6309b(remoteActionCompat.f2487b, 2);
        versionedParcel.mo6309b(remoteActionCompat.f2488c, 3);
        versionedParcel.mo6307b((Parcelable) remoteActionCompat.f2489d, 4);
        versionedParcel.mo6311b(remoteActionCompat.f2490e, 5);
        versionedParcel.mo6311b(remoteActionCompat.f2491f, 6);
    }
}
