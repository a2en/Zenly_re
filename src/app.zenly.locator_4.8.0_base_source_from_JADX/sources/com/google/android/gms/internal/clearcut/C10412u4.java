package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C10014c;

/* renamed from: com.google.android.gms.internal.clearcut.u4 */
final class C10412u4 extends C10014c<Status, C10436y4> {

    /* renamed from: o */
    private final zze f27226o;

    C10412u4(zze zze, GoogleApiClient googleApiClient) {
        super(ClearcutLogger.f26223o, googleApiClient);
        this.f27226o = zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Result mo27107a(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        C10436y4 y4Var = (C10436y4) anyClient;
        C10430x4 x4Var = new C10430x4(this);
        try {
            zze zze = this.f27226o;
            if (zze.f26257n != null && zze.f26256m.f27237o.length == 0) {
                zze.f26256m.f27237o = zze.f26257n.zza();
            }
            if (zze.f26258o != null && zze.f26256m.f27244v.length == 0) {
                zze.f26256m.f27244v = zze.f26258o.zza();
            }
            C10418v4 v4Var = zze.f26256m;
            byte[] bArr = new byte[v4Var.mo27910a()];
            C10309f4.m26104a(v4Var, bArr, 0, bArr.length);
            zze.f26249f = bArr;
            ((zzn) y4Var.mo27380i()).zza(x4Var, this.f27226o);
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            setFailedResult(new Status(10, "MessageProducer"));
        }
    }
}
