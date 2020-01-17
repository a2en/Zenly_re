package okhttp3.internal.http2;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import okhttp3.C13317r;
import okhttp3.p418f0.C13184e;
import okio.BufferedSource;
import okio.C13337a;
import okio.C13342c;
import okio.C13368t;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.http2.h */
public final class C13281h {

    /* renamed from: a */
    long f34271a = 0;

    /* renamed from: b */
    long f34272b;

    /* renamed from: c */
    final int f34273c;

    /* renamed from: d */
    final C13262e f34274d;

    /* renamed from: e */
    private final Deque<C13317r> f34275e = new ArrayDeque();

    /* renamed from: f */
    private boolean f34276f;

    /* renamed from: g */
    private final C13283b f34277g;

    /* renamed from: h */
    final C13282a f34278h;

    /* renamed from: i */
    final C13284c f34279i = new C13284c();

    /* renamed from: j */
    final C13284c f34280j = new C13284c();

    /* renamed from: k */
    C13256a f34281k;

    /* renamed from: l */
    IOException f34282l;

    /* renamed from: okhttp3.internal.http2.h$a */
    final class C13282a implements Sink {

        /* renamed from: e */
        private final C13342c f34283e = new C13342c();

        /* renamed from: f */
        private C13317r f34284f;

        /* renamed from: g */
        boolean f34285g;

        /* renamed from: h */
        boolean f34286h;

        C13282a() {
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        private void m34954a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (C13281h.this) {
                C13281h.this.f34280j.mo38477g();
                while (C13281h.this.f34272b <= 0 && !this.f34286h && !this.f34285g && C13281h.this.f34281k == null) {
                    try {
                        C13281h.this.mo38146k();
                    } catch (Throwable th) {
                        C13281h.this.f34280j.mo38150k();
                        throw th;
                    }
                }
                C13281h.this.f34280j.mo38150k();
                C13281h.this.mo38136b();
                min = Math.min(C13281h.this.f34272b, this.f34283e.mo38488b());
                C13281h.this.f34272b -= min;
            }
            C13281h.this.f34280j.mo38477g();
            if (z) {
                try {
                    if (min == this.f34283e.mo38488b()) {
                        z2 = true;
                        C13281h.this.f34274d.mo38098a(C13281h.this.f34273c, z2, this.f34283e, min);
                        C13281h.this.f34280j.mo38150k();
                    }
                } catch (Throwable th2) {
                    C13281h.this.f34280j.mo38150k();
                    throw th2;
                }
            }
            z2 = false;
            C13281h.this.f34274d.mo38098a(C13281h.this.f34273c, z2, this.f34283e, min);
            C13281h.this.f34280j.mo38150k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.f34283e.mo38488b() <= 0) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r8.f34284f == null) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            if (r3 == false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
            if (r8.f34283e.mo38488b() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
            m34954a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
            r0 = r8.f34287i;
            r0.f34274d.mo38097a(r0.f34273c, true, okhttp3.p418f0.C13184e.m34497a(r8.f34284f));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
            if (r2 == false) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            if (r8.f34283e.mo38488b() <= 0) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            m34954a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
            r0 = r8.f34287i;
            r0.f34274d.mo38098a(r0.f34273c, true, (okio.C13342c) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            r2 = r8.f34287i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r8.f34285g = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
            r8.f34287i.f34274d.flush();
            r8.f34287i.mo38130a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f34287i.f34278h.f34286h != false) goto L_0x0067;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C13281h.this
                monitor-enter(r0)
                boolean r1 = r8.f34285g     // Catch:{ all -> 0x007d }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C13281h.this
                okhttp3.internal.http2.h$a r0 = r0.f34278h
                boolean r0 = r0.f34286h
                r1 = 1
                if (r0 != 0) goto L_0x0067
                okio.c r0 = r8.f34283e
                long r2 = r0.mo38488b()
                r0 = 0
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0022
                r2 = 1
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                okhttp3.r r3 = r8.f34284f
                if (r3 == 0) goto L_0x0029
                r3 = 1
                goto L_0x002a
            L_0x0029:
                r3 = 0
            L_0x002a:
                if (r3 == 0) goto L_0x004a
            L_0x002c:
                okio.c r2 = r8.f34283e
                long r2 = r2.mo38488b()
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x003a
                r8.m34954a(r0)
                goto L_0x002c
            L_0x003a:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C13281h.this
                okhttp3.internal.http2.e r2 = r0.f34274d
                int r0 = r0.f34273c
                okhttp3.r r3 = r8.f34284f
                java.util.List r3 = okhttp3.p418f0.C13184e.m34497a(r3)
                r2.mo38097a(r0, r1, r3)
                goto L_0x0067
            L_0x004a:
                if (r2 == 0) goto L_0x005a
            L_0x004c:
                okio.c r0 = r8.f34283e
                long r2 = r0.mo38488b()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0067
                r8.m34954a(r1)
                goto L_0x004c
            L_0x005a:
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C13281h.this
                okhttp3.internal.http2.e r2 = r0.f34274d
                int r3 = r0.f34273c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo38098a(r3, r4, r5, r6)
            L_0x0067:
                okhttp3.internal.http2.h r2 = okhttp3.internal.http2.C13281h.this
                monitor-enter(r2)
                r8.f34285g = r1     // Catch:{ all -> 0x007a }
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C13281h.this
                okhttp3.internal.http2.e r0 = r0.f34274d
                r0.flush()
                okhttp3.internal.http2.h r0 = okhttp3.internal.http2.C13281h.this
                r0.mo38130a()
                return
            L_0x007a:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x007a }
                throw r0
            L_0x007d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007d }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C13281h.C13282a.close():void");
        }

        public void flush() throws IOException {
            synchronized (C13281h.this) {
                C13281h.this.mo38136b();
            }
            while (this.f34283e.mo38488b() > 0) {
                m34954a(false);
                C13281h.this.f34274d.flush();
            }
        }

        public C13368t timeout() {
            return C13281h.this.f34280j;
        }

        public void write(C13342c cVar, long j) throws IOException {
            this.f34283e.write(cVar, j);
            while (this.f34283e.mo38488b() >= 16384) {
                m34954a(false);
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.h$b */
    private final class C13283b implements Source {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C13342c f34288e = new C13342c();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C13342c f34289f = new C13342c();

        /* renamed from: g */
        private final long f34290g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C13317r f34291h;

        /* renamed from: i */
        boolean f34292i;

        /* renamed from: j */
        boolean f34293j;

        C13283b(long j) {
            this.f34290g = j;
        }

        public void close() throws IOException {
            long b;
            synchronized (C13281h.this) {
                this.f34292i = true;
                b = this.f34289f.mo38488b();
                this.f34289f.clear();
                C13281h.this.notifyAll();
            }
            if (b > 0) {
                m34957a(b);
            }
            C13281h.this.mo38130a();
        }

        public long read(C13342c cVar, long j) throws IOException {
            Throwable th;
            long read;
            if (j >= 0) {
                while (true) {
                    th = null;
                    synchronized (C13281h.this) {
                        C13281h.this.f34279i.mo38477g();
                        try {
                            if (C13281h.this.f34281k != null) {
                                if (C13281h.this.f34282l != null) {
                                    th = C13281h.this.f34282l;
                                } else {
                                    th = new StreamResetException(C13281h.this.f34281k);
                                }
                            }
                            if (this.f34292i) {
                                throw new IOException("stream closed");
                            } else if (this.f34289f.mo38488b() > 0) {
                                read = this.f34289f.read(cVar, Math.min(j, this.f34289f.mo38488b()));
                                C13281h.this.f34271a += read;
                                if (th == null && C13281h.this.f34271a >= ((long) (C13281h.this.f34274d.f34204r.mo38175c() / 2))) {
                                    C13281h.this.f34274d.mo38092a(C13281h.this.f34273c, C13281h.this.f34271a);
                                    C13281h.this.f34271a = 0;
                                }
                            } else if (this.f34293j || th != null) {
                                read = -1;
                            } else {
                                C13281h.this.mo38146k();
                            }
                        } finally {
                            C13281h.this.f34279i.mo38150k();
                        }
                    }
                }
                read = -1;
                C13281h.this.f34279i.mo38150k();
                if (read != -1) {
                    m34957a(read);
                    return read;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public C13368t timeout() {
            return C13281h.this.f34279i;
        }

        /* renamed from: a */
        private void m34957a(long j) {
            C13281h.this.f34274d.mo38099a(j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38148a(BufferedSource bufferedSource, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C13281h.this) {
                    z = this.f34293j;
                    z2 = true;
                    z3 = this.f34289f.mo38488b() + j > this.f34290g;
                }
                if (z3) {
                    bufferedSource.skip(j);
                    C13281h.this.mo38132a(C13256a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    bufferedSource.skip(j);
                    return;
                } else {
                    long read = bufferedSource.read(this.f34288e, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (C13281h.this) {
                            if (this.f34289f.mo38488b() != 0) {
                                z2 = false;
                            }
                            this.f34289f.writeAll(this.f34288e);
                            if (z2) {
                                C13281h.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.h$c */
    class C13284c extends C13337a {
        C13284c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public IOException mo38149b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo38069i() {
            C13281h.this.mo38132a(C13256a.CANCEL);
        }

        /* renamed from: k */
        public void mo38150k() throws IOException {
            if (mo38478h()) {
                throw mo38149b(null);
            }
        }
    }

    C13281h(int i, C13262e eVar, boolean z, boolean z2, C13317r rVar) {
        if (eVar != null) {
            this.f34273c = i;
            this.f34274d = eVar;
            this.f34272b = (long) eVar.f34205s.mo38175c();
            this.f34277g = new C13283b((long) eVar.f34204r.mo38175c());
            this.f34278h = new C13282a();
            this.f34277g.f34293j = z2;
            this.f34278h.f34286h = z;
            if (rVar != null) {
                this.f34275e.add(rVar);
            }
            if (mo38141f() && rVar != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!mo38141f() && rVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    /* renamed from: b */
    private boolean m34935b(C13256a aVar, IOException iOException) {
        synchronized (this) {
            if (this.f34281k != null) {
                return false;
            }
            if (this.f34277g.f34293j && this.f34278h.f34286h) {
                return false;
            }
            this.f34281k = aVar;
            this.f34282l = iOException;
            notifyAll();
            this.f34274d.mo38108c(this.f34273c);
            return true;
        }
    }

    /* renamed from: a */
    public void mo38133a(C13256a aVar, IOException iOException) throws IOException {
        if (m34935b(aVar, iOException)) {
            this.f34274d.mo38106b(this.f34273c, aVar);
        }
    }

    /* renamed from: c */
    public int mo38138c() {
        return this.f34273c;
    }

    /* renamed from: d */
    public Sink mo38139d() {
        synchronized (this) {
            if (!this.f34276f) {
                if (!mo38141f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f34278h;
    }

    /* renamed from: e */
    public Source mo38140e() {
        return this.f34277g;
    }

    /* renamed from: f */
    public boolean mo38141f() {
        if (this.f34274d.f34191e == ((this.f34273c & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public synchronized boolean mo38142g() {
        if (this.f34281k != null) {
            return false;
        }
        if ((this.f34277g.f34293j || this.f34277g.f34292i) && ((this.f34278h.f34286h || this.f34278h.f34285g) && this.f34276f)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public C13368t mo38143h() {
        return this.f34279i;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public synchronized C13317r mo38144i() throws IOException {
        this.f34279i.mo38477g();
        while (this.f34275e.isEmpty() && this.f34281k == null) {
            try {
                mo38146k();
            } catch (Throwable th) {
                this.f34279i.mo38150k();
                throw th;
            }
        }
        this.f34279i.mo38150k();
        if (this.f34275e.isEmpty()) {
            throw (this.f34282l != null ? this.f34282l : new StreamResetException(this.f34281k));
        }
        return (C13317r) this.f34275e.removeFirst();
    }

    /* renamed from: j */
    public synchronized C13317r mo38145j() throws IOException {
        if (this.f34281k != null) {
            throw (this.f34282l != null ? this.f34282l : new StreamResetException(this.f34281k));
        } else if (!this.f34277g.f34293j || !this.f34277g.f34288e.exhausted() || !this.f34277g.f34289f.exhausted()) {
            throw new IllegalStateException("too early; can't read the trailers yet");
        }
        return this.f34277g.f34291h != null ? this.f34277g.f34291h : C13184e.f33857c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo38146k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: l */
    public C13368t mo38147l() {
        return this.f34280j;
    }

    /* renamed from: a */
    public void mo38132a(C13256a aVar) {
        if (m34935b(aVar, null)) {
            this.f34274d.mo38110c(this.f34273c, aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38135a(BufferedSource bufferedSource, int i) throws IOException {
        this.f34277g.mo38148a(bufferedSource, (long) i);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38134a(okhttp3.C13317r r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f34276f     // Catch:{ all -> 0x002e }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            if (r4 != 0) goto L_0x0009
            goto L_0x000f
        L_0x0009:
            okhttp3.internal.http2.h$b r0 = r2.f34277g     // Catch:{ all -> 0x002e }
            r0.f34291h = r3     // Catch:{ all -> 0x002e }
            goto L_0x0016
        L_0x000f:
            r2.f34276f = r1     // Catch:{ all -> 0x002e }
            java.util.Deque<okhttp3.r> r0 = r2.f34275e     // Catch:{ all -> 0x002e }
            r0.add(r3)     // Catch:{ all -> 0x002e }
        L_0x0016:
            if (r4 == 0) goto L_0x001c
            okhttp3.internal.http2.h$b r3 = r2.f34277g     // Catch:{ all -> 0x002e }
            r3.f34293j = r1     // Catch:{ all -> 0x002e }
        L_0x001c:
            boolean r3 = r2.mo38142g()     // Catch:{ all -> 0x002e }
            r2.notifyAll()     // Catch:{ all -> 0x002e }
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            if (r3 != 0) goto L_0x002d
            okhttp3.internal.http2.e r3 = r2.f34274d
            int r4 = r2.f34273c
            r3.mo38108c(r4)
        L_0x002d:
            return
        L_0x002e:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C13281h.mo38134a(okhttp3.r, boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized void mo38137b(C13256a aVar) {
        if (this.f34281k == null) {
            this.f34281k = aVar;
            notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38136b() throws IOException {
        C13282a aVar = this.f34278h;
        if (aVar.f34285g) {
            throw new IOException("stream closed");
        } else if (!aVar.f34286h) {
            C13256a aVar2 = this.f34281k;
            if (aVar2 != null) {
                Throwable th = this.f34282l;
                if (th == null) {
                    th = new StreamResetException(aVar2);
                }
                throw th;
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38130a() throws IOException {
        boolean z;
        boolean g;
        synchronized (this) {
            z = !this.f34277g.f34293j && this.f34277g.f34292i && (this.f34278h.f34286h || this.f34278h.f34285g);
            g = mo38142g();
        }
        if (z) {
            mo38133a(C13256a.CANCEL, (IOException) null);
        } else if (!g) {
            this.f34274d.mo38108c(this.f34273c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38131a(long j) {
        this.f34272b += j;
        if (j > 0) {
            notifyAll();
        }
    }
}
