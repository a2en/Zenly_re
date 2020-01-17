package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

@Deprecated
public final class zzs extends AbstractSafeParcelable {
    public static final Creator<zzs> CREATOR = new C10128n0();

    /* renamed from: e */
    private final int f26661e;

    zzs(int i) {
        this.f26661e = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26661e);
        C10134a.m25571a(parcel, a);
    }
}
