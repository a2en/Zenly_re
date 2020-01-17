package app.zenly.locator.decision.p082b.p083u;

import app.zenly.android.feature.base.decision.FeatureGate;
import app.zenly.locator.C4958p;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.decision.b.u.q */
public final class C3501q implements FeatureGate {
    public C3501q(C4958p pVar, String str, boolean z) {
        C12932j.m33818b(pVar, "tweaksPreferences");
        C12932j.m33818b(str, "key");
    }

    public boolean isOpen() {
        return false;
    }

    public /* synthetic */ C3501q(C4958p pVar, String str, boolean z, int i, C12928f fVar) {
        if ((i & 4) != 0) {
            z = false;
        }
        this(pVar, str, z);
    }
}
