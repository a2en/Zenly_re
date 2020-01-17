package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.Rect;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.util.C3240v;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.ClosedRange;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.e */
public final class C3171e extends ParticleAnimation<C3173b> {

    /* renamed from: l */
    private static final ClosedFloatingPointRange<Float> f8889l = C12971j.m33881a(0.6f, 3.0f);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final ClosedFloatingPointRange<Float> f8890m = C12971j.m33881a(4.0f, 8.0f);

    /* renamed from: k */
    private final Rect f8891k;

    /* renamed from: app.zenly.locator.core.ui.view.particles.e$a */
    public static final class C3172a {
        private C3172a() {
        }

        public /* synthetic */ C3172a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.e$b */
    public static final class C3173b extends C3151a {

        /* renamed from: v */
        private final float f8892v = ((C3240v.m10273a((ClosedRange<Double>) C12971j.m33881a(-60.0f, 15.0f)) + ((float) 360)) % 360.0f);

        /* renamed from: w */
        private final float f8893w = C3240v.m10273a((ClosedRange<Double>) C3171e.f8890m);

        /* renamed from: x */
        private boolean f8894x;

        /* renamed from: app.zenly.locator.core.ui.view.particles.e$b$a */
        private static final class C3174a implements TimeInterpolator {
            public float getInterpolation(float f) {
                float f2 = f * ((float) 10);
                float f3 = (float) ((int) f2);
                float f4 = f2 - f3;
                return f3 % 2.0f == 0.0f ? f4 : ((float) 1) - f4;
            }
        }

        public C3173b(Bitmap bitmap, float f, float f2, float f3, float f4) {
            C12932j.m33818b(bitmap, "bitmap");
            super(bitmap, f, f2, f3, f4);
        }

        /* renamed from: a */
        private final float m10075a(float f, float f2, float f3) {
            return (f3 - f) / (f2 - f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            float interpolation = C7657c.m18643b().getInterpolation(new C3174a().getInterpolation(f));
            this.f8738m = ((this.f8892v + (this.f8893w * interpolation)) + 360.0f) % 360.0f;
            if (this.f8894x || f >= 0.2f) {
                float f2 = this.f8729d;
                this.f8735j = f2 - ((interpolation * f2) * 0.05f);
                float f3 = this.f8730e;
                this.f8736k = f3 - ((interpolation * f3) * 0.05f);
                return;
            }
            float interpolation2 = C7657c.m18646c(0.5f).getInterpolation(m10075a(0.0f, 0.2f, f));
            this.f8735j = this.f8729d * interpolation2;
            this.f8736k = this.f8730e * interpolation2;
            this.f8737l = (int) (Math.min(interpolation2, 1.0f) * 255.0f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return 5000;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return C7657c.m18649e();
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public boolean mo9534p() {
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo9540v() {
            float f = this.f8738m;
            float f2 = this.f8735j;
            float f3 = this.f8736k;
            super.mo9540v();
            this.f8738m = f;
            this.f8735j = f2;
            this.f8736k = f3;
            this.f8894x = true;
        }
    }

    static {
        new C3172a(null);
    }

    public C3171e(Rect rect) {
        C12932j.m33818b(rect, "bounds");
        this.f8891k = rect;
    }

    /* renamed from: a */
    public long mo9487a() {
        return 18;
    }

    /* renamed from: b */
    public TimeInterpolator mo9494b() {
        return C7657c.m18645c();
    }

    /* renamed from: j */
    public boolean mo9502j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3173b m10072a(Bitmap bitmap) {
        C12932j.m33818b(bitmap, "bitmap");
        float a = C3240v.m10273a((ClosedRange<Double>) f8889l);
        Rect rect = this.f8891k;
        float a2 = C3240v.m10273a((ClosedRange<Double>) C12971j.m33881a((float) rect.left, (float) rect.right));
        Rect rect2 = this.f8891k;
        C3173b bVar = new C3173b(bitmap, a2, C3240v.m10273a((ClosedRange<Double>) C12971j.m33881a((float) rect2.top, (float) rect2.bottom)), a * ((float) bitmap.getWidth()), a * ((float) bitmap.getHeight()));
        return bVar;
    }
}
