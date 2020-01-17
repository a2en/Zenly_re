package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Creator<ParcelImpl> CREATOR = new C1282a();

    /* renamed from: e */
    private final VersionedParcelable f4775e;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1282a implements Creator<ParcelImpl> {
        C1282a() {
        }

        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4775e = new C1283a(parcel).mo6321j();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1283a(parcel).mo6294a(this.f4775e);
    }
}
