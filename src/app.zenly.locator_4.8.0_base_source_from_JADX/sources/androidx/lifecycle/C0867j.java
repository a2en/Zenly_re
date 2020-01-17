package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.j */
class C0867j {

    /* renamed from: a */
    private static AtomicBoolean f3465a = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.j$a */
    static class C0868a extends C0860e {
        C0868a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            C0881q.m4076b(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m4035a(Context context) {
        if (!f3465a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0868a());
        }
    }
}
