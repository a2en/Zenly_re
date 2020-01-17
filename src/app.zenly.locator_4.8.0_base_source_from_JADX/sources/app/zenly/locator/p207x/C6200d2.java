package app.zenly.locator.p207x;

import app.zenly.locator.modals.C4545f2;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.x.d2 */
public final class C6200d2 extends C6268y1 {

    /* renamed from: b */
    private final C4545f2 f15576b;

    public C6200d2(C4545f2 f2Var) {
        C12932j.m33818b(f2Var, "originModalUuid");
        super(null);
        this.f15576b = f2Var;
    }

    /* renamed from: a */
    public boolean mo14059a(C4545f2 f2Var) {
        C12932j.m33818b(f2Var, "modalUuid");
        int i = C6196c2.f15571a[f2Var.mo11703a().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return C12932j.m33817a((Object) f2Var.mo11704b(), (Object) this.f15576b.mo11704b());
        }
        return false;
    }
}
