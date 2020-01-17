package app.zenly.locator.support.p171t0.p172f;

import android.content.Context;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.p171t0.C5812a;
import app.zenly.locator.support.p171t0.C5821d;
import app.zenly.locator.support.p171t0.p173g.C5840f;
import app.zenly.locator.support.p171t0.p173g.p175i.C5850a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: app.zenly.locator.support.t0.f.a */
public final class C5823a {

    /* renamed from: a */
    private final Context f14724a;

    /* renamed from: b */
    private final C5812a f14725b;

    /* renamed from: c */
    private final C5821d f14726c;

    public C5823a(Context context, C5812a aVar, C5821d dVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(aVar, "controller");
        C12932j.m33818b(dVar, "viewRepository");
        this.f14724a = context;
        this.f14725b = aVar;
        this.f14726c = dVar;
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onMissingPlaceClick(C5824b bVar) {
        C12932j.m33818b(bVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f14724a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        C5850a aVar = new C5850a();
        aVar.mo23929b(this.f14725b.mo23947l());
        C8831g k = this.f14725b.mo23946k();
        C8836h a = C8836h.m21058a((C8819d) aVar);
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onMorePlacesClick(C5825c cVar) {
        C12932j.m33818b(cVar, "event");
        this.f14726c.mo13501b();
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onPlaceClick(C5826d dVar) {
        C12932j.m33818b(dVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f14724a), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        C5840f a = C5840f.f14767a0.mo13517a(dVar.mo13506b(), dVar.mo13507c(), dVar.mo13505a());
        a.mo23929b(this.f14725b.mo23947l());
        C8831g k = this.f14725b.mo23946k();
        C8836h a2 = C8836h.m21058a((C8819d) a);
        a2.mo24026b(new C8816c(false));
        a2.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a2);
    }
}
