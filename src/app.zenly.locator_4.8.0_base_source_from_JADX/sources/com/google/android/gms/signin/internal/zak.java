package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zak extends AbstractSafeParcelable {
    public static final Creator<zak> CREATOR = new C10688g();

    /* renamed from: e */
    private final int f27778e;

    /* renamed from: f */
    private final ConnectionResult f27779f;

    /* renamed from: g */
    private final ResolveAccountResponse f27780g;

    zak(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.f27778e = i;
        this.f27779f = connectionResult;
        this.f27780g = resolveAccountResponse;
    }

    /* renamed from: a */
    public final ConnectionResult mo29291a() {
        return this.f27779f;
    }

    /* renamed from: b */
    public final ResolveAccountResponse mo29292b() {
        return this.f27780g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27778e);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27779f, i, false);
        C10134a.m25580a(parcel, 3, (Parcelable) this.f27780g, i, false);
        C10134a.m25571a(parcel, a);
    }

    public zak(int i) {
        this(new ConnectionResult(8, null), null);
    }

    private zak(ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this(1, connectionResult, null);
    }
}
