package app.zenly.locator.p086e0.p087a.p091l;

import app.zenly.locator.p086e0.p087a.C3619h;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.e0.a.l.a */
public final class C3656a extends C11722a {

    /* renamed from: f */
    private final C3662g f9794f;

    public C3656a(C3662g gVar) {
        C12932j.m33818b(gVar, "type");
        super(C3619h.PROFILE_OTHER_DISABLED, 1);
        this.f9794f = gVar;
    }

    /* renamed from: d */
    public final C3662g mo10146d() {
        return this.f9794f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f9794f, (java.lang.Object) ((app.zenly.locator.p086e0.p087a.p091l.C3656a) r2).f9794f) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.p086e0.p087a.p091l.C3656a
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.e0.a.l.a r2 = (app.zenly.locator.p086e0.p087a.p091l.C3656a) r2
            app.zenly.locator.e0.a.l.g r0 = r1.f9794f
            app.zenly.locator.e0.a.l.g r2 = r2.f9794f
            boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p086e0.p087a.p091l.C3656a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C3662g gVar = this.f9794f;
        if (gVar != null) {
            return gVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileOtherDisabledViewModel(type=");
        sb.append(this.f9794f);
        sb.append(")");
        return sb.toString();
    }
}
