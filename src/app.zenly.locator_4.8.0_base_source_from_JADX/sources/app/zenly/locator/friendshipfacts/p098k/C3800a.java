package app.zenly.locator.friendshipfacts.p098k;

import app.zenly.locator.core.store.api.C2936a0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.friendshipfacts.k.a */
public final class C3800a {
    /* renamed from: a */
    public static final C2936a0 m11273a(List<C2936a0> list, String str) {
        Object obj;
        C12932j.m33818b(list, "$this$firstFriendOrNull");
        C12932j.m33818b(str, "userUuid");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C12932j.m33817a((Object) ((C2936a0) obj).mo9074a().getUuid(), (Object) str)) {
                break;
            }
        }
        return (C2936a0) obj;
    }
}
