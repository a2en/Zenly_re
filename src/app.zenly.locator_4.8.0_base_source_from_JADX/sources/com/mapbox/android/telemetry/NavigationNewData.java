package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationNewData implements Parcelable {
    public static final Creator<NavigationNewData> CREATOR = new C11315a();

    /* renamed from: e */
    private Integer f29351e;

    /* renamed from: f */
    private Integer f29352f;

    /* renamed from: g */
    private String f29353g;

    /* renamed from: com.mapbox.android.telemetry.NavigationNewData$a */
    static class C11315a implements Creator<NavigationNewData> {
        C11315a() {
        }

        public NavigationNewData createFromParcel(Parcel parcel) {
            return new NavigationNewData(parcel, null);
        }

        public NavigationNewData[] newArray(int i) {
            return new NavigationNewData[i];
        }
    }

    /* synthetic */ NavigationNewData(Parcel parcel, C11315a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f29351e == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29351e.intValue());
        }
        if (this.f29352f == null) {
            parcel.writeByte(0);
        } else {
            parcel.writeByte(1);
            parcel.writeInt(this.f29352f.intValue());
        }
        parcel.writeString(this.f29353g);
    }

    private NavigationNewData(Parcel parcel) {
        if (parcel.readByte() == 0) {
            this.f29351e = null;
        } else {
            this.f29351e = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 0) {
            this.f29352f = null;
        } else {
            this.f29352f = Integer.valueOf(parcel.readInt());
        }
        this.f29353g = parcel.readString();
    }
}
