package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0439e;
import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import androidx.constraintlayout.solver.widgets.Helper;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.j */
public class C0431j extends C0433k {

    /* renamed from: k */
    public C0423d f1808k;

    /* renamed from: l */
    C0425e f1809l;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.j$a */
    static /* synthetic */ class C0432a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1810a = new int[C0435b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                androidx.constraintlayout.solver.widgets.analyzer.k$b[] r0 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0435b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1810a = r0
                int[] r0 = f1810a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.analyzer.k$b r1 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0435b.START     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1810a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.widgets.analyzer.k$b r1 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0435b.END     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f1810a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.analyzer.k$b r1 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0435b.CENTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C0431j.C0432a.<clinit>():void");
        }
    }

    public C0431j(C0444f fVar) {
        super(fVar);
        this.f1808k = new C0423d(this);
        this.f1809l = null;
        this.f1818h.f1784e = C0424a.TOP;
        this.f1819i.f1784e = C0424a.BOTTOM;
        this.f1808k.f1784e = C0424a.BASELINE;
        this.f1816f = 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2461a() {
        C0444f fVar = this.f1812b;
        if (fVar.f1914a) {
            this.f1815e.mo2476a(fVar.mo2589k());
        }
        if (!this.f1815e.f1789j) {
            this.f1814d = this.f1812b.mo2618y();
            if (this.f1812b.mo2530F()) {
                this.f1809l = new C0420a(this);
            }
            C0446b bVar = this.f1814d;
            if (bVar != C0446b.MATCH_CONSTRAINT) {
                if (bVar == C0446b.MATCH_PARENT) {
                    C0444f q = this.f1812b.mo2601q();
                    if (q != null && q.mo2618y() == C0446b.FIXED) {
                        int k = (q.mo2589k() - this.f1812b.f1884C.mo2514b()) - this.f1812b.f1888E.mo2514b();
                        mo2490a(this.f1818h, q.f1922e.f1818h, this.f1812b.f1884C.mo2514b());
                        mo2490a(this.f1819i, q.f1922e.f1819i, -this.f1812b.f1888E.mo2514b());
                        this.f1815e.mo2476a(k);
                        return;
                    }
                }
                if (this.f1814d == C0446b.FIXED) {
                    this.f1815e.mo2476a(this.f1812b.mo2589k());
                }
            }
        } else if (this.f1814d == C0446b.MATCH_PARENT) {
            C0444f q2 = this.f1812b.mo2601q();
            if (q2 != null && q2.mo2618y() == C0446b.FIXED) {
                mo2490a(this.f1818h, q2.f1922e.f1818h, this.f1812b.f1884C.mo2514b());
                mo2490a(this.f1819i, q2.f1922e.f1819i, -this.f1812b.f1888E.mo2514b());
                return;
            }
        }
        if (this.f1815e.f1789j) {
            C0444f fVar2 = this.f1812b;
            if (fVar2.f1914a) {
                C0439e[] eVarArr = fVar2.f1897J;
                if (eVarArr[2].f1855d == null || eVarArr[3].f1855d == null) {
                    C0444f fVar3 = this.f1812b;
                    C0439e[] eVarArr2 = fVar3.f1897J;
                    if (eVarArr2[2].f1855d != null) {
                        C0423d a = mo2486a(eVarArr2[2]);
                        if (a != null) {
                            mo2490a(this.f1818h, a, this.f1812b.f1897J[2].mo2514b());
                            mo2490a(this.f1819i, this.f1818h, this.f1815e.f1786g);
                            if (this.f1812b.mo2530F()) {
                                mo2490a(this.f1808k, this.f1818h, this.f1812b.mo2567c());
                            }
                        }
                    } else if (eVarArr2[3].f1855d != null) {
                        C0423d a2 = mo2486a(eVarArr2[3]);
                        if (a2 != null) {
                            mo2490a(this.f1819i, a2, -this.f1812b.f1897J[3].mo2514b());
                            mo2490a(this.f1818h, this.f1819i, -this.f1815e.f1786g);
                        }
                        if (this.f1812b.mo2530F()) {
                            mo2490a(this.f1808k, this.f1818h, this.f1812b.mo2567c());
                        }
                    } else if (eVarArr2[4].f1855d != null) {
                        C0423d a3 = mo2486a(eVarArr2[4]);
                        if (a3 != null) {
                            mo2490a(this.f1808k, a3, 0);
                            mo2490a(this.f1818h, this.f1808k, -this.f1812b.mo2567c());
                            mo2490a(this.f1819i, this.f1818h, this.f1815e.f1786g);
                        }
                    } else if (!(fVar3 instanceof Helper) && fVar3.mo2601q() != null && this.f1812b.mo2539a(C0443d.CENTER).f1855d == null) {
                        mo2490a(this.f1818h, this.f1812b.mo2601q().f1922e.f1818h, 0);
                        mo2490a(this.f1819i, this.f1818h, this.f1815e.f1786g);
                        if (this.f1812b.mo2530F()) {
                            mo2490a(this.f1808k, this.f1818h, this.f1812b.mo2567c());
                        }
                    }
                }
                if (fVar2.mo2533I()) {
                    this.f1818h.f1785f = this.f1812b.f1897J[2].mo2514b();
                    this.f1819i.f1785f = -this.f1812b.f1897J[3].mo2514b();
                } else {
                    C0423d a4 = mo2486a(this.f1812b.f1897J[2]);
                    if (a4 != null) {
                        mo2490a(this.f1818h, a4, this.f1812b.f1897J[2].mo2514b());
                    }
                    C0423d a5 = mo2486a(this.f1812b.f1897J[3]);
                    if (a5 != null) {
                        mo2490a(this.f1819i, a5, -this.f1812b.f1897J[3].mo2514b());
                    }
                    this.f1818h.f1781b = true;
                    this.f1819i.f1781b = true;
                }
                if (this.f1812b.mo2530F()) {
                    mo2490a(this.f1808k, this.f1818h, this.f1812b.mo2567c());
                }
            }
        }
        if (this.f1815e.f1789j || this.f1814d != C0446b.MATCH_CONSTRAINT) {
            this.f1815e.mo2477a((Dependency) this);
        } else {
            C0444f fVar4 = this.f1812b;
            int i = fVar4.f1936l;
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
            } else if (i == 3 && !fVar4.mo2533I()) {
                C0444f fVar5 = this.f1812b;
                if (fVar5.f1934k != 3) {
                    C0425e eVar3 = fVar5.f1920d.f1815e;
                    this.f1815e.f1791l.add(eVar3);
                    eVar3.f1790k.add(this.f1815e);
                    C0425e eVar4 = this.f1815e;
                    eVar4.f1781b = true;
                    eVar4.f1790k.add(this.f1818h);
                    this.f1815e.f1790k.add(this.f1819i);
                }
            }
        }
        C0444f fVar6 = this.f1812b;
        C0439e[] eVarArr3 = fVar6.f1897J;
        if (eVarArr3[2].f1855d == null || eVarArr3[3].f1855d == null) {
            C0444f fVar7 = this.f1812b;
            C0439e[] eVarArr4 = fVar7.f1897J;
            if (eVarArr4[2].f1855d != null) {
                C0423d a6 = mo2486a(eVarArr4[2]);
                if (a6 != null) {
                    mo2490a(this.f1818h, a6, this.f1812b.f1897J[2].mo2514b());
                    mo2491a(this.f1819i, this.f1818h, 1, this.f1815e);
                    if (this.f1812b.mo2530F()) {
                        mo2491a(this.f1808k, this.f1818h, 1, this.f1809l);
                    }
                    if (this.f1814d == C0446b.MATCH_CONSTRAINT && this.f1812b.mo2581g() > 0.0f) {
                        C0428h hVar = this.f1812b.f1920d;
                        if (hVar.f1814d == C0446b.MATCH_CONSTRAINT) {
                            hVar.f1815e.f1790k.add(this.f1815e);
                            this.f1815e.f1791l.add(this.f1812b.f1920d.f1815e);
                            this.f1815e.f1780a = this;
                        }
                    }
                }
            } else if (eVarArr4[3].f1855d != null) {
                C0423d a7 = mo2486a(eVarArr4[3]);
                if (a7 != null) {
                    mo2490a(this.f1819i, a7, -this.f1812b.f1897J[3].mo2514b());
                    mo2491a(this.f1818h, this.f1819i, -1, this.f1815e);
                    if (this.f1812b.mo2530F()) {
                        mo2491a(this.f1808k, this.f1818h, 1, this.f1809l);
                    }
                }
            } else if (eVarArr4[4].f1855d != null) {
                C0423d a8 = mo2486a(eVarArr4[4]);
                if (a8 != null) {
                    mo2490a(this.f1808k, a8, 0);
                    mo2491a(this.f1818h, this.f1808k, -1, this.f1809l);
                    mo2491a(this.f1819i, this.f1818h, 1, this.f1815e);
                }
            } else if (!(fVar7 instanceof Helper) && fVar7.mo2601q() != null) {
                mo2490a(this.f1818h, this.f1812b.mo2601q().f1922e.f1818h, 0);
                mo2491a(this.f1819i, this.f1818h, 1, this.f1815e);
                if (this.f1812b.mo2530F()) {
                    mo2491a(this.f1808k, this.f1818h, 1, this.f1809l);
                }
                if (this.f1814d == C0446b.MATCH_CONSTRAINT && this.f1812b.mo2581g() > 0.0f) {
                    C0428h hVar2 = this.f1812b.f1920d;
                    if (hVar2.f1814d == C0446b.MATCH_CONSTRAINT) {
                        hVar2.f1815e.f1790k.add(this.f1815e);
                        this.f1815e.f1791l.add(this.f1812b.f1920d.f1815e);
                        this.f1815e.f1780a = this;
                    }
                }
            }
        } else {
            if (fVar6.mo2533I()) {
                this.f1818h.f1785f = this.f1812b.f1897J[2].mo2514b();
                this.f1819i.f1785f = -this.f1812b.f1897J[3].mo2514b();
            } else {
                C0423d a9 = mo2486a(this.f1812b.f1897J[2]);
                C0423d a10 = mo2486a(this.f1812b.f1897J[3]);
                a9.mo2477a((Dependency) this);
                a10.mo2477a((Dependency) this);
                this.f1820j = C0435b.CENTER;
            }
            if (this.f1812b.mo2530F()) {
                mo2491a(this.f1808k, this.f1818h, 1, this.f1809l);
            }
        }
        if (this.f1815e.f1791l.size() == 0) {
            this.f1815e.f1782c = true;
        }
    }

    /* renamed from: b */
    public void mo2462b() {
        this.f1812b.mo2592l(this.f1818h.f1786g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2463c() {
        this.f1813c = null;
        this.f1818h.mo2475a();
        this.f1819i.mo2475a();
        this.f1808k.mo2475a();
        this.f1815e.mo2475a();
        this.f1817g = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo2465e() {
        if (this.f1814d != C0446b.MATCH_CONSTRAINT || this.f1812b.f1936l == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2483f() {
        this.f1817g = false;
        this.f1818h.f1789j = false;
        this.f1819i.f1789j = false;
        this.f1808k.f1789j = false;
        this.f1815e.f1789j = false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerticalRun ");
        sb.append(this.f1812b.mo2580f());
        return sb.toString();
    }

    public void update(Dependency dependency) {
        int i;
        float f;
        float f2;
        float f3;
        int i2 = C0432a.f1810a[this.f1820j.ordinal()];
        if (i2 == 1) {
            mo2492b(dependency);
        } else if (i2 == 2) {
            mo2488a(dependency);
        } else if (i2 == 3) {
            C0444f fVar = this.f1812b;
            mo2489a(dependency, fVar.f1884C, fVar.f1888E, 1);
            return;
        }
        C0425e eVar = this.f1815e;
        if (eVar.f1782c && !eVar.f1789j && this.f1814d == C0446b.MATCH_CONSTRAINT) {
            C0444f fVar2 = this.f1812b;
            int i3 = fVar2.f1936l;
            if (i3 == 2) {
                C0444f q = fVar2.mo2601q();
                if (q != null) {
                    C0425e eVar2 = q.f1922e.f1815e;
                    if (eVar2.f1789j) {
                        this.f1815e.mo2476a((int) ((((float) eVar2.f1786g) * this.f1812b.f1950s) + 0.5f));
                    }
                }
            } else if (i3 == 3 && fVar2.f1920d.f1815e.f1789j) {
                int h = fVar2.mo2583h();
                if (h == -1) {
                    C0444f fVar3 = this.f1812b;
                    f3 = (float) fVar3.f1920d.f1815e.f1786g;
                    f2 = fVar3.mo2581g();
                } else if (h == 0) {
                    C0444f fVar4 = this.f1812b;
                    f = ((float) fVar4.f1920d.f1815e.f1786g) * fVar4.mo2581g();
                    i = (int) (f + 0.5f);
                    this.f1815e.mo2476a(i);
                } else if (h != 1) {
                    i = 0;
                    this.f1815e.mo2476a(i);
                } else {
                    C0444f fVar5 = this.f1812b;
                    f3 = (float) fVar5.f1920d.f1815e.f1786g;
                    f2 = fVar5.mo2581g();
                }
                f = f3 / f2;
                i = (int) (f + 0.5f);
                this.f1815e.mo2476a(i);
            }
        }
        C0423d dVar = this.f1818h;
        if (dVar.f1782c) {
            C0423d dVar2 = this.f1819i;
            if (dVar2.f1782c && (!dVar.f1789j || !dVar2.f1789j || !this.f1815e.f1789j)) {
                if (!this.f1815e.f1789j && this.f1814d == C0446b.MATCH_CONSTRAINT) {
                    C0444f fVar6 = this.f1812b;
                    if (fVar6.f1934k == 0 && !fVar6.mo2533I()) {
                        C0423d dVar3 = (C0423d) this.f1819i.f1791l.get(0);
                        int i4 = ((C0423d) this.f1818h.f1791l.get(0)).f1786g;
                        C0423d dVar4 = this.f1818h;
                        int i5 = i4 + dVar4.f1785f;
                        int i6 = dVar3.f1786g + this.f1819i.f1785f;
                        int i7 = i6 - i5;
                        dVar4.mo2476a(i5);
                        this.f1819i.mo2476a(i6);
                        this.f1815e.mo2476a(i7);
                        return;
                    }
                }
                if (!this.f1815e.f1789j && this.f1814d == C0446b.MATCH_CONSTRAINT && this.f1811a == 1 && this.f1818h.f1791l.size() > 0 && this.f1819i.f1791l.size() > 0) {
                    int i8 = ((C0423d) this.f1818h.f1791l.get(0)).f1786g + this.f1818h.f1785f;
                    int i9 = (((C0423d) this.f1819i.f1791l.get(0)).f1786g + this.f1819i.f1785f) - i8;
                    C0425e eVar3 = this.f1815e;
                    int i10 = eVar3.f1801m;
                    if (i9 < i10) {
                        eVar3.mo2476a(i9);
                    } else {
                        eVar3.mo2476a(i10);
                    }
                }
                if (this.f1815e.f1789j && this.f1818h.f1791l.size() > 0 && this.f1819i.f1791l.size() > 0) {
                    C0423d dVar5 = (C0423d) this.f1818h.f1791l.get(0);
                    C0423d dVar6 = (C0423d) this.f1819i.f1791l.get(0);
                    int i11 = dVar5.f1786g + this.f1818h.f1785f;
                    int i12 = dVar6.f1786g + this.f1819i.f1785f;
                    float w = this.f1812b.mo2614w();
                    if (dVar5 == dVar6) {
                        i11 = dVar5.f1786g;
                        i12 = dVar6.f1786g;
                        w = 0.5f;
                    }
                    this.f1818h.mo2476a((int) (((float) i11) + 0.5f + (((float) ((i12 - i11) - this.f1815e.f1786g)) * w)));
                    this.f1819i.mo2476a(this.f1818h.f1786g + this.f1815e.f1786g);
                }
            }
        }
    }
}
