package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zzj extends AbstractSafeParcelable {
    public static final Creator<zzj> CREATOR = new C10561a0();

    /* renamed from: e */
    private boolean f27557e;

    /* renamed from: f */
    private long f27558f;

    /* renamed from: g */
    private float f27559g;

    /* renamed from: h */
    private long f27560h;

    /* renamed from: i */
    private int f27561i;

    public zzj() {
        this(true, 50, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    zzj(boolean z, long j, float f, long j2, int i) {
        this.f27557e = z;
        this.f27558f = j;
        this.f27559g = f;
        this.f27560h = j2;
        this.f27561i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzj = (zzj) obj;
        return this.f27557e == zzj.f27557e && this.f27558f == zzj.f27558f && Float.compare(this.f27559g, zzj.f27559g) == 0 && this.f27560h == zzj.f27560h && this.f27561i == zzj.f27561i;
    }

    public final int hashCode() {
        return C10120k.m25499a(Boolean.valueOf(this.f27557e), Long.valueOf(this.f27558f), Float.valueOf(this.f27559g), Long.valueOf(this.f27560h), Integer.valueOf(this.f27561i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f27557e);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f27558f);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f27559g);
        long j = this.f27560h;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = j - SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(elapsedRealtime);
            sb.append("ms");
        }
        if (this.f27561i != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f27561i);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25586a(parcel, 1, this.f27557e);
        C10134a.m25576a(parcel, 2, this.f27558f);
        C10134a.m25574a(parcel, 3, this.f27559g);
        C10134a.m25576a(parcel, 4, this.f27560h);
        C10134a.m25575a(parcel, 5, this.f27561i);
        C10134a.m25571a(parcel, a);
    }
}
