package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.List;

public final class CircleOptions extends AbstractSafeParcelable {
    public static final Creator<CircleOptions> CREATOR = new C10651m();

    /* renamed from: e */
    private LatLng f27623e = null;

    /* renamed from: f */
    private double f27624f = 0.0d;

    /* renamed from: g */
    private float f27625g = 10.0f;

    /* renamed from: h */
    private int f27626h = -16777216;

    /* renamed from: i */
    private int f27627i = 0;

    /* renamed from: j */
    private float f27628j = 0.0f;

    /* renamed from: k */
    private boolean f27629k = true;

    /* renamed from: l */
    private boolean f27630l = false;

    /* renamed from: m */
    private List<PatternItem> f27631m = null;

    public CircleOptions() {
    }

    /* renamed from: a */
    public final LatLng mo29078a() {
        return this.f27623e;
    }

    /* renamed from: b */
    public final int mo29079b() {
        return this.f27627i;
    }

    /* renamed from: c */
    public final double mo29080c() {
        return this.f27624f;
    }

    /* renamed from: d */
    public final int mo29081d() {
        return this.f27626h;
    }

    /* renamed from: e */
    public final List<PatternItem> mo29082e() {
        return this.f27631m;
    }

    /* renamed from: f */
    public final float mo29083f() {
        return this.f27625g;
    }

    /* renamed from: g */
    public final float mo29084g() {
        return this.f27628j;
    }

    /* renamed from: h */
    public final boolean mo29085h() {
        return this.f27630l;
    }

    /* renamed from: i */
    public final boolean mo29086i() {
        return this.f27629k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 2, (Parcelable) mo29078a(), i, false);
        C10134a.m25573a(parcel, 3, mo29080c());
        C10134a.m25574a(parcel, 4, mo29083f());
        C10134a.m25575a(parcel, 5, mo29081d());
        C10134a.m25575a(parcel, 6, mo29079b());
        C10134a.m25574a(parcel, 7, mo29084g());
        C10134a.m25586a(parcel, 8, mo29086i());
        C10134a.m25586a(parcel, 9, mo29085h());
        C10134a.m25597c(parcel, 10, mo29082e(), false);
        C10134a.m25571a(parcel, a);
    }

    CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List<PatternItem> list) {
        this.f27623e = latLng;
        this.f27624f = d;
        this.f27625g = f;
        this.f27626h = i;
        this.f27627i = i2;
        this.f27628j = f2;
        this.f27629k = z;
        this.f27630l = z2;
        this.f27631m = list;
    }
}
