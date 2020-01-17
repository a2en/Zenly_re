package androidx.constraintlayout.motion.widget;

import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.C0467a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import p214e.p229f.p230a.p231a.C7588b;

/* renamed from: androidx.constraintlayout.motion.widget.t */
public abstract class C0384t {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static int f1699r = 4;

    /* renamed from: a */
    protected C7588b f1700a;

    /* renamed from: b */
    private int f1701b = 0;

    /* renamed from: c */
    private boolean f1702c = false;

    /* renamed from: d */
    protected int[] f1703d = new int[10];

    /* renamed from: e */
    protected int[] f1704e = new int[10];

    /* renamed from: f */
    protected float[][] f1705f;

    /* renamed from: g */
    protected float[][] f1706g;

    /* renamed from: h */
    private int f1707h;

    /* renamed from: i */
    private String f1708i;

    /* renamed from: j */
    private float[] f1709j;

    /* renamed from: k */
    float f1710k;

    /* renamed from: l */
    float f1711l;

    /* renamed from: m */
    protected boolean f1712m;

    /* renamed from: n */
    long f1713n;

    /* renamed from: o */
    C0396l f1714o;

    /* renamed from: p */
    float f1715p;

    /* renamed from: q */
    float f1716q;

    /* renamed from: androidx.constraintlayout.motion.widget.t$a */
    static class C0385a extends C0384t {
        C0385a() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            view.setAlpha(mo2414a(f, j));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$b */
    static class C0386b extends C0384t {

        /* renamed from: s */
        SparseArray<C0467a> f1717s;

        /* renamed from: t */
        SparseArray<float[]> f1718t = new SparseArray<>();

        /* renamed from: u */
        float[] f1719u;

        /* renamed from: v */
        float[] f1720v;

        public C0386b(String str, SparseArray<C0467a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f1717s = sparseArray;
        }

        /* renamed from: a */
        public void mo2415a(int i) {
            int size = this.f1717s.size();
            int c = ((C0467a) this.f1717s.valueAt(0)).mo2756c();
            double[] dArr = new double[size];
            this.f1719u = new float[(C0384t.f1699r + c)];
            this.f1720v = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, C0384t.f1699r + c});
            for (int i2 = 0; i2 < size; i2++) {
                C0467a aVar = (C0467a) this.f1717s.valueAt(i2);
                float[] fArr = (float[]) this.f1718t.valueAt(i2);
                dArr[i2] = ((double) this.f1717s.keyAt(i2)) * 0.01d;
                aVar.mo2754a(this.f1719u);
                int i3 = 0;
                while (true) {
                    float[] fArr2 = this.f1719u;
                    if (i3 >= fArr2.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr2[i3];
                    i3++;
                }
                dArr2[i2][c] = (double) fArr[0];
                dArr2[i2][c + 1] = (double) fArr[1];
            }
            this.f1700a = C7588b.m18366a(i, dArr, dArr2);
        }

        /* renamed from: a */
        public void mo2421a(int i, C0467a aVar, float f, float f2, float f3, int i2, boolean z, float f4) {
            this.f1717s.append(i, aVar);
            this.f1718t.append(i, new float[]{f, f2, f4, f3});
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            this.f1700a.mo19631a((double) f, this.f1719u);
            float[] fArr = this.f1719u;
            float f2 = fArr[fArr.length - 4];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float f5 = fArr[fArr.length - 3];
            this.f1715p = (float) ((((double) this.f1715p) + ((((double) (j - this.f1713n)) * 1.0E-9d) * ((double) f4))) % 1.0d);
            this.f1713n = j;
            float f6 = this.f1715p;
            this.f1712m = false;
            for (int i = 0; i < this.f1720v.length; i++) {
                this.f1712m |= ((double) this.f1719u[i]) != 0.0d;
                this.f1720v[i] = (this.f1719u[i] * f6) + f5;
            }
            ((C0467a) this.f1717s.valueAt(0)).mo2752a(view, this.f1720v);
            if (f4 != 0.0f) {
                this.f1712m = true;
            }
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$c */
    static class C0387c extends C0384t {
        C0387c() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            if (VERSION.SDK_INT >= 21) {
                view.setElevation(mo2414a(f, j));
            }
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$d */
    static class C0388d extends C0384t {
        C0388d() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            return this.f1712m;
        }

        /* renamed from: a */
        public boolean mo2422a(View view, float f, long j, double d, double d2) {
            mo2417a(view);
            view.setRotation(mo2414a(f, j) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$e */
    static class C0389e extends C0384t {

        /* renamed from: s */
        boolean f1721s = false;

        C0389e() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            String str = "unable to setProgress";
            String str2 = "SpringSet";
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2414a(f, j));
            } else if (this.f1721s) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f1721s = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2414a(f, j))});
                    } catch (IllegalAccessException e) {
                        Log.e(str2, str, e);
                    } catch (InvocationTargetException e2) {
                        Log.e(str2, str, e2);
                    }
                }
            }
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$f */
    static class C0390f extends C0384t {
        C0390f() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            view.setRotation(mo2414a(f, j));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$g */
    static class C0391g extends C0384t {
        C0391g() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            view.setRotationX(mo2414a(f, j));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$h */
    static class C0392h extends C0384t {
        C0392h() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            view.setRotationY(mo2414a(f, j));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$i */
    static class C0393i extends C0384t {
        C0393i() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            view.setScaleX(mo2414a(f, j));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$j */
    static class C0394j extends C0384t {
        C0394j() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            view.setScaleY(mo2414a(f, j));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$k */
    private static class C0395k {
        /* renamed from: a */
        static void m1779a(int[] iArr, float[][] fArr, int i, int i2) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = iArr2[i4];
                i3 = i4 - 1;
                int i6 = iArr2[i3];
                if (i5 < i6) {
                    int b = m1780b(iArr, fArr, i5, i6);
                    int i7 = i3 + 1;
                    iArr2[i3] = b - 1;
                    int i8 = i7 + 1;
                    iArr2[i7] = i5;
                    int i9 = i8 + 1;
                    iArr2[i8] = i6;
                    i3 = i9 + 1;
                    iArr2[i9] = b + 1;
                }
            }
        }

        /* renamed from: b */
        private static int m1780b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m1781c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m1781c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m1781c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$l */
    static class C0396l {

        /* renamed from: a */
        double f1722a = 0.1d;

        /* renamed from: b */
        double f1723b = 0.0d;

        /* renamed from: c */
        double f1724c = 1.0d;

        /* renamed from: d */
        double f1725d;

        /* renamed from: e */
        double f1726e = 1.5d;

        /* renamed from: a */
        public void mo2424a(double d) {
            this.f1726e = Math.log(18.6d / d);
        }

        /* renamed from: b */
        public void mo2427b(double d) {
            double d2 = d * 6.283185307179586d;
            this.f1725d = (double) ((float) (d2 * d2 * this.f1724c));
        }

        /* renamed from: c */
        public void mo2428c(double d) {
            double d2 = this.f1725d;
            double d3 = this.f1722a;
            double d4 = ((d2 * d3) * d3) / 2.0d;
            double d5 = this.f1724c;
            double d6 = this.f1723b;
            double d7 = ((d5 * d6) * d6) / 2.0d;
            double d8 = d4;
            double d9 = (-d2) * (d3 - ((d * d6) / 2.0d));
            double d10 = this.f1726e;
            double d11 = (double) ((float) (((d9 - (d6 * d10)) / d5) * d));
            double d12 = d11 / 2.0d;
            double d13 = (d7 + d8) - (((d10 * (d6 - d12)) * (d6 - d12)) * d);
            this.f1723b = (double) ((float) (d11 + d6));
            double d14 = this.f1723b;
            this.f1722a = d3 + ((d14 - d12) * d);
            double d15 = this.f1722a;
            double sqrt = Math.sqrt(d13 / ((((d2 * d15) * d15) / 2.0d) + (((d5 * d14) * d14) / 2.0d)));
            this.f1723b *= sqrt;
            this.f1722a *= sqrt;
        }

        /* renamed from: a */
        public double mo2423a() {
            double d = this.f1725d;
            double d2 = this.f1722a;
            double d3 = ((d * d2) * d2) / 2.0d;
            double d4 = this.f1724c;
            double d5 = this.f1723b;
            return d3 + (((d4 * d5) * d5) / 2.0d);
        }

        /* renamed from: b */
        public double mo2426b() {
            return this.f1722a;
        }

        /* renamed from: a */
        public void mo2425a(float f) {
            this.f1723b += (double) f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$m */
    static class C0397m extends C0384t {
        C0397m() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            view.setTranslationX(mo2414a(f, j));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$n */
    static class C0398n extends C0384t {
        C0398n() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            view.setTranslationY(mo2414a(f, j));
            return this.f1712m;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$o */
    static class C0399o extends C0384t {
        C0399o() {
        }

        /* renamed from: a */
        public boolean mo2419a(View view, float f, long j) {
            mo2417a(view);
            if (VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2414a(f, j));
            }
            return this.f1712m;
        }
    }

    public C0384t() {
        Class<float> cls = float.class;
        this.f1705f = (float[][]) Array.newInstance(cls, new int[]{10, 1});
        this.f1706g = (float[][]) Array.newInstance(cls, new int[]{10, f1699r});
        this.f1709j = new float[f1699r];
        this.f1710k = Float.NaN;
        this.f1712m = false;
        this.f1713n = -1;
        this.f1714o = new C0396l();
        this.f1715p = 0.0f;
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.C0384t m1759b(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x007d;
                case -1249320805: goto L_0x0073;
                case -1225497657: goto L_0x0068;
                case -1225497656: goto L_0x005d;
                case -1225497655: goto L_0x0052;
                case -1001078227: goto L_0x0047;
                case -908189618: goto L_0x003d;
                case -908189617: goto L_0x0033;
                case -40300674: goto L_0x0029;
                case -4379043: goto L_0x001f;
                case 37232917: goto L_0x0014;
                case 92909918: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0087
        L_0x0009:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 0
            goto L_0x0088
        L_0x0014:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 5
            goto L_0x0088
        L_0x001f:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0029:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 2
            goto L_0x0088
        L_0x0033:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 7
            goto L_0x0088
        L_0x003d:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 6
            goto L_0x0088
        L_0x0047:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 11
            goto L_0x0088
        L_0x0052:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 10
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 9
            goto L_0x0088
        L_0x0068:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 8
            goto L_0x0088
        L_0x0073:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 4
            goto L_0x0088
        L_0x007d:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 3
            goto L_0x0088
        L_0x0087:
            r1 = -1
        L_0x0088:
            switch(r1) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00c9;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00b7;
                case 5: goto L_0x00b1;
                case 6: goto L_0x00ab;
                case 7: goto L_0x00a5;
                case 8: goto L_0x009f;
                case 9: goto L_0x0099;
                case 10: goto L_0x0093;
                case 11: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            r1 = 0
            return r1
        L_0x008d:
            androidx.constraintlayout.motion.widget.t$e r1 = new androidx.constraintlayout.motion.widget.t$e
            r1.<init>()
            return r1
        L_0x0093:
            androidx.constraintlayout.motion.widget.t$o r1 = new androidx.constraintlayout.motion.widget.t$o
            r1.<init>()
            return r1
        L_0x0099:
            androidx.constraintlayout.motion.widget.t$n r1 = new androidx.constraintlayout.motion.widget.t$n
            r1.<init>()
            return r1
        L_0x009f:
            androidx.constraintlayout.motion.widget.t$m r1 = new androidx.constraintlayout.motion.widget.t$m
            r1.<init>()
            return r1
        L_0x00a5:
            androidx.constraintlayout.motion.widget.t$j r1 = new androidx.constraintlayout.motion.widget.t$j
            r1.<init>()
            return r1
        L_0x00ab:
            androidx.constraintlayout.motion.widget.t$i r1 = new androidx.constraintlayout.motion.widget.t$i
            r1.<init>()
            return r1
        L_0x00b1:
            androidx.constraintlayout.motion.widget.t$d r1 = new androidx.constraintlayout.motion.widget.t$d
            r1.<init>()
            return r1
        L_0x00b7:
            androidx.constraintlayout.motion.widget.t$h r1 = new androidx.constraintlayout.motion.widget.t$h
            r1.<init>()
            return r1
        L_0x00bd:
            androidx.constraintlayout.motion.widget.t$g r1 = new androidx.constraintlayout.motion.widget.t$g
            r1.<init>()
            return r1
        L_0x00c3:
            androidx.constraintlayout.motion.widget.t$f r1 = new androidx.constraintlayout.motion.widget.t$f
            r1.<init>()
            return r1
        L_0x00c9:
            androidx.constraintlayout.motion.widget.t$c r1 = new androidx.constraintlayout.motion.widget.t$c
            r1.<init>()
            return r1
        L_0x00cf:
            androidx.constraintlayout.motion.widget.t$a r1 = new androidx.constraintlayout.motion.widget.t$a
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0384t.m1759b(java.lang.String):androidx.constraintlayout.motion.widget.t");
    }

    /* renamed from: a */
    public abstract boolean mo2419a(View view, float f, long j);

    public String toString() {
        String str = this.f1708i;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f1707h; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.f1703d[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.f1706g[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public void mo2418a(String str) {
        this.f1708i = str;
    }

    /* renamed from: a */
    public float mo2414a(float f, long j) {
        float f2 = f;
        long j2 = j;
        this.f1700a.mo19631a((double) f2, this.f1709j);
        float[] fArr = this.f1709j;
        float f3 = fArr[0];
        float f4 = fArr[2];
        float f5 = fArr[1];
        float f6 = fArr[3];
        if (f3 == 0.0f) {
            this.f1712m = false;
            return fArr[1];
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f1704e;
            if (i >= iArr.length) {
                break;
            }
            float f7 = ((float) iArr[i]) / 100.0f;
            if ((f2 - f7) * (this.f1716q - f7) < 0.0f && !Float.isNaN(this.f1705f[i][0])) {
                this.f1714o.mo2425a(this.f1705f[i][0]);
            }
            i++;
        }
        this.f1716q = f2;
        if (!Float.isNaN(f6)) {
            this.f1711l *= f6;
        }
        C0396l lVar = this.f1714o;
        lVar.f1722a += (double) this.f1711l;
        this.f1711l = 0.0f;
        long j3 = j2 - this.f1713n;
        lVar.mo2427b((double) f3);
        this.f1714o.mo2424a((double) (f4 / 1000.0f));
        float f8 = f3;
        if (this.f1713n != -1) {
            if (((double) j3) * 1.0E-9d > 0.1d) {
                j3 = 1000000;
            }
            this.f1714o.mo2428c(((double) j3) * 1.0E-9d);
        }
        this.f1713n = j2;
        float b = (float) this.f1714o.mo2426b();
        float f9 = b + f5;
        this.f1712m = this.f1714o.mo2423a() > 0.1d;
        if (!this.f1712m) {
            this.f1713n = -1;
        }
        if (Float.isNaN(f9)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0326a.m1406a());
            sb.append(" setPoint delta_time= ");
            sb.append(((double) j3) * 1.0E-9d);
            String str = "SpringSet";
            Log.e(str, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C0326a.m1406a());
            sb2.append(" setPoint value= ");
            sb2.append(f9);
            sb2.append(" wave= ");
            sb2.append(b);
            sb2.append(" offset= ");
            sb2.append(f5);
            sb2.append(" period= ");
            sb2.append(f8);
            sb2.append(" decay= ");
            sb2.append(f4);
            Log.e(str, sb2.toString());
        }
        return f9;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2417a(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.f1701b
            if (r0 == 0) goto L_0x003b
            r1 = 1
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002f
            r1 = 2
            if (r0 == r1) goto L_0x0026
            r1 = 3
            if (r0 == r1) goto L_0x001c
            r1 = 4
            if (r0 == r1) goto L_0x0013
            goto L_0x003b
        L_0x0013:
            int r0 = r4.getBottom()
            int r4 = r4.getTop()
            goto L_0x0037
        L_0x001c:
            int r0 = r4.getRight()
            int r4 = r4.getLeft()
            int r0 = r0 - r4
            goto L_0x0038
        L_0x0026:
            int r0 = r4.getBottom()
            int r4 = r4.getTop()
            goto L_0x0037
        L_0x002f:
            int r0 = r4.getRight()
            int r4 = r4.getLeft()
        L_0x0037:
            int r0 = r0 + r4
        L_0x0038:
            float r4 = (float) r0
            float r4 = r4 / r2
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            float r0 = r3.f1710k
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0052
            boolean r0 = r3.f1702c
            if (r0 == 0) goto L_0x004d
            float r0 = r3.f1710k
            float r0 = r4 - r0
            goto L_0x0050
        L_0x004d:
            float r0 = r3.f1710k
            float r0 = r0 - r4
        L_0x0050:
            r3.f1711l = r0
        L_0x0052:
            r3.f1710k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0384t.mo2417a(android.view.View):void");
    }

    /* renamed from: a */
    static C0384t m1758a(String str, SparseArray<C0467a> sparseArray) {
        return new C0386b(str, sparseArray);
    }

    /* renamed from: a */
    public void mo2416a(int i, float f, float f2, float f3, float f4, int i2, boolean z, float f5) {
        int[] iArr = this.f1703d;
        int i3 = this.f1707h;
        iArr[i3] = i;
        float[][] fArr = this.f1706g;
        fArr[i3][2] = f3;
        fArr[i3][0] = f2;
        fArr[i3][1] = f;
        fArr[i3][3] = f4;
        this.f1704e[i3] = i;
        this.f1705f[i3][0] = f5;
        this.f1701b = i2;
        this.f1702c = z;
        this.f1707h = i3 + 1;
    }

    /* renamed from: a */
    public void mo2415a(int i) {
        int i2 = this.f1707h;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error no points added to ");
            sb.append(this.f1708i);
            Log.e("SpringSet", sb.toString());
            return;
        }
        int i3 = 1;
        C0395k.m1779a(this.f1703d, this.f1706g, 0, i2 - 1);
        C0395k.m1779a(this.f1704e, this.f1705f, 0, this.f1707h - 1);
        int i4 = 0;
        while (true) {
            int[] iArr = this.f1703d;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{i4, f1699r});
        int i5 = 0;
        for (int i6 = 0; i6 < this.f1707h; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f1703d;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f1703d[i6]) * 0.01d;
            for (int i7 = 0; i7 < f1699r; i7++) {
                dArr2[i5][i7] = (double) this.f1706g[i6][i7];
            }
            i5++;
        }
        this.f1700a = C7588b.m18366a(i, dArr, dArr2);
    }
}
