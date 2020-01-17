package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.p310o.C10178a;
import com.google.android.gms.internal.firebase_messaging.C10451a;
import com.google.android.gms.internal.firebase_messaging.C10455e;
import com.google.android.gms.tasks.C10693c;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.firebase.iid.c */
public final class C11053c {

    /* renamed from: e */
    private static C11053c f28679e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f28680a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f28681b;

    /* renamed from: c */
    private C11055d f28682c = new C11055d(this);

    /* renamed from: d */
    private int f28683d = 1;

    private C11053c(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f28681b = scheduledExecutorService;
        this.f28680a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C11053c m28477a(Context context) {
        C11053c cVar;
        synchronized (C11053c.class) {
            if (f28679e == null) {
                f28679e = new C11053c(context, C10451a.m26841a().zza(1, new C10178a("MessengerIpcClient"), C10455e.f27375a));
            }
            cVar = f28679e;
        }
        return cVar;
    }

    /* renamed from: b */
    public final C10693c<Bundle> mo32270b(int i, Bundle bundle) {
        return m28476a((C11071l<T>) new C11075n<T>(m28474a(), 1, bundle));
    }

    /* renamed from: a */
    public final C10693c<Void> mo32269a(int i, Bundle bundle) {
        return m28476a((C11071l<T>) new C11067j<T>(m28474a(), 2, bundle));
    }

    /* renamed from: a */
    private final synchronized <T> C10693c<T> m28476a(C11071l<T> lVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(lVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.f28682c.mo32276a((C11071l) lVar)) {
            this.f28682c = new C11055d(this);
            this.f28682c.mo32276a((C11071l) lVar);
        }
        return lVar.f28716b.mo29325a();
    }

    /* renamed from: a */
    private final synchronized int m28474a() {
        int i;
        i = this.f28683d;
        this.f28683d = i + 1;
        return i;
    }
}
