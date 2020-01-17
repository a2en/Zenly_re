package app.zenly.locator.p210z;

import app.zenly.locator.chat.content.C1949d;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.report.base.C5342k;
import java.util.List;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.z.a */
public final class C6309a {
    /* renamed from: a */
    public static void m17376a(NavigationContract navigationContract, UserProto$User userProto$User) {
        if (navigationContract != null) {
            navigationContract.showReport(C5342k.m15152a(userProto$User));
        }
    }

    /* renamed from: a */
    public static void m17377a(NavigationContract navigationContract, String str, C1949d dVar, List<C1949d> list, Runnable runnable) {
        if (navigationContract != null) {
            C5342k a = C5342k.m15153a(str, dVar, list);
            a.mo12784a(runnable);
            navigationContract.showReport(a);
        }
    }
}
