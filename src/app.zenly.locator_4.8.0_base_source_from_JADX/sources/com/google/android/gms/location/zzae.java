package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zzae extends AbstractSafeParcelable {
    public static final Creator<zzae> CREATOR = new C10585m();

    /* renamed from: e */
    private final String f27547e;

    /* renamed from: f */
    private final String f27548f;

    /* renamed from: g */
    private final String f27549g;

    zzae(String str, String str2, String str3) {
        this.f27549g = str;
        this.f27547e = str2;
        this.f27548f = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 1, this.f27547e, false);
        C10134a.m25583a(parcel, 2, this.f27548f, false);
        C10134a.m25583a(parcel, 5, this.f27549g, false);
        C10134a.m25571a(parcel, a);
    }
}
