package com.facebook.fresco.animation.factory;

import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.time.MonotonicClock;
import com.facebook.fresco.animation.backend.AnimationBackend;
import com.facebook.fresco.animation.backend.AnimationBackendDelegateWithInactivityCheck;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.facebook.fresco.animation.bitmap.BitmapFrameCache;
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer;
import com.facebook.fresco.animation.bitmap.p307a.C9629a;
import com.facebook.fresco.animation.bitmap.p307a.C9630b;
import com.facebook.fresco.animation.bitmap.p307a.C9631c;
import com.facebook.fresco.animation.bitmap.p308b.C9632a;
import com.facebook.fresco.animation.bitmap.p308b.C9633b;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparationStrategy;
import com.facebook.fresco.animation.bitmap.preparation.BitmapFramePreparer;
import com.facebook.fresco.animation.bitmap.preparation.C9635a;
import com.facebook.fresco.animation.bitmap.preparation.C9637b;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableBackend;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.animated.base.C9656b;
import com.facebook.imagepipeline.animated.impl.AnimatedDrawableBackendProvider;
import com.facebook.imagepipeline.animated.impl.C9665b;
import com.facebook.imagepipeline.cache.CountingMemoryCache;
import com.facebook.imagepipeline.drawable.DrawableFactory;
import com.facebook.imagepipeline.image.C9728a;
import com.facebook.imagepipeline.image.C9730c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p333g.p339c.p352d.p355b.C12058f;

/* renamed from: com.facebook.fresco.animation.factory.a */
public class C9646a implements DrawableFactory {

    /* renamed from: a */
    private final AnimatedDrawableBackendProvider f25171a;

    /* renamed from: b */
    private final ScheduledExecutorService f25172b;

    /* renamed from: c */
    private final ExecutorService f25173c;

    /* renamed from: d */
    private final MonotonicClock f25174d;

    /* renamed from: e */
    private final C12058f f25175e;

    /* renamed from: f */
    private final CountingMemoryCache<CacheKey, C9730c> f25176f;

    /* renamed from: g */
    private final Supplier<Integer> f25177g;

    /* renamed from: h */
    private final Supplier<Integer> f25178h;

    /* renamed from: com.facebook.fresco.animation.factory.a$a */
    public static class C9647a implements CacheKey {

        /* renamed from: a */
        private final String f25179a;

        public C9647a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("anim://");
            sb.append(i);
            this.f25179a = sb.toString();
        }

        public boolean containsUri(Uri uri) {
            return uri.toString().startsWith(this.f25179a);
        }

        public String getUriString() {
            return this.f25179a;
        }
    }

    public C9646a(AnimatedDrawableBackendProvider animatedDrawableBackendProvider, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, MonotonicClock monotonicClock, C12058f fVar, CountingMemoryCache<CacheKey, C9730c> countingMemoryCache, Supplier<Integer> supplier, Supplier<Integer> supplier2) {
        this.f25171a = animatedDrawableBackendProvider;
        this.f25172b = scheduledExecutorService;
        this.f25173c = executorService;
        this.f25174d = monotonicClock;
        this.f25175e = fVar;
        this.f25176f = countingMemoryCache;
        this.f25177g = supplier;
        this.f25178h = supplier2;
    }

    /* renamed from: a */
    private BitmapFramePreparer m23705a(BitmapFrameRenderer bitmapFrameRenderer) {
        return new C9635a(this.f25175e, bitmapFrameRenderer, Config.ARGB_8888, this.f25173c);
    }

    /* renamed from: b */
    private C9665b m23707b(C9656b bVar) {
        return new C9665b(new C9647a(bVar.hashCode()), this.f25176f);
    }

    /* renamed from: c */
    private AnimationBackend m23708c(C9656b bVar) {
        BitmapFramePreparer bitmapFramePreparer;
        BitmapFramePreparationStrategy bitmapFramePreparationStrategy;
        AnimatedDrawableBackend a = m23706a(bVar);
        BitmapFrameCache d = m23709d(bVar);
        C9633b bVar2 = new C9633b(d, a);
        int intValue = ((Integer) this.f25178h.get()).intValue();
        if (intValue > 0) {
            C9637b bVar3 = new C9637b(intValue);
            bitmapFramePreparer = m23705a((BitmapFrameRenderer) bVar2);
            bitmapFramePreparationStrategy = bVar3;
        } else {
            bitmapFramePreparationStrategy = null;
            bitmapFramePreparer = null;
        }
        BitmapAnimationBackend bitmapAnimationBackend = new BitmapAnimationBackend(this.f25175e, d, new C9632a(a), bVar2, bitmapFramePreparationStrategy, bitmapFramePreparer);
        return AnimationBackendDelegateWithInactivityCheck.m23660a(bitmapAnimationBackend, this.f25174d, this.f25172b);
    }

    /* renamed from: d */
    private BitmapFrameCache m23709d(C9656b bVar) {
        int intValue = ((Integer) this.f25177g.get()).intValue();
        if (intValue == 1) {
            return new C9629a(m23707b(bVar), true);
        }
        if (intValue == 2) {
            return new C9629a(m23707b(bVar), false);
        }
        if (intValue != 3) {
            return new C9631c();
        }
        return new C9630b();
    }

    public boolean supportsImageType(C9730c cVar) {
        return cVar instanceof C9728a;
    }

    /* renamed from: a */
    private AnimatedDrawableBackend m23706a(C9656b bVar) {
        AnimatedImage c = bVar.mo26178c();
        return this.f25171a.get(bVar, new Rect(0, 0, c.getWidth(), c.getHeight()));
    }

    public AnimatedDrawable2 createDrawable(C9730c cVar) {
        return new AnimatedDrawable2(m23708c(((C9728a) cVar).mo26408c()));
    }
}
