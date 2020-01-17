package com.bumptech.glide.util.pool;

/* renamed from: com.bumptech.glide.util.pool.b */
public abstract class C9248b {

    /* renamed from: com.bumptech.glide.util.pool.b$b */
    private static class C9250b extends C9248b {

        /* renamed from: a */
        private volatile boolean f24023a;

        C9250b() {
            super();
        }

        /* renamed from: a */
        public void mo24932a() {
            if (this.f24023a) {
                throw new IllegalStateException("Already released");
            }
        }

        /* renamed from: a */
        public void mo24933a(boolean z) {
            this.f24023a = z;
        }
    }

    /* renamed from: b */
    public static C9248b m22265b() {
        return new C9250b();
    }

    /* renamed from: a */
    public abstract void mo24932a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo24933a(boolean z);

    private C9248b() {
    }
}
