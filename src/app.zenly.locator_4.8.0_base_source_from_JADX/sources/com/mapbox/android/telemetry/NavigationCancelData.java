package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationCancelData implements Parcelable {
    public static final Creator<NavigationCancelData> CREATOR = new C11308a();

    /* renamed from: e */
    private String f29287e;

    /* renamed from: f */
    private Integer f29288f;

    /* renamed from: g */
    private String f29289g;

    /* renamed from: com.mapbox.android.telemetry.NavigationCancelData$a */
    static class C11308a implements Creator<NavigationCancelData> {
        C11308a() {
        }

        public NavigationCancelData createFromParcel(Parcel parcel) {
            return new NavigationCancelData(parcel, null);
        }

        public NavigationCancelData[] newArray(int i) {
            return new NavigationCancelData[i];
        }
    }

    /* synthetic */ NavigationCancelData(Parcel parcel, C11308a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29287e);
        if (this.f29288f == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29288f.intValue());
        }
        parcel.writeString(this.f29289g);
    }

    public NavigationCancelData() {
        this.f29287e = null;
        this.f29288f = null;
        this.f29289g = null;
    }

    private NavigationCancelData(Parcel parcel) {
        Integer num = null;
        this.f29287e = null;
        this.f29288f = null;
        this.f29289g = null;
        this.f29287e = parcel.readString();
        if (parcel.readByte() != 0) {
            num = Integer.valueOf(parcel.readInt());
        }
        this.f29288f = num;
        this.f29289g = parcel.readString();
    }
}
