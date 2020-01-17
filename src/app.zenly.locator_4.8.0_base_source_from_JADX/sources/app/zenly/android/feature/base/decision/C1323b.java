package app.zenly.android.feature.base.decision;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.base.decision.b */
public class C1323b {

    /* renamed from: a */
    private final String f4928a;

    /* renamed from: b */
    private final FeatureGate[] f4929b;

    public C1323b(String str, FeatureGate... featureGateArr) {
        C12932j.m33818b(str, "key");
        C12932j.m33818b(featureGateArr, "featureGates");
        this.f4928a = str;
        this.f4929b = featureGateArr;
    }

    /* renamed from: a */
    public final String mo6512a() {
        return this.f4928a;
    }

    /* renamed from: b */
    public final boolean mo6513b() {
        for (FeatureGate isOpen : this.f4929b) {
            if (isOpen.isOpen()) {
                return true;
            }
        }
        return false;
    }
}
