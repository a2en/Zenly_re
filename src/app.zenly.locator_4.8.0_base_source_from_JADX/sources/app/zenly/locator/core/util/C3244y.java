package app.zenly.locator.core.util;

import java.util.TimeZone;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.util.y */
public final class C3244y {

    /* renamed from: a */
    private TimeZone f9023a;

    /* renamed from: b */
    private String f9024b;

    public C3244y() {
        TimeZone timeZone = TimeZone.getDefault();
        C12932j.m33815a((Object) timeZone, "TimeZone.getDefault()");
        this.f9023a = timeZone;
        String id = this.f9023a.getID();
        C12932j.m33815a((Object) id, "currentTimeZone.id");
        this.f9024b = id;
    }

    /* renamed from: a */
    public final TimeZone mo9657a(String str) {
        TimeZone timeZone;
        C12932j.m33818b(str, "timeZoneId");
        synchronized (this) {
            if (!C12932j.m33817a((Object) str, (Object) this.f9024b)) {
                this.f9024b = str;
                TimeZone timeZone2 = TimeZone.getTimeZone(str);
                C12932j.m33815a((Object) timeZone2, "TimeZone.getTimeZone(timeZoneId)");
                this.f9023a = timeZone2;
            }
            timeZone = this.f9023a;
        }
        return timeZone;
    }
}
