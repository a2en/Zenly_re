package p389io.reactivex.internal.schedulers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.schedulers.k */
public final class C12736k {

    /* renamed from: a */
    public static final boolean f33213a;

    /* renamed from: b */
    public static final int f33214b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f33215c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f33216d = new ConcurrentHashMap();

    /* renamed from: io.reactivex.internal.schedulers.k$a */
    static final class C12737a {

        /* renamed from: a */
        boolean f33217a;

        /* renamed from: b */
        int f33218b;

        C12737a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36895a(Properties properties) {
            String str = "rx2.purge-enabled";
            if (properties.containsKey(str)) {
                this.f33217a = Boolean.parseBoolean(properties.getProperty(str));
            } else {
                this.f33217a = true;
            }
            if (this.f33217a) {
                String str2 = "rx2.purge-period-seconds";
                if (properties.containsKey(str2)) {
                    try {
                        this.f33218b = Integer.parseInt(properties.getProperty(str2));
                        return;
                    } catch (NumberFormatException unused) {
                        this.f33218b = 1;
                        return;
                    }
                }
            }
            this.f33218b = 1;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.k$b */
    static final class C12738b implements Runnable {
        C12738b() {
        }

        public void run() {
            Iterator it = new ArrayList(C12736k.f33216d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C12736k.f33216d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        C12737a aVar = new C12737a();
        aVar.mo36895a(properties);
        f33213a = aVar.f33217a;
        f33214b = aVar.f33218b;
        m33312a();
    }

    /* renamed from: a */
    public static void m33312a() {
        m33313a(f33213a);
    }

    /* renamed from: a */
    static void m33313a(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) f33215c.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new C12731g("RxSchedulerPurge"));
                    if (f33215c.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        C12738b bVar = new C12738b();
                        int i = f33214b;
                        newScheduledThreadPool.scheduleAtFixedRate(bVar, (long) i, (long) i, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static ScheduledExecutorService m33311a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m33314a(f33213a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: a */
    static void m33314a(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f33216d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
