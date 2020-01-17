package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* renamed from: com.google.firebase.iid.y */
final class C11097y extends BroadcastReceiver {

    /* renamed from: a */
    private C11098z f28778a;

    public C11097y(C11098z zVar) {
        this.f28778a = zVar;
    }

    /* renamed from: a */
    public final void mo32328a() {
        if (FirebaseInstanceId.zzm()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.f28778a.mo32330a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        C11098z zVar = this.f28778a;
        if (zVar != null && zVar.mo32331b()) {
            if (FirebaseInstanceId.zzm()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.zza((Runnable) this.f28778a, 0);
            this.f28778a.mo32330a().unregisterReceiver(this);
            this.f28778a = null;
        }
    }
}
