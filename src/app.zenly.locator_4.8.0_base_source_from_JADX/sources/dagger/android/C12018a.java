package dagger.android;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import dagger.internal.C12021c;

/* renamed from: dagger.android.a */
public final class C12018a {
    /* renamed from: a */
    public static void m31663a(Activity activity) {
        C12021c.m31671a(activity, "activity");
        Application application = activity.getApplication();
        if (application instanceof HasActivityInjector) {
            AndroidInjector activityInjector = ((HasActivityInjector) application).activityInjector();
            C12021c.m31672a(activityInjector, "%s.activityInjector() returned null", application.getClass().getCanonicalName());
            activityInjector.inject(activity);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), HasActivityInjector.class.getCanonicalName()}));
    }

    /* renamed from: a */
    public static void m31664a(Service service) {
        C12021c.m31671a(service, "service");
        Application application = service.getApplication();
        if (application instanceof HasServiceInjector) {
            AndroidInjector serviceInjector = ((HasServiceInjector) application).serviceInjector();
            C12021c.m31672a(serviceInjector, "%s.serviceInjector() returned null", application.getClass().getCanonicalName());
            serviceInjector.inject(service);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), HasServiceInjector.class.getCanonicalName()}));
    }

    /* renamed from: a */
    public static void m31665a(BroadcastReceiver broadcastReceiver, Context context) {
        C12021c.m31671a(broadcastReceiver, "broadcastReceiver");
        C12021c.m31671a(context, "context");
        Application application = (Application) context.getApplicationContext();
        if (application instanceof HasBroadcastReceiverInjector) {
            AndroidInjector broadcastReceiverInjector = ((HasBroadcastReceiverInjector) application).broadcastReceiverInjector();
            C12021c.m31672a(broadcastReceiverInjector, "%s.broadcastReceiverInjector() returned null", application.getClass().getCanonicalName());
            broadcastReceiverInjector.inject(broadcastReceiver);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), HasBroadcastReceiverInjector.class.getCanonicalName()}));
    }

    /* renamed from: a */
    public static void m31666a(ContentProvider contentProvider) {
        C12021c.m31671a(contentProvider, "contentProvider");
        Application application = (Application) contentProvider.getContext().getApplicationContext();
        if (application instanceof HasContentProviderInjector) {
            AndroidInjector contentProviderInjector = ((HasContentProviderInjector) application).contentProviderInjector();
            C12021c.m31672a(contentProviderInjector, "%s.contentProviderInjector() returned null", application.getClass().getCanonicalName());
            contentProviderInjector.inject(contentProvider);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), HasContentProviderInjector.class.getCanonicalName()}));
    }
}
