package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.e */
public final class C11028e<T> {

    /* renamed from: a */
    private final T f28626a;

    /* renamed from: b */
    private final C11031c<T> f28627b;

    /* renamed from: com.google.firebase.components.e$b */
    private static class C11030b implements C11031c<Context> {
        private C11030b() {
        }

        /* renamed from: b */
        private static Bundle m28417b(Context context) {
            String str = "ComponentDiscovery";
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w(str, "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w(str, "ComponentDiscoveryService has no service info.");
                return null;
            } catch (NameNotFoundException unused) {
                Log.w(str, "Application info not found.");
                return null;
            }
        }

        /* renamed from: a */
        public List<String> mo32189a(Context context) {
            Bundle b = m28417b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.firebase.components.e$c */
    interface C11031c<T> {
        /* renamed from: a */
        List<String> mo32189a(T t);
    }

    C11028e(T t, C11031c<T> cVar) {
        this.f28626a = t;
        this.f28627b = cVar;
    }

    /* renamed from: a */
    public static C11028e<Context> m28414a(Context context) {
        return new C11028e<>(context, new C11030b());
    }

    /* renamed from: a */
    public List<ComponentRegistrar> mo32187a() {
        return m28415a(this.f28627b.mo32189a(this.f28626a));
    }

    /* renamed from: a */
    private static List<ComponentRegistrar> m28415a(List<String> list) {
        String str = "Could not instantiate %s";
        String str2 = "Could not instantiate %s.";
        String str3 = "ComponentDiscovery";
        ArrayList arrayList = new ArrayList();
        for (String str4 : list) {
            try {
                Class cls = Class.forName(str4);
                if (!ComponentRegistrar.class.isAssignableFrom(cls)) {
                    Log.w(str3, String.format("Class %s is not an instance of %s", new Object[]{str4, "com.google.firebase.components.ComponentRegistrar"}));
                } else {
                    arrayList.add((ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
            } catch (ClassNotFoundException e) {
                Log.w(str3, String.format("Class %s is not an found.", new Object[]{str4}), e);
            } catch (IllegalAccessException e2) {
                Log.w(str3, String.format(str2, new Object[]{str4}), e2);
            } catch (InstantiationException e3) {
                Log.w(str3, String.format(str2, new Object[]{str4}), e3);
            } catch (NoSuchMethodException e4) {
                Log.w(str3, String.format(str, new Object[]{str4}), e4);
            } catch (InvocationTargetException e5) {
                Log.w(str3, String.format(str, new Object[]{str4}), e5);
            }
        }
        return arrayList;
    }
}
