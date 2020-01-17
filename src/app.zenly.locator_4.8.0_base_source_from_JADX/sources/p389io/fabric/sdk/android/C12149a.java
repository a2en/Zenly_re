package p389io.fabric.sdk.android;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: io.fabric.sdk.android.a */
public class C12149a {

    /* renamed from: a */
    private final Application f31570a;

    /* renamed from: b */
    private C12150a f31571b;

    /* renamed from: io.fabric.sdk.android.a$a */
    private static class C12150a {

        /* renamed from: a */
        private final Set<ActivityLifecycleCallbacks> f31572a = new HashSet();

        /* renamed from: b */
        private final Application f31573b;

        /* renamed from: io.fabric.sdk.android.a$a$a */
        class C12151a implements ActivityLifecycleCallbacks {

            /* renamed from: e */
            final /* synthetic */ C12152b f31574e;

            C12151a(C12150a aVar, C12152b bVar) {
                this.f31574e = bVar;
            }

            public void onActivityCreated(Activity activity, Bundle bundle) {
                this.f31574e.mo25000a(activity, bundle);
            }

            public void onActivityDestroyed(Activity activity) {
                this.f31574e.mo24999a(activity);
            }

            public void onActivityPaused(Activity activity) {
                this.f31574e.mo25001b(activity);
            }

            public void onActivityResumed(Activity activity) {
                this.f31574e.mo25003c(activity);
            }

            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                this.f31574e.mo25002b(activity, bundle);
            }

            public void onActivityStarted(Activity activity) {
                this.f31574e.mo25004d(activity);
            }

            public void onActivityStopped(Activity activity) {
                this.f31574e.mo25005e(activity);
            }
        }

        C12150a(Application application) {
            this.f31573b = application;
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public void m32082a() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.f31572a) {
                this.f31573b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        /* access modifiers changed from: private */
        @TargetApi(14)
        /* renamed from: a */
        public boolean m32085a(C12152b bVar) {
            if (this.f31573b == null) {
                return false;
            }
            C12151a aVar = new C12151a(this, bVar);
            this.f31573b.registerActivityLifecycleCallbacks(aVar);
            this.f31572a.add(aVar);
            return true;
        }
    }

    /* renamed from: io.fabric.sdk.android.a$b */
    public static abstract class C12152b {
        /* renamed from: a */
        public void mo24999a(Activity activity) {
        }

        /* renamed from: a */
        public abstract void mo25000a(Activity activity, Bundle bundle);

        /* renamed from: b */
        public void mo25001b(Activity activity) {
        }

        /* renamed from: b */
        public void mo25002b(Activity activity, Bundle bundle) {
        }

        /* renamed from: c */
        public abstract void mo25003c(Activity activity);

        /* renamed from: d */
        public abstract void mo25004d(Activity activity);

        /* renamed from: e */
        public void mo25005e(Activity activity) {
        }
    }

    public C12149a(Context context) {
        this.f31570a = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.f31571b = new C12150a(this.f31570a);
        }
    }

    /* renamed from: a */
    public boolean mo35970a(C12152b bVar) {
        C12150a aVar = this.f31571b;
        return aVar != null && aVar.m32085a(bVar);
    }

    /* renamed from: a */
    public void mo35969a() {
        C12150a aVar = this.f31571b;
        if (aVar != null) {
            aVar.m32082a();
        }
    }
}
