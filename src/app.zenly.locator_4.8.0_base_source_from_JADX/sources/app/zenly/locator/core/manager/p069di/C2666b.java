package app.zenly.locator.core.manager.p069di;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.manager.di.b */
public final class C2666b {
    static {
        new C2666b();
    }

    private C2666b() {
    }

    /* renamed from: a */
    public static final C2660a m9049a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((ManagerModuleProvider) applicationContext).provideManagerModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.manager.di.ManagerModuleProvider");
    }
}
