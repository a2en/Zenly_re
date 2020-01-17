package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.lifecycle.C0862g.C0863a;

/* renamed from: androidx.lifecycle.q */
public class C0881q extends Fragment {

    /* renamed from: e */
    private C0883b f3493e;

    /* renamed from: androidx.lifecycle.q$a */
    static class C0882a implements ActivityLifecycleCallbacks {
        C0882a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C0881q.m4074a(activity, C0863a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            C0881q.m4074a(activity, C0863a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            C0881q.m4074a(activity, C0863a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            C0881q.m4074a(activity, C0863a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            C0881q.m4074a(activity, C0863a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            C0881q.m4074a(activity, C0863a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: androidx.lifecycle.q$b */
    interface C0883b {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* renamed from: a */
    static void m4074a(Activity activity, C0863a aVar) {
        if (activity instanceof LifecycleRegistryOwner) {
            ((LifecycleRegistryOwner) activity).getLifecycle().mo4450a(aVar);
            return;
        }
        if (activity instanceof LifecycleOwner) {
            C0862g lifecycle = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof C0869k) {
                ((C0869k) lifecycle).mo4450a(aVar);
            }
        }
    }

    /* renamed from: b */
    public static void m4076b(Activity activity) {
        if (VERSION.SDK_INT >= 29) {
            activity.registerActivityLifecycleCallbacks(new C0882a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        String str = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
        if (fragmentManager.findFragmentByTag(str) == null) {
            fragmentManager.beginTransaction().add(new C0881q(), str).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* renamed from: c */
    private void m4078c(C0883b bVar) {
        if (bVar != null) {
            bVar.onResume();
        }
    }

    /* renamed from: d */
    private void m4079d(C0883b bVar) {
        if (bVar != null) {
            bVar.onStart();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m4077b(this.f3493e);
        m4075a(C0863a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m4075a(C0863a.ON_DESTROY);
        this.f3493e = null;
    }

    public void onPause() {
        super.onPause();
        m4075a(C0863a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m4078c(this.f3493e);
        m4075a(C0863a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m4079d(this.f3493e);
        m4075a(C0863a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m4075a(C0863a.ON_STOP);
    }

    /* renamed from: a */
    static C0881q m4073a(Activity activity) {
        return (C0881q) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: b */
    private void m4077b(C0883b bVar) {
        if (bVar != null) {
            bVar.onCreate();
        }
    }

    /* renamed from: a */
    private void m4075a(C0863a aVar) {
        if (VERSION.SDK_INT < 29) {
            m4074a(getActivity(), aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4469a(C0883b bVar) {
        this.f3493e = bVar;
    }
}
