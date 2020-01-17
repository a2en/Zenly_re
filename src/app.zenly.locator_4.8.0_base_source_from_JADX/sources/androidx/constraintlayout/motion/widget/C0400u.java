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

/* renamed from: androidx.constraintlayout.motion.widget.u */
public abstract class C0400u {

    /* renamed from: k */
    private static float f1727k = 6.2831855f;

    /* renamed from: a */
    protected C7588b f1728a;

    /* renamed from: b */
    protected int f1729b = 0;

    /* renamed from: c */
    protected int[] f1730c = new int[10];

    /* renamed from: d */
    protected float[][] f1731d = ((float[][]) Array.newInstance(float.class, new int[]{10, 3}));

    /* renamed from: e */
    private int f1732e;

    /* renamed from: f */
    private String f1733f;

    /* renamed from: g */
    private float[] f1734g = new float[3];

    /* renamed from: h */
    protected boolean f1735h = false;

    /* renamed from: i */
    long f1736i;

    /* renamed from: j */
    float f1737j = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.u$a */
    static class C0401a extends C0400u {
        C0401a() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            view.setAlpha(mo2430a(f, j));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$b */
    static class C0402b extends C0400u {

        /* renamed from: l */
        SparseArray<C0467a> f1738l;

        /* renamed from: m */
        SparseArray<float[]> f1739m = new SparseArray<>();

        /* renamed from: n */
        float[] f1740n;

        /* renamed from: o */
        float[] f1741o;

        public C0402b(String str, SparseArray<C0467a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f1738l = sparseArray;
        }

        /* renamed from: a */
        public void mo2431a(int i) {
            int size = this.f1738l.size();
            int c = ((C0467a) this.f1738l.valueAt(0)).mo2756c();
            double[] dArr = new double[size];
            int i2 = c + 2;
            this.f1740n = new float[i2];
            this.f1741o = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, i2});
            for (int i3 = 0; i3 < size; i3++) {
                C0467a aVar = (C0467a) this.f1738l.valueAt(i3);
                float[] fArr = (float[]) this.f1739m.valueAt(i3);
                dArr[i3] = ((double) this.f1738l.keyAt(i3)) * 0.01d;
                aVar.mo2754a(this.f1740n);
                int i4 = 0;
                while (true) {
                    float[] fArr2 = this.f1740n;
                    if (i4 >= fArr2.length) {
                        break;
                    }
                    dArr2[i3][i4] = (double) fArr2[i4];
                    i4++;
                }
                dArr2[i3][c] = (double) fArr[0];
                dArr2[i3][c + 1] = (double) fArr[1];
            }
            this.f1728a = C7588b.m18366a(i, dArr, dArr2);
        }

        /* renamed from: a */
        public void mo2432a(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        /* renamed from: a */
        public void mo2436a(int i, C0467a aVar, float f, int i2, float f2) {
            this.f1738l.append(i, aVar);
            this.f1739m.append(i, new float[]{f, f2});
            this.f1729b = Math.max(this.f1729b, i2);
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            this.f1728a.mo19631a((double) f, this.f1740n);
            float[] fArr = this.f1740n;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            this.f1737j = (float) ((((double) this.f1737j) + ((((double) (j - this.f1736i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
            this.f1736i = j;
            float a = mo2429a(this.f1737j);
            this.f1735h = false;
            for (int i = 0; i < this.f1741o.length; i++) {
                this.f1735h |= ((double) this.f1740n[i]) != 0.0d;
                this.f1741o[i] = (this.f1740n[i] * a) + f3;
            }
            ((C0467a) this.f1738l.valueAt(0)).mo2752a(view, this.f1741o);
            if (f2 != 0.0f) {
                this.f1735h = true;
            }
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$c */
    static class C0403c extends C0400u {
        C0403c() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            if (VERSION.SDK_INT >= 21) {
                view.setElevation(mo2430a(f, j));
            }
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$d */
    static class C0404d extends C0400u {
        C0404d() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            return this.f1735h;
        }

        /* renamed from: a */
        public boolean mo2437a(View view, float f, long j, double d, double d2) {
            view.setRotation(mo2430a(f, j) + ((float) Math.toDegrees(Math.atan2(d2, d))));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$e */
    static class C0405e extends C0400u {

        /* renamed from: l */
        boolean f1742l = false;

        C0405e() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            String str = "unable to setProgress";
            String str2 = "SplineSet";
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2430a(f, j));
            } else if (this.f1742l) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f1742l = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2430a(f, j))});
                    } catch (IllegalAccessException e) {
                        Log.e(str2, str, e);
                    } catch (InvocationTargetException e2) {
                        Log.e(str2, str, e2);
                    }
                }
            }
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$f */
    static class C0406f extends C0400u {
        C0406f() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            view.setRotation(mo2430a(f, j));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$g */
    static class C0407g extends C0400u {
        C0407g() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            view.setRotationX(mo2430a(f, j));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$h */
    static class C0408h extends C0400u {
        C0408h() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            view.setRotationY(mo2430a(f, j));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$i */
    static class C0409i extends C0400u {
        C0409i() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            view.setScaleX(mo2430a(f, j));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$j */
    static class C0410j extends C0400u {
        C0410j() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            view.setScaleY(mo2430a(f, j));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$k */
    private static class C0411k {
        /* renamed from: a */
        static void m1813a(int[] iArr, float[][] fArr, int i, int i2) {
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
                    int b = m1814b(iArr, fArr, i5, i6);
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
        private static int m1814b(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m1815c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m1815c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m1815c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$l */
    static class C0412l extends C0400u {
        C0412l() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            view.setTranslationX(mo2430a(f, j));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$m */
    static class C0413m extends C0400u {
        C0413m() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            view.setTranslationY(mo2430a(f, j));
            return this.f1735h;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.u$n */
    static class C0414n extends C0400u {
        C0414n() {
        }

        /* renamed from: a */
        public boolean mo2434a(View view, float f, long j) {
            if (VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2430a(f, j));
            }
            return this.f1735h;
        }
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.C0400u m1792b(java.lang.String r1) {
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
            androidx.constraintlayout.motion.widget.u$e r1 = new androidx.constraintlayout.motion.widget.u$e
            r1.<init>()
            return r1
        L_0x0093:
            androidx.constraintlayout.motion.widget.u$n r1 = new androidx.constraintlayout.motion.widget.u$n
            r1.<init>()
            return r1
        L_0x0099:
            androidx.constraintlayout.motion.widget.u$m r1 = new androidx.constraintlayout.motion.widget.u$m
            r1.<init>()
            return r1
        L_0x009f:
            androidx.constraintlayout.motion.widget.u$l r1 = new androidx.constraintlayout.motion.widget.u$l
            r1.<init>()
            return r1
        L_0x00a5:
            androidx.constraintlayout.motion.widget.u$j r1 = new androidx.constraintlayout.motion.widget.u$j
            r1.<init>()
            return r1
        L_0x00ab:
            androidx.constraintlayout.motion.widget.u$i r1 = new androidx.constraintlayout.motion.widget.u$i
            r1.<init>()
            return r1
        L_0x00b1:
            androidx.constraintlayout.motion.widget.u$d r1 = new androidx.constraintlayout.motion.widget.u$d
            r1.<init>()
            return r1
        L_0x00b7:
            androidx.constraintlayout.motion.widget.u$h r1 = new androidx.constraintlayout.motion.widget.u$h
            r1.<init>()
            return r1
        L_0x00bd:
            androidx.constraintlayout.motion.widget.u$g r1 = new androidx.constraintlayout.motion.widget.u$g
            r1.<init>()
            return r1
        L_0x00c3:
            androidx.constraintlayout.motion.widget.u$f r1 = new androidx.constraintlayout.motion.widget.u$f
            r1.<init>()
            return r1
        L_0x00c9:
            androidx.constraintlayout.motion.widget.u$c r1 = new androidx.constraintlayout.motion.widget.u$c
            r1.<init>()
            return r1
        L_0x00cf:
            androidx.constraintlayout.motion.widget.u$a r1 = new androidx.constraintlayout.motion.widget.u$a
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0400u.m1792b(java.lang.String):androidx.constraintlayout.motion.widget.u");
    }

    /* renamed from: a */
    public void mo2433a(String str) {
        this.f1733f = str;
    }

    /* renamed from: a */
    public abstract boolean mo2434a(View view, float f, long j);

    public String toString() {
        String str = this.f1733f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f1732e; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.f1730c[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.f1731d[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public float mo2430a(float f, long j) {
        this.f1728a.mo19631a((double) f, this.f1734g);
        float[] fArr = this.f1734g;
        boolean z = true;
        float f2 = fArr[1];
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0) {
            this.f1735h = false;
            return fArr[2];
        }
        this.f1737j = (float) ((((double) this.f1737j) + ((((double) (j - this.f1736i)) * 1.0E-9d) * ((double) f2))) % 1.0d);
        this.f1736i = j;
        float f3 = fArr[0];
        float a = (mo2429a(this.f1737j) * f3) + this.f1734g[2];
        if (f3 == 0.0f && i == 0) {
            z = false;
        }
        this.f1735h = z;
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public float mo2429a(float f) {
        float abs;
        switch (this.f1729b) {
            case 1:
                return Math.signum(f * f1727k);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos((double) (f * f1727k));
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin((double) (f * f1727k));
        }
        return 1.0f - abs;
    }

    /* renamed from: a */
    static C0400u m1791a(String str, SparseArray<C0467a> sparseArray) {
        return new C0402b(str, sparseArray);
    }

    /* renamed from: a */
    public void mo2432a(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.f1730c;
        int i3 = this.f1732e;
        iArr[i3] = i;
        float[][] fArr = this.f1731d;
        fArr[i3][0] = f;
        fArr[i3][1] = f2;
        fArr[i3][2] = f3;
        this.f1729b = Math.max(this.f1729b, i2);
        this.f1732e++;
    }

    /* renamed from: a */
    public void mo2431a(int i) {
        int i2 = this.f1732e;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error no points added to ");
            sb.append(this.f1733f);
            Log.e("SplineSet", sb.toString());
            return;
        }
        C0411k.m1813a(this.f1730c, this.f1731d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.f1730c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{i4, 3});
        int i5 = 0;
        for (int i6 = 0; i6 < this.f1732e; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.f1730c;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = ((double) this.f1730c[i6]) * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[][] fArr = this.f1731d;
            dArr3[0] = (double) fArr[i6][0];
            dArr2[i5][1] = (double) fArr[i6][1];
            dArr2[i5][2] = (double) fArr[i6][2];
            i5++;
        }
        this.f1728a = C7588b.m18366a(i, dArr, dArr2);
    }
}
