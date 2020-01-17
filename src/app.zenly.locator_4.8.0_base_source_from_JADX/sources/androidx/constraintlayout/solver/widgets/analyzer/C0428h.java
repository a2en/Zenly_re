package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0439e;
import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import androidx.constraintlayout.solver.widgets.Helper;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.h */
public class C0428h extends C0433k {

    /* renamed from: k */
    private static int[] f1802k = new int[2];

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.h$a */
    static /* synthetic */ class C0429a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1803a = new int[C0435b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                androidx.constraintlayout.solver.widgets.analyzer.k$b[] r0 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0435b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1803a = r0
                int[] r0 = f1803a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.analyzer.k$b r1 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0435b.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1803a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.widgets.analyzer.k$b r1 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0435b.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f1803a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.analyzer.k$b r1 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0435b.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C0428h.C0429a.<clinit>():void");
        }
    }

    public C0428h(C0444f fVar) {
        super(fVar);
        this.f1818h.f1784e = C0424a.LEFT;
        this.f1819i.f1784e = C0424a.RIGHT;
        this.f1816f = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2461a() {
        C0444f fVar = this.f1812b;
        if (fVar.f1914a) {
            this.f1815e.mo2476a(fVar.mo2525A());
        }
        if (!this.f1815e.f1789j) {
            this.f1814d = this.f1812b.mo2595n();
            C0446b bVar = this.f1814d;
            if (bVar != C0446b.MATCH_CONSTRAINT) {
                if (bVar == C0446b.MATCH_PARENT) {
                    C0444f q = this.f1812b.mo2601q();
                    if ((q != null && q.mo2595n() == C0446b.FIXED) || q.mo2595n() == C0446b.MATCH_PARENT) {
                        int A = (q.mo2525A() - this.f1812b.f1882B.mo2514b()) - this.f1812b.f1886D.mo2514b();
                        mo2490a(this.f1818h, q.f1920d.f1818h, this.f1812b.f1882B.mo2514b());
                        mo2490a(this.f1819i, q.f1920d.f1819i, -this.f1812b.f1886D.mo2514b());
                        this.f1815e.mo2476a(A);
                        return;
                    }
                }
                if (this.f1814d == C0446b.FIXED) {
                    this.f1815e.mo2476a(this.f1812b.mo2525A());
                }
            }
        } else if (this.f1814d == C0446b.MATCH_PARENT) {
            C0444f q2 = this.f1812b.mo2601q();
            if ((q2 != null && q2.mo2595n() == C0446b.FIXED) || q2.mo2595n() == C0446b.MATCH_PARENT) {
                mo2490a(this.f1818h, q2.f1920d.f1818h, this.f1812b.f1882B.mo2514b());
                mo2490a(this.f1819i, q2.f1920d.f1819i, -this.f1812b.f1886D.mo2514b());
                return;
            }
        }
        if (this.f1815e.f1789j) {
            C0444f fVar2 = this.f1812b;
            if (fVar2.f1914a) {
                C0439e[] eVarArr = fVar2.f1897J;
                if (eVarArr[0].f1855d == null || eVarArr[1].f1855d == null) {
                    C0444f fVar3 = this.f1812b;
                    C0439e[] eVarArr2 = fVar3.f1897J;
                    if (eVarArr2[0].f1855d != null) {
                        C0423d a = mo2486a(eVarArr2[0]);
                        if (a != null) {
                            mo2490a(this.f1818h, a, this.f1812b.f1897J[0].mo2514b());
                            mo2490a(this.f1819i, this.f1818h, this.f1815e.f1786g);
                        }
                    } else if (eVarArr2[1].f1855d != null) {
                        C0423d a2 = mo2486a(eVarArr2[1]);
                        if (a2 != null) {
                            mo2490a(this.f1819i, a2, -this.f1812b.f1897J[1].mo2514b());
                            mo2490a(this.f1818h, this.f1819i, -this.f1815e.f1786g);
                        }
                    } else if (!(fVar3 instanceof Helper) && fVar3.mo2601q() != null && this.f1812b.mo2539a(C0443d.CENTER).f1855d == null) {
                        mo2490a(this.f1818h, this.f1812b.mo2601q().f1920d.f1818h, 0);
                        mo2490a(this.f1819i, this.f1818h, this.f1815e.f1786g);
                    }
                }
                if (fVar2.mo2532H()) {
                    this.f1818h.f1785f = this.f1812b.f1897J[0].mo2514b();
                    this.f1819i.f1785f = -this.f1812b.f1897J[1].mo2514b();
                } else {
                    C0423d a3 = mo2486a(this.f1812b.f1897J[0]);
                    if (a3 != null) {
                        mo2490a(this.f1818h, a3, this.f1812b.f1897J[0].mo2514b());
                    }
                    C0423d a4 = mo2486a(this.f1812b.f1897J[1]);
                    if (a4 != null) {
                        mo2490a(this.f1819i, a4, -this.f1812b.f1897J[1].mo2514b());
                    }
                    this.f1818h.f1781b = true;
                    this.f1819i.f1781b = true;
                }
            }
        }
        if (this.f1814d == C0446b.MATCH_CONSTRAINT) {
            C0444f fVar4 = this.f1812b;
            int i = fVar4.f1934k;
            if (i == 2) {
                C0444f q3 = fVar4.mo2601q();
                if (q3 != null) {
                    C0425e eVar = q3.f1922e.f1815e;
                    this.f1815e.f1791l.add(eVar);
                    eVar.f1790k.add(this.f1815e);
                    C0425e eVar2 = this.f1815e;
                    eVar2.f1781b = true;
                    eVar2.f1790k.add(this.f1818h);
                    this.f1815e.f1790k.add(this.f1819i);
                }
            } else if (i == 3) {
                if (fVar4.f1936l == 3) {
                    this.f1818h.f1780a = this;
                    this.f1819i.f1780a = this;
                    C0431j jVar = fVar4.f1922e;
                    jVar.f1818h.f1780a = this;
                    jVar.f1819i.f1780a = this;
                    this.f1815e.f1780a = this;
                    if (fVar4.mo2533I()) {
                        this.f1815e.f1791l.add(this.f1812b.f1922e.f1815e);
                        this.f1812b.f1922e.f1815e.f1790k.add(this.f1815e);
                        C0431j jVar2 = this.f1812b.f1922e;
                        jVar2.f1815e.f1780a = this;
                        this.f1815e.f1791l.add(jVar2.f1818h);
                        this.f1815e.f1791l.add(this.f1812b.f1922e.f1819i);
                        this.f1812b.f1922e.f1818h.f1790k.add(this.f1815e);
                        this.f1812b.f1922e.f1819i.f1790k.add(this.f1815e);
                    } else if (this.f1812b.mo2532H()) {
                        this.f1812b.f1922e.f1815e.f1791l.add(this.f1815e);
                        this.f1815e.f1790k.add(this.f1812b.f1922e.f1815e);
                    } else {
                        this.f1812b.f1922e.f1815e.f1791l.add(this.f1815e);
                    }
                } else {
                    C0425e eVar3 = fVar4.f1922e.f1815e;
                    this.f1815e.f1791l.add(eVar3);
                    eVar3.f1790k.add(this.f1815e);
                    this.f1812b.f1922e.f1818h.f1790k.add(this.f1815e);
                    this.f1812b.f1922e.f1819i.f1790k.add(this.f1815e);
                    C0425e eVar4 = this.f1815e;
                    eVar4.f1781b = true;
                    eVar4.f1790k.add(this.f1818h);
                    this.f1815e.f1790k.add(this.f1819i);
                    this.f1818h.f1791l.add(this.f1815e);
                    this.f1819i.f1791l.add(this.f1815e);
                }
            }
        }
        C0444f fVar5 = this.f1812b;
        C0439e[] eVarArr3 = fVar5.f1897J;
        if (eVarArr3[0].f1855d == null || eVarArr3[1].f1855d == null) {
            C0444f fVar6 = this.f1812b;
            C0439e[] eVarArr4 = fVar6.f1897J;
            if (eVarArr4[0].f1855d != null) {
                C0423d a5 = mo2486a(eVarArr4[0]);
                if (a5 != null) {
                    mo2490a(this.f1818h, a5, this.f1812b.f1897J[0].mo2514b());
                    mo2491a(this.f1819i, this.f1818h, 1, this.f1815e);
                }
            } else if (eVarArr4[1].f1855d != null) {
                C0423d a6 = mo2486a(eVarArr4[1]);
                if (a6 != null) {
                    mo2490a(this.f1819i, a6, -this.f1812b.f1897J[1].mo2514b());
                    mo2491a(this.f1818h, this.f1819i, -1, this.f1815e);
                }
            } else if (!(fVar6 instanceof Helper) && fVar6.mo2601q() != null) {
                mo2490a(this.f1818h, this.f1812b.mo2601q().f1920d.f1818h, 0);
                mo2491a(this.f1819i, this.f1818h, 1, this.f1815e);
            }
        }
        if (fVar5.mo2532H()) {
            this.f1818h.f1785f = this.f1812b.f1897J[0].mo2514b();
            this.f1819i.f1785f = -this.f1812b.f1897J[1].mo2514b();
        } else {
            C0423d a7 = mo2486a(this.f1812b.f1897J[0]);
            C0423d a8 = mo2486a(this.f1812b.f1897J[1]);
            a7.mo2477a((Dependency) this);
            a8.mo2477a((Dependency) this);
            this.f1820j = C0435b.CENTER;
        }
    }

    /* renamed from: b */
    public void mo2462b() {
        this.f1812b.mo2590k(this.f1818h.f1786g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2463c() {
        this.f1813c = null;
        this.f1818h.mo2475a();
        this.f1819i.mo2475a();
        this.f1815e.mo2475a();
        this.f1817g = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo2465e() {
        if (this.f1814d != C0446b.MATCH_CONSTRAINT || this.f1812b.f1934k == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2479f() {
        this.f1817g = false;
        this.f1818h.f1789j = false;
        this.f1819i.f1789j = false;
        this.f1815e.f1789j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HorizontalRun ");
        sb.append(this.f1812b.mo2580f());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02c6, code lost:
        if (r14 != 1) goto L_0x032e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void update(androidx.constraintlayout.solver.widgets.analyzer.Dependency r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = androidx.constraintlayout.solver.widgets.analyzer.C0428h.C0429a.f1803a
            androidx.constraintlayout.solver.widgets.analyzer.k$b r1 = r8.f1820j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.e r1 = r0.f1882B
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1886D
            r3 = r17
            r8.mo2489a(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.mo2488a(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.mo2492b(r17)
        L_0x002e:
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            boolean r0 = r0.f1789j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x032e
            androidx.constraintlayout.solver.widgets.f$b r0 = r8.f1814d
            androidx.constraintlayout.solver.widgets.f$b r3 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x032e
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            int r3 = r0.f1934k
            if (r3 == r1) goto L_0x0310
            if (r3 == r2) goto L_0x0046
            goto L_0x032e
        L_0x0046:
            int r1 = r0.f1936l
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.mo2583h()
            if (r0 == r3) goto L_0x0077
            if (r0 == 0) goto L_0x0068
            if (r0 == r9) goto L_0x005a
            r0 = 0
            goto L_0x0088
        L_0x005a:
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r1 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r1 = r1.f1815e
            int r1 = r1.f1786g
            float r1 = (float) r1
            float r0 = r0.mo2581g()
            goto L_0x0084
        L_0x0068:
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r1 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r1 = r1.f1815e
            int r1 = r1.f1786g
            float r1 = (float) r1
            float r0 = r0.mo2581g()
            float r1 = r1 / r0
            goto L_0x0086
        L_0x0077:
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r1 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r1 = r1.f1815e
            int r1 = r1.f1786g
            float r1 = (float) r1
            float r0 = r0.mo2581g()
        L_0x0084:
            float r1 = r1 * r0
        L_0x0086:
            float r1 = r1 + r11
            int r0 = (int) r1
        L_0x0088:
            androidx.constraintlayout.solver.widgets.analyzer.e r1 = r8.f1815e
            r1.mo2476a(r0)
            goto L_0x032e
        L_0x008f:
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r1 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.d r12 = r1.f1818h
            androidx.constraintlayout.solver.widgets.analyzer.d r13 = r1.f1819i
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1882B
            androidx.constraintlayout.solver.widgets.e r0 = r0.f1855d
            if (r0 == 0) goto L_0x009f
            r0 = 1
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            androidx.constraintlayout.solver.widgets.f r1 = r8.f1812b
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1884C
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1855d
            if (r1 == 0) goto L_0x00aa
            r1 = 1
            goto L_0x00ab
        L_0x00aa:
            r1 = 0
        L_0x00ab:
            androidx.constraintlayout.solver.widgets.f r2 = r8.f1812b
            androidx.constraintlayout.solver.widgets.e r2 = r2.f1886D
            androidx.constraintlayout.solver.widgets.e r2 = r2.f1855d
            if (r2 == 0) goto L_0x00b5
            r2 = 1
            goto L_0x00b6
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            androidx.constraintlayout.solver.widgets.f r4 = r8.f1812b
            androidx.constraintlayout.solver.widgets.e r4 = r4.f1888E
            androidx.constraintlayout.solver.widgets.e r4 = r4.f1855d
            if (r4 == 0) goto L_0x00c0
            r4 = 1
            goto L_0x00c1
        L_0x00c0:
            r4 = 0
        L_0x00c1:
            androidx.constraintlayout.solver.widgets.f r5 = r8.f1812b
            int r14 = r5.mo2583h()
            if (r0 == 0) goto L_0x020a
            if (r1 == 0) goto L_0x020a
            if (r2 == 0) goto L_0x020a
            if (r4 == 0) goto L_0x020a
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            float r15 = r0.mo2581g()
            boolean r0 = r12.f1789j
            if (r0 == 0) goto L_0x0138
            boolean r0 = r13.f1789j
            if (r0 == 0) goto L_0x0138
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            boolean r1 = r0.f1782c
            if (r1 == 0) goto L_0x0137
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            boolean r1 = r1.f1782c
            if (r1 != 0) goto L_0x00ea
            goto L_0x0137
        L_0x00ea:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            int r0 = r0.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1818h
            int r1 = r1.f1785f
            int r2 = r0 + r1
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1819i
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            int r0 = r0.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            int r1 = r1.f1785f
            int r3 = r0 - r1
            int r0 = r12.f1786g
            int r1 = r12.f1785f
            int r4 = r0 + r1
            int r0 = r13.f1786g
            int r1 = r13.f1785f
            int r5 = r0 - r1
            int[] r1 = f1802k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m1871a(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            int[] r1 = f1802k
            r1 = r1[r10]
            r0.mo2476a(r1)
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r0.f1815e
            int[] r1 = f1802k
            r1 = r1[r9]
            r0.mo2476a(r1)
        L_0x0137:
            return
        L_0x0138:
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            boolean r1 = r0.f1789j
            if (r1 == 0) goto L_0x0195
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            boolean r2 = r1.f1789j
            if (r2 == 0) goto L_0x0195
            boolean r2 = r12.f1782c
            if (r2 == 0) goto L_0x0194
            boolean r2 = r13.f1782c
            if (r2 != 0) goto L_0x014d
            goto L_0x0194
        L_0x014d:
            int r2 = r0.f1786g
            int r0 = r0.f1785f
            int r2 = r2 + r0
            int r0 = r1.f1786g
            int r1 = r1.f1785f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r12.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            int r0 = r0.f1786g
            int r1 = r12.f1785f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r13.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            int r0 = r0.f1786g
            int r1 = r13.f1785f
            int r5 = r0 - r1
            int[] r1 = f1802k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m1871a(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            int[] r1 = f1802k
            r1 = r1[r10]
            r0.mo2476a(r1)
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r0.f1815e
            int[] r1 = f1802k
            r1 = r1[r9]
            r0.mo2476a(r1)
            goto L_0x0195
        L_0x0194:
            return
        L_0x0195:
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            boolean r1 = r0.f1782c
            if (r1 == 0) goto L_0x0209
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            boolean r1 = r1.f1782c
            if (r1 == 0) goto L_0x0209
            boolean r1 = r12.f1782c
            if (r1 == 0) goto L_0x0209
            boolean r1 = r13.f1782c
            if (r1 != 0) goto L_0x01aa
            goto L_0x0209
        L_0x01aa:
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            int r0 = r0.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1818h
            int r1 = r1.f1785f
            int r2 = r0 + r1
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1819i
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            int r0 = r0.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            int r1 = r1.f1785f
            int r3 = r0 - r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r12.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            int r0 = r0.f1786g
            int r1 = r12.f1785f
            int r4 = r0 + r1
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r13.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            int r0 = r0.f1786g
            int r1 = r13.f1785f
            int r5 = r0 - r1
            int[] r1 = f1802k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.m1871a(r1, r2, r3, r4, r5, r6, r7)
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            int[] r1 = f1802k
            r1 = r1[r10]
            r0.mo2476a(r1)
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r0.f1815e
            int[] r1 = f1802k
            r1 = r1[r9]
            r0.mo2476a(r1)
            goto L_0x032e
        L_0x0209:
            return
        L_0x020a:
            if (r0 == 0) goto L_0x0295
            if (r2 == 0) goto L_0x0295
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            boolean r0 = r0.f1782c
            if (r0 == 0) goto L_0x0294
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1819i
            boolean r0 = r0.f1782c
            if (r0 != 0) goto L_0x021c
            goto L_0x0294
        L_0x021c:
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            float r0 = r0.mo2581g()
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1818h
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r1 = r1.f1791l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r1
            int r1 = r1.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = r8.f1818h
            int r2 = r2.f1785f
            int r1 = r1 + r2
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = r8.f1819i
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r2 = r2.f1791l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r2
            int r2 = r2.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r4 = r8.f1819i
            int r4 = r4.f1785f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0270
            if (r14 == 0) goto L_0x0270
            if (r14 == r9) goto L_0x024c
            goto L_0x032e
        L_0x024c:
            int r2 = r2 - r1
            int r1 = r8.mo2485a(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo2485a(r2, r9)
            if (r2 == r3) goto L_0x0260
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0260:
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            r0.mo2476a(r1)
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r0.f1815e
            r0.mo2476a(r3)
            goto L_0x032e
        L_0x0270:
            int r2 = r2 - r1
            int r1 = r8.mo2485a(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo2485a(r2, r9)
            if (r2 == r3) goto L_0x0284
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0284:
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            r0.mo2476a(r1)
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r0.f1815e
            r0.mo2476a(r3)
            goto L_0x032e
        L_0x0294:
            return
        L_0x0295:
            if (r1 == 0) goto L_0x032e
            if (r4 == 0) goto L_0x032e
            boolean r0 = r12.f1782c
            if (r0 == 0) goto L_0x030f
            boolean r0 = r13.f1782c
            if (r0 != 0) goto L_0x02a2
            goto L_0x030f
        L_0x02a2:
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            float r0 = r0.mo2581g()
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r1 = r12.f1791l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r1
            int r1 = r1.f1786g
            int r2 = r12.f1785f
            int r1 = r1 + r2
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r2 = r13.f1791l
            java.lang.Object r2 = r2.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r2
            int r2 = r2.f1786g
            int r4 = r13.f1785f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02ec
            if (r14 == 0) goto L_0x02c9
            if (r14 == r9) goto L_0x02ec
            goto L_0x032e
        L_0x02c9:
            int r2 = r2 - r1
            int r1 = r8.mo2485a(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo2485a(r2, r10)
            if (r2 == r3) goto L_0x02dd
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02dd:
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            r0.mo2476a(r3)
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r0.f1815e
            r0.mo2476a(r1)
            goto L_0x032e
        L_0x02ec:
            int r2 = r2 - r1
            int r1 = r8.mo2485a(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.mo2485a(r2, r10)
            if (r2 == r3) goto L_0x0300
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0300:
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            r0.mo2476a(r3)
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            androidx.constraintlayout.solver.widgets.analyzer.j r0 = r0.f1922e
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r0.f1815e
            r0.mo2476a(r1)
            goto L_0x032e
        L_0x030f:
            return
        L_0x0310:
            androidx.constraintlayout.solver.widgets.f r0 = r0.mo2601q()
            if (r0 == 0) goto L_0x032e
            androidx.constraintlayout.solver.widgets.analyzer.h r0 = r0.f1920d
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r0.f1815e
            boolean r1 = r0.f1789j
            if (r1 == 0) goto L_0x032e
            androidx.constraintlayout.solver.widgets.f r1 = r8.f1812b
            float r1 = r1.f1944p
            int r0 = r0.f1786g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            androidx.constraintlayout.solver.widgets.analyzer.e r1 = r8.f1815e
            r1.mo2476a(r0)
        L_0x032e:
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            boolean r1 = r0.f1782c
            if (r1 == 0) goto L_0x0450
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            boolean r2 = r1.f1782c
            if (r2 != 0) goto L_0x033c
            goto L_0x0450
        L_0x033c:
            boolean r0 = r0.f1789j
            if (r0 == 0) goto L_0x034b
            boolean r0 = r1.f1789j
            if (r0 == 0) goto L_0x034b
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            boolean r0 = r0.f1789j
            if (r0 == 0) goto L_0x034b
            return
        L_0x034b:
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            boolean r0 = r0.f1789j
            if (r0 != 0) goto L_0x0395
            androidx.constraintlayout.solver.widgets.f$b r0 = r8.f1814d
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0395
            androidx.constraintlayout.solver.widgets.f r0 = r8.f1812b
            int r1 = r0.f1934k
            if (r1 != 0) goto L_0x0395
            boolean r0 = r0.mo2532H()
            if (r0 != 0) goto L_0x0395
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r1 = r1.f1791l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r1
            int r0 = r0.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = r8.f1818h
            int r3 = r2.f1785f
            int r0 = r0 + r3
            int r1 = r1.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r8.f1819i
            int r3 = r3.f1785f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.mo2476a(r0)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1819i
            r0.mo2476a(r1)
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            r0.mo2476a(r3)
            return
        L_0x0395:
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            boolean r0 = r0.f1789j
            if (r0 != 0) goto L_0x03f9
            androidx.constraintlayout.solver.widgets.f$b r0 = r8.f1814d
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03f9
            int r0 = r8.f1811a
            if (r0 != r9) goto L_0x03f9
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03f9
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1819i
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03f9
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r1 = r1.f1791l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r1
            int r0 = r0.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = r8.f1818h
            int r2 = r2.f1785f
            int r0 = r0 + r2
            int r1 = r1.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r2 = r8.f1819i
            int r2 = r2.f1785f
            int r1 = r1 + r2
            int r1 = r1 - r0
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            int r0 = r0.f1801m
            int r0 = java.lang.Math.min(r1, r0)
            androidx.constraintlayout.solver.widgets.f r1 = r8.f1812b
            int r2 = r1.f1942o
            int r1 = r1.f1940n
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03f4
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03f4:
            androidx.constraintlayout.solver.widgets.analyzer.e r1 = r8.f1815e
            r1.mo2476a(r0)
        L_0x03f9:
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            boolean r0 = r0.f1789j
            if (r0 != 0) goto L_0x0400
            return
        L_0x0400:
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r0 = r0.f1791l
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r0
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1819i
            java.util.List<androidx.constraintlayout.solver.widgets.analyzer.d> r1 = r1.f1791l
            java.lang.Object r1 = r1.get(r10)
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = (androidx.constraintlayout.solver.widgets.analyzer.C0423d) r1
            int r2 = r0.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r3 = r8.f1818h
            int r3 = r3.f1785f
            int r2 = r2 + r3
            int r3 = r1.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.d r4 = r8.f1819i
            int r4 = r4.f1785f
            int r3 = r3 + r4
            androidx.constraintlayout.solver.widgets.f r4 = r8.f1812b
            float r4 = r4.mo2591l()
            if (r0 != r1) goto L_0x0430
            int r2 = r0.f1786g
            int r3 = r1.f1786g
            r4 = 1056964608(0x3f000000, float:0.5)
        L_0x0430:
            int r3 = r3 - r2
            androidx.constraintlayout.solver.widgets.analyzer.e r0 = r8.f1815e
            int r0 = r0.f1786g
            int r3 = r3 - r0
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1818h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.mo2476a(r1)
            androidx.constraintlayout.solver.widgets.analyzer.d r0 = r8.f1819i
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r8.f1818h
            int r1 = r1.f1786g
            androidx.constraintlayout.solver.widgets.analyzer.e r2 = r8.f1815e
            int r2 = r2.f1786g
            int r1 = r1 + r2
            r0.mo2476a(r1)
        L_0x0450:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C0428h.update(androidx.constraintlayout.solver.widgets.analyzer.Dependency):void");
    }

    /* renamed from: a */
    private void m1871a(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 == -1) {
            int i8 = (int) ((((float) i7) * f) + 0.5f);
            int i9 = (int) ((((float) i6) / f) + 0.5f);
            if (i8 <= i6 && i7 <= i7) {
                iArr[0] = i8;
                iArr[1] = i7;
            } else if (i6 <= i6 && i9 <= i7) {
                iArr[0] = i6;
                iArr[1] = i9;
            }
        } else if (i5 == 0) {
            iArr[0] = (int) ((((float) i7) * f) + 0.5f);
            iArr[1] = i7;
        } else if (i5 == 1) {
            int i10 = (int) ((((float) i6) * f) + 0.5f);
            iArr[0] = i6;
            iArr[1] = i10;
        }
    }
}
