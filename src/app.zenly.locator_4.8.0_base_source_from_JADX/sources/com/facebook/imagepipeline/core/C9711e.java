package com.facebook.imagepipeline.core;

import com.facebook.cache.common.CacheKey;
import com.facebook.callercontext.CallerContextVerifier;
import com.facebook.common.internal.Supplier;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.C9566c;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.cache.C9678e;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MemoryCache;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.listener.C9735b;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.C9847l0;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.C9884a.C9886b;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.imagepipeline.core.e */
public class C9711e {

    /* renamed from: a */
    private final C9720j f25402a;

    /* renamed from: b */
    private final RequestListener f25403b;

    /* renamed from: c */
    private final MemoryCache<CacheKey, C9730c> f25404c;

    /* renamed from: d */
    private final CacheKeyFactory f25405d;

    /* renamed from: e */
    private AtomicLong f25406e = new AtomicLong();

    /* renamed from: f */
    private final CallerContextVerifier f25407f;

    static {
        new CancellationException("Prefetching is not enabled");
    }

    public C9711e(C9720j jVar, Set<RequestListener> set, Supplier<Boolean> supplier, MemoryCache<CacheKey, C9730c> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, C9678e eVar, C9678e eVar2, CacheKeyFactory cacheKeyFactory, C9847l0 l0Var, Supplier<Boolean> supplier2, Supplier<Boolean> supplier3, CallerContextVerifier callerContextVerifier) {
        this.f25402a = jVar;
        this.f25403b = new C9735b(set);
        this.f25404c = memoryCache;
        this.f25405d = cacheKeyFactory;
        this.f25407f = callerContextVerifier;
    }

    /* renamed from: a */
    public String mo26307a() {
        return String.valueOf(this.f25406e.getAndIncrement());
    }

    /* renamed from: b */
    public MemoryCache<CacheKey, C9730c> mo26308b() {
        return this.f25404c;
    }

    /* renamed from: c */
    public CacheKeyFactory mo26309c() {
        return this.f25405d;
    }

    /* renamed from: a */
    public DataSource<CloseableReference<C9730c>> mo26305a(C9884a aVar, Object obj, C9886b bVar, RequestListener requestListener) {
        try {
            return m23895a(this.f25402a.mo26381a(aVar), aVar, bVar, obj, requestListener);
        } catch (Exception e) {
            return C9566c.m23420b(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> com.facebook.datasource.DataSource<com.facebook.common.references.CloseableReference<T>> m23895a(com.facebook.imagepipeline.producers.Producer<com.facebook.common.references.CloseableReference<T>> r11, com.facebook.imagepipeline.request.C9884a r12, com.facebook.imagepipeline.request.C9884a.C9886b r13, java.lang.Object r14, com.facebook.imagepipeline.listener.RequestListener r15) {
        /*
            r10 = this;
            boolean r0 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = "ImagePipeline#submitFetchRequest"
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24703a(r0)
        L_0x000b:
            com.facebook.imagepipeline.listener.RequestListener r15 = r10.mo26306a(r12, r15)
            com.facebook.callercontext.CallerContextVerifier r0 = r10.f25407f
            if (r0 == 0) goto L_0x0016
            r0.verifyCallerContext(r14)
        L_0x0016:
            com.facebook.imagepipeline.request.a$b r0 = r12.mo26730e()     // Catch:{ Exception -> 0x0056 }
            com.facebook.imagepipeline.request.a$b r6 = com.facebook.imagepipeline.request.C9884a.C9886b.m24700a(r0, r13)     // Catch:{ Exception -> 0x0056 }
            com.facebook.imagepipeline.producers.i0 r13 = new com.facebook.imagepipeline.producers.i0     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = r10.mo26307a()     // Catch:{ Exception -> 0x0056 }
            r7 = 0
            boolean r0 = r12.mo26737j()     // Catch:{ Exception -> 0x0056 }
            if (r0 != 0) goto L_0x0039
            android.net.Uri r0 = r12.mo26743p()     // Catch:{ Exception -> 0x0056 }
            boolean r0 = com.facebook.common.util.C9559e.m23393i(r0)     // Catch:{ Exception -> 0x0056 }
            if (r0 != 0) goto L_0x0036
            goto L_0x0039
        L_0x0036:
            r0 = 0
            r8 = 0
            goto L_0x003b
        L_0x0039:
            r0 = 1
            r8 = 1
        L_0x003b:
            com.facebook.imagepipeline.common.d r9 = r12.mo26736i()     // Catch:{ Exception -> 0x0056 }
            r1 = r13
            r2 = r12
            r4 = r15
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0056 }
            com.facebook.datasource.DataSource r11 = p333g.p339c.p352d.p356c.C12063b.m31867a(r11, r13, r15)     // Catch:{ Exception -> 0x0056 }
            boolean r12 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r12 == 0) goto L_0x0053
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x0053:
            return r11
        L_0x0054:
            r11 = move-exception
            goto L_0x0065
        L_0x0056:
            r11 = move-exception
            com.facebook.datasource.DataSource r11 = com.facebook.datasource.C9566c.m23420b(r11)     // Catch:{ all -> 0x0054 }
            boolean r12 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r12 == 0) goto L_0x0064
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x0064:
            return r11
        L_0x0065:
            boolean r12 = com.facebook.imagepipeline.systrace.FrescoSystrace.m24705c()
            if (r12 == 0) goto L_0x006e
            com.facebook.imagepipeline.systrace.FrescoSystrace.m24702a()
        L_0x006e:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.core.C9711e.m23895a(com.facebook.imagepipeline.producers.Producer, com.facebook.imagepipeline.request.a, com.facebook.imagepipeline.request.a$b, java.lang.Object, com.facebook.imagepipeline.listener.RequestListener):com.facebook.datasource.DataSource");
    }

    /* renamed from: a */
    public RequestListener mo26306a(C9884a aVar, RequestListener requestListener) {
        if (requestListener == null) {
            if (aVar.mo26738k() == null) {
                return this.f25403b;
            }
            return new C9735b(this.f25403b, aVar.mo26738k());
        } else if (aVar.mo26738k() == null) {
            return new C9735b(this.f25403b, requestListener);
        } else {
            return new C9735b(this.f25403b, requestListener, aVar.mo26738k());
        }
    }
}
