package com.mapbox.android.telemetry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.mapbox.android.telemetry.a */
class C11322a extends BroadcastReceiver {

    /* renamed from: a */
    private final C11382o0 f29402a;

    C11322a(C11382o0 o0Var) {
        this.f29402a = o0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Intent mo32967a() {
        return new Intent("com.mapbox.scheduler_flusher");
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.mapbox.scheduler_flusher".equals(intent.getAction())) {
            this.f29402a.mo33003a();
        }
    }
}
