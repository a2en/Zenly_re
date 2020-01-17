package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.util.C10174k;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class BackgroundDetector implements ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: i */
    private static final BackgroundDetector f26296i = new BackgroundDetector();

    /* renamed from: e */
    private final AtomicBoolean f26297e = new AtomicBoolean();

    /* renamed from: f */
    private final AtomicBoolean f26298f = new AtomicBoolean();

    /* renamed from: g */
    private final ArrayList<BackgroundStateChangeListener> f26299g = new ArrayList<>();

    /* renamed from: h */
    private boolean f26300h = false;

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    private BackgroundDetector() {
    }

    /* renamed from: a */
    public static void m25075a(Application application) {
        synchronized (f26296i) {
            if (!f26296i.f26300h) {
                application.registerActivityLifecycleCallbacks(f26296i);
                application.registerComponentCallbacks(f26296i);
                f26296i.f26300h = true;
            }
        }
    }

    /* renamed from: b */
    public static BackgroundDetector m25076b() {
        return f26296i;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f26297e.compareAndSet(true, false);
        this.f26298f.set(true);
        if (compareAndSet) {
            m25077b(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f26297e.compareAndSet(true, false);
        this.f26298f.set(true);
        if (compareAndSet) {
            m25077b(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f26297e.compareAndSet(false, true)) {
            this.f26298f.set(true);
            m25077b(true);
        }
    }

    /* renamed from: b */
    private final void m25077b(boolean z) {
        synchronized (f26296i) {
            ArrayList<BackgroundStateChangeListener> arrayList = this.f26299g;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((BackgroundStateChangeListener) obj).onBackgroundStateChanged(z);
            }
        }
    }

    @TargetApi(16)
    /* renamed from: a */
    public final boolean mo27093a(boolean z) {
        if (!this.f26298f.get()) {
            if (!C10174k.m25680c()) {
                return z;
            }
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f26298f.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f26297e.set(true);
            }
        }
        return mo27092a();
    }

    /* renamed from: a */
    public final boolean mo27092a() {
        return this.f26297e.get();
    }

    /* renamed from: a */
    public final void mo27091a(BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f26296i) {
            this.f26299g.add(backgroundStateChangeListener);
        }
    }
}
