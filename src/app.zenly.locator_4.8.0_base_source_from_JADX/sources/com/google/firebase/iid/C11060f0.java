package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* renamed from: com.google.firebase.iid.f0 */
public final class C11060f0 extends Binder {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final zzc f28699a;

    C11060f0(zzc zzc) {
        this.f28699a = zzc;
    }

    /* renamed from: a */
    public final void mo32283a(C11056d0 d0Var) {
        if (Binder.getCallingUid() == Process.myUid()) {
            String str = "EnhancedIntentService";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "service received new intent via bind strategy");
            }
            if (this.f28699a.zzc(d0Var.f28692a)) {
                d0Var.mo32280a();
                return;
            }
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "intent being queued for bg execution");
            }
            this.f28699a.zzt.execute(new C11058e0(this, d0Var));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
