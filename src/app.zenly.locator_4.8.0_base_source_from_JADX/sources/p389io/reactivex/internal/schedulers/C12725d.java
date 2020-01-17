package p389io.reactivex.internal.schedulers;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12459c;

/* renamed from: io.reactivex.internal.schedulers.d */
public final class C12725d extends C12286f {

    /* renamed from: d */
    static final C12731g f33182d;

    /* renamed from: e */
    static final C12731g f33183e;

    /* renamed from: f */
    private static final long f33184f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    /* renamed from: g */
    private static final TimeUnit f33185g = TimeUnit.SECONDS;

    /* renamed from: h */
    static final C12728c f33186h = new C12728c(new C12731g("RxCachedThreadSchedulerShutdown"));

    /* renamed from: i */
    static final C12726a f33187i = new C12726a(0, null, f33182d);

    /* renamed from: b */
    final ThreadFactory f33188b;

    /* renamed from: c */
    final AtomicReference<C12726a> f33189c;

    /* renamed from: io.reactivex.internal.schedulers.d$a */
    static final class C12726a implements Runnable {

        /* renamed from: e */
        private final long f33190e;

        /* renamed from: f */
        private final ConcurrentLinkedQueue<C12728c> f33191f;

        /* renamed from: g */
        final C12275b f33192g;

        /* renamed from: h */
        private final ScheduledExecutorService f33193h;

        /* renamed from: i */
        private final Future<?> f33194i;

        /* renamed from: j */
        private final ThreadFactory f33195j;

        C12726a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            Future<?> future;
            this.f33190e = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f33191f = new ConcurrentLinkedQueue<>();
            this.f33192g = new C12275b();
            this.f33195j = threadFactory;
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C12725d.f33183e);
                long j2 = this.f33190e;
                future = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                future = null;
            }
            this.f33193h = scheduledExecutorService;
            this.f33194i = future;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36877a(C12728c cVar) {
            cVar.mo36882a(mo36879c() + this.f33190e);
            this.f33191f.offer(cVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C12728c mo36878b() {
            if (this.f33192g.isDisposed()) {
                return C12725d.f33186h;
            }
            while (!this.f33191f.isEmpty()) {
                C12728c cVar = (C12728c) this.f33191f.poll();
                if (cVar != null) {
                    return cVar;
                }
            }
            C12728c cVar2 = new C12728c(this.f33195j);
            this.f33192g.add(cVar2);
            return cVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public long mo36879c() {
            return System.nanoTime();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo36880d() {
            this.f33192g.dispose();
            Future<?> future = this.f33194i;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f33193h;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        public void run() {
            mo36876a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36876a() {
            if (!this.f33191f.isEmpty()) {
                long c = mo36879c();
                Iterator it = this.f33191f.iterator();
                while (it.hasNext()) {
                    C12728c cVar = (C12728c) it.next();
                    if (cVar.mo36883b() > c) {
                        return;
                    }
                    if (this.f33191f.remove(cVar)) {
                        this.f33192g.remove(cVar);
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$b */
    static final class C12727b extends C12289c {

        /* renamed from: e */
        private final C12275b f33196e;

        /* renamed from: f */
        private final C12726a f33197f;

        /* renamed from: g */
        private final C12728c f33198g;

        /* renamed from: h */
        final AtomicBoolean f33199h = new AtomicBoolean();

        C12727b(C12726a aVar) {
            this.f33197f = aVar;
            this.f33196e = new C12275b();
            this.f33198g = aVar.mo36878b();
        }

        /* renamed from: a */
        public Disposable mo6576a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f33196e.isDisposed()) {
                return C12459c.INSTANCE;
            }
            return this.f33198g.mo36884a(runnable, j, timeUnit, this.f33196e);
        }

        public void dispose() {
            if (this.f33199h.compareAndSet(false, true)) {
                this.f33196e.dispose();
                this.f33197f.mo36877a(this.f33198g);
            }
        }

        public boolean isDisposed() {
            return this.f33199h.get();
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.d$c */
    static final class C12728c extends C12730f {

        /* renamed from: g */
        private long f33200g = 0;

        C12728c(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        /* renamed from: a */
        public void mo36882a(long j) {
            this.f33200g = j;
        }

        /* renamed from: b */
        public long mo36883b() {
            return this.f33200g;
        }
    }

    static {
        f33186h.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f33182d = new C12731g("RxCachedThreadScheduler", max);
        f33183e = new C12731g("RxCachedWorkerPoolEvictor", max);
        f33187i.mo36880d();
    }

    public C12725d() {
        this(f33182d);
    }

    /* renamed from: a */
    public C12289c mo6573a() {
        return new C12727b((C12726a) this.f33189c.get());
    }

    /* renamed from: b */
    public void mo36875b() {
        C12726a aVar = new C12726a(f33184f, f33185g, this.f33188b);
        if (!this.f33189c.compareAndSet(f33187i, aVar)) {
            aVar.mo36880d();
        }
    }

    public C12725d(ThreadFactory threadFactory) {
        this.f33188b = threadFactory;
        this.f33189c = new AtomicReference<>(f33187i);
        mo36875b();
    }
}
