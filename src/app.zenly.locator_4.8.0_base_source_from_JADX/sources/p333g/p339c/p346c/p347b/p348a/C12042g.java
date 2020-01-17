package p333g.p339c.p346c.p347b.p348a;

import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.C9529f;
import com.facebook.common.internal.Supplier;
import com.facebook.drawee.components.DeferredReleaser;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.C9730c;
import java.util.concurrent.Executor;

/* renamed from: g.c.c.b.a.g */
public class C12042g {

    /* renamed from: a */
    private Resources f31370a;

    /* renamed from: b */
    private DeferredReleaser f31371b;

    /* renamed from: c */
    private DrawableFactory f31372c;

    /* renamed from: d */
    private Executor f31373d;

    /* renamed from: e */
    private MemoryCache<CacheKey, C9730c> f31374e;

    /* renamed from: f */
    private C9529f<DrawableFactory> f31375f;

    /* renamed from: g */
    private Supplier<Boolean> f31376g;

    /* renamed from: a */
    public void mo35699a(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory drawableFactory, Executor executor, MemoryCache<CacheKey, C9730c> memoryCache, C9529f<DrawableFactory> fVar, Supplier<Boolean> supplier) {
        this.f31370a = resources;
        this.f31371b = deferredReleaser;
        this.f31372c = drawableFactory;
        this.f31373d = executor;
        this.f31374e = memoryCache;
        this.f31375f = fVar;
        this.f31376g = supplier;
    }

    /* renamed from: a */
    public C12038d mo35697a() {
        C12038d a = mo35698a(this.f31370a, this.f31371b, this.f31372c, this.f31373d, this.f31374e, this.f31375f);
        Supplier<Boolean> supplier = this.f31376g;
        if (supplier != null) {
            a.mo35688b(((Boolean) supplier.get()).booleanValue());
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12038d mo35698a(Resources resources, DeferredReleaser deferredReleaser, DrawableFactory drawableFactory, Executor executor, MemoryCache<CacheKey, C9730c> memoryCache, C9529f<DrawableFactory> fVar) {
        C12038d dVar = new C12038d(resources, deferredReleaser, drawableFactory, executor, memoryCache, fVar);
        return dVar;
    }
}
