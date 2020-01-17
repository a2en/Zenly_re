package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.common.internal.C10111g;

/* renamed from: com.google.android.gms.internal.location.h0 */
public class C10499h0 extends C10111g<zzao> {

    /* renamed from: C */
    private final String f27405C;

    /* renamed from: D */
    protected final zzbj<zzao> f27406D = new C10501i0(this);

    public C10499h0(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, String str, C10103d dVar) {
        super(context, looper, 23, dVar, connectionCallbacks, onConnectionFailedListener);
        this.f27405C = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo27354a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof zzao ? (zzao) queryLocalInterface : new C10508m(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Bundle mo27370f() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f27405C);
        return bundle;
    }

    public int getMinApkVersion() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public String mo27383j() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public String mo27384k() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
