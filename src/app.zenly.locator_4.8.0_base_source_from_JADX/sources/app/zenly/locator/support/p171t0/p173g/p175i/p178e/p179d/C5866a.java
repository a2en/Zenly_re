package app.zenly.locator.support.p171t0.p173g.p175i.p178e.p179d;

import android.content.Context;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.p171t0.p173g.p175i.p178e.C5855a;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: app.zenly.locator.support.t0.g.i.e.d.a */
public final class C5866a {

    /* renamed from: a */
    private final C5855a f14842a;

    /* renamed from: b */
    private final Context f14843b;

    public C5866a(C5855a aVar, Context context) {
        C12932j.m33818b(aVar, "controller");
        C12932j.m33818b(context, "context");
        this.f14842a = aVar;
        this.f14843b = context;
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onSuggestedPlaceClick(C5867b bVar) {
        C12932j.m33818b(bVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f14843b), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        C5855a aVar = this.f14842a;
        Context context = this.f14843b;
        String string = context.getString(R.string.support_places_main_genericAddress, new Object[]{bVar.mo13546a().mo13548b(), bVar.mo13546a().mo13547a()});
        C12932j.m33815a((Object) string, "context.getString(R.stri…le, event.place.subtitle)");
        aVar.mo13538a(context, string);
    }
}
