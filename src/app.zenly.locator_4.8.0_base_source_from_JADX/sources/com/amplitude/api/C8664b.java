package com.amplitude.api;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: com.amplitude.api.b */
class C8664b implements ActivityLifecycleCallbacks {

    /* renamed from: f */
    private static C8681d f22254f = C8681d.m20309a();

    /* renamed from: e */
    private C8665c f22255e = null;

    public C8664b(C8665c cVar) {
        if (cVar == null) {
            f22254f.mo23381b("com.amplitude.api.AmplitudeCallbacks", "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
            return;
        }
        this.f22255e = cVar;
        cVar.mo23362h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo23307a() {
        return System.currentTimeMillis();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        C8665c cVar = this.f22255e;
        if (cVar == null) {
            f22254f.mo23381b("com.amplitude.api.AmplitudeCallbacks", "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            cVar.mo23347b(mo23307a());
        }
    }

    public void onActivityResumed(Activity activity) {
        C8665c cVar = this.f22255e;
        if (cVar == null) {
            f22254f.mo23381b("com.amplitude.api.AmplitudeCallbacks", "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            cVar.mo23327a(mo23307a());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
