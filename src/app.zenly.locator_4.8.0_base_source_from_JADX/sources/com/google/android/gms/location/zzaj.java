package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zzaj extends AbstractSafeParcelable {
    public static final Creator<zzaj> CREATOR = new C10590q();

    /* renamed from: e */
    private final int f27550e;

    /* renamed from: f */
    private final int f27551f;

    /* renamed from: g */
    private final long f27552g;

    /* renamed from: h */
    private final long f27553h;

    zzaj(int i, int i2, long j, long j2) {
        this.f27550e = i;
        this.f27551f = i2;
        this.f27552g = j;
        this.f27553h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaj.class == obj.getClass()) {
            zzaj zzaj = (zzaj) obj;
            return this.f27550e == zzaj.f27550e && this.f27551f == zzaj.f27551f && this.f27552g == zzaj.f27552g && this.f27553h == zzaj.f27553h;
        }
    }

    public final int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f27551f), Integer.valueOf(this.f27550e), Long.valueOf(this.f27553h), Long.valueOf(this.f27552g));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkLocationStatus:");
        sb.append(" Wifi status: ");
        sb.append(this.f27550e);
        sb.append(" Cell status: ");
        sb.append(this.f27551f);
        sb.append(" elapsed time NS: ");
        sb.append(this.f27553h);
        sb.append(" system time ms: ");
        sb.append(this.f27552g);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27550e);
        C10134a.m25575a(parcel, 2, this.f27551f);
        C10134a.m25576a(parcel, 3, this.f27552g);
        C10134a.m25576a(parcel, 4, this.f27553h);
        C10134a.m25571a(parcel, a);
    }
}
