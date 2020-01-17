package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.C0364q.C0366b;
import androidx.constraintlayout.solver.widgets.C0436b;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0447g;
import androidx.constraintlayout.solver.widgets.C0449i;
import androidx.constraintlayout.solver.widgets.C0451j;
import androidx.constraintlayout.solver.widgets.C0453k;
import androidx.constraintlayout.solver.widgets.C0461r;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0470b;
import androidx.constraintlayout.widget.C0473c;
import androidx.constraintlayout.widget.C0481f;
import androidx.constraintlayout.widget.C0482g;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints.LayoutParams;
import androidx.core.view.NestedScrollingParent2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p214e.p229f.p230a.p231a.C7595g;

public class MotionLayout extends ConstraintLayout implements NestedScrollingParent2 {

    /* renamed from: A */
    Interpolator f1401A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public float f1402B = 0.0f;

    /* renamed from: C */
    private int f1403C = -1;

    /* renamed from: D */
    int f1404D = -1;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f1405E = -1;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f1406F = 0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f1407G = 0;

    /* renamed from: H */
    HashMap<View, C0361n> f1408H = new HashMap<>();

    /* renamed from: I */
    private long f1409I = 0;

    /* renamed from: J */
    private float f1410J = 1.0f;

    /* renamed from: K */
    float f1411K = 0.0f;

    /* renamed from: L */
    float f1412L = 0.0f;

    /* renamed from: M */
    private long f1413M;

    /* renamed from: N */
    float f1414N = 0.0f;

    /* renamed from: O */
    private boolean f1415O;

    /* renamed from: P */
    boolean f1416P = false;

    /* renamed from: Q */
    private TransitionListener f1417Q;

    /* renamed from: R */
    private float f1418R;

    /* renamed from: S */
    private float f1419S;

    /* renamed from: T */
    private int f1420T = 0;

    /* renamed from: U */
    C0324b f1421U;

    /* renamed from: V */
    private boolean f1422V = false;

    /* renamed from: W */
    private C7595g f1423W = new C7595g();

    /* renamed from: a0 */
    private C0323a f1424a0 = new C0323a();

    /* renamed from: b0 */
    private C0327b f1425b0;

    /* renamed from: c0 */
    int f1426c0;

    /* renamed from: d0 */
    int f1427d0;

    /* renamed from: e0 */
    float f1428e0;

    /* renamed from: f0 */
    float f1429f0;

    /* renamed from: g0 */
    long f1430g0;

    /* renamed from: h0 */
    float f1431h0;

    /* renamed from: i0 */
    private boolean f1432i0 = false;

    /* renamed from: j0 */
    private ArrayList<MotionHelper> f1433j0 = null;

    /* renamed from: k0 */
    private ArrayList<MotionHelper> f1434k0 = null;

    /* renamed from: l0 */
    private int f1435l0 = 0;

    /* renamed from: m0 */
    private long f1436m0 = -1;

    /* renamed from: n0 */
    private float f1437n0 = 0.0f;

    /* renamed from: o0 */
    private int f1438o0 = 0;

    /* renamed from: p0 */
    private float f1439p0 = 0.0f;

    /* renamed from: q0 */
    C0325c f1440q0 = new C0325c();

    /* renamed from: r0 */
    private boolean f1441r0 = false;

    /* renamed from: s0 */
    ArrayList<Integer> f1442s0 = new ArrayList<>();

    /* renamed from: z */
    C0364q f1443z;

    public interface TransitionListener {
        boolean allowsTransition(C0366b bVar);

        void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f);

        void onTransitionCompleted(MotionLayout motionLayout, int i);

        void onTransitionStarted(MotionLayout motionLayout, int i, int i2);

        void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f);
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$a */
    class C0323a extends C0362o {

        /* renamed from: a */
        float f1444a = 0.0f;

        /* renamed from: b */
        float f1445b = 0.0f;

        /* renamed from: c */
        float f1446c;

        C0323a() {
        }

        /* renamed from: a */
        public void mo2293a(float f, float f2, float f3) {
            this.f1444a = f;
            this.f1445b = f2;
            this.f1446c = f3;
        }

        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.f1444a;
            if (f4 > 0.0f) {
                float f5 = this.f1446c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                MotionLayout.this.f1402B = this.f1444a - (this.f1446c * f);
                f2 = (this.f1444a * f) - (((this.f1446c * f) * f) / 2.0f);
                f3 = this.f1445b;
            } else {
                float f6 = -f4;
                float f7 = this.f1446c;
                if (f6 / f7 < f) {
                    f = (-f4) / f7;
                }
                MotionLayout.this.f1402B = this.f1444a + (this.f1446c * f);
                f2 = (this.f1444a * f) + (((this.f1446c * f) * f) / 2.0f);
                f3 = this.f1445b;
            }
            return f2 + f3;
        }

        /* renamed from: a */
        public float mo2292a() {
            return MotionLayout.this.f1402B;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$b */
    private class C0324b {

        /* renamed from: a */
        float[] f1448a;

        /* renamed from: b */
        int[] f1449b;

        /* renamed from: c */
        float[] f1450c;

        /* renamed from: d */
        Path f1451d;

        /* renamed from: e */
        Paint f1452e = new Paint();

        /* renamed from: f */
        Paint f1453f;

        /* renamed from: g */
        Paint f1454g;

        /* renamed from: h */
        Paint f1455h;

        /* renamed from: i */
        Paint f1456i;

        /* renamed from: j */
        private float[] f1457j;

        /* renamed from: k */
        DashPathEffect f1458k;

        /* renamed from: l */
        int f1459l;

        /* renamed from: m */
        Rect f1460m = new Rect();

        /* renamed from: n */
        boolean f1461n = false;

        /* renamed from: o */
        int f1462o = 1;

        public C0324b() {
            this.f1452e.setAntiAlias(true);
            this.f1452e.setColor(-21965);
            this.f1452e.setStrokeWidth(2.0f);
            this.f1452e.setStyle(Style.STROKE);
            this.f1453f = new Paint();
            this.f1453f.setAntiAlias(true);
            this.f1453f.setColor(-2067046);
            this.f1453f.setStrokeWidth(2.0f);
            this.f1453f.setStyle(Style.STROKE);
            this.f1454g = new Paint();
            this.f1454g.setAntiAlias(true);
            this.f1454g.setColor(-13391360);
            this.f1454g.setStrokeWidth(2.0f);
            this.f1454g.setStyle(Style.STROKE);
            this.f1455h = new Paint();
            this.f1455h.setAntiAlias(true);
            this.f1455h.setColor(-13391360);
            this.f1455h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1457j = new float[8];
            this.f1456i = new Paint();
            this.f1456i.setAntiAlias(true);
            this.f1458k = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f1454g.setPathEffect(this.f1458k);
            this.f1450c = new float[100];
            this.f1449b = new int[50];
            if (this.f1461n) {
                this.f1452e.setStrokeWidth(8.0f);
                this.f1456i.setStrokeWidth(8.0f);
                this.f1453f.setStrokeWidth(8.0f);
                this.f1462o = 4;
            }
        }

        /* renamed from: b */
        private void m1391b(Canvas canvas, int i, int i2, C0361n nVar) {
            int i3;
            int i4;
            float f;
            float f2;
            int i5;
            Canvas canvas2 = canvas;
            int i6 = i;
            C0361n nVar2 = nVar;
            View view = nVar2.f1621a;
            if (view != null) {
                i4 = view.getWidth();
                i3 = nVar2.f1621a.getHeight();
            } else {
                i4 = 0;
                i3 = 0;
            }
            int i7 = 1;
            int i8 = 1;
            while (i8 < i2 - 1) {
                if (i6 != 4 || this.f1449b[i8 - 1] != 0) {
                    float[] fArr = this.f1450c;
                    int i9 = i8 * 2;
                    float f3 = fArr[i9];
                    float f4 = fArr[i9 + i7];
                    this.f1451d.reset();
                    this.f1451d.moveTo(f3, f4 + 10.0f);
                    this.f1451d.lineTo(f3 + 10.0f, f4);
                    this.f1451d.lineTo(f3, f4 - 10.0f);
                    this.f1451d.lineTo(f3 - 10.0f, f4);
                    this.f1451d.close();
                    int i10 = i8 - 1;
                    nVar2.mo2342a(i10);
                    if (i6 == 4) {
                        int[] iArr = this.f1449b;
                        if (iArr[i10] == i7) {
                            m1390b(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i10] == 2) {
                            m1386a(canvas2, f3 - 0.0f, f4 - 0.0f);
                        } else if (iArr[i10] == 3) {
                            i5 = 3;
                            f2 = f4;
                            f = f3;
                            m1387a(canvas, f3 - 0.0f, f4 - 0.0f, i4, i3);
                            canvas2.drawPath(this.f1451d, this.f1456i);
                        }
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                        canvas2.drawPath(this.f1451d, this.f1456i);
                    } else {
                        f2 = f4;
                        f = f3;
                        i5 = 3;
                    }
                    if (i6 == 2) {
                        m1390b(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i6 == i5) {
                        m1386a(canvas2, f - 0.0f, f2 - 0.0f);
                    }
                    if (i6 == 6) {
                        m1387a(canvas, f - 0.0f, f2 - 0.0f, i4, i3);
                    }
                    canvas2.drawPath(this.f1451d, this.f1456i);
                }
                i8++;
                i7 = 1;
            }
            float[] fArr2 = this.f1448a;
            canvas2.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f1453f);
            float[] fArr3 = this.f1448a;
            canvas2.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f1453f);
        }

        /* renamed from: c */
        private void m1392c(Canvas canvas) {
            float[] fArr = this.f1448a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.f1454g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.f1454g);
        }

        /* renamed from: d */
        private void m1393d(Canvas canvas) {
            float[] fArr = this.f1448a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1454g);
        }

        /* renamed from: a */
        public void mo2296a(Canvas canvas, HashMap<View, C0361n> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!MotionLayout.this.isInEditMode() && (i2 & 1) == 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.f1405E));
                    sb.append(":");
                    sb.append(MotionLayout.this.getProgress());
                    String sb2 = sb.toString();
                    canvas.drawText(sb2, 10.0f, (float) (MotionLayout.this.getHeight() - 30), this.f1455h);
                    canvas.drawText(sb2, 11.0f, (float) (MotionLayout.this.getHeight() - 29), this.f1452e);
                }
                for (C0361n nVar : hashMap.values()) {
                    int a = nVar.mo2340a();
                    if (i2 > 0 && a == 0) {
                        a = 1;
                    }
                    if (a != 0) {
                        this.f1459l = nVar.mo2341a(this.f1450c, this.f1449b);
                        if (a >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.f1448a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.f1448a = new float[(i3 * 2)];
                                this.f1451d = new Path();
                            }
                            int i4 = this.f1462o;
                            canvas.translate((float) i4, (float) i4);
                            this.f1452e.setColor(1996488704);
                            this.f1456i.setColor(1996488704);
                            this.f1453f.setColor(1996488704);
                            this.f1454g.setColor(1996488704);
                            nVar.mo2350a(this.f1448a, i3);
                            mo2295a(canvas, a, this.f1459l, nVar);
                            this.f1452e.setColor(-21965);
                            this.f1453f.setColor(-2067046);
                            this.f1456i.setColor(-2067046);
                            this.f1454g.setColor(-13391360);
                            int i5 = this.f1462o;
                            canvas.translate((float) (-i5), (float) (-i5));
                            mo2295a(canvas, a, this.f1459l, nVar);
                            if (a == 5) {
                                m1388a(canvas, nVar);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        /* renamed from: b */
        private void m1389b(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.f1459l; i++) {
                if (this.f1449b[i] == 1) {
                    z = true;
                }
                if (this.f1449b[i] == 2) {
                    z2 = true;
                }
            }
            if (z) {
                m1393d(canvas);
            }
            if (z2) {
                m1392c(canvas);
            }
        }

        /* renamed from: a */
        public void mo2295a(Canvas canvas, int i, int i2, C0361n nVar) {
            if (i == 4) {
                m1389b(canvas);
            }
            if (i == 2) {
                m1393d(canvas);
            }
            if (i == 3) {
                m1392c(canvas);
            }
            m1385a(canvas);
            m1391b(canvas, i, i2, nVar);
        }

        /* renamed from: b */
        private void m1390b(Canvas canvas, float f, float f2) {
            float[] fArr = this.f1448a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f3 - f5), (double) (f4 - f6));
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot((double) (f10 - f), (double) (f11 - f2));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb2 = sb.toString();
            mo2297a(sb2, this.f1455h);
            canvas.drawTextOnPath(sb2, path, (hypot2 / 2.0f) - ((float) (this.f1460m.width() / 2)), -20.0f, this.f1455h);
            canvas.drawLine(f, f2, f10, f11, this.f1454g);
        }

        /* renamed from: a */
        private void m1385a(Canvas canvas) {
            canvas.drawLines(this.f1448a, this.f1452e);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2297a(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.f1460m);
        }

        /* renamed from: a */
        private void m1386a(Canvas canvas, float f, float f2) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f1448a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            mo2297a(sb2, this.f1455h);
            canvas2.drawText(sb2, ((min2 / 2.0f) - ((float) (this.f1460m.width() / 2))) + min, f2 - 20.0f, this.f1455h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.f1454g);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f6 - f4))) + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            mo2297a(sb4, this.f1455h);
            canvas2.drawText(sb4, f + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f1460m.height() / 2))), this.f1455h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.f1454g);
        }

        /* renamed from: a */
        private void m1387a(Canvas canvas, float f, float f2, int i, int i2) {
            Canvas canvas2 = canvas;
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(((float) ((int) (((double) (((f - ((float) (i / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i)))) + 0.5d))) / 100.0f);
            String sb2 = sb.toString();
            mo2297a(sb2, this.f1455h);
            canvas2.drawText(sb2, ((f / 2.0f) - ((float) (this.f1460m.width() / 2))) + 0.0f, f2 - 20.0f, this.f1455h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.f1454g);
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(((float) ((int) (((double) (((f2 - ((float) (i2 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i2)))) + 0.5d))) / 100.0f);
            String sb4 = sb3.toString();
            mo2297a(sb4, this.f1455h);
            canvas2.drawText(sb4, f + 5.0f, 0.0f - ((f2 / 2.0f) - ((float) (this.f1460m.height() / 2))), this.f1455h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.f1454g);
        }

        /* renamed from: a */
        private void m1388a(Canvas canvas, C0361n nVar) {
            this.f1451d.reset();
            for (int i = 0; i <= 50; i++) {
                nVar.mo2344a(((float) i) / ((float) 50), this.f1457j, 0);
                Path path = this.f1451d;
                float[] fArr = this.f1457j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f1451d;
                float[] fArr2 = this.f1457j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f1451d;
                float[] fArr3 = this.f1457j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f1451d;
                float[] fArr4 = this.f1457j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f1451d.close();
            }
            this.f1452e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f1451d, this.f1452e);
            canvas.translate(-2.0f, -2.0f);
            this.f1452e.setColor(-65536);
            canvas.drawPath(this.f1451d, this.f1452e);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$c */
    class C0325c {

        /* renamed from: a */
        C0447g f1464a = new C0447g();

        /* renamed from: b */
        C0447g f1465b = new C0447g();

        /* renamed from: c */
        C0473c f1466c = null;

        /* renamed from: d */
        C0473c f1467d = null;

        /* renamed from: e */
        int f1468e;

        /* renamed from: f */
        int f1469f;

        C0325c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2300a(C0447g gVar, C0447g gVar2) {
            C0444f fVar;
            ArrayList Q = gVar.mo2496Q();
            HashMap hashMap = new HashMap();
            hashMap.put(gVar, gVar2);
            gVar2.mo2496Q().clear();
            gVar2.mo2500a((C0444f) gVar, hashMap);
            Iterator it = Q.iterator();
            while (it.hasNext()) {
                C0444f fVar2 = (C0444f) it.next();
                if (fVar2 instanceof C0436b) {
                    fVar = new C0436b();
                } else if (fVar2 instanceof C0451j) {
                    fVar = new C0451j();
                } else if (fVar2 instanceof C0449i) {
                    fVar = new C0449i();
                } else if (fVar2 instanceof Helper) {
                    fVar = new C0453k();
                } else {
                    fVar = new C0444f();
                }
                gVar2.add(fVar);
                hashMap.put(fVar2, fVar);
            }
            Iterator it2 = Q.iterator();
            while (it2.hasNext()) {
                C0444f fVar3 = (C0444f) it2.next();
                ((C0444f) hashMap.get(fVar3)).mo2500a(fVar3, hashMap);
            }
        }

        /* renamed from: b */
        public void mo2303b() {
            mo2304b(MotionLayout.this.f1406F, MotionLayout.this.f1407G);
            MotionLayout.this.m1368j();
        }

        /* renamed from: c */
        public void mo2305c(int i, int i2) {
            this.f1468e = i;
            this.f1469f = i2;
        }

        /* renamed from: b */
        public void mo2304b(int i, int i2) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            int mode2 = MeasureSpec.getMode(i2);
            int size2 = MeasureSpec.getSize(i2);
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.f1404D == motionLayout.getStartState()) {
                this.f1465b.mo2629a(optimizationLevel, mode, size, mode2, size2, 0, 0);
                if (this.f1466c != null) {
                    this.f1464a.mo2629a(optimizationLevel, mode, size, mode2, size2, 0, 0);
                    return;
                }
                return;
            }
            if (this.f1466c != null) {
                this.f1464a.mo2629a(optimizationLevel, mode, size, mode2, size2, 0, 0);
            }
            this.f1465b.mo2629a(optimizationLevel, mode, size, mode2, size2, 0, 0);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2301a(C0447g gVar, C0473c cVar, C0473c cVar2) {
            this.f1466c = cVar;
            this.f1467d = cVar2;
            this.f1464a.mo2630a(MotionLayout.this.f2082h.mo2623U());
            this.f1465b.mo2630a(MotionLayout.this.f2082h.mo2623U());
            this.f1464a.mo2679T();
            this.f1465b.mo2679T();
            mo2300a(MotionLayout.this.f2082h, this.f1464a);
            mo2300a(MotionLayout.this.f2082h, this.f1465b);
            if (cVar != null) {
                m1397a(this.f1464a, cVar);
            }
            m1397a(this.f1465b, cVar2);
            this.f1464a.mo2641e0();
            this.f1465b.mo2641e0();
        }

        /* renamed from: a */
        private void m1397a(C0447g gVar, C0473c cVar) {
            SparseArray sparseArray = new SparseArray();
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, gVar);
            Iterator it = gVar.mo2496Q().iterator();
            while (it.hasNext()) {
                C0444f fVar = (C0444f) it.next();
                sparseArray.put(((View) fVar.mo2578e()).getId(), fVar);
            }
            Iterator it2 = gVar.mo2496Q().iterator();
            while (it2.hasNext()) {
                C0444f fVar2 = (C0444f) it2.next();
                View view = (View) fVar2.mo2578e();
                cVar.mo2766a(view.getId(), (ConstraintLayout.LayoutParams) layoutParams);
                fVar2.mo2611u(cVar.mo2787e(view.getId()));
                fVar2.mo2594m(cVar.mo2762a(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cVar.mo2769a((ConstraintHelper) view, fVar2, (ConstraintLayout.LayoutParams) layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).mo2691a();
                    }
                }
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                } else {
                    layoutParams.resolveLayoutDirection(0);
                }
                MotionLayout.this.mo2706a(false, view, fVar2, layoutParams, sparseArray);
                if (cVar.mo2784d(view.getId()) == 1) {
                    fVar2.mo2608t(view.getVisibility());
                } else {
                    fVar2.mo2608t(cVar.mo2780c(view.getId()));
                }
            }
            Iterator it3 = gVar.mo2496Q().iterator();
            while (it3.hasNext()) {
                C0444f fVar3 = (C0444f) it3.next();
                if (fVar3 instanceof Helper) {
                    Helper helper = (Helper) fVar3;
                    helper.removeAllIds();
                    ((ConstraintHelper) fVar3.mo2578e()).mo2692a(gVar, helper, sparseArray);
                    if (helper instanceof C0461r) {
                        ((C0461r) helper).mo2496Q();
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0444f mo2298a(C0447g gVar, View view) {
            if (gVar.mo2578e() == view) {
                return gVar;
            }
            ArrayList Q = gVar.mo2496Q();
            int size = Q.size();
            for (int i = 0; i < size; i++) {
                C0444f fVar = (C0444f) Q.get(i);
                if (fVar.mo2578e() == view) {
                    return fVar;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo2299a() {
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.f1408H.clear();
            for (int i = 0; i < childCount; i++) {
                View childAt = MotionLayout.this.getChildAt(i);
                MotionLayout.this.f1408H.put(childAt, new C0361n(childAt));
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = MotionLayout.this.getChildAt(i2);
                C0361n nVar = (C0361n) MotionLayout.this.f1408H.get(childAt2);
                if (nVar != null) {
                    String str = ")";
                    String str2 = " (";
                    String str3 = "no widget for  ";
                    String str4 = "MotionLayout";
                    if (this.f1466c != null) {
                        C0444f a = mo2298a(this.f1464a, childAt2);
                        if (a != null) {
                            nVar.mo2354b(a, this.f1466c);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append(C0326a.m1406a());
                            sb.append(str3);
                            sb.append(C0326a.m1407a(childAt2));
                            sb.append(str2);
                            sb.append(childAt2.getClass().getName());
                            sb.append(str);
                            Log.e(str4, sb.toString());
                        }
                    }
                    C0444f a2 = mo2298a(this.f1465b, childAt2);
                    if (a2 != null) {
                        nVar.mo2348a(a2, this.f1467d);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C0326a.m1406a());
                        sb2.append(str3);
                        sb2.append(C0326a.m1407a(childAt2));
                        sb2.append(str2);
                        sb2.append(childAt2.getClass().getName());
                        sb2.append(str);
                        Log.e(str4, sb2.toString());
                    }
                }
            }
        }

        /* renamed from: a */
        public boolean mo2302a(int i, int i2) {
            return (i == this.f1468e && i2 == this.f1469f) ? false : true;
        }
    }

    public MotionLayout(Context context) {
        super(context);
        m1351a((AttributeSet) null);
    }

    /* renamed from: a */
    private static boolean m1353a(float f, float f2, float f3) {
        boolean z = true;
        if (f > 0.0f) {
            float f4 = f / f3;
            if (f2 + ((f * f4) - (((f3 * f4) * f4) / 2.0f)) <= 1.0f) {
                z = false;
            }
            return z;
        }
        float f5 = (-f) / f3;
        if (f2 + (f * f5) + (((f3 * f5) * f5) / 2.0f) >= 0.0f) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m1368j() {
        int childCount = getChildCount();
        this.f1440q0.mo2299a();
        boolean z = true;
        this.f1416P = true;
        int width = getWidth();
        int height = getHeight();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            C0361n nVar = (C0361n) this.f1408H.get(getChildAt(i2));
            if (nVar != null) {
                this.f1443z.mo2381a(nVar);
                nVar.mo2345a(width, height, this.f1410J);
            }
        }
        float i3 = this.f1443z.mo2395i();
        if (i3 != 0.0f) {
            boolean z2 = ((double) i3) < 0.0d;
            float abs = Math.abs(i3);
            float f = -3.4028235E38f;
            float f2 = Float.MAX_VALUE;
            int i4 = 0;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            while (true) {
                if (i4 >= childCount) {
                    z = false;
                    break;
                }
                C0361n nVar2 = (C0361n) this.f1408H.get(getChildAt(i4));
                if (!Float.isNaN(nVar2.f1630j)) {
                    break;
                }
                float b = nVar2.mo2352b();
                float c = nVar2.mo2355c();
                float f5 = z2 ? c - b : c + b;
                f3 = Math.min(f3, f5);
                f4 = Math.max(f4, f5);
                i4++;
            }
            if (z) {
                for (int i5 = 0; i5 < childCount; i5++) {
                    C0361n nVar3 = (C0361n) this.f1408H.get(getChildAt(i5));
                    if (!Float.isNaN(nVar3.f1630j)) {
                        f2 = Math.min(f2, nVar3.f1630j);
                        f = Math.max(f, nVar3.f1630j);
                    }
                }
                while (i < childCount) {
                    C0361n nVar4 = (C0361n) this.f1408H.get(getChildAt(i));
                    if (!Float.isNaN(nVar4.f1630j)) {
                        nVar4.f1632l = 1.0f / (1.0f - abs);
                        if (z2) {
                            nVar4.f1631k = abs - (((f - nVar4.f1630j) / (f - f2)) * abs);
                        } else {
                            nVar4.f1631k = abs - (((nVar4.f1630j - f2) * abs) / (f - f2));
                        }
                    }
                    i++;
                }
                return;
            }
            while (i < childCount) {
                C0361n nVar5 = (C0361n) this.f1408H.get(getChildAt(i));
                float b2 = nVar5.mo2352b();
                float c2 = nVar5.mo2355c();
                float f6 = z2 ? c2 - b2 : c2 + b2;
                nVar5.f1632l = 1.0f / (1.0f - abs);
                nVar5.f1631k = abs - (((f6 - f3) * abs) / (f4 - f3));
                i++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        String str;
        mo2254a(false);
        super.dispatchDraw(canvas);
        if (this.f1443z != null) {
            if ((this.f1420T & 1) == 1 && !isInEditMode()) {
                this.f1435l0++;
                long nanoTime = System.nanoTime();
                long j = this.f1436m0;
                if (j != -1) {
                    long j2 = nanoTime - j;
                    if (j2 > 200000000) {
                        this.f1437n0 = ((float) ((int) ((((float) this.f1435l0) / (((float) j2) * 1.0E-9f)) * 100.0f))) / 100.0f;
                        this.f1435l0 = 0;
                        this.f1436m0 = nanoTime;
                    }
                } else {
                    this.f1436m0 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                float progress = ((float) ((int) (getProgress() * 1000.0f))) / 10.0f;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f1437n0);
                sb.append(" fps ");
                sb.append(C0326a.m1408a(this, this.f1403C));
                sb.append(" -> ");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append(C0326a.m1408a(this, this.f1405E));
                sb3.append(" (progress: ");
                sb3.append(progress);
                sb3.append(" ) state=");
                int i = this.f1404D;
                if (i == -1) {
                    str = "undefined";
                } else {
                    str = C0326a.m1408a(this, i);
                }
                sb3.append(str);
                String sb4 = sb3.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb4, 11.0f, (float) (getHeight() - 29), paint);
                paint.setColor(-7864184);
                canvas.drawText(sb4, 10.0f, (float) (getHeight() - 30), paint);
            }
            if (this.f1420T > 1) {
                if (this.f1421U == null) {
                    this.f1421U = new C0324b();
                }
                this.f1421U.mo2296a(canvas, this.f1408H, this.f1443z.mo2388c(), this.f1420T);
            }
        }
    }

    public int[] getConstraintSetIds() {
        C0364q qVar = this.f1443z;
        if (qVar == null) {
            return null;
        }
        return qVar.mo2383a();
    }

    public int getCurrentState() {
        return this.f1404D;
    }

    public ArrayList<C0366b> getDefinedTransitions() {
        C0364q qVar = this.f1443z;
        if (qVar == null) {
            return null;
        }
        return qVar.mo2384b();
    }

    public C0327b getDesignTool() {
        if (this.f1425b0 == null) {
            this.f1425b0 = new C0327b(this);
        }
        return this.f1425b0;
    }

    public int getEndState() {
        return this.f1405E;
    }

    public float getProgress() {
        return this.f1412L;
    }

    public int getStartState() {
        return this.f1403C;
    }

    public float getTargetPosition() {
        return this.f1414N;
    }

    public long getTransitionTimeMs() {
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            this.f1410J = ((float) qVar.mo2388c()) / 1000.0f;
        }
        return ((long) this.f1410J) * 1000;
    }

    public float getVelocity() {
        Interpolator interpolator = this.f1401A;
        if (interpolator == null) {
            return this.f1402B;
        }
        if (interpolator instanceof C0362o) {
            return ((C0362o) interpolator).mo2292a();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            int i = this.f1404D;
            if (i != -1) {
                C0473c a = qVar.mo2374a(i);
                this.f1443z.mo2379a(this);
                if (a != null) {
                    a.mo2779b((ConstraintLayout) this);
                }
            }
        }
        m1364h();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1443z == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!(this.f1426c0 == i5 && this.f1427d0 == i6)) {
            mo2248a();
            mo2254a(true);
        }
        this.f1426c0 = i5;
        this.f1427d0 = i6;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1443z == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = (this.f1406F == i && this.f1407G == i2) ? false : true;
        if (this.f1441r0) {
            this.f1441r0 = false;
            m1364h();
            m1367i();
            z = true;
        }
        if (this.f2087m) {
            z = true;
        }
        this.f1406F = i;
        this.f1407G = i2;
        int j = this.f1443z.mo2396j();
        int d = this.f1443z.mo2390d();
        if (z || this.f1440q0.mo2302a(j, d)) {
            super.onMeasure(i, i2);
            this.f1440q0.mo2301a(this.f2082h, this.f1443z.mo2374a(j), this.f1443z.mo2374a(d));
            this.f1440q0.mo2303b();
            this.f1440q0.mo2305c(j, d);
        } else {
            setMeasuredDimension(this.f2082h.mo2525A() + getPaddingLeft() + getPaddingRight(), this.f2082h.mo2589k() + getPaddingTop() + getPaddingBottom());
        }
        m1359e();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            if (qVar == null || !qVar.mo2394h() || this.f1411K != 1.0f || !view.canScrollVertically(-1)) {
                float f = this.f1411K;
                long nanoTime = System.nanoTime();
                float f2 = (float) i;
                this.f1428e0 = f2;
                float f3 = (float) i2;
                this.f1429f0 = f3;
                this.f1431h0 = (float) (((double) (nanoTime - this.f1430g0)) * 1.0E-9d);
                this.f1430g0 = nanoTime;
                this.f1443z.mo2376a(f2, f3);
                if (f != this.f1411K) {
                    iArr[0] = i;
                    iArr[1] = i2;
                }
                mo2254a(false);
            }
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return true;
    }

    public void onStopNestedScroll(View view, int i) {
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            float f = this.f1428e0;
            float f2 = this.f1431h0;
            qVar.mo2386b(f / f2, this.f1429f0 / f2);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0364q qVar = this.f1443z;
        if (qVar == null || !qVar.mo2398l()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f1443z.mo2378a(motionEvent, getCurrentState(), this);
        return true;
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (motionHelper.mo2247c()) {
                if (this.f1433j0 == null) {
                    this.f1433j0 = new ArrayList<>();
                }
                this.f1433j0.add(motionHelper);
            }
            if (motionHelper.mo2246b()) {
                if (this.f1434k0 == null) {
                    this.f1434k0 = new ArrayList<>();
                }
                this.f1434k0.add(motionHelper);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f1433j0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f1434k0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void setDebugMode(int i) {
        this.f1420T = i;
        invalidate();
    }

    public void setInterpolatedProgress(float f) {
        if (f <= 0.0f) {
            this.f1404D = this.f1403C;
        } else if (f >= 1.0f) {
            this.f1404D = this.f1405E;
        } else {
            this.f1404D = -1;
        }
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            qVar.mo2396j();
            this.f1443z.mo2390d();
            this.f1414N = this.f1443z.mo2391e().getInterpolation(f);
            this.f1411K = this.f1414N;
            this.f1409I = -1;
            this.f1401A = null;
            this.f1415O = true;
            this.f1413M = System.nanoTime();
            this.f1416P = true;
            invalidate();
        }
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.f1434k0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.f1434k0.get(i)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.f1433j0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((MotionHelper) this.f1433j0.get(i)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f <= 0.0f) {
            this.f1404D = this.f1403C;
        } else if (f >= 1.0f) {
            this.f1404D = this.f1405E;
        } else {
            this.f1404D = -1;
        }
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            qVar.mo2396j();
            this.f1443z.mo2390d();
            this.f1414N = f;
            this.f1411K = f;
            this.f1409I = -1;
            this.f1401A = null;
            this.f1415O = true;
            this.f1413M = System.nanoTime();
            this.f1416P = true;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void setTransition(C0366b bVar) {
        this.f1443z.mo2382a(bVar);
        if (this.f1404D == this.f1443z.mo2390d()) {
            this.f1412L = 1.0f;
            this.f1411K = 1.0f;
            this.f1414N = 1.0f;
        } else {
            this.f1412L = 0.0f;
            this.f1411K = 0.0f;
            this.f1414N = 0.0f;
        }
        this.f1413M = System.nanoTime();
        int j = this.f1443z.mo2396j();
        int d = this.f1443z.mo2390d();
        if (j != this.f1403C || d != this.f1405E) {
            this.f1403C = j;
            this.f1405E = d;
            this.f1443z.mo2377a(this.f1403C, this.f1405E);
            this.f1440q0.mo2301a(this.f2082h, this.f1443z.mo2374a(this.f1403C), this.f1443z.mo2374a(this.f1405E));
            this.f1440q0.mo2305c(this.f1403C, this.f1405E);
            this.f1440q0.mo2303b();
            mo2248a();
            TransitionListener transitionListener = this.f1417Q;
            if (transitionListener != null) {
                transitionListener.onTransitionStarted(this, this.f1403C, this.f1405E);
            }
        }
    }

    public void setTransitionDuration(int i) {
        C0364q qVar = this.f1443z;
        if (qVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
        } else {
            qVar.mo2389c(i);
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.f1417Q = transitionListener;
    }

    /* renamed from: d */
    private void m1357d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0361n nVar = (C0361n) this.f1408H.get(childAt);
            if (nVar != null) {
                nVar.mo2346a(childAt);
            }
        }
    }

    /* renamed from: e */
    private void m1359e() {
        boolean z;
        float signum = Math.signum(this.f1414N - this.f1412L);
        long nanoTime = System.nanoTime();
        float f = this.f1412L + (!(this.f1401A instanceof C7595g) ? ((((float) (nanoTime - this.f1413M)) * signum) * 1.0E-9f) / this.f1410J : 0.0f);
        if (this.f1415O) {
            f = this.f1414N;
        }
        int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i <= 0 || f < this.f1414N) && (signum > 0.0f || f > this.f1414N)) {
            z = false;
        } else {
            f = this.f1414N;
            z = true;
        }
        Interpolator interpolator = this.f1401A;
        if (interpolator != null && !z) {
            if (this.f1422V) {
                f = interpolator.getInterpolation(((float) (nanoTime - this.f1409I)) * 1.0E-9f);
            } else {
                f = interpolator.getInterpolation(f);
            }
        }
        if ((i > 0 && f >= this.f1414N) || (signum <= 0.0f && f <= this.f1414N)) {
            f = this.f1414N;
        }
        int childCount = getChildCount();
        long nanoTime2 = System.nanoTime();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0361n nVar = (C0361n) this.f1408H.get(childAt);
            if (nVar != null) {
                nVar.mo2351a(childAt, f, nanoTime2);
            }
        }
    }

    /* renamed from: f */
    private void m1361f() {
        TransitionListener transitionListener = this.f1417Q;
        if (transitionListener != null && this.f1439p0 != this.f1411K) {
            if (this.f1438o0 != -1) {
                transitionListener.onTransitionStarted(this, this.f1403C, this.f1405E);
            }
            this.f1438o0 = -1;
            float f = this.f1411K;
            this.f1439p0 = f;
            this.f1417Q.onTransitionChange(this, this.f1403C, this.f1405E, f);
        }
    }

    /* renamed from: g */
    private void m1363g() {
        if (this.f1417Q != null) {
            int i = -1;
            if (this.f1438o0 == -1) {
                this.f1438o0 = this.f1404D;
                if (!this.f1442s0.isEmpty()) {
                    ArrayList<Integer> arrayList = this.f1442s0;
                    i = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
                }
                int i2 = this.f1404D;
                if (i != i2) {
                    this.f1442s0.add(Integer.valueOf(i2));
                }
            }
        }
    }

    /* renamed from: h */
    private void m1364h() {
        C0364q qVar = this.f1443z;
        if (qVar != null && !qVar.mo2387b(this, this.f1404D)) {
            int i = this.f1404D;
            if (i != -1) {
                this.f1443z.mo2380a(this, i);
            }
            if (this.f1443z.mo2398l()) {
                this.f1443z.mo2397k();
            }
        }
    }

    /* renamed from: i */
    private void m1367i() {
        if (this.f1417Q != null) {
            Iterator it = this.f1442s0.iterator();
            while (it.hasNext()) {
                this.f1417Q.onTransitionCompleted(this, ((Integer) it.next()).intValue());
            }
            this.f1442s0.clear();
        }
    }

    /* renamed from: b */
    public void mo2258b(int i, int i2) {
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            this.f1403C = i;
            this.f1405E = i2;
            qVar.mo2377a(i, i2);
            this.f1440q0.mo2301a(this.f2082h, this.f1443z.mo2374a(i), this.f1443z.mo2374a(i2));
            mo2248a();
            this.f1412L = 0.0f;
            mo2260c();
        }
    }

    /* renamed from: c */
    public void mo2260c() {
        mo2249a(0.0f);
    }

    /* renamed from: c */
    public void mo2261c(int i) {
        mo2259b(i, -1, -1);
    }

    /* renamed from: a */
    public void mo2252a(int i, int i2, int i3) {
        this.f1404D = i;
        this.f1403C = -1;
        this.f1405E = -1;
        C0470b bVar = this.f2090p;
        if (bVar != null) {
            bVar.mo2757a(i, (float) i2, (float) i3);
            return;
        }
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            qVar.mo2374a(i).mo2779b((ConstraintLayout) this);
        }
    }

    /* renamed from: b */
    public void mo2256b() {
        mo2249a(1.0f);
    }

    /* renamed from: a */
    public void mo2250a(int i, float f, float f2) {
        if (this.f1443z != null && this.f1412L != f) {
            this.f1422V = true;
            this.f1409I = System.nanoTime();
            this.f1410J = ((float) this.f1443z.mo2388c()) / 1000.0f;
            this.f1414N = f;
            this.f1416P = true;
            float f3 = 1.0f;
            if (i == 0 || i == 1 || i == 2) {
                if (i == 1) {
                    f = 0.0f;
                } else if (i == 2) {
                    f = 1.0f;
                }
                this.f1423W.mo19654a(this.f1412L, f, f2, this.f1410J, this.f1443z.mo2392f(), this.f1443z.mo2393g());
                int i2 = this.f1404D;
                if (f != 0.0f) {
                    f3 = 0.0f;
                }
                setProgress(f3);
                this.f1404D = i2;
                this.f1401A = this.f1423W;
            } else if (i != 3) {
                if (i == 4) {
                    this.f1424a0.mo2293a(f2, this.f1412L, this.f1443z.mo2392f());
                    this.f1401A = this.f1424a0;
                } else if (i == 5) {
                    if (m1353a(f2, this.f1412L, this.f1443z.mo2392f())) {
                        this.f1424a0.mo2293a(f2, this.f1412L, this.f1443z.mo2392f());
                        this.f1401A = this.f1424a0;
                    } else {
                        this.f1423W.mo19654a(this.f1412L, f, f2, this.f1410J, this.f1443z.mo2392f(), this.f1443z.mo2393g());
                        this.f1402B = 0.0f;
                        int i3 = this.f1404D;
                        if (f != 0.0f) {
                            f3 = 0.0f;
                        }
                        setProgress(f3);
                        this.f1404D = i3;
                        this.f1401A = this.f1423W;
                    }
                }
            }
            this.f1415O = false;
            this.f1409I = System.nanoTime();
            invalidate();
        }
    }

    /* renamed from: b */
    public void mo2259b(int i, int i2, int i3) {
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            C0482g gVar = qVar.f1663b;
            if (gVar != null) {
                int a = gVar.mo2800a(this.f1404D, i, (float) i2, (float) i3);
                if (a != -1) {
                    i = a;
                }
            }
        }
        int i4 = this.f1404D;
        if (i4 != i) {
            if (this.f1403C == i) {
                mo2249a(0.0f);
            } else if (this.f1405E == i) {
                mo2249a(1.0f);
            } else {
                this.f1405E = i;
                if (i4 != -1) {
                    mo2258b(i4, i);
                    mo2249a(1.0f);
                    this.f1412L = 0.0f;
                    mo2256b();
                    return;
                }
                this.f1422V = false;
                this.f1414N = 1.0f;
                this.f1411K = 0.0f;
                this.f1412L = 0.0f;
                this.f1413M = System.nanoTime();
                this.f1409I = System.nanoTime();
                this.f1415O = false;
                this.f1401A = null;
                this.f1410J = ((float) this.f1443z.mo2388c()) / 1000.0f;
                this.f1443z.mo2396j();
                int childCount = getChildCount();
                this.f1408H.clear();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    this.f1408H.put(childAt, new C0361n(childAt));
                }
                this.f1416P = true;
                this.f1440q0.mo2301a(this.f2082h, null, this.f1443z.mo2374a(i));
                mo2248a();
                this.f1440q0.mo2299a();
                m1357d();
                int width = getWidth();
                int height = getHeight();
                for (int i6 = 0; i6 < childCount; i6++) {
                    C0361n nVar = (C0361n) this.f1408H.get(getChildAt(i6));
                    this.f1443z.mo2381a(nVar);
                    nVar.mo2345a(width, height, this.f1410J);
                }
                float i7 = this.f1443z.mo2395i();
                if (i7 != 0.0f) {
                    float f = Float.MAX_VALUE;
                    float f2 = -3.4028235E38f;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        C0361n nVar2 = (C0361n) this.f1408H.get(getChildAt(i8));
                        float c = nVar2.mo2355c() + nVar2.mo2352b();
                        f = Math.min(f, c);
                        f2 = Math.max(f2, c);
                    }
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C0361n nVar3 = (C0361n) this.f1408H.get(getChildAt(i9));
                        float b = nVar3.mo2352b();
                        float c2 = nVar3.mo2355c();
                        nVar3.f1632l = 1.0f / (1.0f - i7);
                        nVar3.f1631k = i7 - ((((b + c2) - f) * i7) / (f2 - f));
                    }
                }
                this.f1411K = 0.0f;
                this.f1412L = 0.0f;
                this.f1416P = true;
                invalidate();
            }
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1351a(attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2249a(float f) {
        C0364q qVar = this.f1443z;
        if (qVar != null) {
            float f2 = this.f1412L;
            if (f2 != f) {
                this.f1422V = false;
                this.f1414N = f;
                this.f1410J = ((float) qVar.mo2388c()) / 1000.0f;
                setProgress(this.f1414N);
                this.f1401A = this.f1443z.mo2391e();
                this.f1415O = false;
                this.f1409I = System.nanoTime();
                this.f1416P = true;
                this.f1411K = f2;
                this.f1412L = f2;
                invalidate();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2255a(C0366b bVar) {
        TransitionListener transitionListener = this.f1417Q;
        if (transitionListener != null) {
            return transitionListener.allowsTransition(bVar);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2254a(boolean z) {
        boolean z2;
        float f = this.f1412L;
        if (f > 0.0f && f < 1.0f) {
            this.f1404D = -1;
        }
        boolean z3 = false;
        if (this.f1432i0 || (this.f1416P && (z || this.f1414N != this.f1412L))) {
            float signum = Math.signum(this.f1414N - this.f1412L);
            long nanoTime = System.nanoTime();
            float f2 = this.f1412L + (!(this.f1401A instanceof C7595g) ? ((((float) (nanoTime - this.f1413M)) * signum) * 1.0E-9f) / this.f1410J : 0.0f);
            if (this.f1415O) {
                f2 = this.f1414N;
            }
            int i = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i <= 0 || f2 < this.f1414N) && (signum > 0.0f || f2 > this.f1414N)) {
                z2 = false;
            } else {
                f2 = this.f1414N;
                this.f1416P = false;
                z2 = true;
            }
            this.f1412L = f2;
            this.f1413M = nanoTime;
            if (this.f1417Q != null) {
                m1361f();
            }
            Interpolator interpolator = this.f1401A;
            if (interpolator != null && !z2) {
                if (this.f1422V) {
                    f2 = interpolator.getInterpolation(((float) (nanoTime - this.f1409I)) * 1.0E-9f);
                    this.f1412L = f2;
                    this.f1413M = nanoTime;
                    Interpolator interpolator2 = this.f1401A;
                    if ((interpolator2 instanceof C0362o) && Math.abs(((C0362o) interpolator2).mo2292a()) <= 1.0E-4f) {
                        this.f1416P = false;
                    }
                } else {
                    f2 = interpolator.getInterpolation(f2);
                }
            }
            if ((i > 0 && f2 >= this.f1414N) || (signum <= 0.0f && f2 <= this.f1414N)) {
                f2 = this.f1414N;
                this.f1416P = false;
            }
            if (f2 >= 1.0f || f2 <= 0.0f) {
                this.f1416P = false;
            }
            int childCount = getChildCount();
            this.f1432i0 = false;
            long nanoTime2 = System.nanoTime();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0361n nVar = (C0361n) this.f1408H.get(childAt);
                if (nVar != null) {
                    this.f1432i0 = nVar.mo2351a(childAt, f2, nanoTime2) | this.f1432i0;
                }
            }
            if (this.f1432i0) {
                invalidate();
            }
            if (this.f1416P) {
                invalidate();
            }
            if (f2 <= 0.0f) {
                int i3 = this.f1403C;
                if (i3 != -1) {
                    if (this.f1404D != i3) {
                        z3 = true;
                    }
                    int i4 = this.f1403C;
                    this.f1404D = i4;
                    this.f1443z.mo2374a(i4).mo2770a((ConstraintLayout) this);
                }
            }
            if (((double) f2) >= 1.0d) {
                if (this.f1404D != this.f1405E) {
                    z3 = true;
                }
                int i5 = this.f1405E;
                this.f1404D = i5;
                this.f1443z.mo2374a(i5).mo2770a((ConstraintLayout) this);
            }
        }
        float f3 = this.f1412L;
        if (f3 >= 1.0f) {
            if (this.f1404D != this.f1405E) {
                z3 = true;
            }
            this.f1404D = this.f1405E;
        } else if (f3 <= 0.0f) {
            if (this.f1404D != this.f1403C) {
                z3 = true;
            }
            this.f1404D = this.f1403C;
        }
        this.f1441r0 |= z3;
        if (VERSION.SDK_INT >= 18 && z3 && !isInLayout()) {
            requestLayout();
        }
        if (z3) {
            m1363g();
        }
        this.f1411K = this.f1412L;
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1351a(attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2257b(int i) {
        this.f2090p = null;
    }

    /* renamed from: a */
    private void m1351a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0481f.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.MotionLayout_layoutDescription) {
                    this.f1443z = new C0364q(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0481f.MotionLayout_currentState) {
                    this.f1404D = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0481f.MotionLayout_motionProgress) {
                    this.f1414N = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f1416P = true;
                } else if (index == C0481f.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == C0481f.MotionLayout_showPaths) {
                    if (this.f1420T == 0) {
                        this.f1420T = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == C0481f.MotionLayout_motionDebug) {
                    this.f1420T = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.f1443z == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.f1443z = null;
            }
        }
        if (this.f1404D == -1) {
            C0364q qVar = this.f1443z;
            if (qVar != null) {
                this.f1404D = qVar.mo2396j();
                this.f1403C = this.f1443z.mo2396j();
                this.f1405E = this.f1443z.mo2390d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2251a(int i, float f, float f2, float f3, float[] fArr) {
        String str;
        HashMap<View, C0361n> hashMap = this.f1408H;
        View a = mo2701a(i);
        C0361n nVar = (C0361n) hashMap.get(a);
        if (nVar != null) {
            nVar.mo2343a(f, f2, f3, fArr);
            float y = a.getY();
            int i2 = ((f - this.f1418R) > 0.0f ? 1 : ((f - this.f1418R) == 0.0f ? 0 : -1));
            this.f1418R = f;
            this.f1419S = y;
            return;
        }
        if (a == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            str = sb.toString();
        } else {
            str = a.getContext().getResources().getResourceName(i);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("WARNING could not find view id ");
        sb2.append(str);
        Log.w("MotionLayout", sb2.toString());
    }

    /* renamed from: a */
    public void mo2253a(int i, boolean z, float f) {
        TransitionListener transitionListener = this.f1417Q;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i, z, f);
        }
    }

    /* renamed from: a */
    public void mo2248a() {
        this.f1440q0.mo2303b();
        invalidate();
    }
}
