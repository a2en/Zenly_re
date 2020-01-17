package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {

    /* renamed from: a */
    private Context f26450a;

    /* renamed from: b */
    private final C10064z f26451b;

    public zabq(C10064z zVar) {
        this.f26451b = zVar;
    }

    /* renamed from: a */
    public final void mo27263a(Context context) {
        this.f26450a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f26451b.mo27236a();
            mo27262a();
        }
    }

    /* renamed from: a */
    public final synchronized void mo27262a() {
        if (this.f26450a != null) {
            this.f26450a.unregisterReceiver(this);
        }
        this.f26450a = null;
    }
}
