package androidx.core.view.accessibility;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityManager;

public final class AccessibilityManagerCompat {

    @Deprecated
    public interface AccessibilityStateChangeListener {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z);
    }

    /* renamed from: androidx.core.view.accessibility.AccessibilityManagerCompat$a */
    private static class C0617a implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final TouchExplorationStateChangeListener f2768a;

        C0617a(TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.f2768a = touchExplorationStateChangeListener;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0617a.class != obj.getClass()) {
                return false;
            }
            return this.f2768a.equals(((C0617a) obj).f2768a);
        }

        public int hashCode() {
            return this.f2768a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f2768a.onTouchExplorationStateChanged(z);
        }
    }

    /* renamed from: a */
    public static boolean m2906a(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        if (VERSION.SDK_INT < 19 || touchExplorationStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new C0617a(touchExplorationStateChangeListener));
    }

    /* renamed from: b */
    public static boolean m2907b(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        if (VERSION.SDK_INT < 19 || touchExplorationStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new C0617a(touchExplorationStateChangeListener));
    }
}
