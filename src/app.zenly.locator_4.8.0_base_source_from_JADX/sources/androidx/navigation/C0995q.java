package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* renamed from: androidx.navigation.q */
public final class C0995q {
    /* renamed from: a */
    public static NavController m4501a(View view) {
        NavController b = m4503b(view);
        if (b != null) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" does not have a NavController set");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: b */
    private static NavController m4503b(View view) {
        while (view != null) {
            NavController c = m4504c(view);
            if (c != null) {
                return c;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    /* renamed from: c */
    private static NavController m4504c(View view) {
        Object tag = view.getTag(C0997s.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    /* renamed from: a */
    public static void m4502a(View view, NavController navController) {
        view.setTag(C0997s.nav_controller_view_tag, navController);
    }
}
