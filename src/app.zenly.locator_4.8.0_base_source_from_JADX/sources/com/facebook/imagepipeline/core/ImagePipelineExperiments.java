package com.facebook.imagepipeline.core;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpBitmapFactory.WebpErrorLogger;
import com.facebook.imagepipeline.cache.C9678e;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.core.C9712f.C9714b;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.C9730c;
import p333g.p339c.p352d.p355b.C12058f;

public class ImagePipelineExperiments {

    /* renamed from: a */
    private final boolean f25363a;

    /* renamed from: b */
    private final WebpErrorLogger f25364b;

    /* renamed from: c */
    private final boolean f25365c;

    /* renamed from: d */
    private final WebpBitmapFactory f25366d;

    /* renamed from: e */
    private final boolean f25367e;

    /* renamed from: f */
    private final boolean f25368f;

    /* renamed from: g */
    private final int f25369g;

    /* renamed from: h */
    private final int f25370h;

    /* renamed from: i */
    private boolean f25371i;

    /* renamed from: j */
    private final int f25372j;

    /* renamed from: k */
    private final boolean f25373k;

    /* renamed from: l */
    private final boolean f25374l;

    /* renamed from: m */
    private final ProducerFactoryMethod f25375m;

    /* renamed from: n */
    private final Supplier<Boolean> f25376n;

    /* renamed from: o */
    private final boolean f25377o;

    /* renamed from: p */
    private final boolean f25378p;

    public interface ProducerFactoryMethod {
        C9719i createProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, C9730c> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, C9678e eVar, C9678e eVar2, CacheKeyFactory cacheKeyFactory, C12058f fVar, int i, int i2, boolean z4, int i3, C9706a aVar);
    }

    /* renamed from: com.facebook.imagepipeline.core.ImagePipelineExperiments$b */
    public static class C9704b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public boolean f25379a = false;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public WebpErrorLogger f25380b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f25381c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public WebpBitmapFactory f25382d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f25383e = false;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f25384f = false;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f25385g = 0;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f25386h = 0;

        /* renamed from: i */
        public boolean f25387i = false;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f25388j = ItemAnimator.FLAG_MOVED;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f25389k = false;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f25390l = false;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public ProducerFactoryMethod f25391m;

        /* renamed from: n */
        public Supplier<Boolean> f25392n;

        /* renamed from: o */
        public boolean f25393o;

        /* renamed from: p */
        public boolean f25394p;

        public C9704b(C9714b bVar) {
        }

        /* renamed from: a */
        public ImagePipelineExperiments mo26302a() {
            return new ImagePipelineExperiments(this);
        }
    }

    /* renamed from: com.facebook.imagepipeline.core.ImagePipelineExperiments$c */
    public static class C9705c implements ProducerFactoryMethod {
        public C9719i createProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, C9730c> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, C9678e eVar, C9678e eVar2, CacheKeyFactory cacheKeyFactory, C12058f fVar, int i, int i2, boolean z4, int i3, C9706a aVar) {
            C9719i iVar = new C9719i(context, byteArrayPool, imageDecoder, progressiveJpegConfig, z, z2, z3, executorSupplier, pooledByteBufferFactory, memoryCache, memoryCache2, eVar, eVar2, cacheKeyFactory, fVar, i, i2, z4, i3, aVar);
            return iVar;
        }
    }

    /* renamed from: a */
    public boolean mo26285a() {
        return this.f25371i;
    }

    /* renamed from: b */
    public int mo26286b() {
        return this.f25370h;
    }

    /* renamed from: c */
    public int mo26287c() {
        return this.f25369g;
    }

    /* renamed from: d */
    public int mo26288d() {
        return this.f25372j;
    }

    /* renamed from: e */
    public ProducerFactoryMethod mo26289e() {
        return this.f25375m;
    }

    /* renamed from: f */
    public boolean mo26290f() {
        return this.f25368f;
    }

    /* renamed from: g */
    public boolean mo26291g() {
        return this.f25367e;
    }

    /* renamed from: h */
    public WebpBitmapFactory mo26292h() {
        return this.f25366d;
    }

    /* renamed from: i */
    public WebpErrorLogger mo26293i() {
        return this.f25364b;
    }

    /* renamed from: j */
    public boolean mo26294j() {
        return this.f25365c;
    }

    /* renamed from: k */
    public boolean mo26295k() {
        return this.f25377o;
    }

    /* renamed from: l */
    public Supplier<Boolean> mo26296l() {
        return this.f25376n;
    }

    /* renamed from: m */
    public boolean mo26297m() {
        return this.f25373k;
    }

    /* renamed from: n */
    public boolean mo26298n() {
        return this.f25374l;
    }

    /* renamed from: o */
    public boolean mo26299o() {
        return this.f25363a;
    }

    /* renamed from: p */
    public boolean mo26300p() {
        return this.f25378p;
    }

    private ImagePipelineExperiments(C9704b bVar) {
        this.f25363a = bVar.f25379a;
        this.f25364b = bVar.f25380b;
        this.f25365c = bVar.f25381c;
        this.f25366d = bVar.f25382d;
        this.f25367e = bVar.f25383e;
        this.f25368f = bVar.f25384f;
        this.f25369g = bVar.f25385g;
        this.f25370h = bVar.f25386h;
        this.f25371i = bVar.f25387i;
        this.f25372j = bVar.f25388j;
        this.f25373k = bVar.f25389k;
        this.f25374l = bVar.f25390l;
        if (bVar.f25391m == null) {
            this.f25375m = new C9705c();
        } else {
            this.f25375m = bVar.f25391m;
        }
        this.f25376n = bVar.f25392n;
        this.f25377o = bVar.f25393o;
        this.f25378p = bVar.f25394p;
    }
}
