package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.Logger;

/* renamed from: com.crashlytics.android.core.t */
class C9411t implements C9306b {

    /* renamed from: c */
    private static final List<Class<?>> f24373c = Collections.unmodifiableList(Arrays.asList(new Class[]{String.class, String.class, Bundle.class, Long.class}));
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C9382l f24374a;

    /* renamed from: b */
    private Object f24375b;

    /* renamed from: com.crashlytics.android.core.t$a */
    class C9412a implements InvocationHandler {
        C9412a() {
        }

        /* renamed from: a */
        public boolean mo25225a(Object obj, Object obj2) {
            boolean z = true;
            if (obj == obj2) {
                return true;
            }
            if (obj2 == null || !Proxy.isProxyClass(obj2.getClass()) || !super.equals(Proxy.getInvocationHandler(obj2))) {
                z = false;
            }
            return z;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            if (objArr.length == 1 && name.equals("equals")) {
                return Boolean.valueOf(mo25225a(obj, objArr[0]));
            }
            if (objArr.length == 0 && name.equals("hashCode")) {
                return Integer.valueOf(super.hashCode());
            }
            if (objArr.length == 0 && name.equals("toString")) {
                return super.toString();
            }
            if (objArr.length == 4 && name.equals("onEvent") && C9411t.m22768a(objArr)) {
                String str = objArr[0];
                String str2 = objArr[1];
                Bundle bundle = objArr[2];
                if (str != null && !str.equals("crash")) {
                    C9411t.m22770b(C9411t.this.f24374a, str2, bundle);
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected method invoked on AppMeasurement.EventListener: ");
            sb.append(name);
            sb.append("(");
            StringBuilder sb2 = new StringBuilder(sb.toString());
            for (int i = 0; i < objArr.length; i++) {
                if (i > 0) {
                    sb2.append(", ");
                }
                sb2.append(objArr[0].getClass().getName());
            }
            sb2.append("); returning null");
            C12154c.m32113f().mo35956e("CrashlyticsCore", sb2.toString());
            return null;
        }
    }

    public C9411t(C9382l lVar) {
        this.f24374a = lVar;
    }

    /* renamed from: b */
    private Object m22769b(Class<?> cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{this.f24374a.mo36008b()});
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean register() {
        Class a = m22765a("com.google.android.gms.measurement.AppMeasurement");
        String str = "CrashlyticsCore";
        if (a == null) {
            C12154c.m32113f().mo35954d(str, "Firebase Analytics is not present; you will not see automatic logging of events before a crash occurs.");
            return false;
        }
        Object b = m22769b(a);
        if (b == null) {
            C12154c.m32113f().mo35967w(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not create an instance of Firebase Analytics.");
            return false;
        }
        Class a2 = m22765a("com.google.android.gms.measurement.AppMeasurement$OnEventListener");
        if (a2 == null) {
            C12154c.m32113f().mo35967w(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Could not get class com.google.android.gms.measurement.AppMeasurement$OnEventListener");
            return false;
        }
        try {
            a.getDeclaredMethod("registerOnMeasurementEventListener", new Class[]{a2}).invoke(b, new Object[]{mo25224a(a2)});
        } catch (NoSuchMethodException e) {
            C12154c.m32113f().mo35968w(str, "Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: Method registerOnMeasurementEventListener not found.", e);
            return false;
        } catch (Exception e2) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot register AppMeasurement Listener for Crashlytics breadcrumbs: ");
            sb.append(e2.getMessage());
            f.mo35968w(str, sb.toString(), e2);
        }
        return true;
    }

    /* renamed from: a */
    private Class<?> m22765a(String str) {
        try {
            return this.f24374a.mo36008b().getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m22770b(C9382l lVar, String str, Bundle bundle) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("$A$:");
            sb.append(m22766a(str, bundle));
            lVar.mo25189a(sb.toString());
        } catch (JSONException unused) {
            Logger f = C12154c.m32113f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to serialize Firebase Analytics event; ");
            sb2.append(str);
            f.mo35967w("CrashlyticsCore", sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Object mo25224a(Class cls) {
        if (this.f24375b == null) {
            this.f24375b = Proxy.newProxyInstance(this.f24374a.mo36008b().getClassLoader(), new Class[]{cls}, new C9412a());
        }
        return this.f24375b;
    }

    /* renamed from: a */
    static boolean m22768a(Object[] objArr) {
        if (objArr.length != f24373c.size()) {
            return false;
        }
        Iterator it = f24373c.iterator();
        for (Object obj : objArr) {
            if (!obj.getClass().equals(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static String m22766a(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }
}
