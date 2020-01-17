package p333g.p339c.p346c.p347b.p348a;

import android.content.Context;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9529f;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.info.ImageOriginListener;
import com.facebook.drawee.backends.pipeline.info.ImagePerfDataListener;
import com.facebook.drawee.controller.C9592b;
import com.facebook.drawee.controller.C9592b.C9595c;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.core.C9711e;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.C9884a.C9886b;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import java.util.Set;

/* renamed from: g.c.c.b.a.e */
public class C12039e extends C9592b<C12039e, C9884a, CloseableReference<C9730c>, ImageInfo> {

    /* renamed from: s */
    private final C9711e f31359s;

    /* renamed from: t */
    private final C12042g f31360t;

    /* renamed from: u */
    private C9529f<DrawableFactory> f31361u;

    /* renamed from: v */
    private ImageOriginListener f31362v;

    /* renamed from: w */
    private ImagePerfDataListener f31363w;

    /* renamed from: g.c.c.b.a.e$a */
    static /* synthetic */ class C12040a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31364a = new int[C9595c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.drawee.controller.b$c[] r0 = com.facebook.drawee.controller.C9592b.C9595c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31364a = r0
                int[] r0 = f31364a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.drawee.controller.b$c r1 = com.facebook.drawee.controller.C9592b.C9595c.FULL_FETCH     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f31364a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.drawee.controller.b$c r1 = com.facebook.drawee.controller.C9592b.C9595c.DISK_CACHE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f31364a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.drawee.controller.b$c r1 = com.facebook.drawee.controller.C9592b.C9595c.BITMAP_MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p333g.p339c.p346c.p347b.p348a.C12039e.C12040a.<clinit>():void");
        }
    }

    public C12039e(Context context, C12042g gVar, C9711e eVar, Set<ControllerListener> set) {
        super(context, set);
        this.f31359s = eVar;
        this.f31360t = gVar;
    }

    /* renamed from: l */
    private CacheKey m31746l() {
        C9884a aVar = (C9884a) mo25893e();
        CacheKeyFactory c = this.f31359s.mo26309c();
        if (c == null || aVar == null) {
            return null;
        }
        if (aVar.mo26732f() != null) {
            return c.getPostprocessedBitmapCacheKey(aVar, mo25887b());
        }
        return c.getBitmapCacheKey(aVar, mo25887b());
    }

    /* renamed from: a */
    public C12039e mo35696a(ImagePerfDataListener imagePerfDataListener) {
        this.f31363w = imagePerfDataListener;
        mo25896h();
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C12038d m31752i() {
        C12038d dVar;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            DraweeController f = mo25894f();
            String k = C9592b.m23543k();
            if (f instanceof C12038d) {
                dVar = (C12038d) f;
            } else {
                dVar = this.f31360t.mo35697a();
            }
            dVar.mo35678a(mo25878a(dVar, k), k, m31746l(), mo25887b(), this.f31361u, this.f31362v);
            dVar.mo35681a(this.f31363w);
            return dVar;
        } finally {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    public C12039e setUri(Uri uri) {
        if (uri == null) {
            super.mo25885a(null);
            return this;
        }
        ImageRequestBuilder b = ImageRequestBuilder.m24645b(uri);
        b.mo26696a(C9702f.m23855f());
        super.mo25885a(b.mo26703a());
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public DataSource<CloseableReference<C9730c>> mo25882a(DraweeController draweeController, String str, C9884a aVar, Object obj, C9595c cVar) {
        return this.f31359s.mo26305a(aVar, obj, m31745a(cVar), mo35695a(draweeController));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public RequestListener mo35695a(DraweeController draweeController) {
        if (draweeController instanceof C12038d) {
            return ((C12038d) draweeController).mo35693l();
        }
        return null;
    }

    public C12039e setUri(String str) {
        if (str != null && !str.isEmpty()) {
            return setUri(Uri.parse(str));
        }
        super.mo25885a(C9884a.m24678a(str));
        return this;
    }

    /* renamed from: a */
    public static C9886b m31745a(C9595c cVar) {
        int i = C12040a.f31364a[cVar.ordinal()];
        if (i == 1) {
            return C9886b.FULL_FETCH;
        }
        if (i == 2) {
            return C9886b.DISK_CACHE;
        }
        if (i == 3) {
            return C9886b.BITMAP_MEMORY_CACHE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cache level");
        sb.append(cVar);
        sb.append("is not supported. ");
        throw new RuntimeException(sb.toString());
    }
}
