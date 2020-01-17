package android.support.p001v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator<ParcelableVolumeInfo> CREATOR = new C0068a();

    /* renamed from: e */
    public int f99e;

    /* renamed from: f */
    public int f100f;

    /* renamed from: g */
    public int f101g;

    /* renamed from: h */
    public int f102h;

    /* renamed from: i */
    public int f103i;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    static class C0068a implements Creator<ParcelableVolumeInfo> {
        C0068a() {
        }

        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f99e = parcel.readInt();
        this.f101g = parcel.readInt();
        this.f102h = parcel.readInt();
        this.f103i = parcel.readInt();
        this.f100f = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f99e);
        parcel.writeInt(this.f101g);
        parcel.writeInt(this.f102h);
        parcel.writeInt(this.f103i);
        parcel.writeInt(this.f100f);
    }
}
