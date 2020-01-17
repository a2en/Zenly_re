package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.SizeF;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3238u;
import java.util.ArrayList;
import java.util.Iterator;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.h */
public class C3180h extends ParticleAnimation<C3181a> {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final TimeInterpolator f8925n = C7657c.m18643b();
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final float f8926o = ((float) C3200e0.m10182a(100));
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final float f8927p = ((float) C3200e0.m10182a(24));

    /* renamed from: k */
    private final PointF f8928k;

    /* renamed from: l */
    private final SizeF f8929l;

    /* renamed from: m */
    private final ArrayList<C3181a> f8930m = new ArrayList<>();

    /* renamed from: app.zenly.locator.core.ui.view.particles.h$a */
    public class C3181a extends C3151a {

        /* renamed from: A */
        private float f8931A;

        /* renamed from: v */
        private final int f8932v = ((int) C3180h.f8926o);

        /* renamed from: w */
        private int f8933w;

        /* renamed from: x */
        private double f8934x;

        /* renamed from: y */
        private double f8935y;

        /* renamed from: z */
        private float f8936z;

        protected C3181a(C3180h hVar, Bitmap bitmap, float f, float f2, float f3, float f4) {
            super(bitmap, f, f2, f3, f4);
            mo9540v();
        }

        /* renamed from: a */
        public void mo9600a(float f, float f2) {
            this.f8733h += f - this.f8727b;
            this.f8734i += f2 - this.f8728c;
            this.f8727b = f + this.f8931A;
            this.f8728c = f2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return 2500;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return C3180h.f8925n;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo9540v() {
            super.mo9540v();
            this.f8933w = C3238u.m10270a(-5, 5);
            double radians = Math.toRadians((double) (this.f8933w - 90));
            this.f8934x = Math.cos(radians);
            this.f8935y = Math.sin(radians);
            this.f8936z = C3238u.m10269a(0.6f, 0.9f);
            this.f8931A = C3238u.m10269a(-C3180h.f8927p, C3180h.f8927p);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            float f2 = this.f8936z;
            if (f > f2) {
                this.f8737l = 255 - ((int) (((f - f2) * (1.0f / (1.0f - f2))) * 255.0f));
            }
            float f3 = (1.3f * f) + 0.0f;
            this.f8735j = this.f8729d * f3;
            this.f8736k = this.f8730e * f3;
            this.f8738m = ((float) this.f8933w) * f;
            double d = (double) this.f8727b;
            int i = this.f8932v;
            this.f8733h = (float) ((int) (d + (((double) (((float) i) * f)) * this.f8934x)));
            this.f8734i = (float) ((int) (((double) this.f8728c) + (((double) (((float) i) * f)) * this.f8935y)));
        }
    }

    public C3180h(PointF pointF, SizeF sizeF) {
        this.f8928k = pointF;
        this.f8929l = sizeF;
    }

    /* renamed from: a */
    public long mo9487a() {
        return 400;
    }

    /* renamed from: g */
    public boolean mo9499g() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public C3181a m10123n() {
        C3181a aVar = (C3181a) super.mo9506n();
        if (aVar != null) {
            synchronized (this.f8930m) {
                this.f8930m.add(aVar);
            }
            PointF pointF = this.f8928k;
            aVar.mo9600a(pointF.x, pointF.y);
        }
        return aVar;
    }

    /* renamed from: a */
    public void mo9598a(float f, float f2) {
        this.f8928k.set(f, f2);
        synchronized (this.f8930m) {
            Iterator it = this.f8930m.iterator();
            while (it.hasNext()) {
                ((C3181a) it.next()).mo9600a(f, f2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3181a m10117a(Bitmap bitmap) {
        PointF pointF = this.f8928k;
        C3181a aVar = new C3181a(this, bitmap, pointF.x, pointF.y, this.f8929l.getWidth(), this.f8929l.getHeight());
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9492a(C3181a aVar) {
        synchronized (this.f8930m) {
            this.f8930m.remove(aVar);
        }
        super.mo9492a(aVar);
    }
}
