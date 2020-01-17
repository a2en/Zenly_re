package app.zenly.locator.map.p111j1;

import app.zenly.locator.core.util.C3225m;
import app.zenly.locator.map.marker.C4178e0;
import app.zenly.locator.p143s.p150n.C5459d;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.j1.b */
public final class C4080b implements Comparable<C4080b> {

    /* renamed from: e */
    private final float f10699e = C3225m.m10225a(this.f10702h.mo13060b(), this.f10702h.mo13062c(), this.f10701g.mo11114k().mo13060b(), this.f10701g.mo11114k().mo13062c());

    /* renamed from: f */
    private final float f10700f;

    /* renamed from: g */
    private final C4178e0<?> f10701g;

    /* renamed from: h */
    private final C5459d f10702h;

    /* renamed from: i */
    private final float f10703i;

    public C4080b(C4178e0<?> e0Var, C5459d dVar, float f) {
        C12932j.m33818b(e0Var, "marker");
        C12932j.m33818b(dVar, "position");
        this.f10701g = e0Var;
        this.f10702h = dVar;
        this.f10703i = f;
        float f2 = this.f10699e;
        this.f10700f = f2 - ((f2 / 2.0f) * this.f10703i);
    }

    /* renamed from: a */
    public final float mo10738a() {
        return this.f10699e;
    }

    /* renamed from: b */
    public final C4178e0<?> mo10740b() {
        return this.f10701g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (java.lang.Float.compare(r2.f10703i, r3.f10703i) == 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof app.zenly.locator.map.p111j1.C4080b
            if (r0 == 0) goto L_0x0027
            app.zenly.locator.map.j1.b r3 = (app.zenly.locator.map.p111j1.C4080b) r3
            app.zenly.locator.map.marker.e0<?> r0 = r2.f10701g
            app.zenly.locator.map.marker.e0<?> r1 = r3.f10701g
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0027
            app.zenly.locator.s.n.d r0 = r2.f10702h
            app.zenly.locator.s.n.d r1 = r3.f10702h
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0027
            float r0 = r2.f10703i
            float r3 = r3.f10703i
            int r3 = java.lang.Float.compare(r0, r3)
            if (r3 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.p111j1.C4080b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C4178e0<?> e0Var = this.f10701g;
        int i = 0;
        int hashCode = (e0Var != null ? e0Var.hashCode() : 0) * 31;
        C5459d dVar = this.f10702h;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return ((hashCode + i) * 31) + Float.valueOf(this.f10703i).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MarkerDistanceRank(marker=");
        sb.append(this.f10701g);
        sb.append(", position=");
        sb.append(this.f10702h);
        sb.append(", weight=");
        sb.append(this.f10703i);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public int compareTo(C4080b bVar) {
        C12932j.m33818b(bVar, "other");
        return (int) Math.signum(this.f10700f - bVar.f10700f);
    }
}
