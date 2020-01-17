package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e;
import p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d;

/* renamed from: app.zenly.locator.decision.b.u.i */
public final class C3493i implements FeatureGate {

    /* renamed from: a */
    private final ZenlyCore f9475a;

    public C3493i(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f9475a = zenlyCore;
    }

    public boolean isOpen() {
        C6770e experimentFlags = this.f9475a.experimentFlags();
        return (experimentFlags != null ? experimentFlags.getQuickAddInbox() : null) == C6775d.GROUP_IN_EXPERIMENT;
    }
}
