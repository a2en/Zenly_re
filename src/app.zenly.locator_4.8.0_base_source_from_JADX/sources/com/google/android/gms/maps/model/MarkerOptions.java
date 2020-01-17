package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;

public final class MarkerOptions extends AbstractSafeParcelable {
    public static final Creator<MarkerOptions> CREATOR = new C10656r();

    /* renamed from: e */
    private LatLng f27653e;

    /* renamed from: f */
    private String f27654f;

    /* renamed from: g */
    private String f27655g;

    /* renamed from: h */
    private C10633a f27656h;

    /* renamed from: i */
    private float f27657i = 0.5f;

    /* renamed from: j */
    private float f27658j = 1.0f;

    /* renamed from: k */
    private boolean f27659k;

    /* renamed from: l */
    private boolean f27660l = true;

    /* renamed from: m */
    private boolean f27661m = false;

    /* renamed from: n */
    private float f27662n = 0.0f;

    /* renamed from: o */
    private float f27663o = 0.5f;

    /* renamed from: p */
    private float f27664p = 0.0f;

    /* renamed from: q */
    private float f27665q = 1.0f;

    /* renamed from: r */
    private float f27666r;

    public MarkerOptions() {
    }

    /* renamed from: a */
    public final float mo29110a() {
        return this.f27665q;
    }

    /* renamed from: b */
    public final float mo29111b() {
        return this.f27657i;
    }

    /* renamed from: c */
    public final float mo29112c() {
        return this.f27658j;
    }

    /* renamed from: d */
    public final float mo29113d() {
        return this.f27663o;
    }

    /* renamed from: e */
    public final float mo29114e() {
        return this.f27664p;
    }

    /* renamed from: f */
    public final LatLng mo29115f() {
        return this.f27653e;
    }

    /* renamed from: g */
    public final float mo29116g() {
        return this.f27662n;
    }

    /* renamed from: h */
    public final String mo29117h() {
        return this.f27655g;
    }

    /* renamed from: i */
    public final String mo29118i() {
        return this.f27654f;
    }

    /* renamed from: j */
    public final float mo29119j() {
        return this.f27666r;
    }

    /* renamed from: k */
    public final boolean mo29120k() {
        return this.f27659k;
    }

    /* renamed from: l */
    public final boolean mo29121l() {
        return this.f27661m;
    }

    /* renamed from: m */
    public final boolean mo29122m() {
        return this.f27660l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 2, (Parcelable) mo29115f(), i, false);
        C10134a.m25583a(parcel, 3, mo29118i(), false);
        C10134a.m25583a(parcel, 4, mo29117h(), false);
        C10633a aVar = this.f27656h;
        if (aVar == null) {
            iBinder = null;
        } else {
            iBinder = aVar.mo29192a().asBinder();
        }
        C10134a.m25578a(parcel, 5, iBinder, false);
        C10134a.m25574a(parcel, 6, mo29111b());
        C10134a.m25574a(parcel, 7, mo29112c());
        C10134a.m25586a(parcel, 8, mo29120k());
        C10134a.m25586a(parcel, 9, mo29122m());
        C10134a.m25586a(parcel, 10, mo29121l());
        C10134a.m25574a(parcel, 11, mo29116g());
        C10134a.m25574a(parcel, 12, mo29113d());
        C10134a.m25574a(parcel, 13, mo29114e());
        C10134a.m25574a(parcel, 14, mo29110a());
        C10134a.m25574a(parcel, 15, mo29119j());
        C10134a.m25571a(parcel, a);
    }

    MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7) {
        this.f27653e = latLng;
        this.f27654f = str;
        this.f27655g = str2;
        if (iBinder == null) {
            this.f27656h = null;
        } else {
            this.f27656h = new C10633a(C10182a.m25696a(iBinder));
        }
        this.f27657i = f;
        this.f27658j = f2;
        this.f27659k = z;
        this.f27660l = z2;
        this.f27661m = z3;
        this.f27662n = f3;
        this.f27663o = f4;
        this.f27664p = f5;
        this.f27665q = f6;
        this.f27666r = f7;
    }
}
