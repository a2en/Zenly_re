package app.zenly.locator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import app.zenly.locator.core.util.C3231q;
import app.zenly.locator.core.util.C3231q.C3232a;
import app.zenly.locator.p143s.C5407g;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;

public final class PackageUpgradeReceiver extends BroadcastReceiver {
    /* renamed from: a */
    private final void m6612a(Context context) {
        C5407g a = C5407g.f13966d.mo12991a(context);
        int a2 = a.mo12969a();
        if (a2 < 30860000) {
            try {
                m6613b(context);
                a2 = 30860000;
            } catch (Throwable th) {
                a.mo12970a(40080000);
                throw th;
            }
        }
        if (a2 < 40060000) {
            m6614c(context);
        }
        a.mo12970a(40080000);
    }

    /* renamed from: b */
    private final void m6613b(Context context) {
        C3231q.m10244b(context, C3232a.VIDEOS, "cards");
    }

    /* renamed from: c */
    private final void m6614c(Context context) {
        C3231q.m10244b(context, C3232a.VIDEOS, "cards");
    }

    public void onReceive(Context context, Intent intent) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(intent, "intent");
        if (C12932j.m33817a((Object) intent.getAction(), (Object) "android.intent.action.MY_PACKAGE_REPLACED")) {
            m6612a(context);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown action ");
        sb.append(intent.getAction());
        sb.append(" received");
        C12143a.m32035d(sb.toString(), new Object[0]);
    }
}
