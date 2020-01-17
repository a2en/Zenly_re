package app.zenly.locator.notifications.p122di;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.notifications.di.b */
public final class C4722b {
    static {
        new C4722b();
    }

    private C4722b() {
    }

    /* renamed from: a */
    public static final C4720a m13689a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((NotificationModuleProvider) applicationContext).provideNotificationModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.notifications.di.NotificationModuleProvider");
    }
}
