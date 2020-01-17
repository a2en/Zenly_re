package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.android.gms.iid.k */
public final class C10235k extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zze f26848a;

    C10235k(zze zze) {
        this.f26848a = zze;
    }

    /* renamed from: a */
    public final void mo27745a(C10233i iVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            String str = "EnhancedIntentService";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "service received new intent via bind strategy");
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "intent being queued for bg execution");
            }
            this.f26848a.f26857e.execute(new C10236l(this, iVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
