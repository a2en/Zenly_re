package com.google.android.gms.iid;

import android.util.Log;

/* renamed from: com.google.android.gms.iid.l */
final class C10236l implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10233i f26849e;

    /* renamed from: f */
    private final /* synthetic */ C10235k f26850f;

    C10236l(C10235k kVar, C10233i iVar) {
        this.f26850f = kVar;
        this.f26849e = iVar;
    }

    public final void run() {
        String str = "EnhancedIntentService";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "bg processing of the intent starting now");
        }
        this.f26850f.f26848a.handleIntent(this.f26849e.f26842a);
        this.f26849e.mo27743a();
    }
}
