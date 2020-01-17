package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;
import p213co.znly.models.ConfigurationProto$Configuration.C6781g;

/* renamed from: app.zenly.locator.decision.b.u.a */
public final class C3485a implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9467a;

    public C3485a(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9467a = zenlyCore;
    }

    public boolean isOpen() {
        C6781g featureFlags = this.f9467a.featureFlags();
        boolean broadcastedInvitationsEnabled = featureFlags != null ? featureFlags.getBroadcastedInvitationsEnabled() : false;
        C6770e experimentFlags = this.f9467a.experimentFlags();
        C6775d dVar = null;
        boolean z = (experimentFlags != null ? experimentFlags.getDisplaySocialNetwork() : null) == C6775d.GROUP_IN_EXPERIMENT;
        C6770e experimentFlags2 = this.f9467a.experimentFlags();
        if (experimentFlags2 != null) {
            dVar = experimentFlags2.getBroadcastedInvitesDisabled();
        }
        boolean z2 = dVar == C6775d.GROUP_IN_EXPERIMENT;
        if (!broadcastedInvitationsEnabled || z || z2) {
            return false;
        }
        return true;
    }
}
