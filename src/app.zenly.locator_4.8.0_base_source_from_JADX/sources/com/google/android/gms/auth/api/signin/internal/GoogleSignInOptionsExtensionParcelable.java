package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C9982c();

    /* renamed from: e */
    private final int f26212e;

    /* renamed from: f */
    private int f26213f;

    /* renamed from: g */
    private Bundle f26214g;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f26212e = i;
        this.f26213f = i2;
        this.f26214g = bundle;
    }

    /* renamed from: a */
    public int mo26962a() {
        return this.f26213f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26212e);
        C10134a.m25575a(parcel, 2, mo26962a());
        C10134a.m25577a(parcel, 3, this.f26214g, false);
        C10134a.m25571a(parcel, a);
    }
}
