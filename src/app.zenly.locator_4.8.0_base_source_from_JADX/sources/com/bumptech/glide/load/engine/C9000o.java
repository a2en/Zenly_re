package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.p301o.C9216j;

/* renamed from: com.bumptech.glide.load.engine.o */
class C9000o<Z> implements Resource<Z> {

    /* renamed from: e */
    private final boolean f23495e;

    /* renamed from: f */
    private final boolean f23496f;

    /* renamed from: g */
    private final Resource<Z> f23497g;

    /* renamed from: h */
    private final C9001a f23498h;

    /* renamed from: i */
    private final Key f23499i;

    /* renamed from: j */
    private int f23500j;

    /* renamed from: k */
    private boolean f23501k;

    /* renamed from: com.bumptech.glide.load.engine.o$a */
    interface C9001a {
        /* renamed from: a */
        void mo24468a(Key key, C9000o<?> oVar);
    }

    C9000o(Resource<Z> resource, boolean z, boolean z2, Key key, C9001a aVar) {
        C9216j.m22083a(resource);
        this.f23497g = resource;
        this.f23495e = z;
        this.f23496f = z2;
        this.f23499i = key;
        C9216j.m22083a(aVar);
        this.f23498h = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo24502a() {
        if (!this.f23501k) {
            this.f23500j++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Resource<Z> mo24503b() {
        return this.f23497g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo24504c() {
        return this.f23495e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo24505d() {
        boolean z;
        synchronized (this) {
            if (this.f23500j > 0) {
                z = true;
                int i = this.f23500j - 1;
                this.f23500j = i;
                if (i != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f23498h.mo24468a(this.f23499i, this);
        }
    }

    public Z get() {
        return this.f23497g.get();
    }

    public Class<Z> getResourceClass() {
        return this.f23497g.getResourceClass();
    }

    public int getSize() {
        return this.f23497g.getSize();
    }

    public synchronized void recycle() {
        if (this.f23500j > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f23501k) {
            this.f23501k = true;
            if (this.f23496f) {
                this.f23497g.recycle();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("EngineResource{isMemoryCacheable=");
        sb.append(this.f23495e);
        sb.append(", listener=");
        sb.append(this.f23498h);
        sb.append(", key=");
        sb.append(this.f23499i);
        sb.append(", acquired=");
        sb.append(this.f23500j);
        sb.append(", isRecycled=");
        sb.append(this.f23501k);
        sb.append(", resource=");
        sb.append(this.f23497g);
        sb.append('}');
        return sb.toString();
    }
}
