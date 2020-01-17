package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C10163b();

    /* renamed from: e */
    private final int f26706e;

    /* renamed from: f */
    private final long f26707f;

    /* renamed from: g */
    private int f26708g;

    /* renamed from: h */
    private final String f26709h;

    /* renamed from: i */
    private final String f26710i;

    /* renamed from: j */
    private final String f26711j;

    /* renamed from: k */
    private final int f26712k;

    /* renamed from: l */
    private final List<String> f26713l;

    /* renamed from: m */
    private final String f26714m;

    /* renamed from: n */
    private final long f26715n;

    /* renamed from: o */
    private int f26716o;

    /* renamed from: p */
    private final String f26717p;

    /* renamed from: q */
    private final float f26718q;

    /* renamed from: r */
    private final long f26719r;

    /* renamed from: s */
    private final boolean f26720s;

    /* renamed from: t */
    private long f26721t = -1;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.f26706e = i;
        this.f26707f = j;
        this.f26708g = i2;
        this.f26709h = str;
        this.f26710i = str3;
        this.f26711j = str5;
        this.f26712k = i3;
        this.f26713l = list;
        this.f26714m = str2;
        this.f26715n = j2;
        this.f26716o = i4;
        this.f26717p = str4;
        this.f26718q = f;
        this.f26719r = j3;
        this.f26720s = z;
    }

    /* renamed from: a */
    public final int mo27581a() {
        return this.f26708g;
    }

    /* renamed from: b */
    public final long mo27582b() {
        return this.f26707f;
    }

    /* renamed from: c */
    public final long mo27583c() {
        return this.f26721t;
    }

    /* renamed from: d */
    public final String mo27584d() {
        String str;
        String str2 = this.f26709h;
        int i = this.f26712k;
        List<String> list = this.f26713l;
        String str3 = "";
        if (list == null) {
            str = str3;
        } else {
            str = TextUtils.join(",", list);
        }
        int i2 = this.f26716o;
        String str4 = this.f26710i;
        if (str4 == null) {
            str4 = str3;
        }
        String str5 = this.f26717p;
        if (str5 == null) {
            str5 = str3;
        }
        float f = this.f26718q;
        String str6 = this.f26711j;
        if (str6 != null) {
            str3 = str6;
        }
        boolean z = this.f26720s;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 51 + String.valueOf(str).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str3).length());
        String str7 = "\t";
        sb.append(str7);
        sb.append(str2);
        sb.append(str7);
        sb.append(i);
        sb.append(str7);
        sb.append(str);
        sb.append(str7);
        sb.append(i2);
        sb.append(str7);
        sb.append(str4);
        sb.append(str7);
        sb.append(str5);
        sb.append(str7);
        sb.append(f);
        sb.append(str7);
        sb.append(str3);
        sb.append(str7);
        sb.append(z);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26706e);
        C10134a.m25576a(parcel, 2, mo27582b());
        C10134a.m25583a(parcel, 4, this.f26709h, false);
        C10134a.m25575a(parcel, 5, this.f26712k);
        C10134a.m25595b(parcel, 6, this.f26713l, false);
        C10134a.m25576a(parcel, 8, this.f26715n);
        C10134a.m25583a(parcel, 10, this.f26710i, false);
        C10134a.m25575a(parcel, 11, mo27581a());
        C10134a.m25583a(parcel, 12, this.f26714m, false);
        C10134a.m25583a(parcel, 13, this.f26717p, false);
        C10134a.m25575a(parcel, 14, this.f26716o);
        C10134a.m25574a(parcel, 15, this.f26718q);
        C10134a.m25576a(parcel, 16, this.f26719r);
        C10134a.m25583a(parcel, 17, this.f26711j, false);
        C10134a.m25586a(parcel, 18, this.f26720s);
        C10134a.m25571a(parcel, a);
    }
}
