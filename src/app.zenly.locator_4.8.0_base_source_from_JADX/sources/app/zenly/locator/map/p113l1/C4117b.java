package app.zenly.locator.map.p113l1;

import android.graphics.PointF;
import app.zenly.locator.p143s.p150n.C5459d;

/* renamed from: app.zenly.locator.map.l1.b */
public class C4117b {

    /* renamed from: a */
    private final boolean f10769a;

    /* renamed from: b */
    private final double f10770b;

    /* renamed from: c */
    private final double f10771c;

    /* renamed from: d */
    private double f10772d;

    /* renamed from: e */
    private double f10773e;

    /* renamed from: f */
    private double f10774f;

    /* renamed from: g */
    private double f10775g;

    /* renamed from: h */
    private double f10776h;

    /* renamed from: i */
    private double f10777i;

    /* renamed from: j */
    private double f10778j;

    /* renamed from: k */
    private double f10779k;

    /* renamed from: l */
    private double f10780l;

    /* renamed from: m */
    private final double[] f10781m;

    /* renamed from: n */
    private final double[] f10782n;

    /* renamed from: o */
    private final double[] f10783o;

    /* renamed from: p */
    private final double[] f10784p;

    /* renamed from: q */
    private final double[] f10785q;

    /* renamed from: r */
    private final double[] f10786r;

    /* renamed from: s */
    private final double[] f10787s;

    /* renamed from: t */
    private final double[] f10788t;

    /* renamed from: u */
    private final double[] f10789u;

    public C4117b(int i) {
        this(true, i);
    }

    /* renamed from: a */
    public boolean mo10792a(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        return mo10793a(d, d2, d3, d4, d5, d6, d7, 1.5d);
    }

    /* renamed from: b */
    public double mo10794b(double d) {
        return (this.f10770b * this.f10780l) / (Math.cos((d * 3.141592653589793d) / 180.0d) * 4.0E7d);
    }

    public C4117b(boolean z, int i) {
        this.f10781m = new double[2];
        this.f10782n = C4116a.m11841a();
        this.f10783o = C4116a.m11841a();
        this.f10784p = C4116a.m11841a();
        this.f10785q = C4116a.m11841a();
        this.f10786r = C4116a.m11841a();
        this.f10787s = new double[4];
        this.f10788t = new double[4];
        this.f10789u = new double[4];
        this.f10769a = z;
        this.f10770b = (double) i;
        this.f10771c = this.f10770b / 6.283185307179586d;
    }

    /* renamed from: a */
    public boolean mo10793a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9;
        double d10 = d;
        double d11 = d2;
        double d12 = d3;
        double d13 = d4;
        double d14 = d5;
        double d15 = d6;
        double d16 = d7;
        if (d10 == this.f10772d && this.f10773e == d11 && this.f10774f == d12 && this.f10775g == d13 && this.f10776h == d14 && this.f10777i == d15 && this.f10778j == d7) {
            d9 = d8;
            if (this.f10779k == d9) {
                return false;
            }
        } else {
            d9 = d8;
        }
        this.f10772d = d10;
        this.f10773e = d11;
        this.f10774f = d12;
        this.f10775g = d13;
        this.f10776h = d14;
        double d17 = d6;
        double d18 = d7;
        this.f10777i = d17;
        this.f10778j = d18;
        this.f10779k = d9;
        this.f10780l = Math.pow(2.0d, d14);
        m11853a(d3, d4, this.f10781m);
        double atan = Math.atan((this.f10773e / 2.0d) / this.f10779k) * 2.0d;
        double d19 = this.f10772d / this.f10773e;
        double d20 = d7 * 0.017453292519943295d;
        double atan2 = Math.atan(0.5d / this.f10779k);
        double d21 = 1.5707963267948966d - d20;
        double cos = (Math.cos(d21) * ((Math.sin(atan2) * this.f10779k) / Math.sin(d21 - atan2))) + this.f10779k;
        C4116a.m11842a(this.f10783o);
        C4116a.m11844a(this.f10783o, atan, d19, 0.1d, cos * 10.0d);
        C4116a.m11842a(this.f10782n);
        double[] dArr = this.f10782n;
        C4116a.m11850b(dArr, dArr, 0.0d, 0.0d, -this.f10779k);
        double[] dArr2 = this.f10782n;
        C4116a.m11846a(dArr2, dArr2, 1.0d, -1.0d, 1.0d / this.f10773e);
        C4116a.m11843a(this.f10782n, d20);
        C4116a.m11849b(this.f10782n, (-d17) * 0.017453292519943295d);
        double[] dArr3 = this.f10782n;
        double[] dArr4 = this.f10781m;
        C4116a.m11850b(dArr3, dArr3, -dArr4[0], -dArr4[1], 0.0d);
        C4116a.m11842a(this.f10784p);
        double[] dArr5 = this.f10784p;
        C4116a.m11847a(dArr5, dArr5, this.f10783o);
        double[] dArr6 = this.f10784p;
        C4116a.m11847a(dArr6, dArr6, this.f10782n);
        C4116a.m11842a(this.f10785q);
        double[] dArr7 = this.f10785q;
        C4116a.m11846a(dArr7, dArr7, this.f10772d, this.f10773e, 1.0d);
        double[] dArr8 = this.f10785q;
        C4116a.m11850b(dArr8, dArr8, 0.5d, 0.5d, 0.0d);
        double[] dArr9 = this.f10785q;
        C4116a.m11846a(dArr9, dArr9, 0.5d, 0.5d, 1.0d);
        double[] dArr10 = this.f10785q;
        C4116a.m11847a(dArr10, dArr10, this.f10784p);
        C4116a.m11842a(this.f10786r);
        C4116a.m11845a(this.f10786r, this.f10785q);
        return true;
    }

    /* renamed from: b */
    private C5459d m11855b(double d, double d2, boolean z, C5459d dVar) {
        double d3 = this.f10780l * this.f10771c;
        double atan = (Math.atan(Math.exp(3.141592653589793d - (d2 / d3))) - 0.7853981633974483d) * 2.0d;
        dVar.mo13063c(((d / d3) - 3.141592653589793d) * 57.29577951308232d);
        dVar.mo13061b(atan * 57.29577951308232d);
        if (z) {
            dVar.mo13063c(((dVar.mo13062c() + 180.0d) % 360.0d) - 180.0d);
            dVar.mo13061b(((dVar.mo13060b() + 90.0d) % 180.0d) - 90.0d);
        }
        return dVar;
    }

    /* renamed from: a */
    public PointF mo10790a(C5459d dVar, PointF pointF) {
        return mo10789a(dVar.mo13060b(), dVar.mo13062c(), pointF);
    }

    /* renamed from: a */
    public PointF mo10789a(double d, double d2, PointF pointF) {
        PointF pointF2 = pointF == null ? new PointF() : pointF;
        double[] dArr = this.f10787s;
        m11854a(dArr, 0.0d, 0.0d, 0.0d, 1.0d);
        m11853a(d, d2, dArr);
        C4116a.m11852c(dArr, dArr, this.f10785q);
        pointF2.x = (float) dArr[0];
        pointF2.y = (float) (this.f10769a ? this.f10773e - dArr[1] : dArr[1]);
        return pointF2;
    }

    /* renamed from: a */
    public C5459d mo10791a(double d, double d2, boolean z, C5459d dVar) {
        C5459d dVar2 = dVar == null ? new C5459d() : dVar;
        double d3 = this.f10769a ? this.f10773e - d2 : d2;
        double[] dArr = this.f10787s;
        m11854a(dArr, 0.0d, 0.0d, 0.0d, 0.0d);
        double[] dArr2 = this.f10789u;
        m11854a(dArr2, d, d3, 0.0d, 1.0d);
        C4116a.m11852c(dArr, dArr2, this.f10786r);
        double[] dArr3 = this.f10788t;
        m11854a(dArr3, 0.0d, 0.0d, 0.0d, 0.0d);
        double[] dArr4 = this.f10789u;
        double d4 = d3;
        double[] dArr5 = dArr4;
        m11854a(dArr4, d, d4, 1.0d, 1.0d);
        C4116a.m11852c(dArr3, dArr5, this.f10786r);
        double d5 = dArr[2];
        double d6 = dArr3[2];
        double d7 = 0.0d;
        if (d5 != d6) {
            d7 = (0.0d - d5) / (d6 - d5);
        }
        C4116a.m11848a(dArr, dArr, dArr3, d7);
        m11855b(dArr[0], dArr[1], z, dVar2);
        return dVar2;
    }

    /* renamed from: a */
    public double mo10788a(double d) {
        return 1.0d / mo10794b(d);
    }

    /* renamed from: a */
    private double[] m11853a(double d, double d2, double[] dArr) {
        double d3 = this.f10780l * this.f10771c;
        double d4 = d * 0.017453292519943295d;
        dArr[0] = ((d2 * 0.017453292519943295d) + 3.141592653589793d) * d3;
        dArr[1] = d3 * (3.141592653589793d - Math.log(Math.tan((d4 * 0.5d) + 0.7853981633974483d)));
        return dArr;
    }

    /* renamed from: a */
    private double[] m11854a(double[] dArr, double d, double d2, double d3, double d4) {
        dArr[0] = d;
        dArr[1] = d2;
        dArr[2] = d3;
        dArr[3] = d4;
        return dArr;
    }
}
