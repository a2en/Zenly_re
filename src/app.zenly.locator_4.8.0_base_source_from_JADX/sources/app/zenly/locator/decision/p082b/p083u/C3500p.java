package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import app.zenly.locator.C4958p;
import app.zenly.locator.p143s.C5407g;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.decision.b.u.p */
public final class C3500p implements FeatureGate {

    /* renamed from: a */
    private final C3501q f9483a;

    /* renamed from: b */
    private final C5407g f9484b;

    public C3500p(C5407g gVar, C4958p pVar) {
        C12932j.m33818b(gVar, "zenlyPreferences");
        C12932j.m33818b(pVar, "tweaksPreferences");
        this.f9484b = gVar;
        C3501q qVar = new C3501q(pVar, "prefs:tweaks:tharpDeepIntegrationEnabled", false, 4, null);
        this.f9483a = qVar;
    }

    public boolean isOpen() {
        return this.f9483a.isOpen() && this.f9484b.mo12981e() == 3;
    }
}
