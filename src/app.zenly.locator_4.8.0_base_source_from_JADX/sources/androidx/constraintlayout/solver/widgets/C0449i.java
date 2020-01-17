package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import java.util.HashMap;
import p214e.p229f.p232b.C7600e;

/* renamed from: androidx.constraintlayout.solver.widgets.i */
public class C0449i extends C0461r {
    /* access modifiers changed from: private */

    /* renamed from: Q0 */
    public int f1996Q0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: R0 */
    public int f1997R0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: S0 */
    public int f1998S0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: T0 */
    public int f1999T0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: U0 */
    public float f2000U0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: V0 */
    public float f2001V0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public float f2002W0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: X0 */
    public float f2003X0 = 0.5f;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public int f2004Y0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: Z0 */
    public int f2005Z0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: a1 */
    public int f2006a1 = 2;
    /* access modifiers changed from: private */

    /* renamed from: b1 */
    public int f2007b1 = 2;

    /* renamed from: c1 */
    private int f2008c1 = 0;

    /* renamed from: d1 */
    private int f2009d1 = -1;

    /* renamed from: e1 */
    private int f2010e1 = 0;

    /* renamed from: f1 */
    private ArrayList<C0450a> f2011f1 = new ArrayList<>();

    /* renamed from: g1 */
    private C0444f[] f2012g1 = null;

    /* renamed from: h1 */
    private C0444f[] f2013h1 = null;

    /* renamed from: i1 */
    private int[] f2014i1 = null;

    /* renamed from: androidx.constraintlayout.solver.widgets.i$a */
    private class C0450a {

        /* renamed from: a */
        private int f2015a;

        /* renamed from: b */
        private C0444f f2016b;

        /* renamed from: c */
        private C0439e f2017c;

        /* renamed from: d */
        private C0439e f2018d;

        /* renamed from: e */
        private C0439e f2019e;

        /* renamed from: f */
        private C0439e f2020f;

        /* renamed from: g */
        private int f2021g;

        /* renamed from: h */
        private int f2022h;

        /* renamed from: i */
        private int f2023i;

        /* renamed from: j */
        private int f2024j;

        /* renamed from: k */
        private int f2025k;

        /* renamed from: l */
        private int f2026l;

        /* renamed from: m */
        final /* synthetic */ C0449i f2027m;

        /* renamed from: a */
        public void mo2645a(boolean z, int i, boolean z2) {
            int i2 = this.f2026l;
            for (int i3 = 0; i3 < i2; i3++) {
                this.f2027m.f2035J0[this.f2025k + i3].mo2535K();
            }
            if (i2 != 0 && this.f2016b != null) {
                boolean z3 = z2 && i == 0;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                while (i4 < i2) {
                    if (this.f2027m.f2035J0[this.f2025k + (z ? (i2 - 1) - i4 : i4)].mo2620z() == 0) {
                        if (i5 == -1) {
                            i5 = i4;
                        }
                        i6 = i4;
                    }
                    i4++;
                }
                C0444f fVar = null;
                if (this.f2015a == 0) {
                    C0444f fVar2 = this.f2016b;
                    fVar2.mo2606s(this.f2027m.f1997R0);
                    int i7 = this.f2022h;
                    if (i > 0) {
                        i7 += this.f2027m.f2005Z0;
                    }
                    fVar2.f1884C.mo2510a(this.f2018d, i7);
                    if (z2) {
                        fVar2.f1888E.mo2510a(this.f2020f, this.f2024j);
                    }
                    if (i > 0) {
                        this.f2018d.f1853b.f1888E.mo2510a(fVar2.f1884C, 0);
                    }
                    int i8 = 0;
                    while (i8 < i2) {
                        C0444f fVar3 = this.f2027m.f2035J0[this.f2025k + (z ? (i2 - 1) - i8 : i8)];
                        if (i8 == 0) {
                            fVar3.mo2546a(fVar3.f1882B, this.f2017c, this.f2021g);
                            int h = this.f2027m.f1996Q0;
                            float i9 = this.f2027m.f2000U0;
                            if (this.f2025k == 0 && this.f2027m.f1998S0 != -1) {
                                h = this.f2027m.f1998S0;
                                i9 = this.f2027m.f2002W0;
                            }
                            fVar3.mo2596n(h);
                            fVar3.mo2540a(i9);
                        }
                        if (i8 == i2 - 1) {
                            fVar3.mo2546a(fVar3.f1886D, this.f2019e, this.f2023i);
                        }
                        if (fVar != null) {
                            fVar3.f1882B.mo2510a(fVar.f1886D, this.f2027m.f2004Y0);
                            if (i8 == i5) {
                                fVar3.f1882B.mo2507a(this.f2021g);
                            }
                            fVar.f1886D.mo2510a(fVar3.f1882B, 0);
                            if (i8 == i6 + 1) {
                                fVar.f1886D.mo2507a(this.f2023i);
                            }
                        }
                        if (fVar3 != fVar2) {
                            if (this.f2027m.f2007b1 != 3 || !fVar2.mo2530F() || !fVar3.mo2530F()) {
                                int l = this.f2027m.f2007b1;
                                if (l == 0) {
                                    fVar3.f1884C.mo2510a(fVar2.f1884C, 0);
                                } else if (l == 1) {
                                    fVar3.f1888E.mo2510a(fVar2.f1888E, 0);
                                } else if (z3) {
                                    fVar3.f1884C.mo2510a(this.f2018d, this.f2022h);
                                    fVar3.f1888E.mo2510a(this.f2020f, this.f2024j);
                                } else {
                                    fVar3.f1884C.mo2510a(fVar2.f1884C, 0);
                                    fVar3.f1888E.mo2510a(fVar2.f1888E, 0);
                                }
                            } else {
                                fVar3.f1890F.mo2510a(fVar2.f1890F, 0);
                            }
                        }
                        i8++;
                        fVar = fVar3;
                    }
                    return;
                }
                C0444f fVar4 = this.f2016b;
                fVar4.mo2596n(this.f2027m.f1997R0);
                int i10 = this.f2021g;
                if (i > 0) {
                    i10 += this.f2027m.f2004Y0;
                }
                if (z) {
                    fVar4.f1886D.mo2510a(this.f2019e, i10);
                    if (z2) {
                        fVar4.f1882B.mo2510a(this.f2017c, this.f2023i);
                    }
                    if (i > 0) {
                        this.f2019e.f1853b.f1882B.mo2510a(fVar4.f1886D, 0);
                    }
                } else {
                    fVar4.f1882B.mo2510a(this.f2017c, i10);
                    if (z2) {
                        fVar4.f1886D.mo2510a(this.f2019e, this.f2023i);
                    }
                    if (i > 0) {
                        this.f2017c.f1853b.f1886D.mo2510a(fVar4.f1882B, 0);
                    }
                }
                int i11 = 0;
                while (i11 < i2) {
                    C0444f fVar5 = this.f2027m.f2035J0[this.f2025k + i11];
                    if (i11 == 0) {
                        fVar5.mo2546a(fVar5.f1884C, this.f2018d, this.f2022h);
                        int g = this.f2027m.f1997R0;
                        float c = this.f2027m.f2001V0;
                        if (this.f2025k == 0 && this.f2027m.f1999T0 != -1) {
                            g = this.f2027m.f1999T0;
                            c = this.f2027m.f2003X0;
                        }
                        fVar5.mo2606s(g);
                        fVar5.mo2569c(c);
                    }
                    if (i11 == i2 - 1) {
                        fVar5.mo2546a(fVar5.f1888E, this.f2020f, this.f2024j);
                    }
                    if (fVar != null) {
                        fVar5.f1884C.mo2510a(fVar.f1888E, this.f2027m.f2005Z0);
                        if (i11 == i5) {
                            fVar5.f1884C.mo2507a(this.f2022h);
                        }
                        fVar.f1888E.mo2510a(fVar5.f1884C, 0);
                        if (i11 == i6 + 1) {
                            fVar.f1888E.mo2507a(this.f2024j);
                        }
                    }
                    if (fVar5 != fVar4) {
                        if (z) {
                            int f = this.f2027m.f2006a1;
                            if (f == 0) {
                                fVar5.f1886D.mo2510a(fVar4.f1886D, 0);
                            } else if (f == 1) {
                                fVar5.f1882B.mo2510a(fVar4.f1882B, 0);
                            } else if (f == 2) {
                                fVar5.f1882B.mo2510a(fVar4.f1882B, 0);
                                fVar5.f1886D.mo2510a(fVar4.f1886D, 0);
                            }
                        } else {
                            int f2 = this.f2027m.f2006a1;
                            if (f2 == 0) {
                                fVar5.f1882B.mo2510a(fVar4.f1882B, 0);
                            } else if (f2 == 1) {
                                fVar5.f1886D.mo2510a(fVar4.f1886D, 0);
                            } else if (f2 == 2) {
                                if (z3) {
                                    fVar5.f1882B.mo2510a(this.f2017c, this.f2021g);
                                    fVar5.f1886D.mo2510a(this.f2019e, this.f2023i);
                                } else {
                                    fVar5.f1882B.mo2510a(fVar4.f1882B, 0);
                                    fVar5.f1886D.mo2510a(fVar4.f1886D, 0);
                                }
                            }
                        }
                    }
                    i11++;
                    fVar = fVar5;
                }
            }
        }
    }

    /* renamed from: e */
    private void m2077e(boolean z) {
        if (this.f2014i1 != null && this.f2013h1 != null && this.f2012g1 != null) {
            for (int i = 0; i < this.f2036K0; i++) {
                this.f2035J0[i].mo2535K();
            }
            int[] iArr = this.f2014i1;
            int i2 = iArr[0];
            int i3 = iArr[1];
            C0444f fVar = null;
            for (int i4 = 0; i4 < i2; i4++) {
                C0444f fVar2 = this.f2013h1[z ? (i2 - i4) - 1 : i4];
                if (fVar2 != null) {
                    if (i4 == 0) {
                        fVar2.mo2546a(fVar2.f1882B, this.f1882B, mo2673S());
                        fVar2.mo2596n(this.f1996Q0);
                        fVar2.mo2540a(this.f2000U0);
                    }
                    if (i4 == i2 - 1) {
                        fVar2.mo2546a(fVar2.f1886D, this.f1886D, mo2674T());
                    }
                    if (i4 > 0) {
                        fVar2.mo2546a(fVar2.f1882B, fVar.f1886D, this.f2004Y0);
                        fVar.mo2546a(fVar.f1886D, fVar2.f1882B, 0);
                    }
                    fVar = fVar2;
                }
            }
            for (int i5 = 0; i5 < i3; i5++) {
                C0444f fVar3 = this.f2012g1[i5];
                if (fVar3 != null) {
                    if (i5 == 0) {
                        fVar3.mo2546a(fVar3.f1884C, this.f1884C, mo2675U());
                        fVar3.mo2606s(this.f1997R0);
                        fVar3.mo2569c(this.f2001V0);
                    }
                    if (i5 == i3 - 1) {
                        fVar3.mo2546a(fVar3.f1888E, this.f1888E, mo2672R());
                    }
                    if (i5 > 0) {
                        fVar3.mo2546a(fVar3.f1884C, fVar.f1888E, this.f2005Z0);
                        fVar.mo2546a(fVar.f1888E, fVar3.f1884C, 0);
                    }
                    fVar = fVar3;
                }
            }
            for (int i6 = 0; i6 < i2; i6++) {
                for (int i7 = 0; i7 < i3; i7++) {
                    int i8 = (i7 * i2) + i6;
                    if (this.f2010e1 == 1) {
                        i8 = (i6 * i3) + i7;
                    }
                    C0444f[] fVarArr = this.f2035J0;
                    if (i8 < fVarArr.length) {
                        C0444f fVar4 = fVarArr[i8];
                        if (fVar4 != null) {
                            C0444f fVar5 = this.f2013h1[i6];
                            C0444f fVar6 = this.f2012g1[i7];
                            if (fVar4 != fVar5) {
                                fVar4.mo2546a(fVar4.f1882B, fVar5.f1882B, 0);
                                fVar4.mo2546a(fVar4.f1886D, fVar5.f1886D, 0);
                            }
                            if (fVar4 != fVar6) {
                                fVar4.mo2546a(fVar4.f1884C, fVar6.f1884C, 0);
                                fVar4.mo2546a(fVar4.f1888E, fVar6.f1888E, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2500a(C0444f fVar, HashMap<C0444f, C0444f> hashMap) {
        super.mo2500a(fVar, hashMap);
        C0449i iVar = (C0449i) fVar;
        this.f1996Q0 = iVar.f1996Q0;
        this.f1997R0 = iVar.f1997R0;
        this.f1998S0 = iVar.f1998S0;
        this.f1999T0 = iVar.f1999T0;
        this.f2000U0 = iVar.f2000U0;
        this.f2001V0 = iVar.f2001V0;
        this.f2002W0 = iVar.f2002W0;
        this.f2003X0 = iVar.f2003X0;
        this.f2004Y0 = iVar.f2004Y0;
        this.f2005Z0 = iVar.f2005Z0;
        this.f2006a1 = iVar.f2006a1;
        this.f2007b1 = iVar.f2007b1;
        this.f2008c1 = iVar.f2008c1;
        this.f2009d1 = iVar.f2009d1;
        this.f2010e1 = iVar.f2010e1;
    }

    /* renamed from: a */
    public void mo2501a(C7600e eVar) {
        super.mo2501a(eVar);
        boolean Z = mo2601q() != null ? ((C0447g) mo2601q()).mo2628Z() : false;
        int i = this.f2008c1;
        if (i != 0) {
            if (i == 1) {
                int size = this.f2011f1.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C0450a) this.f2011f1.get(i2)).mo2645a(Z, i2, i2 == size + -1);
                    i2++;
                }
            } else if (i == 2) {
                m2077e(Z);
            }
        } else if (this.f2011f1.size() > 0) {
            ((C0450a) this.f2011f1.get(0)).mo2645a(Z, 0, true);
        }
        mo2677d(false);
    }
}
