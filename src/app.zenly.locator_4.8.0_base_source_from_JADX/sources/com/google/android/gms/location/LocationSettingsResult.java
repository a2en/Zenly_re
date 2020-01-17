package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class LocationSettingsResult extends AbstractSafeParcelable implements Result {
    public static final Creator<LocationSettingsResult> CREATOR = new C10587o();

    /* renamed from: e */
    private final Status f27521e;

    /* renamed from: f */
    private final LocationSettingsStates f27522f;

    public LocationSettingsResult(Status status) {
        this(status, null);
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f27521e = status;
        this.f27522f = locationSettingsStates;
    }

    /* renamed from: a */
    public final LocationSettingsStates mo28671a() {
        return this.f27522f;
    }

    public final Status getStatus() {
        return this.f27521e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 1, (Parcelable) getStatus(), i, false);
        C10134a.m25580a(parcel, 2, (Parcelable) mo28671a(), i, false);
        C10134a.m25571a(parcel, a);
    }
}
