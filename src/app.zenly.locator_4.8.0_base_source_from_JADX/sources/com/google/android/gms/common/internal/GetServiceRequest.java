package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C10069d;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor.C10094a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR = new C10108e0();

    /* renamed from: e */
    private final int f26559e;

    /* renamed from: f */
    private final int f26560f;

    /* renamed from: g */
    private int f26561g;

    /* renamed from: h */
    String f26562h;

    /* renamed from: i */
    IBinder f26563i;

    /* renamed from: j */
    Scope[] f26564j;

    /* renamed from: k */
    Bundle f26565k;

    /* renamed from: l */
    Account f26566l;

    /* renamed from: m */
    Feature[] f26567m;

    /* renamed from: n */
    Feature[] f26568n;

    /* renamed from: o */
    private boolean f26569o;

    /* renamed from: p */
    private int f26570p;

    public GetServiceRequest(int i) {
        this.f26559e = 4;
        this.f26561g = C10069d.f26459a;
        this.f26560f = i;
        this.f26569o = true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25575a(parcel, 1, this.f26559e);
        C10134a.m25575a(parcel, 2, this.f26560f);
        C10134a.m25575a(parcel, 3, this.f26561g);
        C10134a.m25583a(parcel, 4, this.f26562h, false);
        C10134a.m25578a(parcel, 5, this.f26563i, false);
        C10134a.m25589a(parcel, 6, (T[]) this.f26564j, i, false);
        C10134a.m25577a(parcel, 7, this.f26565k, false);
        C10134a.m25580a(parcel, 8, (Parcelable) this.f26566l, i, false);
        C10134a.m25589a(parcel, 10, (T[]) this.f26567m, i, false);
        C10134a.m25589a(parcel, 11, (T[]) this.f26568n, i, false);
        C10134a.m25586a(parcel, 12, this.f26569o);
        C10134a.m25575a(parcel, 13, this.f26570p);
        C10134a.m25571a(parcel, a);
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z, int i4) {
        this.f26559e = i;
        this.f26560f = i2;
        this.f26561g = i3;
        String str2 = "com.google.android.gms";
        if (str2.equals(str)) {
            this.f26562h = str2;
        } else {
            this.f26562h = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C10097a.m25427a(C10094a.m25412a(iBinder));
            }
            this.f26566l = account2;
        } else {
            this.f26563i = iBinder;
            this.f26566l = account;
        }
        this.f26564j = scopeArr;
        this.f26565k = bundle;
        this.f26567m = featureArr;
        this.f26568n = featureArr2;
        this.f26569o = z;
        this.f26570p = i4;
    }
}
