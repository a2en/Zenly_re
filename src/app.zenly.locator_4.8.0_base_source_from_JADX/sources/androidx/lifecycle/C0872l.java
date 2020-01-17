package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.l */
public class C0872l {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f3477a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends GeneratedAdapter>>> f3478b = new HashMap();

    /* renamed from: a */
    static LifecycleEventObserver m4055a(Object obj) {
        boolean z = obj instanceof LifecycleEventObserver;
        boolean z2 = obj instanceof C0861f;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((C0861f) obj, (LifecycleEventObserver) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((C0861f) obj, null);
        }
        if (z) {
            return (LifecycleEventObserver) obj;
        }
        Class cls = obj.getClass();
        if (m4058b(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f3478b.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m4054a((Constructor) list.get(0), obj));
        }
        GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[list.size()];
        for (int i = 0; i < list.size(); i++) {
            generatedAdapterArr[i] = m4054a((Constructor) list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
    }

    /* renamed from: b */
    private static int m4058b(Class<?> cls) {
        Integer num = (Integer) f3477a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int d = m4060d(cls);
        f3477a.put(cls, Integer.valueOf(d));
        return d;
    }

    /* renamed from: c */
    private static boolean m4059c(Class<?> cls) {
        return cls != null && LifecycleObserver.class.isAssignableFrom(cls);
    }

    /* renamed from: d */
    private static int m4060d(Class<?> cls) {
        Class[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor a = m4057a(cls);
        if (a != null) {
            f3478b.put(cls, Collections.singletonList(a));
            return 2;
        } else if (C0852b.f3441c.mo4420b(cls)) {
            return 1;
        } else {
            Class superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m4059c(superclass)) {
                if (m4058b(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList((Collection) f3478b.get(superclass));
            }
            for (Class cls2 : cls.getInterfaces()) {
                if (m4059c(cls2)) {
                    if (m4058b(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll((Collection) f3478b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f3478b.put(cls, arrayList);
            return 2;
        }
    }

    /* renamed from: a */
    private static GeneratedAdapter m4054a(Constructor<? extends GeneratedAdapter> constructor, Object obj) {
        try {
            return (GeneratedAdapter) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: a */
    private static Constructor<? extends GeneratedAdapter> m4057a(Class<?> cls) {
        try {
            Package packageR = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = packageR != null ? packageR.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String a = m4056a(canonicalName);
            if (!name.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append(".");
                sb.append(a);
                a = sb.toString();
            }
            Constructor<? extends GeneratedAdapter> declaredConstructor = Class.forName(a).getDeclaredConstructor(new Class[]{cls});
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m4056a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
}
