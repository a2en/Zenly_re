package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;

public final class GroundOverlayOptions extends AbstractSafeParcelable {
    public static final Creator<GroundOverlayOptions> CREATOR = new C10652n();

    /* renamed from: e */
    private C10633a f27636e;

    /* renamed from: f */
    private LatLng f27637f;

    /* renamed from: g */
    private float f27638g;

    /* renamed from: h */
    private float f27639h;

    /* renamed from: i */
    private LatLngBounds f27640i;

    /* renamed from: j */
    private float f27641j;

    /* renamed from: k */
    private float f27642k;

    /* renamed from: l */
    private boolean f27643l = true;

    /* renamed from: m */
    private float f27644m = 0.0f;

    /* renamed from: n */
    private float f27645n = 0.5f;

    /* renamed from: o */
    private float f27646o = 0.5f;

    /* renamed from: p */
    private boolean f27647p = false;

    GroundOverlayOptions(IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.f27636e = new C10633a(C10182a.m25696a(iBinder));
        this.f27637f = latLng;
        this.f27638g = f;
        this.f27639h = f2;
        this.f27640i = latLngBounds;
        this.f27641j = f3;
        this.f27642k = f4;
        this.f27643l = z;
        this.f27644m = f5;
        this.f27645n = f6;
        this.f27646o = f7;
        this.f27647p = z2;
    }

    /* renamed from: a */
    public final float mo29089a() {
        return this.f27645n;
    }

    /* renamed from: b */
    public final float mo29090b() {
        return this.f27646o;
    }

    /* renamed from: c */
    public final float mo29091c() {
        return this.f27641j;
    }

    /* renamed from: d */
    public final LatLngBounds mo29092d() {
        return this.f27640i;
    }

    /* renamed from: e */
    public final float mo29093e() {
        return this.f27639h;
    }

    /* renamed from: f */
    public final LatLng mo29094f() {
        return this.f27637f;
    }

    /* renamed from: g */
    public final float mo29095g() {
        return this.f27644m;
    }

    /* renamed from: h */
    public final float mo29096h() {
        return this.f27638g;
    }

    /* renamed from: i */
    public final float mo29097i() {
        return this.f27642k;
    }

    /* renamed from: j */
    public final boolean mo29098j() {
        return this.f27647p;
    }

    /* renamed from: k */
    public final boolean mo29099k() {
        return this.f27643l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25578a(parcel, 2, this.f27636e.mo29192a().asBinder(), false);
        C10134a.m25580a(parcel, 3, (Parcelable) mo29094f(), i, false);
        C10134a.m25574a(parcel, 4, mo29096h());
        C10134a.m25574a(parcel, 5, mo29093e());
        C10134a.m25580a(parcel, 6, (Parcelable) mo29092d(), i, false);
        C10134a.m25574a(parcel, 7, mo29091c());
        C10134a.m25574a(parcel, 8, mo29097i());
        C10134a.m25586a(parcel, 9, mo29099k());
        C10134a.m25574a(parcel, 10, mo29095g());
        C10134a.m25574a(parcel, 11, mo29089a());
        C10134a.m25574a(parcel, 12, mo29090b());
        C10134a.m25586a(parcel, 13, mo29098j());
        C10134a.m25571a(parcel, a);
    }

    public GroundOverlayOptions() {
    }
}
