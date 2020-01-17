package app.zenly.locator.core.app;

import android.app.Activity;
import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p250f.p251a.p252a.p253a.p255e.C7673g;

/* renamed from: app.zenly.locator.core.app.c */
public final class C2451c {

    /* renamed from: b */
    private static C2451c f7351b;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ArrayList<WeakReference<Activity>> f7352a = new ArrayList<>();

    /* renamed from: app.zenly.locator.core.app.c$a */
    class C2452a extends C7673g {
        C2452a() {
        }

        public void onActivityStarted(Activity activity) {
            C2451c.this.f7352a.add(new WeakReference(activity));
        }

        public void onActivityStopped(Activity activity) {
            Iterator it = C2451c.this.f7352a.iterator();
            while (it.hasNext()) {
                Activity activity2 = (Activity) ((WeakReference) it.next()).get();
                if (activity2 == null || activity2 == activity) {
                    it.remove();
                }
            }
        }
    }

    private C2451c(Application application) {
        application.registerActivityLifecycleCallbacks(new C2452a());
    }

    /* renamed from: a */
    public static void m8551a(Application application) {
        if (f7351b == null) {
            f7351b = new C2451c(application);
            return;
        }
        throw new IllegalStateException("ActivityTracker already initialized");
    }
}
