package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0436b;
import androidx.constraintlayout.solver.widgets.C0444f;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.g */
class C0427g extends C0433k {
    public C0427g(C0444f fVar) {
        super(fVar);
    }

    /* renamed from: a */
    private void m1866a(C0423d dVar) {
        this.f1818h.f1790k.add(dVar);
        dVar.f1791l.add(this.f1818h);
    }

    /* renamed from: b */
    public void mo2462b() {
        int R = ((C0436b) this.f1812b).mo2497R();
        if (R == 0 || R == 1) {
            this.f1812b.mo2590k(this.f1818h.f1786g);
        } else {
            this.f1812b.mo2592l(this.f1818h.f1786g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2463c() {
        this.f1813c = null;
        this.f1818h.mo2475a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo2465e() {
        return false;
    }

    public void update(Dependency dependency) {
        C0436b bVar = (C0436b) this.f1812b;
        int R = bVar.mo2497R();
        int i = -1;
        int i2 = 0;
        for (C0423d dVar : this.f1818h.f1791l) {
            int i3 = dVar.f1786g;
            if (i == -1 || i3 < i) {
                i = i3;
            }
            if (i2 < i3) {
                i2 = i3;
            }
        }
        if (R == 0 || R == 2) {
            this.f1818h.mo2476a(i + bVar.mo2498S());
        } else {
            this.f1818h.mo2476a(i2 + bVar.mo2498S());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2461a() {
        C0444f fVar = this.f1812b;
        if (fVar instanceof C0436b) {
            this.f1818h.f1781b = true;
            C0436b bVar = (C0436b) fVar;
            int R = bVar.mo2497R();
            boolean Q = bVar.mo2496Q();
            int i = 0;
            if (R == 0) {
                this.f1818h.f1784e = C0424a.LEFT;
                while (i < bVar.f2036K0) {
                    C0444f fVar2 = bVar.f2035J0[i];
                    if (Q || fVar2.mo2620z() != 8) {
                        C0423d dVar = fVar2.f1920d.f1818h;
                        dVar.f1790k.add(this.f1818h);
                        this.f1818h.f1791l.add(dVar);
                    }
                    i++;
                }
                m1866a(this.f1812b.f1920d.f1818h);
                m1866a(this.f1812b.f1920d.f1819i);
            } else if (R == 1) {
                this.f1818h.f1784e = C0424a.RIGHT;
                while (i < bVar.f2036K0) {
                    C0444f fVar3 = bVar.f2035J0[i];
                    if (Q || fVar3.mo2620z() != 8) {
                        C0423d dVar2 = fVar3.f1920d.f1819i;
                        dVar2.f1790k.add(this.f1818h);
                        this.f1818h.f1791l.add(dVar2);
                    }
                    i++;
                }
                m1866a(this.f1812b.f1920d.f1818h);
                m1866a(this.f1812b.f1920d.f1819i);
            } else if (R == 2) {
                this.f1818h.f1784e = C0424a.TOP;
                while (i < bVar.f2036K0) {
                    C0444f fVar4 = bVar.f2035J0[i];
                    if (Q || fVar4.mo2620z() != 8) {
                        C0423d dVar3 = fVar4.f1922e.f1818h;
                        dVar3.f1790k.add(this.f1818h);
                        this.f1818h.f1791l.add(dVar3);
                    }
                    i++;
                }
                m1866a(this.f1812b.f1922e.f1818h);
                m1866a(this.f1812b.f1922e.f1819i);
            } else if (R == 3) {
                this.f1818h.f1784e = C0424a.BOTTOM;
                while (i < bVar.f2036K0) {
                    C0444f fVar5 = bVar.f2035J0[i];
                    if (Q || fVar5.mo2620z() != 8) {
                        C0423d dVar4 = fVar5.f1922e.f1819i;
                        dVar4.f1790k.add(this.f1818h);
                        this.f1818h.f1791l.add(dVar4);
                    }
                    i++;
                }
                m1866a(this.f1812b.f1922e.f1818h);
                m1866a(this.f1812b.f1922e.f1819i);
            }
        }
    }
}
