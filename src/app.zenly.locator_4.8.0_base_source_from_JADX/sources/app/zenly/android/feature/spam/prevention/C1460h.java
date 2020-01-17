package app.zenly.android.feature.spam.prevention;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.spam.prevention.h */
public final class C1460h {
    static {
        new C1460h();
    }

    private C1460h() {
    }

    /* renamed from: a */
    public static final SpamPreventionModule m6557a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((SpamPreventionModuleProvider) applicationContext).provideSpamPreventionModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.android.feature.spam.prevention.SpamPreventionModuleProvider");
    }
}
