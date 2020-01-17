package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.core.util.Pools$Pool;
import com.bumptech.glide.C8856d;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.cache.C8942a;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.p301o.C9212f;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.FactoryPools.Factory;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.load.engine.j */
public class C8984j implements C8997l, ResourceRemovedListener, C9001a {

    /* renamed from: i */
    private static final boolean f23428i = Log.isLoggable("Engine", 2);

    /* renamed from: a */
    private final C9002p f23429a;

    /* renamed from: b */
    private final C8999n f23430b;

    /* renamed from: c */
    private final MemoryCache f23431c;

    /* renamed from: d */
    private final C8987b f23432d;

    /* renamed from: e */
    private final C9008u f23433e;

    /* renamed from: f */
    private final C8989c f23434f;

    /* renamed from: g */
    private final C8985a f23435g;

    /* renamed from: h */
    private final C8912a f23436h;

    /* renamed from: com.bumptech.glide.load.engine.j$a */
    static class C8985a {

        /* renamed from: a */
        final C8972e f23437a;

        /* renamed from: b */
        final Pools$Pool<C8967g<?>> f23438b = FactoryPools.m22255a(150, (Factory<T>) new C8986a<T>());

        /* renamed from: c */
        private int f23439c;

        /* renamed from: com.bumptech.glide.load.engine.j$a$a */
        class C8986a implements Factory<C8967g<?>> {
            C8986a() {
            }

            public C8967g<?> create() {
                C8985a aVar = C8985a.this;
                return new C8967g<>(aVar.f23437a, aVar.f23438b);
            }
        }

        C8985a(C8972e eVar) {
            this.f23437a = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> C8967g<R> mo24472a(C8856d dVar, Object obj, C8998m mVar, Key key, int i, int i2, Class<?> cls, Class<R> cls2, C8859g gVar, C8978i iVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, boolean z3, C9011f fVar, C8969b<R> bVar) {
            C8856d dVar2 = dVar;
            Object obj2 = obj;
            C8998m mVar2 = mVar;
            Key key2 = key;
            int i3 = i;
            int i4 = i2;
            Class<?> cls3 = cls;
            Class<R> cls4 = cls2;
            C8859g gVar2 = gVar;
            C8978i iVar2 = iVar;
            Map<Class<?>, Transformation<?>> map2 = map;
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            C9011f fVar2 = fVar;
            C8969b<R> bVar2 = bVar;
            C8967g gVar3 = (C8967g) this.f23438b.acquire();
            C9216j.m22083a(gVar3);
            C8967g<R> gVar4 = gVar3;
            C8967g<R> gVar5 = gVar4;
            int i5 = this.f23439c;
            int i6 = i5;
            this.f23439c = i5 + 1;
            gVar5.mo24442a(dVar2, obj2, mVar2, key2, i3, i4, cls3, cls4, gVar2, iVar2, map2, z4, z5, z6, fVar2, bVar2, i6);
            return gVar4;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$b */
    static class C8987b {

        /* renamed from: a */
        final GlideExecutor f23441a;

        /* renamed from: b */
        final GlideExecutor f23442b;

        /* renamed from: c */
        final GlideExecutor f23443c;

        /* renamed from: d */
        final GlideExecutor f23444d;

        /* renamed from: e */
        final C8997l f23445e;

        /* renamed from: f */
        final C9001a f23446f;

        /* renamed from: g */
        final Pools$Pool<C8991k<?>> f23447g = FactoryPools.m22255a(150, (Factory<T>) new C8988a<T>());

        /* renamed from: com.bumptech.glide.load.engine.j$b$a */
        class C8988a implements Factory<C8991k<?>> {
            C8988a() {
            }

            public C8991k<?> create() {
                C8987b bVar = C8987b.this;
                C8991k kVar = new C8991k(bVar.f23441a, bVar.f23442b, bVar.f23443c, bVar.f23444d, bVar.f23445e, bVar.f23446f, bVar.f23447g);
                return kVar;
            }
        }

        C8987b(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, C8997l lVar, C9001a aVar) {
            this.f23441a = glideExecutor;
            this.f23442b = glideExecutor2;
            this.f23443c = glideExecutor3;
            this.f23444d = glideExecutor4;
            this.f23445e = lVar;
            this.f23446f = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <R> C8991k<R> mo24473a(Key key, boolean z, boolean z2, boolean z3, boolean z4) {
            C8991k<R> kVar = (C8991k) this.f23447g.acquire();
            C9216j.m22083a(kVar);
            C8991k<R> kVar2 = kVar;
            kVar2.mo24475a(key, z, z2, z3, z4);
            return kVar2;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$c */
    private static class C8989c implements C8972e {

        /* renamed from: a */
        private final DiskCache.Factory f23449a;

        /* renamed from: b */
        private volatile DiskCache f23450b;

        C8989c(DiskCache.Factory factory) {
            this.f23449a = factory;
        }

        /* renamed from: a */
        public DiskCache mo24456a() {
            if (this.f23450b == null) {
                synchronized (this) {
                    if (this.f23450b == null) {
                        this.f23450b = this.f23449a.build();
                    }
                    if (this.f23450b == null) {
                        this.f23450b = new C8942a();
                    }
                }
            }
            return this.f23450b;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.j$d */
    public class C8990d {

        /* renamed from: a */
        private final C8991k<?> f23451a;

        /* renamed from: b */
        private final ResourceCallback f23452b;

        C8990d(ResourceCallback resourceCallback, C8991k<?> kVar) {
            this.f23452b = resourceCallback;
            this.f23451a = kVar;
        }

        /* renamed from: a */
        public void mo24474a() {
            synchronized (C8984j.this) {
                this.f23451a.mo24484c(this.f23452b);
            }
        }
    }

    public C8984j(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, boolean z) {
        this(memoryCache, factory, glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, null, null, null, null, null, null, z);
    }

    /* renamed from: b */
    private C9000o<?> m21614b(Key key) {
        C9000o<?> b = this.f23436h.mo24303b(key);
        if (b != null) {
            b.mo24502a();
        }
        return b;
    }

    /* renamed from: c */
    private C9000o<?> m21615c(Key key) {
        C9000o<?> a = m21611a(key);
        if (a != null) {
            a.mo24502a();
            this.f23436h.mo24300a(key, a);
        }
        return a;
    }

    /* renamed from: a */
    public <R> C8990d mo24467a(C8856d dVar, Object obj, Key key, int i, int i2, Class<?> cls, Class<R> cls2, C8859g gVar, C8978i iVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, C9011f fVar, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor) {
        long a = f23428i ? C9212f.m22072a() : 0;
        C8998m a2 = this.f23430b.mo24501a(obj, key, i, i2, map, cls, cls2, fVar);
        synchronized (this) {
            C9000o a3 = m21612a(a2, z3, a);
            if (a3 == null) {
                C8990d a4 = m21610a(dVar, obj, key, i, i2, cls, cls2, gVar, iVar, map, z, z2, fVar, z3, z4, z5, z6, resourceCallback, executor, a2, a);
                return a4;
            }
            resourceCallback.onResourceReady(a3, C8882a.MEMORY_CACHE);
            return null;
        }
    }

    public void onResourceRemoved(Resource<?> resource) {
        this.f23433e.mo24514a(resource);
    }

    C8984j(MemoryCache memoryCache, DiskCache.Factory factory, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, C9002p pVar, C8999n nVar, C8912a aVar, C8987b bVar, C8985a aVar2, C9008u uVar, boolean z) {
        this.f23431c = memoryCache;
        DiskCache.Factory factory2 = factory;
        this.f23434f = new C8989c(factory);
        C8912a aVar3 = aVar == null ? new C8912a(z) : aVar;
        this.f23436h = aVar3;
        aVar3.mo24302a((C9001a) this);
        this.f23430b = nVar == null ? new C8999n() : nVar;
        this.f23429a = pVar == null ? new C9002p() : pVar;
        this.f23432d = bVar == null ? new C8987b(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this, this) : bVar;
        this.f23435g = aVar2 == null ? new C8985a(this.f23434f) : aVar2;
        this.f23433e = uVar == null ? new C9008u() : uVar;
        memoryCache.setResourceRemovedListener(this);
    }

    /* renamed from: a */
    private <R> C8990d m21610a(C8856d dVar, Object obj, Key key, int i, int i2, Class<?> cls, Class<R> cls2, C8859g gVar, C8978i iVar, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, C9011f fVar, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor, C8998m mVar, long j) {
        ResourceCallback resourceCallback2 = resourceCallback;
        Executor executor2 = executor;
        C8998m mVar2 = mVar;
        long j2 = j;
        C8991k a = this.f23429a.mo24507a((Key) mVar2, z6);
        if (a != null) {
            a.mo24479a(resourceCallback2, executor2);
            if (f23428i) {
                m21613a("Added to existing load", j2, (Key) mVar2);
            }
            return new C8990d(resourceCallback2, a);
        }
        C8991k a2 = this.f23432d.mo24473a(mVar, z3, z4, z5, z6);
        C8991k kVar = a2;
        C8998m mVar3 = mVar2;
        C8967g a3 = this.f23435g.mo24472a(dVar, obj, mVar, key, i, i2, cls, cls2, gVar, iVar, map, z, z2, z6, fVar, a2);
        this.f23429a.mo24508a((Key) mVar3, kVar);
        C8991k kVar2 = kVar;
        C8998m mVar4 = mVar3;
        ResourceCallback resourceCallback3 = resourceCallback;
        kVar2.mo24479a(resourceCallback3, executor);
        kVar2.mo24481b(a3);
        if (f23428i) {
            m21613a("Started new load", j, (Key) mVar4);
        }
        return new C8990d(resourceCallback3, kVar2);
    }

    /* renamed from: a */
    private C9000o<?> m21612a(C8998m mVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        C9000o<?> b = m21614b(mVar);
        if (b != null) {
            if (f23428i) {
                m21613a("Loaded resource from active resources", j, (Key) mVar);
            }
            return b;
        }
        C9000o<?> c = m21615c(mVar);
        if (c == null) {
            return null;
        }
        if (f23428i) {
            m21613a("Loaded resource from cache", j, (Key) mVar);
        }
        return c;
    }

    /* renamed from: a */
    private static void m21613a(String str, long j, Key key) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C9212f.m22071a(j));
        sb.append("ms, key: ");
        sb.append(key);
        Log.v("Engine", sb.toString());
    }

    /* renamed from: a */
    private C9000o<?> m21611a(Key key) {
        Resource remove = this.f23431c.remove(key);
        if (remove == null) {
            return null;
        }
        if (remove instanceof C9000o) {
            return (C9000o) remove;
        }
        C9000o oVar = new C9000o(remove, true, true, key, this);
        return oVar;
    }

    /* renamed from: a */
    public void mo24469a(Resource<?> resource) {
        if (resource instanceof C9000o) {
            ((C9000o) resource).mo24505d();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    public synchronized void mo24471a(C8991k<?> kVar, Key key, C9000o<?> oVar) {
        if (oVar != null) {
            if (oVar.mo24504c()) {
                this.f23436h.mo24300a(key, oVar);
            }
        }
        this.f23429a.mo24509b(key, kVar);
    }

    /* renamed from: a */
    public synchronized void mo24470a(C8991k<?> kVar, Key key) {
        this.f23429a.mo24509b(key, kVar);
    }

    /* renamed from: a */
    public void mo24468a(Key key, C9000o<?> oVar) {
        this.f23436h.mo24299a(key);
        if (oVar.mo24504c()) {
            this.f23431c.put(key, oVar);
        } else {
            this.f23433e.mo24514a(oVar);
        }
    }
}
