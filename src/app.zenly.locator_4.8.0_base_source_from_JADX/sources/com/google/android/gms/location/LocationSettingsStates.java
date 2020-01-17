package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.internal.safeparcel.C10135b;

public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsStates> CREATOR = new C10588p();

    /* renamed from: e */
    private final boolean f27523e;

    /* renamed from: f */
    private final boolean f27524f;

    /* renamed from: g */
    private final boolean f27525g;

    /* renamed from: h */
    private final boolean f27526h;

    /* renamed from: i */
    private final boolean f27527i;

    /* renamed from: j */
    private final boolean f27528j;

    public LocationSettingsStates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f27523e = z;
        this.f27524f = z2;
        this.f27525g = z3;
        this.f27526h = z4;
        this.f27527i = z5;
        this.f27528j = z6;
    }

    /* renamed from: a */
    public static LocationSettingsStates m26990a(Intent intent) {
        return (LocationSettingsStates) C10135b.m25598a(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    /* renamed from: a */
    public final boolean mo28673a() {
        return this.f27528j;
    }

    /* renamed from: b */
    public final boolean mo28674b() {
        return this.f27525g;
    }

    /* renamed from: c */
    public final boolean mo28675c() {
        return this.f27526h;
    }

    /* renamed from: d */
    public final boolean mo28676d() {
        return this.f27523e;
    }

    /* renamed from: e */
    public final boolean mo28677e() {
        return this.f27527i;
    }

    /* renamed from: f */
    public final boolean mo28678f() {
        return this.f27524f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25586a(parcel, 1, mo28676d());
        C10134a.m25586a(parcel, 2, mo28678f());
        C10134a.m25586a(parcel, 3, mo28674b());
        C10134a.m25586a(parcel, 4, mo28675c());
        C10134a.m25586a(parcel, 5, mo28677e());
        C10134a.m25586a(parcel, 6, mo28673a());
        C10134a.m25571a(parcel, a);
    }
}
