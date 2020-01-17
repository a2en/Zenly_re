package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build.VERSION;
import androidx.core.content.C0540a;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.util.C3238u;
import java.util.ArrayList;
import java.util.List;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.c */
public class C3163c extends ParticleAnimation<C3168c> {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C3165b f8851k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f8852l = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: m */
    private int f8853m;

    /* renamed from: app.zenly.locator.core.ui.view.particles.c$b */
    public static final class C3165b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Point f8854a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Point f8855b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f8856c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f8857d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f8858e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final List<C3167b> f8859f;

        /* renamed from: app.zenly.locator.core.ui.view.particles.c$b$a */
        public static final class C3166a {

            /* renamed from: a */
            private final C3165b f8860a;

            /* renamed from: b */
            private long f8861b = 100;

            /* renamed from: c */
            private long f8862c = 1700;

            /* renamed from: d */
            private long f8863d = 1900;

            /* renamed from: e */
            private long f8864e = 200;

            /* renamed from: f */
            private long f8865f = 300;

            /* renamed from: g */
            private long f8866g = 50;

            /* renamed from: h */
            private long f8867h = 50;

            public C3166a(Point point, Point point2, int i) {
                this.f8860a = new C3165b(point, point2, i);
                this.f8860a.f8858e = 900;
            }

            /* renamed from: a */
            public C3166a mo9582a(int i) {
                this.f8860a.f8857d = i;
                return this;
            }

            /* renamed from: a */
            public C3165b mo9583a() {
                this.f8860a.f8859f.clear();
                int i = 0;
                while (true) {
                    long j = (long) i;
                    if (j >= this.f8861b) {
                        return this.f8860a;
                    }
                    long d = this.f8860a.f8858e - (j * 2);
                    long a = C3238u.m10272a(this.f8862c, this.f8863d);
                    long a2 = d + a + C3238u.m10272a(this.f8864e, this.f8865f);
                    long a3 = C3238u.m10272a(this.f8866g, this.f8867h);
                    List a4 = this.f8860a.f8859f;
                    C3167b bVar = new C3167b(d, a, a2, a3);
                    a4.add(bVar);
                    i++;
                }
            }
        }

        /* renamed from: app.zenly.locator.core.ui.view.particles.c$b$b */
        public static class C3167b {
            /* access modifiers changed from: private */

            /* renamed from: a */
            public final long f8868a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final long f8869b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final long f8870c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public final long f8871d;

            private C3167b(long j, long j2, long j3, long j4) {
                this.f8868a = j;
                this.f8869b = j2;
                this.f8870c = j3;
                this.f8871d = j4;
            }

            /* renamed from: a */
            public long mo9584a() {
                return this.f8870c;
            }
        }

        private C3165b(Point point, Point point2, int i) {
            this.f8857d = -65536;
            this.f8859f = new ArrayList();
            this.f8854a = point;
            this.f8855b = point2;
            this.f8856c = i;
        }

        /* renamed from: b */
        public List<C3167b> mo9581b() {
            return this.f8859f;
        }

        /* renamed from: a */
        public long mo9580a() {
            return this.f8858e;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.c$c */
    public final class C3168c extends C3151a {

        /* renamed from: A */
        private final int f8872A;

        /* renamed from: B */
        private float f8873B;

        /* renamed from: C */
        private float f8874C;

        /* renamed from: D */
        private float f8875D;

        /* renamed from: v */
        private final long f8877v;

        /* renamed from: w */
        private final float f8878w;

        /* renamed from: x */
        private final float f8879x;

        /* renamed from: y */
        private final float f8880y;

        /* renamed from: z */
        private final int f8881z;

        protected C3168c(Bitmap bitmap, int i) {
            super(bitmap, (float) C3163c.this.f8851k.f8854a.x, (float) C3163c.this.f8851k.f8854a.y, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            this.f8742q = C3163c.this.f8851k.f8857d;
            if (VERSION.SDK_INT <= 26) {
                this.f8743r = Mode.LIGHTEN;
            }
            C3167b bVar = (C3167b) C3163c.this.f8851k.f8859f.get(i);
            this.f8877v = bVar.f8870c + bVar.f8871d;
            this.f8878w = ((float) bVar.f8868a) / ((float) this.f8877v);
            this.f8879x = ((float) (bVar.f8868a + bVar.f8869b)) / ((float) this.f8877v);
            this.f8880y = ((float) bVar.f8870c) / ((float) this.f8877v);
            double a = C3238u.m10268a(0.0d, 6.283185307179586d);
            double b = (double) (((float) C3163c.this.f8851k.f8856c) * C3238u.m10269a(0.2f, 1.0f));
            this.f8881z = C3163c.this.f8851k.f8855b.x + ((int) (Math.cos(a) * b));
            this.f8872A = C3163c.this.f8851k.f8855b.y + ((int) (b * Math.sin(a)));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            float f2 = this.f8878w;
            if (f <= f2) {
                float f3 = f / f2;
                this.f8733h = this.f8727b + ((((float) C3163c.this.f8851k.f8855b.x) - this.f8727b) * f3);
                this.f8734i = this.f8728c + ((((float) C3163c.this.f8851k.f8855b.y) - this.f8728c) * f3);
                this.f8737l = 10;
            } else {
                double b = (double) ((f - this.f8873B) * ((float) mo9519b()));
                this.f8874C = (float) (((double) this.f8874C) + ((9.800000190734863d * b) / 1000.0d));
                this.f8875D = (float) (((double) this.f8875D) + ((((double) this.f8874C) * b) / 1000.0d));
                float f4 = this.f8878w;
                float interpolation = C7657c.m18645c().getInterpolation((f - f4) / (1.0f - f4));
                this.f8733h = ((float) C3163c.this.f8851k.f8855b.x) + (((float) (C3163c.this.f8851k.f8855b.x - this.f8881z)) * interpolation);
                this.f8734i = ((float) C3163c.this.f8851k.f8855b.y) + (((float) (C3163c.this.f8851k.f8855b.y - this.f8872A)) * interpolation) + ((this.f8875D * C3163c.this.f8852l) / 0.15f);
                float f5 = this.f8879x;
                if (f < f5) {
                    this.f8737l = 255;
                } else {
                    float f6 = this.f8880y;
                    if (f < f6) {
                        this.f8737l = (int) ((1.0f - Math.min(1.0f, ((f - f5) / (f6 - f5)) * 2.0f)) * 255.0f);
                    } else {
                        this.f8737l = 255;
                    }
                }
            }
            this.f8873B = f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return this.f8877v;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return C7657c.m18649e();
        }
    }

    public C3163c(Context context, C3165b bVar) {
        this.f8851k = bVar;
        context.getResources();
        mo9489a(((BitmapDrawable) C0540a.m2546c(context, 2131231215)).getBitmap(), bVar.f8859f.size());
    }

    /* renamed from: a */
    public long mo9487a() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3168c m10040a(Bitmap bitmap) {
        int i = this.f8853m;
        this.f8853m = i + 1;
        return new C3168c(bitmap, i);
    }
}
