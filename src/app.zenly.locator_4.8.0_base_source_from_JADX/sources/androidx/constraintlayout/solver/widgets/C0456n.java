package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import p214e.p229f.p232b.C7600e;
import p214e.p229f.p232b.C7602f;
import p214e.p229f.p232b.C7605i;

/* renamed from: androidx.constraintlayout.solver.widgets.n */
public class C0456n extends C0458p {

    /* renamed from: c */
    C0439e f2038c;

    /* renamed from: d */
    C0456n f2039d;

    /* renamed from: e */
    float f2040e;

    /* renamed from: f */
    C0456n f2041f;

    /* renamed from: g */
    float f2042g;

    /* renamed from: h */
    int f2043h = 0;

    /* renamed from: i */
    private C0456n f2044i;

    /* renamed from: j */
    private C0457o f2045j = null;

    /* renamed from: k */
    private int f2046k = 1;

    /* renamed from: l */
    private C0457o f2047l = null;

    /* renamed from: m */
    private int f2048m = 1;

    public C0456n(C0439e eVar) {
        this.f2038c = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo2652a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void mo2654a(C0456n nVar, float f) {
        if (this.f2051b == 0 || !(this.f2041f == nVar || this.f2042g == f)) {
            this.f2041f = nVar;
            this.f2042g = f;
            if (this.f2051b == 1) {
                mo2667b();
            }
            mo2665a();
        }
    }

    /* renamed from: b */
    public void mo2658b(int i) {
        this.f2043h = i;
    }

    /* renamed from: c */
    public void mo2661c() {
        super.mo2661c();
        this.f2039d = null;
        this.f2040e = 0.0f;
        this.f2045j = null;
        this.f2046k = 1;
        this.f2047l = null;
        this.f2048m = 1;
        this.f2041f = null;
        this.f2042g = 0.0f;
        this.f2044i = null;
        this.f2043h = 0;
    }

    /* renamed from: d */
    public void mo2662d() {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = true;
        if (this.f2051b != 1 && this.f2043h != 4) {
            C0457o oVar = this.f2045j;
            if (oVar != null) {
                if (oVar.f2051b == 1) {
                    this.f2040e = ((float) this.f2046k) * oVar.f2049c;
                } else {
                    return;
                }
            }
            C0457o oVar2 = this.f2047l;
            if (oVar2 != null) {
                if (oVar2.f2051b == 1) {
                    float f5 = oVar2.f2049c;
                } else {
                    return;
                }
            }
            if (this.f2043h == 1) {
                C0456n nVar = this.f2039d;
                if (nVar == null || nVar.f2051b == 1) {
                    C0456n nVar2 = this.f2039d;
                    if (nVar2 == null) {
                        this.f2041f = this;
                        this.f2042g = this.f2040e;
                    } else {
                        this.f2041f = nVar2.f2041f;
                        this.f2042g = nVar2.f2042g + this.f2040e;
                    }
                    mo2665a();
                }
            }
            if (this.f2043h == 2) {
                C0456n nVar3 = this.f2039d;
                if (nVar3 != null && nVar3.f2051b == 1) {
                    C0456n nVar4 = this.f2044i;
                    if (nVar4 != null) {
                        C0456n nVar5 = nVar4.f2039d;
                        if (nVar5 != null && nVar5.f2051b == 1) {
                            if (C7600e.m18455h() != null) {
                                C7602f h = C7600e.m18455h();
                                h.f19163w++;
                            }
                            this.f2041f = this.f2039d.f2041f;
                            C0456n nVar6 = this.f2044i;
                            nVar6.f2041f = nVar6.f2039d.f2041f;
                            C0443d dVar = this.f2038c.f1854c;
                            int i = 0;
                            if (!(dVar == C0443d.RIGHT || dVar == C0443d.BOTTOM)) {
                                z = false;
                            }
                            if (z) {
                                f2 = this.f2039d.f2042g;
                                f = this.f2044i.f2039d.f2042g;
                            } else {
                                f2 = this.f2044i.f2039d.f2042g;
                                f = this.f2039d.f2042g;
                            }
                            float f6 = f2 - f;
                            C0439e eVar = this.f2038c;
                            C0443d dVar2 = eVar.f1854c;
                            if (dVar2 == C0443d.LEFT || dVar2 == C0443d.RIGHT) {
                                f4 = f6 - ((float) this.f2038c.f1853b.mo2525A());
                                f3 = this.f2038c.f1853b.f1927g0;
                            } else {
                                f4 = f6 - ((float) eVar.f1853b.mo2589k());
                                f3 = this.f2038c.f1853b.f1929h0;
                            }
                            int b = this.f2038c.mo2514b();
                            int b2 = this.f2044i.f2038c.mo2514b();
                            if (this.f2038c.mo2520h() == this.f2044i.f2038c.mo2520h()) {
                                f3 = 0.5f;
                                b2 = 0;
                            } else {
                                i = b;
                            }
                            float f7 = (float) i;
                            float f8 = (float) b2;
                            float f9 = (f4 - f7) - f8;
                            if (z) {
                                C0456n nVar7 = this.f2044i;
                                nVar7.f2042g = nVar7.f2039d.f2042g + f8 + (f9 * f3);
                                this.f2042g = (this.f2039d.f2042g - f7) - (f9 * (1.0f - f3));
                            } else {
                                this.f2042g = this.f2039d.f2042g + f7 + (f9 * f3);
                                C0456n nVar8 = this.f2044i;
                                nVar8.f2042g = (nVar8.f2039d.f2042g - f8) - (f9 * (1.0f - f3));
                            }
                            mo2665a();
                            this.f2044i.mo2665a();
                        }
                    }
                }
            }
            if (this.f2043h == 3) {
                C0456n nVar9 = this.f2039d;
                if (nVar9 != null && nVar9.f2051b == 1) {
                    C0456n nVar10 = this.f2044i;
                    if (nVar10 != null) {
                        C0456n nVar11 = nVar10.f2039d;
                        if (nVar11 != null && nVar11.f2051b == 1) {
                            if (C7600e.m18455h() != null) {
                                C7602f h2 = C7600e.m18455h();
                                h2.f19164x++;
                            }
                            C0456n nVar12 = this.f2039d;
                            this.f2041f = nVar12.f2041f;
                            C0456n nVar13 = this.f2044i;
                            C0456n nVar14 = nVar13.f2039d;
                            nVar13.f2041f = nVar14.f2041f;
                            this.f2042g = nVar12.f2042g + this.f2040e;
                            nVar13.f2042g = nVar14.f2042g + nVar13.f2040e;
                            mo2665a();
                            this.f2044i.mo2665a();
                        }
                    }
                }
            }
            if (this.f2043h == 5) {
                this.f2038c.f1853b.mo2495M();
            }
        }
    }

    /* renamed from: e */
    public void mo2663e() {
        C0439e h = this.f2038c.mo2520h();
        if (h != null) {
            if (h.mo2520h() == this.f2038c) {
                this.f2043h = 4;
                h.mo2517e().f2043h = 4;
            }
            int b = this.f2038c.mo2514b();
            C0443d dVar = this.f2038c.f1854c;
            if (dVar == C0443d.RIGHT || dVar == C0443d.BOTTOM) {
                b = -b;
            }
            mo2655a(h.mo2517e(), b);
        }
    }

    public String toString() {
        if (this.f2051b == 1) {
            String str = ", RESOLVED: ";
            String str2 = "[";
            if (this.f2041f == this) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(this.f2038c);
                sb.append(str);
                sb.append(this.f2042g);
                sb.append("]  type: ");
                sb.append(mo2652a(this.f2043h));
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(this.f2038c);
            sb2.append(str);
            sb2.append(this.f2041f);
            sb2.append(":");
            sb2.append(this.f2042g);
            sb2.append("] type: ");
            sb2.append(mo2652a(this.f2043h));
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("{ ");
        sb3.append(this.f2038c);
        sb3.append(" UNRESOLVED} type: ");
        sb3.append(mo2652a(this.f2043h));
        return sb3.toString();
    }

    /* renamed from: b */
    public void mo2659b(C0456n nVar, float f) {
        this.f2044i = nVar;
    }

    /* renamed from: b */
    public void mo2660b(C0456n nVar, int i, C0457o oVar) {
        this.f2044i = nVar;
        this.f2047l = oVar;
        this.f2048m = i;
    }

    /* renamed from: a */
    public void mo2653a(int i, C0456n nVar, int i2) {
        this.f2043h = i;
        this.f2039d = nVar;
        this.f2040e = (float) i2;
        this.f2039d.mo2666a(this);
    }

    /* renamed from: a */
    public void mo2655a(C0456n nVar, int i) {
        this.f2039d = nVar;
        this.f2040e = (float) i;
        this.f2039d.mo2666a(this);
    }

    /* renamed from: a */
    public void mo2656a(C0456n nVar, int i, C0457o oVar) {
        this.f2039d = nVar;
        this.f2039d.mo2666a(this);
        this.f2045j = oVar;
        this.f2046k = i;
        this.f2045j.mo2666a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2657a(C7600e eVar) {
        C7605i f = this.f2038c.mo2518f();
        C0456n nVar = this.f2041f;
        if (nVar == null) {
            eVar.mo19706a(f, (int) (this.f2042g + 0.5f));
        } else {
            eVar.mo19698a(f, eVar.mo19701a((Object) nVar.f2038c), (int) (this.f2042g + 0.5f), 6);
        }
    }
}
