package app.zenly.locator.core.helper;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.helper.c */
public final class C2510c {
    static {
        new C2510c();
    }

    private C2510c() {
    }

    /* renamed from: a */
    public static final String m8763a(Context context) {
        C12932j.m33818b(context, "context");
        Resources resources = context.getResources();
        C12932j.m33815a((Object) resources, "context.resources");
        int i = resources.getDisplayMetrics().densityDpi;
        if (i >= 0 && 240 > i) {
            return "@1x";
        }
        return (240 <= i && 400 > i) ? "@2x" : "@3x";
    }
}
