package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.connection.C13241j;
import okhttp3.p418f0.C13183d;
import okio.C13368t;

/* renamed from: okhttp3.x */
final class C13329x implements Call {

    /* renamed from: e */
    final C13325v f34566e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C13241j f34567f;

    /* renamed from: g */
    final C13331y f34568g;

    /* renamed from: h */
    final boolean f34569h;

    /* renamed from: i */
    private boolean f34570i;

    /* renamed from: okhttp3.x$a */
    final class C13330a extends C13183d {

        /* renamed from: f */
        private final Callback f34571f;

        /* renamed from: g */
        private volatile AtomicInteger f34572g = new AtomicInteger(0);

        static {
            Class<C13329x> cls = C13329x.class;
        }

        C13330a(Callback callback) {
            super("OkHttp %s", C13329x.this.mo38374b());
            this.f34571f = callback;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38377a(C13330a aVar) {
            this.f34572g = aVar.f34572g;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[SYNTHETIC, Splitter:B:12:0x002d] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004d A[Catch:{ all -> 0x0026 }] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo37873b() {
            /*
                r5 = this;
                okhttp3.x r0 = okhttp3.C13329x.this
                okhttp3.internal.connection.j r0 = r0.f34567f
                r0.mo38068j()
                r0 = 0
                okhttp3.x r1 = okhttp3.C13329x.this     // Catch:{ IOException -> 0x0028 }
                okhttp3.a0 r0 = r1.mo38373a()     // Catch:{ IOException -> 0x0028 }
                r1 = 1
                okhttp3.Callback r2 = r5.f34571f     // Catch:{ IOException -> 0x0024 }
                okhttp3.x r3 = okhttp3.C13329x.this     // Catch:{ IOException -> 0x0024 }
                r2.onResponse(r3, r0)     // Catch:{ IOException -> 0x0024 }
            L_0x0018:
                okhttp3.x r0 = okhttp3.C13329x.this
                okhttp3.v r0 = r0.f34566e
                okhttp3.n r0 = r0.mo38338i()
                r0.mo38248b(r5)
                goto L_0x0055
            L_0x0024:
                r0 = move-exception
                goto L_0x002b
            L_0x0026:
                r0 = move-exception
                goto L_0x0056
            L_0x0028:
                r1 = move-exception
                r0 = r1
                r1 = 0
            L_0x002b:
                if (r1 == 0) goto L_0x004d
                okhttp3.f0.h.e r1 = okhttp3.p418f0.p420h.C13202e.m34581d()     // Catch:{ all -> 0x0026 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
                r3.<init>()     // Catch:{ all -> 0x0026 }
                java.lang.String r4 = "Callback failure for "
                r3.append(r4)     // Catch:{ all -> 0x0026 }
                okhttp3.x r4 = okhttp3.C13329x.this     // Catch:{ all -> 0x0026 }
                java.lang.String r4 = r4.mo38375c()     // Catch:{ all -> 0x0026 }
                r3.append(r4)     // Catch:{ all -> 0x0026 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0026 }
                r1.mo37897a(r2, r3, r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0018
            L_0x004d:
                okhttp3.Callback r1 = r5.f34571f     // Catch:{ all -> 0x0026 }
                okhttp3.x r2 = okhttp3.C13329x.this     // Catch:{ all -> 0x0026 }
                r1.onFailure(r2, r0)     // Catch:{ all -> 0x0026 }
                goto L_0x0018
            L_0x0055:
                return
            L_0x0056:
                okhttp3.x r1 = okhttp3.C13329x.this
                okhttp3.v r1 = r1.f34566e
                okhttp3.n r1 = r1.mo38338i()
                r1.mo38248b(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13329x.C13330a.mo37873b():void");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public AtomicInteger mo38378c() {
            return this.f34572g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C13329x mo38379d() {
            return C13329x.this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public String mo38380e() {
            return C13329x.this.f34568g.mo38389g().mo38288g();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38376a(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                C13329x.this.f34567f.mo38054a((IOException) interruptedIOException);
                this.f34571f.onFailure(C13329x.this, interruptedIOException);
                C13329x.this.f34566e.mo38338i().mo38248b(this);
            } catch (Throwable th) {
                C13329x.this.f34566e.mo38338i().mo38248b(this);
                throw th;
            }
        }
    }

    private C13329x(C13325v vVar, C13331y yVar, boolean z) {
        this.f34566e = vVar;
        this.f34568g = yVar;
        this.f34569h = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo38374b() {
        return this.f34568g.mo38389g().mo38296n();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo38375c() {
        StringBuilder sb = new StringBuilder();
        sb.append(isCanceled() ? "canceled " : "");
        sb.append(this.f34569h ? "web socket" : "call");
        sb.append(" to ");
        sb.append(mo38374b());
        return sb.toString();
    }

    public void cancel() {
        this.f34567f.mo38061c();
    }

    public void enqueue(Callback callback) {
        synchronized (this) {
            if (!this.f34570i) {
                this.f34570i = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f34567f.mo38057a();
        this.f34566e.mo38338i().mo38245a(new C13330a(callback));
    }

    public C13167a0 execute() throws IOException {
        synchronized (this) {
            if (!this.f34570i) {
                this.f34570i = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f34567f.mo38068j();
        this.f34567f.mo38057a();
        try {
            this.f34566e.mo38338i().mo38246a(this);
            return mo38373a();
        } finally {
            this.f34566e.mo38338i().mo38249b(this);
        }
    }

    public boolean isCanceled() {
        return this.f34567f.mo38064f();
    }

    public synchronized boolean isExecuted() {
        return this.f34570i;
    }

    public C13331y request() {
        return this.f34568g;
    }

    public C13368t timeout() {
        return this.f34567f.mo38066h();
    }

    /* renamed from: a */
    static C13329x m35248a(C13325v vVar, C13331y yVar, boolean z) {
        C13329x xVar = new C13329x(vVar, yVar, z);
        xVar.f34567f = new C13241j(vVar, xVar);
        return xVar;
    }

    public C13329x clone() {
        return m35248a(this.f34566e, this.f34568g, this.f34569h);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.C13167a0 mo38373a() throws java.io.IOException {
        /*
            r11 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            okhttp3.v r0 = r11.f34566e
            java.util.List r0 = r0.mo38344o()
            r1.addAll(r0)
            okhttp3.internal.http.i r0 = new okhttp3.internal.http.i
            okhttp3.v r2 = r11.f34566e
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.http.a r0 = new okhttp3.internal.http.a
            okhttp3.v r2 = r11.f34566e
            okhttp3.CookieJar r2 = r2.mo38337h()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.cache.a r0 = new okhttp3.internal.cache.a
            okhttp3.v r2 = r11.f34566e
            okhttp3.internal.cache.InternalCache r2 = r2.mo38345p()
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.connection.b r0 = new okhttp3.internal.connection.b
            okhttp3.v r2 = r11.f34566e
            r0.<init>(r2)
            r1.add(r0)
            boolean r0 = r11.f34569h
            if (r0 != 0) goto L_0x004b
            okhttp3.v r0 = r11.f34566e
            java.util.List r0 = r0.mo38346q()
            r1.addAll(r0)
        L_0x004b:
            okhttp3.internal.http.b r0 = new okhttp3.internal.http.b
            boolean r2 = r11.f34569h
            r0.<init>(r2)
            r1.add(r0)
            okhttp3.internal.http.f r10 = new okhttp3.internal.http.f
            okhttp3.internal.connection.j r2 = r11.f34567f
            r3 = 0
            r4 = 0
            okhttp3.y r5 = r11.f34568g
            okhttp3.v r0 = r11.f34566e
            int r7 = r0.mo38334e()
            okhttp3.v r0 = r11.f34566e
            int r8 = r0.mo38353x()
            okhttp3.v r0 = r11.f34566e
            int r9 = r0.mo38329B()
            r0 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r1 = 0
            okhttp3.y r2 = r11.f34568g     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            okhttp3.a0 r2 = r10.proceed(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            okhttp3.internal.connection.j r3 = r11.f34567f     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            boolean r3 = r3.mo38064f()     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            if (r3 != 0) goto L_0x008a
            okhttp3.internal.connection.j r0 = r11.f34567f
            r0.mo38054a(r1)
            return r2
        L_0x008a:
            okhttp3.p418f0.C13184e.m34503a(r2)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
            throw r2     // Catch:{ IOException -> 0x0097, all -> 0x0095 }
        L_0x0095:
            r2 = move-exception
            goto L_0x00a3
        L_0x0097:
            r0 = move-exception
            r2 = 1
            okhttp3.internal.connection.j r3 = r11.f34567f     // Catch:{ all -> 0x00a0 }
            java.io.IOException r0 = r3.mo38054a(r0)     // Catch:{ all -> 0x00a0 }
            throw r0     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            r2 = r0
            r0 = 1
        L_0x00a3:
            if (r0 != 0) goto L_0x00aa
            okhttp3.internal.connection.j r0 = r11.f34567f
            r0.mo38054a(r1)
        L_0x00aa:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C13329x.mo38373a():okhttp3.a0");
    }
}
