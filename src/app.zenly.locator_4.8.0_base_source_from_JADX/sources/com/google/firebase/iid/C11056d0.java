package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.d0 */
final class C11056d0 {

    /* renamed from: a */
    final Intent f28692a;

    /* renamed from: b */
    private final PendingResult f28693b;

    /* renamed from: c */
    private boolean f28694c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f28695d;

    C11056d0(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f28692a = intent;
        this.f28693b = pendingResult;
        this.f28695d = scheduledExecutorService.schedule(new C11054c0(this, intent), 9000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo32280a() {
        if (!this.f28694c) {
            this.f28693b.finish();
            this.f28695d.cancel(false);
            this.f28694c = true;
        }
    }
}
