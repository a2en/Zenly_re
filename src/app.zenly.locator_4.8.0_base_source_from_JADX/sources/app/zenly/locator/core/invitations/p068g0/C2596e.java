package app.zenly.locator.core.invitations.p068g0;

import android.content.Context;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.C2545e0.C2549b0;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.invitations.g0.e */
public final class C2596e {
    /* renamed from: a */
    public static final String m8923a(C2545e0 e0Var, Context context) {
        C12932j.m33818b(e0Var, "$this$getShortAppName");
        C12932j.m33818b(context, "context");
        if (C12932j.m33817a((Object) e0Var, (Object) C2549b0.f7613e)) {
            String string = context.getString(R.string.sharesheet_app_snap_short);
            C12932j.m33815a((Object) string, "context.getString(R.stri…haresheet_app_snap_short)");
            return string;
        }
        String string2 = context.getString(e0Var.mo8687b());
        C12932j.m33815a((Object) string2, "context.getString(this.nameResId)");
        return string2;
    }
}
