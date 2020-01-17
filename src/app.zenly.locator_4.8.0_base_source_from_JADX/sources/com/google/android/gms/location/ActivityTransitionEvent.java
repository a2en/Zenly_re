package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionEvent> CREATOR = new C10594u();

    /* renamed from: e */
    private final int f27481e;

    /* renamed from: f */
    private final int f27482f;

    /* renamed from: g */
    private final long f27483g;

    public ActivityTransitionEvent(int i, int i2, long j) {
        DetectedActivity.m26966a(i);
        ActivityTransition.zza(i2);
        this.f27481e = i;
        this.f27482f = i2;
        this.f27483g = j;
    }

    /* renamed from: a */
    public int mo28600a() {
        return this.f27481e;
    }

    /* renamed from: b */
    public long mo28601b() {
        return this.f27483g;
    }

    /* renamed from: c */
    public int mo28602c() {
        return this.f27482f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f27481e == activityTransitionEvent.f27481e && this.f27482f == activityTransitionEvent.f27482f && this.f27483g == activityTransitionEvent.f27483g;
    }

    public int hashCode() {
        return C10120k.m25499a(Integer.valueOf(this.f27481e), Integer.valueOf(this.f27482f), Long.valueOf(this.f27483g));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f27481e;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        String str = " ";
        sb.append(str);
        int i2 = this.f27482f;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(str);
        long j = this.f27483g;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, mo28600a());
        C10134a.m25575a(parcel, 2, mo28602c());
        C10134a.m25576a(parcel, 3, mo28601b());
        C10134a.m25571a(parcel, a);
    }
}
