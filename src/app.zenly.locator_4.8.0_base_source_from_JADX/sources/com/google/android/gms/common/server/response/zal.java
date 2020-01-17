package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

public final class zal extends AbstractSafeParcelable {
    public static final Creator<zal> CREATOR = new C10158b();

    /* renamed from: e */
    private final int f26700e;

    /* renamed from: f */
    final String f26701f;

    /* renamed from: g */
    final Field<?, ?> f26702g;

    zal(int i, String str, Field<?, ?> field) {
        this.f26700e = i;
        this.f26701f = str;
        this.f26702g = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26700e);
        C10134a.m25583a(parcel, 2, this.f26701f, false);
        C10134a.m25580a(parcel, 3, (Parcelable) this.f26702g, i, false);
        C10134a.m25571a(parcel, a);
    }

    zal(String str, Field<?, ?> field) {
        this.f26700e = 1;
        this.f26701f = str;
        this.f26702g = field;
    }
}
