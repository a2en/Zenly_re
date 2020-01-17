package app.zenly.locator.map.p104di;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.di.b */
public final class C3930b {
    static {
        new C3930b();
    }

    private C3930b() {
    }

    /* renamed from: a */
    public static final C3913a m11529a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((MapModuleProvider) applicationContext).provideMapModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.map.di.MapModuleProvider");
    }
}
