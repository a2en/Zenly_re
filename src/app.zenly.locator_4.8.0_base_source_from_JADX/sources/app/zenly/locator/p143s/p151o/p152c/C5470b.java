package app.zenly.locator.p143s.p151o.p152c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.o.c.b */
public final class C5470b {
    static {
        new C5470b();
    }

    private C5470b() {
    }

    /* renamed from: a */
    public static final Drawable m15559a(Context context, int i, int i2) {
        C12932j.m33818b(context, "context");
        Drawable c = C0540a.m2546c(context, i);
        Drawable mutate = c != null ? c.mutate() : null;
        if (mutate != null) {
            Drawable i3 = C0559a.m2657i(mutate);
            C0559a.m2650b(i3, i2);
            C12932j.m33815a((Object) i3, "drawable");
            return i3;
        }
        C12932j.m33814a();
        throw null;
    }
}
