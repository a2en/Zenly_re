package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor.C10094a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountResponse> CREATOR = new C10098a0();

    /* renamed from: e */
    private final int f26576e;

    /* renamed from: f */
    private IBinder f26577f;

    /* renamed from: g */
    private ConnectionResult f26578g;

    /* renamed from: h */
    private boolean f26579h;

    /* renamed from: i */
    private boolean f26580i;

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f26576e = i;
        this.f26577f = iBinder;
        this.f26578g = connectionResult;
        this.f26579h = z;
        this.f26580i = z2;
    }

    /* renamed from: a */
    public IAccountAccessor mo27430a() {
        return C10094a.m25412a(this.f26577f);
    }

    /* renamed from: b */
    public ConnectionResult mo27431b() {
        return this.f26578g;
    }

    /* renamed from: c */
    public boolean mo27432c() {
        return this.f26579h;
    }

    /* renamed from: d */
    public boolean mo27433d() {
        return this.f26580i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.f26578g.equals(resolveAccountResponse.f26578g) && mo27430a().equals(resolveAccountResponse.mo27430a());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26576e);
        C10134a.m25578a(parcel, 2, this.f26577f, false);
        C10134a.m25580a(parcel, 3, (Parcelable) mo27431b(), i, false);
        C10134a.m25586a(parcel, 4, mo27432c());
        C10134a.m25586a(parcel, 5, mo27433d());
        C10134a.m25571a(parcel, a);
    }
}
