package app.zenly.locator.friendshipfacts.p098k;

import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.friendshipfacts.p099l.C3806a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.services.C8001b5;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;

/* renamed from: app.zenly.locator.friendshipfacts.k.b */
public final class C3801b {

    /* renamed from: a */
    public static final C3801b f10131a = new C3801b();

    private C3801b() {
    }

    /* renamed from: a */
    public final List<C3806a> mo10365a(C8001b5 b5Var, List<C2936a0> list, Map<String, C2991u0> map) {
        String str;
        C12932j.m33818b(b5Var, "tst");
        C12932j.m33818b(list, "friends");
        C12932j.m33818b(map, "friendshipMap");
        ArrayList arrayList = new ArrayList();
        List tstsList = b5Var.getTstsList();
        C12932j.m33815a((Object) tstsList, "tst.tstsList");
        ArrayList<TimeTogetherProto$Tst> arrayList2 = new ArrayList<>();
        Iterator it = tstsList.iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            TimeTogetherProto$Tst timeTogetherProto$Tst = (TimeTogetherProto$Tst) next;
            C12932j.m33815a((Object) timeTogetherProto$Tst, str);
            Timestamp ts = timeTogetherProto$Tst.getTs();
            C12932j.m33815a((Object) ts, "it.ts");
            if (!C3245z.m10286e(ts)) {
                arrayList2.add(next);
            }
        }
        for (TimeTogetherProto$Tst timeTogetherProto$Tst2 : arrayList2) {
            C12932j.m33815a((Object) timeTogetherProto$Tst2, str);
            String userId = timeTogetherProto$Tst2.getUserId();
            C12932j.m33815a((Object) userId, "it.userId");
            C2936a0 a = C3800a.m11273a(list, userId);
            if (a != null) {
                arrayList.add(new C3806a(a.mo9074a(), timeTogetherProto$Tst2, (C2991u0) map.get(timeTogetherProto$Tst2.getUserId())));
            }
        }
        return arrayList;
    }
}
