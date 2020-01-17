package p389io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.internal.disposables.C12460d;
import p389io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.schedulers.b */
public final class C12720b extends C12286f implements SchedulerMultiWorkerSupport {

    /* renamed from: d */
    static final C12722b f33162d = new C12722b(0, f33163e);

    /* renamed from: e */
    static final C12731g f33163e = new C12731g("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);

    /* renamed from: f */
    static final int f33164f = m33282a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final C12723c f33165g = new C12723c(new C12731g("RxComputationShutdown"));

    /* renamed from: b */
    final ThreadFactory f33166b;

    /* renamed from: c */
    final AtomicReference<C12722b> f33167c;

    /* renamed from: io.reactivex.internal.schedulers.b$a */
    static final class C12721a extends C12289c {

        /* renamed from: e */
        private final C12460d f33168e = new C12460d();

        /* renamed from: f */
        private final C12275b f33169f = new C12275b();

        /* renamed from: g */
        private final C12460d f33170g = new C12460d();

        /* renamed from: h */
        private final C12723c f33171h;

        /* renamed from: i */
        volatile boolean f33172i;

        C12721a(C12723c cVar) {
            this.f33171h = cVar;
            this.f33170g.add(this.f33168e);
            this.f33170g.add(this.f33169f);
        }

        /* renamed from: a */
        public Disposable mo6574a(Runnable runnable) {
            if (this.f33172i) {
                return C12459c.INSTANCE;
            }
            return this.f33171h.mo36884a(runnable, 0, TimeUnit.MILLISECONDS, this.f33168e);
        }

        public void dispose() {
            if (!this.f33172i) {
                this.f33172i = true;
                this.f33170g.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f33172i;
        }

        /* renamed from: a */
        public Disposable mo6576a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f33172i) {
                return C12459c.INSTANCE;
            }
            return this.f33171h.mo36884a(runnable, j, timeUnit, this.f33169f);
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.b$b */
    static final class C12722b implements SchedulerMultiWorkerSupport {

        /* renamed from: a */
        final int f33173a;

        /* renamed from: b */
        final C12723c[] f33174b;

        /* renamed from: c */
        long f33175c;

        C12722b(int i, ThreadFactory threadFactory) {
            this.f33173a = i;
            this.f33174b = new C12723c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f33174b[i2] = new C12723c(threadFactory);
            }
        }

        /* renamed from: a */
        public C12723c mo36870a() {
            int i = this.f33173a;
            if (i == 0) {
                return C12720b.f33165g;
            }
            C12723c[] cVarArr = this.f33174b;
            long j = this.f33175c;
            this.f33175c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        /* renamed from: b */
        public void mo36871b() {
            for (C12723c dispose : this.f33174b) {
                dispose.dispose();
            }
        }

        public void createWorkers(int i, WorkerCallback workerCallback) {
            int i2 = this.f33173a;
            if (i2 == 0) {
                for (int i3 = 0; i3 < i; i3++) {
                    workerCallback.onWorker(i3, C12720b.f33165g);
                }
                return;
            }
            int i4 = ((int) this.f33175c) % i2;
            for (int i5 = 0; i5 < i; i5++) {
                workerCallback.onWorker(i5, new C12721a(this.f33174b[i4]));
                i4++;
                if (i4 == i2) {
                    i4 = 0;
                }
            }
            this.f33175c = (long) i4;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.b$c */
    static final class C12723c extends C12730f {
        C12723c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        f33165g.dispose();
        f33162d.mo36871b();
    }

    public C12720b() {
        this(f33163e);
    }

    /* renamed from: a */
    static int m33282a(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    /* renamed from: a */
    public C12289c mo6573a() {
        return new C12721a(((C12722b) this.f33167c.get()).mo36870a());
    }

    /* renamed from: b */
    public void mo36869b() {
        C12722b bVar = new C12722b(f33164f, this.f33166b);
        if (!this.f33167c.compareAndSet(f33162d, bVar)) {
            bVar.mo36871b();
        }
    }

    public void createWorkers(int i, WorkerCallback workerCallback) {
        C12324b.m32833a(i, "number > 0 required");
        ((C12722b) this.f33167c.get()).createWorkers(i, workerCallback);
    }

    public C12720b(ThreadFactory threadFactory) {
        this.f33166b = threadFactory;
        this.f33167c = new AtomicReference<>(f33162d);
        mo36869b();
    }

    /* renamed from: a */
    public Disposable mo6572a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((C12722b) this.f33167c.get()).mo36870a().mo36887b(runnable, j, timeUnit);
    }

    /* renamed from: a */
    public Disposable mo6571a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return ((C12722b) this.f33167c.get()).mo36870a().mo36886b(runnable, j, j2, timeUnit);
    }
}
