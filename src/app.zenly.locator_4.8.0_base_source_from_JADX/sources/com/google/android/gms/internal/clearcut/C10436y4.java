package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.common.internal.C10111g;

/* renamed from: com.google.android.gms.internal.clearcut.y4 */
public final class C10436y4 extends C10111g<zzn> {
    public C10436y4(Context context, Looper looper, C10103d dVar, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 40, dVar, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo27354a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof zzn ? (zzn) queryLocalInterface : new C10282b5(iBinder);
    }

    public final int getMinApkVersion() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo27383j() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final String mo27384k() {
        return "com.google.android.gms.clearcut.service.START";
    }
}
