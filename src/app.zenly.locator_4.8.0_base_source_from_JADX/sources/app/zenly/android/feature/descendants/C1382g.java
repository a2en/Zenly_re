package app.zenly.android.feature.descendants;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.g */
public final class C1382g {
    static {
        new C1382g();
    }

    private C1382g() {
    }

    /* renamed from: a */
    public static final DescendantsModule m6431a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((DescendantsModuleProvider) applicationContext).provideDescendantsModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.android.feature.descendants.DescendantsModuleProvider");
    }
}
