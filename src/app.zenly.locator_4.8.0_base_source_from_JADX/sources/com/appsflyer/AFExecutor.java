package com.appsflyer;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.content.C0540a;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {

    /* renamed from: ॱ */
    private static AFExecutor f22501;

    /* renamed from: ˊ */
    public final ThreadFactory f22502 = new C87382();

    /* renamed from: ˋ */
    public Executor f22503;

    /* renamed from: ˎ */
    public ScheduledExecutorService f22504;

    /* renamed from: ˏ */
    public ScheduledExecutorService f22505;

    /* renamed from: com.appsflyer.AFExecutor$2 */
    class C87382 implements ThreadFactory {

        /* renamed from: com.appsflyer.AFExecutor$2$1 */
        public class C87391 implements Runnable {

            /* renamed from: ˏ */
            private /* synthetic */ Runnable f22508;

            C87391(Runnable runnable) {
                this.f22508 = runnable;
            }

            /* renamed from: ˋ */
            public static boolean m20579(Context context, String str) {
                int a = C0540a.m2537a(context, str);
                StringBuilder sb = new StringBuilder("is Permission Available: ");
                sb.append(str);
                sb.append("; res: ");
                sb.append(a);
                AFLogger.afRDLog(sb.toString());
                return a == 0;
            }

            public final void run() {
                if (VERSION.SDK_INT >= 14) {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                }
                this.f22508.run();
            }

            C87391() {
            }
        }

        C87382() {
        }

        /* renamed from: ˋ */
        static Map<String, String> m20578(Context context) {
            HashMap hashMap = new HashMap();
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                int i = context.getResources().getConfiguration().screenLayout & 15;
                hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
                hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
                hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
                hashMap.put("size", String.valueOf(i));
                hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
                hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
            } catch (Throwable th) {
                AFLogger.afErrorLog("Couldn't aggregate screen stats: ", th);
            }
            return hashMap;
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(new C87391(runnable));
        }

        C87382() {
        }
    }

    private AFExecutor() {
    }

    public static AFExecutor getInstance() {
        if (f22501 == null) {
            f22501 = new AFExecutor();
        }
        return f22501;
    }

    /* renamed from: ˎ */
    public static void m20576(ExecutorService executorService) {
        String str = "killing non-finished tasks";
        try {
            AFLogger.afRDLog("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog(str);
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.afRDLog("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog(str);
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.afRDLog(str);
            }
            executorService.shutdownNow();
            throw th;
        }
    }

    public Executor getThreadPoolExecutor() {
        Executor executor = this.f22503;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.f22503).isTerminated() || ((ThreadPoolExecutor) this.f22503).isTerminating()))) {
            if (VERSION.SDK_INT < 11) {
                return Executors.newSingleThreadExecutor();
            }
            this.f22503 = Executors.newFixedThreadPool(2, this.f22502);
        }
        return this.f22503;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final ScheduledThreadPoolExecutor mo23616() {
        ScheduledExecutorService scheduledExecutorService = this.f22505;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.f22505.isTerminated()) {
            this.f22505 = Executors.newScheduledThreadPool(2, this.f22502);
        }
        return (ScheduledThreadPoolExecutor) this.f22505;
    }
}
