package app.zenly.locator.support.p171t0.p173g.p174h;

import android.content.Context;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.p171t0.p173g.C5832d;
import app.zenly.locator.support.p171t0.p173g.C5840f;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: app.zenly.locator.support.t0.g.h.a */
public final class C5847a {

    /* renamed from: a */
    private final C5840f f14786a;

    /* renamed from: b */
    private final Context f14787b;

    public C5847a(C5840f fVar, Context context) {
        C12932j.m33818b(fVar, "controller");
        C12932j.m33818b(context, "context");
        this.f14786a = fVar;
        this.f14787b = context;
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onPlaceIssueClick(C5848b bVar) {
        C12932j.m33818b(bVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f14787b), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        this.f14786a.mo13516a(this.f14787b, bVar.mo13524b(), bVar.mo13526d(), bVar.mo13523a(), bVar.mo13525c());
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onPlaceOtherIssueClick(C5849c cVar) {
        C12932j.m33818b(cVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f14787b), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        C5832d a = C5832d.f14745l0.mo13512a(cVar.mo13528b(), cVar.mo13530d(), cVar.mo13527a(), cVar.mo13529c());
        a.mo23929b(this.f14786a.mo23947l());
        C8831g k = this.f14786a.mo23946k();
        C8836h a2 = C8836h.m21058a((C8819d) a);
        a2.mo24026b(new C8816c());
        a2.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a2);
    }
}
