package com.segment.analytics;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.segment.analytics.integrations.C11649a;
import com.segment.analytics.integrations.C11650b;
import com.segment.analytics.integrations.C11650b.C11651a;
import com.segment.analytics.integrations.C11650b.C11653c;
import com.segment.analytics.integrations.C11654c;
import com.segment.analytics.integrations.C11655d;
import com.segment.analytics.integrations.C11655d.C11656a;
import com.segment.analytics.integrations.C11657e;
import com.segment.analytics.integrations.C11658f;
import com.segment.analytics.integrations.C11658f.C11659a;
import com.segment.analytics.integrations.C11660g;
import com.segment.analytics.integrations.C11660g.C11661a;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Integration.Factory;
import com.segment.analytics.p326t.C11692b;
import com.segment.analytics.p326t.C11692b.C11693a;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class Analytics {

    /* renamed from: A */
    static final List<String> f30097A = new ArrayList(1);

    /* renamed from: B */
    static volatile Analytics f30098B = null;

    /* renamed from: C */
    static final C11668l f30099C = new C11668l();

    /* renamed from: z */
    static final Handler f30100z = new C11604d(Looper.getMainLooper());

    /* renamed from: a */
    private final Application f30101a;

    /* renamed from: b */
    final ExecutorService f30102b;

    /* renamed from: c */
    final C11681p f30103c;

    /* renamed from: d */
    private final List<Middleware> f30104d;

    /* renamed from: e */
    final C11648i f30105e;

    /* renamed from: f */
    final C11684a f30106f;

    /* renamed from: g */
    final C11616a f30107g;

    /* renamed from: h */
    private final C11657e f30108h;

    /* renamed from: i */
    final String f30109i;

    /* renamed from: j */
    final C11624d f30110j;

    /* renamed from: k */
    final C11621c f30111k;

    /* renamed from: l */
    private final C11667a f30112l;

    /* renamed from: m */
    final C11630f f30113m;

    /* renamed from: n */
    final ActivityLifecycleCallbacks f30114n;

    /* renamed from: o */
    C11666k f30115o;

    /* renamed from: p */
    final String f30116p;

    /* renamed from: q */
    final int f30117q;

    /* renamed from: r */
    final long f30118r;

    /* renamed from: s */
    private final CountDownLatch f30119s;

    /* renamed from: t */
    private final ExecutorService f30120t;

    /* renamed from: u */
    private final C11620b f30121u;

    /* renamed from: v */
    final Map<String, Boolean> f30122v = new ConcurrentHashMap();

    /* renamed from: w */
    private List<Factory> f30123w;

    /* renamed from: x */
    private Map<String, Integration<?>> f30124x;

    /* renamed from: y */
    volatile boolean f30125y;

    public interface Callback<T> {
        void onReady(T t);
    }

    /* renamed from: com.segment.analytics.Analytics$a */
    class C11601a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C11633h f30126e;

        C11601a(C11633h hVar) {
            this.f30126e = hVar;
        }

        public void run() {
            Analytics.this.mo34217a(this.f30126e);
        }
    }

    /* renamed from: com.segment.analytics.Analytics$b */
    class C11602b implements Callable<C11666k> {
        C11602b() {
        }

        public C11666k call() throws Exception {
            C11627c cVar = null;
            try {
                cVar = Analytics.this.f30110j.mo34290b();
                return C11666k.m30592a(Analytics.this.f30111k.mo34283a((Reader) C11692b.m30695a(cVar.f30198f)));
            } finally {
                C11692b.m30709a(cVar);
            }
        }
    }

    /* renamed from: com.segment.analytics.Analytics$c */
    static /* synthetic */ class C11603c {

        /* renamed from: a */
        static final /* synthetic */ int[] f30129a = new int[C11653c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.segment.analytics.integrations.b$c[] r0 = com.segment.analytics.integrations.C11650b.C11653c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30129a = r0
                int[] r0 = f30129a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.segment.analytics.integrations.b$c r1 = com.segment.analytics.integrations.C11650b.C11653c.identify     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f30129a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.segment.analytics.integrations.b$c r1 = com.segment.analytics.integrations.C11650b.C11653c.alias     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f30129a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.segment.analytics.integrations.b$c r1 = com.segment.analytics.integrations.C11650b.C11653c.group     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f30129a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.segment.analytics.integrations.b$c r1 = com.segment.analytics.integrations.C11650b.C11653c.track     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f30129a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.segment.analytics.integrations.b$c r1 = com.segment.analytics.integrations.C11650b.C11653c.screen     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.Analytics.C11603c.<clinit>():void");
        }
    }

    /* renamed from: com.segment.analytics.Analytics$d */
    static class C11604d extends Handler {
        C11604d(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown handler message received: ");
            sb.append(message.what);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: com.segment.analytics.Analytics$e */
    class C11605e implements Runnable {

        /* renamed from: com.segment.analytics.Analytics$e$a */
        class C11606a implements Runnable {
            C11606a() {
            }

            public void run() {
                Analytics analytics = Analytics.this;
                analytics.mo34220a(analytics.f30115o);
            }
        }

        C11605e() {
        }

        public void run() {
            Analytics analytics = Analytics.this;
            analytics.f30115o = analytics.mo34229c();
            if (C11692b.m30718b((Map) Analytics.this.f30115o)) {
                Analytics.this.f30115o = C11666k.m30592a(new C11685r().mo34265b("integrations", new C11685r().mo34265b("Segment.io", new C11685r().mo34265b("apiKey", Analytics.this.f30116p))));
            }
            Analytics.f30100z.post(new C11606a());
        }
    }

    /* renamed from: com.segment.analytics.Analytics$f */
    class C11607f implements ActivityLifecycleCallbacks {

        /* renamed from: e */
        final AtomicBoolean f30132e = new AtomicBoolean(false);

        /* renamed from: f */
        final /* synthetic */ boolean f30133f;

        /* renamed from: g */
        final /* synthetic */ boolean f30134g;

        /* renamed from: h */
        final /* synthetic */ ExecutorService f30135h;

        /* renamed from: i */
        final /* synthetic */ boolean f30136i;

        /* renamed from: com.segment.analytics.Analytics$f$a */
        class C11608a implements Runnable {
            C11608a() {
            }

            public void run() {
                Analytics.this.mo34232f();
            }
        }

        C11607f(boolean z, boolean z2, ExecutorService executorService, boolean z3) {
            this.f30133f = z;
            this.f30134g = z2;
            this.f30135h = executorService;
            this.f30136i = z3;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (!this.f30132e.getAndSet(true) && this.f30133f) {
                Analytics.this.mo34231e();
                if (this.f30134g) {
                    this.f30135h.submit(new C11608a());
                }
            }
            Analytics.this.mo34227b(C11633h.m30494a(activity, bundle));
        }

        public void onActivityDestroyed(Activity activity) {
            Analytics.this.mo34227b(C11633h.m30493a(activity));
        }

        public void onActivityPaused(Activity activity) {
            Analytics.this.mo34227b(C11633h.m30501b(activity));
        }

        public void onActivityResumed(Activity activity) {
            Analytics.this.mo34227b(C11633h.m30503c(activity));
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Analytics.this.mo34227b(C11633h.m30502b(activity, bundle));
        }

        public void onActivityStarted(Activity activity) {
            if (this.f30136i) {
                Analytics.this.mo34216a(activity);
            }
            Analytics.this.mo34227b(C11633h.m30504d(activity));
        }

        public void onActivityStopped(Activity activity) {
            Analytics.this.mo34227b(C11633h.m30505e(activity));
        }
    }

    /* renamed from: com.segment.analytics.Analytics$g */
    class C11609g implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C11633h f30139e;

        /* renamed from: com.segment.analytics.Analytics$g$a */
        class C11610a implements Runnable {
            C11610a() {
            }

            public void run() {
                C11609g gVar = C11609g.this;
                Analytics.this.mo34217a(gVar.f30139e);
            }
        }

        C11609g(C11633h hVar) {
            this.f30139e = hVar;
        }

        public void run() {
            Analytics.f30100z.post(new C11610a());
        }
    }

    /* renamed from: com.segment.analytics.Analytics$h */
    class C11611h implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C11648i f30142e;

        C11611h(C11648i iVar) {
            this.f30142e = iVar;
        }

        public void run() {
            C11648i iVar = this.f30142e;
            if (iVar == null) {
                iVar = Analytics.this.f30105e;
            }
            C11656a aVar = new C11656a();
            aVar.mo34345c(Analytics.this.f30106f.mo34439b());
            Analytics.this.mo34218a((C11651a<?, ?>) aVar, iVar);
        }
    }

    /* renamed from: com.segment.analytics.Analytics$i */
    class C11612i implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C11648i f30144e;

        /* renamed from: f */
        final /* synthetic */ C11668l f30145f;

        /* renamed from: g */
        final /* synthetic */ String f30146g;

        C11612i(C11648i iVar, C11668l lVar, String str) {
            this.f30144e = iVar;
            this.f30145f = lVar;
            this.f30146g = str;
        }

        public void run() {
            C11648i iVar = this.f30144e;
            if (iVar == null) {
                iVar = Analytics.this.f30105e;
            }
            C11668l lVar = this.f30145f;
            if (lVar == null) {
                lVar = Analytics.f30099C;
            }
            C11661a aVar = new C11661a();
            aVar.mo34360c(this.f30146g);
            aVar.mo34361c((Map<String, ?>) lVar);
            Analytics.this.mo34218a((C11651a<?, ?>) aVar, iVar);
        }
    }

    /* renamed from: com.segment.analytics.Analytics$j */
    class C11613j implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C11648i f30148e;

        /* renamed from: f */
        final /* synthetic */ C11668l f30149f;

        /* renamed from: g */
        final /* synthetic */ String f30150g;

        /* renamed from: h */
        final /* synthetic */ String f30151h;

        C11613j(C11648i iVar, C11668l lVar, String str, String str2) {
            this.f30148e = iVar;
            this.f30149f = lVar;
            this.f30150g = str;
            this.f30151h = str2;
        }

        public void run() {
            C11648i iVar = this.f30148e;
            if (iVar == null) {
                iVar = Analytics.this.f30105e;
            }
            C11668l lVar = this.f30149f;
            if (lVar == null) {
                lVar = Analytics.f30099C;
            }
            C11659a aVar = new C11659a();
            aVar.mo34357d(this.f30150g);
            aVar.mo34355c(this.f30151h);
            aVar.mo34356c((Map<String, ?>) lVar);
            Analytics.this.mo34218a((C11651a<?, ?>) aVar, iVar);
        }
    }

    /* renamed from: com.segment.analytics.Analytics$k */
    public static class C11614k {

        /* renamed from: a */
        private final Application f30153a;

        /* renamed from: b */
        private String f30154b;

        /* renamed from: c */
        private boolean f30155c = true;

        /* renamed from: d */
        private int f30156d = 20;

        /* renamed from: e */
        private long f30157e = 30000;

        /* renamed from: f */
        private C11648i f30158f;

        /* renamed from: g */
        private String f30159g;

        /* renamed from: h */
        private C11615l f30160h;

        /* renamed from: i */
        private ExecutorService f30161i;

        /* renamed from: j */
        private ExecutorService f30162j;

        /* renamed from: k */
        private C11629e f30163k;

        /* renamed from: l */
        private final List<Factory> f30164l = new ArrayList();

        /* renamed from: m */
        private List<Middleware> f30165m;

        /* renamed from: n */
        private boolean f30166n = false;

        /* renamed from: o */
        private boolean f30167o = false;

        /* renamed from: p */
        private boolean f30168p = false;

        /* renamed from: q */
        private C11630f f30169q;

        public C11614k(Context context, String str) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            } else if (C11692b.m30723e(context, "android.permission.INTERNET")) {
                this.f30153a = (Application) context.getApplicationContext();
                if (this.f30153a == null) {
                    throw new IllegalArgumentException("Application context must not be null.");
                } else if (!C11692b.m30721c((CharSequence) str)) {
                    this.f30154b = str;
                } else {
                    throw new IllegalArgumentException("writeKey must not be null or empty.");
                }
            } else {
                throw new IllegalArgumentException("INTERNET permission is required.");
            }
        }

        /* renamed from: a */
        public C11614k mo34252a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("flushQueueSize must be greater than or equal to zero.");
            } else if (i <= 250) {
                this.f30156d = i;
                return this;
            } else {
                throw new IllegalArgumentException("flushQueueSize must be less than or equal to 250.");
            }
        }

        /* renamed from: b */
        public C11614k mo34256b() {
            this.f30166n = true;
            return this;
        }

        /* renamed from: a */
        public C11614k mo34253a(C11615l lVar) {
            if (lVar != null) {
                this.f30160h = lVar;
                return this;
            }
            throw new IllegalArgumentException("LogLevel must not be null.");
        }

        /* renamed from: a */
        public C11614k mo34254a(Factory factory) {
            if (factory != null) {
                this.f30164l.add(factory);
                return this;
            }
            throw new IllegalArgumentException("Factory must not be null.");
        }

        /* renamed from: a */
        public Analytics mo34255a() {
            if (C11692b.m30721c((CharSequence) this.f30159g)) {
                this.f30159g = this.f30154b;
            }
            synchronized (Analytics.f30097A) {
                if (!Analytics.f30097A.contains(this.f30159g)) {
                    Analytics.f30097A.add(this.f30159g);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Duplicate analytics client created with tag: ");
                    sb.append(this.f30159g);
                    sb.append(". If you want to use multiple Analytics clients, use a different writeKey or set a tag via the builder during construction.");
                    throw new IllegalStateException(sb.toString());
                }
            }
            if (this.f30158f == null) {
                this.f30158f = new C11648i();
            }
            if (this.f30160h == null) {
                this.f30160h = C11615l.NONE;
            }
            if (this.f30161i == null) {
                this.f30161i = new C11693a();
            }
            if (this.f30163k == null) {
                this.f30163k = new C11629e();
            }
            if (this.f30169q == null) {
                this.f30169q = C11630f.m30484a();
            }
            C11681p pVar = new C11681p();
            C11621c cVar = C11621c.f30189c;
            C11624d dVar = new C11624d(this.f30154b, this.f30163k);
            C11667a aVar = new C11667a(this.f30153a, cVar, this.f30159g);
            C11620b bVar = new C11620b(C11692b.m30713b(this.f30153a, this.f30159g), "opt-out", false);
            C11684a aVar2 = new C11684a(this.f30153a, cVar, this.f30159g);
            if (!aVar2.mo34440c() || aVar2.mo34439b() == null) {
                aVar2.mo34438a(C11683q.m30644h());
            }
            C11657e b = C11657e.m30558b(this.f30160h);
            C11616a a = C11616a.m30430a((Context) this.f30153a, (C11683q) aVar2.mo34439b(), this.f30155c);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            a.mo34261a((Context) this.f30153a, countDownLatch, b);
            ArrayList arrayList = new ArrayList(this.f30164l.size() + 1);
            arrayList.add(C11674o.f30266o);
            arrayList.addAll(this.f30164l);
            List a2 = C11692b.m30704a(this.f30165m);
            ExecutorService executorService = this.f30162j;
            if (executorService == null) {
                executorService = Executors.newSingleThreadExecutor();
            }
            ExecutorService executorService2 = executorService;
            Application application = this.f30153a;
            Analytics analytics = new Analytics(application, this.f30161i, pVar, aVar2, a, this.f30158f, b, this.f30159g, Collections.unmodifiableList(arrayList), dVar, cVar, aVar, this.f30154b, this.f30156d, this.f30157e, executorService2, this.f30166n, countDownLatch, this.f30167o, this.f30168p, bVar, this.f30169q, a2);
            return analytics;
        }
    }

    /* renamed from: com.segment.analytics.Analytics$l */
    public enum C11615l {
        NONE,
        INFO,
        DEBUG,
        BASIC,
        VERBOSE
    }

    Analytics(Application application, ExecutorService executorService, C11681p pVar, C11684a aVar, C11616a aVar2, C11648i iVar, C11657e eVar, String str, List<Factory> list, C11624d dVar, C11621c cVar, C11667a aVar3, String str2, int i, long j, ExecutorService executorService2, boolean z, CountDownLatch countDownLatch, boolean z2, boolean z3, C11620b bVar, C11630f fVar, List<Middleware> list2) {
        Application application2 = application;
        C11657e eVar2 = eVar;
        String str3 = str;
        ExecutorService executorService3 = executorService2;
        this.f30101a = application2;
        this.f30102b = executorService;
        this.f30103c = pVar;
        this.f30106f = aVar;
        this.f30107g = aVar2;
        this.f30105e = iVar;
        this.f30108h = eVar2;
        this.f30109i = str3;
        this.f30110j = dVar;
        this.f30111k = cVar;
        this.f30112l = aVar3;
        this.f30116p = str2;
        this.f30117q = i;
        this.f30118r = j;
        this.f30119s = countDownLatch;
        this.f30121u = bVar;
        this.f30123w = list;
        this.f30120t = executorService3;
        this.f30113m = fVar;
        this.f30104d = list2;
        m30404i();
        executorService3.submit(new C11605e());
        eVar.mo34347a("Created analytics client for project with tag:%s.", str3);
        C11607f fVar2 = new C11607f(z, z3, executorService2, z2);
        this.f30114n = fVar2;
        application.registerActivityLifecycleCallbacks(this.f30114n);
    }

    /* renamed from: a */
    public static void m30400a(Analytics analytics) {
        synchronized (Analytics.class) {
            if (f30098B == null) {
                f30098B = analytics;
            } else {
                throw new IllegalStateException("Singleton instance already exists.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|(1:12)|(1:14)|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.segment.analytics.Analytics m30401b(android.content.Context r4) {
        /*
            com.segment.analytics.Analytics r0 = f30098B
            if (r0 != 0) goto L_0x0046
            if (r4 == 0) goto L_0x003e
            java.lang.Class<com.segment.analytics.Analytics> r0 = com.segment.analytics.Analytics.class
            monitor-enter(r0)
            com.segment.analytics.Analytics r1 = f30098B     // Catch:{ all -> 0x003b }
            if (r1 != 0) goto L_0x0039
            java.lang.String r1 = "analytics_write_key"
            java.lang.String r1 = com.segment.analytics.p326t.C11692b.m30700a(r4, r1)     // Catch:{ all -> 0x003b }
            com.segment.analytics.Analytics$k r2 = new com.segment.analytics.Analytics$k     // Catch:{ all -> 0x003b }
            r2.<init>(r4, r1)     // Catch:{ all -> 0x003b }
            java.lang.String r1 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0033 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0033 }
            r3 = 0
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0033 }
            int r4 = r4.flags     // Catch:{ NameNotFoundException -> 0x0033 }
            r4 = r4 & 2
            if (r4 == 0) goto L_0x002c
            r3 = 1
        L_0x002c:
            if (r3 == 0) goto L_0x0033
            com.segment.analytics.Analytics$l r4 = com.segment.analytics.Analytics.C11615l.INFO     // Catch:{ NameNotFoundException -> 0x0033 }
            r2.mo34253a(r4)     // Catch:{ NameNotFoundException -> 0x0033 }
        L_0x0033:
            com.segment.analytics.Analytics r4 = r2.mo34255a()     // Catch:{ all -> 0x003b }
            f30098B = r4     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            goto L_0x0046
        L_0x003b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r4
        L_0x003e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Context must not be null."
            r4.<init>(r0)
            throw r4
        L_0x0046:
            com.segment.analytics.Analytics r4 = f30098B
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.Analytics.m30401b(android.content.Context):com.segment.analytics.Analytics");
    }

    /* renamed from: g */
    private void m30402g() {
        if (this.f30125y) {
            throw new IllegalStateException("Cannot enqueue messages after client is shutdown.");
        }
    }

    /* renamed from: h */
    private C11666k m30403h() {
        try {
            C11666k kVar = (C11666k) this.f30102b.submit(new C11602b()).get();
            this.f30112l.mo34438a(kVar);
            return kVar;
        } catch (InterruptedException e) {
            this.f30108h.mo34348a(e, "Thread interrupted while fetching settings.", new Object[0]);
            return null;
        } catch (ExecutionException e2) {
            this.f30108h.mo34348a(e2, "Unable to fetch settings. Retrying in %s ms.", Long.valueOf(60000));
            return null;
        }
    }

    /* renamed from: i */
    private void m30404i() {
        SharedPreferences b = C11692b.m30713b(this.f30101a, this.f30109i);
        C11620b bVar = new C11620b(b, "namespaceSharedPreferences", true);
        if (bVar.mo34281a()) {
            C11692b.m30708a(this.f30101a.getSharedPreferences("analytics-android", 0), b);
            bVar.mo34280a(false);
        }
    }

    /* renamed from: j */
    private void m30405j() {
        try {
            this.f30119s.await(15, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            this.f30108h.mo34348a(e, "Thread interrupted while waiting for advertising ID.", new Object[0]);
        }
        if (this.f30119s.getCount() == 1) {
            this.f30108h.mo34347a("Advertising ID may not be collected because the API did not respond within 15 seconds.", new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C11666k mo34229c() {
        C11666k kVar = (C11666k) this.f30112l.mo34439b();
        if (C11692b.m30718b((Map) kVar)) {
            return m30403h();
        }
        if (kVar.mo34371d() + 86400000 > System.currentTimeMillis()) {
            return kVar;
        }
        C11666k h = m30403h();
        return C11692b.m30718b((Map) h) ? kVar : h;
    }

    /* renamed from: d */
    public void mo34230d() {
        C11692b.m30713b(this.f30101a, this.f30109i).edit().clear().apply();
        this.f30106f.mo34437a();
        this.f30106f.mo34438a(C11683q.m30644h());
        this.f30107g.mo34263a((C11683q) this.f30106f.mo34439b());
        mo34227b(C11633h.f30204a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo34231e() {
        PackageInfo a = m30399a((Context) this.f30101a);
        String str = a.versionName;
        int i = a.versionCode;
        SharedPreferences b = C11692b.m30713b(this.f30101a, this.f30109i);
        String str2 = "version";
        String string = b.getString(str2, null);
        String str3 = "build";
        int i2 = b.getInt(str3, -1);
        if (i2 == -1) {
            C11668l lVar = new C11668l();
            lVar.mo34265b(str2, (Object) str);
            lVar.mo34265b(str3, (Object) Integer.valueOf(i));
            mo34221a("Application Installed", lVar);
        } else if (i != i2) {
            C11668l lVar2 = new C11668l();
            lVar2.mo34265b(str2, (Object) str);
            lVar2.mo34265b(str3, (Object) Integer.valueOf(i));
            lVar2.mo34265b("previous_version", (Object) string);
            lVar2.mo34265b("previous_build", (Object) Integer.valueOf(i2));
            mo34221a("Application Updated", lVar2);
        }
        C11668l lVar3 = new C11668l();
        lVar3.mo34265b(str2, (Object) str);
        lVar3.mo34265b(str3, (Object) Integer.valueOf(i));
        mo34221a("Application Opened", lVar3);
        Editor edit = b.edit();
        edit.putString(str2, str);
        edit.putInt(str3, i);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo34232f() {
        C11620b bVar = new C11620b(C11692b.m30713b(this.f30101a, this.f30109i), "tracked_attribution", false);
        if (!bVar.mo34281a()) {
            m30405j();
            C11627c cVar = null;
            try {
                cVar = this.f30110j.mo34289a();
                this.f30111k.mo34285a((Map<?, ?>) this.f30107g, (Writer) new BufferedWriter(new OutputStreamWriter(cVar.f30199g)));
                mo34221a("Install Attributed", new C11668l(this.f30111k.mo34283a((Reader) C11692b.m30695a(C11692b.m30696a(cVar.f30197e)))));
                bVar.mo34280a(true);
            } catch (IOException e) {
                this.f30108h.mo34348a(e, "Unable to track attribution information. Retrying on next launch.", new Object[0]);
            } catch (Throwable th) {
                C11692b.m30709a((Closeable) cVar);
                throw th;
            }
            C11692b.m30709a((Closeable) cVar);
        }
    }

    /* renamed from: a */
    static PackageInfo m30399a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Package not found: ");
            sb.append(context.getPackageName());
            throw new AssertionError(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34216a(Activity activity) {
        PackageManager packageManager = activity.getPackageManager();
        try {
            mo34224a((String) null, packageManager.getActivityInfo(activity.getComponentName(), 128).loadLabel(packageManager).toString());
        } catch (NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Activity Not Found: ");
            sb.append(e.toString());
            throw new AssertionError(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34227b(C11633h hVar) {
        if (!this.f30125y) {
            this.f30120t.submit(new C11609g(hVar));
        }
    }

    /* renamed from: a */
    public void mo34223a(String str, C11683q qVar, C11648i iVar) {
        m30402g();
        if (!C11692b.m30721c((CharSequence) str) || !C11692b.m30718b((Map) qVar)) {
            C11683q qVar2 = (C11683q) this.f30106f.mo34439b();
            if (!C11692b.m30721c((CharSequence) str)) {
                qVar2.mo34407c(str);
            }
            if (!C11692b.m30718b((Map) qVar)) {
                qVar2.putAll(qVar);
            }
            this.f30106f.mo34438a(qVar2);
            this.f30107g.mo34263a(qVar2);
            this.f30120t.submit(new C11611h(iVar));
            return;
        }
        throw new IllegalArgumentException("Either userId or some traits must be provided.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34228b(C11650b bVar) {
        C11633h hVar;
        this.f30108h.mo34350c("Running payload %s.", bVar);
        int i = C11603c.f30129a[bVar.mo34333c().ordinal()];
        if (i == 1) {
            hVar = C11633h.m30497a((C11655d) bVar);
        } else if (i == 2) {
            hVar = C11633h.m30495a((C11649a) bVar);
        } else if (i == 3) {
            hVar = C11633h.m30496a((C11654c) bVar);
        } else if (i == 4) {
            hVar = C11633h.m30499a((C11660g) bVar);
        } else if (i == 5) {
            hVar = C11633h.m30498a((C11658f) bVar);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("unknown type ");
            sb.append(bVar.mo34333c());
            throw new AssertionError(sb.toString());
        }
        f30100z.post(new C11601a(hVar));
    }

    /* renamed from: b */
    public C11657e mo34226b() {
        return this.f30108h;
    }

    /* renamed from: a */
    public void mo34221a(String str, C11668l lVar) {
        mo34222a(str, lVar, (C11648i) null);
    }

    /* renamed from: a */
    public void mo34222a(String str, C11668l lVar, C11648i iVar) {
        m30402g();
        if (!C11692b.m30721c((CharSequence) str)) {
            this.f30120t.submit(new C11612i(iVar, lVar, str));
            return;
        }
        throw new IllegalArgumentException("event must not be null or empty.");
    }

    /* renamed from: a */
    public void mo34224a(String str, String str2) {
        mo34225a(str, str2, null, null);
    }

    /* renamed from: a */
    public void mo34225a(String str, String str2, C11668l lVar, C11648i iVar) {
        m30402g();
        if (!C11692b.m30721c((CharSequence) str) || !C11692b.m30721c((CharSequence) str2)) {
            ExecutorService executorService = this.f30120t;
            C11613j jVar = new C11613j(iVar, lVar, str2, str);
            executorService.submit(jVar);
            return;
        }
        throw new IllegalArgumentException("either category or name must be provided.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34218a(C11651a<?, ?> aVar, C11648i iVar) {
        m30405j();
        C11616a f = this.f30107g.mo34271f();
        aVar.mo34336a((Map<String, ?>) f);
        aVar.mo34335a(f.mo34270e().mo34406b());
        aVar.mo34341b(iVar.mo34318a());
        String g = f.mo34270e().mo34412g();
        if (!C11692b.m30721c((CharSequence) g)) {
            aVar.mo34340b(g);
        }
        mo34219a(aVar.mo34337a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34219a(C11650b bVar) {
        if (!this.f30121u.mo34281a()) {
            this.f30108h.mo34350c("Created payload %s.", bVar);
            new C11673n(0, bVar, this.f30104d, this).proceed(bVar);
        }
    }

    /* renamed from: a */
    public Application mo34214a() {
        return this.f30101a;
    }

    /* renamed from: a */
    public C11657e mo34215a(String str) {
        return this.f30108h.mo34346a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34220a(C11666k kVar) {
        C11685r b = kVar.mo34369b();
        this.f30124x = new LinkedHashMap(this.f30123w.size());
        for (int i = 0; i < this.f30123w.size(); i++) {
            Factory factory = (Factory) this.f30123w.get(i);
            String key = factory.key();
            C11685r b2 = b.mo34422b(key);
            if (C11692b.m30718b((Map) b2)) {
                this.f30108h.mo34347a("Integration %s is not enabled.", key);
            } else {
                Integration create = factory.create(b2, this);
                if (create == null) {
                    this.f30108h.mo34349b("Factory %s couldn't create integration.", factory);
                } else {
                    this.f30124x.put(key, create);
                    this.f30122v.put(key, Boolean.valueOf(false));
                }
            }
        }
        this.f30123w = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34217a(C11633h hVar) {
        for (Entry entry : this.f30124x.entrySet()) {
            String str = (String) entry.getKey();
            long nanoTime = System.nanoTime();
            hVar.mo34303a(str, (Integration) entry.getValue(), this.f30115o);
            long nanoTime2 = System.nanoTime() - nanoTime;
            this.f30103c.mo34402a(str, TimeUnit.NANOSECONDS.toMillis(nanoTime2));
            this.f30108h.mo34347a("Ran %s on integration %s in %d ns.", hVar, str, Long.valueOf(nanoTime2));
        }
    }
}
