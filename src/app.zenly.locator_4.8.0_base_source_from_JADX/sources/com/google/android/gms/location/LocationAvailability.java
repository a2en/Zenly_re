package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.Arrays;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LocationAvailability> CREATOR = new C10577i();
    @Deprecated

    /* renamed from: e */
    private int f27507e;
    @Deprecated

    /* renamed from: f */
    private int f27508f;

    /* renamed from: g */
    private long f27509g;

    /* renamed from: h */
    private int f27510h;

    /* renamed from: i */
    private zzaj[] f27511i;

    LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.f27510h = i;
        this.f27507e = i2;
        this.f27508f = i3;
        this.f27509g = j;
        this.f27511i = zzajArr;
    }

    /* renamed from: a */
    public final boolean mo28635a() {
        return this.f27510h < 1000;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LocationAvailability.class == obj.getClass()) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f27507e == locationAvailability.f27507e && this.f27508f == locationAvailability.f27508f && this.f27509g == locationAvailability.f27509g && this.f27510h == locationAvailability.f27510h && Arrays.equals(this.f27511i, locationAvailability.f27511i);
        }
    }

    public final int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f27510h), Integer.valueOf(this.f27507e), Integer.valueOf(this.f27508f), Long.valueOf(this.f27509g), this.f27511i);
    }

    public final String toString() {
        boolean a = mo28635a();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27507e);
        C10134a.m25575a(parcel, 2, this.f27508f);
        C10134a.m25576a(parcel, 3, this.f27509g);
        C10134a.m25575a(parcel, 4, this.f27510h);
        C10134a.m25589a(parcel, 5, (T[]) this.f27511i, i, false);
        C10134a.m25571a(parcel, a);
    }
}
