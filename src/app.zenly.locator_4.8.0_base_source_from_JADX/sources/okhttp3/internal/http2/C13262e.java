package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.p418f0.C13183d;
import okhttp3.p418f0.C13184e;
import okhttp3.p418f0.p420h.C13202e;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13346d;

/* renamed from: okhttp3.internal.http2.e */
public final class C13262e implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final ExecutorService f34190y;

    /* renamed from: e */
    final boolean f34191e;

    /* renamed from: f */
    final C13270h f34192f;

    /* renamed from: g */
    final Map<Integer, C13281h> f34193g = new LinkedHashMap();

    /* renamed from: h */
    final String f34194h;

    /* renamed from: i */
    int f34195i;

    /* renamed from: j */
    int f34196j;

    /* renamed from: k */
    boolean f34197k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final ScheduledExecutorService f34198l;

    /* renamed from: m */
    private final ExecutorService f34199m;

    /* renamed from: n */
    final PushObserver f34200n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f34201o;

    /* renamed from: p */
    long f34202p = 0;

    /* renamed from: q */
    long f34203q;

    /* renamed from: r */
    C13288k f34204r = new C13288k();

    /* renamed from: s */
    final C13288k f34205s = new C13288k();

    /* renamed from: t */
    boolean f34206t = false;

    /* renamed from: u */
    final Socket f34207u;

    /* renamed from: v */
    final C13285i f34208v;

    /* renamed from: w */
    final C13273j f34209w;

    /* renamed from: x */
    final Set<Integer> f34210x = new LinkedHashSet();

    /* renamed from: okhttp3.internal.http2.e$a */
    class C13263a extends C13183d {

        /* renamed from: f */
        final /* synthetic */ int f34211f;

        /* renamed from: g */
        final /* synthetic */ C13256a f34212g;

        C13263a(String str, Object[] objArr, int i, C13256a aVar) {
            this.f34211f = i;
            this.f34212g = aVar;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo37873b() {
            try {
                C13262e.this.mo38106b(this.f34211f, this.f34212g);
            } catch (IOException e) {
                C13262e.this.m34851a(e);
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.e$b */
    class C13264b extends C13183d {

        /* renamed from: f */
        final /* synthetic */ int f34214f;

        /* renamed from: g */
        final /* synthetic */ long f34215g;

        C13264b(String str, Object[] objArr, int i, long j) {
            this.f34214f = i;
            this.f34215g = j;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo37873b() {
            try {
                C13262e.this.f34208v.mo38155a(this.f34214f, this.f34215g);
            } catch (IOException e) {
                C13262e.this.m34851a(e);
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.e$c */
    class C13265c extends C13183d {

        /* renamed from: f */
        final /* synthetic */ int f34217f;

        /* renamed from: g */
        final /* synthetic */ List f34218g;

        C13265c(String str, Object[] objArr, int i, List list) {
            this.f34217f = i;
            this.f34218g = list;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo37873b() {
            if (C13262e.this.f34200n.onRequest(this.f34217f, this.f34218g)) {
                try {
                    C13262e.this.f34208v.mo38156a(this.f34217f, C13256a.CANCEL);
                    synchronized (C13262e.this) {
                        C13262e.this.f34210x.remove(Integer.valueOf(this.f34217f));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.e$d */
    class C13266d extends C13183d {

        /* renamed from: f */
        final /* synthetic */ int f34220f;

        /* renamed from: g */
        final /* synthetic */ List f34221g;

        /* renamed from: h */
        final /* synthetic */ boolean f34222h;

        C13266d(String str, Object[] objArr, int i, List list, boolean z) {
            this.f34220f = i;
            this.f34221g = list;
            this.f34222h = z;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo37873b() {
            boolean onHeaders = C13262e.this.f34200n.onHeaders(this.f34220f, this.f34221g, this.f34222h);
            if (onHeaders) {
                try {
                    C13262e.this.f34208v.mo38156a(this.f34220f, C13256a.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (onHeaders || this.f34222h) {
                synchronized (C13262e.this) {
                    C13262e.this.f34210x.remove(Integer.valueOf(this.f34220f));
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.e$e */
    class C13267e extends C13183d {

        /* renamed from: f */
        final /* synthetic */ int f34224f;

        /* renamed from: g */
        final /* synthetic */ C13342c f34225g;

        /* renamed from: h */
        final /* synthetic */ int f34226h;

        /* renamed from: i */
        final /* synthetic */ boolean f34227i;

        C13267e(String str, Object[] objArr, int i, C13342c cVar, int i2, boolean z) {
            this.f34224f = i;
            this.f34225g = cVar;
            this.f34226h = i2;
            this.f34227i = z;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo37873b() {
            try {
                boolean onData = C13262e.this.f34200n.onData(this.f34224f, this.f34225g, this.f34226h, this.f34227i);
                if (onData) {
                    C13262e.this.f34208v.mo38156a(this.f34224f, C13256a.CANCEL);
                }
                if (onData || this.f34227i) {
                    synchronized (C13262e.this) {
                        C13262e.this.f34210x.remove(Integer.valueOf(this.f34224f));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.e$f */
    class C13268f extends C13183d {

        /* renamed from: f */
        final /* synthetic */ int f34229f;

        /* renamed from: g */
        final /* synthetic */ C13256a f34230g;

        C13268f(String str, Object[] objArr, int i, C13256a aVar) {
            this.f34229f = i;
            this.f34230g = aVar;
            super(str, objArr);
        }

        /* renamed from: b */
        public void mo37873b() {
            C13262e.this.f34200n.onReset(this.f34229f, this.f34230g);
            synchronized (C13262e.this) {
                C13262e.this.f34210x.remove(Integer.valueOf(this.f34229f));
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.e$g */
    public static class C13269g {

        /* renamed from: a */
        Socket f34232a;

        /* renamed from: b */
        String f34233b;

        /* renamed from: c */
        BufferedSource f34234c;

        /* renamed from: d */
        BufferedSink f34235d;

        /* renamed from: e */
        C13270h f34236e = C13270h.f34240a;

        /* renamed from: f */
        PushObserver f34237f = PushObserver.f34143a;

        /* renamed from: g */
        boolean f34238g;

        /* renamed from: h */
        int f34239h;

        public C13269g(boolean z) {
            this.f34238g = z;
        }

        /* renamed from: a */
        public C13269g mo38114a(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f34232a = socket;
            this.f34233b = str;
            this.f34234c = bufferedSource;
            this.f34235d = bufferedSink;
            return this;
        }

        /* renamed from: a */
        public C13269g mo38115a(C13270h hVar) {
            this.f34236e = hVar;
            return this;
        }

        /* renamed from: a */
        public C13269g mo38113a(int i) {
            this.f34239h = i;
            return this;
        }

        /* renamed from: a */
        public C13262e mo38116a() {
            return new C13262e(this);
        }
    }

    /* renamed from: okhttp3.internal.http2.e$h */
    public static abstract class C13270h {

        /* renamed from: a */
        public static final C13270h f34240a = new C13271a();

        /* renamed from: okhttp3.internal.http2.e$h$a */
        class C13271a extends C13270h {
            C13271a() {
            }

            /* renamed from: a */
            public void mo38032a(C13281h hVar) throws IOException {
                hVar.mo38133a(C13256a.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: a */
        public void mo38031a(C13262e eVar) {
        }

        /* renamed from: a */
        public abstract void mo38032a(C13281h hVar) throws IOException;
    }

    /* renamed from: okhttp3.internal.http2.e$i */
    final class C13272i extends C13183d {

        /* renamed from: f */
        final boolean f34241f;

        /* renamed from: g */
        final int f34242g;

        /* renamed from: h */
        final int f34243h;

        C13272i(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C13262e.this.f34194h, Integer.valueOf(i), Integer.valueOf(i2));
            this.f34241f = z;
            this.f34242g = i;
            this.f34243h = i2;
        }

        /* renamed from: b */
        public void mo37873b() {
            C13262e.this.mo38103a(this.f34241f, this.f34242g, this.f34243h);
        }
    }

    /* renamed from: okhttp3.internal.http2.e$j */
    class C13273j extends C13183d implements C13280b {

        /* renamed from: f */
        final C13278g f34245f;

        /* renamed from: okhttp3.internal.http2.e$j$a */
        class C13274a extends C13183d {

            /* renamed from: f */
            final /* synthetic */ C13281h f34247f;

            C13274a(String str, Object[] objArr, C13281h hVar) {
                this.f34247f = hVar;
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo37873b() {
                try {
                    C13262e.this.f34192f.mo38032a(this.f34247f);
                } catch (IOException e) {
                    C13202e d = C13202e.m34581d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Http2Connection.Listener failure for ");
                    sb.append(C13262e.this.f34194h);
                    d.mo37897a(4, sb.toString(), (Throwable) e);
                    try {
                        this.f34247f.mo38133a(C13256a.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: okhttp3.internal.http2.e$j$b */
        class C13275b extends C13183d {
            C13275b(String str, Object... objArr) {
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo37873b() {
                C13262e eVar = C13262e.this;
                eVar.f34192f.mo38031a(eVar);
            }
        }

        /* renamed from: okhttp3.internal.http2.e$j$c */
        class C13276c extends C13183d {

            /* renamed from: f */
            final /* synthetic */ C13288k f34250f;

            C13276c(String str, Object[] objArr, C13288k kVar) {
                this.f34250f = kVar;
                super(str, objArr);
            }

            /* renamed from: b */
            public void mo37873b() {
                try {
                    C13262e.this.f34208v.mo38158a(this.f34250f);
                } catch (IOException e) {
                    C13262e.this.m34851a(e);
                }
            }
        }

        C13273j(C13278g gVar) {
            super("OkHttp %s", C13262e.this.f34194h);
            this.f34245f = gVar;
        }

        /* renamed from: a */
        public void mo38117a() {
        }

        /* renamed from: a */
        public void mo38118a(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: a */
        public void mo38125a(boolean z, int i, BufferedSource bufferedSource, int i2) throws IOException {
            if (C13262e.this.mo38107b(i)) {
                C13262e.this.mo38096a(i, bufferedSource, i2, z);
                return;
            }
            C13281h a = C13262e.this.mo38090a(i);
            if (a == null) {
                C13262e.this.mo38110c(i, C13256a.PROTOCOL_ERROR);
                long j = (long) i2;
                C13262e.this.mo38099a(j);
                bufferedSource.skip(j);
                return;
            }
            a.mo38135a(bufferedSource, i2);
            if (z) {
                a.mo38134a(C13184e.f33857c, true);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo37873b() {
            C13256a aVar;
            C13256a aVar2;
            C13256a aVar3 = C13256a.INTERNAL_ERROR;
            e = null;
            try {
                this.f34245f.mo38127a((C13280b) this);
                while (this.f34245f.mo38128a(false, (C13280b) this)) {
                }
                aVar = C13256a.NO_ERROR;
                try {
                    aVar2 = C13256a.CANCEL;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                aVar = aVar3;
                try {
                    aVar = C13256a.PROTOCOL_ERROR;
                    aVar2 = C13256a.PROTOCOL_ERROR;
                    C13262e.this.mo38101a(aVar, aVar2, e);
                    C13184e.m34503a((Closeable) this.f34245f);
                } catch (Throwable th) {
                    th = th;
                    C13262e.this.mo38101a(aVar, aVar3, e);
                    C13184e.m34503a((Closeable) this.f34245f);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar3;
                C13262e.this.mo38101a(aVar, aVar3, e);
                C13184e.m34503a((Closeable) this.f34245f);
                throw th;
            }
            C13262e.this.mo38101a(aVar, aVar2, e);
            C13184e.m34503a((Closeable) this.f34245f);
        }

        /* renamed from: a */
        public void mo38124a(boolean z, int i, int i2, List<C13257b> list) {
            if (C13262e.this.mo38107b(i)) {
                C13262e.this.mo38094a(i, list, z);
                return;
            }
            synchronized (C13262e.this) {
                C13281h a = C13262e.this.mo38090a(i);
                if (a != null) {
                    a.mo38134a(C13184e.m34513b(list), z);
                } else if (!C13262e.this.f34197k) {
                    if (i > C13262e.this.f34195i) {
                        if (i % 2 != C13262e.this.f34196j % 2) {
                            int i3 = i;
                            C13281h hVar = new C13281h(i3, C13262e.this, false, z, C13184e.m34513b(list));
                            C13262e.this.f34195i = i;
                            C13262e.this.f34193g.put(Integer.valueOf(i), hVar);
                            C13262e.f34190y.execute(new C13274a("OkHttp %s stream %d", new Object[]{C13262e.this.f34194h, Integer.valueOf(i)}, hVar));
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo38121a(int i, C13256a aVar) {
            if (C13262e.this.mo38107b(i)) {
                C13262e.this.mo38095a(i, aVar);
                return;
            }
            C13281h c = C13262e.this.mo38108c(i);
            if (c != null) {
                c.mo38137b(aVar);
            }
        }

        /* renamed from: a */
        public void mo38126a(boolean z, C13288k kVar) {
            C13281h[] hVarArr;
            long j;
            int i;
            synchronized (C13262e.this) {
                int c = C13262e.this.f34205s.mo38175c();
                if (z) {
                    C13262e.this.f34205s.mo38171a();
                }
                C13262e.this.f34205s.mo38172a(kVar);
                m34892a(kVar);
                int c2 = C13262e.this.f34205s.mo38175c();
                hVarArr = null;
                if (c2 == -1 || c2 == c) {
                    j = 0;
                } else {
                    j = (long) (c2 - c);
                    if (!C13262e.this.f34206t) {
                        C13262e.this.f34206t = true;
                    }
                    if (!C13262e.this.f34193g.isEmpty()) {
                        hVarArr = (C13281h[]) C13262e.this.f34193g.values().toArray(new C13281h[C13262e.this.f34193g.size()]);
                    }
                }
                C13262e.f34190y.execute(new C13275b("OkHttp %s settings", C13262e.this.f34194h));
            }
            if (hVarArr != null && j != 0) {
                for (C13281h hVar : hVarArr) {
                    synchronized (hVar) {
                        hVar.mo38131a(j);
                    }
                }
            }
        }

        /* renamed from: a */
        private void m34892a(C13288k kVar) {
            try {
                C13262e.this.f34198l.execute(new C13276c("OkHttp %s ACK Settings", new Object[]{C13262e.this.f34194h}, kVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo38123a(boolean z, int i, int i2) {
            if (z) {
                synchronized (C13262e.this) {
                    C13262e.this.f34201o = false;
                    C13262e.this.notifyAll();
                }
                return;
            }
            try {
                C13262e.this.f34198l.execute(new C13272i(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        /* renamed from: a */
        public void mo38122a(int i, C13256a aVar, C13346d dVar) {
            C13281h[] hVarArr;
            dVar.mo38528g();
            synchronized (C13262e.this) {
                hVarArr = (C13281h[]) C13262e.this.f34193g.values().toArray(new C13281h[C13262e.this.f34193g.size()]);
                C13262e.this.f34197k = true;
            }
            for (C13281h hVar : hVarArr) {
                if (hVar.mo38138c() > i && hVar.mo38141f()) {
                    hVar.mo38137b(C13256a.REFUSED_STREAM);
                    C13262e.this.mo38108c(hVar.mo38138c());
                }
            }
        }

        /* renamed from: a */
        public void mo38120a(int i, long j) {
            if (i == 0) {
                synchronized (C13262e.this) {
                    C13262e.this.f34203q += j;
                    C13262e.this.notifyAll();
                }
                return;
            }
            C13281h a = C13262e.this.mo38090a(i);
            if (a != null) {
                synchronized (a) {
                    a.mo38131a(j);
                }
            }
        }

        /* renamed from: a */
        public void mo38119a(int i, int i2, List<C13257b> list) {
            C13262e.this.mo38093a(i2, list);
        }
    }

    static {
        Class<C13262e> cls = C13262e.class;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13184e.m34500a("OkHttp Http2Connection", true));
        f34190y = threadPoolExecutor;
    }

    C13262e(C13269g gVar) {
        C13269g gVar2 = gVar;
        this.f34200n = gVar2.f34237f;
        boolean z = gVar2.f34238g;
        this.f34191e = z;
        this.f34192f = gVar2.f34236e;
        this.f34196j = z ? 1 : 2;
        if (gVar2.f34238g) {
            this.f34196j += 2;
        }
        if (gVar2.f34238g) {
            this.f34204r.mo38170a(7, 16777216);
        }
        this.f34194h = gVar2.f34233b;
        this.f34198l = new ScheduledThreadPoolExecutor(1, C13184e.m34500a(C13184e.m34490a("OkHttp %s Writer", this.f34194h), false));
        if (gVar2.f34239h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.f34198l;
            C13272i iVar = new C13272i(false, 0, 0);
            int i = gVar2.f34239h;
            scheduledExecutorService.scheduleAtFixedRate(iVar, (long) i, (long) i, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C13184e.m34500a(C13184e.m34490a("OkHttp %s Push Observer", this.f34194h), true));
        this.f34199m = threadPoolExecutor;
        this.f34205s.mo38170a(7, 65535);
        this.f34205s.mo38170a(5, 16384);
        this.f34203q = (long) this.f34205s.mo38175c();
        this.f34207u = gVar2.f34232a;
        this.f34208v = new C13285i(gVar2.f34235d, this.f34191e);
        this.f34209w = new C13273j(new C13278g(gVar2.f34234c, this.f34191e));
    }

    /* renamed from: b */
    public synchronized int mo38105b() {
        return this.f34205s.mo38174b(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo38107b(int i) {
        return i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized C13281h mo38108c(int i) {
        C13281h hVar;
        hVar = (C13281h) this.f34193g.remove(Integer.valueOf(i));
        notifyAll();
        return hVar;
    }

    public void close() {
        mo38101a(C13256a.NO_ERROR, C13256a.CANCEL, (IOException) null);
    }

    public void flush() throws IOException {
        this.f34208v.flush();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.http2.C13281h m34855b(int r11, java.util.List<okhttp3.internal.http2.C13257b> r12, boolean r13) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            okhttp3.internal.http2.i r7 = r10.f34208v
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0078 }
            int r0 = r10.f34196j     // Catch:{ all -> 0x0075 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.a r0 = okhttp3.internal.http2.C13256a.REFUSED_STREAM     // Catch:{ all -> 0x0075 }
            r10.mo38100a(r0)     // Catch:{ all -> 0x0075 }
        L_0x0013:
            boolean r0 = r10.f34197k     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x006f
            int r8 = r10.f34196j     // Catch:{ all -> 0x0075 }
            int r0 = r10.f34196j     // Catch:{ all -> 0x0075 }
            int r0 = r0 + 2
            r10.f34196j = r0     // Catch:{ all -> 0x0075 }
            okhttp3.internal.http2.h r9 = new okhttp3.internal.http2.h     // Catch:{ all -> 0x0075 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0075 }
            if (r13 == 0) goto L_0x003c
            long r0 = r10.f34203q     // Catch:{ all -> 0x0075 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003c
            long r0 = r9.f34272b     // Catch:{ all -> 0x0075 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r13 = 0
            goto L_0x003d
        L_0x003c:
            r13 = 1
        L_0x003d:
            boolean r0 = r9.mo38142g()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r10.f34193g     // Catch:{ all -> 0x0075 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0075 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0075 }
        L_0x004c:
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            if (r11 != 0) goto L_0x0055
            okhttp3.internal.http2.i r11 = r10.f34208v     // Catch:{ all -> 0x0078 }
            r11.mo38160a(r6, r8, r12)     // Catch:{ all -> 0x0078 }
            goto L_0x005e
        L_0x0055:
            boolean r0 = r10.f34191e     // Catch:{ all -> 0x0078 }
            if (r0 != 0) goto L_0x0067
            okhttp3.internal.http2.i r0 = r10.f34208v     // Catch:{ all -> 0x0078 }
            r0.mo38154a(r11, r8, r12)     // Catch:{ all -> 0x0078 }
        L_0x005e:
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0066
            okhttp3.internal.http2.i r11 = r10.f34208v
            r11.flush()
        L_0x0066:
            return r9
        L_0x0067:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0078 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0078 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x006f:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0075 }
            r11.<init>()     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0075 }
            throw r11     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C13262e.m34855b(int, java.util.List, boolean):okhttp3.internal.http2.h");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized C13281h mo38090a(int i) {
        return (C13281h) this.f34193g.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo38110c(int i, C13256a aVar) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f34198l;
            C13263a aVar2 = new C13263a("OkHttp %s stream %d", new Object[]{this.f34194h, Integer.valueOf(i)}, i, aVar);
            scheduledExecutorService.execute(aVar2);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo38099a(long j) {
        this.f34202p += j;
        if (this.f34202p >= ((long) (this.f34204r.mo38175c() / 2))) {
            mo38092a(0, this.f34202p);
            this.f34202p = 0;
        }
    }

    /* renamed from: c */
    public void mo38109c() throws IOException {
        mo38102a(true);
    }

    /* renamed from: a */
    public C13281h mo38091a(List<C13257b> list, boolean z) throws IOException {
        return m34855b(0, list, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38097a(int i, boolean z, List<C13257b> list) throws IOException {
        this.f34208v.mo38160a(z, i, list);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.f34203q), r8.f34208v.mo38162b());
        r6 = (long) r3;
        r8.f34203q -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38098a(int r9, boolean r10, okio.C13342c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            okhttp3.internal.http2.i r12 = r8.f34208v
            r12.mo38161a(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0069
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f34203q     // Catch:{ InterruptedException -> 0x005a }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r3 = r8.f34193g     // Catch:{ InterruptedException -> 0x005a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005a }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x005a }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x005a }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005a }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005a }
            throw r9     // Catch:{ InterruptedException -> 0x005a }
        L_0x0030:
            long r3 = r8.f34203q     // Catch:{ all -> 0x0058 }
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0058 }
            int r4 = (int) r3     // Catch:{ all -> 0x0058 }
            okhttp3.internal.http2.i r3 = r8.f34208v     // Catch:{ all -> 0x0058 }
            int r3 = r3.mo38162b()     // Catch:{ all -> 0x0058 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0058 }
            long r4 = r8.f34203q     // Catch:{ all -> 0x0058 }
            long r6 = (long) r3     // Catch:{ all -> 0x0058 }
            long r4 = r4 - r6
            r8.f34203q = r4     // Catch:{ all -> 0x0058 }
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            long r12 = r12 - r6
            okhttp3.internal.http2.i r4 = r8.f34208v
            if (r10 == 0) goto L_0x0053
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r4.mo38161a(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0058:
            r9 = move-exception
            goto L_0x0067
        L_0x005a:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0058 }
            r9.interrupt()     // Catch:{ all -> 0x0058 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0058 }
            r9.<init>()     // Catch:{ all -> 0x0058 }
            throw r9     // Catch:{ all -> 0x0058 }
        L_0x0067:
            monitor-exit(r8)     // Catch:{ all -> 0x0058 }
            throw r9
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C13262e.mo38098a(int, boolean, okio.c, long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38106b(int i, C13256a aVar) throws IOException {
        this.f34208v.mo38156a(i, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38092a(int i, long j) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.f34198l;
            C13264b bVar = new C13264b("OkHttp Window Update %s stream %d", new Object[]{this.f34194h, Integer.valueOf(i)}, i, j);
            scheduledExecutorService.execute(bVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38103a(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.f34201o;
                this.f34201o = true;
            }
            if (z2) {
                m34851a((IOException) null);
                return;
            }
        }
        try {
            this.f34208v.mo38159a(z, i, i2);
        } catch (IOException e) {
            m34851a(e);
        }
    }

    /* renamed from: a */
    public void mo38100a(C13256a aVar) throws IOException {
        synchronized (this.f34208v) {
            synchronized (this) {
                if (!this.f34197k) {
                    this.f34197k = true;
                    int i = this.f34195i;
                    this.f34208v.mo38157a(i, aVar, C13184e.f33855a);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38101a(okhttp3.internal.http2.C13256a r4, okhttp3.internal.http2.C13256a r5, java.io.IOException r6) {
        /*
            r3 = this;
            r3.mo38100a(r4)     // Catch:{ IOException -> 0x0003 }
        L_0x0003:
            r4 = 0
            monitor-enter(r3)
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r3.f34193g     // Catch:{ all -> 0x004a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0026
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r4 = r3.f34193g     // Catch:{ all -> 0x004a }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r3.f34193g     // Catch:{ all -> 0x004a }
            int r0 = r0.size()     // Catch:{ all -> 0x004a }
            okhttp3.internal.http2.h[] r0 = new okhttp3.internal.http2.C13281h[r0]     // Catch:{ all -> 0x004a }
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch:{ all -> 0x004a }
            okhttp3.internal.http2.h[] r4 = (okhttp3.internal.http2.C13281h[]) r4     // Catch:{ all -> 0x004a }
            java.util.Map<java.lang.Integer, okhttp3.internal.http2.h> r0 = r3.f34193g     // Catch:{ all -> 0x004a }
            r0.clear()     // Catch:{ all -> 0x004a }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            if (r4 == 0) goto L_0x0035
            int r0 = r4.length
            r1 = 0
        L_0x002b:
            if (r1 >= r0) goto L_0x0035
            r2 = r4[r1]
            r2.mo38133a(r5, r6)     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0035:
            okhttp3.internal.http2.i r4 = r3.f34208v     // Catch:{ IOException -> 0x003a }
            r4.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.net.Socket r4 = r3.f34207u     // Catch:{ IOException -> 0x003f }
            r4.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            java.util.concurrent.ScheduledExecutorService r4 = r3.f34198l
            r4.shutdown()
            java.util.concurrent.ExecutorService r4 = r3.f34199m
            r4.shutdown()
            return
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C13262e.mo38101a(okhttp3.internal.http2.a, okhttp3.internal.http2.a, java.io.IOException):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m34851a(IOException iOException) {
        C13256a aVar = C13256a.PROTOCOL_ERROR;
        mo38101a(aVar, aVar, iOException);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38102a(boolean z) throws IOException {
        if (z) {
            this.f34208v.mo38151a();
            this.f34208v.mo38163b(this.f34204r);
            int c = this.f34204r.mo38175c();
            if (c != 65535) {
                this.f34208v.mo38155a(0, (long) (c - 65535));
            }
        }
        new Thread(this.f34209w).start();
    }

    /* renamed from: a */
    public synchronized boolean mo38104a() {
        return this.f34197k;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = r8;
        r2 = new okhttp3.internal.http2.C13262e.C13265c(r3, "OkHttp %s Push Request[%s]", new java.lang.Object[]{r8.f34194h, java.lang.Integer.valueOf(r9)}, r9, r10);
        m34852a((okhttp3.p418f0.C13183d) r2);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38093a(int r9, java.util.List<okhttp3.internal.http2.C13257b> r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f34210x     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003c }
            boolean r0 = r0.contains(r1)     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0014
            okhttp3.internal.http2.a r10 = okhttp3.internal.http2.C13256a.PROTOCOL_ERROR     // Catch:{ all -> 0x003c }
            r8.mo38110c(r9, r10)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            return
        L_0x0014:
            java.util.Set<java.lang.Integer> r0 = r8.f34210x     // Catch:{ all -> 0x003c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x003c }
            r0.add(r1)     // Catch:{ all -> 0x003c }
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            okhttp3.internal.http2.e$c r0 = new okhttp3.internal.http2.e$c     // Catch:{ RejectedExecutionException -> 0x003b }
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            r1 = 2
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ RejectedExecutionException -> 0x003b }
            r1 = 0
            java.lang.String r2 = r8.f34194h     // Catch:{ RejectedExecutionException -> 0x003b }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x003b }
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch:{ RejectedExecutionException -> 0x003b }
            r5[r1] = r2     // Catch:{ RejectedExecutionException -> 0x003b }
            r2 = r0
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch:{ RejectedExecutionException -> 0x003b }
            r8.m34852a(r0)     // Catch:{ RejectedExecutionException -> 0x003b }
        L_0x003b:
            return
        L_0x003c:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C13262e.mo38093a(int, java.util.List):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38094a(int i, List<C13257b> list, boolean z) {
        try {
            C13266d dVar = new C13266d("OkHttp %s Push Headers[%s]", new Object[]{this.f34194h, Integer.valueOf(i)}, i, list, z);
            m34852a((C13183d) dVar);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38096a(int i, BufferedSource bufferedSource, int i2, boolean z) throws IOException {
        C13342c cVar = new C13342c();
        long j = (long) i2;
        bufferedSource.require(j);
        bufferedSource.read(cVar, j);
        if (cVar.mo38488b() == j) {
            C13267e eVar = new C13267e("OkHttp %s Push Data[%s]", new Object[]{this.f34194h, Integer.valueOf(i)}, i, cVar, i2, z);
            m34852a((C13183d) eVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.mo38488b());
        sb.append(" != ");
        sb.append(i2);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38095a(int i, C13256a aVar) {
        C13268f fVar = new C13268f("OkHttp %s Push Reset[%s]", new Object[]{this.f34194h, Integer.valueOf(i)}, i, aVar);
        m34852a((C13183d) fVar);
    }

    /* renamed from: a */
    private synchronized void m34852a(C13183d dVar) {
        if (!mo38104a()) {
            this.f34199m.execute(dVar);
        }
    }
}
