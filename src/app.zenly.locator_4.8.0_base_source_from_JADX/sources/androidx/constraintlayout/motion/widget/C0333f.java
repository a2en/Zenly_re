package androidx.constraintlayout.motion.widget;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.C0467a;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import p214e.p229f.p230a.p231a.C7588b;
import p214e.p229f.p230a.p231a.C7594f;

/* renamed from: androidx.constraintlayout.motion.widget.f */
public abstract class C0333f {

    /* renamed from: a */
    private C0337d f1513a;

    /* renamed from: b */
    protected C0467a f1514b;

    /* renamed from: c */
    private String f1515c;

    /* renamed from: d */
    private int f1516d = 0;

    /* renamed from: e */
    public int f1517e = 0;

    /* renamed from: f */
    ArrayList<C0349p> f1518f = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.f$a */
    class C0334a implements Comparator<C0349p> {
        C0334a(C0333f fVar) {
        }

        /* renamed from: a */
        public int compare(C0349p pVar, C0349p pVar2) {
            return Integer.compare(pVar.f1528a, pVar2.f1528a);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$b */
    static class C0335b extends C0333f {
        C0335b() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            view.setAlpha(mo2313a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$c */
    static class C0336c extends C0333f {

        /* renamed from: g */
        float[] f1519g = new float[1];

        C0336c() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            this.f1519g[0] = mo2313a(f);
            this.f1514b.mo2752a(view, this.f1519g);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$d */
    static class C0337d {

        /* renamed from: a */
        C7594f f1520a = new C7594f();

        /* renamed from: b */
        float[] f1521b;

        /* renamed from: c */
        double[] f1522c;

        /* renamed from: d */
        float[] f1523d;

        /* renamed from: e */
        float[] f1524e;

        /* renamed from: f */
        C7588b f1525f;

        /* renamed from: g */
        double[] f1526g;

        C0337d(int i, int i2, int i3) {
            new HashMap();
            this.f1520a.mo19650a(i);
            this.f1521b = new float[i3];
            this.f1522c = new double[i3];
            this.f1523d = new float[i3];
            this.f1524e = new float[i3];
            float[] fArr = new float[i3];
        }

        /* renamed from: a */
        public double mo2323a(float f) {
            C7588b bVar = this.f1525f;
            if (bVar != null) {
                bVar.mo19630a((double) f, this.f1526g);
            } else {
                double[] dArr = this.f1526g;
                dArr[0] = (double) this.f1524e[0];
                dArr[1] = (double) this.f1521b[0];
            }
            return this.f1526g[0] + (this.f1520a.mo19651b((double) f) * this.f1526g[1]);
        }

        /* renamed from: b */
        public void mo2325b(float f) {
            System.nanoTime();
            double[][] dArr = (double[][]) Array.newInstance(double.class, new int[]{this.f1522c.length, 2});
            this.f1526g = new double[(this.f1521b.length + 1)];
            if (this.f1522c[0] > 0.0d) {
                this.f1520a.mo19649a(0.0d, this.f1523d[0]);
            }
            double[] dArr2 = this.f1522c;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.f1520a.mo19649a(1.0d, this.f1523d[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                dArr[i][0] = (double) this.f1524e[i];
                int i2 = 0;
                while (true) {
                    float[] fArr = this.f1521b;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    dArr[i2][1] = (double) fArr[i2];
                    i2++;
                }
                this.f1520a.mo19649a(this.f1522c[i], this.f1523d[i]);
            }
            this.f1520a.mo19648a();
            double[] dArr3 = this.f1522c;
            if (dArr3.length > 1) {
                this.f1525f = C7588b.m18366a(0, dArr3, dArr);
            } else {
                this.f1525f = null;
            }
        }

        /* renamed from: a */
        public void mo2324a(int i, int i2, float f, float f2, float f3) {
            this.f1522c[i] = ((double) i2) / 100.0d;
            this.f1523d[i] = f;
            this.f1524e[i] = f2;
            this.f1521b[i] = f3;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$e */
    static class C0338e extends C0333f {
        C0338e() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            if (VERSION.SDK_INT >= 21) {
                view.setElevation(mo2313a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$f */
    static class C0339f extends C0333f {
        C0339f() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
        }

        /* renamed from: a */
        public void mo2326a(View view, float f, double d, double d2) {
            view.setRotation(mo2313a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$g */
    static class C0340g extends C0333f {

        /* renamed from: g */
        boolean f1527g = false;

        C0340g() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            String str = "unable to setProgress";
            String str2 = "KeyCycleOscillator";
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(mo2313a(f));
            } else if (!this.f1527g) {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", new Class[]{Float.TYPE});
                } catch (NoSuchMethodException unused) {
                    this.f1527g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, new Object[]{Float.valueOf(mo2313a(f))});
                    } catch (IllegalAccessException e) {
                        Log.e(str2, str, e);
                    } catch (InvocationTargetException e2) {
                        Log.e(str2, str, e2);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$h */
    static class C0341h extends C0333f {
        C0341h() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            view.setRotation(mo2313a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$i */
    static class C0342i extends C0333f {
        C0342i() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            view.setRotationX(mo2313a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$j */
    static class C0343j extends C0333f {
        C0343j() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            view.setRotationY(mo2313a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$k */
    static class C0344k extends C0333f {
        C0344k() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            view.setScaleX(mo2313a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$l */
    static class C0345l extends C0333f {
        C0345l() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            view.setScaleY(mo2313a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$m */
    static class C0346m extends C0333f {
        C0346m() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            view.setTranslationX(mo2313a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$n */
    static class C0347n extends C0333f {
        C0347n() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            view.setTranslationY(mo2313a(f));
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$o */
    static class C0348o extends C0333f {
        C0348o() {
        }

        /* renamed from: a */
        public void mo2316a(View view, float f) {
            if (VERSION.SDK_INT >= 21) {
                view.setTranslationZ(mo2313a(f));
            }
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.f$p */
    static class C0349p {

        /* renamed from: a */
        int f1528a;

        /* renamed from: b */
        float f1529b;

        /* renamed from: c */
        float f1530c;

        /* renamed from: d */
        float f1531d;

        public C0349p(int i, float f, float f2, float f3) {
            this.f1528a = i;
            this.f1529b = f3;
            this.f1530c = f2;
            this.f1531d = f;
        }
    }

    /* renamed from: b */
    static C0333f m1491b(String str) {
        if (str.startsWith("CUSTOM")) {
            return new C0336c();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 10;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 11;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 12;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 13;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -797520672:
                if (str.equals("waveVariesBy")) {
                    c = 9;
                    break;
                }
                break;
            case -40300674:
                if (str.equals("rotation")) {
                    c = 2;
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    c = 1;
                    break;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    c = 5;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 0;
                    break;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C0335b();
            case 1:
                return new C0338e();
            case 2:
                return new C0341h();
            case 3:
                return new C0342i();
            case 4:
                return new C0343j();
            case 5:
                return new C0339f();
            case 6:
                return new C0344k();
            case 7:
                return new C0345l();
            case 8:
                return new C0335b();
            case 9:
                return new C0335b();
            case 10:
                return new C0346m();
            case 11:
                return new C0347n();
            case 12:
                return new C0348o();
            case 13:
                return new C0340g();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public abstract void mo2316a(View view, float f);

    /* renamed from: a */
    public boolean mo2318a() {
        return this.f1517e == 1;
    }

    public String toString() {
        String str = this.f1515c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator it = this.f1518f.iterator();
        while (it.hasNext()) {
            C0349p pVar = (C0349p) it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(pVar.f1528a);
            sb.append(" , ");
            sb.append(decimalFormat.format((double) pVar.f1529b));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    /* renamed from: a */
    public void mo2317a(String str) {
        this.f1515c = str;
    }

    /* renamed from: a */
    public float mo2313a(float f) {
        return (float) this.f1513a.mo2323a(f);
    }

    /* renamed from: a */
    public void mo2315a(int i, int i2, int i3, float f, float f2, float f3, C0467a aVar) {
        this.f1518f.add(new C0349p(i, f, f2, f3));
        if (i3 != -1) {
            this.f1517e = i3;
        }
        this.f1516d = i2;
        this.f1514b = aVar;
    }

    /* renamed from: a */
    public void mo2314a(int i, int i2, int i3, float f, float f2, float f3) {
        this.f1518f.add(new C0349p(i, f, f2, f3));
        if (i3 != -1) {
            this.f1517e = i3;
        }
        this.f1516d = i2;
    }

    @TargetApi(19)
    /* renamed from: b */
    public void mo2319b(float f) {
        int size = this.f1518f.size();
        if (size != 0) {
            Collections.sort(this.f1518f, new C0334a(this));
            double[] dArr = new double[size];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, new int[]{size, 2});
            this.f1513a = new C0337d(this.f1516d, this.f1517e, size);
            Iterator it = this.f1518f.iterator();
            int i = 0;
            while (it.hasNext()) {
                C0349p pVar = (C0349p) it.next();
                float f2 = pVar.f1531d;
                dArr[i] = ((double) f2) * 0.01d;
                double[] dArr3 = dArr2[i];
                float f3 = pVar.f1529b;
                dArr3[0] = (double) f3;
                double[] dArr4 = dArr2[i];
                float f4 = pVar.f1530c;
                dArr4[1] = (double) f4;
                this.f1513a.mo2324a(i, pVar.f1528a, f2, f4, f3);
                i++;
            }
            this.f1513a.mo2325b(f);
            C7588b.m18366a(0, dArr, dArr2);
        }
    }
}
