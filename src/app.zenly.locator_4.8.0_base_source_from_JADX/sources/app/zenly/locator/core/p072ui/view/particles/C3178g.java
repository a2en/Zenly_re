package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.SizeF;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.g */
public class C3178g extends ParticleAnimation<C3179a> {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final TimeInterpolator f8922m = C7657c.m18642a(1.2f);

    /* renamed from: k */
    private final PointF f8923k;

    /* renamed from: l */
    private final SizeF f8924l;

    /* renamed from: app.zenly.locator.core.ui.view.particles.g$a */
    public class C3179a extends C3151a {
        protected C3179a(C3178g gVar, Bitmap bitmap, float f, float f2, float f3, float f4) {
            super(bitmap, f, f2, f3, f4);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            float f2 = (14.5f * f) + 0.5f;
            this.f8735j = this.f8729d * f2;
            this.f8736k = this.f8730e * f2;
            if (f > 0.5f) {
                this.f8737l = 255 - ((int) (((f - 0.5f) * 2.0f) * 255.0f));
            }
        }

        /* renamed from: b */
        public long mo9519b() {
            return 800;
        }

        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return C3178g.f8922m;
        }
    }

    public C3178g(PointF pointF, SizeF sizeF) {
        this.f8923k = pointF;
        this.f8924l = sizeF;
    }

    /* renamed from: a */
    public long mo9487a() {
        return 400;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3179a m10108a(Bitmap bitmap) {
        PointF pointF = this.f8923k;
        C3179a aVar = new C3179a(this, bitmap, pointF.x, pointF.y, this.f8924l.getWidth(), this.f8924l.getHeight());
        return aVar;
    }
}
