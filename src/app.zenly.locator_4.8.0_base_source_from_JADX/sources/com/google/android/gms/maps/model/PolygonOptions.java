package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.ArrayList;
import java.util.List;

public final class PolygonOptions extends AbstractSafeParcelable {
    public static final Creator<PolygonOptions> CREATOR = new C10659u();

    /* renamed from: e */
    private final List<LatLng> f27672e;

    /* renamed from: f */
    private final List<List<LatLng>> f27673f;

    /* renamed from: g */
    private float f27674g;

    /* renamed from: h */
    private int f27675h;

    /* renamed from: i */
    private int f27676i;

    /* renamed from: j */
    private float f27677j;

    /* renamed from: k */
    private boolean f27678k;

    /* renamed from: l */
    private boolean f27679l;

    /* renamed from: m */
    private boolean f27680m;

    /* renamed from: n */
    private int f27681n;

    /* renamed from: o */
    private List<PatternItem> f27682o;

    public PolygonOptions() {
        this.f27674g = 10.0f;
        this.f27675h = -16777216;
        this.f27676i = 0;
        this.f27677j = 0.0f;
        this.f27678k = true;
        this.f27679l = false;
        this.f27680m = false;
        this.f27681n = 0;
        this.f27682o = null;
        this.f27672e = new ArrayList();
        this.f27673f = new ArrayList();
    }

    /* renamed from: a */
    public final int mo29128a() {
        return this.f27676i;
    }

    /* renamed from: b */
    public final List<LatLng> mo29129b() {
        return this.f27672e;
    }

    /* renamed from: c */
    public final int mo29130c() {
        return this.f27675h;
    }

    /* renamed from: d */
    public final int mo29131d() {
        return this.f27681n;
    }

    /* renamed from: e */
    public final List<PatternItem> mo29132e() {
        return this.f27682o;
    }

    /* renamed from: f */
    public final float mo29133f() {
        return this.f27674g;
    }

    /* renamed from: g */
    public final float mo29134g() {
        return this.f27677j;
    }

    /* renamed from: h */
    public final boolean mo29135h() {
        return this.f27680m;
    }

    /* renamed from: i */
    public final boolean mo29136i() {
        return this.f27679l;
    }

    /* renamed from: j */
    public final boolean mo29137j() {
        return this.f27678k;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25597c(parcel, 2, mo29129b(), false);
        C10134a.m25584a(parcel, 3, (List) this.f27673f, false);
        C10134a.m25574a(parcel, 4, mo29133f());
        C10134a.m25575a(parcel, 5, mo29130c());
        C10134a.m25575a(parcel, 6, mo29128a());
        C10134a.m25574a(parcel, 7, mo29134g());
        C10134a.m25586a(parcel, 8, mo29137j());
        C10134a.m25586a(parcel, 9, mo29136i());
        C10134a.m25586a(parcel, 10, mo29135h());
        C10134a.m25575a(parcel, 11, mo29131d());
        C10134a.m25597c(parcel, 12, mo29132e(), false);
        C10134a.m25571a(parcel, a);
    }

    PolygonOptions(List<LatLng> list, List list2, float f, int i, int i2, float f2, boolean z, boolean z2, boolean z3, int i3, List<PatternItem> list3) {
        this.f27674g = 10.0f;
        this.f27675h = -16777216;
        this.f27676i = 0;
        this.f27677j = 0.0f;
        this.f27678k = true;
        this.f27679l = false;
        this.f27680m = false;
        this.f27681n = 0;
        this.f27682o = null;
        this.f27672e = list;
        this.f27673f = list2;
        this.f27674g = f;
        this.f27675h = i;
        this.f27676i = i2;
        this.f27677j = f2;
        this.f27678k = z;
        this.f27679l = z2;
        this.f27680m = z3;
        this.f27681n = i3;
        this.f27682o = list3;
    }
}
