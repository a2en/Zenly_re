package app.zenly.locator.dashboard.p075w;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;

/* renamed from: app.zenly.locator.dashboard.w.a */
public final class C3326a {

    /* renamed from: a */
    private final Map<String, C3341i> f9253a = new LinkedHashMap();

    /* renamed from: a */
    public final C3341i mo9831a(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        C3341i iVar2 = (C3341i) this.f9253a.get(iVar.getDeviceContactId());
        return iVar2 != null ? iVar2 : C3341i.NOT_INVITED;
    }

    /* renamed from: a */
    public final void mo9832a(C7339i iVar, C3341i iVar2) {
        C12932j.m33818b(iVar, "contact");
        C12932j.m33818b(iVar2, "invitedStatus");
        Map<String, C3341i> map = this.f9253a;
        String deviceContactId = iVar.getDeviceContactId();
        C12932j.m33815a((Object) deviceContactId, "contact.deviceContactId");
        map.put(deviceContactId, iVar2);
    }
}
