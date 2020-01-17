package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import java.lang.ref.WeakReference;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.appsflyer.internal.u */
public final class C8796u implements ActivityLifecycleCallbacks {

    /* renamed from: ॱ */
    public static C8796u f22781;

    /* renamed from: ˊ */
    boolean f22782 = true;

    /* renamed from: ˋ */
    public C8797a f22783 = null;

    /* renamed from: ˏ */
    boolean f22784 = false;

    /* renamed from: com.appsflyer.internal.u$a */
    public interface C8797a {
        /* renamed from: ˊ */
        void mo23714(Activity activity);

        /* renamed from: ॱ */
        void mo23715(WeakReference<Context> weakReference);
    }

    /* renamed from: com.appsflyer.internal.u$e */
    class C8798e extends AsyncTask<Void, Void, Void> {

        /* renamed from: ˎ */
        private WeakReference<Context> f22785;

        public C8798e(WeakReference<Context> weakReference) {
            this.f22785 = weakReference;
        }

        /* renamed from: ॱ */
        private Void m20765() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                AFLogger.afErrorLog("Sleeping attempt failed (essential for background state verification)\n", e);
            }
            C8796u uVar = C8796u.this;
            if (uVar.f22784 && uVar.f22782) {
                uVar.f22784 = false;
                try {
                    uVar.f22783.mo23715(this.f22785);
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Listener threw exception! ", e2);
                    cancel(true);
                }
            }
            this.f22785.clear();
            return null;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m20765();
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C8770g.m20730();
        Intent intent = activity.getIntent();
        if (C8770g.m20729(intent) != null && intent.getData() != C8770g.f22703) {
            C8770g.f22703 = intent.getData();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.f22782 = true;
        try {
            new C8798e(new WeakReference(activity.getApplicationContext())).executeOnExecutor(AFExecutor.getInstance().getThreadPoolExecutor(), new Void[0]);
        } catch (RejectedExecutionException e) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with RejectedExecutionException Exception", e);
        } catch (Throwable th) {
            AFLogger.afErrorLog("backgroundTask.executeOnExecutor failed with Exception", th);
        }
    }

    public final void onActivityResumed(Activity activity) {
        this.f22782 = false;
        boolean z = !this.f22784;
        this.f22784 = true;
        if (z) {
            try {
                this.f22783.mo23714(activity);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener threw exception! ", e);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
