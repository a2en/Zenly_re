package app.zenly.locator.powermoves.p126a;

import androidx.navigation.C0969j;
import androidx.navigation.C0976o;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.powermoves.a.a */
public final class C4965a {
    /* renamed from: a */
    public static /* synthetic */ void m14325a(NavController navController, NavDirections navDirections, C0976o oVar, int i, Object obj) {
        if ((i & 2) != 0) {
            oVar = null;
        }
        m14324a(navController, navDirections, oVar);
    }

    /* renamed from: a */
    public static final void m14324a(NavController navController, NavDirections navDirections, C0976o oVar) {
        C12932j.m33818b(navController, "$this$navigateSafe");
        C12932j.m33818b(navDirections, "directions");
        C0969j a = navController.mo4629a();
        if (a != null && a.mo4723a(navDirections.getActionId()) != null) {
            navController.mo4638a(navDirections, oVar);
        }
    }
}
