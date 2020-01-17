package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.d */
public class C0438d {

    /* renamed from: a */
    protected C0444f f1831a;

    /* renamed from: b */
    protected C0444f f1832b;

    /* renamed from: c */
    protected C0444f f1833c;

    /* renamed from: d */
    protected C0444f f1834d;

    /* renamed from: e */
    protected C0444f f1835e;

    /* renamed from: f */
    protected C0444f f1836f;

    /* renamed from: g */
    protected C0444f f1837g;

    /* renamed from: h */
    protected ArrayList<C0444f> f1838h;

    /* renamed from: i */
    protected int f1839i;

    /* renamed from: j */
    protected int f1840j;

    /* renamed from: k */
    protected float f1841k = 0.0f;

    /* renamed from: l */
    int f1842l;

    /* renamed from: m */
    int f1843m;

    /* renamed from: n */
    int f1844n;

    /* renamed from: o */
    boolean f1845o;

    /* renamed from: p */
    private int f1846p;

    /* renamed from: q */
    private boolean f1847q = false;

    /* renamed from: r */
    protected boolean f1848r;

    /* renamed from: s */
    protected boolean f1849s;

    /* renamed from: t */
    protected boolean f1850t;

    /* renamed from: u */
    private boolean f1851u;

    public C0438d(C0444f fVar, int i, boolean z) {
        this.f1831a = fVar;
        this.f1846p = i;
        this.f1847q = z;
    }

    /* renamed from: a */
    private static boolean m1914a(C0444f fVar, int i) {
        if (fVar.mo2620z() != 8 && fVar.f1899L[i] == C0446b.MATCH_CONSTRAINT) {
            int[] iArr = fVar.f1938m;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m1915b() {
        int i = this.f1846p * 2;
        C0444f fVar = this.f1831a;
        boolean z = true;
        this.f1845o = true;
        C0444f fVar2 = fVar;
        C0444f fVar3 = fVar2;
        boolean z2 = false;
        while (!z2) {
            this.f1839i++;
            C0444f[] fVarArr = fVar2.f1891F0;
            int i2 = this.f1846p;
            C0444f fVar4 = null;
            fVarArr[i2] = null;
            fVar2.f1889E0[i2] = null;
            if (fVar2.mo2620z() != 8) {
                this.f1842l++;
                if (fVar2.mo2568c(this.f1846p) != C0446b.MATCH_CONSTRAINT) {
                    this.f1843m += fVar2.mo2574d(this.f1846p);
                }
                this.f1843m += fVar2.f1897J[i].mo2514b();
                int i3 = i + 1;
                this.f1843m += fVar2.f1897J[i3].mo2514b();
                this.f1844n += fVar2.f1897J[i].mo2514b();
                this.f1844n += fVar2.f1897J[i3].mo2514b();
                if (this.f1832b == null) {
                    this.f1832b = fVar2;
                }
                this.f1834d = fVar2;
                C0446b[] bVarArr = fVar2.f1899L;
                int i4 = this.f1846p;
                if (bVarArr[i4] == C0446b.MATCH_CONSTRAINT) {
                    int[] iArr = fVar2.f1938m;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.f1840j++;
                        float[] fArr = fVar2.f1887D0;
                        int i5 = this.f1846p;
                        float f = fArr[i5];
                        if (f > 0.0f) {
                            this.f1841k += fArr[i5];
                        }
                        if (m1914a(fVar2, this.f1846p)) {
                            if (f < 0.0f) {
                                this.f1848r = true;
                            } else {
                                this.f1849s = true;
                            }
                            if (this.f1838h == null) {
                                this.f1838h = new ArrayList<>();
                            }
                            this.f1838h.add(fVar2);
                        }
                        if (this.f1836f == null) {
                            this.f1836f = fVar2;
                        }
                        C0444f fVar5 = this.f1837g;
                        if (fVar5 != null) {
                            fVar5.f1889E0[this.f1846p] = fVar2;
                        }
                        this.f1837g = fVar2;
                    }
                    if (this.f1846p == 0) {
                        if (fVar2.f1934k != 0) {
                            this.f1845o = false;
                        } else if (!(fVar2.f1940n == 0 && fVar2.f1942o == 0)) {
                            this.f1845o = false;
                        }
                    } else if (fVar2.f1936l != 0) {
                        this.f1845o = false;
                    } else if (!(fVar2.f1946q == 0 && fVar2.f1948r == 0)) {
                        this.f1845o = false;
                    }
                    if (fVar2.f1903P != 0.0f) {
                        this.f1845o = false;
                    }
                }
            }
            if (fVar3 != fVar2) {
                fVar3.f1891F0[this.f1846p] = fVar2;
            }
            C0439e eVar = fVar2.f1897J[i + 1].f1855d;
            if (eVar != null) {
                C0444f fVar6 = eVar.f1853b;
                C0439e[] eVarArr = fVar6.f1897J;
                if (eVarArr[i].f1855d != null && eVarArr[i].f1855d.f1853b == fVar2) {
                    fVar4 = fVar6;
                }
            }
            if (fVar4 == null) {
                fVar4 = fVar2;
                z2 = true;
            }
            fVar3 = fVar2;
            fVar2 = fVar4;
        }
        C0444f fVar7 = this.f1832b;
        if (fVar7 != null) {
            this.f1843m -= fVar7.f1897J[i].mo2514b();
        }
        C0444f fVar8 = this.f1834d;
        if (fVar8 != null) {
            this.f1843m -= fVar8.f1897J[i + 1].mo2514b();
        }
        this.f1833c = fVar2;
        if (this.f1846p != 0 || !this.f1847q) {
            this.f1835e = this.f1831a;
        } else {
            this.f1835e = this.f1833c;
        }
        if (!this.f1849s || !this.f1848r) {
            z = false;
        }
        this.f1850t = z;
    }

    /* renamed from: a */
    public void mo2505a() {
        if (!this.f1851u) {
            m1915b();
        }
        this.f1851u = true;
    }
}
