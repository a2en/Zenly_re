package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.maps.internal.C10612a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleMapOptions> CREATOR = new C10607e();

    /* renamed from: e */
    private Boolean f27565e;

    /* renamed from: f */
    private Boolean f27566f;

    /* renamed from: g */
    private int f27567g = -1;

    /* renamed from: h */
    private CameraPosition f27568h;

    /* renamed from: i */
    private Boolean f27569i;

    /* renamed from: j */
    private Boolean f27570j;

    /* renamed from: k */
    private Boolean f27571k;

    /* renamed from: l */
    private Boolean f27572l;

    /* renamed from: m */
    private Boolean f27573m;

    /* renamed from: n */
    private Boolean f27574n;

    /* renamed from: o */
    private Boolean f27575o;

    /* renamed from: p */
    private Boolean f27576p;

    /* renamed from: q */
    private Boolean f27577q;

    /* renamed from: r */
    private Float f27578r = null;

    /* renamed from: s */
    private Float f27579s = null;

    /* renamed from: t */
    private LatLngBounds f27580t = null;

    /* renamed from: u */
    private Boolean f27581u;

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12) {
        this.f27565e = C10612a.m27082a(b);
        this.f27566f = C10612a.m27082a(b2);
        this.f27567g = i;
        this.f27568h = cameraPosition;
        this.f27569i = C10612a.m27082a(b3);
        this.f27570j = C10612a.m27082a(b4);
        this.f27571k = C10612a.m27082a(b5);
        this.f27572l = C10612a.m27082a(b6);
        this.f27573m = C10612a.m27082a(b7);
        this.f27574n = C10612a.m27082a(b8);
        this.f27575o = C10612a.m27082a(b9);
        this.f27576p = C10612a.m27082a(b10);
        this.f27577q = C10612a.m27082a(b11);
        this.f27578r = f;
        this.f27579s = f2;
        this.f27580t = latLngBounds;
        this.f27581u = C10612a.m27082a(b12);
    }

    /* renamed from: a */
    public final CameraPosition mo28793a() {
        return this.f27568h;
    }

    /* renamed from: b */
    public final LatLngBounds mo28794b() {
        return this.f27580t;
    }

    /* renamed from: c */
    public final int mo28795c() {
        return this.f27567g;
    }

    /* renamed from: d */
    public final Float mo28796d() {
        return this.f27579s;
    }

    /* renamed from: e */
    public final Float mo28797e() {
        return this.f27578r;
    }

    public final String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("MapType", Integer.valueOf(this.f27567g));
        a.mo27499a("LiteMode", this.f27575o);
        a.mo27499a("Camera", this.f27568h);
        a.mo27499a("CompassEnabled", this.f27570j);
        a.mo27499a("ZoomControlsEnabled", this.f27569i);
        a.mo27499a("ScrollGesturesEnabled", this.f27571k);
        a.mo27499a("ZoomGesturesEnabled", this.f27572l);
        a.mo27499a("TiltGesturesEnabled", this.f27573m);
        a.mo27499a("RotateGesturesEnabled", this.f27574n);
        a.mo27499a("ScrollGesturesEnabledDuringRotateOrZoom", this.f27581u);
        a.mo27499a("MapToolbarEnabled", this.f27576p);
        a.mo27499a("AmbientEnabled", this.f27577q);
        a.mo27499a("MinZoomPreference", this.f27578r);
        a.mo27499a("MaxZoomPreference", this.f27579s);
        a.mo27499a("LatLngBoundsForCameraTarget", this.f27580t);
        a.mo27499a("ZOrderOnTop", this.f27565e);
        a.mo27499a("UseViewLifecycleInFragment", this.f27566f);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25572a(parcel, 2, C10612a.m27081a(this.f27565e));
        C10134a.m25572a(parcel, 3, C10612a.m27081a(this.f27566f));
        C10134a.m25575a(parcel, 4, mo28795c());
        C10134a.m25580a(parcel, 5, (Parcelable) mo28793a(), i, false);
        C10134a.m25572a(parcel, 6, C10612a.m27081a(this.f27569i));
        C10134a.m25572a(parcel, 7, C10612a.m27081a(this.f27570j));
        C10134a.m25572a(parcel, 8, C10612a.m27081a(this.f27571k));
        C10134a.m25572a(parcel, 9, C10612a.m27081a(this.f27572l));
        C10134a.m25572a(parcel, 10, C10612a.m27081a(this.f27573m));
        C10134a.m25572a(parcel, 11, C10612a.m27081a(this.f27574n));
        C10134a.m25572a(parcel, 12, C10612a.m27081a(this.f27575o));
        C10134a.m25572a(parcel, 14, C10612a.m27081a(this.f27576p));
        C10134a.m25572a(parcel, 15, C10612a.m27081a(this.f27577q));
        C10134a.m25581a(parcel, 16, mo28797e(), false);
        C10134a.m25581a(parcel, 17, mo28796d(), false);
        C10134a.m25580a(parcel, 18, (Parcelable) mo28794b(), i, false);
        C10134a.m25572a(parcel, 19, C10612a.m27081a(this.f27581u));
        C10134a.m25571a(parcel, a);
    }

    public GoogleMapOptions() {
    }
}
