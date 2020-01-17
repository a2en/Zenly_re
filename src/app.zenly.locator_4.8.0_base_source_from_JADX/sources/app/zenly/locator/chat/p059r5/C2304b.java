package app.zenly.locator.chat.p059r5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.core.C7117i;

/* renamed from: app.zenly.locator.chat.r5.b */
public final class C2304b {
    /* renamed from: a */
    public static final List<C6818b> m8212a(C7117i iVar) {
        C12932j.m33818b(iVar, "$this$activeMembers");
        List othersList = iVar.getOthersList();
        C12932j.m33815a((Object) othersList, "othersList");
        List a = C12857w.m33666a((Collection) othersList, (Object) iVar.getMe());
        ArrayList arrayList = new ArrayList();
        for (Object next : a) {
            C6818b bVar = (C6818b) next;
            C12932j.m33815a((Object) bVar, "it");
            if (!C2309e.m8217a(bVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
