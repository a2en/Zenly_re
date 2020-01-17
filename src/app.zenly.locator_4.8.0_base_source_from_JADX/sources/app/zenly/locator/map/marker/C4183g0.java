package app.zenly.locator.map.marker;

import androidx.core.util.C0605g;
import androidx.core.util.Pools$Pool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

/* renamed from: app.zenly.locator.map.marker.g0 */
class C4183g0 {

    /* renamed from: a */
    private final Comparator<C4178e0> f11182a = C4263u.f11437e;

    /* renamed from: b */
    private final ArrayList<C4178e0> f11183b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C4185b> f11184c = new ArrayList<>();

    /* renamed from: d */
    private final Pools$Pool<C4185b> f11185d = new C0605g(500);

    /* renamed from: e */
    private final float[] f11186e = new float[2];

    /* renamed from: app.zenly.locator.map.marker.g0$b */
    private static class C4185b {

        /* renamed from: a */
        float f11187a;

        /* renamed from: b */
        float f11188b;

        /* renamed from: c */
        float f11189c;

        private C4185b() {
        }

        /* renamed from: a */
        public void mo11131a(float f, float f2, float f3) {
            this.f11187a = f;
            this.f11188b = f2;
            this.f11189c = f3;
        }
    }

    C4183g0() {
    }

    /* renamed from: a */
    public void mo11130a(Collection<C4178e0> collection) {
        for (int i = 0; i < this.f11184c.size(); i++) {
            this.f11185d.release(this.f11184c.get(i));
        }
        this.f11184c.clear();
        this.f11183b.clear();
        for (C4178e0 e0Var : collection) {
            if (e0Var.mo11112g() != null && e0Var.mo11020B()) {
                this.f11183b.add(e0Var);
            }
        }
        Collections.sort(this.f11183b, this.f11182a);
        for (int i2 = 0; i2 < this.f11183b.size(); i2++) {
            C4178e0 e0Var2 = (C4178e0) this.f11183b.get(i2);
            C4185b a = m12469a(e0Var2);
            e0Var2.mo11041j(m12470a(a));
            if (!e0Var2.mo11124y()) {
                this.f11184c.add(a);
            }
        }
    }

    /* renamed from: a */
    private C4185b m12469a(C4178e0 e0Var) {
        MarkerView markerView = (MarkerView) Objects.requireNonNull(e0Var.mo11112g());
        float significantAreaRadius = markerView.getSignificantAreaRadius() * 1.0f;
        markerView.mo10879a(this.f11186e);
        float[] fArr = this.f11186e;
        float f = fArr[0];
        float f2 = fArr[1];
        C4185b bVar = (C4185b) this.f11185d.acquire();
        if (bVar == null) {
            bVar = new C4185b();
        }
        bVar.mo11131a(f, f2, significantAreaRadius);
        return bVar;
    }

    /* renamed from: a */
    private boolean m12470a(C4185b bVar) {
        for (int i = 0; i < this.f11184c.size(); i++) {
            if (m12471a(bVar, (C4185b) this.f11184c.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m12471a(C4185b bVar, C4185b bVar2) {
        float f = bVar.f11187a - bVar2.f11187a;
        float f2 = bVar.f11188b - bVar2.f11188b;
        float f3 = bVar.f11189c + bVar2.f11189c;
        return (f * f) + (f2 * f2) <= f3 * f3;
    }
}
