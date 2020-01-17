package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C10016d.C10017a;

/* renamed from: com.google.android.gms.common.api.internal.y */
final class C10062y implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ ConnectionResult f26441e;

    /* renamed from: f */
    private final /* synthetic */ C10018b f26442f;

    C10062y(C10018b bVar, ConnectionResult connectionResult) {
        this.f26442f = bVar;
        this.f26441e = connectionResult;
    }

    public final void run() {
        C10017a aVar = (C10017a) C10016d.this.f26351i.get(this.f26442f.f26370b);
        if (aVar != null) {
            if (this.f26441e.isSuccess()) {
                this.f26442f.f26373e = true;
                if (this.f26442f.f26369a.requiresSignIn()) {
                    this.f26442f.m25186a();
                    return;
                }
                try {
                    this.f26442f.f26369a.getRemoteService(null, this.f26442f.f26369a.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                    aVar.onConnectionFailed(new ConnectionResult(10));
                }
            } else {
                aVar.onConnectionFailed(this.f26441e);
            }
        }
    }
}
