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
import java.util.Arrays;
import p214e.p229f.p230a.p231a.C7588b;

/* renamed from: androidx.constraintlayout.motion.widget.s */
public abstract class C0369s {

    /* renamed from: a */
    protected C7588b f1691a;

    /* renamed from: b */
    protected int[] f1692b = new int[10];

    /* renamed from: c */
    protected float[] f1693c = new float[10];

    /* renamed from: d */
    private int f1694d;

    /* renamed from: e */
    private String f1695e;

    /* renamed from: androidx.constraintlayout.motion.widget.s$a */
    static class C0370a extends C0369s {
        C0370a() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            view.setAlpha(mo2406a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$b */
    static class C0371b extends C0369s {

        /* renamed from: f */
        SparseArray<C0467a> f1696f;

        /* renamed from: g */
        float[] f1697g;

        public C0371b(String str, SparseArray<C0467a> sparseArray) {
            String str2 = str.split(",")[1];
            this.f1696f = sparseArray;
        }

        /* renamed from: a */
        public void mo2407a(int i) {
            int size = this.f1696f.size();
            int c = ((C0467a) this.f1696f.valueAt(0)).mo2756c();
            double[] dArr = new double[size];
            this.f1697g = new float[c];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, c});
            for (int i2 = 0; i2 < size; i2++) {
                C0467a aVar = (C0467a) this.f1696f.valueAt(i2);
                dArr[i2] = ((double) this.f1696f.keyAt(i2)) * 0.01d;
                aVar.mo2754a(this.f1697g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.f1697g;
                    if (i3 >= fArr.length) {
                        break;
                    }
                    dArr2[i2][i3] = (double) fArr[i3];
                    i3++;
                }
            }
            this.f1691a = C7588b.m18366a(i, dArr, dArr2);
        }

        /* renamed from: a */
        public void mo2408a(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        /* renamed from: a */
        public void mo2412a(int i, C0467a aVar) {
            this.f1696f.append(i, aVar);
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            this.f1691a.mo19631a((double) f, this.f1697g);
            ((C0467a) this.f1696f.valueAt(0)).mo2752a(view, this.f1697g);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$c */
    static class C0372c extends C0369s {
        C0372c() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            if (VERSION.SDK_INT >= 21) {
                view.setElevation(mo2406a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$d */
    static class C0373d extends C0369s {
        C0373d() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
        }

        /* renamed from: a */
        public void mo2413a(View view, float f, double d, double d2) {
            view.setRotation(mo2406a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$e */
    static class C0374e extends C0369s {

        /* renamed from: f */
        boolean f1698f = false;

        C0374e() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            String str = "unable to setProgress";
            String str2 = "SplineSet";
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2406a(f));
            } else if (!this.f1698f) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f1698f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2406a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e(str2, str, e);
                    } catch (InvocationTargetException e2) {
                        Log.e(str2, str, e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$f */
    static class C0375f extends C0369s {
        C0375f() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            view.setRotation(mo2406a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$g */
    static class C0376g extends C0369s {
        C0376g() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            view.setRotationX(mo2406a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$h */
    static class C0377h extends C0369s {
        C0377h() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            view.setRotationY(mo2406a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$i */
    static class C0378i extends C0369s {
        C0378i() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            view.setScaleX(mo2406a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$j */
    static class C0379j extends C0369s {
        C0379j() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            view.setScaleY(mo2406a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$k */
    private static class C0380k {
        /* renamed from: a */
        static void m1751a(int[] iArr, float[] fArr, int i, int i2) {
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
                    int b = m1752b(iArr, fArr, i5, i6);
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
        private static int m1752b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    m1753c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            m1753c(iArr, fArr, i4, i2);
            return i4;
        }

        /* renamed from: c */
        private static void m1753c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$l */
    static class C0381l extends C0369s {
        C0381l() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            view.setTranslationX(mo2406a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$m */
    static class C0382m extends C0369s {
        C0382m() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            view.setTranslationY(mo2406a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.s$n */
    static class C0383n extends C0369s {
        C0383n() {
        }

        /* renamed from: a */
        public void mo2409a(View view, float f) {
            if (VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2406a(f));
            }
        }
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.constraintlayout.motion.widget.C0369s m1731b(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0095;
                case -1249320805: goto L_0x008b;
                case -1225497657: goto L_0x0080;
                case -1225497656: goto L_0x0075;
                case -1225497655: goto L_0x006a;
                case -1001078227: goto L_0x005f;
                case -908189618: goto L_0x0055;
                case -908189617: goto L_0x004b;
                case -797520672: goto L_0x0040;
                case -40300674: goto L_0x0036;
                case -4379043: goto L_0x002b;
                case 37232917: goto L_0x0020;
                case 92909918: goto L_0x0015;
                case 156108012: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x009f
        L_0x0009:
            java.lang.String r0 = "waveOffset"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 8
            goto L_0x00a0
        L_0x0015:
            java.lang.String r0 = "alpha"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 0
            goto L_0x00a0
        L_0x0020:
            java.lang.String r0 = "transitionPathRotate"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 5
            goto L_0x00a0
        L_0x002b:
            java.lang.String r0 = "elevation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 1
            goto L_0x00a0
        L_0x0036:
            java.lang.String r0 = "rotation"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 2
            goto L_0x00a0
        L_0x0040:
            java.lang.String r0 = "waveVariesBy"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 9
            goto L_0x00a0
        L_0x004b:
            java.lang.String r0 = "scaleY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 7
            goto L_0x00a0
        L_0x0055:
            java.lang.String r0 = "scaleX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 6
            goto L_0x00a0
        L_0x005f:
            java.lang.String r0 = "progress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 13
            goto L_0x00a0
        L_0x006a:
            java.lang.String r0 = "translationZ"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 12
            goto L_0x00a0
        L_0x0075:
            java.lang.String r0 = "translationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 11
            goto L_0x00a0
        L_0x0080:
            java.lang.String r0 = "translationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 10
            goto L_0x00a0
        L_0x008b:
            java.lang.String r0 = "rotationY"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 4
            goto L_0x00a0
        L_0x0095:
            java.lang.String r0 = "rotationX"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x009f
            r1 = 3
            goto L_0x00a0
        L_0x009f:
            r1 = -1
        L_0x00a0:
            switch(r1) {
                case 0: goto L_0x00f3;
                case 1: goto L_0x00ed;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00db;
                case 5: goto L_0x00d5;
                case 6: goto L_0x00cf;
                case 7: goto L_0x00c9;
                case 8: goto L_0x00c3;
                case 9: goto L_0x00bd;
                case 10: goto L_0x00b7;
                case 11: goto L_0x00b1;
                case 12: goto L_0x00ab;
                case 13: goto L_0x00a5;
                default: goto L_0x00a3;
            }
        L_0x00a3:
            r1 = 0
            return r1
        L_0x00a5:
            androidx.constraintlayout.motion.widget.s$e r1 = new androidx.constraintlayout.motion.widget.s$e
            r1.<init>()
            return r1
        L_0x00ab:
            androidx.constraintlayout.motion.widget.s$n r1 = new androidx.constraintlayout.motion.widget.s$n
            r1.<init>()
            return r1
        L_0x00b1:
            androidx.constraintlayout.motion.widget.s$m r1 = new androidx.constraintlayout.motion.widget.s$m
            r1.<init>()
            return r1
        L_0x00b7:
            androidx.constraintlayout.motion.widget.s$l r1 = new androidx.constraintlayout.motion.widget.s$l
            r1.<init>()
            return r1
        L_0x00bd:
            androidx.constraintlayout.motion.widget.s$a r1 = new androidx.constraintlayout.motion.widget.s$a
            r1.<init>()
            return r1
        L_0x00c3:
            androidx.constraintlayout.motion.widget.s$a r1 = new androidx.constraintlayout.motion.widget.s$a
            r1.<init>()
            return r1
        L_0x00c9:
            androidx.constraintlayout.motion.widget.s$j r1 = new androidx.constraintlayout.motion.widget.s$j
            r1.<init>()
            return r1
        L_0x00cf:
            androidx.constraintlayout.motion.widget.s$i r1 = new androidx.constraintlayout.motion.widget.s$i
            r1.<init>()
            return r1
        L_0x00d5:
            androidx.constraintlayout.motion.widget.s$d r1 = new androidx.constraintlayout.motion.widget.s$d
            r1.<init>()
            return r1
        L_0x00db:
            androidx.constraintlayout.motion.widget.s$h r1 = new androidx.constraintlayout.motion.widget.s$h
            r1.<init>()
            return r1
        L_0x00e1:
            androidx.constraintlayout.motion.widget.s$g r1 = new androidx.constraintlayout.motion.widget.s$g
            r1.<init>()
            return r1
        L_0x00e7:
            androidx.constraintlayout.motion.widget.s$f r1 = new androidx.constraintlayout.motion.widget.s$f
            r1.<init>()
            return r1
        L_0x00ed:
            androidx.constraintlayout.motion.widget.s$c r1 = new androidx.constraintlayout.motion.widget.s$c
            r1.<init>()
            return r1
        L_0x00f3:
            androidx.constraintlayout.motion.widget.s$a r1 = new androidx.constraintlayout.motion.widget.s$a
            r1.<init>()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0369s.m1731b(java.lang.String):androidx.constraintlayout.motion.widget.s");
    }

    /* renamed from: a */
    public abstract void mo2409a(View view, float f);

    /* renamed from: a */
    public void mo2410a(String str) {
        this.f1695e = str;
    }

    public String toString() {
        String str = this.f1695e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f1694d; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.f1692b[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format((double) this.f1693c[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public float mo2406a(float f) {
        return (float) this.f1691a.mo19629a((double) f, 0);
    }

    /* renamed from: a */
    static C0369s m1730a(String str, SparseArray<C0467a> sparseArray) {
        return new C0371b(str, sparseArray);
    }

    /* renamed from: a */
    public void mo2408a(int i, float f) {
        int[] iArr = this.f1692b;
        if (iArr.length < this.f1694d + 1) {
            this.f1692b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1693c;
            this.f1693c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1692b;
        int i2 = this.f1694d;
        iArr2[i2] = i;
        this.f1693c[i2] = f;
        this.f1694d = i2 + 1;
    }

    /* renamed from: a */
    public void mo2407a(int i) {
        int i2 = this.f1694d;
        if (i2 != 0) {
            C0380k.m1751a(this.f1692b, this.f1693c, 0, i2 - 1);
            int i3 = 1;
            for (int i4 = 1; i4 < this.f1694d; i4++) {
                int[] iArr = this.f1692b;
                if (iArr[i4 - 1] != iArr[i4]) {
                    i3++;
                }
            }
            double[] dArr = new double[i3];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{i3, 1});
            int i5 = 0;
            for (int i6 = 0; i6 < this.f1694d; i6++) {
                if (i6 > 0) {
                    int[] iArr2 = this.f1692b;
                    if (iArr2[i6] == iArr2[i6 - 1]) {
                    }
                }
                dArr[i5] = ((double) this.f1692b[i6]) * 0.01d;
                dArr2[i5][0] = (double) this.f1693c[i6];
                i5++;
            }
            this.f1691a = C7588b.m18366a(i, dArr, dArr2);
        }
    }
}
