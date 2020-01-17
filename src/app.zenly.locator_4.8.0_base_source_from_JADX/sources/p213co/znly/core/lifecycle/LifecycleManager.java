package p213co.znly.core.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;

/* renamed from: co.znly.core.lifecycle.LifecycleManager */
public class LifecycleManager implements ActivityLifecycleCallbacks {
    public LifecycleManager(Context context) {
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public native void onActivityCreated(Activity activity, Bundle bundle);

    public native void onActivityDestroyed(Activity activity);

    public native void onActivityPaused(Activity activity);

    public native void onActivityResumed(Activity activity);

    public native void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    public native void onActivityStarted(Activity activity);

    public native void onActivityStopped(Activity activity);
}
