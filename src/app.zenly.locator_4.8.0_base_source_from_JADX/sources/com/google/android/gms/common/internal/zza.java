package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zza extends AbstractSafeParcelable {
    public static final Creator<zza> CREATOR = new C10106d0();

    /* renamed from: e */
    Bundle f26658e;

    /* renamed from: f */
    Feature[] f26659f;

    /* renamed from: g */
    private int f26660g;

    zza(Bundle bundle, Feature[] featureArr, int i) {
        this.f26658e = bundle;
        this.f26659f = featureArr;
        this.f26660g = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25577a(parcel, 1, this.f26658e, false);
        C10134a.m25589a(parcel, 2, (T[]) this.f26659f, i, false);
        C10134a.m25575a(parcel, 3, this.f26660g);
        C10134a.m25571a(parcel, a);
    }

    public zza() {
    }
}
