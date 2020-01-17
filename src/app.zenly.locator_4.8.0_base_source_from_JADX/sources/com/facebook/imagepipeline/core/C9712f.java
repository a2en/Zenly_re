package com.facebook.imagepipeline.core;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.cache.disk.C9500c;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.C9546b;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.common.webp.C9560a;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpBitmapFactory.WebpErrorLogger;
import com.facebook.imagepipeline.cache.C9676d;
import com.facebook.imagepipeline.cache.C9684g;
import com.facebook.imagepipeline.cache.C9685h;
import com.facebook.imagepipeline.cache.C9686i;
import com.facebook.imagepipeline.cache.C9692m;
import com.facebook.imagepipeline.cache.C9695o;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.CountingMemoryCache.CacheTrimStrategy;
import com.facebook.imagepipeline.cache.ImageCacheStatsTracker;
import com.facebook.imagepipeline.core.ImagePipelineExperiments.C9704b;
import com.facebook.imagepipeline.debug.C9721a;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;
import com.facebook.imagepipeline.decoder.C9726b;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.memory.C9739a0;
import com.facebook.imagepipeline.memory.C9743b0;
import com.facebook.imagepipeline.producers.C9869s;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p333g.p339c.p352d.p355b.C12056d;
import p333g.p339c.p352d.p355b.C12058f;

/* renamed from: com.facebook.imagepipeline.core.f */
public class C9712f {

    /* renamed from: D */
    private static C9715c f25408D = new C9715c(null);

    /* renamed from: A */
    private final boolean f25409A;

    /* renamed from: B */
    private final CallerContextVerifier f25410B;

    /* renamed from: C */
    private final CloseableReferenceLeakTracker f25411C;

    /* renamed from: a */
    private final Config f25412a;

    /* renamed from: b */
    private final Supplier<C9692m> f25413b;

    /* renamed from: c */
    private final CacheTrimStrategy f25414c;

    /* renamed from: d */
    private final CacheKeyFactory f25415d;

    /* renamed from: e */
    private final Context f25416e;

    /* renamed from: f */
    private final boolean f25417f;

    /* renamed from: g */
    private final FileCacheFactory f25418g;

    /* renamed from: h */
    private final Supplier<C9692m> f25419h;

    /* renamed from: i */
    private final ExecutorSupplier f25420i;

    /* renamed from: j */
    private final ImageCacheStatsTracker f25421j;

    /* renamed from: k */
    private final ImageDecoder f25422k;

    /* renamed from: l */
    private final ImageTranscoderFactory f25423l;

    /* renamed from: m */
    private final Integer f25424m;

    /* renamed from: n */
    private final Supplier<Boolean> f25425n;

    /* renamed from: o */
    private final C9500c f25426o;

    /* renamed from: p */
    private final MemoryTrimmableRegistry f25427p;

    /* renamed from: q */
    private final int f25428q;

    /* renamed from: r */
    private final NetworkFetcher f25429r;

    /* renamed from: s */
    private final int f25430s;

    /* renamed from: t */
    private final C9743b0 f25431t;

    /* renamed from: u */
    private final ProgressiveJpegConfig f25432u;

    /* renamed from: v */
    private final Set<RequestListener> f25433v;

    /* renamed from: w */
    private final boolean f25434w;

    /* renamed from: x */
    private final C9500c f25435x;

    /* renamed from: y */
    private final C9726b f25436y;

    /* renamed from: z */
    private final ImagePipelineExperiments f25437z;

    /* renamed from: com.facebook.imagepipeline.core.f$a */
    class C9713a implements Supplier<Boolean> {
        C9713a(C9712f fVar) {
        }

        public Boolean get() {
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.f$b */
    public static class C9714b {
        /* access modifiers changed from: private */

        /* renamed from: A */
        public final C9704b f25438A;
        /* access modifiers changed from: private */

        /* renamed from: B */
        public boolean f25439B;
        /* access modifiers changed from: private */

        /* renamed from: C */
        public CallerContextVerifier f25440C;
        /* access modifiers changed from: private */

        /* renamed from: D */
        public CloseableReferenceLeakTracker f25441D;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Config f25442a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Supplier<C9692m> f25443b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public CacheTrimStrategy f25444c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public CacheKeyFactory f25445d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Context f25446e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f25447f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public Supplier<C9692m> f25448g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public ExecutorSupplier f25449h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public ImageCacheStatsTracker f25450i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public ImageDecoder f25451j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public ImageTranscoderFactory f25452k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public Integer f25453l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public Supplier<Boolean> f25454m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public C9500c f25455n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public MemoryTrimmableRegistry f25456o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public Integer f25457p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public NetworkFetcher f25458q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public C12058f f25459r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public C9743b0 f25460s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public ProgressiveJpegConfig f25461t;
        /* access modifiers changed from: private */

        /* renamed from: u */
        public Set<RequestListener> f25462u;
        /* access modifiers changed from: private */

        /* renamed from: v */
        public boolean f25463v;
        /* access modifiers changed from: private */

        /* renamed from: w */
        public C9500c f25464w;
        /* access modifiers changed from: private */

        /* renamed from: x */
        public FileCacheFactory f25465x;
        /* access modifiers changed from: private */

        /* renamed from: y */
        public C9726b f25466y;
        /* access modifiers changed from: private */

        /* renamed from: z */
        public int f25467z;

        /* synthetic */ C9714b(Context context, C9713a aVar) {
            this(context);
        }

        private C9714b(Context context) {
            this.f25447f = false;
            this.f25453l = null;
            this.f25457p = null;
            this.f25463v = true;
            this.f25467z = -1;
            this.f25438A = new C9704b(this);
            this.f25439B = true;
            this.f25441D = new C9721a();
            C9536j.m23271a(context);
            this.f25446e = context;
        }

        /* renamed from: a */
        public C9712f mo26338a() {
            return new C9712f(this, null);
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.f$c */
    public static class C9715c {

        /* renamed from: a */
        private boolean f25468a;

        /* synthetic */ C9715c(C9713a aVar) {
            this();
        }

        /* renamed from: a */
        public boolean mo26339a() {
            return this.f25468a;
        }

        private C9715c() {
            this.f25468a = false;
        }
    }

    /* synthetic */ C9712f(C9714b bVar, C9713a aVar) {
        this(bVar);
    }

    /* renamed from: C */
    public static C9715c m23901C() {
        return f25408D;
    }

    /* renamed from: a */
    private static void m23905a(WebpBitmapFactory webpBitmapFactory, ImagePipelineExperiments imagePipelineExperiments, BitmapCreator bitmapCreator) {
        C9560a.f24762c = webpBitmapFactory;
        WebpErrorLogger i = imagePipelineExperiments.mo26293i();
        if (i != null) {
            webpBitmapFactory.setWebpErrorLogger(i);
        }
        if (bitmapCreator != null) {
            webpBitmapFactory.setBitmapCreator(bitmapCreator);
        }
    }

    /* renamed from: A */
    public boolean mo26310A() {
        return this.f25417f;
    }

    /* renamed from: B */
    public boolean mo26311B() {
        return this.f25434w;
    }

    /* renamed from: b */
    public Supplier<C9692m> mo26313b() {
        return this.f25413b;
    }

    /* renamed from: c */
    public CacheTrimStrategy mo26314c() {
        return this.f25414c;
    }

    /* renamed from: d */
    public CacheKeyFactory mo26315d() {
        return this.f25415d;
    }

    /* renamed from: e */
    public CallerContextVerifier mo26316e() {
        return this.f25410B;
    }

    /* renamed from: f */
    public CloseableReferenceLeakTracker mo26317f() {
        return this.f25411C;
    }

    /* renamed from: g */
    public Context mo26318g() {
        return this.f25416e;
    }

    /* renamed from: h */
    public Supplier<C9692m> mo26319h() {
        return this.f25419h;
    }

    /* renamed from: i */
    public ExecutorSupplier mo26320i() {
        return this.f25420i;
    }

    /* renamed from: j */
    public ImagePipelineExperiments mo26321j() {
        return this.f25437z;
    }

    /* renamed from: k */
    public FileCacheFactory mo26322k() {
        return this.f25418g;
    }

    /* renamed from: l */
    public ImageCacheStatsTracker mo26323l() {
        return this.f25421j;
    }

    /* renamed from: m */
    public ImageDecoder mo26324m() {
        return this.f25422k;
    }

    /* renamed from: n */
    public C9726b mo26325n() {
        return this.f25436y;
    }

    /* renamed from: o */
    public ImageTranscoderFactory mo26326o() {
        return this.f25423l;
    }

    /* renamed from: p */
    public Integer mo26327p() {
        return this.f25424m;
    }

    /* renamed from: q */
    public Supplier<Boolean> mo26328q() {
        return this.f25425n;
    }

    /* renamed from: r */
    public C9500c mo26329r() {
        return this.f25426o;
    }

    /* renamed from: s */
    public int mo26330s() {
        return this.f25428q;
    }

    /* renamed from: t */
    public MemoryTrimmableRegistry mo26331t() {
        return this.f25427p;
    }

    /* renamed from: u */
    public NetworkFetcher mo26332u() {
        return this.f25429r;
    }

    /* renamed from: v */
    public C9743b0 mo26333v() {
        return this.f25431t;
    }

    /* renamed from: w */
    public ProgressiveJpegConfig mo26334w() {
        return this.f25432u;
    }

    /* renamed from: x */
    public Set<RequestListener> mo26335x() {
        return Collections.unmodifiableSet(this.f25433v);
    }

    /* renamed from: y */
    public C9500c mo26336y() {
        return this.f25435x;
    }

    /* renamed from: z */
    public boolean mo26337z() {
        return this.f25409A;
    }

    private C9712f(C9714b bVar) {
        Supplier<C9692m> supplier;
        CacheTrimStrategy cacheTrimStrategy;
        CacheKeyFactory cacheKeyFactory;
        FileCacheFactory fileCacheFactory;
        Supplier<C9692m> supplier2;
        ImageCacheStatsTracker imageCacheStatsTracker;
        Supplier<Boolean> supplier3;
        C9500c cVar;
        MemoryTrimmableRegistry memoryTrimmableRegistry;
        int i;
        NetworkFetcher networkFetcher;
        C9743b0 b0Var;
        ProgressiveJpegConfig progressiveJpegConfig;
        Set<RequestListener> set;
        C9500c cVar2;
        ExecutorSupplier executorSupplier;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("ImagePipelineConfig()");
        }
        this.f25437z = bVar.f25438A.mo26302a();
        if (bVar.f25443b == null) {
            supplier = new C9684g<>((ActivityManager) bVar.f25446e.getSystemService("activity"));
        } else {
            supplier = bVar.f25443b;
        }
        this.f25413b = supplier;
        if (bVar.f25444c == null) {
            cacheTrimStrategy = new C9676d();
        } else {
            cacheTrimStrategy = bVar.f25444c;
        }
        this.f25414c = cacheTrimStrategy;
        this.f25412a = bVar.f25442a == null ? Config.ARGB_8888 : bVar.f25442a;
        if (bVar.f25445d == null) {
            cacheKeyFactory = C9685h.m23823a();
        } else {
            cacheKeyFactory = bVar.f25445d;
        }
        this.f25415d = cacheKeyFactory;
        Context v = bVar.f25446e;
        C9536j.m23271a(v);
        this.f25416e = v;
        if (bVar.f25465x == null) {
            fileCacheFactory = new C9709c(new C9710d());
        } else {
            fileCacheFactory = bVar.f25465x;
        }
        this.f25418g = fileCacheFactory;
        this.f25417f = bVar.f25447f;
        if (bVar.f25448g == null) {
            supplier2 = new C9686i<>();
        } else {
            supplier2 = bVar.f25448g;
        }
        this.f25419h = supplier2;
        if (bVar.f25450i == null) {
            imageCacheStatsTracker = C9695o.m23830a();
        } else {
            imageCacheStatsTracker = bVar.f25450i;
        }
        this.f25421j = imageCacheStatsTracker;
        this.f25422k = bVar.f25451j;
        this.f25423l = m23904a(bVar);
        this.f25424m = bVar.f25453l;
        if (bVar.f25454m == null) {
            supplier3 = new C9713a<>(this);
        } else {
            supplier3 = bVar.f25454m;
        }
        this.f25425n = supplier3;
        if (bVar.f25455n == null) {
            cVar = m23903a(bVar.f25446e);
        } else {
            cVar = bVar.f25455n;
        }
        this.f25426o = cVar;
        if (bVar.f25456o == null) {
            memoryTrimmableRegistry = C9546b.m23343a();
        } else {
            memoryTrimmableRegistry = bVar.f25456o;
        }
        this.f25427p = memoryTrimmableRegistry;
        this.f25428q = m23902a(bVar, this.f25437z);
        if (bVar.f25467z < 0) {
            i = 30000;
        } else {
            i = bVar.f25467z;
        }
        this.f25430s = i;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("ImagePipelineConfig->mNetworkFetcher");
        }
        if (bVar.f25458q == null) {
            networkFetcher = new C9869s(this.f25430s);
        } else {
            networkFetcher = bVar.f25458q;
        }
        this.f25429r = networkFetcher;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        bVar.f25459r;
        if (bVar.f25460s == null) {
            b0Var = new C9743b0(C9739a0.m24141m().mo26510a());
        } else {
            b0Var = bVar.f25460s;
        }
        this.f25431t = b0Var;
        if (bVar.f25461t == null) {
            progressiveJpegConfig = new SimpleProgressiveJpegConfig();
        } else {
            progressiveJpegConfig = bVar.f25461t;
        }
        this.f25432u = progressiveJpegConfig;
        if (bVar.f25462u == null) {
            set = new HashSet<>();
        } else {
            set = bVar.f25462u;
        }
        this.f25433v = set;
        this.f25434w = bVar.f25463v;
        if (bVar.f25464w == null) {
            cVar2 = this.f25426o;
        } else {
            cVar2 = bVar.f25464w;
        }
        this.f25435x = cVar2;
        this.f25436y = bVar.f25466y;
        int d = this.f25431t.mo26515d();
        if (bVar.f25449h == null) {
            executorSupplier = new C9708b(d);
        } else {
            executorSupplier = bVar.f25449h;
        }
        this.f25420i = executorSupplier;
        this.f25409A = bVar.f25439B;
        this.f25410B = bVar.f25440C;
        this.f25411C = bVar.f25441D;
        WebpBitmapFactory h = this.f25437z.mo26292h();
        if (h != null) {
            m23905a(h, this.f25437z, new C12056d(mo26333v()));
        } else if (this.f25437z.mo26299o() && C9560a.f24760a) {
            WebpBitmapFactory b = C9560a.m23401b();
            if (b != null) {
                m23905a(b, this.f25437z, new C12056d(mo26333v()));
            }
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* renamed from: b */
    public static C9714b m23906b(Context context) {
        return new C9714b(context, null);
    }

    /* renamed from: a */
    private static C9500c m23903a(Context context) {
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return C9500c.m23166a(context).mo25578a();
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* renamed from: a */
    public Config mo26312a() {
        return this.f25412a;
    }

    /* renamed from: a */
    private static ImageTranscoderFactory m23904a(C9714b bVar) {
        if (bVar.f25452k != null && bVar.f25453l != null) {
            throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
        } else if (bVar.f25452k != null) {
            return bVar.f25452k;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    private static int m23902a(C9714b bVar, ImagePipelineExperiments imagePipelineExperiments) {
        if (bVar.f25457p != null) {
            return bVar.f25457p.intValue();
        }
        return imagePipelineExperiments.mo26297m() ? 1 : 0;
    }
}
