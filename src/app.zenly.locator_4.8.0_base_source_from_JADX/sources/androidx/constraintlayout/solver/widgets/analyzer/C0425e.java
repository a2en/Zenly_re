package androidx.constraintlayout.solver.widgets.analyzer;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.e */
class C0425e extends C0423d {

    /* renamed from: m */
    public int f1801m;

    public C0425e(C0433k kVar) {
        super(kVar);
        if (kVar instanceof C0428h) {
            this.f1784e = C0424a.HORIZONTAL_DIMENSION;
        } else {
            this.f1784e = C0424a.VERTICAL_DIMENSION;
        }
    }

    /* renamed from: a */
    public void mo2476a(int i) {
        if (!this.f1789j) {
            this.f1789j = true;
            this.f1786g = i;
            for (Dependency dependency : this.f1790k) {
                dependency.update(dependency);
            }
        }
    }
}
