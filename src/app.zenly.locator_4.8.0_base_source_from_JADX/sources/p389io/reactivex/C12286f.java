package p389io.reactivex;

import java.util.concurrent.TimeUnit;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.internal.disposables.C12461e;
import p389io.reactivex.internal.schedulers.C12730f;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.p403k.C12768a;
import p389io.reactivex.schedulers.SchedulerRunnableIntrospection;

/* renamed from: io.reactivex.f */
public abstract class C12286f {

    /* renamed from: a */
    static final long f31951a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    /* renamed from: io.reactivex.f$a */
    static final class C12287a implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* renamed from: e */
        final Runnable f31952e;

        /* renamed from: f */
        final C12289c f31953f;

        /* renamed from: g */
        Thread f31954g;

        C12287a(Runnable runnable, C12289c cVar) {
            this.f31952e = runnable;
            this.f31953f = cVar;
        }

        public void dispose() {
            if (this.f31954g == Thread.currentThread()) {
                C12289c cVar = this.f31953f;
                if (cVar instanceof C12730f) {
                    ((C12730f) cVar).mo36885a();
                    return;
                }
            }
            this.f31953f.dispose();
        }

        public Runnable getWrappedRunnable() {
            return this.f31952e;
        }

        public boolean isDisposed() {
            return this.f31953f.isDisposed();
        }

        public void run() {
            this.f31954g = Thread.currentThread();
            try {
                this.f31952e.run();
            } finally {
                dispose();
                this.f31954g = null;
            }
        }
    }

    /* renamed from: io.reactivex.f$b */
    static final class C12288b implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* renamed from: e */
        final Runnable f31955e;

        /* renamed from: f */
        final C12289c f31956f;

        /* renamed from: g */
        volatile boolean f31957g;

        C12288b(Runnable runnable, C12289c cVar) {
            this.f31955e = runnable;
            this.f31956f = cVar;
        }

        public void dispose() {
            this.f31957g = true;
            this.f31956f.dispose();
        }

        public Runnable getWrappedRunnable() {
            return this.f31955e;
        }

        public boolean isDisposed() {
            return this.f31957g;
        }

        public void run() {
            if (!this.f31957g) {
                try {
                    this.f31955e.run();
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f31956f.dispose();
                    throw C12757g.m33354b(th);
                }
            }
        }
    }

    /* renamed from: io.reactivex.f$c */
    public static abstract class C12289c implements Disposable {

        /* renamed from: io.reactivex.f$c$a */
        final class C12290a implements Runnable, SchedulerRunnableIntrospection {

            /* renamed from: e */
            final Runnable f31958e;

            /* renamed from: f */
            final C12461e f31959f;

            /* renamed from: g */
            final long f31960g;

            /* renamed from: h */
            long f31961h;

            /* renamed from: i */
            long f31962i;

            /* renamed from: j */
            long f31963j;

            C12290a(long j, Runnable runnable, long j2, C12461e eVar, long j3) {
                this.f31958e = runnable;
                this.f31959f = eVar;
                this.f31960g = j3;
                this.f31962i = j2;
                this.f31963j = j;
            }

            public Runnable getWrappedRunnable() {
                return this.f31958e;
            }

            public void run() {
                long j;
                this.f31958e.run();
                if (!this.f31959f.isDisposed()) {
                    long a = C12289c.this.mo36524a(TimeUnit.NANOSECONDS);
                    long j2 = C12286f.f31951a;
                    long j3 = a + j2;
                    long j4 = this.f31962i;
                    if (j3 >= j4) {
                        long j5 = this.f31960g;
                        if (a < j4 + j5 + j2) {
                            long j6 = this.f31963j;
                            long j7 = this.f31961h + 1;
                            this.f31961h = j7;
                            j = j6 + (j7 * j5);
                            this.f31962i = a;
                            this.f31959f.mo36653a(C12289c.this.mo6576a(this, j - a, TimeUnit.NANOSECONDS));
                        }
                    }
                    long j8 = this.f31960g;
                    long j9 = a + j8;
                    long j10 = this.f31961h + 1;
                    this.f31961h = j10;
                    this.f31963j = j9 - (j8 * j10);
                    j = j9;
                    this.f31962i = a;
                    this.f31959f.mo36653a(C12289c.this.mo6576a(this, j - a, TimeUnit.NANOSECONDS));
                }
            }
        }

        /* renamed from: a */
        public Disposable mo6574a(Runnable runnable) {
            return mo6576a(runnable, 0, TimeUnit.NANOSECONDS);
        }

        /* renamed from: a */
        public abstract Disposable mo6576a(Runnable runnable, long j, TimeUnit timeUnit);

        /* renamed from: a */
        public Disposable mo6575a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            C12461e eVar = new C12461e();
            C12461e eVar2 = new C12461e(eVar);
            Runnable a = C12768a.m33405a(runnable);
            long nanos = timeUnit2.toNanos(j2);
            long a2 = mo36524a(TimeUnit.NANOSECONDS);
            C12461e eVar3 = eVar;
            C12290a aVar = r0;
            C12290a aVar2 = new C12290a(a2 + timeUnit2.toNanos(j3), a, a2, eVar2, nanos);
            Disposable a3 = mo6576a(aVar, j3, timeUnit2);
            if (a3 == C12459c.INSTANCE) {
                return a3;
            }
            eVar3.mo36653a(a3);
            return eVar2;
        }

        /* renamed from: a */
        public long mo36524a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public Disposable mo6570a(Runnable runnable) {
        return mo6572a(runnable, 0, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public abstract C12289c mo6573a();

    /* renamed from: a */
    public Disposable mo6572a(Runnable runnable, long j, TimeUnit timeUnit) {
        C12289c a = mo6573a();
        C12287a aVar = new C12287a(C12768a.m33405a(runnable), a);
        a.mo6576a(aVar, j, timeUnit);
        return aVar;
    }

    /* renamed from: a */
    public Disposable mo6571a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C12289c a = mo6573a();
        C12288b bVar = new C12288b(C12768a.m33405a(runnable), a);
        Disposable a2 = a.mo6575a(bVar, j, j2, timeUnit);
        return a2 == C12459c.INSTANCE ? a2 : bVar;
    }
}
