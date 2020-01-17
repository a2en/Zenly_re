package com.google.android.gms.internal.phenotype;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.common.internal.C10111g;

/* renamed from: com.google.android.gms.internal.phenotype.d */
public final class C10555d extends C10111g<zzb> {
    public C10555d(Context context, Looper looper, C10103d dVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 51, dVar, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo27354a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof zzb ? (zzb) queryLocalInterface : new C10553b(iBinder);
    }

    public final int getMinApkVersion() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo27383j() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo27384k() {
        return "com.google.android.gms.phenotype.service.START";
    }
}
