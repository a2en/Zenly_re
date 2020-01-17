package p389io.fabric.sdk.android.services.common;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: io.fabric.sdk.android.services.common.l */
public final class C12188l {

    /* renamed from: io.fabric.sdk.android.services.common.l$a */
    static class C12189a implements ThreadFactory {

        /* renamed from: e */
        final /* synthetic */ String f31691e;

        /* renamed from: f */
        final /* synthetic */ AtomicLong f31692f;

        /* renamed from: io.fabric.sdk.android.services.common.l$a$a */
        class C12190a extends C12179g {

            /* renamed from: e */
            final /* synthetic */ Runnable f31693e;

            C12190a(C12189a aVar, Runnable runnable) {
                this.f31693e = runnable;
            }

            /* renamed from: a */
            public void mo25215a() {
                this.f31693e.run();
            }
        }

        C12189a(String str, AtomicLong atomicLong) {
            this.f31691e = str;
            this.f31692f = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C12190a(this, runnable));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31691e);
            sb.append(this.f31692f.getAndIncrement());
            newThread.setName(sb.toString());
            return newThread;
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.l$b */
    static class C12191b extends C12179g {

        /* renamed from: e */
        final /* synthetic */ String f31694e;

        /* renamed from: f */
        final /* synthetic */ ExecutorService f31695f;

        /* renamed from: g */
        final /* synthetic */ long f31696g;

        /* renamed from: h */
        final /* synthetic */ TimeUnit f31697h;

        C12191b(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
            this.f31694e = str;
            this.f31695f = executorService;
            this.f31696g = j;
            this.f31697h = timeUnit;
        }

        /* renamed from: a */
        public void mo25215a() {
            String str = "Fabric";
            try {
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Executing shutdown hook for ");
                sb.append(this.f31694e);
                f.mo35954d(str, sb.toString());
                this.f31695f.shutdown();
                if (!this.f31695f.awaitTermination(this.f31696g, this.f31697h)) {
                    Logger f2 = C12154c.m32113f();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f31694e);
                    sb2.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
                    f2.mo35954d(str, sb2.toString());
                    this.f31695f.shutdownNow();
                }
            } catch (InterruptedException unused) {
                C12154c.m32113f().mo35954d(str, String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f31694e}));
                this.f31695f.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    public static ExecutorService m32291a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(m32295c(str));
        m32292a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    /* renamed from: b */
    public static ScheduledExecutorService m32294b(String str) {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(m32295c(str));
        m32292a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    /* renamed from: c */
    public static final ThreadFactory m32295c(String str) {
        return new C12189a(str, new AtomicLong(1));
    }

    /* renamed from: a */
    private static final void m32292a(String str, ExecutorService executorService) {
        m32293a(str, executorService, 2, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public static final void m32293a(String str, ExecutorService executorService, long j, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        C12191b bVar = new C12191b(str, executorService, j, timeUnit);
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics Shutdown Hook for ");
        sb.append(str);
        runtime.addShutdownHook(new Thread(bVar, sb.toString()));
    }
}
