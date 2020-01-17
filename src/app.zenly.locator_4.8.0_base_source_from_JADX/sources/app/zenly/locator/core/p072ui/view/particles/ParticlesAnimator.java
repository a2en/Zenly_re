package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.Listener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesAnimator */
public class ParticlesAnimator {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Choreographer f8777a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Renderer f8778b;

    /* renamed from: c */
    private final List<C3155a> f8779c = new ArrayList();

    /* renamed from: d */
    private int f8780d = 0;

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesAnimator$Choreographer */
    public interface Choreographer {
        boolean isChoreographerThread();

        void setAnimator(ParticlesAnimator particlesAnimator);

        void start();
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesAnimator$Renderer */
    public interface Renderer {
        void onNewParticle(C3151a aVar);

        void onParticlesAnimationFinished(ParticleAnimation particleAnimation);
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesAnimator$a */
    private class C3155a implements Listener {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final ParticleAnimation f8781a;

        /* renamed from: b */
        protected final ArrayList<C3151a> f8782b = new ArrayList<>();

        /* renamed from: c */
        private int f8783c = 0;

        /* renamed from: d */
        private long f8784d = 0;

        /* renamed from: e */
        private long f8785e = -1;

        /* renamed from: f */
        private int f8786f;

        /* renamed from: g */
        private TimeInterpolator f8787g;

        /* renamed from: h */
        private long f8788h;

        /* renamed from: i */
        private double f8789i;

        /* renamed from: j */
        private int f8790j;

        /* renamed from: k */
        private long f8791k;

        /* renamed from: l */
        private AtomicInteger f8792l = new AtomicInteger();

        C3155a(ParticleAnimation particleAnimation) {
            this.f8781a = particleAnimation;
            this.f8781a.mo9491a((Listener) this);
        }

        /* renamed from: b */
        private boolean m9976b() {
            C3151a n = this.f8781a.mo9506n();
            if (n == null) {
                return false;
            }
            startParticle(n);
            return true;
        }

        public void onResume() {
            ParticlesAnimator.this.f8777a.start();
        }

        public void onStart() {
            ParticlesAnimator.this.f8777a.start();
        }

        public void onTick() {
            this.f8792l.incrementAndGet();
            ParticlesAnimator.this.f8777a.start();
        }

        public void startParticle(C3151a aVar) {
            if (ParticlesAnimator.this.f8777a.isChoreographerThread()) {
                synchronized (this.f8782b) {
                    this.f8782b.add(aVar);
                }
                aVar.mo9518a(this.f8784d);
                ParticlesAnimator.this.f8778b.onNewParticle(aVar);
                return;
            }
            throw new RuntimeException("startParticle(Particle particle) must be called from choreographer thread");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9557a(int i, int i2, int i3, int i4) {
            synchronized (this.f8782b) {
                this.f8781a.mo9490a(i, i2, i3, i4);
                for (int size = this.f8782b.size() - 1; size >= 0; size--) {
                    ((C3151a) this.f8782b.get(size)).mo9517a(i, i2, i3, i4);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0172, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo9559a(long r11) {
            /*
                r10 = this;
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r0 = r10.f8782b
                monitor-enter(r0)
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r1 = r10.f8781a     // Catch:{ all -> 0x0173 }
                boolean r1 = r1.mo9501i()     // Catch:{ all -> 0x0173 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x0027
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r1 = r10.f8781a     // Catch:{ all -> 0x0173 }
                boolean r1 = r1.mo9503k()     // Catch:{ all -> 0x0173 }
                if (r1 != 0) goto L_0x0025
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r1 = r10.f8782b     // Catch:{ all -> 0x0173 }
                int r1 = r1.size()     // Catch:{ all -> 0x0173 }
                if (r1 > 0) goto L_0x0025
                java.util.concurrent.atomic.AtomicInteger r1 = r10.f8792l     // Catch:{ all -> 0x0173 }
                int r1 = r1.get()     // Catch:{ all -> 0x0173 }
                if (r1 <= 0) goto L_0x0027
            L_0x0025:
                r1 = 1
                goto L_0x0028
            L_0x0027:
                r1 = 0
            L_0x0028:
                if (r1 != 0) goto L_0x002c
                monitor-exit(r0)     // Catch:{ all -> 0x0173 }
                return r2
            L_0x002c:
                long r4 = r10.f8784d     // Catch:{ all -> 0x0173 }
                long r4 = r4 + r11
                r10.f8784d = r4     // Catch:{ all -> 0x0173 }
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r11 = r10.f8782b     // Catch:{ all -> 0x0173 }
                int r11 = r11.size()     // Catch:{ all -> 0x0173 }
                int r11 = r11 - r3
            L_0x0038:
                if (r11 < 0) goto L_0x006d
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r12 = r10.f8782b     // Catch:{ all -> 0x0173 }
                java.lang.Object r12 = r12.get(r11)     // Catch:{ all -> 0x0173 }
                app.zenly.locator.core.ui.view.particles.ParticleAnimation$a r12 = (app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a) r12     // Catch:{ all -> 0x0173 }
                boolean r1 = r12.mo9536r()     // Catch:{ all -> 0x0173 }
                if (r1 != 0) goto L_0x006a
                boolean r1 = r12.mo9535q()     // Catch:{ all -> 0x0173 }
                if (r1 == 0) goto L_0x0059
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r1 = r10.f8782b     // Catch:{ all -> 0x0173 }
                r1.remove(r12)     // Catch:{ all -> 0x0173 }
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r1 = r10.f8781a     // Catch:{ all -> 0x0173 }
                r1.mo9492a(r12)     // Catch:{ all -> 0x0173 }
                goto L_0x006a
            L_0x0059:
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r1 = r10.f8781a     // Catch:{ all -> 0x0173 }
                boolean r1 = r1.mo9498f()     // Catch:{ all -> 0x0173 }
                if (r1 == 0) goto L_0x0065
                r12.mo9537s()     // Catch:{ all -> 0x0173 }
                goto L_0x006a
            L_0x0065:
                long r4 = r10.f8784d     // Catch:{ all -> 0x0173 }
                r12.mo9518a(r4)     // Catch:{ all -> 0x0173 }
            L_0x006a:
                int r11 = r11 + -1
                goto L_0x0038
            L_0x006d:
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                boolean r11 = r11.mo9503k()     // Catch:{ all -> 0x0173 }
                if (r11 == 0) goto L_0x012e
                long r11 = r10.f8785e     // Catch:{ all -> 0x0173 }
                r4 = -1
                int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x008b
                long r11 = r10.f8784d     // Catch:{ all -> 0x0173 }
                r10.f8785e = r11     // Catch:{ all -> 0x0173 }
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                int r11 = r11.mo9495c()     // Catch:{ all -> 0x0173 }
                r10.f8790j = r11     // Catch:{ all -> 0x0173 }
                r11 = 1
                goto L_0x008c
            L_0x008b:
                r11 = 0
            L_0x008c:
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r12 = r10.f8781a     // Catch:{ all -> 0x0173 }
                boolean r12 = r12.mo9499g()     // Catch:{ all -> 0x0173 }
                if (r12 != 0) goto L_0x00f0
                if (r11 == 0) goto L_0x00b8
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                int r11 = r11.mo9496d()     // Catch:{ all -> 0x0173 }
                r10.f8786f = r11     // Catch:{ all -> 0x0173 }
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                android.animation.TimeInterpolator r11 = r11.mo9494b()     // Catch:{ all -> 0x0173 }
                r10.f8787g = r11     // Catch:{ all -> 0x0173 }
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                long r11 = r11.mo9487a()     // Catch:{ all -> 0x0173 }
                r10.f8788h = r11     // Catch:{ all -> 0x0173 }
                int r11 = r10.f8786f     // Catch:{ all -> 0x0173 }
                long r11 = (long) r11     // Catch:{ all -> 0x0173 }
                long r1 = r10.f8788h     // Catch:{ all -> 0x0173 }
                long r11 = r11 * r1
                double r11 = (double) r11     // Catch:{ all -> 0x0173 }
                r10.f8789i = r11     // Catch:{ all -> 0x0173 }
            L_0x00b8:
                r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                long r1 = r10.f8784d     // Catch:{ all -> 0x0173 }
                long r4 = r10.f8785e     // Catch:{ all -> 0x0173 }
                long r1 = r1 - r4
                double r1 = (double) r1     // Catch:{ all -> 0x0173 }
                double r4 = r10.f8789i     // Catch:{ all -> 0x0173 }
                double r1 = r1 / r4
                double r11 = java.lang.Math.min(r11, r1)     // Catch:{ all -> 0x0173 }
                float r11 = (float) r11     // Catch:{ all -> 0x0173 }
                android.animation.TimeInterpolator r12 = r10.f8787g     // Catch:{ all -> 0x0173 }
                float r11 = r12.getInterpolation(r11)     // Catch:{ all -> 0x0173 }
                int r12 = r10.f8786f     // Catch:{ all -> 0x0173 }
                float r12 = (float) r12     // Catch:{ all -> 0x0173 }
                float r12 = r12 * r11
                int r11 = (int) r12     // Catch:{ all -> 0x0173 }
            L_0x00d4:
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r12 = r10.f8782b     // Catch:{ all -> 0x0173 }
                int r12 = r12.size()     // Catch:{ all -> 0x0173 }
                int r1 = r10.f8790j     // Catch:{ all -> 0x0173 }
                if (r12 >= r1) goto L_0x014c
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r12 = r10.f8782b     // Catch:{ all -> 0x0173 }
                int r12 = r12.size()     // Catch:{ all -> 0x0173 }
                int r1 = r10.f8783c     // Catch:{ all -> 0x0173 }
                int r12 = r12 + r1
                if (r12 >= r11) goto L_0x014c
                boolean r12 = r10.m9976b()     // Catch:{ all -> 0x0173 }
                if (r12 != 0) goto L_0x00d4
                goto L_0x014c
            L_0x00f0:
                if (r11 == 0) goto L_0x00fe
                r10.m9976b()     // Catch:{ all -> 0x0173 }
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                long r11 = r11.mo9487a()     // Catch:{ all -> 0x0173 }
                r10.f8788h = r11     // Catch:{ all -> 0x0173 }
                goto L_0x014c
            L_0x00fe:
                long r11 = r10.f8784d     // Catch:{ all -> 0x0173 }
                long r4 = r10.f8791k     // Catch:{ all -> 0x0173 }
                long r11 = r11 - r4
                long r4 = r10.f8788h     // Catch:{ all -> 0x0173 }
                long r11 = r11 / r4
                int r12 = (int) r11     // Catch:{ all -> 0x0173 }
                if (r12 <= 0) goto L_0x014c
                long r4 = r10.f8791k     // Catch:{ all -> 0x0173 }
                long r6 = r10.f8788h     // Catch:{ all -> 0x0173 }
                long r8 = (long) r12     // Catch:{ all -> 0x0173 }
                long r6 = r6 * r8
                long r4 = r4 + r6
                r10.f8791k = r4     // Catch:{ all -> 0x0173 }
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                long r4 = r11.mo9487a()     // Catch:{ all -> 0x0173 }
                r10.f8788h = r4     // Catch:{ all -> 0x0173 }
            L_0x011b:
                if (r2 >= r12) goto L_0x014c
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r11 = r10.f8782b     // Catch:{ all -> 0x0173 }
                int r11 = r11.size()     // Catch:{ all -> 0x0173 }
                int r1 = r10.f8790j     // Catch:{ all -> 0x0173 }
                if (r11 <= r1) goto L_0x0128
                goto L_0x014c
            L_0x0128:
                r10.m9976b()     // Catch:{ all -> 0x0173 }
                int r2 = r2 + 1
                goto L_0x011b
            L_0x012e:
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                boolean r11 = r11.mo9504l()     // Catch:{ all -> 0x0173 }
                if (r11 == 0) goto L_0x014c
                java.util.concurrent.atomic.AtomicInteger r11 = r10.f8792l     // Catch:{ all -> 0x0173 }
                int r11 = r11.get()     // Catch:{ all -> 0x0173 }
                if (r11 <= 0) goto L_0x014c
            L_0x013e:
                java.util.concurrent.atomic.AtomicInteger r11 = r10.f8792l     // Catch:{ all -> 0x0173 }
                int r11 = r11.decrementAndGet()     // Catch:{ all -> 0x0173 }
                if (r11 < 0) goto L_0x014c
                boolean r11 = r10.m9976b()     // Catch:{ all -> 0x0173 }
                if (r11 != 0) goto L_0x013e
            L_0x014c:
                java.util.ArrayList<app.zenly.locator.core.ui.view.particles.ParticleAnimation$a> r11 = r10.f8782b     // Catch:{ all -> 0x0173 }
                int r11 = r11.size()     // Catch:{ all -> 0x0173 }
                if (r11 != 0) goto L_0x0171
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                boolean r11 = r11.mo9500h()     // Catch:{ all -> 0x0173 }
                if (r11 != 0) goto L_0x016c
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                boolean r11 = r11.mo9499g()     // Catch:{ all -> 0x0173 }
                if (r11 != 0) goto L_0x0171
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                int r11 = r11.mo9496d()     // Catch:{ all -> 0x0173 }
                if (r11 != 0) goto L_0x0171
            L_0x016c:
                app.zenly.locator.core.ui.view.particles.ParticleAnimation r11 = r10.f8781a     // Catch:{ all -> 0x0173 }
                r11.mo9508p()     // Catch:{ all -> 0x0173 }
            L_0x0171:
                monitor-exit(r0)     // Catch:{ all -> 0x0173 }
                return r3
            L_0x0173:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0173 }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.p072ui.view.particles.ParticlesAnimator.C3155a.mo9559a(long):boolean");
        }

        /* renamed from: a */
        public boolean mo9558a() {
            boolean z;
            synchronized (this.f8782b) {
                z = this.f8781a.mo9498f() && this.f8782b.size() == 0;
            }
            return z;
        }
    }

    /* renamed from: a */
    public void mo9551a(Choreographer choreographer) {
        this.f8777a = choreographer;
        this.f8777a.setAnimator(this);
    }

    /* renamed from: a */
    public void mo9552a(Renderer renderer) {
        this.f8778b = renderer;
    }

    /* renamed from: a */
    public void mo9550a(ParticleAnimation particleAnimation) {
        synchronized (this.f8779c) {
            if (particleAnimation.mo9497e() > -1) {
                this.f8780d = Math.max(this.f8780d, particleAnimation.mo9497e() + 1);
            } else {
                this.f8780d = particleAnimation.mo9486a(this.f8780d) + 1;
            }
            this.f8779c.add(new C3155a(particleAnimation));
            if (particleAnimation.mo9503k()) {
                this.f8777a.start();
            }
        }
    }

    /* renamed from: a */
    public void mo9549a(int i, int i2, int i3, int i4) {
        synchronized (this.f8779c) {
            for (int size = this.f8779c.size() - 1; size >= 0; size--) {
                ((C3155a) this.f8779c.get(size)).mo9557a(i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    public boolean mo9553a(long j) {
        boolean z;
        synchronized (this.f8779c) {
            z = false;
            for (int size = this.f8779c.size() - 1; size >= 0; size--) {
                C3155a aVar = (C3155a) this.f8779c.get(size);
                if (aVar.mo9559a(j)) {
                    z = true;
                } else if (aVar.mo9558a()) {
                    this.f8779c.remove(aVar);
                    this.f8778b.onParticlesAnimationFinished(aVar.f8781a);
                }
            }
        }
        return z;
    }
}
