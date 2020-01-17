package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Creator<AuthAccountRequest> CREATOR = new C10129o();

    /* renamed from: e */
    private final int f26509e;
    @Deprecated

    /* renamed from: f */
    private final IBinder f26510f;

    /* renamed from: g */
    private final Scope[] f26511g;

    /* renamed from: h */
    private Integer f26512h;

    /* renamed from: i */
    private Integer f26513i;

    /* renamed from: j */
    private Account f26514j;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.f26509e = i;
        this.f26510f = iBinder;
        this.f26511g = scopeArr;
        this.f26512h = num;
        this.f26513i = num2;
        this.f26514j = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26509e);
        C10134a.m25578a(parcel, 2, this.f26510f, false);
        C10134a.m25589a(parcel, 3, (T[]) this.f26511g, i, false);
        C10134a.m25582a(parcel, 4, this.f26512h, false);
        C10134a.m25582a(parcel, 5, this.f26513i, false);
        C10134a.m25580a(parcel, 6, (Parcelable) this.f26514j, i, false);
        C10134a.m25571a(parcel, a);
    }
}
