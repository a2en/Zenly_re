package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;

/* renamed from: app.zenly.locator.decision.b.u.l */
public final class C3496l implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9478a;

    /* renamed from: b */
    private final C3485a f9479b;

    public C3496l(ZenlyCore zenlyCore, C3485a aVar) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(aVar, "broadcastInviteFeatureGate");
        this.f9478a = zenlyCore;
        this.f9479b = aVar;
    }

    public boolean isOpen() {
        if (this.f9479b.isOpen()) {
            C6770e experimentFlags = this.f9478a.experimentFlags();
            if ((experimentFlags != null ? experimentFlags.getSocialNetworksWithBroadcastedInvites() : null) == C6775d.GROUP_IN_EXPERIMENT) {
                return true;
            }
        }
        return false;
    }
}
