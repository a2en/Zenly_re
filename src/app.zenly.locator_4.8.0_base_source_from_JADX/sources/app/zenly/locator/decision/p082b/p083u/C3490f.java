package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;

/* renamed from: app.zenly.locator.decision.b.u.f */
public final class C3490f implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9472a;

    public C3490f(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9472a = zenlyCore;
    }

    public boolean isOpen() {
        C6770e experimentFlags = this.f9472a.experimentFlags();
        return (experimentFlags != null ? experimentFlags.getNoFriendsCarousel() : null) == C6775d.GROUP_IN_EXPERIMENT;
    }
}
