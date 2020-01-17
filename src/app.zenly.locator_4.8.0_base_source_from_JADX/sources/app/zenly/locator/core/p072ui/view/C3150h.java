package app.zenly.locator.core.p072ui.view;

import android.view.ViewGroup;
import androidx.transition.C1236k;
import androidx.transition.Transition;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.ui.view.h */
public final class C3150h {
    /* renamed from: a */
    public static /* synthetic */ void m9893a(C3147g gVar, Long l, Transition transition, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            transition = gVar.mo9482b();
        }
        m9892a(gVar, l, transition, function0);
    }

    /* renamed from: a */
    public static final void m9892a(C3147g gVar, Long l, Transition transition, Function0<C12956q> function0) {
        C12932j.m33818b(gVar, "$this$applyTransition");
        C12932j.m33818b(transition, "transition");
        C12932j.m33818b(function0, "action");
        gVar.mo2783c(gVar.mo9485d());
        function0.invoke();
        transition.mo6005a(l != null ? l.longValue() : 1000);
        C1236k.m5968a((ViewGroup) gVar.mo9485d(), transition);
        gVar.mo2779b(gVar.mo9485d());
    }
}
