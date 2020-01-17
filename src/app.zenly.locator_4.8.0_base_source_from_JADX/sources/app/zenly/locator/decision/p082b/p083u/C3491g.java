package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;

/* renamed from: app.zenly.locator.decision.b.u.g */
public final class C3491g implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9473a;

    public C3491g(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9473a = zenlyCore;
    }

    public boolean isOpen() {
        C6770e experimentFlags = this.f9473a.experimentFlags();
        return (experimentFlags != null ? experimentFlags.getNoFriendsMultipleDialogs() : null) == C6775d.GROUP_IN_EXPERIMENT;
    }
}
