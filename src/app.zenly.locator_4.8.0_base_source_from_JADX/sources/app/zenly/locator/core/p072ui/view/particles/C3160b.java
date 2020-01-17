package app.zenly.locator.core.p072ui.view.particles;

import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.SizeF;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation.C3151a;
import app.zenly.locator.core.util.C3238u;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.particles.b */
public class C3160b extends ParticleAnimation<C3162b> {

    /* renamed from: A */
    private float f8821A = 1.0f;

    /* renamed from: B */
    private float f8822B = 1.0f;

    /* renamed from: C */
    private float f8823C = 0.0f;

    /* renamed from: D */
    private float f8824D = 0.0f;

    /* renamed from: E */
    private int[] f8825E = new int[0];
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final boolean f8826k = true;

    /* renamed from: l */
    private final PointF f8827l = new PointF();

    /* renamed from: m */
    private SizeF f8828m = new SizeF(-1.0f, -1.0f);

    /* renamed from: n */
    private int f8829n = 100;

    /* renamed from: o */
    private TimeInterpolator f8830o = C7657c.m18649e();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public TimeInterpolator f8831p = C7657c.m18649e();

    /* renamed from: q */
    private boolean f8832q;

    /* renamed from: r */
    private boolean f8833r;

    /* renamed from: s */
    private int f8834s = 100;

    /* renamed from: t */
    private int f8835t = 200;

    /* renamed from: u */
    private long f8836u = 900;

    /* renamed from: v */
    private long f8837v = 900;

    /* renamed from: w */
    private float f8838w = 1.0f;

    /* renamed from: x */
    private float f8839x = 1.0f;

    /* renamed from: y */
    private float f8840y = -1.0f;

    /* renamed from: z */
    private float f8841z = -1.0f;

    /* renamed from: app.zenly.locator.core.ui.view.particles.b$b */
    public class C3162b extends C3151a {

        /* renamed from: A */
        private final double f8842A;

        /* renamed from: B */
        private final float f8843B;

        /* renamed from: C */
        private final float f8844C;

        /* renamed from: D */
        final /* synthetic */ C3160b f8845D;

        /* renamed from: v */
        private final int f8846v;

        /* renamed from: w */
        private final long f8847w;

        /* renamed from: x */
        private final float f8848x;

        /* renamed from: y */
        private final float f8849y;

        /* renamed from: z */
        private final double f8850z;

        /* renamed from: a */
        private float m10030a(float f, float f2, float f3) {
            return (f3 - f) / (f2 - f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo9517a(int i, int i2, int i3, int i4) {
            if (this.f8845D.f8826k) {
                this.f8727b = ((float) i) / 2.0f;
                this.f8728c = ((float) i2) / 2.0f;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public long mo9519b() {
            return this.f8847w;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public TimeInterpolator mo9521c() {
            return this.f8845D.f8831p;
        }

        private C3162b(C3160b bVar, Bitmap bitmap, float f, float f2, float f3, float f4, int i, long j, float f5, float f6, float f7, int i2, float f8) {
            this.f8845D = bVar;
            super(bitmap, f, f2, f3, f4);
            this.f8846v = i;
            this.f8847w = j;
            this.f8848x = f5;
            this.f8849y = f6;
            this.f8843B = f7;
            this.f8742q = i2;
            this.f8844C = (((float) this.f8847w) / 1000.0f) * f8;
            double a = C3238u.m10268a(0.0d, 6.283185307179586d);
            this.f8850z = Math.cos(a);
            this.f8842A = Math.sin(a);
        }

        /* renamed from: b */
        public void mo9520b(int i) {
            super.mo9520b(100000 - i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo9515a(float f) {
            float f2 = this.f8843B;
            if (f >= f2) {
                this.f8737l = (int) ((1.0f - m10030a(f2, 1.0f, f)) * 255.0f);
            }
            float f3 = this.f8848x;
            float f4 = f3 + ((this.f8849y - f3) * f);
            this.f8735j = this.f8729d * f4;
            this.f8736k = this.f8730e * f4;
            double d = (double) this.f8727b;
            int i = this.f8846v;
            this.f8733h = (float) ((int) (d + (((double) (((float) i) * f)) * this.f8850z)));
            this.f8734i = (float) ((int) (((double) this.f8728c) + (((double) (((float) i) * f)) * this.f8842A)));
            this.f8738m = (this.f8844C * f) % 360.0f;
        }
    }

    public C3160b() {
    }

    /* renamed from: c */
    public C3160b mo9578c(boolean z) {
        this.f8832q = z;
        return this;
    }

    /* renamed from: d */
    public C3160b mo9579d(float f, float f2) {
        this.f8823C = f;
        this.f8824D = f2;
        return this;
    }

    /* renamed from: g */
    public boolean mo9499g() {
        return this.f8833r;
    }

    /* renamed from: j */
    public boolean mo9502j() {
        return this.f8832q;
    }

    /* renamed from: b */
    public C3160b mo9574b(TimeInterpolator timeInterpolator) {
        this.f8831p = timeInterpolator;
        return this;
    }

    /* renamed from: c */
    public C3160b mo9577c(int i) {
        this.f8829n = i;
        return this;
    }

    /* renamed from: a */
    public C3160b mo9565a(float f, float f2) {
        this.f8828m = new SizeF(f, f2);
        return this;
    }

    /* renamed from: b */
    public C3160b mo9575b(boolean z) {
        this.f8833r = z;
        return this;
    }

    /* renamed from: c */
    public C3160b mo9576c(float f, float f2) {
        this.f8838w = f;
        this.f8839x = f2;
        this.f8840y = -1.0f;
        this.f8841z = -1.0f;
        return this;
    }

    /* renamed from: a */
    public C3160b mo9570a(TimeInterpolator timeInterpolator) {
        this.f8830o = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public C3160b mo9573b(int i) {
        mo9567a(i, i);
        return this;
    }

    /* renamed from: a */
    public C3160b mo9567a(int i, int i2) {
        this.f8834s = i;
        this.f8835t = i2;
        return this;
    }

    /* renamed from: b */
    public C3160b mo9572b(float f, float f2) {
        this.f8821A = f;
        this.f8822B = f2;
        return this;
    }

    /* renamed from: a */
    public C3160b mo9568a(long j) {
        mo9569a(j, j);
        return this;
    }

    /* renamed from: b */
    public TimeInterpolator mo9494b() {
        return this.f8830o;
    }

    /* renamed from: a */
    public C3160b mo9569a(long j, long j2) {
        this.f8836u = j;
        this.f8837v = j2;
        return this;
    }

    /* renamed from: a */
    public C3160b mo9566a(float f, float f2, float f3, float f4) {
        this.f8838w = f;
        this.f8839x = f2;
        this.f8840y = f3;
        this.f8841z = f4;
        return this;
    }

    /* renamed from: a */
    public C3160b mo9564a(float f) {
        mo9572b(f, f);
        return this;
    }

    /* renamed from: a */
    public C3160b mo9571a(int[] iArr) {
        this.f8825E = iArr;
        return this;
    }

    /* renamed from: a */
    public long mo9487a() {
        return 1000 / ((long) this.f8829n);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9490a(int i, int i2, int i3, int i4) {
        if (this.f8826k) {
            PointF pointF = this.f8827l;
            pointF.x = ((float) i) / 2.0f;
            pointF.y = ((float) i2) / 2.0f;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public app.zenly.locator.core.p072ui.view.particles.C3160b.C3162b m10009a(android.graphics.Bitmap r19) {
        /*
            r18 = this;
            r15 = r18
            android.util.SizeF r0 = r15.f8828m
            float r0 = r0.getWidth()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0014
            android.util.SizeF r0 = r15.f8828m
            float r0 = r0.getWidth()
            goto L_0x0019
        L_0x0014:
            int r0 = r19.getWidth()
            float r0 = (float) r0
        L_0x0019:
            r5 = r0
            android.util.SizeF r0 = r15.f8828m
            float r0 = r0.getHeight()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002b
            android.util.SizeF r0 = r15.f8828m
            float r0 = r0.getHeight()
            goto L_0x0030
        L_0x002b:
            int r0 = r19.getHeight()
            float r0 = (float) r0
        L_0x0030:
            r6 = r0
            int r0 = r15.f8835t
            int r2 = r15.f8834s
            if (r0 <= r2) goto L_0x003d
            int r0 = app.zenly.locator.core.util.C3238u.m10270a(r2, r0)
            r7 = r0
            goto L_0x003e
        L_0x003d:
            r7 = r2
        L_0x003e:
            long r2 = r15.f8837v
            long r8 = r15.f8836u
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x004b
            long r2 = app.zenly.locator.core.util.C3238u.m10272a(r8, r2)
            r8 = r2
        L_0x004b:
            float r0 = r15.f8839x
            float r2 = r15.f8838w
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0059
            float r0 = app.zenly.locator.core.util.C3238u.m10269a(r2, r0)
            r10 = r0
            goto L_0x005a
        L_0x0059:
            r10 = r2
        L_0x005a:
            float r0 = r15.f8840y
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0071
            float r2 = r15.f8841z
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0067
            goto L_0x0071
        L_0x0067:
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x006f
            float r0 = app.zenly.locator.core.util.C3238u.m10269a(r0, r2)
        L_0x006f:
            r11 = r0
            goto L_0x0072
        L_0x0071:
            r11 = r10
        L_0x0072:
            float r0 = r15.f8822B
            float r1 = r15.f8821A
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0080
            float r0 = app.zenly.locator.core.util.C3238u.m10269a(r1, r0)
            r12 = r0
            goto L_0x0081
        L_0x0080:
            r12 = r1
        L_0x0081:
            int[] r0 = r15.f8825E
            int r1 = r0.length
            if (r1 <= 0) goto L_0x008c
            int r0 = app.zenly.locator.core.util.C3238u.m10271a(r0)
            r13 = r0
            goto L_0x008e
        L_0x008c:
            r0 = 0
            r13 = 0
        L_0x008e:
            float r0 = r15.f8824D
            float r1 = r15.f8823C
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x009c
            float r0 = app.zenly.locator.core.util.C3238u.m10269a(r1, r0)
            r14 = r0
            goto L_0x009d
        L_0x009c:
            r14 = r1
        L_0x009d:
            app.zenly.locator.core.ui.view.particles.b$b r16 = new app.zenly.locator.core.ui.view.particles.b$b
            android.graphics.PointF r0 = r15.f8827l
            float r3 = r0.x
            float r4 = r0.y
            r17 = 0
            r0 = r16
            r1 = r18
            r2 = r19
            r15 = r17
            r0.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.p072ui.view.particles.C3160b.m10009a(android.graphics.Bitmap):app.zenly.locator.core.ui.view.particles.b$b");
    }

    public C3160b(PointF pointF) {
        this.f8827l.set(pointF);
    }
}
