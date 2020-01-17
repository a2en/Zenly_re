package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zzc extends AbstractSafeParcelable {
    public static final Creator<zzc> CREATOR = new C9986b();

    /* renamed from: e */
    private final boolean f26245e;

    /* renamed from: f */
    private final long f26246f;

    /* renamed from: g */
    private final long f26247g;

    public zzc(boolean z, long j, long j2) {
        this.f26245e = z;
        this.f26246f = j;
        this.f26247g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzc = (zzc) obj;
            return this.f26245e == zzc.f26245e && this.f26246f == zzc.f26246f && this.f26247g == zzc.f26247g;
        }
    }

    public final int hashCode() {
        return C10120k.m25499a(Boolean.valueOf(this.f26245e), Long.valueOf(this.f26246f), Long.valueOf(this.f26247g));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectForDebugParcelable[skipPersistentStorage: ");
        sb.append(this.f26245e);
        sb.append(",collectForDebugStartTimeMillis: ");
        sb.append(this.f26246f);
        sb.append(",collectForDebugExpiryTimeMillis: ");
        sb.append(this.f26247g);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25586a(parcel, 1, this.f26245e);
        C10134a.m25576a(parcel, 2, this.f26247g);
        C10134a.m25576a(parcel, 3, this.f26246f);
        C10134a.m25571a(parcel, a);
    }
}
