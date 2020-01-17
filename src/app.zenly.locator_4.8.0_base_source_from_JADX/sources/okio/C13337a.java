package okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: okio.a */
public class C13337a extends C13368t {

    /* renamed from: h */
    private static final long f34593h = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: i */
    private static final long f34594i = TimeUnit.MILLISECONDS.toNanos(f34593h);

    /* renamed from: j */
    static C13337a f34595j;

    /* renamed from: e */
    private boolean f34596e;

    /* renamed from: f */
    private C13337a f34597f;

    /* renamed from: g */
    private long f34598g;

    /* renamed from: okio.a$a */
    class C13338a implements Sink {

        /* renamed from: e */
        final /* synthetic */ Sink f34599e;

        C13338a(Sink sink) {
            this.f34599e = sink;
        }

        public void close() throws IOException {
            C13337a.this.mo38477g();
            try {
                this.f34599e.close();
                C13337a.this.mo38476a(true);
            } catch (IOException e) {
                throw C13337a.this.mo38473a(e);
            } catch (Throwable th) {
                C13337a.this.mo38476a(false);
                throw th;
            }
        }

        public void flush() throws IOException {
            C13337a.this.mo38477g();
            try {
                this.f34599e.flush();
                C13337a.this.mo38476a(true);
            } catch (IOException e) {
                throw C13337a.this.mo38473a(e);
            } catch (Throwable th) {
                C13337a.this.mo38476a(false);
                throw th;
            }
        }

        public C13368t timeout() {
            return C13337a.this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.sink(");
            sb.append(this.f34599e);
            sb.append(")");
            return sb.toString();
        }

        public void write(C13342c cVar, long j) throws IOException {
            C13370u.m35433a(cVar.f34606f, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C13365q qVar = cVar.f34605e;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (qVar.f34665c - qVar.f34664b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        qVar = qVar.f34668f;
                    }
                    C13337a.this.mo38477g();
                    try {
                        this.f34599e.write(cVar, j2);
                        j -= j2;
                        C13337a.this.mo38476a(true);
                    } catch (IOException e) {
                        throw C13337a.this.mo38473a(e);
                    } catch (Throwable th) {
                        C13337a.this.mo38476a(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: okio.a$b */
    class C13339b implements Source {

        /* renamed from: e */
        final /* synthetic */ Source f34601e;

        C13339b(Source source) {
            this.f34601e = source;
        }

        public void close() throws IOException {
            C13337a.this.mo38477g();
            try {
                this.f34601e.close();
                C13337a.this.mo38476a(true);
            } catch (IOException e) {
                throw C13337a.this.mo38473a(e);
            } catch (Throwable th) {
                C13337a.this.mo38476a(false);
                throw th;
            }
        }

        public long read(C13342c cVar, long j) throws IOException {
            C13337a.this.mo38477g();
            try {
                long read = this.f34601e.read(cVar, j);
                C13337a.this.mo38476a(true);
                return read;
            } catch (IOException e) {
                throw C13337a.this.mo38473a(e);
            } catch (Throwable th) {
                C13337a.this.mo38476a(false);
                throw th;
            }
        }

        public C13368t timeout() {
            return C13337a.this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.source(");
            sb.append(this.f34601e);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: okio.a$c */
    private static final class C13340c extends Thread {
        C13340c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo38069i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<okio.a> r0 = okio.C13337a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                okio.a r1 = okio.C13337a.m35302j()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                okio.a r2 = okio.C13337a.f34595j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                okio.C13337a.f34595j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo38069i()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: okio.C13337a.C13340c.run():void");
        }
    }

    /* renamed from: a */
    private static synchronized void m35299a(C13337a aVar, long j, boolean z) {
        Class<C13337a> cls = C13337a.class;
        synchronized (cls) {
            if (f34595j == null) {
                f34595j = new C13337a();
                new C13340c().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i != 0 && z) {
                aVar.f34598g = Math.min(j, aVar.mo38544c() - nanoTime) + nanoTime;
            } else if (i != 0) {
                aVar.f34598g = j + nanoTime;
            } else if (z) {
                aVar.f34598g = aVar.mo38544c();
            } else {
                throw new AssertionError();
            }
            long b = aVar.m35301b(nanoTime);
            C13337a aVar2 = f34595j;
            while (true) {
                if (aVar2.f34597f == null) {
                    break;
                } else if (b < aVar2.f34597f.m35301b(nanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f34597f;
                }
            }
            aVar.f34597f = aVar2.f34597f;
            aVar2.f34597f = aVar;
            if (aVar2 == f34595j) {
                cls.notify();
            }
        }
    }

    /* renamed from: b */
    private long m35301b(long j) {
        return this.f34598g - j;
    }

    /* renamed from: j */
    static C13337a m35302j() throws InterruptedException {
        Class<C13337a> cls = C13337a.class;
        C13337a aVar = f34595j.f34597f;
        C13337a aVar2 = null;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f34593h);
            if (f34595j.f34597f == null && System.nanoTime() - nanoTime >= f34594i) {
                aVar2 = f34595j;
            }
            return aVar2;
        }
        long b = aVar.m35301b(System.nanoTime());
        if (b > 0) {
            long j = b / 1000000;
            cls.wait(j, (int) (b - (1000000 * j)));
            return null;
        }
        f34595j.f34597f = aVar.f34597f;
        aVar.f34597f = null;
        return aVar;
    }

    /* renamed from: g */
    public final void mo38477g() {
        if (!this.f34596e) {
            long f = mo38547f();
            boolean d = mo38545d();
            if (f != 0 || d) {
                this.f34596e = true;
                m35299a(this, f, d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* renamed from: h */
    public final boolean mo38478h() {
        if (!this.f34596e) {
            return false;
        }
        this.f34596e = false;
        return m35300a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo38069i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IOException mo38149b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    private static synchronized boolean m35300a(C13337a aVar) {
        synchronized (C13337a.class) {
            for (C13337a aVar2 = f34595j; aVar2 != null; aVar2 = aVar2.f34597f) {
                if (aVar2.f34597f == aVar) {
                    aVar2.f34597f = aVar.f34597f;
                    aVar.f34597f = null;
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public final Sink mo38474a(Sink sink) {
        return new C13338a(sink);
    }

    /* renamed from: a */
    public final Source mo38475a(Source source) {
        return new C13339b(source);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38476a(boolean z) throws IOException {
        if (mo38478h() && z) {
            throw mo38149b((IOException) null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final IOException mo38473a(IOException iOException) throws IOException {
        if (!mo38478h()) {
            return iOException;
        }
        return mo38149b(iOException);
    }
}
