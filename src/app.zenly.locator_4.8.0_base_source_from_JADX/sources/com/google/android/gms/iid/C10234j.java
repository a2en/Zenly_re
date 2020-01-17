package com.google.android.gms.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.j */
final class C10234j implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ Intent f26846e;

    /* renamed from: f */
    private final /* synthetic */ C10233i f26847f;

    C10234j(C10233i iVar, Intent intent) {
        this.f26847f = iVar;
        this.f26846e = intent;
    }

    public final void run() {
        String action = this.f26846e.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        this.f26847f.mo27743a();
    }
}
