package androidx.constraintlayout.solver.widgets.analyzer;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.constraintlayout.solver.widgets.analyzer.d */
public class C0423d implements Dependency {

    /* renamed from: a */
    public Dependency f1780a = null;

    /* renamed from: b */
    public boolean f1781b = false;

    /* renamed from: c */
    public boolean f1782c = false;

    /* renamed from: d */
    C0433k f1783d;

    /* renamed from: e */
    C0424a f1784e = C0424a.UNKNOWN;

    /* renamed from: f */
    int f1785f;

    /* renamed from: g */
    public int f1786g;

    /* renamed from: h */
    int f1787h = 1;

    /* renamed from: i */
    C0425e f1788i = null;

    /* renamed from: j */
    public boolean f1789j = false;

    /* renamed from: k */
    List<Dependency> f1790k = new ArrayList();

    /* renamed from: l */
    List<C0423d> f1791l = new ArrayList();

    /* renamed from: androidx.constraintlayout.solver.widgets.analyzer.d$a */
    enum C0424a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C0423d(C0433k kVar) {
        this.f1783d = kVar;
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1783d.f1812b.mo2580f());
        sb.append(":");
        sb.append(this.f1784e);
        sb.append("(");
        sb.append(this.f1789j ? Integer.valueOf(this.f1786g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1791l.size());
        sb.append(":d=");
        sb.append(this.f1790k.size());
        sb.append(">");
        return sb.toString();
    }

    public void update(Dependency dependency) {
        for (C0423d dVar : this.f1791l) {
            if (!dVar.f1789j) {
                return;
            }
        }
        this.f1782c = true;
        Dependency dependency2 = this.f1780a;
        if (dependency2 != null) {
            dependency2.update(this);
        }
        if (this.f1781b) {
            this.f1783d.update(this);
            return;
        }
        C0423d dVar2 = null;
        int i = 0;
        for (C0423d dVar3 : this.f1791l) {
            if (!(dVar3 instanceof C0425e)) {
                i++;
                dVar2 = dVar3;
            }
        }
        if (dVar2 != null && i == 1 && dVar2.f1789j) {
            C0425e eVar = this.f1788i;
            if (eVar != null) {
                if (eVar.f1789j) {
                    this.f1785f = this.f1787h * eVar.f1786g;
                } else {
                    return;
                }
            }
            mo2476a(dVar2.f1786g + this.f1785f);
        }
        Dependency dependency3 = this.f1780a;
        if (dependency3 != null) {
            dependency3.update(this);
        }
    }

    /* renamed from: a */
    public void mo2477a(Dependency dependency) {
        this.f1790k.add(dependency);
        if (this.f1789j) {
            dependency.update(dependency);
        }
    }

    /* renamed from: a */
    public void mo2475a() {
        this.f1791l.clear();
        this.f1790k.clear();
        this.f1789j = false;
        this.f1786g = 0;
        this.f1782c = false;
        this.f1781b = false;
    }
}
