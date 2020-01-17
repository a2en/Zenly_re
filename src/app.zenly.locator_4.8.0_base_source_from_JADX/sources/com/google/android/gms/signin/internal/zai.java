package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zai extends AbstractSafeParcelable {
    public static final Creator<zai> CREATOR = new C10687f();

    /* renamed from: e */
    private final int f27776e;

    /* renamed from: f */
    private final ResolveAccountRequest f27777f;

    zai(int i, ResolveAccountRequest resolveAccountRequest) {
        this.f27776e = i;
        this.f27777f = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27776e);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27777f, i, false);
        C10134a.m25571a(parcel, a);
    }

    public zai(ResolveAccountRequest resolveAccountRequest) {
        this(1, resolveAccountRequest);
    }
}
