package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.util.SizeF;
import android.view.View;
import androidx.dynamicanimation.animation.C0728d;
import androidx.dynamicanimation.animation.C0730f;
import androidx.dynamicanimation.animation.C0731g;
import app.zenly.android.base.view.C1311b;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.p072ui.view.particles.ParticlePathAnimation.OnAnimationListener;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3238u;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesGroupEmojisAnimation */
public final class ParticlesGroupEmojisAnimation extends ParticleAnimation<C3157b> {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final TimeInterpolator f8794k = C7657c.m18643b();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final float f8795l = ((float) C3200e0.m10183a(this.f8798o.getContext(), 65));

    /* renamed from: m */
    private final ArrayList<C3157b> f8796m = new ArrayList<>();

    /* renamed from: n */
    private final Handler f8797n = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final View f8798o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final View f8799p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final SizeF f8800q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final OnAnimationListener f8801r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final OnNewParticleStartedCallback f8802s;

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesGroupEmojisAnimation$OnNewParticleStartedCallback */
    public interface OnNewParticleStartedCallback {
        void onNewParticleStarted(int i);
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesGroupEmojisAnimation$a */
    public static final class C3156a {
        private C3156a() {
        }

        public /* synthetic */ C3156a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesGroupEmojisAnimation$b */
    public final class C3157b extends C3151a {

        /* renamed from: A */
        private double f8803A;

        /* renamed from: B */
        private double f8804B;

        /* renamed from: C */
        private double f8805C;

        /* renamed from: D */
        private double f8806D;

        /* renamed from: E */
        private double f8807E;

        /* renamed from: F */
        private float f8808F;

        /* renamed from: G */
        private C0728d f8809G = new C0728d();

        /* renamed from: H */
        private int f8810H;

        /* renamed from: I */
        private final Point f8811I;

        /* renamed from: J */
        private boolean f8812J;

        /* renamed from: K */
        final /* synthetic */ ParticlesGroupEmojisAnimation f8813K;

        /* renamed from: v */
        private final int f8814v;

        /* renamed from: w */
        private int f8815w;

        /* renamed from: x */
        private int f8816x;

        /* renamed from: y */
        private int f8817y;

        /* renamed from: z */
        private double f8818z;

        public C3157b(ParticlesGroupEmojisAnimation particlesGroupEmojisAnimation, Bitmap bitmap) {
            C12932j.m33818b(bitmap, "bitmap");
            this.f8813K = particlesGroupEmojisAnimation;
            super(bitmap, particlesGroupEmojisAnimation.f8798o.getX(), particlesGroupEmojisAnimation.f8798o.getY(), particlesGroupEmojisAnimation.f8800q.getWidth(), particlesGroupEmojisAnimation.f8800q.getHeight());
            this.f8814v = (int) particlesGroupEmojisAnimation.f8795l;
            this.f8811I = new Point(particlesGroupEmojisAnimation.f8798o.getWidth() / 2, (-particlesGroupEmojisAnimation.f8798o.getHeight()) / 2);
            mo9540v();
        }

        /* renamed from: a */
        private final void m9998a(float f, float f2) {
            this.f8733h += f - this.f8727b;
            this.f8734i += f2 - this.f8728c;
            Context context = this.f8813K.f8798o.getContext();
            this.f8810H = ThreadLocalRandom.current().nextInt(C3200e0.m10183a(context, -7), C3200e0.m10183a(context, 7));
            this.f8727b = f + ((float) (this.f8810H * 2));
            this.f8728c = (float) C13045c.m34054a(((float) this.f8811I.y) - this.f8813K.f8798o.getTranslationY());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return 1000;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return this.f8813K.f8794k;
        }

        /* renamed from: u */
        public void mo9539u() {
            if (!this.f8812J) {
                this.f8812J = true;
                OnNewParticleStartedCallback b = this.f8813K.f8802s;
                if (b != null) {
                    b.onNewParticleStarted(this.f8813K.f8720d.size());
                }
                this.f8813K.m9981a(this.f8809G);
            }
            if (this.f8813K.f8798o.getWindowToken() == this.f8813K.f8799p.getWindowToken()) {
                this.f8811I.x = this.f8813K.f8798o.getWidth() / 2;
                this.f8811I.y = (-this.f8813K.f8798o.getHeight()) / 2;
                C1311b.m6281a(this.f8813K.f8798o, this.f8811I, this.f8813K.f8799p);
                Point point = this.f8811I;
                this.f8727b = ((float) point.x) + ((float) (this.f8810H * 2));
                this.f8728c = (float) C13045c.m34054a(((float) point.y) - this.f8813K.f8798o.getTranslationY());
            }
        }

        /* renamed from: w */
        public void mo9540v() {
            super.mo9540v();
            this.f8812J = false;
            this.f8815w = 0;
            double radians = Math.toRadians(-90.0d);
            this.f8818z = Math.cos(radians);
            this.f8803A = Math.sin(radians);
            this.f8816x = C3238u.m10270a(-5, 5);
            double radians2 = Math.toRadians((double) (this.f8816x - 90));
            this.f8804B = Math.cos(radians2);
            this.f8805C = Math.sin(radians2);
            this.f8809G.mo3671a(0.0f);
            int a = C3238u.m10270a(0, 10);
            int i = this.f8816x;
            this.f8817y = i > 0 ? i + a : i - a;
            double radians3 = Math.toRadians((double) (this.f8817y - 90));
            this.f8806D = Math.cos(radians3);
            this.f8807E = Math.sin(radians3);
            this.f8808F = C3238u.m10269a(0.4f, 0.7f);
            C1311b.m6281a(this.f8813K.f8798o, this.f8811I, this.f8813K.f8799p);
            Point point = this.f8811I;
            m9998a((float) point.x, (float) point.y);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            double d;
            double d2;
            double d3;
            float f2;
            double d4;
            float f3 = this.f8808F;
            if (f > f3) {
                float f4 = (float) 1;
                this.f8737l = 255 - ((int) (((f - f3) * (f4 / (f4 - f3))) * 255.0f));
            }
            float a = this.f8809G.mo3670a();
            this.f8735j = this.f8729d * a;
            this.f8736k = this.f8730e * a;
            if (f < 0.2f) {
                float f5 = 5.0f * f;
                int i = this.f8815w;
                f2 = ((float) i) + (((float) (this.f8816x - i)) * f5);
                double d5 = this.f8818z;
                d4 = (double) f5;
                d3 = d5 + ((this.f8804B - d5) * d4);
                d2 = this.f8803A;
                d = this.f8805C;
            } else {
                float f6 = (f - 0.2f) / 0.8f;
                int i2 = this.f8816x;
                f2 = ((float) i2) + (((float) (this.f8817y - i2)) * f6);
                double d6 = this.f8804B;
                d4 = (double) f6;
                d3 = d6 + ((this.f8806D - d6) * d4);
                d2 = this.f8805C;
                d = this.f8807E;
            }
            double d7 = d2 + ((d - d2) * d4);
            this.f8738m = f2 * f;
            double d8 = (double) this.f8727b;
            int i3 = this.f8814v;
            this.f8733h = (float) ((int) (d8 + (((double) (((float) i3) * f)) * d3)));
            this.f8734i = (float) ((int) (((double) this.f8728c) + (((double) (((float) i3) * f)) * d7)));
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlesGroupEmojisAnimation$c */
    static final class C3158c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ParticlesGroupEmojisAnimation f8819e;

        C3158c(ParticlesGroupEmojisAnimation particlesGroupEmojisAnimation) {
            this.f8819e = particlesGroupEmojisAnimation;
        }

        public final void run() {
            this.f8819e.f8801r.onAnimationEnd();
        }
    }

    static {
        new C3156a(null);
    }

    public ParticlesGroupEmojisAnimation(View view, View view2, SizeF sizeF, OnAnimationListener onAnimationListener, OnNewParticleStartedCallback onNewParticleStartedCallback) {
        C12932j.m33818b(view, "startPoint");
        C12932j.m33818b(view2, "refView");
        C12932j.m33818b(sizeF, "particleSize");
        this.f8798o = view;
        this.f8799p = view2;
        this.f8800q = sizeF;
        this.f8801r = onAnimationListener;
        this.f8802s = onNewParticleStartedCallback;
    }

    /* renamed from: a */
    public long mo9487a() {
        return 50;
    }

    /* renamed from: g */
    public boolean mo9499g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo9508p() {
        super.mo9508p();
        if (this.f8801r != null) {
            this.f8797n.post(new C3158c(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C3157b m9996n() {
        C3157b bVar = (C3157b) super.mo9506n();
        if (bVar != null) {
            synchronized (this.f8796m) {
                this.f8796m.add(bVar);
            }
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3157b m9991a(Bitmap bitmap) {
        C12932j.m33818b(bitmap, "bitmap");
        return new C3157b(this, bitmap);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9492a(C3157b bVar) {
        C12932j.m33818b(bVar, "particle");
        synchronized (this.f8796m) {
            this.f8796m.remove(bVar);
        }
        super.mo9492a(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9981a(C0728d dVar) {
        C0731g gVar = new C0731g();
        gVar.mo3684c(200.0f);
        gVar.mo3680a(0.5f);
        C0730f fVar = new C0730f(dVar);
        fVar.mo3672a(gVar);
        fVar.mo3620c(0.002f);
        C0730f fVar2 = fVar;
        fVar2.mo3624e(0.0f);
        fVar2.mo3677g(0.8f);
    }
}
