package com.bumptech.glide.load.engine;

import android.os.Build.VERSION;
import android.util.Log;
import androidx.core.util.Pools$Pool;
import com.bumptech.glide.C8856d;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C8884c;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.engine.DataFetcherGenerator.FetcherReadyCallback;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.p301o.C9212f;
import com.bumptech.glide.util.pool.C9247a;
import com.bumptech.glide.util.pool.C9248b;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.engine.g */
class C8967g<R> implements FetcherReadyCallback, Runnable, Comparable<C8967g<?>>, Poolable {

    /* renamed from: A */
    private Thread f23365A;

    /* renamed from: B */
    private Key f23366B;

    /* renamed from: C */
    private Key f23367C;

    /* renamed from: D */
    private Object f23368D;

    /* renamed from: E */
    private C8882a f23369E;

    /* renamed from: F */
    private DataFetcher<?> f23370F;

    /* renamed from: G */
    private volatile DataFetcherGenerator f23371G;

    /* renamed from: H */
    private volatile boolean f23372H;

    /* renamed from: I */
    private volatile boolean f23373I;

    /* renamed from: e */
    private final C8966f<R> f23374e = new C8966f<>();

    /* renamed from: f */
    private final List<Throwable> f23375f = new ArrayList();

    /* renamed from: g */
    private final C9248b f23376g = C9248b.m22265b();

    /* renamed from: h */
    private final C8972e f23377h;

    /* renamed from: i */
    private final Pools$Pool<C8967g<?>> f23378i;

    /* renamed from: j */
    private final C8971d<?> f23379j = new C8971d<>();

    /* renamed from: k */
    private final C8973f f23380k = new C8973f();

    /* renamed from: l */
    private C8856d f23381l;

    /* renamed from: m */
    private Key f23382m;

    /* renamed from: n */
    private C8859g f23383n;

    /* renamed from: o */
    private C8998m f23384o;

    /* renamed from: p */
    private int f23385p;

    /* renamed from: q */
    private int f23386q;

    /* renamed from: r */
    private C8978i f23387r;

    /* renamed from: s */
    private C9011f f23388s;

    /* renamed from: t */
    private C8969b<R> f23389t;

    /* renamed from: u */
    private int f23390u;

    /* renamed from: v */
    private C8975h f23391v;

    /* renamed from: w */
    private C8974g f23392w;

    /* renamed from: x */
    private long f23393x;

    /* renamed from: y */
    private boolean f23394y;

    /* renamed from: z */
    private Object f23395z;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    static /* synthetic */ class C8968a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23396a = new int[C8974g.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f23397b = new int[C8975h.values().length];

        /* renamed from: c */
        static final /* synthetic */ int[] f23398c = new int[C8884c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0052 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0070 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007a */
        static {
            /*
                com.bumptech.glide.load.c[] r0 = com.bumptech.glide.load.C8884c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23398c = r0
                r0 = 1
                int[] r1 = f23398c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bumptech.glide.load.c r2 = com.bumptech.glide.load.C8884c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f23398c     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bumptech.glide.load.c r3 = com.bumptech.glide.load.C8884c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                com.bumptech.glide.load.engine.g$h[] r2 = com.bumptech.glide.load.engine.C8967g.C8975h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f23397b = r2
                int[] r2 = f23397b     // Catch:{ NoSuchFieldError -> 0x0032 }
                com.bumptech.glide.load.engine.g$h r3 = com.bumptech.glide.load.engine.C8967g.C8975h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                int[] r2 = f23397b     // Catch:{ NoSuchFieldError -> 0x003c }
                com.bumptech.glide.load.engine.g$h r3 = com.bumptech.glide.load.engine.C8967g.C8975h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x003c }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                r2 = 3
                int[] r3 = f23397b     // Catch:{ NoSuchFieldError -> 0x0047 }
                com.bumptech.glide.load.engine.g$h r4 = com.bumptech.glide.load.engine.C8967g.C8975h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0047 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0047 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0047 }
            L_0x0047:
                int[] r3 = f23397b     // Catch:{ NoSuchFieldError -> 0x0052 }
                com.bumptech.glide.load.engine.g$h r4 = com.bumptech.glide.load.engine.C8967g.C8975h.FINISHED     // Catch:{ NoSuchFieldError -> 0x0052 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0052 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0052 }
            L_0x0052:
                int[] r3 = f23397b     // Catch:{ NoSuchFieldError -> 0x005d }
                com.bumptech.glide.load.engine.g$h r4 = com.bumptech.glide.load.engine.C8967g.C8975h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x005d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                com.bumptech.glide.load.engine.g$g[] r3 = com.bumptech.glide.load.engine.C8967g.C8974g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f23396a = r3
                int[] r3 = f23396a     // Catch:{ NoSuchFieldError -> 0x0070 }
                com.bumptech.glide.load.engine.g$g r4 = com.bumptech.glide.load.engine.C8967g.C8974g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0070 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0070 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                int[] r0 = f23396a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.bumptech.glide.load.engine.g$g r3 = com.bumptech.glide.load.engine.C8967g.C8974g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x007a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f23396a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.bumptech.glide.load.engine.g$g r1 = com.bumptech.glide.load.engine.C8967g.C8974g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C8967g.C8968a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$b */
    interface C8969b<R> {
        /* renamed from: a */
        void mo24448a(C8967g<?> gVar);

        void onLoadFailed(GlideException glideException);

        void onResourceReady(Resource<R> resource, C8882a aVar);
    }

    /* renamed from: com.bumptech.glide.load.engine.g$c */
    private final class C8970c<Z> implements C8977a<Z> {

        /* renamed from: a */
        private final C8882a f23399a;

        C8970c(C8882a aVar) {
            this.f23399a = aVar;
        }

        /* renamed from: a */
        public Resource<Z> mo24451a(Resource<Z> resource) {
            return C8967g.this.mo24441a(this.f23399a, resource);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$d */
    private static class C8971d<Z> {

        /* renamed from: a */
        private Key f23401a;

        /* renamed from: b */
        private ResourceEncoder<Z> f23402b;

        /* renamed from: c */
        private C9004r<Z> f23403c;

        C8971d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <X> void mo24453a(Key key, ResourceEncoder<X> resourceEncoder, C9004r<X> rVar) {
            this.f23401a = key;
            this.f23402b = resourceEncoder;
            this.f23403c = rVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo24455b() {
            return this.f23403c != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24454a(C8972e eVar, C9011f fVar) {
            C9247a.m22262a("DecodeJob.encode");
            try {
                eVar.mo24456a().put(this.f23401a, new C8958e(this.f23402b, this.f23403c, fVar));
            } finally {
                this.f23403c.mo24512a();
                C9247a.m22261a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24452a() {
            this.f23401a = null;
            this.f23402b = null;
            this.f23403c = null;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$e */
    interface C8972e {
        /* renamed from: a */
        DiskCache mo24456a();
    }

    /* renamed from: com.bumptech.glide.load.engine.g$f */
    private static class C8973f {

        /* renamed from: a */
        private boolean f23404a;

        /* renamed from: b */
        private boolean f23405b;

        /* renamed from: c */
        private boolean f23406c;

        C8973f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized boolean mo24458a(boolean z) {
            this.f23404a = true;
            return m21577b(z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public synchronized boolean mo24459b() {
            this.f23406c = true;
            return m21577b(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public synchronized void mo24460c() {
            this.f23405b = false;
            this.f23404a = false;
            this.f23406c = false;
        }

        /* renamed from: b */
        private boolean m21577b(boolean z) {
            return (this.f23406c || z || this.f23405b) && this.f23404a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized boolean mo24457a() {
            this.f23405b = true;
            return m21577b(false);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.g$g */
    private enum C8974g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.g$h */
    private enum C8975h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    C8967g(C8972e eVar, Pools$Pool<C8967g<?>> pools$Pool) {
        this.f23377h = eVar;
        this.f23378i = pools$Pool;
    }

    /* renamed from: c */
    private void m21555c() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f23393x;
            StringBuilder sb = new StringBuilder();
            sb.append("data: ");
            sb.append(this.f23368D);
            sb.append(", cache key: ");
            sb.append(this.f23366B);
            sb.append(", fetcher: ");
            sb.append(this.f23370F);
            m21553a("Retrieved data", j, sb.toString());
        }
        Resource resource = null;
        try {
            resource = m21546a(this.f23370F, (Data) this.f23368D, this.f23369E);
        } catch (GlideException e) {
            e.mo24280a(this.f23367C, this.f23369E);
            this.f23375f.add(e);
        }
        if (resource != null) {
            m21554b(resource, this.f23369E);
        } else {
            m21561i();
        }
    }

    /* renamed from: d */
    private DataFetcherGenerator m21556d() {
        int i = C8968a.f23397b[this.f23391v.ordinal()];
        if (i == 1) {
            return new C9006s(this.f23374e, this);
        }
        if (i == 2) {
            return new C8941c(this.f23374e, this);
        }
        if (i == 3) {
            return new C9010v(this.f23374e, this);
        }
        if (i == 4) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unrecognized stage: ");
        sb.append(this.f23391v);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    private void m21557e() {
        m21563k();
        this.f23389t.onLoadFailed(new GlideException("Failed to load resource", (List<Throwable>) new ArrayList<Throwable>(this.f23375f)));
        m21559g();
    }

    /* renamed from: f */
    private void m21558f() {
        if (this.f23380k.mo24457a()) {
            m21560h();
        }
    }

    /* renamed from: g */
    private void m21559g() {
        if (this.f23380k.mo24459b()) {
            m21560h();
        }
    }

    private int getPriority() {
        return this.f23383n.ordinal();
    }

    /* renamed from: h */
    private void m21560h() {
        this.f23380k.mo24460c();
        this.f23379j.mo24452a();
        this.f23374e.mo24420a();
        this.f23372H = false;
        this.f23381l = null;
        this.f23382m = null;
        this.f23388s = null;
        this.f23383n = null;
        this.f23384o = null;
        this.f23389t = null;
        this.f23391v = null;
        this.f23371G = null;
        this.f23365A = null;
        this.f23366B = null;
        this.f23368D = null;
        this.f23369E = null;
        this.f23370F = null;
        this.f23393x = 0;
        this.f23373I = false;
        this.f23395z = null;
        this.f23375f.clear();
        this.f23378i.release(this);
    }

    /* renamed from: i */
    private void m21561i() {
        this.f23365A = Thread.currentThread();
        this.f23393x = C9212f.m22072a();
        boolean z = false;
        while (!this.f23373I && this.f23371G != null) {
            z = this.f23371G.mo24274a();
            if (z) {
                break;
            }
            this.f23391v = m21549a(this.f23391v);
            this.f23371G = m21556d();
            if (this.f23391v == C8975h.SOURCE) {
                reschedule();
                return;
            }
        }
        if ((this.f23391v == C8975h.FINISHED || this.f23373I) && !z) {
            m21557e();
        }
    }

    /* renamed from: j */
    private void m21562j() {
        int i = C8968a.f23396a[this.f23392w.ordinal()];
        if (i == 1) {
            this.f23391v = m21549a(C8975h.INITIALIZE);
            this.f23371G = m21556d();
            m21561i();
        } else if (i == 2) {
            m21561i();
        } else if (i == 3) {
            m21555c();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized run reason: ");
            sb.append(this.f23392w);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: k */
    private void m21563k() {
        Throwable th;
        this.f23376g.mo24932a();
        if (this.f23372H) {
            if (this.f23375f.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.f23375f;
                th = (Throwable) list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f23372H = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8967g<R> mo24442a(C8856d dVar, Object obj, C8998m mVar, Key key, int i, int i2, Class<?> cls, Class<R> cls2, C8859g gVar, C8978i iVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, C9011f fVar, C8969b<R> bVar, int i3) {
        this.f23374e.mo24421a(dVar, obj, key, i, i2, iVar, cls, cls2, gVar, fVar, map, z, z2, this.f23377h);
        this.f23381l = dVar;
        this.f23382m = key;
        this.f23383n = gVar;
        this.f23384o = mVar;
        this.f23385p = i;
        this.f23386q = i2;
        this.f23387r = iVar;
        this.f23394y = z3;
        this.f23388s = fVar;
        this.f23389t = bVar;
        this.f23390u = i3;
        this.f23392w = C8974g.INITIALIZE;
        this.f23395z = obj;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo24445b() {
        C8975h a = m21549a(C8975h.INITIALIZE);
        return a == C8975h.RESOURCE_CACHE || a == C8975h.DATA_CACHE;
    }

    public C9248b getVerifier() {
        return this.f23376g;
    }

    public void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, C8882a aVar) {
        dataFetcher.cleanup();
        GlideException glideException = new GlideException("Fetching data failed", (Throwable) exc);
        glideException.mo24281a(key, aVar, dataFetcher.getDataClass());
        this.f23375f.add(glideException);
        if (Thread.currentThread() != this.f23365A) {
            this.f23392w = C8974g.SWITCH_TO_SOURCE_SERVICE;
            this.f23389t.mo24448a(this);
            return;
        }
        m21561i();
    }

    public void onDataFetcherReady(Key key, Object obj, DataFetcher<?> dataFetcher, C8882a aVar, Key key2) {
        this.f23366B = key;
        this.f23368D = obj;
        this.f23370F = dataFetcher;
        this.f23369E = aVar;
        this.f23367C = key2;
        if (Thread.currentThread() != this.f23365A) {
            this.f23392w = C8974g.DECODE_DATA;
            this.f23389t.mo24448a(this);
            return;
        }
        C9247a.m22262a("DecodeJob.decodeFromRetrievedData");
        try {
            m21555c();
        } finally {
            C9247a.m22261a();
        }
    }

    public void reschedule() {
        this.f23392w = C8974g.SWITCH_TO_SOURCE_SERVICE;
        this.f23389t.mo24448a(this);
    }

    public void run() {
        String str = "DecodeJob";
        C9247a.m22263a("DecodeJob#run(model=%s)", this.f23395z);
        DataFetcher<?> dataFetcher = this.f23370F;
        try {
            if (this.f23373I) {
                m21557e();
                if (dataFetcher != null) {
                    dataFetcher.cleanup();
                }
                C9247a.m22261a();
                return;
            }
            m21562j();
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
            C9247a.m22261a();
        } catch (C8918b e) {
            throw e;
        } catch (Throwable th) {
            if (dataFetcher != null) {
                dataFetcher.cleanup();
            }
            C9247a.m22261a();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.bumptech.glide.load.engine.Resource] */
    /* JADX WARNING: type inference failed for: r3v7, types: [com.bumptech.glide.load.engine.r] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21554b(com.bumptech.glide.load.engine.Resource<R> r3, com.bumptech.glide.load.C8882a r4) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof com.bumptech.glide.load.engine.Initializable
            if (r0 == 0) goto L_0x000a
            r0 = r3
            com.bumptech.glide.load.engine.Initializable r0 = (com.bumptech.glide.load.engine.Initializable) r0
            r0.initialize()
        L_0x000a:
            r0 = 0
            com.bumptech.glide.load.engine.g$d<?> r1 = r2.f23379j
            boolean r1 = r1.mo24455b()
            if (r1 == 0) goto L_0x0018
            com.bumptech.glide.load.engine.r r3 = com.bumptech.glide.load.engine.C9004r.m21662b(r3)
            r0 = r3
        L_0x0018:
            r2.m21551a(r3, r4)
            com.bumptech.glide.load.engine.g$h r3 = com.bumptech.glide.load.engine.C8967g.C8975h.ENCODE
            r2.f23391v = r3
            com.bumptech.glide.load.engine.g$d<?> r3 = r2.f23379j     // Catch:{ all -> 0x0039 }
            boolean r3 = r3.mo24455b()     // Catch:{ all -> 0x0039 }
            if (r3 == 0) goto L_0x0030
            com.bumptech.glide.load.engine.g$d<?> r3 = r2.f23379j     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.engine.g$e r4 = r2.f23377h     // Catch:{ all -> 0x0039 }
            com.bumptech.glide.load.f r1 = r2.f23388s     // Catch:{ all -> 0x0039 }
            r3.mo24454a(r4, r1)     // Catch:{ all -> 0x0039 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.mo24512a()
        L_0x0035:
            r2.m21558f()
            return
        L_0x0039:
            r3 = move-exception
            if (r0 == 0) goto L_0x003f
            r0.mo24512a()
        L_0x003f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C8967g.m21554b(com.bumptech.glide.load.engine.Resource, com.bumptech.glide.load.a):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24444a(boolean z) {
        if (this.f23380k.mo24458a(z)) {
            m21560h();
        }
    }

    /* renamed from: a */
    public int compareTo(C8967g<?> gVar) {
        int priority = getPriority() - gVar.getPriority();
        return priority == 0 ? this.f23390u - gVar.f23390u : priority;
    }

    /* renamed from: a */
    public void mo24443a() {
        this.f23373I = true;
        DataFetcherGenerator dataFetcherGenerator = this.f23371G;
        if (dataFetcherGenerator != null) {
            dataFetcherGenerator.cancel();
        }
    }

    /* renamed from: a */
    private void m21551a(Resource<R> resource, C8882a aVar) {
        m21563k();
        this.f23389t.onResourceReady(resource, aVar);
    }

    /* renamed from: a */
    private C8975h m21549a(C8975h hVar) {
        C8975h hVar2;
        C8975h hVar3;
        int i = C8968a.f23397b[hVar.ordinal()];
        if (i == 1) {
            if (this.f23387r.mo24463a()) {
                hVar2 = C8975h.DATA_CACHE;
            } else {
                hVar2 = m21549a(C8975h.DATA_CACHE);
            }
            return hVar2;
        } else if (i == 2) {
            return this.f23394y ? C8975h.FINISHED : C8975h.SOURCE;
        } else if (i == 3 || i == 4) {
            return C8975h.FINISHED;
        } else {
            if (i == 5) {
                if (this.f23387r.mo24466b()) {
                    hVar3 = C8975h.RESOURCE_CACHE;
                } else {
                    hVar3 = m21549a(C8975h.RESOURCE_CACHE);
                }
                return hVar3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized stage: ");
            sb.append(hVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private <Data> Resource<R> m21546a(DataFetcher<?> dataFetcher, Data data, C8882a aVar) throws GlideException {
        if (data == null) {
            dataFetcher.cleanup();
            return null;
        }
        try {
            long a = C9212f.m22072a();
            Resource<R> a2 = m21547a(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Decoded result ");
                sb.append(a2);
                m21552a(sb.toString(), a);
            }
            return a2;
        } finally {
            dataFetcher.cleanup();
        }
    }

    /* renamed from: a */
    private <Data> Resource<R> m21547a(Data data, C8882a aVar) throws GlideException {
        return m21548a(data, aVar, this.f23374e.mo24418a(data.getClass()));
    }

    /* renamed from: a */
    private C9011f m21550a(C8882a aVar) {
        C9011f fVar = this.f23388s;
        if (VERSION.SDK_INT < 26) {
            return fVar;
        }
        boolean z = aVar == C8882a.RESOURCE_DISK_CACHE || this.f23374e.mo24439o();
        Boolean bool = (Boolean) fVar.mo24517a(Downsampler.f23658i);
        if (bool != null && (!bool.booleanValue() || z)) {
            return fVar;
        }
        C9011f fVar2 = new C9011f();
        fVar2.mo24518a(this.f23388s);
        fVar2.mo24516a(Downsampler.f23658i, Boolean.valueOf(z));
        return fVar2;
    }

    /* renamed from: a */
    private <Data, ResourceType> Resource<R> m21548a(Data data, C8882a aVar, C9003q<Data, ResourceType, R> qVar) throws GlideException {
        C9011f a = m21550a(aVar);
        DataRewinder b = this.f23381l.mo24132f().mo24118b(data);
        try {
            return qVar.mo24510a(b, a, this.f23385p, this.f23386q, new C8970c(aVar));
        } finally {
            b.cleanup();
        }
    }

    /* renamed from: a */
    private void m21552a(String str, long j) {
        m21553a(str, j, (String) null);
    }

    /* renamed from: a */
    private void m21553a(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C9212f.m22071a(j));
        sb.append(", load key: ");
        sb.append(this.f23384o);
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
            str3 = sb2.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* JADX WARNING: type inference failed for: r12v5, types: [com.bumptech.glide.load.Key] */
    /* JADX WARNING: type inference failed for: r12v6, types: [com.bumptech.glide.load.engine.d] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> com.bumptech.glide.load.engine.Resource<Z> mo24441a(com.bumptech.glide.load.C8882a r12, com.bumptech.glide.load.engine.Resource<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            com.bumptech.glide.load.a r0 = com.bumptech.glide.load.C8882a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            com.bumptech.glide.load.engine.f<R> r0 = r11.f23374e
            com.bumptech.glide.load.Transformation r0 = r0.mo24423b(r8)
            com.bumptech.glide.d r2 = r11.f23381l
            int r3 = r11.f23385p
            int r4 = r11.f23386q
            com.bumptech.glide.load.engine.Resource r2 = r0.transform(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.recycle()
        L_0x002b:
            com.bumptech.glide.load.engine.f<R> r13 = r11.f23374e
            boolean r13 = r13.mo24425b(r0)
            if (r13 == 0) goto L_0x0040
            com.bumptech.glide.load.engine.f<R> r13 = r11.f23374e
            com.bumptech.glide.load.ResourceEncoder r1 = r13.mo24417a(r0)
            com.bumptech.glide.load.f r13 = r11.f23388s
            com.bumptech.glide.load.c r13 = r1.getEncodeStrategy(r13)
            goto L_0x0042
        L_0x0040:
            com.bumptech.glide.load.c r13 = com.bumptech.glide.load.C8884c.NONE
        L_0x0042:
            r10 = r1
            com.bumptech.glide.load.engine.f<R> r1 = r11.f23374e
            com.bumptech.glide.load.Key r2 = r11.f23366B
            boolean r1 = r1.mo24422a(r2)
            r2 = 1
            r1 = r1 ^ r2
            com.bumptech.glide.load.engine.i r3 = r11.f23387r
            boolean r12 = r3.mo24465a(r1, r12, r13)
            if (r12 == 0) goto L_0x00b3
            if (r10 == 0) goto L_0x00a5
            int[] r12 = com.bumptech.glide.load.engine.C8967g.C8968a.f23398c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0092
            r1 = 2
            if (r12 != r1) goto L_0x007b
            com.bumptech.glide.load.engine.t r12 = new com.bumptech.glide.load.engine.t
            com.bumptech.glide.load.engine.f<R> r13 = r11.f23374e
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r2 = r13.mo24424b()
            com.bumptech.glide.load.Key r3 = r11.f23366B
            com.bumptech.glide.load.Key r4 = r11.f23382m
            int r5 = r11.f23385p
            int r6 = r11.f23386q
            com.bumptech.glide.load.f r9 = r11.f23388s
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009b
        L_0x007b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0092:
            com.bumptech.glide.load.engine.d r12 = new com.bumptech.glide.load.engine.d
            com.bumptech.glide.load.Key r13 = r11.f23366B
            com.bumptech.glide.load.Key r1 = r11.f23382m
            r12.<init>(r13, r1)
        L_0x009b:
            com.bumptech.glide.load.engine.r r0 = com.bumptech.glide.load.engine.C9004r.m21662b(r0)
            com.bumptech.glide.load.engine.g$d<?> r13 = r11.f23379j
            r13.mo24453a(r12, r10, r0)
            goto L_0x00b3
        L_0x00a5:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r12 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C8967g.mo24441a(com.bumptech.glide.load.a, com.bumptech.glide.load.engine.Resource):com.bumptech.glide.load.engine.Resource");
    }
}
