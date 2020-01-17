package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import app.zenly.locator.core.util.C3194b0;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.decision.b.u.r */
public final class C3502r implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9485a;

    public C3502r(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9485a = zenlyCore;
    }

    public boolean isOpen() {
        UserProto$User userMeCache = this.f9485a.userMeCache();
        if (userMeCache != null) {
            return C3194b0.m10164a(userMeCache, "tech_staff");
        }
        return false;
    }
}
