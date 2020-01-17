package androidx.constraintlayout.solver.widgets.analyzer;

import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0451j;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.f */
class C0426f extends C0433k {
    public C0426f(C0444f fVar) {
        super(fVar);
        fVar.f1920d.mo2463c();
        fVar.f1922e.mo2463c();
        this.f1816f = ((C0451j) fVar).mo2496Q();
    }

    /* renamed from: a */
    private void m1861a(C0423d dVar) {
        this.f1818h.f1790k.add(dVar);
        dVar.f1791l.add(this.f1818h);
    }

    /* renamed from: b */
    public void mo2462b() {
        if (((C0451j) this.f1812b).mo2496Q() == 1) {
            this.f1812b.mo2590k(this.f1818h.f1786g);
        } else {
            this.f1812b.mo2592l(this.f1818h.f1786g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2463c() {
        this.f1818h.mo2475a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo2465e() {
        return false;
    }

    public void update(Dependency dependency) {
        C0423d dVar = this.f1818h;
        if (dVar.f1782c && !dVar.f1789j) {
            this.f1818h.mo2476a((int) ((((float) ((C0423d) dVar.f1791l.get(0)).f1786g) * ((C0451j) this.f1812b).mo2650T()) + 0.5f));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2461a() {
        C0451j jVar = (C0451j) this.f1812b;
        int R = jVar.mo2648R();
        int S = jVar.mo2649S();
        jVar.mo2650T();
        if (jVar.mo2496Q() == 1) {
            if (R != -1) {
                this.f1818h.f1791l.add(this.f1812b.f1900M.f1920d.f1818h);
                this.f1812b.f1900M.f1920d.f1818h.f1790k.add(this.f1818h);
                this.f1818h.f1785f = R;
            } else if (S != -1) {
                this.f1818h.f1791l.add(this.f1812b.f1900M.f1920d.f1819i);
                this.f1812b.f1900M.f1920d.f1819i.f1790k.add(this.f1818h);
                this.f1818h.f1785f = -S;
            } else {
                C0423d dVar = this.f1818h;
                dVar.f1781b = true;
                dVar.f1791l.add(this.f1812b.f1900M.f1920d.f1819i);
                this.f1812b.f1900M.f1920d.f1819i.f1790k.add(this.f1818h);
            }
            m1861a(this.f1812b.f1920d.f1818h);
            m1861a(this.f1812b.f1920d.f1819i);
            return;
        }
        if (R != -1) {
            this.f1818h.f1791l.add(this.f1812b.f1900M.f1922e.f1818h);
            this.f1812b.f1900M.f1922e.f1818h.f1790k.add(this.f1818h);
            this.f1818h.f1785f = R;
        } else if (S != -1) {
            this.f1818h.f1791l.add(this.f1812b.f1900M.f1922e.f1819i);
            this.f1812b.f1900M.f1922e.f1819i.f1790k.add(this.f1818h);
            this.f1818h.f1785f = -S;
        } else {
            C0423d dVar2 = this.f1818h;
            dVar2.f1781b = true;
            dVar2.f1791l.add(this.f1812b.f1900M.f1922e.f1819i);
            this.f1812b.f1900M.f1922e.f1819i.f1790k.add(this.f1818h);
        }
        m1861a(this.f1812b.f1922e.f1818h);
        m1861a(this.f1812b.f1922e.f1819i);
    }
}
