package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0439e.C0442c;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.q */
public class C0459q {

    /* renamed from: a */
    private int f2052a;

    /* renamed from: b */
    private int f2053b;

    /* renamed from: c */
    private int f2054c;

    /* renamed from: d */
    private int f2055d;

    /* renamed from: e */
    private ArrayList<C0460a> f2056e = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.solver.widgets.q$a */
    static class C0460a {

        /* renamed from: a */
        private C0439e f2057a;

        /* renamed from: b */
        private C0439e f2058b;

        /* renamed from: c */
        private int f2059c;

        /* renamed from: d */
        private C0442c f2060d;

        /* renamed from: e */
        private int f2061e;

        public C0460a(C0439e eVar) {
            this.f2057a = eVar;
            this.f2058b = eVar.mo2520h();
            this.f2059c = eVar.mo2514b();
            this.f2060d = eVar.mo2519g();
            this.f2061e = eVar.mo2506a();
        }

        /* renamed from: a */
        public void mo2670a(C0444f fVar) {
            fVar.mo2539a(this.f2057a.mo2521i()).mo2513a(this.f2058b, this.f2059c, this.f2060d, this.f2061e);
        }

        /* renamed from: b */
        public void mo2671b(C0444f fVar) {
            this.f2057a = fVar.mo2539a(this.f2057a.mo2521i());
            C0439e eVar = this.f2057a;
            if (eVar != null) {
                this.f2058b = eVar.mo2520h();
                this.f2059c = this.f2057a.mo2514b();
                this.f2060d = this.f2057a.mo2519g();
                this.f2061e = this.f2057a.mo2506a();
                return;
            }
            this.f2058b = null;
            this.f2059c = 0;
            this.f2060d = C0442c.STRONG;
            this.f2061e = 0;
        }
    }

    public C0459q(C0444f fVar) {
        this.f2052a = fVar.mo2528D();
        this.f2053b = fVar.mo2529E();
        this.f2054c = fVar.mo2525A();
        this.f2055d = fVar.mo2589k();
        ArrayList b = fVar.mo2558b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            this.f2056e.add(new C0460a((C0439e) b.get(i)));
        }
    }

    /* renamed from: a */
    public void mo2668a(C0444f fVar) {
        fVar.mo2617x(this.f2052a);
        fVar.mo2619y(this.f2053b);
        fVar.mo2611u(this.f2054c);
        fVar.mo2594m(this.f2055d);
        int size = this.f2056e.size();
        for (int i = 0; i < size; i++) {
            ((C0460a) this.f2056e.get(i)).mo2670a(fVar);
        }
    }

    /* renamed from: b */
    public void mo2669b(C0444f fVar) {
        this.f2052a = fVar.mo2528D();
        this.f2053b = fVar.mo2529E();
        this.f2054c = fVar.mo2525A();
        this.f2055d = fVar.mo2589k();
        int size = this.f2056e.size();
        for (int i = 0; i < size; i++) {
            ((C0460a) this.f2056e.get(i)).mo2671b(fVar);
        }
    }
}
