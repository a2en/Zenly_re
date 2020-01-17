package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import androidx.constraintlayout.solver.widgets.C0447g;
import androidx.constraintlayout.solver.widgets.C0451j;
import androidx.constraintlayout.solver.widgets.C0454l;
import androidx.constraintlayout.solver.widgets.C0461r;
import androidx.constraintlayout.solver.widgets.Helper;
import java.util.ArrayList;
import java.util.Iterator;
import p214e.p229f.p232b.C7600e;
import p214e.p229f.p232b.C7602f;

public class BasicMeasure {

    /* renamed from: a */
    private final ArrayList<C0444f> f1763a = new ArrayList<>();

    /* renamed from: b */
    private C0447g f1764b;

    public interface Measurer {
        boolean deprecatedMeasure(C0444f fVar);

        void didMeasures();

        void measure(C0444f fVar, C0419a aVar);

        void measure(C0444f fVar, C0446b bVar, int i, C0446b bVar2, int i2);
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure$a */
    public static class C0419a {

        /* renamed from: a */
        public C0446b f1765a;

        /* renamed from: b */
        public C0446b f1766b;

        /* renamed from: c */
        public int f1767c;

        /* renamed from: d */
        public int f1768d;

        /* renamed from: e */
        public int f1769e;

        /* renamed from: f */
        public int f1770f;

        /* renamed from: g */
        public int f1771g;
    }

    public BasicMeasure(C0447g gVar) {
        this.f1764b = gVar;
    }

    /* renamed from: b */
    private void m1834b(C0447g gVar) {
        int size = gVar.f2067J0.size();
        Measurer U = gVar.mo2623U();
        for (int i = 0; i < size; i++) {
            C0444f fVar = (C0444f) gVar.f2067J0.get(i);
            if (!(fVar instanceof C0451j) && (!fVar.f1920d.f1815e.f1789j || !fVar.f1922e.f1815e.f1789j)) {
                C0446b c = fVar.mo2568c(0);
                boolean z = true;
                C0446b c2 = fVar.mo2568c(1);
                C0446b bVar = C0446b.MATCH_CONSTRAINT;
                if (c != bVar || fVar.f1934k == 1 || c2 != bVar || fVar.f1936l == 1) {
                    z = false;
                }
                if (!z) {
                    U.measure(fVar, fVar.mo2595n(), fVar.mo2525A(), fVar.mo2618y(), fVar.mo2589k());
                }
            }
        }
        U.didMeasures();
    }

    /* renamed from: a */
    public void mo2454a(C0447g gVar) {
        this.f1763a.clear();
        int size = gVar.f2067J0.size();
        for (int i = 0; i < size; i++) {
            C0444f fVar = (C0444f) gVar.f2067J0.get(i);
            if (fVar.mo2595n() == C0446b.MATCH_CONSTRAINT || fVar.mo2595n() == C0446b.MATCH_PARENT || fVar.mo2618y() == C0446b.MATCH_CONSTRAINT || fVar.mo2618y() == C0446b.MATCH_PARENT) {
                this.f1763a.add(fVar);
            }
        }
        gVar.mo2626X();
    }

    /* renamed from: a */
    private void m1833a(String str) {
        this.f1764b.mo2622S();
    }

    /* renamed from: a */
    public void mo2455a(C0447g gVar, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8;
        boolean z;
        boolean z2;
        Measurer measurer;
        int i9;
        boolean z3;
        int i10;
        C0447g gVar2 = gVar;
        int i11 = i;
        int i12 = i2;
        int i13 = i4;
        Measurer U = gVar.mo2623U();
        int size = gVar2.f2067J0.size();
        int A = gVar.mo2525A();
        int k = gVar.mo2589k();
        boolean a = C0454l.m2106a(i11, 128);
        boolean z4 = a || C0454l.m2106a(i11, 64);
        if (z4) {
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    break;
                }
                C0444f fVar = (C0444f) gVar2.f2067J0.get(i14);
                boolean z5 = (fVar.mo2595n() == C0446b.MATCH_CONSTRAINT) && (fVar.mo2618y() == C0446b.MATCH_CONSTRAINT) && fVar.mo2581g() > 0.0f;
                if ((!fVar.mo2532H() || !z5) && (!fVar.mo2533I() || !z5)) {
                    i14++;
                }
            }
            z4 = false;
        }
        if (z4) {
            C7602f fVar2 = C7600e.f19121r;
            if (fVar2 != null) {
                fVar2.f19141a++;
            }
        }
        if (z4 && (i12 == 1073741824 && i13 == 1073741824)) {
            if (i12 == 1073741824 && i13 == 1073741824) {
                z = gVar2.mo2638d(a);
                i8 = 2;
            } else {
                int D = gVar.mo2528D();
                int E = gVar.mo2529E();
                z = gVar2.mo2640e(a);
                if (i12 == 1073741824) {
                    z &= gVar2.mo2633a(a, 0);
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if (i13 == 1073741824) {
                    z &= gVar2.mo2633a(a, 1);
                    i8++;
                }
                gVar2.mo2617x(D);
                gVar2.mo2619y(E);
            }
            if (z) {
                gVar2.mo2555a(i12 == 1073741824, i13 == 1073741824);
            }
        } else {
            gVar2.f1920d.mo2463c();
            gVar2.f1922e.mo2463c();
            Iterator it = gVar.mo2496Q().iterator();
            while (it.hasNext()) {
                C0444f fVar3 = (C0444f) it.next();
                fVar3.f1920d.mo2463c();
                fVar3.f1922e.mo2463c();
            }
            z = false;
            i8 = 0;
        }
        if (!z || i8 != 2) {
            if (size > 0) {
                m1834b(gVar);
            }
            int V = gVar.mo2624V();
            gVar2.mo2621A(64);
            if (size > 0) {
                m1833a("First pass");
            }
            int size2 = this.f1763a.size();
            if (size2 > 0) {
                boolean z6 = gVar.mo2595n() == C0446b.WRAP_CONTENT;
                boolean z7 = gVar.mo2618y() == C0446b.WRAP_CONTENT;
                int max = Math.max(gVar.mo2525A(), this.f1764b.mo2599p());
                int max2 = Math.max(gVar.mo2589k(), this.f1764b.mo2597o());
                int i15 = 0;
                boolean z8 = false;
                while (i15 < size2) {
                    C0444f fVar4 = (C0444f) this.f1763a.get(i15);
                    if ((!(fVar4 instanceof Helper) || (fVar4 instanceof C0461r)) && !(fVar4 instanceof C0451j) && fVar4.mo2620z() != 8 && (!fVar4.f1920d.f1815e.f1789j || !fVar4.f1922e.f1815e.f1789j)) {
                        int A2 = fVar4.mo2525A();
                        int k2 = fVar4.mo2589k();
                        i9 = size2;
                        int c = fVar4.mo2567c();
                        boolean deprecatedMeasure = z8 | U.deprecatedMeasure(fVar4);
                        measurer = U;
                        int A3 = fVar4.mo2525A();
                        boolean z9 = deprecatedMeasure;
                        int k3 = fVar4.mo2589k();
                        if (A3 != A2) {
                            fVar4.mo2611u(A3);
                            if (z6 && fVar4.mo2607t() > max) {
                                max = Math.max(max, fVar4.mo2607t() + fVar4.mo2539a(C0443d.RIGHT).mo2514b());
                            }
                            i10 = max;
                            z3 = true;
                        } else {
                            i10 = max;
                            z3 = z9;
                        }
                        if (k3 != k2) {
                            fVar4.mo2594m(k3);
                            if (z7 && fVar4.mo2573d() > max2) {
                                max2 = Math.max(max2, fVar4.mo2573d() + fVar4.mo2539a(C0443d.BOTTOM).mo2514b());
                            }
                            z3 = true;
                        }
                        if (fVar4.mo2530F() && c != fVar4.mo2567c()) {
                            z3 = true;
                        }
                        z8 = fVar4 instanceof C0461r ? ((C0461r) fVar4).mo2676V() | z3 : z3;
                        max = i10;
                    } else {
                        i9 = size2;
                        measurer = U;
                    }
                    i15++;
                    size2 = i9;
                    U = measurer;
                }
                if (z8) {
                    gVar2.mo2611u(A);
                    gVar2.mo2594m(k);
                    m1833a("2nd pass");
                    if (gVar.mo2525A() < max) {
                        gVar2.mo2611u(max);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (gVar.mo2589k() < max2) {
                        gVar2.mo2594m(max2);
                        z2 = true;
                    }
                    if (z2) {
                        m1833a("3rd pass");
                    }
                }
            }
            gVar2.mo2621A(V);
        }
    }
}
