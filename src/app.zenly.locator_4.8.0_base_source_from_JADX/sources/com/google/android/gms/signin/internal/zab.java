package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zab extends AbstractSafeParcelable implements Result {
    public static final Creator<zab> CREATOR = new C10683b();

    /* renamed from: e */
    private final int f27773e;

    /* renamed from: f */
    private int f27774f;

    /* renamed from: g */
    private Intent f27775g;

    zab(int i, int i2, Intent intent) {
        this.f27773e = i;
        this.f27774f = i2;
        this.f27775g = intent;
    }

    public final Status getStatus() {
        if (this.f27774f == 0) {
            return Status.f26273i;
        }
        return Status.f26276l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f27773e);
        C10134a.m25575a(parcel, 2, this.f27774f);
        C10134a.m25580a(parcel, 3, (Parcelable) this.f27775g, i, false);
        C10134a.m25571a(parcel, a);
    }

    public zab() {
        this(0, null);
    }

    private zab(int i, Intent intent) {
        this(2, 0, null);
    }
}
