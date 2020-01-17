package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.internal.maps.C10536f;
import com.google.android.gms.internal.maps.zzaf;

public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Creator<TileOverlayOptions> CREATOR = new C10642e0();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public zzaf f27711e;

    /* renamed from: f */
    private TileProvider f27712f;

    /* renamed from: g */
    private boolean f27713g = true;

    /* renamed from: h */
    private float f27714h;

    /* renamed from: i */
    private boolean f27715i = true;

    /* renamed from: j */
    private float f27716j = 0.0f;

    public TileOverlayOptions() {
    }

    /* renamed from: a */
    public final TileOverlayOptions mo29180a(TileProvider tileProvider) {
        zzaf zzaf;
        this.f27712f = tileProvider;
        if (this.f27712f == null) {
            zzaf = null;
        } else {
            zzaf = new C10640d0(this, tileProvider);
        }
        this.f27711e = zzaf;
        return this;
    }

    /* renamed from: b */
    public final float mo29183b() {
        return this.f27716j;
    }

    /* renamed from: c */
    public final float mo29184c() {
        return this.f27714h;
    }

    /* renamed from: d */
    public final boolean mo29185d() {
        return this.f27713g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25578a(parcel, 2, this.f27711e.asBinder(), false);
        C10134a.m25586a(parcel, 3, mo29185d());
        C10134a.m25574a(parcel, 4, mo29184c());
        C10134a.m25586a(parcel, 5, mo29182a());
        C10134a.m25574a(parcel, 6, mo29183b());
        C10134a.m25571a(parcel, a);
    }

    /* renamed from: a */
    public final TileOverlayOptions mo29181a(boolean z) {
        this.f27713g = z;
        return this;
    }

    TileOverlayOptions(IBinder iBinder, boolean z, float f, boolean z2, float f2) {
        C10638c0 c0Var;
        this.f27711e = C10536f.m26940a(iBinder);
        if (this.f27711e == null) {
            c0Var = null;
        } else {
            c0Var = new C10638c0(this);
        }
        this.f27712f = c0Var;
        this.f27713g = z;
        this.f27714h = f;
        this.f27715i = z2;
        this.f27716j = f2;
    }

    /* renamed from: a */
    public final boolean mo29182a() {
        return this.f27715i;
    }
}
