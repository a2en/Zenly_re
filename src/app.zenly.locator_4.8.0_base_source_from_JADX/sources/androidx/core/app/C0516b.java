package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.b */
final class C0516b {

    /* renamed from: a */
    protected static final Class<?> f2495a = m2454a();

    /* renamed from: b */
    protected static final Field f2496b = m2458b();

    /* renamed from: c */
    protected static final Field f2497c = m2460c();

    /* renamed from: d */
    protected static final Method f2498d = m2459b(f2495a);

    /* renamed from: e */
    protected static final Method f2499e = m2455a(f2495a);

    /* renamed from: f */
    protected static final Method f2500f = m2461c(f2495a);

    /* renamed from: g */
    private static final Handler f2501g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.b$a */
    static class C0517a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C0520d f2502e;

        /* renamed from: f */
        final /* synthetic */ Object f2503f;

        C0517a(C0520d dVar, Object obj) {
            this.f2502e = dVar;
            this.f2503f = obj;
        }

        public void run() {
            this.f2502e.f2508e = this.f2503f;
        }
    }

    /* renamed from: androidx.core.app.b$b */
    static class C0518b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Application f2504e;

        /* renamed from: f */
        final /* synthetic */ C0520d f2505f;

        C0518b(Application application, C0520d dVar) {
            this.f2504e = application;
            this.f2505f = dVar;
        }

        public void run() {
            this.f2504e.unregisterActivityLifecycleCallbacks(this.f2505f);
        }
    }

    /* renamed from: androidx.core.app.b$c */
    static class C0519c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Object f2506e;

        /* renamed from: f */
        final /* synthetic */ Object f2507f;

        C0519c(Object obj, Object obj2) {
            this.f2506e = obj;
            this.f2507f = obj2;
        }

        public void run() {
            try {
                if (C0516b.f2498d != null) {
                    C0516b.f2498d.invoke(this.f2506e, new Object[]{this.f2507f, Boolean.valueOf(false), "AppCompat recreation"});
                    return;
                }
                C0516b.f2499e.invoke(this.f2506e, new Object[]{this.f2507f, Boolean.valueOf(false)});
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.b$d */
    private static final class C0520d implements ActivityLifecycleCallbacks {

        /* renamed from: e */
        Object f2508e;

        /* renamed from: f */
        private Activity f2509f;

        /* renamed from: g */
        private boolean f2510g = false;

        /* renamed from: h */
        private boolean f2511h = false;

        /* renamed from: i */
        private boolean f2512i = false;

        C0520d(Activity activity) {
            this.f2509f = activity;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f2509f == activity) {
                this.f2509f = null;
                this.f2511h = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f2511h && !this.f2512i && !this.f2510g && C0516b.m2457a(this.f2508e, activity)) {
                this.f2512i = true;
                this.f2508e = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f2509f == activity) {
                this.f2510g = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static boolean m2456a(Activity activity) {
        Application application;
        C0520d dVar;
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m2462d() && f2500f == null) {
            return false;
        } else {
            if (f2499e == null && f2498d == null) {
                return false;
            }
            try {
                Object obj = f2497c.get(activity);
                if (obj == null) {
                    return false;
                }
                Object obj2 = f2496b.get(activity);
                if (obj2 == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0520d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                f2501g.post(new C0517a(dVar, obj));
                if (m2462d()) {
                    f2500f.invoke(obj2, new Object[]{obj, null, null, Integer.valueOf(0), Boolean.valueOf(false), null, null, Boolean.valueOf(false), Boolean.valueOf(false)});
                } else {
                    activity.recreate();
                }
                f2501g.post(new C0518b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    /* renamed from: b */
    private static Method m2459b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m2461c(Class<?> cls) {
        if (m2462d() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m2462d() {
        int i = VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: b */
    private static Field m2458b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Field m2460c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    protected static boolean m2457a(Object obj, Activity activity) {
        try {
            Object obj2 = f2497c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            f2501g.postAtFrontOfQueue(new C0519c(f2496b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: a */
    private static Method m2455a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Class<?> m2454a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }
}
