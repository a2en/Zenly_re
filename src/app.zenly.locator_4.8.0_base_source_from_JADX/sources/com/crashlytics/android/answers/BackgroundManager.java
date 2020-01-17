package com.crashlytics.android.answers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.fabric.sdk.android.C12154c;

class BackgroundManager {

    /* renamed from: a */
    private final ScheduledExecutorService f24026a;

    /* renamed from: b */
    private final List<Listener> f24027b = new ArrayList();

    /* renamed from: c */
    private volatile boolean f24028c = true;

    /* renamed from: d */
    final AtomicReference<ScheduledFuture<?>> f24029d = new AtomicReference<>();

    /* renamed from: e */
    boolean f24030e = true;

    public interface Listener {
        void onBackground();
    }

    /* renamed from: com.crashlytics.android.answers.BackgroundManager$a */
    class C9253a implements Runnable {
        C9253a() {
        }

        public void run() {
            BackgroundManager.this.f24029d.set(null);
            BackgroundManager.this.m22285c();
        }
    }

    public BackgroundManager(ScheduledExecutorService scheduledExecutorService) {
        this.f24026a = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m22285c() {
        for (Listener onBackground : this.f24027b) {
            onBackground.onBackground();
        }
    }

    /* renamed from: b */
    public void mo24949b() {
        this.f24030e = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f24029d.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: a */
    public void mo24948a(boolean z) {
        this.f24028c = z;
    }

    /* renamed from: a */
    public void mo24947a(Listener listener) {
        this.f24027b.add(listener);
    }

    /* renamed from: a */
    public void mo24946a() {
        if (this.f24028c && !this.f24030e) {
            this.f24030e = true;
            try {
                this.f24029d.compareAndSet(null, this.f24026a.schedule(new C9253a(), 5000, TimeUnit.MILLISECONDS));
            } catch (RejectedExecutionException e) {
                C12154c.m32113f().mo35955d("Answers", "Failed to schedule background detector", e);
            }
        }
    }
}
