package app.zenly.locator.core.p072ui.view.particles;

import app.zenly.locator.core.p072ui.view.particles.ParticlesAnimator.Choreographer;

/* renamed from: app.zenly.locator.core.ui.view.particles.j */
public class C3188j implements Choreographer {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ParticlesAnimator f8959a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f8960b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3190b f8961c;

    /* renamed from: app.zenly.locator.core.ui.view.particles.j$b */
    private class C3190b extends Thread {

        /* renamed from: e */
        private long f8962e;

        /* renamed from: f */
        public volatile boolean f8963f;

        public void run() {
            super.run();
            while (!isInterrupted() && this.f8963f) {
                long min = this.f8962e > -1 ? Math.min(System.currentTimeMillis() - this.f8962e, 16) : 0;
                this.f8962e = System.currentTimeMillis();
                this.f8963f = C3188j.this.f8959a.mo9553a(min);
                if (this.f8963f) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            synchronized (C3188j.this.f8960b) {
                if (C3188j.this.f8961c == this) {
                    C3188j.this.f8961c = null;
                }
            }
        }

        private C3190b() {
            super("ParticlesChoreographerThread");
            this.f8962e = -1;
            this.f8963f = true;
        }
    }

    public boolean isChoreographerThread() {
        return Thread.currentThread() == this.f8961c;
    }

    public void setAnimator(ParticlesAnimator particlesAnimator) {
        this.f8959a = particlesAnimator;
    }

    public void start() {
        synchronized (this.f8960b) {
            if (this.f8961c == null || !this.f8961c.f8963f || this.f8961c.isInterrupted()) {
                this.f8961c = new C3190b();
                this.f8961c.start();
            }
        }
    }
}
