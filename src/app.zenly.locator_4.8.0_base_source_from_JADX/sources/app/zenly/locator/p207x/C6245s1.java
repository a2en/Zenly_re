package app.zenly.locator.p207x;

import app.zenly.locator.modals.C4545f2;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.x.s1 */
public final class C6245s1 extends C6268y1 {

    /* renamed from: b */
    private final C4545f2 f15627b;

    public C6245s1(C4545f2 f2Var) {
        C12932j.m33818b(f2Var, "originModalUuid");
        super(null);
        this.f15627b = f2Var;
    }

    /* renamed from: a */
    public boolean mo14059a(C4545f2 f2Var) {
        C12932j.m33818b(f2Var, "modalUuid");
        int i = C6242r1.f15624a[f2Var.mo11703a().ordinal()];
        if (i == 1 || i == 2) {
            return C12932j.m33817a((Object) f2Var.mo11704b(), (Object) this.f15627b.mo11704b());
        }
        return false;
    }
}
