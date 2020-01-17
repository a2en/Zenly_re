package p389io.reactivex.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.schedulers.l */
public final class C12739l extends C12286f {

    /* renamed from: c */
    static final C12731g f33219c = new C12731g("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);

    /* renamed from: d */
    static final ScheduledExecutorService f33220d = Executors.newScheduledThreadPool(0);

    /* renamed from: b */
    final AtomicReference<ScheduledExecutorService> f33221b;

    /* renamed from: io.reactivex.internal.schedulers.l$a */
    static final class C12740a extends C12289c {

        /* renamed from: e */
        final ScheduledExecutorService f33222e;

        /* renamed from: f */
        final C12275b f33223f = new C12275b();

        /* renamed from: g */
        volatile boolean f33224g;

        C12740a(ScheduledExecutorService scheduledExecutorService) {
            this.f33222e = scheduledExecutorService;
        }

        /* renamed from: a */
        public Disposable mo6576a(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.f33224g) {
                return C12459c.INSTANCE;
            }
            C12735j jVar = new C12735j(C12768a.m33405a(runnable), this.f33223f);
            this.f33223f.add(jVar);
            if (j <= 0) {
                try {
                    future = this.f33222e.submit(jVar);
                } catch (RejectedExecutionException e) {
                    dispose();
                    C12768a.m33415b((Throwable) e);
                    return C12459c.INSTANCE;
                }
            } else {
                future = this.f33222e.schedule(jVar, j, timeUnit);
            }
            jVar.mo36892a(future);
            return jVar;
        }

        public void dispose() {
            if (!this.f33224g) {
                this.f33224g = true;
                this.f33223f.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f33224g;
        }
    }

    static {
        f33220d.shutdown();
    }

    public C12739l() {
        this(f33219c);
    }

    /* renamed from: a */
    static ScheduledExecutorService m33316a(ThreadFactory threadFactory) {
        return C12736k.m33311a(threadFactory);
    }

    public C12739l(ThreadFactory threadFactory) {
        this.f33221b = new AtomicReference<>();
        this.f33221b.lazySet(m33316a(threadFactory));
    }

    /* renamed from: a */
    public C12289c mo6573a() {
        return new C12740a((ScheduledExecutorService) this.f33221b.get());
    }

    /* renamed from: a */
    public Disposable mo6572a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        C12734i iVar = new C12734i(C12768a.m33405a(runnable));
        if (j <= 0) {
            try {
                future = ((ScheduledExecutorService) this.f33221b.get()).submit(iVar);
            } catch (RejectedExecutionException e) {
                C12768a.m33415b((Throwable) e);
                return C12459c.INSTANCE;
            }
        } else {
            future = ((ScheduledExecutorService) this.f33221b.get()).schedule(iVar, j, timeUnit);
        }
        iVar.mo36868a(future);
        return iVar;
    }

    /* renamed from: a */
    public Disposable mo6571a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        Runnable a = C12768a.m33405a(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f33221b.get();
            C12724c cVar = new C12724c(a, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(cVar);
                } catch (RejectedExecutionException e) {
                    C12768a.m33415b((Throwable) e);
                    return C12459c.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(cVar, j, timeUnit);
            }
            cVar.mo36872a(future);
            return cVar;
        }
        C12733h hVar = new C12733h(a);
        try {
            hVar.mo36868a(((ScheduledExecutorService) this.f33221b.get()).scheduleAtFixedRate(hVar, j, j2, timeUnit));
            return hVar;
        } catch (RejectedExecutionException e2) {
            C12768a.m33415b((Throwable) e2);
            return C12459c.INSTANCE;
        }
    }
}
