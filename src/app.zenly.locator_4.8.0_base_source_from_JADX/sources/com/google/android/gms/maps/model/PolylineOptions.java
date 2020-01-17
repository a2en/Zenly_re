package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import java.util.ArrayList;
import java.util.List;

public final class PolylineOptions extends AbstractSafeParcelable {
    public static final Creator<PolylineOptions> CREATOR = new C10660v();

    /* renamed from: e */
    private final List<LatLng> f27683e;

    /* renamed from: f */
    private float f27684f;

    /* renamed from: g */
    private int f27685g;

    /* renamed from: h */
    private float f27686h;

    /* renamed from: i */
    private boolean f27687i;

    /* renamed from: j */
    private boolean f27688j;

    /* renamed from: k */
    private boolean f27689k;

    /* renamed from: l */
    private Cap f27690l;

    /* renamed from: m */
    private Cap f27691m;

    /* renamed from: n */
    private int f27692n;

    /* renamed from: o */
    private List<PatternItem> f27693o;

    public PolylineOptions() {
        this.f27684f = 10.0f;
        this.f27685g = -16777216;
        this.f27686h = 0.0f;
        this.f27687i = true;
        this.f27688j = false;
        this.f27689k = false;
        this.f27690l = new ButtCap();
        this.f27691m = new ButtCap();
        this.f27692n = 0;
        this.f27693o = null;
        this.f27683e = new ArrayList();
    }

    /* renamed from: a */
    public final PolylineOptions mo29143a(LatLng latLng) {
        this.f27683e.add(latLng);
        return this;
    }

    /* renamed from: b */
    public final PolylineOptions mo29145b(Cap cap) {
        C10123l.m25506a(cap, (Object) "startCap must not be null");
        this.f27690l = cap;
        return this;
    }

    /* renamed from: c */
    public final int mo29146c() {
        return this.f27692n;
    }

    /* renamed from: d */
    public final List<PatternItem> mo29147d() {
        return this.f27693o;
    }

    /* renamed from: e */
    public final List<LatLng> mo29148e() {
        return this.f27683e;
    }

    /* renamed from: f */
    public final Cap mo29149f() {
        return this.f27690l;
    }

    /* renamed from: g */
    public final float mo29150g() {
        return this.f27684f;
    }

    /* renamed from: h */
    public final float mo29151h() {
        return this.f27686h;
    }

    /* renamed from: i */
    public final boolean mo29152i() {
        return this.f27689k;
    }

    /* renamed from: j */
    public final boolean mo29153j() {
        return this.f27688j;
    }

    /* renamed from: k */
    public final boolean mo29154k() {
        return this.f27687i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25597c(parcel, 2, mo29148e(), false);
        C10134a.m25574a(parcel, 3, mo29150g());
        C10134a.m25575a(parcel, 4, mo29139a());
        C10134a.m25574a(parcel, 5, mo29151h());
        C10134a.m25586a(parcel, 6, mo29154k());
        C10134a.m25586a(parcel, 7, mo29153j());
        C10134a.m25586a(parcel, 8, mo29152i());
        C10134a.m25580a(parcel, 9, (Parcelable) mo29149f(), i, false);
        C10134a.m25580a(parcel, 10, (Parcelable) mo29144b(), i, false);
        C10134a.m25575a(parcel, 11, mo29146c());
        C10134a.m25597c(parcel, 12, mo29147d(), false);
        C10134a.m25571a(parcel, a);
    }

    /* renamed from: a */
    public final PolylineOptions mo29140a(float f) {
        this.f27684f = f;
        return this;
    }

    /* renamed from: b */
    public final Cap mo29144b() {
        return this.f27691m;
    }

    /* renamed from: a */
    public final PolylineOptions mo29141a(int i) {
        this.f27685g = i;
        return this;
    }

    /* renamed from: a */
    public final PolylineOptions mo29142a(Cap cap) {
        C10123l.m25506a(cap, (Object) "endCap must not be null");
        this.f27691m = cap;
        return this;
    }

    /* renamed from: a */
    public final int mo29139a() {
        return this.f27685g;
    }

    PolylineOptions(List list, float f, int i, float f2, boolean z, boolean z2, boolean z3, Cap cap, Cap cap2, int i2, List<PatternItem> list2) {
        this.f27684f = 10.0f;
        this.f27685g = -16777216;
        this.f27686h = 0.0f;
        this.f27687i = true;
        this.f27688j = false;
        this.f27689k = false;
        this.f27690l = new ButtCap();
        this.f27691m = new ButtCap();
        this.f27692n = 0;
        this.f27693o = null;
        this.f27683e = list;
        this.f27684f = f;
        this.f27685g = i;
        this.f27686h = f2;
        this.f27687i = z;
        this.f27688j = z2;
        this.f27689k = z3;
        if (cap != null) {
            this.f27690l = cap;
        }
        if (cap2 != null) {
            this.f27691m = cap2;
        }
        this.f27692n = i2;
        this.f27693o = list2;
    }
}
