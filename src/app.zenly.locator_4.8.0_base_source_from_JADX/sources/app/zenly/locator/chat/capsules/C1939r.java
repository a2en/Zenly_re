package app.zenly.locator.chat.capsules;

import app.zenly.locator.chat.panel.emojis.p057f0.C2242d;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.chat.capsules.r */
public final class C1939r {

    /* renamed from: a */
    private final Map<String, List<C2242d>> f6284a = new LinkedHashMap();

    /* renamed from: a */
    public final List<C2242d> mo7683a(String str) {
        C12932j.m33818b(str, "userUuid");
        List<C2242d> list = (List) this.f6284a.get(str);
        return list != null ? list : new LinkedList();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1939r)) {
            return false;
        }
        return C12932j.m33817a((Object) this.f6284a, (Object) ((C1939r) obj).f6284a);
    }

    public int hashCode() {
        return this.f6284a.hashCode();
    }

    /* renamed from: a */
    public final void mo7685a(String str, List<? extends C2242d> list) {
        C12932j.m33818b(str, "userUuid");
        C12932j.m33818b(list, "receivedEmojis");
        List list2 = (List) this.f6284a.get(str);
        if (list2 == null) {
            this.f6284a.put(str, C12857w.m33689j(list));
        } else {
            this.f6284a.put(str, C12857w.m33670b((Collection) list2, (Iterable) list));
        }
    }

    /* renamed from: a */
    public final void mo7684a(C2242d dVar) {
        C12932j.m33818b(dVar, "displayedEmoji");
        List list = (List) this.f6284a.get(dVar.f6868d);
        if (list == null) {
            C12143a.m32030b("Trying to remove already removed emojis", new Object[0]);
            return;
        }
        List d = C12857w.m33678d((Collection) list);
        d.remove(dVar);
        Map<String, List<C2242d>> map = this.f6284a;
        String str = dVar.f6868d;
        C12932j.m33815a((Object) str, "displayedEmoji.userUuid");
        map.put(str, d);
    }
}
