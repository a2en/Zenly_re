package com.bumptech.glide.load.engine;

import androidx.core.util.Pools$Pool;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.util.pool.C9248b;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.FactoryPools.Factory;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;

/* renamed from: com.bumptech.glide.load.engine.r */
final class C9004r<Z> implements Resource<Z>, Poolable {

    /* renamed from: i */
    private static final Pools$Pool<C9004r<?>> f23507i = FactoryPools.m22255a(20, (Factory<T>) new C9005a<T>());

    /* renamed from: e */
    private final C9248b f23508e = C9248b.m22265b();

    /* renamed from: f */
    private Resource<Z> f23509f;

    /* renamed from: g */
    private boolean f23510g;

    /* renamed from: h */
    private boolean f23511h;

    /* renamed from: com.bumptech.glide.load.engine.r$a */
    class C9005a implements Factory<C9004r<?>> {
        C9005a() {
        }

        public C9004r<?> create() {
            return new C9004r<>();
        }
    }

    C9004r() {
    }

    /* renamed from: a */
    private void m21661a(Resource<Z> resource) {
        this.f23511h = false;
        this.f23510g = true;
        this.f23509f = resource;
    }

    /* renamed from: b */
    static <Z> C9004r<Z> m21662b(Resource<Z> resource) {
        C9004r<Z> rVar = (C9004r) f23507i.acquire();
        C9216j.m22083a(rVar);
        C9004r<Z> rVar2 = rVar;
        rVar2.m21661a(resource);
        return rVar2;
    }

    public Z get() {
        return this.f23509f.get();
    }

    public Class<Z> getResourceClass() {
        return this.f23509f.getResourceClass();
    }

    public int getSize() {
        return this.f23509f.getSize();
    }

    public C9248b getVerifier() {
        return this.f23508e;
    }

    public synchronized void recycle() {
        this.f23508e.mo24932a();
        this.f23511h = true;
        if (!this.f23510g) {
            this.f23509f.recycle();
            m21663b();
        }
    }

    /* renamed from: b */
    private void m21663b() {
        this.f23509f = null;
        f23507i.release(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo24512a() {
        this.f23508e.mo24932a();
        if (this.f23510g) {
            this.f23510g = false;
            if (this.f23511h) {
                recycle();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
