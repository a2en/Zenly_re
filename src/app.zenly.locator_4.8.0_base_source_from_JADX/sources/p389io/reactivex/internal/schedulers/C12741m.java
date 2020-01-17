package p389io.reactivex.internal.schedulers;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.schedulers.m */
public final class C12741m extends C12286f {

    /* renamed from: b */
    private static final C12741m f33225b = new C12741m();

    /* renamed from: io.reactivex.internal.schedulers.m$a */
    static final class C12742a implements Runnable {

        /* renamed from: e */
        private final Runnable f33226e;

        /* renamed from: f */
        private final C12744c f33227f;

        /* renamed from: g */
        private final long f33228g;

        C12742a(Runnable runnable, C12744c cVar, long j) {
            this.f33226e = runnable;
            this.f33227f = cVar;
            this.f33228g = j;
        }

        public void run() {
            if (!this.f33227f.f33236h) {
                long a = this.f33227f.mo36524a(TimeUnit.MILLISECONDS);
                long j = this.f33228g;
                if (j > a) {
                    try {
                        Thread.sleep(j - a);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        C12768a.m33415b((Throwable) e);
                        return;
                    }
                }
                if (!this.f33227f.f33236h) {
                    this.f33226e.run();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.m$b */
    static final class C12743b implements Comparable<C12743b> {

        /* renamed from: e */
        final Runnable f33229e;

        /* renamed from: f */
        final long f33230f;

        /* renamed from: g */
        final int f33231g;

        /* renamed from: h */
        volatile boolean f33232h;

        C12743b(Runnable runnable, Long l, int i) {
            this.f33229e = runnable;
            this.f33230f = l.longValue();
            this.f33231g = i;
        }

        /* renamed from: a */
        public int compareTo(C12743b bVar) {
            int a = C12324b.m32834a(this.f33230f, bVar.f33230f);
            return a == 0 ? C12324b.m32832a(this.f33231g, bVar.f33231g) : a;
        }
    }

    /* renamed from: io.reactivex.internal.schedulers.m$c */
    static final class C12744c extends C12289c implements Disposable {

        /* renamed from: e */
        final PriorityBlockingQueue<C12743b> f33233e = new PriorityBlockingQueue<>();

        /* renamed from: f */
        private final AtomicInteger f33234f = new AtomicInteger();

        /* renamed from: g */
        final AtomicInteger f33235g = new AtomicInteger();

        /* renamed from: h */
        volatile boolean f33236h;

        /* renamed from: io.reactivex.internal.schedulers.m$c$a */
        final class C12745a implements Runnable {

            /* renamed from: e */
            final C12743b f33237e;

            C12745a(C12743b bVar) {
                this.f33237e = bVar;
            }

            public void run() {
                C12743b bVar = this.f33237e;
                bVar.f33232h = true;
                C12744c.this.f33233e.remove(bVar);
            }
        }

        C12744c() {
        }

        /* renamed from: a */
        public Disposable mo6574a(Runnable runnable) {
            return mo36900a(runnable, mo36524a(TimeUnit.MILLISECONDS));
        }

        public void dispose() {
            this.f33236h = true;
        }

        public boolean isDisposed() {
            return this.f33236h;
        }

        /* renamed from: a */
        public Disposable mo6576a(Runnable runnable, long j, TimeUnit timeUnit) {
            long a = mo36524a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return mo36900a(new C12742a(runnable, this, a), a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Disposable mo36900a(Runnable runnable, long j) {
            if (this.f33236h) {
                return C12459c.INSTANCE;
            }
            C12743b bVar = new C12743b(runnable, Long.valueOf(j), this.f33235g.incrementAndGet());
            this.f33233e.add(bVar);
            if (this.f33234f.getAndIncrement() != 0) {
                return C12276c.m32594a((Runnable) new C12745a(bVar));
            }
            int i = 1;
            while (!this.f33236h) {
                C12743b bVar2 = (C12743b) this.f33233e.poll();
                if (bVar2 == null) {
                    i = this.f33234f.addAndGet(-i);
                    if (i == 0) {
                        return C12459c.INSTANCE;
                    }
                } else if (!bVar2.f33232h) {
                    bVar2.f33229e.run();
                }
            }
            this.f33233e.clear();
            return C12459c.INSTANCE;
        }
    }

    C12741m() {
    }

    /* renamed from: b */
    public static C12741m m33321b() {
        return f33225b;
    }

    /* renamed from: a */
    public C12289c mo6573a() {
        return new C12744c();
    }

    /* renamed from: a */
    public Disposable mo6570a(Runnable runnable) {
        C12768a.m33405a(runnable).run();
        return C12459c.INSTANCE;
    }

    /* renamed from: a */
    public Disposable mo6572a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            C12768a.m33405a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C12768a.m33415b((Throwable) e);
        }
        return C12459c.INSTANCE;
    }
}
