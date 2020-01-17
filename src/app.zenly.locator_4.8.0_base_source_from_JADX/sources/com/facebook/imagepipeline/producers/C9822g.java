package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.request.C9884a.C9886b;

/* renamed from: com.facebook.imagepipeline.producers.g */
public class C9822g extends C9797b0<Pair<CacheKey, C9886b>, CloseableReference<C9730c>> {

    /* renamed from: c */
    private final CacheKeyFactory f25792c;

    public C9822g(CacheKeyFactory cacheKeyFactory, Producer producer) {
        super(producer);
        this.f25792c = cacheKeyFactory;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Pair<CacheKey, C9886b> m24443a(ProducerContext producerContext) {
        return Pair.create(this.f25792c.getBitmapCacheKey(producerContext.getImageRequest(), producerContext.getCallerContext()), producerContext.getLowestPermittedRequestLevel());
    }

    /* renamed from: a */
    public CloseableReference<C9730c> mo26618a(CloseableReference<C9730c> closeableReference) {
        return CloseableReference.m23348a(closeableReference);
    }
}
