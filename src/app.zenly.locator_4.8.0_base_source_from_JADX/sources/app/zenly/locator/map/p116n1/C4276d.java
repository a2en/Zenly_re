package app.zenly.locator.map.p116n1;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.n1.d */
public final class C4276d {

    /* renamed from: a */
    private RectF f11459a = new RectF();

    /* renamed from: b */
    private PointF f11460b = new PointF();

    /* renamed from: c */
    private PointF f11461c = new PointF();

    /* renamed from: d */
    private PointF f11462d = new PointF();

    /* renamed from: e */
    private PointF f11463e = new PointF();

    /* renamed from: f */
    private boolean f11464f = true;

    /* renamed from: g */
    private final int f11465g;

    /* renamed from: h */
    private List<C4278b> f11466h;

    /* renamed from: app.zenly.locator.map.n1.d$a */
    public static final class C4277a {

        /* renamed from: a */
        private final float f11467a;

        /* renamed from: b */
        private final float f11468b;

        public C4277a(float f, float f2) {
            this.f11467a = f;
            this.f11468b = f2;
        }

        /* renamed from: a */
        public final float mo11299a() {
            return this.f11467a;
        }

        /* renamed from: b */
        public final float mo11300b() {
            return this.f11468b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (java.lang.Float.compare(r2.f11468b, r3.f11468b) == 0) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof app.zenly.locator.map.p116n1.C4276d.C4277a
                if (r0 == 0) goto L_0x001d
                app.zenly.locator.map.n1.d$a r3 = (app.zenly.locator.map.p116n1.C4276d.C4277a) r3
                float r0 = r2.f11467a
                float r1 = r3.f11467a
                int r0 = java.lang.Float.compare(r0, r1)
                if (r0 != 0) goto L_0x001d
                float r0 = r2.f11468b
                float r3 = r3.f11468b
                int r3 = java.lang.Float.compare(r0, r3)
                if (r3 != 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p116n1.C4276d.C4277a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (Float.valueOf(this.f11467a).hashCode() * 31) + Float.valueOf(this.f11468b).hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ClipResult(t0=");
            sb.append(this.f11467a);
            sb.append(", t1=");
            sb.append(this.f11468b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.map.n1.d$b */
    public static final class C4278b {

        /* renamed from: a */
        private final float f11469a = ((C4279a) C12857w.m33682f((List) this.f11472d)).mo11312b();

        /* renamed from: b */
        private final float f11470b = ((C4279a) C12857w.m33686h((List) this.f11472d)).mo11313c();

        /* renamed from: c */
        private final Path f11471c;

        /* renamed from: d */
        private final List<C4279a> f11472d;

        /* renamed from: app.zenly.locator.map.n1.d$b$a */
        public static final class C4279a {

            /* renamed from: a */
            private final PointF f11473a;

            /* renamed from: b */
            private final PointF f11474b;

            /* renamed from: c */
            private final float f11475c;

            /* renamed from: d */
            private final float f11476d;

            public C4279a(PointF pointF, PointF pointF2, float f, float f2) {
                C12932j.m33818b(pointF, "from");
                C12932j.m33818b(pointF2, "to");
                this.f11473a = pointF;
                this.f11474b = pointF2;
                this.f11475c = f;
                this.f11476d = f2;
            }

            /* renamed from: a */
            public final PointF mo11311a() {
                return this.f11473a;
            }

            /* renamed from: b */
            public final float mo11312b() {
                return this.f11475c;
            }

            /* renamed from: c */
            public final float mo11313c() {
                return this.f11476d;
            }

            /* renamed from: d */
            public final PointF mo11314d() {
                return this.f11474b;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
                if (java.lang.Float.compare(r2.f11476d, r3.f11476d) == 0) goto L_0x0033;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean equals(java.lang.Object r3) {
                /*
                    r2 = this;
                    if (r2 == r3) goto L_0x0033
                    boolean r0 = r3 instanceof app.zenly.locator.map.p116n1.C4276d.C4278b.C4279a
                    if (r0 == 0) goto L_0x0031
                    app.zenly.locator.map.n1.d$b$a r3 = (app.zenly.locator.map.p116n1.C4276d.C4278b.C4279a) r3
                    android.graphics.PointF r0 = r2.f11473a
                    android.graphics.PointF r1 = r3.f11473a
                    boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    android.graphics.PointF r0 = r2.f11474b
                    android.graphics.PointF r1 = r3.f11474b
                    boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                    if (r0 == 0) goto L_0x0031
                    float r0 = r2.f11475c
                    float r1 = r3.f11475c
                    int r0 = java.lang.Float.compare(r0, r1)
                    if (r0 != 0) goto L_0x0031
                    float r0 = r2.f11476d
                    float r3 = r3.f11476d
                    int r3 = java.lang.Float.compare(r0, r3)
                    if (r3 != 0) goto L_0x0031
                    goto L_0x0033
                L_0x0031:
                    r3 = 0
                    return r3
                L_0x0033:
                    r3 = 1
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p116n1.C4276d.C4278b.C4279a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                PointF pointF = this.f11473a;
                int i = 0;
                int hashCode = (pointF != null ? pointF.hashCode() : 0) * 31;
                PointF pointF2 = this.f11474b;
                if (pointF2 != null) {
                    i = pointF2.hashCode();
                }
                return ((((hashCode + i) * 31) + Float.valueOf(this.f11475c).hashCode()) * 31) + Float.valueOf(this.f11476d).hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Segment(from=");
                sb.append(this.f11473a);
                sb.append(", to=");
                sb.append(this.f11474b);
                sb.append(", phaseIn=");
                sb.append(this.f11475c);
                sb.append(", phaseOut=");
                sb.append(this.f11476d);
                sb.append(")");
                return sb.toString();
            }
        }

        /* JADX INFO: used method not loaded: kotlin.collections.w.f(java.util.List):null, types can be incorrect */
        /* JADX INFO: used method not loaded: kotlin.collections.w.h(java.util.List):null, types can be incorrect */
        public C4278b(Path path, List<C4279a> list) {
            C12932j.m33818b(path, "path");
            C12932j.m33818b(list, "segments");
            this.f11471c = path;
            this.f11472d = list;
        }

        /* renamed from: a */
        public final Path mo11304a() {
            return this.f11471c;
        }

        /* renamed from: b */
        public final float mo11305b() {
            return this.f11469a;
        }

        /* renamed from: c */
        public final float mo11306c() {
            return this.f11470b;
        }

        /* renamed from: d */
        public final List<C4279a> mo11307d() {
            return this.f11472d;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f11472d, (java.lang.Object) r3.f11472d) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof app.zenly.locator.map.p116n1.C4276d.C4278b
                if (r0 == 0) goto L_0x001d
                app.zenly.locator.map.n1.d$b r3 = (app.zenly.locator.map.p116n1.C4276d.C4278b) r3
                android.graphics.Path r0 = r2.f11471c
                android.graphics.Path r1 = r3.f11471c
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.List<app.zenly.locator.map.n1.d$b$a> r0 = r2.f11472d
                java.util.List<app.zenly.locator.map.n1.d$b$a> r3 = r3.f11472d
                boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p116n1.C4276d.C4278b.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            Path path = this.f11471c;
            int i = 0;
            int hashCode = (path != null ? path.hashCode() : 0) * 31;
            List<C4279a> list = this.f11472d;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Curve(path=");
            sb.append(this.f11471c);
            sb.append(", segments=");
            sb.append(this.f11472d);
            sb.append(")");
            return sb.toString();
        }
    }

    public C4276d(int i) {
        this.f11465g = C12973l.m33885a(i, 1);
        this.f11466h = C12848o.m33640a();
    }

    /* renamed from: a */
    public final void mo11294a(RectF rectF) {
        C12932j.m33818b(rectF, "value");
        this.f11459a = rectF;
        this.f11464f = true;
    }

    /* renamed from: b */
    public final void mo11296b(PointF pointF) {
        C12932j.m33818b(pointF, "value");
        this.f11462d = pointF;
        this.f11464f = true;
    }

    /* renamed from: c */
    public final void mo11297c(PointF pointF) {
        C12932j.m33818b(pointF, "value");
        this.f11460b = pointF;
        this.f11464f = true;
    }

    /* renamed from: d */
    public final void mo11298d(PointF pointF) {
        C12932j.m33818b(pointF, "value");
        this.f11461c = pointF;
        this.f11464f = true;
    }

    /* renamed from: c */
    private final void m12700c() {
        Throwable th;
        if (!C12932j.m33817a((Object) this.f11460b, (Object) this.f11461c) || !C12932j.m33817a((Object) this.f11460b, (Object) this.f11462d) || !C12932j.m33817a((Object) this.f11460b, (Object) this.f11463e)) {
            int i = 1;
            int pow = ((int) Math.pow(2.0d, (double) this.f11465g)) + 1;
            PointF[] pointFArr = new PointF[pow];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                th = null;
                if (i3 >= pow) {
                    break;
                }
                pointFArr[i3] = null;
                i3++;
            }
            Float[] fArr = new Float[pow];
            for (int i4 = 0; i4 < pow; i4++) {
                fArr[i4] = Float.valueOf(0.0f);
            }
            PointF pointF = this.f11460b;
            pointFArr[0] = pointF;
            m12697a(pointFArr, fArr, pointF, this.f11461c, this.f11462d, this.f11463e, 0, this.f11465g);
            ((Number) C12840k.m33580e(fArr)).floatValue();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int length = pointFArr.length;
            ArrayList arrayList3 = arrayList2;
            Path path = null;
            while (i < length) {
                int i5 = i - 1;
                PointF pointF2 = pointFArr[i5];
                if (pointF2 != null) {
                    PointF pointF3 = pointFArr[i];
                    if (pointF3 != null) {
                        float floatValue = fArr[i5].floatValue();
                        float floatValue2 = fArr[i].floatValue();
                        C4277a a = m12699a(pointF2, pointF3, this.f11459a);
                        if ((a.mo11300b() < a.mo11299a() || a.mo11299a() > ((float) i2)) && path != null) {
                            arrayList.add(new C4278b(path, arrayList3));
                            path = null;
                        }
                        if (a.mo11300b() >= a.mo11299a()) {
                            float f = floatValue2 - floatValue;
                            C4279a aVar = new C4279a(m12698a(pointF2, pointF3, a.mo11299a()), m12698a(pointF2, pointF3, a.mo11300b()), (a.mo11299a() * f) + floatValue, floatValue + (a.mo11300b() * f));
                            if (path == null) {
                                path = new Path();
                                arrayList3 = new ArrayList();
                                path.moveTo(aVar.mo11311a().x, aVar.mo11311a().y);
                            }
                            path.lineTo(aVar.mo11314d().x, aVar.mo11314d().y);
                            arrayList3.add(aVar);
                            if (((double) a.mo11300b()) < 1.0d) {
                                arrayList.add(new C4278b(path, arrayList3));
                                path = null;
                            }
                        }
                        i++;
                        i2 = 0;
                        th = null;
                    } else {
                        C12932j.m33814a();
                        throw null;
                    }
                } else {
                    Throwable th2 = th;
                    C12932j.m33814a();
                    throw th2;
                }
            }
            if (path != null) {
                arrayList.add(new C4278b(path, arrayList3));
            }
            this.f11466h = arrayList;
            this.f11464f = false;
            return;
        }
        this.f11466h = C12848o.m33640a();
    }

    /* renamed from: a */
    public final void mo11293a(PointF pointF) {
        C12932j.m33818b(pointF, "value");
        this.f11463e = pointF;
        this.f11464f = true;
    }

    /* renamed from: b */
    public final List<C4278b> mo11295b() {
        if (this.f11464f) {
            m12700c();
        }
        return this.f11466h;
    }

    /* renamed from: a */
    public final void mo11292a() {
        mo11297c(new PointF());
        mo11298d(new PointF());
        mo11296b(new PointF());
        mo11293a(new PointF());
    }

    /* renamed from: a */
    private final int m12697a(PointF[] pointFArr, Float[] fArr, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, int i, int i2) {
        PointF pointF5 = pointF;
        PointF pointF6 = pointF2;
        PointF pointF7 = pointF3;
        PointF pointF8 = pointF4;
        if (i2 <= 0) {
            int i3 = i + 1;
            pointFArr[i3] = pointF8;
            fArr[i3] = Float.valueOf(fArr[i].floatValue() + m12696a(pointF5, pointF8));
            return i3;
        }
        PointF pointF9 = new PointF((pointF5.x + pointF6.x) * 0.5f, (pointF5.y + pointF6.y) * 0.5f);
        PointF pointF10 = new PointF((pointF6.x + pointF7.x) * 0.5f, (pointF6.y + pointF7.y) * 0.5f);
        PointF pointF11 = new PointF((pointF7.x + pointF8.x) * 0.5f, (pointF7.y + pointF8.y) * 0.5f);
        PointF pointF12 = new PointF((pointF9.x + pointF10.x) * 0.5f, (pointF9.y + pointF10.y) * 0.5f);
        PointF pointF13 = new PointF((pointF10.x + pointF11.x) * 0.5f, (pointF10.y + pointF11.y) * 0.5f);
        PointF pointF14 = new PointF((pointF12.x + pointF13.x) * 0.5f, (pointF12.y + pointF13.y) * 0.5f);
        PointF[] pointFArr2 = pointFArr;
        Float[] fArr2 = fArr;
        int i4 = i2 - 1;
        return m12697a(pointFArr2, fArr2, pointF14, pointF13, pointF11, pointF4, m12697a(pointFArr2, fArr2, pointF, pointF9, pointF12, pointF14, i, i4), i4);
    }

    /* renamed from: a */
    private final float m12696a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: a */
    private final C4277a m12699a(PointF pointF, PointF pointF2, RectF rectF) {
        float f;
        float f2 = pointF2.x;
        float f3 = pointF.x;
        float f4 = f2 - f3;
        float f5 = 1.0f;
        if (f4 != 0.0f) {
            float f6 = (rectF.left - f3) / f4;
            float f7 = (rectF.right - f3) / f4;
            if (f4 >= ((float) 0)) {
                float f8 = f6;
                f6 = f7;
                f7 = f8;
            }
            f = C12973l.m33889b(0.0f, f7);
            f5 = C12973l.m33892c(1.0f, f6);
        } else {
            f = 0.0f;
        }
        float f9 = pointF2.y;
        float f10 = pointF.y;
        float f11 = f9 - f10;
        if (f11 != 0.0f) {
            float f12 = (rectF.top - f10) / f11;
            float f13 = (rectF.bottom - f10) / f11;
            if (f11 >= ((float) 0)) {
                float f14 = f12;
                f12 = f13;
                f13 = f14;
            }
            f = C12973l.m33889b(f, f13);
            f5 = C12973l.m33892c(f5, f12);
        }
        return new C4277a(f, f5);
    }

    /* renamed from: a */
    private final PointF m12698a(PointF pointF, PointF pointF2, float f) {
        if (f == 0.0f) {
            return pointF;
        }
        if (f == 1.0f) {
            return pointF2;
        }
        float f2 = pointF.x;
        float f3 = f2 + ((pointF2.x - f2) * f);
        float f4 = pointF.y;
        return new PointF(f3, f4 + (f * (pointF2.y - f4)));
    }
}
