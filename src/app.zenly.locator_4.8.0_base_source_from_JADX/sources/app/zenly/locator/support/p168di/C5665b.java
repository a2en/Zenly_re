package app.zenly.locator.support.p168di;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.di.b */
public final class C5665b {
    static {
        new C5665b();
    }

    private C5665b() {
    }

    /* renamed from: a */
    public static final C5663a m15987a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((SupportModuleProvider) applicationContext).provideSupportModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.support.di.SupportModuleProvider");
    }
}
