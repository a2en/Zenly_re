package app.zenly.locator.recommendation;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.recommendation.j */
public final class C5265j {
    static {
        new C5265j();
    }

    private C5265j() {
    }

    /* renamed from: a */
    public static final C5263h m14924a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((RecommendationModuleProvider) applicationContext).provideRecommendationModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.recommendation.RecommendationModuleProvider");
    }
}
