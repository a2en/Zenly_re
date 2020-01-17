package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import java.util.HashMap;
import p214e.p229f.p232b.C7600e;
import p214e.p229f.p232b.C7602f;

/* renamed from: androidx.constraintlayout.solver.widgets.b */
public class C0436b extends C0453k {

    /* renamed from: L0 */
    private int f1827L0 = 0;

    /* renamed from: M0 */
    private ArrayList<C0456n> f1828M0 = new ArrayList<>(4);

    /* renamed from: N0 */
    private boolean f1829N0 = true;

    /* renamed from: O0 */
    private int f1830O0 = 0;

    /* renamed from: A */
    public void mo2493A(int i) {
        this.f1830O0 = i;
    }

    /* renamed from: L */
    public void mo2494L() {
        super.mo2494L();
        this.f1828M0.clear();
    }

    /* renamed from: M */
    public void mo2495M() {
        C0456n nVar;
        float f;
        C0456n nVar2;
        int i = this.f1827L0;
        float f2 = Float.MAX_VALUE;
        if (i != 0) {
            if (i == 1) {
                nVar = this.f1886D.mo2517e();
            } else if (i == 2) {
                nVar = this.f1884C.mo2517e();
            } else if (i == 3) {
                nVar = this.f1888E.mo2517e();
            } else {
                return;
            }
            f2 = 0.0f;
        } else {
            nVar = this.f1882B.mo2517e();
        }
        int size = this.f1828M0.size();
        C0456n nVar3 = null;
        int i2 = 0;
        while (i2 < size) {
            C0456n nVar4 = (C0456n) this.f1828M0.get(i2);
            if (nVar4.f2051b == 1) {
                int i3 = this.f1827L0;
                if (i3 == 0 || i3 == 2) {
                    f = nVar4.f2042g;
                    if (f < f2) {
                        nVar2 = nVar4.f2041f;
                    } else {
                        i2++;
                    }
                } else {
                    f = nVar4.f2042g;
                    if (f > f2) {
                        nVar2 = nVar4.f2041f;
                    } else {
                        i2++;
                    }
                }
                nVar3 = nVar2;
                f2 = f;
                i2++;
            } else {
                return;
            }
        }
        float f3 = f2 + ((float) this.f1830O0);
        if (C7600e.m18455h() != null) {
            C7602f h = C7600e.m18455h();
            h.f19166z++;
        }
        nVar.f2041f = nVar3;
        nVar.f2042g = f3;
        nVar.mo2665a();
        int i4 = this.f1827L0;
        if (i4 == 0) {
            this.f1886D.mo2517e().mo2654a(nVar3, f3);
        } else if (i4 == 1) {
            this.f1882B.mo2517e().mo2654a(nVar3, f3);
        } else if (i4 == 2) {
            this.f1888E.mo2517e().mo2654a(nVar3, f3);
        } else if (i4 == 3) {
            this.f1884C.mo2517e().mo2654a(nVar3, f3);
        }
    }

    /* renamed from: Q */
    public boolean mo2496Q() {
        return this.f1829N0;
    }

    /* renamed from: R */
    public int mo2497R() {
        return this.f1827L0;
    }

    /* renamed from: S */
    public int mo2498S() {
        return this.f1830O0;
    }

    /* renamed from: a */
    public void mo2499a(int i) {
        C0456n nVar;
        C0458p pVar;
        C0444f fVar = this.f1900M;
        if (fVar != null && ((C0447g) fVar).mo2504z(2)) {
            int i2 = this.f1827L0;
            if (i2 == 0) {
                nVar = this.f1882B.mo2517e();
            } else if (i2 == 1) {
                nVar = this.f1886D.mo2517e();
            } else if (i2 == 2) {
                nVar = this.f1884C.mo2517e();
            } else if (i2 == 3) {
                nVar = this.f1888E.mo2517e();
            } else {
                return;
            }
            nVar.mo2658b(5);
            int i3 = this.f1827L0;
            if (i3 == 0 || i3 == 1) {
                this.f1884C.mo2517e().mo2654a((C0456n) null, 0.0f);
                this.f1888E.mo2517e().mo2654a((C0456n) null, 0.0f);
            } else {
                this.f1882B.mo2517e().mo2654a((C0456n) null, 0.0f);
                this.f1886D.mo2517e().mo2654a((C0456n) null, 0.0f);
            }
            this.f1828M0.clear();
            for (int i4 = 0; i4 < this.f2036K0; i4++) {
                C0444f fVar2 = this.f2035J0[i4];
                if (this.f1829N0 || fVar2.mo2502a()) {
                    int i5 = this.f1827L0;
                    if (i5 == 0) {
                        pVar = fVar2.f1882B.mo2517e();
                    } else if (i5 == 1) {
                        pVar = fVar2.f1886D.mo2517e();
                    } else if (i5 == 2) {
                        pVar = fVar2.f1884C.mo2517e();
                    } else if (i5 != 3) {
                        pVar = null;
                    } else {
                        pVar = fVar2.f1888E.mo2517e();
                    }
                    if (pVar != null) {
                        this.f1828M0.add(pVar);
                        pVar.mo2666a(nVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo2502a() {
        return true;
    }

    /* renamed from: d */
    public void mo2503d(boolean z) {
        this.f1829N0 = z;
    }

    /* renamed from: z */
    public void mo2504z(int i) {
        this.f1827L0 = i;
    }

    /* renamed from: a */
    public void mo2500a(C0444f fVar, HashMap<C0444f, C0444f> hashMap) {
        super.mo2500a(fVar, hashMap);
        C0436b bVar = (C0436b) fVar;
        this.f1827L0 = bVar.f1827L0;
        this.f1829N0 = bVar.f1829N0;
        this.f1830O0 = bVar.f1830O0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r1 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2501a(p214e.p229f.p232b.C7600e r11) {
        /*
            r10 = this;
            androidx.constraintlayout.solver.widgets.e[] r0 = r10.f1897J
            androidx.constraintlayout.solver.widgets.e r1 = r10.f1882B
            r2 = 0
            r0[r2] = r1
            androidx.constraintlayout.solver.widgets.e r1 = r10.f1884C
            r3 = 2
            r0[r3] = r1
            androidx.constraintlayout.solver.widgets.e r1 = r10.f1886D
            r4 = 1
            r0[r4] = r1
            androidx.constraintlayout.solver.widgets.e r1 = r10.f1888E
            r5 = 3
            r0[r5] = r1
            r0 = 0
        L_0x0017:
            androidx.constraintlayout.solver.widgets.e[] r1 = r10.f1897J
            int r6 = r1.length
            if (r0 >= r6) goto L_0x0029
            r6 = r1[r0]
            r1 = r1[r0]
            e.f.b.i r1 = r11.mo19701a(r1)
            r6.f1860i = r1
            int r0 = r0 + 1
            goto L_0x0017
        L_0x0029:
            int r0 = r10.f1827L0
            if (r0 < 0) goto L_0x013e
            r6 = 4
            if (r0 >= r6) goto L_0x013e
            r0 = r1[r0]
            r1 = 0
        L_0x0033:
            int r6 = r10.f2036K0
            if (r1 >= r6) goto L_0x0068
            androidx.constraintlayout.solver.widgets.f[] r6 = r10.f2035J0
            r6 = r6[r1]
            boolean r7 = r10.f1829N0
            if (r7 != 0) goto L_0x0046
            boolean r7 = r6.mo2502a()
            if (r7 != 0) goto L_0x0046
            goto L_0x0065
        L_0x0046:
            int r7 = r10.f1827L0
            if (r7 == 0) goto L_0x004c
            if (r7 != r4) goto L_0x0056
        L_0x004c:
            androidx.constraintlayout.solver.widgets.f$b r7 = r6.mo2595n()
            androidx.constraintlayout.solver.widgets.f$b r8 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r7 != r8) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0069
        L_0x0056:
            int r7 = r10.f1827L0
            if (r7 == r3) goto L_0x005c
            if (r7 != r5) goto L_0x0065
        L_0x005c:
            androidx.constraintlayout.solver.widgets.f$b r6 = r6.mo2618y()
            androidx.constraintlayout.solver.widgets.f$b r7 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x0065
            goto L_0x0054
        L_0x0065:
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0068:
            r1 = 0
        L_0x0069:
            int r6 = r10.f1827L0
            if (r6 == 0) goto L_0x007d
            if (r6 != r4) goto L_0x0070
            goto L_0x007d
        L_0x0070:
            androidx.constraintlayout.solver.widgets.f r6 = r10.mo2601q()
            androidx.constraintlayout.solver.widgets.f$b r6 = r6.mo2618y()
            androidx.constraintlayout.solver.widgets.f$b r7 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r6 != r7) goto L_0x008a
            goto L_0x0089
        L_0x007d:
            androidx.constraintlayout.solver.widgets.f r6 = r10.mo2601q()
            androidx.constraintlayout.solver.widgets.f$b r6 = r6.mo2595n()
            androidx.constraintlayout.solver.widgets.f$b r7 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            if (r6 != r7) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            r6 = 0
        L_0x008b:
            int r7 = r10.f2036K0
            if (r6 >= r7) goto L_0x00c7
            androidx.constraintlayout.solver.widgets.f[] r7 = r10.f2035J0
            r7 = r7[r6]
            boolean r8 = r10.f1829N0
            if (r8 != 0) goto L_0x009e
            boolean r8 = r7.mo2502a()
            if (r8 != 0) goto L_0x009e
            goto L_0x00c4
        L_0x009e:
            androidx.constraintlayout.solver.widgets.e[] r8 = r7.f1897J
            int r9 = r10.f1827L0
            r8 = r8[r9]
            e.f.b.i r8 = r11.mo19701a(r8)
            androidx.constraintlayout.solver.widgets.e[] r7 = r7.f1897J
            int r9 = r10.f1827L0
            r7 = r7[r9]
            r7.f1860i = r8
            if (r9 == 0) goto L_0x00bd
            if (r9 != r3) goto L_0x00b5
            goto L_0x00bd
        L_0x00b5:
            e.f.b.i r7 = r0.f1860i
            int r9 = r10.f1830O0
            r11.mo19708a(r7, r8, r9, r1)
            goto L_0x00c4
        L_0x00bd:
            e.f.b.i r7 = r0.f1860i
            int r9 = r10.f1830O0
            r11.mo19713b(r7, r8, r9, r1)
        L_0x00c4:
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00c7:
            int r0 = r10.f1827L0
            r6 = 5
            r7 = 6
            if (r0 != 0) goto L_0x00e8
            androidx.constraintlayout.solver.widgets.e r0 = r10.f1886D
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.e r3 = r10.f1882B
            e.f.b.i r3 = r3.f1860i
            r11.mo19698a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013e
            androidx.constraintlayout.solver.widgets.e r0 = r10.f1882B
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.f r1 = r10.f1900M
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1886D
            e.f.b.i r1 = r1.f1860i
            r11.mo19698a(r0, r1, r2, r6)
            goto L_0x013e
        L_0x00e8:
            if (r0 != r4) goto L_0x0105
            androidx.constraintlayout.solver.widgets.e r0 = r10.f1882B
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.e r3 = r10.f1886D
            e.f.b.i r3 = r3.f1860i
            r11.mo19698a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013e
            androidx.constraintlayout.solver.widgets.e r0 = r10.f1882B
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.f r1 = r10.f1900M
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1882B
            e.f.b.i r1 = r1.f1860i
            r11.mo19698a(r0, r1, r2, r6)
            goto L_0x013e
        L_0x0105:
            if (r0 != r3) goto L_0x0122
            androidx.constraintlayout.solver.widgets.e r0 = r10.f1888E
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.e r3 = r10.f1884C
            e.f.b.i r3 = r3.f1860i
            r11.mo19698a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013e
            androidx.constraintlayout.solver.widgets.e r0 = r10.f1884C
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.f r1 = r10.f1900M
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1888E
            e.f.b.i r1 = r1.f1860i
            r11.mo19698a(r0, r1, r2, r6)
            goto L_0x013e
        L_0x0122:
            if (r0 != r5) goto L_0x013e
            androidx.constraintlayout.solver.widgets.e r0 = r10.f1884C
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.e r3 = r10.f1888E
            e.f.b.i r3 = r3.f1860i
            r11.mo19698a(r0, r3, r2, r7)
            if (r1 != 0) goto L_0x013e
            androidx.constraintlayout.solver.widgets.e r0 = r10.f1884C
            e.f.b.i r0 = r0.f1860i
            androidx.constraintlayout.solver.widgets.f r1 = r10.f1900M
            androidx.constraintlayout.solver.widgets.e r1 = r1.f1884C
            e.f.b.i r1 = r1.f1860i
            r11.mo19698a(r0, r1, r2, r6)
        L_0x013e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0436b.mo2501a(e.f.b.e):void");
    }
}
