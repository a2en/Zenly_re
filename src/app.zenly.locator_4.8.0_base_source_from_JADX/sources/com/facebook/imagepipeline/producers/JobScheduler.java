package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.C9732e;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class JobScheduler {

    /* renamed from: a */
    private final Executor f25695a;

    /* renamed from: b */
    private final JobRunnable f25696b;

    /* renamed from: c */
    private final Runnable f25697c = new C9785a();

    /* renamed from: d */
    private final Runnable f25698d = new C9786b();

    /* renamed from: e */
    private final int f25699e;

    /* renamed from: f */
    C9732e f25700f = null;

    /* renamed from: g */
    int f25701g = 0;

    /* renamed from: h */
    C9789e f25702h = C9789e.IDLE;

    /* renamed from: i */
    long f25703i = 0;

    /* renamed from: j */
    long f25704j = 0;

    public interface JobRunnable {
        void run(C9732e eVar, int i);
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$a */
    class C9785a implements Runnable {
        C9785a() {
        }

        public void run() {
            JobScheduler.this.m24296d();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$b */
    class C9786b implements Runnable {
        C9786b() {
        }

        public void run() {
            JobScheduler.this.m24298f();
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$c */
    static /* synthetic */ class C9787c {

        /* renamed from: a */
        static final /* synthetic */ int[] f25707a = new int[C9789e.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.facebook.imagepipeline.producers.JobScheduler$e[] r0 = com.facebook.imagepipeline.producers.JobScheduler.C9789e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25707a = r0
                int[] r0 = f25707a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.imagepipeline.producers.JobScheduler$e r1 = com.facebook.imagepipeline.producers.JobScheduler.C9789e.IDLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25707a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.imagepipeline.producers.JobScheduler$e r1 = com.facebook.imagepipeline.producers.JobScheduler.C9789e.QUEUED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f25707a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.imagepipeline.producers.JobScheduler$e r1 = com.facebook.imagepipeline.producers.JobScheduler.C9789e.RUNNING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f25707a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.facebook.imagepipeline.producers.JobScheduler$e r1 = com.facebook.imagepipeline.producers.JobScheduler.C9789e.RUNNING_AND_PENDING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.JobScheduler.C9787c.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$d */
    static class C9788d {

        /* renamed from: a */
        private static ScheduledExecutorService f25708a;

        /* renamed from: a */
        static ScheduledExecutorService m24303a() {
            if (f25708a == null) {
                f25708a = Executors.newSingleThreadScheduledExecutor();
            }
            return f25708a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$e */
    enum C9789e {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public JobScheduler(Executor executor, JobRunnable jobRunnable, int i) {
        this.f25695a = executor;
        this.f25696b = jobRunnable;
        this.f25699e = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m24296d() {
        C9732e eVar;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            eVar = this.f25700f;
            i = this.f25701g;
            this.f25700f = null;
            this.f25701g = 0;
            this.f25702h = C9789e.RUNNING;
            this.f25704j = uptimeMillis;
        }
        try {
            if (m24295b(eVar, i)) {
                this.f25696b.run(eVar, i);
            }
        } finally {
            C9732e.m24069c(eVar);
            m24297e();
        }
    }

    /* renamed from: e */
    private void m24297e() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f25702h == C9789e.RUNNING_AND_PENDING) {
                j = Math.max(this.f25704j + ((long) this.f25699e), uptimeMillis);
                z = true;
                this.f25703i = uptimeMillis;
                this.f25702h = C9789e.QUEUED;
            } else {
                this.f25702h = C9789e.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            m24292a(j - uptimeMillis);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m24298f() {
        this.f25695a.execute(this.f25697c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r3 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        m24292a(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo26581c() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            com.facebook.imagepipeline.image.e r2 = r7.f25700f     // Catch:{ all -> 0x0046 }
            int r3 = r7.f25701g     // Catch:{ all -> 0x0046 }
            boolean r2 = m24295b(r2, r3)     // Catch:{ all -> 0x0046 }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            return r3
        L_0x0012:
            int[] r2 = com.facebook.imagepipeline.producers.JobScheduler.C9787c.f25707a     // Catch:{ all -> 0x0046 }
            com.facebook.imagepipeline.producers.JobScheduler$e r4 = r7.f25702h     // Catch:{ all -> 0x0046 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0046 }
            r2 = r2[r4]     // Catch:{ all -> 0x0046 }
            r4 = 1
            if (r2 == r4) goto L_0x002d
            r5 = 2
            if (r2 == r5) goto L_0x002a
            r5 = 3
            if (r2 == r5) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            com.facebook.imagepipeline.producers.JobScheduler$e r2 = com.facebook.imagepipeline.producers.JobScheduler.C9789e.RUNNING_AND_PENDING     // Catch:{ all -> 0x0046 }
            r7.f25702h = r2     // Catch:{ all -> 0x0046 }
        L_0x002a:
            r5 = 0
            goto L_0x003e
        L_0x002d:
            long r2 = r7.f25704j     // Catch:{ all -> 0x0046 }
            int r5 = r7.f25699e     // Catch:{ all -> 0x0046 }
            long r5 = (long) r5     // Catch:{ all -> 0x0046 }
            long r2 = r2 + r5
            long r5 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0046 }
            r7.f25703i = r0     // Catch:{ all -> 0x0046 }
            com.facebook.imagepipeline.producers.JobScheduler$e r2 = com.facebook.imagepipeline.producers.JobScheduler.C9789e.QUEUED     // Catch:{ all -> 0x0046 }
            r7.f25702h = r2     // Catch:{ all -> 0x0046 }
            r3 = 1
        L_0x003e:
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            long r5 = r5 - r0
            r7.m24292a(r5)
        L_0x0045:
            return r4
        L_0x0046:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0046 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.JobScheduler.mo26581c():boolean");
    }

    /* renamed from: b */
    private static boolean m24295b(C9732e eVar, int i) {
        return C9796b.m24323a(i) || C9796b.m24326b(i, 4) || C9732e.m24071e(eVar);
    }

    /* renamed from: a */
    public void mo26578a() {
        C9732e eVar;
        synchronized (this) {
            eVar = this.f25700f;
            this.f25700f = null;
            this.f25701g = 0;
        }
        C9732e.m24069c(eVar);
    }

    /* renamed from: b */
    public synchronized long mo26580b() {
        return this.f25704j - this.f25703i;
    }

    /* renamed from: a */
    public boolean mo26579a(C9732e eVar, int i) {
        C9732e eVar2;
        if (!m24295b(eVar, i)) {
            return false;
        }
        synchronized (this) {
            eVar2 = this.f25700f;
            this.f25700f = C9732e.m24068b(eVar);
            this.f25701g = i;
        }
        C9732e.m24069c(eVar2);
        return true;
    }

    /* renamed from: a */
    private void m24292a(long j) {
        if (j > 0) {
            C9788d.m24303a().schedule(this.f25698d, j, TimeUnit.MILLISECONDS);
        } else {
            this.f25698d.run();
        }
    }
}
