package app.zenly.locator.core.store.p071di;

import android.content.Context;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.di.a */
public final class C3015a {
    static {
        new C3015a();
    }

    private C3015a() {
    }

    /* renamed from: a */
    public static final StoreModule m9526a(Context context) {
        C12932j.m33818b(context, "context");
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return ((StoreModuleProvider) applicationContext).provideStoreModule();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.store.di.StoreModuleProvider");
    }
}
