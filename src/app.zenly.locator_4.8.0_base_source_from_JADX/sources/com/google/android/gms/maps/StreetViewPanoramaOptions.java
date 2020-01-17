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
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaOptions> CREATOR = new C10609g();

    /* renamed from: e */
    private StreetViewPanoramaCamera f27591e;

    /* renamed from: f */
    private String f27592f;

    /* renamed from: g */
    private LatLng f27593g;

    /* renamed from: h */
    private Integer f27594h;

    /* renamed from: i */
    private Boolean f27595i;

    /* renamed from: j */
    private Boolean f27596j;

    /* renamed from: k */
    private Boolean f27597k;

    /* renamed from: l */
    private Boolean f27598l;

    /* renamed from: m */
    private Boolean f27599m;

    /* renamed from: n */
    private StreetViewSource f27600n = StreetViewSource.f27706f;

    StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        Boolean valueOf = Boolean.valueOf(true);
        this.f27595i = valueOf;
        this.f27596j = valueOf;
        this.f27597k = valueOf;
        this.f27598l = valueOf;
        this.f27591e = streetViewPanoramaCamera;
        this.f27593g = latLng;
        this.f27594h = num;
        this.f27592f = str;
        this.f27595i = C10612a.m27082a(b);
        this.f27596j = C10612a.m27082a(b2);
        this.f27597k = C10612a.m27082a(b3);
        this.f27598l = C10612a.m27082a(b4);
        this.f27599m = C10612a.m27082a(b5);
        this.f27600n = streetViewSource;
    }

    /* renamed from: a */
    public final String mo28819a() {
        return this.f27592f;
    }

    /* renamed from: b */
    public final LatLng mo28820b() {
        return this.f27593g;
    }

    /* renamed from: c */
    public final Integer mo28821c() {
        return this.f27594h;
    }

    /* renamed from: d */
    public final StreetViewSource mo28822d() {
        return this.f27600n;
    }

    /* renamed from: e */
    public final StreetViewPanoramaCamera mo28823e() {
        return this.f27591e;
    }

    public final String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("PanoramaId", this.f27592f);
        a.mo27499a("Position", this.f27593g);
        a.mo27499a("Radius", this.f27594h);
        a.mo27499a("Source", this.f27600n);
        a.mo27499a("StreetViewPanoramaCamera", this.f27591e);
        a.mo27499a("UserNavigationEnabled", this.f27595i);
        a.mo27499a("ZoomGesturesEnabled", this.f27596j);
        a.mo27499a("PanningGesturesEnabled", this.f27597k);
        a.mo27499a("StreetNamesEnabled", this.f27598l);
        a.mo27499a("UseViewLifecycleInFragment", this.f27599m);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 2, (Parcelable) mo28823e(), i, false);
        C10134a.m25583a(parcel, 3, mo28819a(), false);
        C10134a.m25580a(parcel, 4, (Parcelable) mo28820b(), i, false);
        C10134a.m25582a(parcel, 5, mo28821c(), false);
        C10134a.m25572a(parcel, 6, C10612a.m27081a(this.f27595i));
        C10134a.m25572a(parcel, 7, C10612a.m27081a(this.f27596j));
        C10134a.m25572a(parcel, 8, C10612a.m27081a(this.f27597k));
        C10134a.m25572a(parcel, 9, C10612a.m27081a(this.f27598l));
        C10134a.m25572a(parcel, 10, C10612a.m27081a(this.f27599m));
        C10134a.m25580a(parcel, 11, (Parcelable) mo28822d(), i, false);
        C10134a.m25571a(parcel, a);
    }

    public StreetViewPanoramaOptions() {
        Boolean valueOf = Boolean.valueOf(true);
        this.f27595i = valueOf;
        this.f27596j = valueOf;
        this.f27597k = valueOf;
        this.f27598l = valueOf;
    }
}
