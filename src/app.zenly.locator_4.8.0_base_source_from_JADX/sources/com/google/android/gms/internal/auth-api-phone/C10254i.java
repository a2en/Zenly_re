package com.google.android.gms.internal.auth-api-phone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C10074e;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.common.internal.C10111g;

/* renamed from: com.google.android.gms.internal.auth-api-phone.i */
public final class C10254i extends C10111g<zzj> {
    public C10254i(Context context, Looper looper, C10103d dVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 126, dVar, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo27354a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof zzj) {
            return (zzj) queryLocalInterface;
        }
        return new C10251f(iBinder);
    }

    /* renamed from: d */
    public final Feature[] mo27366d() {
        return C10247b.f26866c;
    }

    public final int getMinApkVersion() {
        return C10074e.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo27383j() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo27384k() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
