package com.google.android.gms.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.iid.i */
final class C10233i {

    /* renamed from: a */
    final Intent f26842a;

    /* renamed from: b */
    private final PendingResult f26843b;

    /* renamed from: c */
    private boolean f26844c = false;

    /* renamed from: d */
    private final ScheduledFuture<?> f26845d;

    C10233i(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f26842a = intent;
        this.f26843b = pendingResult;
        this.f26845d = scheduledExecutorService.schedule(new C10234j(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo27743a() {
        if (!this.f26844c) {
            this.f26843b.finish();
            this.f26845d.cancel(false);
            this.f26844c = true;
        }
    }
}
