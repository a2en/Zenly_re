package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0439e;
import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0444f.C0446b;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.k */
public abstract class C0433k implements Dependency {

    /* renamed from: a */
    public int f1811a;

    /* renamed from: b */
    C0444f f1812b;

    /* renamed from: c */
    C0430i f1813c;

    /* renamed from: d */
    protected C0446b f1814d;

    /* renamed from: e */
    C0425e f1815e = new C0425e(this);

    /* renamed from: f */
    public int f1816f = 0;

    /* renamed from: g */
    boolean f1817g = false;

    /* renamed from: h */
    public C0423d f1818h = new C0423d(this);

    /* renamed from: i */
    public C0423d f1819i = new C0423d(this);

    /* renamed from: j */
    protected C0435b f1820j = C0435b.NONE;

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.k$a */
    static /* synthetic */ class C0434a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1821a = new int[C0443d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.e$d[] r0 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1821a = r0
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BASELINE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f1821a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0434a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.k$b */
    enum C0435b {
        NONE,
        START,
        END,
        CENTER
    }

    public C0433k(C0444f fVar) {
        this.f1812b = fVar;
    }

    /* renamed from: b */
    private void m1886b(int i, int i2) {
        int i3;
        int i4 = this.f1811a;
        if (i4 == 0) {
            this.f1815e.mo2476a(mo2485a(i2, i));
        } else if (i4 == 1) {
            this.f1815e.mo2476a(Math.min(mo2485a(this.f1815e.f1801m, i), i2));
        } else if (i4 == 2) {
            C0444f q = this.f1812b.mo2601q();
            if (q != null) {
                C0433k kVar = i == 0 ? q.f1920d : q.f1922e;
                if (kVar.f1815e.f1789j) {
                    C0444f fVar = this.f1812b;
                    this.f1815e.mo2476a(mo2485a((int) ((((float) kVar.f1815e.f1786g) * (i == 0 ? fVar.f1944p : fVar.f1950s)) + 0.5f), i));
                }
            }
        } else if (i4 == 3) {
            C0444f fVar2 = this.f1812b;
            C0428h hVar = fVar2.f1920d;
            C0446b bVar = hVar.f1814d;
            C0446b bVar2 = C0446b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && hVar.f1811a == 3) {
                C0431j jVar = fVar2.f1922e;
                if (jVar.f1814d == bVar2 && jVar.f1811a == 3) {
                    return;
                }
            }
            C0444f fVar3 = this.f1812b;
            C0433k kVar2 = i == 0 ? fVar3.f1922e : fVar3.f1920d;
            if (kVar2.f1815e.f1789j) {
                float g = this.f1812b.mo2581g();
                if (i == 1) {
                    i3 = (int) ((((float) kVar2.f1815e.f1786g) / g) + 0.5f);
                } else {
                    i3 = (int) ((g * ((float) kVar2.f1815e.f1786g)) + 0.5f);
                }
                this.f1815e.mo2476a(i3);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0423d mo2486a(C0439e eVar) {
        C0439e eVar2 = eVar.f1855d;
        C0423d dVar = null;
        if (eVar2 == null) {
            return null;
        }
        C0444f fVar = eVar2.f1853b;
        int i = C0434a.f1821a[eVar2.f1854c.ordinal()];
        if (i == 1) {
            dVar = fVar.f1920d.f1818h;
        } else if (i == 2) {
            dVar = fVar.f1920d.f1819i;
        } else if (i == 3) {
            dVar = fVar.f1922e.f1818h;
        } else if (i == 4) {
            dVar = fVar.f1922e.f1808k;
        } else if (i == 5) {
            dVar = fVar.f1922e.f1819i;
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo2461a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2488a(Dependency dependency) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo2462b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2492b(Dependency dependency) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract void mo2463c();

    /* renamed from: d */
    public long mo2464d() {
        C0425e eVar = this.f1815e;
        if (eVar.f1789j) {
            return (long) eVar.f1786g;
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract boolean mo2465e();

    public void update(Dependency dependency) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2489a(Dependency dependency, C0439e eVar, C0439e eVar2, int i) {
        float f;
        C0423d a = mo2486a(eVar);
        C0423d a2 = mo2486a(eVar2);
        if (a.f1789j && a2.f1789j) {
            int b = a.f1786g + eVar.mo2514b();
            int b2 = a2.f1786g - eVar2.mo2514b();
            int i2 = b2 - b;
            if (!this.f1815e.f1789j && this.f1814d == C0446b.MATCH_CONSTRAINT) {
                m1886b(i, i2);
            }
            C0425e eVar3 = this.f1815e;
            if (eVar3.f1789j) {
                if (eVar3.f1786g == i2) {
                    this.f1818h.mo2476a(b);
                    this.f1819i.mo2476a(b2);
                    return;
                }
                C0444f fVar = this.f1812b;
                if (i == 0) {
                    f = fVar.mo2591l();
                } else {
                    f = fVar.mo2614w();
                }
                if (a == a2) {
                    b = a.f1786g;
                    b2 = a2.f1786g;
                    f = 0.5f;
                }
                this.f1818h.mo2476a((int) (((float) b) + 0.5f + (((float) ((b2 - b) - this.f1815e.f1786g)) * f)));
                this.f1819i.mo2476a(this.f1818h.f1786g + this.f1815e.f1786g);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo2485a(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C0444f fVar = this.f1812b;
            int i4 = fVar.f1942o;
            i3 = Math.max(fVar.f1940n, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C0444f fVar2 = this.f1812b;
            int i5 = fVar2.f1948r;
            int max = Math.max(fVar2.f1946q, i);
            if (i5 > 0) {
                max = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r3 != 5) goto L_0x002d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.solver.widgets.analyzer.C0423d mo2487a(androidx.constraintlayout.solver.widgets.C0439e r3, int r4) {
        /*
            r2 = this;
            androidx.constraintlayout.solver.widgets.e r0 = r3.f1855d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            androidx.constraintlayout.solver.widgets.f r0 = r0.f1853b
            if (r4 != 0) goto L_0x000d
            androidx.constraintlayout.solver.widgets.analyzer.h r4 = r0.f1920d
            goto L_0x000f
        L_0x000d:
            androidx.constraintlayout.solver.widgets.analyzer.j r4 = r0.f1922e
        L_0x000f:
            androidx.constraintlayout.solver.widgets.e r3 = r3.f1855d
            androidx.constraintlayout.solver.widgets.e$d r3 = r3.f1854c
            int[] r0 = androidx.constraintlayout.solver.widgets.analyzer.C0433k.C0434a.f1821a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L_0x002b
            r0 = 2
            if (r3 == r0) goto L_0x0028
            r0 = 3
            if (r3 == r0) goto L_0x002b
            r0 = 5
            if (r3 == r0) goto L_0x0028
            goto L_0x002d
        L_0x0028:
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r4.f1819i
            goto L_0x002d
        L_0x002b:
            androidx.constraintlayout.solver.widgets.analyzer.d r1 = r4.f1818h
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.analyzer.C0433k.mo2487a(androidx.constraintlayout.solver.widgets.e, int):androidx.constraintlayout.solver.widgets.analyzer.d");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2490a(C0423d dVar, C0423d dVar2, int i) {
        dVar.f1791l.add(dVar2);
        dVar.f1785f = i;
        dVar2.f1790k.add(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2491a(C0423d dVar, C0423d dVar2, int i, C0425e eVar) {
        dVar.f1791l.add(dVar2);
        dVar.f1791l.add(this.f1815e);
        dVar.f1787h = i;
        dVar.f1788i = eVar;
        dVar2.f1790k.add(dVar);
        eVar.f1790k.add(dVar);
    }
}
