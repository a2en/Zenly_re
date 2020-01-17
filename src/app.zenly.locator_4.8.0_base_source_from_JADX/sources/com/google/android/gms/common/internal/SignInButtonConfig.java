package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Creator<SignInButtonConfig> CREATOR = new C10100b0();

    /* renamed from: e */
    private final int f26581e;

    /* renamed from: f */
    private final int f26582f;

    /* renamed from: g */
    private final int f26583g;
    @Deprecated

    /* renamed from: h */
    private final Scope[] f26584h;

    SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f26581e = i;
        this.f26582f = i2;
        this.f26583g = i3;
        this.f26584h = scopeArr;
    }

    /* renamed from: a */
    public int mo27436a() {
        return this.f26582f;
    }

    /* renamed from: b */
    public int mo27437b() {
        return this.f26583g;
    }

    @Deprecated
    /* renamed from: c */
    public Scope[] mo27438c() {
        return this.f26584h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26581e);
        C10134a.m25575a(parcel, 2, mo27436a());
        C10134a.m25575a(parcel, 3, mo27437b());
        C10134a.m25589a(parcel, 4, (T[]) mo27438c(), i, false);
        C10134a.m25571a(parcel, a);
    }
}
