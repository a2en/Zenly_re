package app.zenly.locator.decision.p082b.p083u;

import android.content.Context;
import app.zenly.android.feature.base.decision.FeatureGate;
import app.zenly.locator.C4958p;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.decision.b.u.d */
public final class C3488d implements FeatureGate {

    /* renamed from: a */
    private final Context f9470a;

    public C3488d(Context context) {
        C12932j.m33818b(context, "context");
        this.f9470a = context;
    }

    public boolean isOpen() {
        C4958p.f12964b.mo12157a(this.f9470a).mo12155a("prefs:tweaks:footsteps", false);
        return false;
    }
}
