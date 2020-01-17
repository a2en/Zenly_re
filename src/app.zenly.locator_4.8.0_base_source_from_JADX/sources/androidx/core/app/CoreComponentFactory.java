package androidx.core.app;

import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;

public class CoreComponentFactory extends AppComponentFactory {

    public interface CompatWrapped {
        Object getWrapper();
    }

    /* renamed from: a */
    static <T> T m2358a(T t) {
        if (t instanceof CompatWrapped) {
            T wrapper = ((CompatWrapped) t).getWrapper();
            if (wrapper != null) {
                return wrapper;
            }
        }
        return t;
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Activity) m2358a(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Application) m2358a(super.instantiateApplication(classLoader, str));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (ContentProvider) m2358a(super.instantiateProvider(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (BroadcastReceiver) m2358a(super.instantiateReceiver(classLoader, str, intent));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (Service) m2358a(super.instantiateService(classLoader, str, intent));
    }
}
