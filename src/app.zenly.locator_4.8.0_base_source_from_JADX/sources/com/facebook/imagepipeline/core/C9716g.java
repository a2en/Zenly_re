package com.facebook.imagepipeline.core;

import android.content.Context;
import android.os.Build.VERSION;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.C9536j;
import com.facebook.common.internal.C9538l;
import com.facebook.common.logging.C9543a;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.animated.factory.C9658a;
import com.facebook.imagepipeline.cache.C9671a;
import com.facebook.imagepipeline.cache.C9673b;
import com.facebook.imagepipeline.cache.C9678e;
import com.facebook.imagepipeline.cache.C9687j;
import com.facebook.imagepipeline.cache.C9689k;
import com.facebook.imagepipeline.cache.C9691l;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.decoder.C9724a;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.platform.C9784f;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import com.facebook.imagepipeline.producers.C9847l0;
import com.facebook.imagepipeline.systrace.FrescoSystrace;
import com.facebook.imagepipeline.transcoder.C9893d;
import com.facebook.imagepipeline.transcoder.C9895f;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import p333g.p339c.p352d.p355b.C12058f;
import p333g.p339c.p352d.p355b.C12059g;

/* renamed from: com.facebook.imagepipeline.core.g */
public class C9716g {

    /* renamed from: t */
    private static final Class<?> f25469t = C9716g.class;

    /* renamed from: u */
    private static C9716g f25470u;

    /* renamed from: a */
    private final C9847l0 f25471a;

    /* renamed from: b */
    private final C9712f f25472b;

    /* renamed from: c */
    private final C9706a f25473c;

    /* renamed from: d */
    private CountingMemoryCache<CacheKey, C9730c> f25474d;

    /* renamed from: e */
    private C9691l<CacheKey, C9730c> f25475e;

    /* renamed from: f */
    private CountingMemoryCache<CacheKey, PooledByteBuffer> f25476f;

    /* renamed from: g */
    private C9691l<CacheKey, PooledByteBuffer> f25477g;

    /* renamed from: h */
    private C9678e f25478h;

    /* renamed from: i */
    private FileCache f25479i;

    /* renamed from: j */
    private ImageDecoder f25480j;

    /* renamed from: k */
    private C9711e f25481k;

    /* renamed from: l */
    private ImageTranscoderFactory f25482l;

    /* renamed from: m */
    private C9719i f25483m;

    /* renamed from: n */
    private C9720j f25484n;

    /* renamed from: o */
    private C9678e f25485o;

    /* renamed from: p */
    private FileCache f25486p;

    /* renamed from: q */
    private C12058f f25487q;

    /* renamed from: r */
    private PlatformDecoder f25488r;

    /* renamed from: s */
    private AnimatedFactory f25489s;

    public C9716g(C9712f fVar) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("ImagePipelineConfig()");
        }
        C9536j.m23271a(fVar);
        this.f25472b = fVar;
        this.f25471a = new C9847l0(fVar.mo26320i().forLightweightBackgroundTasks());
        this.f25473c = new C9706a(fVar.mo26317f());
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* renamed from: a */
    public static synchronized void m23967a(C9712f fVar) {
        synchronized (C9716g.class) {
            if (f25470u != null) {
                C9543a.m23320c(f25469t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f25470u = new C9716g(fVar);
        }
    }

    /* renamed from: b */
    public static synchronized void m23968b(Context context) {
        synchronized (C9716g.class) {
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24703a("ImagePipelineFactory#initialize");
            }
            m23967a(C9712f.m23906b(context).mo26338a());
            if (FrescoSystrace.m24705c()) {
                FrescoSystrace.m24702a();
            }
        }
    }

    /* renamed from: l */
    private AnimatedFactory m23969l() {
        if (this.f25489s == null) {
            this.f25489s = C9658a.m23745a(mo26349i(), this.f25472b.mo26320i(), mo26340a(), this.f25472b.mo26321j().mo26300p());
        }
        return this.f25489s;
    }

    /* renamed from: m */
    private ImageDecoder m23970m() {
        ImageDecoder imageDecoder;
        ImageDecoder imageDecoder2;
        if (this.f25480j == null) {
            if (this.f25472b.mo26324m() != null) {
                this.f25480j = this.f25472b.mo26324m();
            } else {
                AnimatedFactory l = m23969l();
                if (l != null) {
                    imageDecoder = l.getGifDecoder(this.f25472b.mo26312a());
                    imageDecoder2 = l.getWebPDecoder(this.f25472b.mo26312a());
                } else {
                    imageDecoder2 = null;
                    imageDecoder = null;
                }
                if (this.f25472b.mo26325n() == null) {
                    this.f25480j = new C9724a(imageDecoder, imageDecoder2, mo26350j());
                } else {
                    mo26350j();
                    this.f25472b.mo26325n().mo26395a();
                    throw null;
                }
            }
        }
        return this.f25480j;
    }

    /* renamed from: n */
    private ImageTranscoderFactory m23971n() {
        if (this.f25482l == null) {
            if (this.f25472b.mo26326o() == null && this.f25472b.mo26327p() == null && this.f25472b.mo26321j().mo26297m()) {
                this.f25482l = new C9895f(this.f25472b.mo26321j().mo26288d());
            } else {
                this.f25482l = new C9893d(this.f25472b.mo26321j().mo26288d(), this.f25472b.mo26321j().mo26291g(), this.f25472b.mo26326o(), this.f25472b.mo26327p());
            }
        }
        return this.f25482l;
    }

    /* renamed from: o */
    public static C9716g m23972o() {
        C9716g gVar = f25470u;
        C9536j.m23272a(gVar, (Object) "ImagePipelineFactory was not initialized!");
        return gVar;
    }

    /* renamed from: p */
    private C9719i m23973p() {
        if (this.f25483m == null) {
            this.f25483m = this.f25472b.mo26321j().mo26289e().createProducerFactory(this.f25472b.mo26318g(), this.f25472b.mo26333v().mo26519h(), m23970m(), this.f25472b.mo26334w(), this.f25472b.mo26310A(), this.f25472b.mo26311B(), this.f25472b.mo26321j().mo26294j(), this.f25472b.mo26320i(), this.f25472b.mo26333v().mo26511a(this.f25472b.mo26330s()), mo26342b(), mo26345e(), mo26347g(), m23975r(), this.f25472b.mo26315d(), mo26349i(), this.f25472b.mo26321j().mo26287c(), this.f25472b.mo26321j().mo26286b(), this.f25472b.mo26321j().mo26285a(), this.f25472b.mo26321j().mo26288d(), mo26343c());
        }
        return this.f25483m;
    }

    /* renamed from: q */
    private C9720j m23974q() {
        boolean z = VERSION.SDK_INT >= 24 && this.f25472b.mo26321j().mo26290f();
        if (this.f25484n == null) {
            C9720j jVar = new C9720j(this.f25472b.mo26318g().getApplicationContext().getContentResolver(), m23973p(), this.f25472b.mo26332u(), this.f25472b.mo26311B(), this.f25472b.mo26321j().mo26299o(), this.f25471a, this.f25472b.mo26310A(), z, this.f25472b.mo26321j().mo26298n(), this.f25472b.mo26337z(), m23971n());
            this.f25484n = jVar;
        }
        return this.f25484n;
    }

    /* renamed from: r */
    private C9678e m23975r() {
        if (this.f25485o == null) {
            C9678e eVar = new C9678e(mo26351k(), this.f25472b.mo26333v().mo26511a(this.f25472b.mo26330s()), this.f25472b.mo26333v().mo26518g(), this.f25472b.mo26320i().forLocalStorageRead(), this.f25472b.mo26320i().forLocalStorageWrite(), this.f25472b.mo26323l());
            this.f25485o = eVar;
        }
        return this.f25485o;
    }

    /* renamed from: c */
    public C9706a mo26343c() {
        return this.f25473c;
    }

    /* renamed from: d */
    public CountingMemoryCache<CacheKey, PooledByteBuffer> mo26344d() {
        if (this.f25476f == null) {
            this.f25476f = C9687j.m23826a(this.f25472b.mo26319h(), this.f25472b.mo26331t());
        }
        return this.f25476f;
    }

    /* renamed from: e */
    public C9691l<CacheKey, PooledByteBuffer> mo26345e() {
        if (this.f25477g == null) {
            this.f25477g = C9689k.m23828a(mo26344d(), this.f25472b.mo26323l());
        }
        return this.f25477g;
    }

    /* renamed from: f */
    public C9711e mo26346f() {
        if (this.f25481k == null) {
            C9711e eVar = new C9711e(m23974q(), this.f25472b.mo26335x(), this.f25472b.mo26328q(), mo26342b(), mo26345e(), mo26347g(), m23975r(), this.f25472b.mo26315d(), this.f25471a, C9538l.m23284a(Boolean.valueOf(false)), this.f25472b.mo26321j().mo26296l(), this.f25472b.mo26316e());
            this.f25481k = eVar;
        }
        return this.f25481k;
    }

    /* renamed from: g */
    public C9678e mo26347g() {
        if (this.f25478h == null) {
            C9678e eVar = new C9678e(mo26348h(), this.f25472b.mo26333v().mo26511a(this.f25472b.mo26330s()), this.f25472b.mo26333v().mo26518g(), this.f25472b.mo26320i().forLocalStorageRead(), this.f25472b.mo26320i().forLocalStorageWrite(), this.f25472b.mo26323l());
            this.f25478h = eVar;
        }
        return this.f25478h;
    }

    /* renamed from: h */
    public FileCache mo26348h() {
        if (this.f25479i == null) {
            this.f25479i = this.f25472b.mo26322k().get(this.f25472b.mo26329r());
        }
        return this.f25479i;
    }

    /* renamed from: i */
    public C12058f mo26349i() {
        if (this.f25487q == null) {
            this.f25487q = C12059g.m31853a(this.f25472b.mo26333v(), mo26350j(), mo26343c());
        }
        return this.f25487q;
    }

    /* renamed from: j */
    public PlatformDecoder mo26350j() {
        if (this.f25488r == null) {
            this.f25488r = C9784f.m24291a(this.f25472b.mo26333v(), this.f25472b.mo26321j().mo26295k());
        }
        return this.f25488r;
    }

    /* renamed from: k */
    public FileCache mo26351k() {
        if (this.f25486p == null) {
            this.f25486p = this.f25472b.mo26322k().get(this.f25472b.mo26336y());
        }
        return this.f25486p;
    }

    /* renamed from: a */
    public DrawableFactory mo26341a(Context context) {
        AnimatedFactory l = m23969l();
        if (l == null) {
            return null;
        }
        return l.getAnimatedDrawableFactory(context);
    }

    /* renamed from: a */
    public CountingMemoryCache<CacheKey, C9730c> mo26340a() {
        if (this.f25474d == null) {
            this.f25474d = C9671a.m23794a(this.f25472b.mo26313b(), this.f25472b.mo26331t(), this.f25472b.mo26314c());
        }
        return this.f25474d;
    }

    /* renamed from: b */
    public C9691l<CacheKey, C9730c> mo26342b() {
        if (this.f25475e == null) {
            this.f25475e = C9673b.m23796a(mo26340a(), this.f25472b.mo26323l());
        }
        return this.f25475e;
    }
}
