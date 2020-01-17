package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.SizeF;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.util.C3238u;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.ParticlePathAnimation */
public class ParticlePathAnimation extends ParticleAnimation<C3152a> {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final TimeInterpolator f8746o = C7657c.m18649e();

    /* renamed from: k */
    private final PointF f8747k;

    /* renamed from: l */
    private final PointF f8748l;

    /* renamed from: m */
    private final SizeF f8749m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final OnAnimationListener f8750n;

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlePathAnimation$OnAnimationListener */
    public interface OnAnimationListener {
        void onAnimationEnd();
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.ParticlePathAnimation$a */
    public class C3152a extends C3151a {

        /* renamed from: A */
        private float f8751A;

        /* renamed from: v */
        private float f8753v;

        /* renamed from: w */
        private float f8754w;

        /* renamed from: x */
        private float f8755x;

        /* renamed from: y */
        private float f8756y;

        /* renamed from: z */
        private float f8757z;

        protected C3152a(Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6) {
            super(bitmap, f, f2, f3, f4);
            this.f8753v = f5;
            this.f8754w = f6;
            this.f8755x = f + ((f5 - f) / 2.0f);
            this.f8756y = f2 + ((f6 - f2) / 2.0f);
            this.f8757z = f3 * 3.5f;
            this.f8751A = f4 * 3.5f;
            this.f8755x += C3238u.m10269a(-f3, f3);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            if (f < 0.5f) {
                float f2 = f * 2.0f;
                float f3 = this.f8729d;
                this.f8735j = f3 + ((this.f8757z - f3) * f2);
                float f4 = this.f8730e;
                this.f8736k = f4 + ((this.f8751A - f4) * f2);
                float f5 = this.f8727b;
                this.f8733h = f5 + ((this.f8755x - f5) * f2);
                float f6 = this.f8728c;
                this.f8734i = f6 + ((this.f8756y - f6) * f2);
                return;
            }
            float f7 = (f - 0.5f) * 2.0f;
            float f8 = this.f8757z;
            this.f8735j = f8 + ((this.f8729d - f8) * f7);
            float f9 = this.f8751A;
            this.f8736k = f9 + ((this.f8730e - f9) * f7);
            float f10 = this.f8755x;
            this.f8733h = f10 + ((this.f8753v - f10) * f7);
            float f11 = this.f8756y;
            this.f8734i = f11 + ((this.f8754w - f11) * f7);
            this.f8737l = 255 - Math.round(f7 * 255.0f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return 700;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return ParticlePathAnimation.f8746o;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo9538t() {
            super.mo9538t();
            if (ParticlePathAnimation.this.f8750n != null) {
                ParticlePathAnimation.this.f8750n.onAnimationEnd();
            }
        }
    }

    public ParticlePathAnimation(PointF pointF, PointF pointF2, SizeF sizeF, OnAnimationListener onAnimationListener) {
        this.f8747k = pointF;
        this.f8748l = pointF2;
        this.f8749m = sizeF;
        this.f8750n = onAnimationListener;
    }

    /* renamed from: g */
    public boolean mo9499g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3152a m9949a(Bitmap bitmap) {
        PointF pointF = this.f8747k;
        float f = pointF.x;
        float f2 = pointF.y;
        float width = this.f8749m.getWidth();
        float height = this.f8749m.getHeight();
        PointF pointF2 = this.f8748l;
        C3152a aVar = new C3152a(bitmap, f, f2, width, height, pointF2.x, pointF2.y);
        return aVar;
    }
}
