package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6781g;

/* renamed from: app.zenly.locator.decision.b.u.c */
public final class C3487c implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9469a;

    public C3487c(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9469a = zenlyCore;
    }

    public boolean isOpen() {
        C6781g featureFlags = this.f9469a.featureFlags();
        return featureFlags != null && featureFlags.getDisplayReferrerFromLinkEnabled();
    }
}
