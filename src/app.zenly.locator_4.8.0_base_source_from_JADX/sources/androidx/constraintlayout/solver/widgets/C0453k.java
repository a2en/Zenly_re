package androidx.constraintlayout.solver.widgets;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.solver.widgets.k */
public class C0453k extends C0444f implements Helper {

    /* renamed from: J0 */
    public C0444f[] f2035J0 = new C0444f[4];

    /* renamed from: K0 */
    public int f2036K0 = 0;

    /* renamed from: a */
    public void mo2500a(C0444f fVar, HashMap<C0444f, C0444f> hashMap) {
        super.mo2500a(fVar, hashMap);
        C0453k kVar = (C0453k) fVar;
        this.f2036K0 = 0;
        int i = kVar.f2036K0;
        for (int i2 = 0; i2 < i; i2++) {
            add((C0444f) hashMap.get(kVar.f2035J0[i2]));
        }
        this.f2036K0 = kVar.f2036K0;
    }

    public void add(C0444f fVar) {
        int i = this.f2036K0 + 1;
        C0444f[] fVarArr = this.f2035J0;
        if (i > fVarArr.length) {
            this.f2035J0 = (C0444f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
        }
        C0444f[] fVarArr2 = this.f2035J0;
        int i2 = this.f2036K0;
        fVarArr2[i2] = fVar;
        this.f2036K0 = i2 + 1;
    }

    public void removeAllIds() {
        this.f2036K0 = 0;
        Arrays.fill(this.f2035J0, null);
    }

    public void updateConstraints(C0447g gVar) {
    }
}
