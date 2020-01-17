package com.mapbox.android.core.location;

/* renamed from: com.mapbox.android.core.location.f */
public class C11274f {

    /* renamed from: a */
    private final long f29106a;

    /* renamed from: b */
    private final int f29107b;

    /* renamed from: c */
    private final float f29108c;

    /* renamed from: d */
    private final long f29109d;

    /* renamed from: e */
    private final long f29110e;

    /* renamed from: com.mapbox.android.core.location.f$b */
    public static final class C11276b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final long f29111a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f29112b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f29113c = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f29114d = 0;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f29115e = 0;

        public C11276b(long j) {
            this.f29111a = j;
        }

        /* renamed from: a */
        public C11276b mo32710a(int i) {
            this.f29112b = i;
            return this;
        }

        /* renamed from: b */
        public C11276b mo32713b(long j) {
            this.f29114d = j;
            return this;
        }

        /* renamed from: a */
        public C11276b mo32711a(long j) {
            this.f29115e = j;
            return this;
        }

        /* renamed from: a */
        public C11274f mo32712a() {
            return new C11274f(this);
        }
    }

    /* renamed from: a */
    public float mo32705a() {
        return this.f29108c;
    }

    /* renamed from: b */
    public long mo32706b() {
        return this.f29110e;
    }

    /* renamed from: c */
    public long mo32707c() {
        return this.f29106a;
    }

    /* renamed from: d */
    public long mo32708d() {
        return this.f29109d;
    }

    /* renamed from: e */
    public int mo32709e() {
        return this.f29107b;
    }

    private C11274f(C11276b bVar) {
        this.f29106a = bVar.f29111a;
        this.f29107b = bVar.f29112b;
        this.f29108c = bVar.f29113c;
        this.f29109d = bVar.f29114d;
        this.f29110e = bVar.f29115e;
    }
}
