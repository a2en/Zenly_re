package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

/* renamed from: com.crashlytics.android.answers.k */
public class C9278k implements EventLogger {

    /* renamed from: a */
    private final Method f24107a;

    /* renamed from: b */
    private final Object f24108b;

    public C9278k(Object obj, Method method) {
        this.f24108b = obj;
        this.f24107a = method;
    }

    /* renamed from: a */
    private static Class m22353a(Context context) {
        try {
            return context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static EventLogger m22355b(Context context) {
        Class a = m22353a(context);
        if (a == null) {
            return null;
        }
        Object a2 = m22354a(context, a);
        if (a2 == null) {
            return null;
        }
        Method b = m22356b(context, a);
        if (b == null) {
            return null;
        }
        return new C9278k(a2, b);
    }

    public void logEvent(String str, Bundle bundle) {
        logEvent("fab", str, bundle);
    }

    /* renamed from: a */
    private static Object m22354a(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        try {
            this.f24107a.invoke(this.f24108b, new Object[]{str, str2, bundle});
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static Method m22356b(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
        } catch (Exception unused) {
            return null;
        }
    }
}
