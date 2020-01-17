package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C10122k0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;
import com.google.android.gms.dynamic.C10186b;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzj extends AbstractSafeParcelable {
    public static final Creator<zzj> CREATOR = new C10152s();

    /* renamed from: e */
    private final String f26735e;

    /* renamed from: f */
    private final C10146m f26736f;

    /* renamed from: g */
    private final boolean f26737g;

    /* renamed from: h */
    private final boolean f26738h;

    zzj(String str, IBinder iBinder, boolean z, boolean z2) {
        this.f26735e = str;
        this.f26736f = m25695a(iBinder);
        this.f26737g = z;
        this.f26738h = z2;
    }

    /* renamed from: a */
    private static C10146m m25695a(IBinder iBinder) {
        byte[] bArr;
        String str = "Could not unwrap certificate";
        String str2 = "GoogleCertificatesQuery";
        C10148o oVar = null;
        if (iBinder == null) {
            return null;
        }
        try {
            IObjectWrapper zzb = C10122k0.m25503a(iBinder).zzb();
            if (zzb == null) {
                bArr = null;
            } else {
                bArr = (byte[]) C10186b.m25716a(zzb);
            }
            if (bArr != null) {
                oVar = new C10148o(bArr);
            } else {
                Log.e(str2, str);
            }
            return oVar;
        } catch (RemoteException e) {
            Log.e(str2, str, e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25583a(parcel, 1, this.f26735e, false);
        C10146m mVar = this.f26736f;
        if (mVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            mVar = null;
        } else {
            mVar.asBinder();
        }
        C10134a.m25578a(parcel, 2, (IBinder) mVar, false);
        C10134a.m25586a(parcel, 3, this.f26737g);
        C10134a.m25586a(parcel, 4, this.f26738h);
        C10134a.m25571a(parcel, a);
    }
}
