package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.C0444f.C0446b;

/* renamed from: androidx.constraintlayout.solver.widgets.a */
public class C0418a {
    /* renamed from: a */
    static int m1832a(C0444f fVar) {
        float f;
        int i = -1;
        if (fVar.f1903P == 0.0f) {
            return -1;
        }
        if (fVar.mo2595n() == C0446b.MATCH_CONSTRAINT) {
            i = (int) (((float) fVar.mo2589k()) * fVar.f1903P);
            fVar.mo2611u(i);
        } else if (fVar.mo2618y() == C0446b.MATCH_CONSTRAINT) {
            if (fVar.f1904Q == -1) {
                f = ((float) fVar.mo2525A()) / fVar.f1903P;
            } else {
                f = ((float) fVar.mo2525A()) * fVar.f1903P;
            }
            i = (int) f;
            fVar.mo2594m(i);
        }
        return i;
    }
}
