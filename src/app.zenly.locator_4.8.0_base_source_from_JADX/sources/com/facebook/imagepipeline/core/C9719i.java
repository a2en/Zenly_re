package com.facebook.imagepipeline.core;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.C9678e;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.decoder.ProgressiveJpegConfig;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.producers.C9790a;
import com.facebook.imagepipeline.producers.C9793a0;
import com.facebook.imagepipeline.producers.C9803c0;
import com.facebook.imagepipeline.producers.C9806d0;
import com.facebook.imagepipeline.producers.C9811e0;
import com.facebook.imagepipeline.producers.C9813f;
import com.facebook.imagepipeline.producers.C9814f0;
import com.facebook.imagepipeline.producers.C9822g;
import com.facebook.imagepipeline.producers.C9823g0;
import com.facebook.imagepipeline.producers.C9824h;
import com.facebook.imagepipeline.producers.C9826h0;
import com.facebook.imagepipeline.producers.C9830i;
import com.facebook.imagepipeline.producers.C9833j;
import com.facebook.imagepipeline.producers.C9837k;
import com.facebook.imagepipeline.producers.C9838k0;
import com.facebook.imagepipeline.producers.C9841l;
import com.facebook.imagepipeline.producers.C9847l0;
import com.facebook.imagepipeline.producers.C9849m0;
import com.facebook.imagepipeline.producers.C9853n;
import com.facebook.imagepipeline.producers.C9856n0;
import com.facebook.imagepipeline.producers.C9858o;
import com.facebook.imagepipeline.producers.C9862p;
import com.facebook.imagepipeline.producers.C9863p0;
import com.facebook.imagepipeline.producers.C9866q;
import com.facebook.imagepipeline.producers.C9873t;
import com.facebook.imagepipeline.producers.C9874u;
import com.facebook.imagepipeline.producers.C9875v;
import com.facebook.imagepipeline.producers.C9876w;
import com.facebook.imagepipeline.producers.C9882y;
import com.facebook.imagepipeline.producers.C9883z;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.producers.ThumbnailProducer;
import com.facebook.imagepipeline.transcoder.ImageTranscoderFactory;
import p333g.p339c.p352d.p355b.C12058f;

/* renamed from: com.facebook.imagepipeline.core.i */
public class C9719i {

    /* renamed from: a */
    private ContentResolver f25496a;

    /* renamed from: b */
    private Resources f25497b;

    /* renamed from: c */
    private AssetManager f25498c;

    /* renamed from: d */
    private final ByteArrayPool f25499d;

    /* renamed from: e */
    private final ImageDecoder f25500e;

    /* renamed from: f */
    private final ProgressiveJpegConfig f25501f;

    /* renamed from: g */
    private final boolean f25502g;

    /* renamed from: h */
    private final boolean f25503h;

    /* renamed from: i */
    private final boolean f25504i;

    /* renamed from: j */
    private final ExecutorSupplier f25505j;

    /* renamed from: k */
    private final PooledByteBufferFactory f25506k;

    /* renamed from: l */
    private final C9678e f25507l;

    /* renamed from: m */
    private final C9678e f25508m;

    /* renamed from: n */
    private final MemoryCache<CacheKey, PooledByteBuffer> f25509n;

    /* renamed from: o */
    private final MemoryCache<CacheKey, C9730c> f25510o;

    /* renamed from: p */
    private final CacheKeyFactory f25511p;

    /* renamed from: q */
    private final C12058f f25512q;

    /* renamed from: r */
    private final int f25513r;

    /* renamed from: s */
    private final int f25514s;

    /* renamed from: t */
    private boolean f25515t;

    /* renamed from: u */
    private final C9706a f25516u;

    /* renamed from: v */
    private final int f25517v;

    public C9719i(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, boolean z2, boolean z3, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, C9730c> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, C9678e eVar, C9678e eVar2, CacheKeyFactory cacheKeyFactory, C12058f fVar, int i, int i2, boolean z4, int i3, C9706a aVar) {
        this.f25496a = context.getApplicationContext().getContentResolver();
        this.f25497b = context.getApplicationContext().getResources();
        this.f25498c = context.getApplicationContext().getAssets();
        this.f25499d = byteArrayPool;
        this.f25500e = imageDecoder;
        this.f25501f = progressiveJpegConfig;
        this.f25502g = z;
        this.f25503h = z2;
        this.f25504i = z3;
        this.f25505j = executorSupplier;
        this.f25506k = pooledByteBufferFactory;
        this.f25510o = memoryCache;
        this.f25509n = memoryCache2;
        this.f25507l = eVar;
        this.f25508m = eVar2;
        this.f25511p = cacheKeyFactory;
        this.f25512q = fVar;
        this.f25513r = i;
        this.f25514s = i2;
        this.f25515t = z4;
        this.f25517v = i3;
        this.f25516u = aVar;
    }

    /* renamed from: o */
    public static C9790a m23990o(Producer<C9732e> producer) {
        return new C9790a(producer);
    }

    /* renamed from: a */
    public C9813f mo26355a(Producer<CloseableReference<C9730c>> producer) {
        return new C9813f(this.f25510o, this.f25511p, producer);
    }

    /* renamed from: b */
    public C9822g mo26360b(Producer<CloseableReference<C9730c>> producer) {
        return new C9822g(this.f25511p, producer);
    }

    /* renamed from: c */
    public C9824h mo26362c(Producer<CloseableReference<C9730c>> producer) {
        return new C9824h(this.f25510o, this.f25511p, producer);
    }

    /* renamed from: d */
    public C9875v mo26365d() {
        return new C9875v(this.f25505j.forLocalStorageRead(), this.f25506k, this.f25496a);
    }

    /* renamed from: e */
    public C9841l mo26366e(Producer<C9732e> producer) {
        C9841l lVar = new C9841l(this.f25499d, this.f25505j.forDecode(), this.f25500e, this.f25501f, this.f25502g, this.f25503h, this.f25504i, producer, this.f25517v, this.f25516u);
        return lVar;
    }

    /* renamed from: f */
    public C9853n mo26368f(Producer<C9732e> producer) {
        return new C9853n(this.f25507l, this.f25508m, this.f25511p, producer);
    }

    /* renamed from: g */
    public C9858o mo26370g(Producer<C9732e> producer) {
        return new C9858o(this.f25507l, this.f25508m, this.f25511p, producer);
    }

    /* renamed from: h */
    public C9862p mo26373h(Producer<C9732e> producer) {
        return new C9862p(this.f25511p, producer);
    }

    /* renamed from: i */
    public C9866q mo26375i(Producer<C9732e> producer) {
        return new C9866q(this.f25509n, this.f25511p, producer);
    }

    /* renamed from: j */
    public C9806d0 mo26376j(Producer<C9732e> producer) {
        C9806d0 d0Var = new C9806d0(this.f25507l, this.f25511p, this.f25506k, this.f25499d, producer);
        return d0Var;
    }

    /* renamed from: k */
    public C9811e0 mo26377k(Producer<CloseableReference<C9730c>> producer) {
        return new C9811e0(this.f25510o, this.f25511p, producer);
    }

    /* renamed from: l */
    public C9814f0 mo26378l(Producer<CloseableReference<C9730c>> producer) {
        return new C9814f0(producer, this.f25512q, this.f25505j.forBackgroundTasks());
    }

    /* renamed from: m */
    public <T> C9849m0<T> mo26379m(Producer<T> producer) {
        return new C9849m0<>(5, this.f25505j.forLightweightBackgroundTasks(), producer);
    }

    /* renamed from: n */
    public C9863p0 mo26380n(Producer<C9732e> producer) {
        return new C9863p0(this.f25505j.forBackgroundTasks(), this.f25506k, producer);
    }

    /* renamed from: a */
    public static C9833j m23989a(Producer<C9732e> producer, Producer<C9732e> producer2) {
        return new C9833j(producer, producer2);
    }

    /* renamed from: b */
    public C9873t mo26361b() {
        return new C9873t(this.f25505j.forLocalStorageRead(), this.f25506k, this.f25498c);
    }

    /* renamed from: c */
    public C9874u mo26363c() {
        return new C9874u(this.f25505j.forLocalStorageRead(), this.f25506k, this.f25496a);
    }

    /* renamed from: f */
    public C9882y mo26369f() {
        return new C9882y(this.f25505j.forLocalStorageRead(), this.f25506k);
    }

    /* renamed from: g */
    public C9883z mo26371g() {
        return new C9883z(this.f25505j.forLocalStorageRead(), this.f25506k, this.f25497b);
    }

    /* renamed from: h */
    public C9793a0 mo26372h() {
        return new C9793a0(this.f25505j.forLocalStorageRead(), this.f25496a);
    }

    /* renamed from: i */
    public C9823g0 mo26374i() {
        return new C9823g0(this.f25505j.forLocalStorageRead(), this.f25506k, this.f25496a);
    }

    /* renamed from: a */
    public C9837k mo26358a() {
        return new C9837k(this.f25506k);
    }

    /* renamed from: d */
    public C9830i mo26364d(Producer<CloseableReference<C9730c>> producer) {
        return new C9830i(producer, this.f25513r, this.f25514s, this.f25515t);
    }

    /* renamed from: e */
    public C9876w mo26367e() {
        return new C9876w(this.f25505j.forLocalStorageRead(), this.f25506k, this.f25496a);
    }

    /* renamed from: a */
    public C9856n0 mo26359a(ThumbnailProducer<C9732e>[] thumbnailProducerArr) {
        return new C9856n0(thumbnailProducerArr);
    }

    /* renamed from: a */
    public C9803c0 mo26354a(NetworkFetcher networkFetcher) {
        return new C9803c0(this.f25506k, this.f25499d, networkFetcher);
    }

    /* renamed from: a */
    public C9826h0 mo26356a(Producer<C9732e> producer, boolean z, ImageTranscoderFactory imageTranscoderFactory) {
        C9826h0 h0Var = new C9826h0(this.f25505j.forBackgroundTasks(), this.f25506k, producer, z, imageTranscoderFactory);
        return h0Var;
    }

    /* renamed from: a */
    public <T> C9838k0<T> mo26357a(Producer<T> producer, C9847l0 l0Var) {
        return new C9838k0<>(producer, l0Var);
    }
}
