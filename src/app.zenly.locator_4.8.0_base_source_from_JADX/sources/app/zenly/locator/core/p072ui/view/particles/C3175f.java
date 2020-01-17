package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.Point;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.util.C3238u;
import java.util.HashMap;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.f */
public class C3175f extends ParticleAnimation<C3176a> {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final TimeInterpolator f8895o = C7657c.m18649e();

    /* renamed from: k */
    private final Point f8896k;

    /* renamed from: l */
    private final Point f8897l;

    /* renamed from: m */
    private final long f8898m;

    /* renamed from: n */
    private final HashMap<Bitmap, C3177b> f8899n = new HashMap<>();

    /* renamed from: app.zenly.locator.core.ui.view.particles.f$a */
    public class C3176a extends C3151a {

        /* renamed from: A */
        private final C3177b f8900A;

        /* renamed from: B */
        private long f8901B;

        /* renamed from: C */
        private float f8902C;

        /* renamed from: D */
        private float f8903D;

        /* renamed from: E */
        private float f8904E;

        /* renamed from: v */
        private final float f8905v;

        /* renamed from: w */
        private final float f8906w;

        /* renamed from: x */
        private final float f8907x;

        /* renamed from: y */
        private final float f8908y;

        /* renamed from: z */
        private final float f8909z;

        protected C3176a(C3175f fVar, Bitmap bitmap, float f, float f2, float f3, int i, C3177b bVar) {
            super(bitmap, f, f3, (float) bitmap.getWidth(), (float) bitmap.getHeight());
            this.f8905v = f;
            this.f8906w = f2;
            this.f8907x = f3;
            float f4 = (float) i;
            this.f8908y = f4;
            this.f8900A = bVar;
            float max = Math.max(Math.abs(this.f8906w - this.f8905v), Math.abs(f4 - this.f8728c));
            float f5 = max * max;
            this.f8909z = (float) Math.sqrt((double) (f5 + f5));
            mo9540v();
        }

        /* renamed from: b */
        private float m10089b(float f) {
            return C3238u.m10269a(-f, f);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            float f2 = this.f8727b;
            this.f8733h = f2 + ((this.f8903D - f2) * f);
            float f3 = this.f8728c;
            this.f8734i = f3 + ((this.f8904E - f3) * f);
            this.f8738m = (float) (((((double) (this.f8902C * ((((float) this.f8901B) / 1000.0f) * f))) / 3.141592653589793d) * 180.0d) % 360.0d);
            if (f <= 0.5f) {
                return;
            }
            if (this.f8733h < this.f8905v - this.f8735j || this.f8733h > this.f8906w + this.f8735j || this.f8734i < this.f8907x - this.f8736k || this.f8734i > this.f8908y + this.f8736k) {
                mo9537s();
            }
        }

        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return C3175f.f8895o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo9540v() {
            this.f8727b = C3238u.m10269a(this.f8905v, this.f8906w);
            C3177b bVar = this.f8900A;
            float b = bVar.f8913d + m10089b(bVar.f8914e);
            this.f8729d = ((float) this.f8726a.getWidth()) * b;
            this.f8730e = ((float) this.f8726a.getHeight()) * b;
            C3177b bVar2 = this.f8900A;
            this.f8737l = (int) ((bVar2.f8911b + m10089b(bVar2.f8912c)) * 255.0f);
            float f = this.f8909z;
            C3177b bVar3 = this.f8900A;
            this.f8901B = (long) ((f / (((float) bVar3.f8915f) + m10089b((float) bVar3.f8916g))) * 1000.0f);
            C3177b bVar4 = this.f8900A;
            this.f8742q = bVar4.f8917h;
            this.f8902C = bVar4.f8918i + m10089b(bVar4.f8919j);
            C3177b bVar5 = this.f8900A;
            double b2 = ((double) (bVar5.f8920k + m10089b(bVar5.f8921l))) - 1.5707963267948966d;
            this.f8903D = (float) (((double) this.f8727b) + (((double) this.f8909z) * Math.cos(b2)));
            this.f8904E = (float) (((double) this.f8728c) + (((double) this.f8909z) * Math.sin(b2) * -1.0d));
            super.mo9540v();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return this.f8901B;
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.particles.f$b */
    public static class C3177b {

        /* renamed from: a */
        public int f8910a = 1;

        /* renamed from: b */
        public float f8911b = 1.0f;

        /* renamed from: c */
        public float f8912c = 0.0f;

        /* renamed from: d */
        public float f8913d = 1.0f;

        /* renamed from: e */
        public float f8914e = 0.0f;

        /* renamed from: f */
        public int f8915f = 300;

        /* renamed from: g */
        public int f8916g = 0;

        /* renamed from: h */
        public int f8917h = 0;

        /* renamed from: i */
        public float f8918i = 0.0f;

        /* renamed from: j */
        public float f8919j = 0.0f;

        /* renamed from: k */
        public float f8920k = 0.0f;

        /* renamed from: l */
        public float f8921l = 0.0f;

        /* renamed from: a */
        public C3177b mo9587a(float f) {
            this.f8911b = f;
            return this;
        }

        /* renamed from: b */
        public C3177b mo9589b(float f) {
            this.f8912c = f;
            return this;
        }

        /* renamed from: c */
        public C3177b mo9592c(int i) {
            this.f8916g = i;
            return this;
        }

        /* renamed from: d */
        public C3177b mo9594d(int i) {
            this.f8910a = i;
            return this;
        }

        /* renamed from: e */
        public C3177b mo9595e(float f) {
            this.f8914e = f;
            return this;
        }

        /* renamed from: f */
        public C3177b mo9596f(float f) {
            this.f8918i = f;
            return this;
        }

        /* renamed from: g */
        public C3177b mo9597g(float f) {
            this.f8919j = f;
            return this;
        }

        /* renamed from: a */
        public C3177b mo9588a(int i) {
            this.f8917h = i;
            return this;
        }

        /* renamed from: b */
        public C3177b mo9590b(int i) {
            this.f8915f = i;
            return this;
        }

        /* renamed from: c */
        public C3177b mo9591c(float f) {
            this.f8920k = f;
            return this;
        }

        /* renamed from: d */
        public C3177b mo9593d(float f) {
            this.f8913d = f;
            return this;
        }
    }

    public C3175f(Point point, Point point2, long j) {
        this.f8896k = point;
        this.f8897l = point2;
        this.f8898m = j;
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
        throw new RuntimeException("Please use addParticles(Bitmap bitmap, ParticleConfiguration configuration)");
    }

    /* renamed from: a */
    public void mo9586a(Bitmap bitmap, C3177b bVar) {
        if (this.f8899n.containsKey(bitmap)) {
            bitmap = bitmap.copy(bitmap.getConfig(), bitmap.isMutable());
        }
        this.f8899n.put(bitmap, bVar);
        super.mo9489a(bitmap, bVar.f8910a);
    }

    /* renamed from: a */
    public long mo9487a() {
        return this.f8898m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3176a m10085a(Bitmap bitmap) {
        Point point = this.f8896k;
        float f = (float) point.x;
        Point point2 = this.f8897l;
        C3176a aVar = new C3176a(this, bitmap, f, (float) point2.x, (float) point.y, point2.y, (C3177b) this.f8899n.get(bitmap));
        return aVar;
    }
}
