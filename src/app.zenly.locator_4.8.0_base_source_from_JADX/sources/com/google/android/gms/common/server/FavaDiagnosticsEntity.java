package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<FavaDiagnosticsEntity> CREATOR = new C10153a();

    /* renamed from: e */
    private final int f26668e;

    /* renamed from: f */
    private final String f26669f;

    /* renamed from: g */
    private final int f26670g;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.f26668e = i;
        this.f26669f = str;
        this.f26670g = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26668e);
        C10134a.m25583a(parcel, 2, this.f26669f, false);
        C10134a.m25575a(parcel, 3, this.f26670g);
        C10134a.m25571a(parcel, a);
    }
}
