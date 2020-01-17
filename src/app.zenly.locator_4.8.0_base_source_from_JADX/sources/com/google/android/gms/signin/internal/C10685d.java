package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.C10259a;
import com.google.android.gms.internal.base.C10261c;

/* renamed from: com.google.android.gms.signin.internal.d */
public abstract class C10685d extends C10259a implements zac {
    public C10685d() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27777a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            zaa((ConnectionResult) C10261c.m25896a(parcel, ConnectionResult.CREATOR), (zab) C10261c.m25896a(parcel, zab.CREATOR));
        } else if (i == 4) {
            zag((Status) C10261c.m25896a(parcel, Status.CREATOR));
        } else if (i == 6) {
            zah((Status) C10261c.m25896a(parcel, Status.CREATOR));
        } else if (i == 7) {
            zaa((Status) C10261c.m25896a(parcel, Status.CREATOR), (GoogleSignInAccount) C10261c.m25896a(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            zab((zak) C10261c.m25896a(parcel, zak.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
