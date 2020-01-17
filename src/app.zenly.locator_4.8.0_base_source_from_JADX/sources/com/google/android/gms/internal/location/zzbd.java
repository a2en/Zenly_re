package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzbd extends AbstractSafeParcelable {
    public static final Creator<zzbd> CREATOR = new C10485a0();

    /* renamed from: l */
    static final List<ClientIdentity> f27438l = Collections.emptyList();

    /* renamed from: e */
    private LocationRequest f27439e;

    /* renamed from: f */
    private List<ClientIdentity> f27440f;

    /* renamed from: g */
    private String f27441g;

    /* renamed from: h */
    private boolean f27442h;

    /* renamed from: i */
    private boolean f27443i;

    /* renamed from: j */
    private boolean f27444j;

    /* renamed from: k */
    private String f27445k;

    zzbd(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f27439e = locationRequest;
        this.f27440f = list;
        this.f27441g = str;
        this.f27442h = z;
        this.f27443i = z2;
        this.f27444j = z3;
        this.f27445k = str2;
    }

    @Deprecated
    /* renamed from: a */
    public static zzbd m26931a(LocationRequest locationRequest) {
        zzbd zzbd = new zzbd(locationRequest, f27438l, null, false, false, false, null);
        return zzbd;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return C10120k.m25501a(this.f27439e, zzbd.f27439e) && C10120k.m25501a(this.f27440f, zzbd.f27440f) && C10120k.m25501a(this.f27441g, zzbd.f27441g) && this.f27442h == zzbd.f27442h && this.f27443i == zzbd.f27443i && this.f27444j == zzbd.f27444j && C10120k.m25501a(this.f27445k, zzbd.f27445k);
    }

    public final int hashCode() {
        return this.f27439e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27439e);
        if (this.f27441g != null) {
            sb.append(" tag=");
            sb.append(this.f27441g);
        }
        if (this.f27445k != null) {
            sb.append(" moduleId=");
            sb.append(this.f27445k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f27442h);
        sb.append(" clients=");
        sb.append(this.f27440f);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f27443i);
        if (this.f27444j) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 1, (Parcelable) this.f27439e, i, false);
        C10134a.m25597c(parcel, 5, this.f27440f, false);
        C10134a.m25583a(parcel, 6, this.f27441g, false);
        C10134a.m25586a(parcel, 7, this.f27442h);
        C10134a.m25586a(parcel, 8, this.f27443i);
        C10134a.m25586a(parcel, 9, this.f27444j);
        C10134a.m25583a(parcel, 10, this.f27445k, false);
        C10134a.m25571a(parcel, a);
    }
}
