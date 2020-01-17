package com.crashlytics.android.core;

import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: com.crashlytics.android.core.j */
class C9331j {

    /* renamed from: a */
    private final ExecutorService f24200a;

    /* renamed from: com.crashlytics.android.core.j$a */
    class C9332a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Runnable f24201e;

        C9332a(C9331j jVar, Runnable runnable) {
            this.f24201e = runnable;
        }

        public void run() {
            try {
                this.f24201e.run();
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("CrashlyticsCore", "Failed to execute task.", e);
            }
        }
    }

    /* renamed from: com.crashlytics.android.core.j$b */
    class C9333b implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ Callable f24202e;

        C9333b(C9331j jVar, Callable callable) {
            this.f24202e = callable;
        }

        public T call() throws Exception {
            try {
                return this.f24202e.call();
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("CrashlyticsCore", "Failed to execute task.", e);
                return null;
            }
        }
    }

    public C9331j(ExecutorService executorService) {
        this.f24200a = executorService;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Future<?> mo25126a(Runnable runnable) {
        try {
            return this.f24200a.submit(new C9332a(this, runnable));
        } catch (RejectedExecutionException unused) {
            C12154c.m32113f().mo35954d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <T> T mo25128b(Callable<T> callable) {
        String str = "CrashlyticsCore";
        try {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                return this.f24200a.submit(callable).get(4, TimeUnit.SECONDS);
            }
            return this.f24200a.submit(callable).get();
        } catch (RejectedExecutionException unused) {
            C12154c.m32113f().mo35954d(str, "Executor is shut down because we're handling a fatal crash.");
            return null;
        } catch (Exception e) {
            C12154c.m32113f().mo35957e(str, "Failed to execute task.", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <T> Future<T> mo25127a(Callable<T> callable) {
        try {
            return this.f24200a.submit(new C9333b(this, callable));
        } catch (RejectedExecutionException unused) {
            C12154c.m32113f().mo35954d("CrashlyticsCore", "Executor is shut down because we're handling a fatal crash.");
            return null;
        }
    }
}
