package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;
import p214e.p229f.p232b.C7598c;

/* renamed from: androidx.constraintlayout.solver.widgets.s */
public class C0462s extends C0444f {

    /* renamed from: J0 */
    public ArrayList<C0444f> f2067J0 = new ArrayList<>();

    /* renamed from: J */
    public void mo2534J() {
        this.f2067J0.clear();
        super.mo2534J();
    }

    /* renamed from: O */
    public void mo2537O() {
        super.mo2537O();
        ArrayList<C0444f> arrayList = this.f2067J0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0444f fVar = (C0444f) this.f2067J0.get(i);
                fVar.mo2560b(mo2585i(), mo2587j());
                if (!(fVar instanceof C0447g)) {
                    fVar.mo2537O();
                }
            }
        }
    }

    /* renamed from: Q */
    public ArrayList<C0444f> mo2496Q() {
        return this.f2067J0;
    }

    /* renamed from: R */
    public C0447g mo2678R() {
        C0444f q = mo2601q();
        C0447g gVar = this instanceof C0447g ? (C0447g) this : null;
        while (q != null) {
            C0444f q2 = q.mo2601q();
            if (q instanceof C0447g) {
                gVar = (C0447g) q;
            }
            q = q2;
        }
        return gVar;
    }

    /* renamed from: S */
    public void mo2622S() {
        mo2537O();
        ArrayList<C0444f> arrayList = this.f2067J0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0444f fVar = (C0444f) this.f2067J0.get(i);
                if (fVar instanceof C0462s) {
                    ((C0462s) fVar).mo2622S();
                }
            }
        }
    }

    /* renamed from: T */
    public void mo2679T() {
        this.f2067J0.clear();
    }

    /* renamed from: a */
    public void mo2551a(C7598c cVar) {
        super.mo2551a(cVar);
        int size = this.f2067J0.size();
        for (int i = 0; i < size; i++) {
            ((C0444f) this.f2067J0.get(i)).mo2551a(cVar);
        }
    }

    public void add(C0444f fVar) {
        this.f2067J0.add(fVar);
        if (fVar.mo2601q() != null) {
            ((C0462s) fVar.mo2601q()).mo2681c(fVar);
        }
        fVar.mo2563b((C0444f) this);
    }

    /* renamed from: b */
    public void mo2560b(int i, int i2) {
        super.mo2560b(i, i2);
        int size = this.f2067J0.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0444f) this.f2067J0.get(i3)).mo2560b(mo2610u(), mo2612v());
        }
    }

    /* renamed from: c */
    public void mo2681c(C0444f fVar) {
        this.f2067J0.remove(fVar);
        fVar.mo2563b((C0444f) null);
    }
}
