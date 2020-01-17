package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0439e;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import androidx.constraintlayout.solver.widgets.C0447g;
import androidx.constraintlayout.solver.widgets.C0451j;
import androidx.constraintlayout.solver.widgets.C0453k;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.c */
public class C0422c {

    /* renamed from: a */
    private C0447g f1774a;

    /* renamed from: b */
    private boolean f1775b = true;

    /* renamed from: c */
    private C0447g f1776c;

    /* renamed from: d */
    private ArrayList<C0433k> f1777d = new ArrayList<>();

    /* renamed from: e */
    private Measurer f1778e;

    /* renamed from: f */
    ArrayList<C0430i> f1779f;

    public C0422c(C0447g gVar) {
        new ArrayList();
        this.f1778e = null;
        this.f1779f = new ArrayList<>();
        this.f1774a = gVar;
        this.f1776c = gVar;
    }

    /* renamed from: a */
    public void mo2468a(Measurer measurer) {
        this.f1778e = measurer;
    }

    /* renamed from: b */
    public boolean mo2473b(boolean z) {
        if (this.f1775b) {
            Iterator it = this.f1774a.f2067J0.iterator();
            while (it.hasNext()) {
                C0444f fVar = (C0444f) it.next();
                fVar.f1914a = false;
                C0428h hVar = fVar.f1920d;
                hVar.f1815e.f1789j = false;
                hVar.f1817g = false;
                hVar.mo2479f();
                C0431j jVar = fVar.f1922e;
                jVar.f1815e.f1789j = false;
                jVar.f1817g = false;
                jVar.mo2483f();
            }
            C0447g gVar = this.f1774a;
            gVar.f1914a = false;
            C0428h hVar2 = gVar.f1920d;
            hVar2.f1815e.f1789j = false;
            hVar2.f1817g = false;
            hVar2.mo2479f();
            C0431j jVar2 = this.f1774a.f1922e;
            jVar2.f1815e.f1789j = false;
            jVar2.f1817g = false;
            jVar2.mo2483f();
            mo2467a();
        }
        if (m1848a(this.f1776c)) {
            return false;
        }
        this.f1774a.mo2617x(0);
        this.f1774a.mo2619y(0);
        this.f1774a.f1920d.f1818h.mo2476a(0);
        this.f1774a.f1922e.f1818h.mo2476a(0);
        return true;
    }

    /* renamed from: c */
    public void mo2474c() {
        Iterator it = this.f1774a.f2067J0.iterator();
        while (it.hasNext()) {
            C0444f fVar = (C0444f) it.next();
            if (!fVar.f1914a) {
                C0446b[] bVarArr = fVar.f1899L;
                boolean z = false;
                C0446b bVar = bVarArr[0];
                C0446b bVar2 = bVarArr[1];
                int i = fVar.f1934k;
                int i2 = fVar.f1936l;
                boolean z2 = bVar == C0446b.WRAP_CONTENT || (bVar == C0446b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == C0446b.WRAP_CONTENT || (bVar2 == C0446b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C0425e eVar = fVar.f1920d.f1815e;
                boolean z3 = eVar.f1789j;
                C0425e eVar2 = fVar.f1922e.f1815e;
                boolean z4 = eVar2.f1789j;
                if (z3 && z4) {
                    Measurer measurer = this.f1778e;
                    C0446b bVar3 = C0446b.FIXED;
                    measurer.measure(fVar, bVar3, eVar.f1786g, bVar3, eVar2.f1786g);
                    fVar.f1914a = true;
                } else if (z3 && z) {
                    this.f1778e.measure(fVar, C0446b.FIXED, fVar.f1920d.f1815e.f1786g, C0446b.WRAP_CONTENT, fVar.f1922e.f1815e.f1786g);
                    if (bVar2 == C0446b.MATCH_CONSTRAINT) {
                        fVar.f1922e.f1815e.f1801m = fVar.mo2589k();
                    } else {
                        fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                        fVar.f1914a = true;
                    }
                } else if (z4 && z2) {
                    this.f1778e.measure(fVar, C0446b.WRAP_CONTENT, fVar.f1920d.f1815e.f1786g, C0446b.FIXED, fVar.f1922e.f1815e.f1786g);
                    if (bVar == C0446b.MATCH_CONSTRAINT) {
                        fVar.f1920d.f1815e.f1801m = fVar.mo2525A();
                    } else {
                        fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                        fVar.f1914a = true;
                    }
                }
                if (fVar.f1914a) {
                    C0425e eVar3 = fVar.f1922e.f1809l;
                    if (eVar3 != null) {
                        eVar3.mo2476a(fVar.mo2567c());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private int m1845a(C0447g gVar, int i) {
        int size = this.f1779f.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, ((C0430i) this.f1779f.get(i2)).mo2481a(gVar, i));
        }
        return (int) j;
    }

    /* renamed from: a */
    public boolean mo2470a(boolean z) {
        boolean z2;
        boolean z3 = z & true;
        boolean z4 = false;
        if (this.f1775b) {
            Iterator it = this.f1774a.f2067J0.iterator();
            while (it.hasNext()) {
                C0444f fVar = (C0444f) it.next();
                fVar.f1914a = false;
                C0428h hVar = fVar.f1920d;
                hVar.f1815e.f1789j = false;
                C0431j jVar = fVar.f1922e;
                jVar.f1815e.f1789j = false;
                hVar.f1817g = false;
                jVar.f1817g = false;
                hVar.mo2479f();
                fVar.f1922e.mo2483f();
            }
            C0447g gVar = this.f1774a;
            gVar.f1914a = false;
            C0428h hVar2 = gVar.f1920d;
            hVar2.f1815e.f1789j = false;
            C0431j jVar2 = gVar.f1922e;
            jVar2.f1815e.f1789j = false;
            hVar2.f1817g = false;
            jVar2.f1817g = false;
            hVar2.mo2479f();
            this.f1774a.f1922e.mo2483f();
        }
        if (m1848a(this.f1776c)) {
            return false;
        }
        int D = this.f1774a.mo2528D();
        int E = this.f1774a.mo2529E();
        this.f1774a.mo2617x(0);
        this.f1774a.mo2619y(0);
        C0446b c = this.f1774a.mo2568c(0);
        C0446b c2 = this.f1774a.mo2568c(1);
        if (this.f1775b) {
            mo2467a();
        }
        int D2 = this.f1774a.mo2528D();
        int E2 = this.f1774a.mo2529E();
        this.f1774a.f1920d.f1818h.mo2476a(D2);
        this.f1774a.f1922e.f1818h.mo2476a(E2);
        mo2474c();
        C0446b bVar = C0446b.WRAP_CONTENT;
        if (c == bVar || c2 == bVar) {
            if (z3) {
                Iterator it2 = this.f1777d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((C0433k) it2.next()).mo2465e()) {
                            z3 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z3 && c == C0446b.WRAP_CONTENT) {
                this.f1774a.mo2548a(C0446b.FIXED);
                C0447g gVar2 = this.f1774a;
                gVar2.mo2611u(m1845a(gVar2, 0));
                C0447g gVar3 = this.f1774a;
                gVar3.f1920d.f1815e.mo2476a(gVar3.mo2525A());
            }
            if (z3 && c2 == C0446b.WRAP_CONTENT) {
                this.f1774a.mo2562b(C0446b.FIXED);
                C0447g gVar4 = this.f1774a;
                gVar4.mo2594m(m1845a(gVar4, 1));
                C0447g gVar5 = this.f1774a;
                gVar5.f1922e.f1815e.mo2476a(gVar5.mo2589k());
            }
        }
        C0446b[] bVarArr = this.f1774a.f1899L;
        if (bVarArr[0] == C0446b.FIXED || bVarArr[0] == C0446b.MATCH_PARENT) {
            int A = this.f1774a.mo2525A() + D2;
            this.f1774a.f1920d.f1819i.mo2476a(A);
            this.f1774a.f1920d.f1815e.mo2476a(A - D2);
            mo2474c();
            C0446b[] bVarArr2 = this.f1774a.f1899L;
            if (bVarArr2[1] == C0446b.FIXED || bVarArr2[1] == C0446b.MATCH_PARENT) {
                int k = this.f1774a.mo2589k() + E2;
                this.f1774a.f1922e.f1819i.mo2476a(k);
                this.f1774a.f1922e.f1815e.mo2476a(k - E2);
            }
            mo2474c();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator it3 = this.f1777d.iterator();
        while (it3.hasNext()) {
            C0433k kVar = (C0433k) it3.next();
            if (kVar.f1812b != this.f1774a || kVar.f1817g) {
                kVar.mo2462b();
            }
        }
        Iterator it4 = this.f1774a.f2067J0.iterator();
        while (it4.hasNext()) {
            C0444f fVar2 = (C0444f) it4.next();
            fVar2.mo2590k(fVar2.mo2585i() + D);
            fVar2.mo2592l(fVar2.mo2587j() + E);
        }
        this.f1774a.mo2617x(D);
        this.f1774a.mo2619y(E);
        Iterator it5 = this.f1777d.iterator();
        while (true) {
            if (!it5.hasNext()) {
                z4 = true;
                break;
            }
            C0433k kVar2 = (C0433k) it5.next();
            if ((z2 || kVar2.f1812b != this.f1774a) && (!kVar2.f1818h.f1789j || ((!kVar2.f1819i.f1789j && !(kVar2 instanceof C0426f)) || (!kVar2.f1815e.f1789j && !(kVar2 instanceof C0421b) && !(kVar2 instanceof C0426f))))) {
                break;
            }
        }
        this.f1774a.mo2548a(c);
        this.f1774a.mo2562b(c2);
        return z4;
    }

    /* renamed from: b */
    public void mo2472b() {
        this.f1775b = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0146 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2471a(boolean r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r10 = r10 & r0
            androidx.constraintlayout.solver.widgets.g r1 = r9.f1774a
            r2 = 0
            androidx.constraintlayout.solver.widgets.f$b r1 = r1.mo2568c(r2)
            androidx.constraintlayout.solver.widgets.g r3 = r9.f1774a
            androidx.constraintlayout.solver.widgets.f$b r3 = r3.mo2568c(r0)
            androidx.constraintlayout.solver.widgets.g r4 = r9.f1774a
            int r4 = r4.mo2528D()
            androidx.constraintlayout.solver.widgets.g r5 = r9.f1774a
            int r5 = r5.mo2529E()
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r1 == r6) goto L_0x0023
            if (r3 != r6) goto L_0x0089
        L_0x0023:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r6 = r9.f1777d
            java.util.Iterator r6 = r6.iterator()
        L_0x0029:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.solver.widgets.analyzer.k r7 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r7
            int r8 = r7.f1816f
            if (r8 != r11) goto L_0x0029
            boolean r7 = r7.mo2465e()
            if (r7 != 0) goto L_0x0029
            r10 = 0
        L_0x0040:
            if (r11 != 0) goto L_0x0066
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r1 != r10) goto L_0x0089
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            r10.mo2548a(r6)
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            int r6 = r9.m1845a(r10, r2)
            r10.mo2611u(r6)
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            androidx.constraintlayout.solver.widgets.analyzer.h r6 = r10.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.e r6 = r6.f1815e
            int r10 = r10.mo2525A()
            r6.mo2476a(r10)
            goto L_0x0089
        L_0x0066:
            if (r10 == 0) goto L_0x0089
            androidx.constraintlayout.solver.widgets.f$b r10 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r3 != r10) goto L_0x0089
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            r10.mo2562b(r6)
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            int r6 = r9.m1845a(r10, r0)
            r10.mo2594m(r6)
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            androidx.constraintlayout.solver.widgets.analyzer.j r6 = r10.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r6 = r6.f1815e
            int r10 = r10.mo2589k()
            r6.mo2476a(r10)
        L_0x0089:
            if (r11 != 0) goto L_0x00b6
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            androidx.constraintlayout.solver.widgets.f$b[] r10 = r10.f1899L
            r5 = r10[r2]
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            if (r5 == r6) goto L_0x009b
            r10 = r10[r2]
            androidx.constraintlayout.solver.widgets.f$b r5 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_PARENT
            if (r10 != r5) goto L_0x00c7
        L_0x009b:
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            int r10 = r10.mo2525A()
            int r10 = r10 + r4
            androidx.constraintlayout.solver.widgets.g r5 = r9.f1774a
            androidx.constraintlayout.solver.widgets.analyzer.h r5 = r5.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.d r5 = r5.f1819i
            r5.mo2476a(r10)
            androidx.constraintlayout.solver.widgets.g r5 = r9.f1774a
            androidx.constraintlayout.solver.widgets.analyzer.h r5 = r5.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.e r5 = r5.f1815e
            int r10 = r10 - r4
            r5.mo2476a(r10)
            goto L_0x00e3
        L_0x00b6:
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            androidx.constraintlayout.solver.widgets.f$b[] r10 = r10.f1899L
            r4 = r10[r0]
            androidx.constraintlayout.solver.widgets.f$b r6 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            if (r4 == r6) goto L_0x00c9
            r10 = r10[r0]
            androidx.constraintlayout.solver.widgets.f$b r4 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_PARENT
            if (r10 != r4) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r10 = 0
            goto L_0x00e4
        L_0x00c9:
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            int r10 = r10.mo2589k()
            int r10 = r10 + r5
            androidx.constraintlayout.solver.widgets.g r4 = r9.f1774a
            androidx.constraintlayout.solver.widgets.analyzer.j r4 = r4.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r4 = r4.f1819i
            r4.mo2476a(r10)
            androidx.constraintlayout.solver.widgets.g r4 = r9.f1774a
            androidx.constraintlayout.solver.widgets.analyzer.j r4 = r4.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r4 = r4.f1815e
            int r10 = r10 - r5
            r4.mo2476a(r10)
        L_0x00e3:
            r10 = 1
        L_0x00e4:
            r9.mo2474c()
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r4 = r9.f1777d
            java.util.Iterator r4 = r4.iterator()
        L_0x00ed:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x010d
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.k r5 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r5
            int r6 = r5.f1816f
            if (r6 == r11) goto L_0x00fe
            goto L_0x00ed
        L_0x00fe:
            androidx.constraintlayout.solver.widgets.f r6 = r5.f1812b
            androidx.constraintlayout.solver.widgets.g r7 = r9.f1774a
            if (r6 != r7) goto L_0x0109
            boolean r6 = r5.f1817g
            if (r6 != 0) goto L_0x0109
            goto L_0x00ed
        L_0x0109:
            r5.mo2462b()
            goto L_0x00ed
        L_0x010d:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.k> r4 = r9.f1777d
            java.util.Iterator r4 = r4.iterator()
        L_0x0113:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0146
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.solver.widgets.analyzer.k r5 = (androidx.constraintlayout.solver.widgets.analyzer.C0433k) r5
            int r6 = r5.f1816f
            if (r6 == r11) goto L_0x0124
            goto L_0x0113
        L_0x0124:
            if (r10 != 0) goto L_0x012d
            androidx.constraintlayout.solver.widgets.f r6 = r5.f1812b
            androidx.constraintlayout.solver.widgets.g r7 = r9.f1774a
            if (r6 != r7) goto L_0x012d
            goto L_0x0113
        L_0x012d:
            androidx.constraintlayout.solver.widgets.analyzer.d r6 = r5.f1818h
            boolean r6 = r6.f1789j
            if (r6 != 0) goto L_0x0134
            goto L_0x0147
        L_0x0134:
            androidx.constraintlayout.solver.widgets.analyzer.d r6 = r5.f1819i
            boolean r6 = r6.f1789j
            if (r6 != 0) goto L_0x013b
            goto L_0x0147
        L_0x013b:
            boolean r6 = r5 instanceof androidx.constraintlayout.solver.widgets.analyzer.C0421b
            if (r6 != 0) goto L_0x0113
            androidx.constraintlayout.solver.widgets.analyzer.e r5 = r5.f1815e
            boolean r5 = r5.f1789j
            if (r5 != 0) goto L_0x0113
            goto L_0x0147
        L_0x0146:
            r2 = 1
        L_0x0147:
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            r10.mo2548a(r1)
            androidx.constraintlayout.solver.widgets.g r10 = r9.f1774a
            r10.mo2562b(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C0422c.mo2471a(boolean, int):boolean");
    }

    /* renamed from: a */
    private boolean m1848a(C0447g gVar) {
        int i;
        int i2;
        Iterator it = gVar.f2067J0.iterator();
        while (it.hasNext()) {
            C0444f fVar = (C0444f) it.next();
            C0446b[] bVarArr = fVar.f1899L;
            C0446b bVar = bVarArr[0];
            C0446b bVar2 = bVarArr[1];
            if (fVar.mo2620z() == 8) {
                fVar.f1914a = true;
            } else {
                if (fVar.f1944p < 1.0f && bVar == C0446b.MATCH_CONSTRAINT) {
                    fVar.f1934k = 2;
                }
                if (fVar.f1950s < 1.0f && bVar2 == C0446b.MATCH_CONSTRAINT) {
                    fVar.f1936l = 2;
                }
                if (fVar.mo2581g() > 0.0f) {
                    if (bVar == C0446b.MATCH_CONSTRAINT && (bVar2 == C0446b.WRAP_CONTENT || bVar2 == C0446b.FIXED)) {
                        fVar.f1934k = 3;
                    } else if (bVar2 == C0446b.MATCH_CONSTRAINT && (bVar == C0446b.WRAP_CONTENT || bVar == C0446b.FIXED)) {
                        fVar.f1936l = 3;
                    } else {
                        C0446b bVar3 = C0446b.MATCH_CONSTRAINT;
                        if (bVar == bVar3 && bVar2 == bVar3) {
                            if (fVar.f1934k == 0) {
                                fVar.f1934k = 3;
                            }
                            if (fVar.f1936l == 0) {
                                fVar.f1936l = 3;
                            }
                        }
                    }
                }
                if (bVar == C0446b.MATCH_CONSTRAINT && fVar.f1934k == 1 && (fVar.f1882B.f1855d == null || fVar.f1886D.f1855d == null)) {
                    bVar = C0446b.WRAP_CONTENT;
                }
                C0446b bVar4 = bVar;
                if (bVar2 == C0446b.MATCH_CONSTRAINT && fVar.f1936l == 1 && (fVar.f1884C.f1855d == null || fVar.f1888E.f1855d == null)) {
                    bVar2 = C0446b.WRAP_CONTENT;
                }
                C0446b bVar5 = bVar2;
                C0428h hVar = fVar.f1920d;
                hVar.f1814d = bVar4;
                hVar.f1811a = fVar.f1934k;
                C0431j jVar = fVar.f1922e;
                jVar.f1814d = bVar5;
                jVar.f1811a = fVar.f1936l;
                if ((bVar4 == C0446b.MATCH_PARENT || bVar4 == C0446b.FIXED || bVar4 == C0446b.WRAP_CONTENT) && (bVar5 == C0446b.MATCH_PARENT || bVar5 == C0446b.FIXED || bVar5 == C0446b.WRAP_CONTENT)) {
                    int A = fVar.mo2525A();
                    if (bVar4 == C0446b.MATCH_PARENT) {
                        i = (gVar.mo2525A() - fVar.f1882B.f1856e) - fVar.f1886D.f1856e;
                        bVar4 = C0446b.FIXED;
                    } else {
                        i = A;
                    }
                    int k = fVar.mo2589k();
                    if (bVar5 == C0446b.MATCH_PARENT) {
                        i2 = (gVar.mo2589k() - fVar.f1884C.f1856e) - fVar.f1888E.f1856e;
                        bVar5 = C0446b.FIXED;
                    } else {
                        i2 = k;
                    }
                    this.f1778e.measure(fVar, bVar4, i, bVar5, i2);
                    fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                    fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                    fVar.f1914a = true;
                } else {
                    if (bVar4 == C0446b.MATCH_CONSTRAINT && (bVar5 == C0446b.WRAP_CONTENT || bVar5 == C0446b.FIXED)) {
                        int i3 = fVar.f1934k;
                        if (i3 == 3) {
                            C0446b bVar6 = C0446b.WRAP_CONTENT;
                            if (bVar5 == bVar6) {
                                this.f1778e.measure(fVar, bVar6, 0, bVar6, 0);
                            }
                            int k2 = fVar.mo2589k();
                            int i4 = (int) ((((float) k2) * fVar.f1903P) + 0.5f);
                            Measurer measurer = this.f1778e;
                            C0446b bVar7 = C0446b.FIXED;
                            measurer.measure(fVar, bVar7, i4, bVar7, k2);
                            fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                            fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                            fVar.f1914a = true;
                        } else if (i3 == 1) {
                            this.f1778e.measure(fVar, C0446b.WRAP_CONTENT, 0, bVar5, 0);
                            fVar.f1920d.f1815e.f1801m = fVar.mo2525A();
                        } else if (i3 == 2) {
                            C0446b[] bVarArr2 = gVar.f1899L;
                            if (bVarArr2[0] == C0446b.FIXED || bVarArr2[0] == C0446b.MATCH_PARENT) {
                                C0444f fVar2 = fVar;
                                this.f1778e.measure(fVar2, C0446b.FIXED, (int) ((fVar.f1944p * ((float) gVar.mo2525A())) + 0.5f), bVar5, fVar.mo2589k());
                                fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                                fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                                fVar.f1914a = true;
                            }
                        } else {
                            C0439e[] eVarArr = fVar.f1897J;
                            if (eVarArr[0].f1855d == null || eVarArr[1].f1855d == null) {
                                this.f1778e.measure(fVar, C0446b.WRAP_CONTENT, 0, bVar5, 0);
                                fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                                fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                                fVar.f1914a = true;
                            }
                        }
                    }
                    if (bVar5 == C0446b.MATCH_CONSTRAINT && (bVar4 == C0446b.WRAP_CONTENT || bVar4 == C0446b.FIXED)) {
                        int i5 = fVar.f1936l;
                        if (i5 == 3) {
                            C0446b bVar8 = C0446b.WRAP_CONTENT;
                            if (bVar4 == bVar8) {
                                this.f1778e.measure(fVar, bVar8, 0, bVar8, 0);
                            }
                            int A2 = fVar.mo2525A();
                            float f = fVar.f1903P;
                            if (fVar.mo2583h() == -1) {
                                f = 1.0f / f;
                            }
                            int i6 = (int) ((((float) A2) * f) + 0.5f);
                            Measurer measurer2 = this.f1778e;
                            C0446b bVar9 = C0446b.FIXED;
                            measurer2.measure(fVar, bVar9, A2, bVar9, i6);
                            fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                            fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                            fVar.f1914a = true;
                        } else if (i5 == 1) {
                            this.f1778e.measure(fVar, bVar4, 0, C0446b.WRAP_CONTENT, 0);
                            fVar.f1922e.f1815e.f1801m = fVar.mo2589k();
                        } else if (i5 == 2) {
                            C0446b[] bVarArr3 = gVar.f1899L;
                            if (bVarArr3[1] == C0446b.FIXED || bVarArr3[1] == C0446b.MATCH_PARENT) {
                                float f2 = fVar.f1950s;
                                C0444f fVar3 = fVar;
                                this.f1778e.measure(fVar3, bVar4, fVar.mo2525A(), C0446b.FIXED, (int) ((f2 * ((float) gVar.mo2589k())) + 0.5f));
                                fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                                fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                                fVar.f1914a = true;
                            }
                        } else {
                            C0439e[] eVarArr2 = fVar.f1897J;
                            if (eVarArr2[2].f1855d == null || eVarArr2[3].f1855d == null) {
                                this.f1778e.measure(fVar, C0446b.WRAP_CONTENT, 0, bVar5, 0);
                                fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                                fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                                fVar.f1914a = true;
                            }
                        }
                    }
                    C0446b bVar10 = C0446b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar10 && bVar5 == bVar10) {
                        int i7 = fVar.f1934k;
                        if (i7 != 1) {
                            int i8 = fVar.f1936l;
                            if (i8 != 1) {
                                if (i8 == 2 && i7 == 2) {
                                    C0446b[] bVarArr4 = gVar.f1899L;
                                    C0446b bVar11 = bVarArr4[0];
                                    C0446b bVar12 = C0446b.FIXED;
                                    if (bVar11 == bVar12 || bVarArr4[0] == bVar12) {
                                        C0446b[] bVarArr5 = gVar.f1899L;
                                        C0446b bVar13 = bVarArr5[1];
                                        C0446b bVar14 = C0446b.FIXED;
                                        if (bVar13 == bVar14 || bVarArr5[1] == bVar14) {
                                            float f3 = fVar.f1944p;
                                            int A3 = (int) ((f3 * ((float) gVar.mo2525A())) + 0.5f);
                                            int k3 = (int) ((fVar.f1950s * ((float) gVar.mo2589k())) + 0.5f);
                                            Measurer measurer3 = this.f1778e;
                                            C0446b bVar15 = C0446b.FIXED;
                                            measurer3.measure(fVar, bVar15, A3, bVar15, k3);
                                            fVar.f1920d.f1815e.mo2476a(fVar.mo2525A());
                                            fVar.f1922e.f1815e.mo2476a(fVar.mo2589k());
                                            fVar.f1914a = true;
                                        }
                                    }
                                }
                            }
                        }
                        Measurer measurer4 = this.f1778e;
                        C0446b bVar16 = C0446b.WRAP_CONTENT;
                        measurer4.measure(fVar, bVar16, 0, bVar16, 0);
                        fVar.f1920d.f1815e.f1801m = fVar.mo2525A();
                        fVar.f1922e.f1815e.f1801m = fVar.mo2589k();
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo2467a() {
        mo2469a(this.f1777d);
        this.f1779f.clear();
        C0430i.f1804d = 0;
        m1847a(this.f1774a.f1920d, 0, this.f1779f);
        m1847a(this.f1774a.f1922e, 1, this.f1779f);
        this.f1775b = false;
    }

    /* renamed from: a */
    public void mo2469a(ArrayList<C0433k> arrayList) {
        arrayList.clear();
        this.f1776c.f1920d.mo2463c();
        this.f1776c.f1922e.mo2463c();
        arrayList.add(this.f1776c.f1920d);
        arrayList.add(this.f1776c.f1922e);
        Iterator it = this.f1776c.f2067J0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            C0444f fVar = (C0444f) it.next();
            if (fVar instanceof C0451j) {
                arrayList.add(new C0426f(fVar));
            } else {
                if (fVar.mo2532H()) {
                    if (fVar.f1916b == null) {
                        fVar.f1916b = new C0421b(fVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(fVar.f1916b);
                } else {
                    arrayList.add(fVar.f1920d);
                }
                if (fVar.mo2533I()) {
                    if (fVar.f1918c == null) {
                        fVar.f1918c = new C0421b(fVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(fVar.f1918c);
                } else {
                    arrayList.add(fVar.f1922e);
                }
                if (fVar instanceof C0453k) {
                    arrayList.add(new C0427g(fVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0433k) it2.next()).mo2463c();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0433k kVar = (C0433k) it3.next();
            if (kVar.f1812b != this.f1776c) {
                kVar.mo2461a();
            }
        }
    }

    /* renamed from: a */
    private void m1846a(C0423d dVar, int i, int i2, C0423d dVar2, ArrayList<C0430i> arrayList, C0430i iVar) {
        C0433k kVar = dVar.f1783d;
        if (kVar.f1813c == null) {
            C0447g gVar = this.f1774a;
            if (kVar != gVar.f1920d && kVar != gVar.f1922e) {
                if (iVar == null) {
                    iVar = new C0430i(kVar, i2);
                    arrayList.add(iVar);
                }
                kVar.f1813c = iVar;
                iVar.mo2482a(kVar);
                for (Dependency dependency : kVar.f1818h.f1790k) {
                    if (dependency instanceof C0423d) {
                        m1846a((C0423d) dependency, i, 0, dVar2, arrayList, iVar);
                    }
                }
                for (Dependency dependency2 : kVar.f1819i.f1790k) {
                    if (dependency2 instanceof C0423d) {
                        m1846a((C0423d) dependency2, i, 1, dVar2, arrayList, iVar);
                    }
                }
                if (i == 1 && (kVar instanceof C0431j)) {
                    for (Dependency dependency3 : ((C0431j) kVar).f1808k.f1790k) {
                        if (dependency3 instanceof C0423d) {
                            m1846a((C0423d) dependency3, i, 2, dVar2, arrayList, iVar);
                        }
                    }
                }
                for (C0423d dVar3 : kVar.f1818h.f1791l) {
                    if (dVar3 == dVar2) {
                        iVar.f1805a = true;
                    }
                    m1846a(dVar3, i, 0, dVar2, arrayList, iVar);
                }
                for (C0423d dVar4 : kVar.f1819i.f1791l) {
                    if (dVar4 == dVar2) {
                        iVar.f1805a = true;
                    }
                    m1846a(dVar4, i, 1, dVar2, arrayList, iVar);
                }
                if (i == 1 && (kVar instanceof C0431j)) {
                    for (C0423d a : ((C0431j) kVar).f1808k.f1791l) {
                        m1846a(a, i, 2, dVar2, arrayList, iVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m1847a(C0433k kVar, int i, ArrayList<C0430i> arrayList) {
        for (Dependency dependency : kVar.f1818h.f1790k) {
            if (dependency instanceof C0423d) {
                m1846a((C0423d) dependency, i, 0, kVar.f1819i, arrayList, null);
            } else if (dependency instanceof C0433k) {
                m1846a(((C0433k) dependency).f1818h, i, 0, kVar.f1819i, arrayList, null);
            }
        }
        for (Dependency dependency2 : kVar.f1819i.f1790k) {
            if (dependency2 instanceof C0423d) {
                m1846a((C0423d) dependency2, i, 1, kVar.f1818h, arrayList, null);
            } else if (dependency2 instanceof C0433k) {
                m1846a(((C0433k) dependency2).f1819i, i, 1, kVar.f1818h, arrayList, null);
            }
        }
        if (i == 1) {
            for (Dependency dependency3 : ((C0431j) kVar).f1808k.f1790k) {
                if (dependency3 instanceof C0423d) {
                    m1846a((C0423d) dependency3, i, 2, null, arrayList, null);
                }
            }
        }
    }
}
