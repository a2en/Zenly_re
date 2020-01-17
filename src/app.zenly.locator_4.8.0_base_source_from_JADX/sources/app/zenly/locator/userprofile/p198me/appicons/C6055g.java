package app.zenly.locator.userprofile.p198me.appicons;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.userprofile.me.appicons.g */
public final class C6055g {
    static {
        new C6055g();
    }

    private C6055g() {
    }

    /* renamed from: a */
    public static final C6052e m16803a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((AppIconsPrefsProvider) applicationContext).provideAppIconsPrefs();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.me.appicons.AppIconsPrefsProvider");
    }
}
