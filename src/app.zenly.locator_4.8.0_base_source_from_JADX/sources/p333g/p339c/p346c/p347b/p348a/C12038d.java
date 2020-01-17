package p333g.p339c.p346c.p347b.p348a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9529f;
import com.facebook.common.internal.C9532i;
import com.facebook.common.internal.C9532i.C9534b;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.C9543a;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.datasource.DataSource;
import com.facebook.drawable.base.DrawableWithCaches;
import com.facebook.drawee.backends.pipeline.info.C9576a;
import com.facebook.drawee.backends.pipeline.info.C9580e;
import com.facebook.drawee.backends.pipeline.info.ImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.drawee.controller.C9589a;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.debug.listener.C9598a;
import com.facebook.drawee.drawable.C9623m;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import p333g.p339c.p346c.p347b.p348a.p349h.C12043a;
import p333g.p339c.p346c.p350c.C12044a;

/* renamed from: g.c.c.b.a.d */
public class C12038d extends C9589a<CloseableReference<C9730c>, ImageInfo> {

    /* renamed from: H */
    private static final Class<?> f31347H = C12038d.class;

    /* renamed from: A */
    private Supplier<DataSource<CloseableReference<C9730c>>> f31348A;

    /* renamed from: B */
    private boolean f31349B;

    /* renamed from: C */
    private C9529f<DrawableFactory> f31350C;

    /* renamed from: D */
    private C9580e f31351D;

    /* renamed from: E */
    private Set<RequestListener> f31352E;

    /* renamed from: F */
    private ImageOriginListener f31353F;

    /* renamed from: G */
    private C12043a f31354G;

    /* renamed from: w */
    private final DrawableFactory f31355w;

    /* renamed from: x */
    private final C9529f<DrawableFactory> f31356x;

    /* renamed from: y */
    private final MemoryCache<CacheKey, C9730c> f31357y;

    /* renamed from: z */
    private CacheKey f31358z;

    public C12038d(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory drawableFactory, Executor executor, MemoryCache<CacheKey, C9730c> memoryCache, C9529f<DrawableFactory> fVar) {
        super(deferredReleaser, executor, null, null);
        this.f31355w = new C12035a(resources, drawableFactory);
        this.f31356x = fVar;
        this.f31357y = memoryCache;
    }

    public boolean isSameImageRequest(DraweeController draweeController) {
        CacheKey cacheKey = this.f31358z;
        if (cacheKey == null || !(draweeController instanceof C12038d)) {
            return false;
        }
        return C9532i.m23264a(cacheKey, ((C12038d) draweeController).mo35692k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo35691j() {
        synchronized (this) {
            this.f31353F = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public CacheKey mo35692k() {
        return this.f31358z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return r1;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.facebook.imagepipeline.listener.RequestListener mo35693l() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
            com.facebook.drawee.backends.pipeline.info.ImageOriginListener r1 = r3.f31353F     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0011
            com.facebook.drawee.backends.pipeline.info.b r0 = new com.facebook.drawee.backends.pipeline.info.b     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = r3.mo25863f()     // Catch:{ all -> 0x0025 }
            com.facebook.drawee.backends.pipeline.info.ImageOriginListener r2 = r3.f31353F     // Catch:{ all -> 0x0025 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0025 }
        L_0x0011:
            java.util.Set<com.facebook.imagepipeline.listener.RequestListener> r1 = r3.f31352E     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            com.facebook.imagepipeline.listener.b r1 = new com.facebook.imagepipeline.listener.b     // Catch:{ all -> 0x0025 }
            java.util.Set<com.facebook.imagepipeline.listener.RequestListener> r2 = r3.f31352E     // Catch:{ all -> 0x0025 }
            r1.<init>(r2)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0021
            r1.mo26449a(r0)     // Catch:{ all -> 0x0025 }
        L_0x0021:
            monitor-exit(r3)
            return r1
        L_0x0023:
            monitor-exit(r3)
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p339c.p346c.p347b.p348a.C12038d.mo35693l():com.facebook.imagepipeline.listener.RequestListener");
    }

    public void setHierarchy(DraweeHierarchy draweeHierarchy) {
        super.setHierarchy(draweeHierarchy);
        m31718a((C9730c) null);
    }

    public String toString() {
        C9534b a = C9532i.m23262a((Object) this);
        a.mo25665a("super", (Object) super.toString());
        a.mo25665a("dataSourceSupplier", (Object) this.f31348A);
        return a.toString();
    }

    /* renamed from: b */
    public void mo35688b(boolean z) {
        this.f31349B = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ImageInfo mo25860d(CloseableReference<C9730c> closeableReference) {
        C9536j.m23279b(CloseableReference.m23356c(closeableReference));
        return (ImageInfo) closeableReference.mo25724b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public DataSource<CloseableReference<C9730c>> mo25859d() {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("PipelineDraweeController#getDataSource");
        }
        if (C9543a.m23311a(2)) {
            C9543a.m23313b(f31347H, "controller %x: getDataSource", (Object) Integer.valueOf(System.identityHashCode(this)));
        }
        DataSource<CloseableReference<C9730c>> dataSource = (DataSource) this.f31348A.get();
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return dataSource;
    }

    /* renamed from: a */
    public void mo35678a(Supplier<DataSource<CloseableReference<C9730c>>> supplier, String str, CacheKey cacheKey, Object obj, C9529f<DrawableFactory> fVar, ImageOriginListener imageOriginListener) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("PipelineDraweeController#initialize");
        }
        super.mo25850a(str, obj);
        m31717a(supplier);
        this.f31358z = cacheKey;
        mo35679a(fVar);
        mo35691j();
        m31718a((C9730c) null);
        mo35680a(imageOriginListener);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* renamed from: b */
    public synchronized void mo35687b(RequestListener requestListener) {
        if (this.f31352E != null) {
            this.f31352E.remove(requestListener);
        }
    }

    /* renamed from: b */
    public synchronized void mo35686b(ImageOriginListener imageOriginListener) {
        if (this.f31353F instanceof C9576a) {
            ((C9576a) this.f31353F).mo25785b(imageOriginListener);
        } else if (this.f31353F != null) {
            this.f31353F = new C9576a(this.f31353F, imageOriginListener);
        } else {
            this.f31353F = imageOriginListener;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo25862e(CloseableReference<C9730c> closeableReference) {
        CloseableReference.m23355b(closeableReference);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo35681a(ImagePerfDataListener imagePerfDataListener) {
        if (this.f31351D != null) {
            this.f31351D.mo25794c();
        }
        if (imagePerfDataListener != null) {
            if (this.f31351D == null) {
                this.f31351D = new C9580e(AwakeTimeSinceBootClock.get(), this);
            }
            this.f31351D.mo25789a(imagePerfDataListener);
            this.f31351D.mo25791a(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo25857c(CloseableReference<C9730c> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.mo25725c();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo35679a(C9529f<DrawableFactory> fVar) {
        this.f31350C = fVar;
    }

    /* renamed from: a */
    public synchronized void mo35683a(RequestListener requestListener) {
        if (this.f31352E == null) {
            this.f31352E = new HashSet();
        }
        this.f31352E.add(requestListener);
    }

    /* renamed from: a */
    public synchronized void mo35680a(ImageOriginListener imageOriginListener) {
        if (this.f31353F instanceof C9576a) {
            ((C9576a) this.f31353F).mo25784a(imageOriginListener);
        } else if (this.f31353F != null) {
            this.f31353F = new C9576a(this.f31353F, imageOriginListener);
        } else {
            this.f31353F = imageOriginListener;
        }
    }

    /* renamed from: a */
    private void m31717a(Supplier<DataSource<CloseableReference<C9730c>>> supplier) {
        this.f31348A = supplier;
        m31718a((C9730c) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo25844a(CloseableReference<C9730c> closeableReference) {
        try {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("PipelineDraweeController#createDrawable");
            }
            C9536j.m23279b(CloseableReference.m23356c(closeableReference));
            C9730c cVar = (C9730c) closeableReference.mo25724b();
            m31718a(cVar);
            Drawable a = m31716a(this.f31350C, cVar);
            if (a != null) {
                return a;
            }
            Drawable a2 = m31716a(this.f31356x, cVar);
            if (a2 != null) {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
                return a2;
            }
            Drawable createDrawable = this.f31355w.createDrawable(cVar);
            if (createDrawable != null) {
                if (FrescoSystrace.m24705c()) {
                    FrescoSystrace.m24702a();
                }
                return createDrawable;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unrecognized image class: ");
            sb.append(cVar);
            throw new UnsupportedOperationException(sb.toString());
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* renamed from: a */
    private Drawable m31716a(C9529f<DrawableFactory> fVar, C9730c cVar) {
        if (fVar == null) {
            return null;
        }
        Iterator it = fVar.iterator();
        while (it.hasNext()) {
            DrawableFactory drawableFactory = (DrawableFactory) it.next();
            if (drawableFactory.supportsImageType(cVar)) {
                Drawable createDrawable = drawableFactory.createDrawable(cVar);
                if (createDrawable != null) {
                    return createDrawable;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m31718a(C9730c cVar) {
        if (this.f31349B) {
            if (mo25858c() == null) {
                C12044a aVar = new C12044a();
                C9598a aVar2 = new C9598a(aVar);
                this.f31354G = new C12043a();
                mo25847a((ControllerListener<? super INFO>) aVar2);
                mo25854b((Drawable) aVar);
            }
            if (this.f31353F == null) {
                mo35680a((ImageOriginListener) this.f31354G);
            }
            if (mo25858c() instanceof C12044a) {
                mo35682a(cVar, (C12044a) mo25858c());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35682a(C9730c cVar, C12044a aVar) {
        aVar.mo35706a(mo25863f());
        DraweeHierarchy hierarchy = getHierarchy();
        ScaleType scaleType = null;
        if (hierarchy != null) {
            C9623m a = ScalingUtils.m23570a(hierarchy.getTopLevelDrawable());
            if (a != null) {
                scaleType = a.mo26026b();
            }
        }
        aVar.mo35705a(scaleType);
        aVar.mo35707b(this.f31354G.mo35700a());
        if (cVar != null) {
            aVar.mo35704a(cVar.getWidth(), cVar.getHeight());
            aVar.mo35703a(cVar.mo26406a());
            return;
        }
        aVar.mo35702a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25846a(Drawable drawable) {
        if (drawable instanceof DrawableWithCaches) {
            ((DrawableWithCaches) drawable).dropCaches();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public CloseableReference<C9730c> m31722a() {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("PipelineDraweeController#getCachedImage");
        }
        try {
            if (this.f31357y != null) {
                if (this.f31358z != null) {
                    CloseableReference<C9730c> closeableReference = this.f31357y.get(this.f31358z);
                    if (closeableReference == null || ((C9730c) closeableReference.mo25724b()).getQualityInfo().isOfFullQuality()) {
                        if (FrescoSystrace.m24705c()) {
                            FrescoSystrace.m24702a();
                        }
                        return closeableReference;
                    }
                    closeableReference.close();
                    if (FrescoSystrace.m24705c()) {
                        FrescoSystrace.m24702a();
                    }
                    return null;
                }
            }
            return null;
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25856b(String str, CloseableReference<C9730c> closeableReference) {
        super.mo25856b(str, closeableReference);
        synchronized (this) {
            if (this.f31353F != null) {
                this.f31353F.onImageLoaded(str, 5, true, "PipelineDraweeController");
            }
        }
    }
}
