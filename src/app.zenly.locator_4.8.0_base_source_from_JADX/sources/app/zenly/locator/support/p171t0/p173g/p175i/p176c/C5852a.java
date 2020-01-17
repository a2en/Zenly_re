package app.zenly.locator.support.p171t0.p173g.p175i.p176c;

import android.content.Context;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.p171t0.p173g.p175i.C5850a;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.C5855a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: app.zenly.locator.support.t0.g.i.c.a */
public final class C5852a {

    /* renamed from: a */
    private final C5850a f14803a;

    /* renamed from: b */
    private final Context f14804b;

    public C5852a(C5850a aVar, Context context) {
        C12932j.m33818b(aVar, "controller");
        C12932j.m33818b(context, "context");
        this.f14803a = aVar;
        this.f14804b = context;
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onMissingPlaceClick(C5853b bVar) {
        C12932j.m33818b(bVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f14804b), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        C5855a a = C5855a.f14811b0.mo13539a(bVar.mo13533b(), bVar.mo13532a());
        a.mo23929b(this.f14803a.mo23947l());
        C8831g k = this.f14803a.mo23946k();
        C8836h a2 = C8836h.m21058a((C8819d) a);
        a2.mo24026b(new C8816c());
        a2.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a2);
    }
}
