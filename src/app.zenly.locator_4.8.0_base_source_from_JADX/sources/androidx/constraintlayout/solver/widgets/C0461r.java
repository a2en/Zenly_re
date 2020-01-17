package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.C0419a;

/* renamed from: androidx.constraintlayout.solver.widgets.r */
public class C0461r extends C0453k {

    /* renamed from: L0 */
    private int f2062L0 = 0;

    /* renamed from: M0 */
    private int f2063M0 = 0;

    /* renamed from: N0 */
    private int f2064N0 = 0;

    /* renamed from: O0 */
    private int f2065O0 = 0;

    /* renamed from: P0 */
    private boolean f2066P0 = false;

    public C0461r() {
        new C0419a();
    }

    /* renamed from: Q */
    public void mo2496Q() {
        for (int i = 0; i < this.f2036K0; i++) {
            C0444f fVar = this.f2035J0[i];
            if (fVar != null) {
                fVar.mo2572c(true);
            }
        }
    }

    /* renamed from: R */
    public int mo2672R() {
        return this.f2063M0;
    }

    /* renamed from: S */
    public int mo2673S() {
        return this.f2064N0;
    }

    /* renamed from: T */
    public int mo2674T() {
        return this.f2065O0;
    }

    /* renamed from: U */
    public int mo2675U() {
        return this.f2062L0;
    }

    /* renamed from: V */
    public boolean mo2676V() {
        return this.f2066P0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo2677d(boolean z) {
        this.f2066P0 = z;
    }

    public void updateConstraints(C0447g gVar) {
        mo2496Q();
    }
}
