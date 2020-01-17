package app.zenly.locator.descendants;

import app.zenly.android.feature.descendants.Time;
import java.util.Date;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.descendants.a */
public final class C3504a implements Time {

    /* renamed from: a */
    private final ZenlyCore f9487a;

    public C3504a(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9487a = zenlyCore;
    }

    public long now() {
        Date timeNow = this.f9487a.timeNow();
        C12932j.m33815a((Object) timeNow, "core.timeNow()");
        return timeNow.getTime();
    }
}
