package com.facebook.fresco.animation.factory;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.executors.C9516c;
import com.facebook.common.executors.C9520g;
import com.facebook.common.internal.C9527d;
import com.facebook.common.internal.Supplier;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.C9656b;
import com.facebook.imagepipeline.animated.factory.AnimatedFactory;
import com.facebook.imagepipeline.animated.factory.AnimatedImageFactory;
import com.facebook.imagepipeline.animated.factory.C9659b;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider;
import com.facebook.imagepipeline.animated.impl.C9664a;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.core.ExecutorSupplier;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.image.QualityInfo;
import p333g.p339c.p352d.p353a.p354a.C12052a;
import p333g.p339c.p352d.p355b.C12058f;

@C9527d
public class AnimatedFactoryV2Impl implements AnimatedFactory {

    /* renamed from: a */
    private final C12058f f25157a;

    /* renamed from: b */
    private final ExecutorSupplier f25158b;

    /* renamed from: c */
    private final CountingMemoryCache<CacheKey, C9730c> f25159c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final boolean f25160d;

    /* renamed from: e */
    private AnimatedImageFactory f25161e;

    /* renamed from: f */
    private AnimatedDrawableBackendProvider f25162f;

    /* renamed from: g */
    private C12052a f25163g;

    /* renamed from: h */
    private DrawableFactory f25164h;

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$a */
    class C9640a implements ImageDecoder {

        /* renamed from: a */
        final /* synthetic */ Config f25165a;

        C9640a(Config config) {
            this.f25165a = config;
        }

        public C9730c decode(C9732e eVar, int i, QualityInfo qualityInfo, C9698b bVar) {
            return AnimatedFactoryV2Impl.this.m23704e().decodeGif(eVar, bVar, this.f25165a);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$b */
    class C9641b implements ImageDecoder {

        /* renamed from: a */
        final /* synthetic */ Config f25167a;

        C9641b(Config config) {
            this.f25167a = config;
        }

        public C9730c decode(C9732e eVar, int i, QualityInfo qualityInfo, C9698b bVar) {
            return AnimatedFactoryV2Impl.this.m23704e().decodeWebP(eVar, bVar, this.f25167a);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$c */
    class C9642c implements Supplier<Integer> {
        C9642c(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        public Integer get() {
            return Integer.valueOf(2);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$d */
    class C9643d implements Supplier<Integer> {
        C9643d(AnimatedFactoryV2Impl animatedFactoryV2Impl) {
        }

        public Integer get() {
            return Integer.valueOf(3);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$e */
    class C9644e implements AnimatedDrawableBackendProvider {
        C9644e() {
        }

        public AnimatedDrawableBackend get(C9656b bVar, Rect rect) {
            return new C9664a(AnimatedFactoryV2Impl.this.m23703d(), bVar, rect, AnimatedFactoryV2Impl.this.f25160d);
        }
    }

    /* renamed from: com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl$f */
    class C9645f implements AnimatedDrawableBackendProvider {
        C9645f() {
        }

        public AnimatedDrawableBackend get(C9656b bVar, Rect rect) {
            return new C9664a(AnimatedFactoryV2Impl.this.m23703d(), bVar, rect, AnimatedFactoryV2Impl.this.f25160d);
        }
    }

    @C9527d
    public AnimatedFactoryV2Impl(C12058f fVar, ExecutorSupplier executorSupplier, CountingMemoryCache<CacheKey, C9730c> countingMemoryCache, boolean z) {
        this.f25157a = fVar;
        this.f25158b = executorSupplier;
        this.f25159c = countingMemoryCache;
        this.f25160d = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C12052a m23703d() {
        if (this.f25163g == null) {
            this.f25163g = new C12052a();
        }
        return this.f25163g;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public AnimatedImageFactory m23704e() {
        if (this.f25161e == null) {
            this.f25161e = m23697a();
        }
        return this.f25161e;
    }

    public DrawableFactory getAnimatedDrawableFactory(Context context) {
        if (this.f25164h == null) {
            this.f25164h = m23699b();
        }
        return this.f25164h;
    }

    public ImageDecoder getGifDecoder(Config config) {
        return new C9640a(config);
    }

    public ImageDecoder getWebPDecoder(Config config) {
        return new C9641b(config);
    }

    /* renamed from: a */
    private AnimatedImageFactory m23697a() {
        return new C9659b(new C9645f(), this.f25157a);
    }

    /* renamed from: b */
    private C9646a m23699b() {
        C9642c cVar = new C9642c(this);
        C9646a aVar = new C9646a(m23701c(), C9520g.m23241a(), new C9516c(this.f25158b.forDecode()), RealtimeSinceBootClock.get(), this.f25157a, this.f25159c, cVar, new C9643d(this));
        return aVar;
    }

    /* renamed from: c */
    private AnimatedDrawableBackendProvider m23701c() {
        if (this.f25162f == null) {
            this.f25162f = new C9644e();
        }
        return this.f25162f;
    }
}
