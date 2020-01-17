package app.zenly.locator.p143s.p148l;

import com.android.volley.toolbox.C8733j;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7402n2;

/* renamed from: app.zenly.locator.s.l.b */
public final class C5447b {

    /* renamed from: a */
    private static final Map<ZenlyCore, C5446a> f14018a = new LinkedHashMap();

    /* renamed from: a */
    private static final C5446a m15474a(ZenlyCore zenlyCore) {
        C5446a aVar;
        synchronized (f14018a) {
            aVar = (C5446a) f14018a.get(zenlyCore);
            if (aVar == null) {
                aVar = new C5446a();
                f14018a.put(zenlyCore, aVar);
            }
        }
        return aVar;
    }

    /* renamed from: b */
    public static final long m15475b(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "$this$serverTime");
        return System.currentTimeMillis() + m15476c(zenlyCore);
    }

    /* renamed from: c */
    private static final long m15476c(ZenlyCore zenlyCore) {
        long b;
        C5446a a = m15474a(zenlyCore);
        synchronized (a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - a.mo13031a() > ((long) C8733j.DEFAULT_IMAGE_TIMEOUT_MS)) {
                a.mo13032a(currentTimeMillis);
                Date timeNow = zenlyCore.timeNow();
                C12932j.m33815a((Object) timeNow, "timeNow()");
                a.mo13035b(timeNow.getTime() - currentTimeMillis);
            }
            b = a.mo13034b();
        }
        return b;
    }

    /* renamed from: d */
    public static final String m15477d(ZenlyCore zenlyCore) {
        String c;
        C12932j.m33818b(zenlyCore, "$this$userUuid");
        C5446a a = m15474a(zenlyCore);
        synchronized (a) {
            if (a.mo13036c() == null) {
                String str = null;
                C7402n2 n2Var = (C7402n2) zenlyCore.sessionGet().mo36487e(1).mo36446a(null);
                if (n2Var != null) {
                    str = n2Var.getUserUuid();
                }
                a.mo13033a(str);
            }
            c = a.mo13036c();
        }
        return c;
    }

    /* renamed from: a */
    public static final long m15473a(ZenlyCore zenlyCore, long j) {
        C12932j.m33818b(zenlyCore, "$this$toLocalTime");
        return j - m15476c(zenlyCore);
    }
}
