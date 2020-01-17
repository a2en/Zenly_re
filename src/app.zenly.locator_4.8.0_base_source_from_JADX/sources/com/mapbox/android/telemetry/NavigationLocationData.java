package com.mapbox.android.telemetry;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NavigationLocationData implements Parcelable {
    public static final Creator<NavigationLocationData> CREATOR = new C11313a();

    /* renamed from: e */
    private Location[] f29305e;

    /* renamed from: f */
    private Location[] f29306f;

    /* renamed from: com.mapbox.android.telemetry.NavigationLocationData$a */
    static class C11313a implements Creator<NavigationLocationData> {
        C11313a() {
        }

        public NavigationLocationData createFromParcel(Parcel parcel) {
            return new NavigationLocationData(parcel, null);
        }

        public NavigationLocationData[] newArray(int i) {
            return new NavigationLocationData[i];
        }
    }

    /* synthetic */ NavigationLocationData(Parcel parcel, C11313a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f29305e, i);
        parcel.writeTypedArray(this.f29306f, i);
    }

    private NavigationLocationData(Parcel parcel) {
        this.f29305e = (Location[]) parcel.createTypedArray(Location.CREATOR);
        this.f29306f = (Location[]) parcel.createTypedArray(Location.CREATOR);
    }
}
