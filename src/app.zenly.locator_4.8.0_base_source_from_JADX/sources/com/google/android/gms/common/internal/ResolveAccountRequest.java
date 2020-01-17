package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountRequest> CREATOR = new C10142z();

    /* renamed from: e */
    private final int f26572e;

    /* renamed from: f */
    private final Account f26573f;

    /* renamed from: g */
    private final int f26574g;

    /* renamed from: h */
    private final GoogleSignInAccount f26575h;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f26572e = i;
        this.f26573f = account;
        this.f26574g = i2;
        this.f26575h = googleSignInAccount;
    }

    /* renamed from: a */
    public Account mo27426a() {
        return this.f26573f;
    }

    /* renamed from: b */
    public int mo27427b() {
        return this.f26574g;
    }

    /* renamed from: c */
    public GoogleSignInAccount mo27428c() {
        return this.f26575h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26572e);
        C10134a.m25580a(parcel, 2, (Parcelable) mo27426a(), i, false);
        C10134a.m25575a(parcel, 3, mo27427b());
        C10134a.m25580a(parcel, 4, (Parcelable) mo27428c(), i, false);
        C10134a.m25571a(parcel, a);
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
