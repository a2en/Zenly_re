package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3238u;
import java.util.HashMap;
import java.util.Map;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.i */
public final class C3182i extends ParticleAnimation<C3151a> {

    /* renamed from: p */
    private static final C3185c[] f8937p = {new C3185c(2131231216, 20, 0), new C3185c(2131231217, 2, 0), new C3185c(2131231218, 2, 0), new C3185c(2131231219, 2, 0), new C3185c(2131231217, 1, 1), new C3185c(2131231218, 1, 1), new C3185c(2131231219, 1, 1)};

    /* renamed from: q */
    private static final int[] f8938q = {R.color.blue_light, R.color.pink, R.color.yellow, R.color.blue_black};

    /* renamed from: k */
    private final Map<Bitmap, C3185c> f8939k = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C3184b f8940l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final int f8941m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int f8942n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final int[] f8943o;

    /* renamed from: app.zenly.locator.core.ui.view.particles.i$b */
    public static final class C3184b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Point f8944a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f8945b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f8946c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f8947d;

        public C3184b(Point point, int i) {
            this.f8944a = point;
            this.f8945b = i;
        }

        /* renamed from: a */
        public C3184b mo9601a(int i) {
            this.f8947d = i;
            return this;
        }

        /* renamed from: b */
        public C3184b mo9602b(int i) {
            this.f8946c = i;
            return this;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.i$c */
    private static final class C3185c {

        /* renamed from: a */
        public final int f8948a;

        /* renamed from: b */
        public final int f8949b;

        /* renamed from: c */
        public final int f8950c;

        private C3185c(int i, int i2, int i3) {
            this.f8948a = i;
            this.f8949b = i2;
            this.f8950c = i3;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.i$d */
    private final class C3186d extends C3151a {

        /* renamed from: v */
        private long f8951v;

        /* renamed from: w */
        private float f8952w;

        protected C3186d(Bitmap bitmap) {
            super(bitmap, 0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        }

        /* renamed from: a */
        private float m10144a(float f, float f2, float f3) {
            return (f3 - f) / (f2 - f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            float f2;
            if (f < 0.2f) {
                f2 = m10144a(0.0f, 0.2f, f);
            } else {
                f2 = 1.0f - m10144a(0.2f, 1.0f, f);
            }
            this.f8737l = (int) (255.0f * f2);
            float f3 = this.f8952w * ((f2 * 1.2f) + 0.8f);
            this.f8735j = this.f8729d * f3;
            this.f8736k = this.f8730e * f3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return this.f8951v;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return C7657c.m18649e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo9540v() {
            this.f8951v = C3238u.m10272a(200, 500);
            this.f8952w = C3238u.m10269a(1.0f, 1.5f);
            float d = (float) C3182i.this.f8940l.f8947d;
            float c = ((float) C3182i.this.f8940l.f8945b) - (((this.f8952w * 2.0f) * Math.max(this.f8729d, this.f8730e)) / 2.0f);
            if (c > d) {
                d = C3238u.m10269a(d, c);
            }
            double a = C3238u.m10268a(0.0d, 6.283185307179586d);
            double d2 = (double) d;
            this.f8727b = (float) (((double) C3182i.this.f8940l.f8944a.x) + (Math.cos(a) * d2));
            this.f8728c = (float) (((double) C3182i.this.f8940l.f8944a.y) + (d2 * Math.sin(a)));
            super.mo9540v();
            this.f8742q = C3238u.m10271a(C3182i.this.f8943o);
            this.f8738m = 30.0f;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.i$e */
    private final class C3187e extends C3151a {

        /* renamed from: v */
        private float f8954v;

        /* renamed from: w */
        private float f8955w;

        /* renamed from: x */
        private long f8956x;

        /* renamed from: y */
        private float f8957y;

        protected C3187e(Bitmap bitmap) {
            super(bitmap, 0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            float f2 = this.f8727b;
            this.f8733h = f2 + ((this.f8954v - f2) * f);
            float f3 = this.f8728c;
            this.f8734i = f3 + ((this.f8955w - f3) * f);
            this.f8738m = this.f8957y * f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return this.f8956x;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return C7657c.m18649e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo9540v() {
            double a = C3238u.m10268a(0.0d, 6.283185307179586d);
            this.f8727b = ((float) C3182i.this.f8940l.f8944a.x) + ((float) (((double) C3182i.this.f8940l.f8946c) * Math.cos(a)));
            this.f8728c = ((float) C3182i.this.f8940l.f8944a.y) + ((float) (((double) C3182i.this.f8940l.f8946c) * Math.sin(a)));
            super.mo9540v();
            float a2 = C3238u.m10269a(1.0f, 1.5f);
            this.f8735j = this.f8729d * a2;
            this.f8736k = this.f8730e * a2;
            float c = ((float) C3182i.this.f8940l.f8945b) * C3238u.m10269a(0.8f, 1.0f);
            double a3 = (a + C3238u.m10268a(0.0d, 0.7853981633974483d)) - 0.39269908169872414d;
            double d = (double) c;
            this.f8954v = ((float) C3182i.this.f8940l.f8944a.x) + ((float) (Math.cos(a3) * d));
            this.f8955w = ((float) C3182i.this.f8940l.f8944a.y) + ((float) (d * Math.sin(a3)));
            this.f8956x = (long) ((c / C3238u.m10269a((float) C3182i.this.f8941m, (float) C3182i.this.f8942n)) * 1000.0f);
            this.f8957y = (C3238u.m10269a(-30.0f, 30.0f) / 1000.0f) * ((float) this.f8956x);
            this.f8742q = C3238u.m10271a(C3182i.this.f8943o);
        }
    }

    public C3182i(Context context, C3184b bVar) {
        C3185c[] cVarArr;
        this.f8940l = bVar;
        this.f8941m = C3200e0.m10183a(context, 80);
        this.f8942n = C3200e0.m10183a(context, 100);
        this.f8943o = new int[f8938q.length];
        int i = 0;
        while (true) {
            int[] iArr = this.f8943o;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = C0540a.m2536a(context, f8938q[i]);
            i++;
        }
        for (C3185c cVar : f8937p) {
            Bitmap bitmap = ((BitmapDrawable) C0540a.m2546c(context, cVar.f8948a)).getBitmap();
            if (this.f8939k.containsKey(bitmap)) {
                bitmap = bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
            }
            this.f8939k.put(bitmap, cVar);
            super.mo9489a(bitmap, cVar.f8949b);
        }
    }

    /* renamed from: a */
    public long mo9487a() {
        return 60;
    }

    /* renamed from: g */
    public boolean mo9499g() {
        return true;
    }

    /* renamed from: j */
    public boolean mo9502j() {
        return true;
    }

    /* renamed from: a */
    public ParticleAnimation mo9489a(Bitmap bitmap, int i) {
        throw new RuntimeException("ParticleSparklesAnimation does not support custom particles");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3151a mo9488a(Bitmap bitmap) {
        if (((C3185c) this.f8939k.get(bitmap)).f8950c != 1) {
            return new C3187e(bitmap);
        }
        return new C3186d(bitmap);
    }
}
