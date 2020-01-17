package app.zenly.locator.decision;

import android.content.Context;
import app.zenly.android.feature.base.decision.C1322a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.decision.a */
public final class C3444a {
    static {
        new C3444a();
    }

    private C3444a() {
    }

    /* renamed from: a */
    public static final C1322a m10686a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((DecisionApiProvider) applicationContext).provideDecisionApi();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.decision.DecisionApiProvider");
    }
}
