package androidx.constraintlayout.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.p */
public class C0458p {

    /* renamed from: a */
    HashSet<C0458p> f2050a = new HashSet<>(2);

    /* renamed from: b */
    int f2051b = 0;

    /* renamed from: a */
    public void mo2666a(C0458p pVar) {
        this.f2050a.add(pVar);
    }

    /* renamed from: b */
    public void mo2667b() {
        this.f2051b = 0;
        Iterator it = this.f2050a.iterator();
        while (it.hasNext()) {
            ((C0458p) it.next()).mo2667b();
        }
    }

    /* renamed from: c */
    public void mo2661c() {
        this.f2051b = 0;
        this.f2050a.clear();
    }

    /* renamed from: d */
    public void mo2662d() {
    }

    /* renamed from: a */
    public void mo2665a() {
        this.f2051b = 1;
        Iterator it = this.f2050a.iterator();
        while (it.hasNext()) {
            ((C0458p) it.next()).mo2662d();
        }
    }
}
