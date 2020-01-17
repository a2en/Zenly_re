package app.zenly.locator.dashboard.p081z;

import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.dashboard.C3324u;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.dashboard.z.d */
public final class C3425d extends C11722a {

    /* renamed from: f */
    private final List<C2545e0> f9421f;

    public C3425d(List<? extends C2545e0> list) {
        C12932j.m33818b(list, "sharingOptions");
        super(C3324u.BROADCAST_INVITE_LIST, 1);
        this.f9421f = list;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return C12932j.m33817a((Object) this.f9421f, (Object) ((C3425d) aVar).f9421f);
    }

    /* renamed from: f */
    public final List<C2545e0> mo9931f() {
        return this.f9421f;
    }
}
