package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<PlaceReport> CREATOR = new C10589a();

    /* renamed from: e */
    private final int f27543e;

    /* renamed from: f */
    private final String f27544f;

    /* renamed from: g */
    private final String f27545g;

    /* renamed from: h */
    private final String f27546h;

    PlaceReport(int i, String str, String str2, String str3) {
        this.f27543e = i;
        this.f27544f = str;
        this.f27545g = str2;
        this.f27546h = str3;
    }

    /* renamed from: a */
    public String mo28713a() {
        return this.f27544f;
    }

    /* renamed from: b */
    public String mo28714b() {
        return this.f27545g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PlaceReport)) {
            return false;
        }
        PlaceReport placeReport = (PlaceReport) obj;
        return C10120k.m25501a(this.f27544f, placeReport.f27544f) && C10120k.m25501a(this.f27545g, placeReport.f27545g) && C10120k.m25501a(this.f27546h, placeReport.f27546h);
    }

    public int hashCode() {
        return C10120k.m25499a(this.f27544f, this.f27545g, this.f27546h);
    }

    public String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("placeId", this.f27544f);
        a.mo27499a("tag", this.f27545g);
        if (!"unknown".equals(this.f27546h)) {
            a.mo27499a("source", this.f27546h);
        }
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27543e);
        C10134a.m25583a(parcel, 2, mo28713a(), false);
        C10134a.m25583a(parcel, 3, mo28714b(), false);
        C10134a.m25583a(parcel, 4, this.f27546h, false);
        C10134a.m25571a(parcel, a);
    }
}
