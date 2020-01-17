package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zzr extends AbstractSafeParcelable {
    public static final Creator<zzr> CREATOR = new C10303e5();

    /* renamed from: e */
    private final String f27363e;

    /* renamed from: f */
    private final int f27364f;

    /* renamed from: g */
    public final int f27365g;

    /* renamed from: h */
    private final String f27366h;

    /* renamed from: i */
    private final String f27367i;

    /* renamed from: j */
    private final boolean f27368j;

    /* renamed from: k */
    public final String f27369k;

    /* renamed from: l */
    private final boolean f27370l;

    /* renamed from: m */
    private final int f27371m;

    public zzr(String str, int i, int i2, String str2, String str3, String str4, boolean z, C10355l4 l4Var) {
        C10123l.m25505a(str);
        this.f27363e = str;
        this.f27364f = i;
        this.f27365g = i2;
        this.f27369k = str2;
        this.f27366h = str3;
        this.f27367i = str4;
        this.f27368j = !z;
        this.f27370l = z;
        this.f27371m = l4Var.zzc();
    }

    public zzr(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.f27363e = str;
        this.f27364f = i;
        this.f27365g = i2;
        this.f27366h = str2;
        this.f27367i = str3;
        this.f27368j = z;
        this.f27369k = str4;
        this.f27370l = z2;
        this.f27371m = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            zzr zzr = (zzr) obj;
            return C10120k.m25501a(this.f27363e, zzr.f27363e) && this.f27364f == zzr.f27364f && this.f27365g == zzr.f27365g && C10120k.m25501a(this.f27369k, zzr.f27369k) && C10120k.m25501a(this.f27366h, zzr.f27366h) && C10120k.m25501a(this.f27367i, zzr.f27367i) && this.f27368j == zzr.f27368j && this.f27370l == zzr.f27370l && this.f27371m == zzr.f27371m;
        }
    }

    public final int hashCode() {
        return C10120k.m25499a(this.f27363e, Integer.valueOf(this.f27364f), Integer.valueOf(this.f27365g), this.f27369k, this.f27366h, this.f27367i, Boolean.valueOf(this.f27368j), Boolean.valueOf(this.f27370l), Integer.valueOf(this.f27371m));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayLoggerContext[");
        sb.append("package=");
        sb.append(this.f27363e);
        sb.append(',');
        sb.append("packageVersionCode=");
        sb.append(this.f27364f);
        sb.append(',');
        sb.append("logSource=");
        sb.append(this.f27365g);
        sb.append(',');
        sb.append("logSourceName=");
        sb.append(this.f27369k);
        sb.append(',');
        sb.append("uploadAccount=");
        sb.append(this.f27366h);
        sb.append(',');
        sb.append("loggingId=");
        sb.append(this.f27367i);
        sb.append(',');
        sb.append("logAndroidId=");
        sb.append(this.f27368j);
        sb.append(',');
        sb.append("isAnonymous=");
        sb.append(this.f27370l);
        sb.append(',');
        sb.append("qosTier=");
        sb.append(this.f27371m);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 2, this.f27363e, false);
        C10134a.m25575a(parcel, 3, this.f27364f);
        C10134a.m25575a(parcel, 4, this.f27365g);
        C10134a.m25583a(parcel, 5, this.f27366h, false);
        C10134a.m25583a(parcel, 6, this.f27367i, false);
        C10134a.m25586a(parcel, 7, this.f27368j);
        C10134a.m25583a(parcel, 8, this.f27369k, false);
        C10134a.m25586a(parcel, 9, this.f27370l);
        C10134a.m25575a(parcel, 10, this.f27371m);
        C10134a.m25571a(parcel, a);
    }
}
