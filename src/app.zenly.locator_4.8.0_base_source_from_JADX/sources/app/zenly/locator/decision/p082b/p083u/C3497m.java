package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;

/* renamed from: app.zenly.locator.decision.b.u.m */
public final class C3497m implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9480a;

    public C3497m(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9480a = zenlyCore;
    }

    public boolean isOpen() {
        C6770e experimentFlags = this.f9480a.experimentFlags();
        C6775d dVar = null;
        if ((experimentFlags != null ? experimentFlags.getDisplaySocialNetwork() : null) != C6775d.GROUP_IN_EXPERIMENT) {
            if (experimentFlags != null) {
                dVar = experimentFlags.getSocialNetworksWithBroadcastedInvites();
            }
            if (dVar != C6775d.GROUP_IN_EXPERIMENT) {
                return false;
            }
        }
        return true;
    }
}
