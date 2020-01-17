package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6781g;

/* renamed from: app.zenly.locator.decision.b.u.j */
public final class C3494j implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9476a;

    public C3494j(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9476a = zenlyCore;
    }

    public boolean isOpen() {
        C6781g featureFlags = this.f9476a.featureFlags();
        if (featureFlags != null) {
            return featureFlags.getRecommendationChainsEnabled();
        }
        return false;
    }
}
