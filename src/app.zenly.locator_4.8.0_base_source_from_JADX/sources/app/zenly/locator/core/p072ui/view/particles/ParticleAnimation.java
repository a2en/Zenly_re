package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.ParticleAnimation */
public abstract class ParticleAnimation<P extends C3151a> {

    /* renamed from: i */
    public static final TimeInterpolator f8715i = C7657c.m18649e();

    /* renamed from: j */
    public static final TimeInterpolator f8716j = C7657c.m18642a(1.3f);

    /* renamed from: a */
    private volatile int f8717a = 0;

    /* renamed from: b */
    private volatile boolean f8718b = false;

    /* renamed from: c */
    protected Listener f8719c;

    /* renamed from: d */
    protected final ArrayDeque<P> f8720d = new ArrayDeque<>();

    /* renamed from: e */
    protected final HashMap<Bitmap, ArrayDeque<P>> f8721e = new HashMap<>();

    /* renamed from: f */
    protected int f8722f = -1;

    /* renamed from: g */
    private int f8723g = 0;

    /* renamed from: h */
    private Object[] f8724h;

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticleAnimation$Listener */
    public interface Listener {
        void onResume();

        void onStart();

        void onTick();

        void startParticle(C3151a aVar);
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticleAnimation$a */
    public static abstract class C3151a {

        /* renamed from: u */
        public static final Mode f8725u = Mode.SRC_OVER;

        /* renamed from: a */
        protected final Bitmap f8726a;

        /* renamed from: b */
        protected float f8727b;

        /* renamed from: c */
        protected float f8728c;

        /* renamed from: d */
        protected float f8729d;

        /* renamed from: e */
        protected float f8730e;

        /* renamed from: f */
        private int f8731f;

        /* renamed from: g */
        protected int f8732g;

        /* renamed from: h */
        protected volatile float f8733h;

        /* renamed from: i */
        protected volatile float f8734i;

        /* renamed from: j */
        protected volatile float f8735j;

        /* renamed from: k */
        protected volatile float f8736k;

        /* renamed from: l */
        protected volatile int f8737l = 255;

        /* renamed from: m */
        protected volatile float f8738m = 0.0f;

        /* renamed from: n */
        protected volatile boolean f8739n = true;

        /* renamed from: o */
        protected volatile float f8740o = 0.0f;

        /* renamed from: p */
        protected volatile float f8741p = 0.0f;

        /* renamed from: q */
        protected volatile int f8742q = 0;

        /* renamed from: r */
        protected volatile Mode f8743r = f8725u;

        /* renamed from: s */
        private long f8744s = -1;

        /* renamed from: t */
        private volatile int f8745t = 0;

        protected C3151a(Bitmap bitmap, float f, float f2, float f3, float f4) {
            this.f8726a = bitmap;
            this.f8727b = f;
            this.f8733h = f;
            this.f8728c = f2;
            this.f8734i = f2;
            this.f8729d = f3;
            this.f8735j = f3;
            this.f8730e = f4;
            this.f8736k = f4;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo9515a(float f);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9516a(int i) {
            this.f8731f = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9517a(int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return 900;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo9520b(int i) {
            this.f8732g = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return ParticleAnimation.f8716j;
        }

        /* renamed from: d */
        public final Bitmap mo9522d() {
            return this.f8726a;
        }

        /* renamed from: e */
        public final int mo9523e() {
            return this.f8742q;
        }

        /* renamed from: f */
        public final int mo9524f() {
            return this.f8737l;
        }

        /* renamed from: g */
        public final float mo9525g() {
            return this.f8736k;
        }

        /* renamed from: h */
        public final float mo9526h() {
            return this.f8738m;
        }

        /* renamed from: i */
        public final float mo9527i() {
            return this.f8739n ? this.f8735j / 2.0f : this.f8740o;
        }

        /* renamed from: j */
        public final float mo9528j() {
            return this.f8739n ? this.f8736k / 2.0f : this.f8741p;
        }

        /* renamed from: k */
        public final float mo9529k() {
            return this.f8735j;
        }

        /* renamed from: l */
        public final float mo9530l() {
            return this.f8733h;
        }

        /* renamed from: m */
        public final float mo9531m() {
            return this.f8734i;
        }

        /* renamed from: n */
        public final int mo9532n() {
            return (this.f8731f * 100000) + this.f8732g;
        }

        /* renamed from: o */
        public final Mode mo9533o() {
            return this.f8743r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public boolean mo9534p() {
            return false;
        }

        /* renamed from: q */
        public final boolean mo9535q() {
            return this.f8745t == 3;
        }

        /* renamed from: r */
        public final boolean mo9536r() {
            return this.f8745t == 2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public void mo9537s() {
            this.f8745t = 2;
            mo9538t();
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo9538t() {
        }

        /* renamed from: u */
        public void mo9539u() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo9540v() {
            this.f8733h = this.f8727b;
            this.f8734i = this.f8728c;
            this.f8735j = this.f8729d;
            this.f8736k = this.f8730e;
            this.f8737l = 255;
            this.f8738m = 0.0f;
            this.f8744s = -1;
            this.f8745t = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9518a(long j) {
            if (this.f8744s == -1) {
                this.f8744s = j;
            }
            float min = Math.min(1.0f, ((float) (j - this.f8744s)) / ((float) mo9519b()));
            mo9515a(mo9521c().getInterpolation(min));
            if (min != 1.0f) {
                return;
            }
            if (!mo9534p()) {
                mo9537s();
            } else {
                mo9540v();
            }
        }

        /* renamed from: a */
        public final void mo9514a() {
            this.f8745t = 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c A[LOOP:1: B:13:0x0037->B:15:0x003c, LOOP_END] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9894r() {
        /*
            r6 = this;
            java.util.ArrayDeque<P> r0 = r6.f8720d
            monitor-enter(r0)
            java.lang.Object[] r1 = r6.f8724h     // Catch:{ all -> 0x005f }
            r2 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.Object[] r1 = r6.f8724h     // Catch:{ all -> 0x005f }
            int r1 = r1.length     // Catch:{ all -> 0x005f }
            java.util.ArrayDeque<P> r3 = r6.f8720d     // Catch:{ all -> 0x005f }
            int r3 = r3.size()     // Catch:{ all -> 0x005f }
            if (r1 == r3) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            java.util.ArrayDeque<P> r1 = r6.f8720d     // Catch:{ all -> 0x005f }
            r1.clear()     // Catch:{ all -> 0x005f }
            goto L_0x0037
        L_0x001a:
            java.util.ArrayDeque<P> r1 = r6.f8720d     // Catch:{ all -> 0x005f }
            int r1 = r1.size()     // Catch:{ all -> 0x005f }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x005f }
            r6.f8724h = r1     // Catch:{ all -> 0x005f }
            r1 = 0
        L_0x0025:
            java.lang.Object[] r3 = r6.f8724h     // Catch:{ all -> 0x005f }
            int r3 = r3.length     // Catch:{ all -> 0x005f }
            if (r1 >= r3) goto L_0x0037
            java.lang.Object[] r3 = r6.f8724h     // Catch:{ all -> 0x005f }
            java.util.ArrayDeque<P> r4 = r6.f8720d     // Catch:{ all -> 0x005f }
            java.lang.Object r4 = r4.pollFirst()     // Catch:{ all -> 0x005f }
            r3[r1] = r4     // Catch:{ all -> 0x005f }
            int r1 = r1 + 1
            goto L_0x0025
        L_0x0037:
            java.lang.Object[] r1 = r6.f8724h     // Catch:{ all -> 0x005f }
            int r1 = r1.length     // Catch:{ all -> 0x005f }
            if (r2 >= r1) goto L_0x005d
            java.lang.Object[] r1 = r6.f8724h     // Catch:{ all -> 0x005f }
            int r1 = r1.length     // Catch:{ all -> 0x005f }
            int r1 = app.zenly.locator.core.util.C3238u.m10270a(r2, r1)     // Catch:{ all -> 0x005f }
            java.lang.Object[] r3 = r6.f8724h     // Catch:{ all -> 0x005f }
            r3 = r3[r1]     // Catch:{ all -> 0x005f }
            java.lang.Object[] r4 = r6.f8724h     // Catch:{ all -> 0x005f }
            java.lang.Object[] r5 = r6.f8724h     // Catch:{ all -> 0x005f }
            r5 = r5[r2]     // Catch:{ all -> 0x005f }
            r4[r1] = r5     // Catch:{ all -> 0x005f }
            java.lang.Object[] r1 = r6.f8724h     // Catch:{ all -> 0x005f }
            r1[r2] = r3     // Catch:{ all -> 0x005f }
            java.util.ArrayDeque<P> r1 = r6.f8720d     // Catch:{ all -> 0x005f }
            app.zenly.locator.core.ui.view.particles.ParticleAnimation$a r3 = (app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a) r3     // Catch:{ all -> 0x005f }
            r1.add(r3)     // Catch:{ all -> 0x005f }
            int r2 = r2 + 1
            goto L_0x0037
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            return
        L_0x005f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.m9894r():void");
    }

    /* renamed from: a */
    public long mo9487a() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract P mo9488a(Bitmap bitmap);

    /* renamed from: a */
    public ParticleAnimation mo9489a(Bitmap bitmap, int i) {
        synchronized (this.f8720d) {
            for (int i2 = 0; i2 < i; i2++) {
                this.f8720d.add(mo9488a(bitmap));
            }
        }
        return this;
    }

    /* renamed from: b */
    public TimeInterpolator mo9494b() {
        return f8715i;
    }

    /* renamed from: c */
    public int mo9495c() {
        return 500;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo9496d() {
        int size;
        synchronized (this.f8720d) {
            size = this.f8720d.size();
        }
        return size;
    }

    /* renamed from: e */
    public int mo9497e() {
        return this.f8722f;
    }

    /* renamed from: f */
    public boolean mo9498f() {
        return this.f8717a == 3;
    }

    /* renamed from: g */
    public boolean mo9499g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo9500h() {
        return this.f8717a == 2;
    }

    /* renamed from: i */
    public boolean mo9501i() {
        return this.f8718b;
    }

    /* renamed from: j */
    public boolean mo9502j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo9503k() {
        return this.f8717a == 1;
    }

    /* renamed from: l */
    public boolean mo9504l() {
        return this.f8717a == 0;
    }

    /* renamed from: m */
    public void mo9505m() {
        if (!this.f8718b) {
            this.f8718b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public P mo9506n() {
        P p;
        synchronized (this.f8720d) {
            if (mo9502j() && this.f8720d.size() > 1 && this.f8723g % (this.f8720d.size() - 1) == 0) {
                m9894r();
            }
            p = (C3151a) this.f8720d.poll();
            if (mo9499g() && p != null) {
                this.f8720d.add(p);
            }
        }
        if (mo9499g() && p != null) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f8721e.get(p.f8726a);
            p = (arrayDeque == null || arrayDeque.isEmpty()) ? mo9488a(p.f8726a) : (C3151a) arrayDeque.poll();
        }
        if (p != null) {
            p.mo9516a(this.f8722f);
            p.mo9520b(this.f8723g % 100000);
            int i = this.f8723g;
            if (i < 2147483646) {
                this.f8723g = i + 1;
            } else {
                this.f8723g = 0;
            }
        }
        return p;
    }

    /* renamed from: o */
    public void mo9507o() {
        if (this.f8718b) {
            this.f8718b = false;
            Listener listener = this.f8719c;
            if (listener != null) {
                listener.onResume();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo9508p() {
        this.f8717a = 3;
    }

    /* renamed from: q */
    public void mo9509q() {
        if (this.f8717a == 0) {
            this.f8717a = 1;
            Listener listener = this.f8719c;
            if (listener != null) {
                listener.onStart();
            }
        }
    }

    /* renamed from: a */
    public void mo9493a(boolean z) {
        if (this.f8717a != 3) {
            if (!z) {
                this.f8717a = 2;
            } else {
                this.f8717a = 3;
            }
        }
    }

    /* renamed from: a */
    public int mo9486a(int i) {
        this.f8722f = Math.max(-1, i % 21474);
        return this.f8722f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9492a(P p) {
        if (mo9499g()) {
            p.mo9540v();
            ArrayDeque arrayDeque = (ArrayDeque) this.f8721e.get(p.f8726a);
            if (arrayDeque == null) {
                arrayDeque = new ArrayDeque();
                this.f8721e.put(p.f8726a, arrayDeque);
            }
            arrayDeque.add(p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9491a(Listener listener) {
        this.f8719c = listener;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9490a(int i, int i2, int i3, int i4) {
        synchronized (this.f8720d) {
            Iterator it = this.f8720d.iterator();
            while (it.hasNext()) {
                ((C3151a) it.next()).mo9517a(i, i2, i3, i4);
            }
        }
    }
}
