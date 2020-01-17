package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class zzad extends AbstractSafeParcelable implements Result {
    public static final Creator<zzad> CREATOR = new C10492e();

    /* renamed from: e */
    private final Status f27437e;

    static {
        new zzad(Status.f26273i);
    }

    public zzad(Status status) {
        this.f27437e = status;
    }

    public final Status getStatus() {
        return this.f27437e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 1, (Parcelable) getStatus(), i, false);
        C10134a.m25571a(parcel, a);
    }
}
