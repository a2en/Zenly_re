package androidx.lifecycle;

import androidx.lifecycle.C0862g.C0863a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: androidx.lifecycle.b */
class C0852b {

    /* renamed from: c */
    static C0852b f3441c = new C0852b();

    /* renamed from: a */
    private final Map<Class<?>, C0853a> f3442a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f3443b = new HashMap();

    /* renamed from: androidx.lifecycle.b$a */
    static class C0853a {

        /* renamed from: a */
        final Map<C0863a, List<C0854b>> f3444a = new HashMap();

        /* renamed from: b */
        final Map<C0854b, C0863a> f3445b;

        C0853a(Map<C0854b, C0863a> map) {
            this.f3445b = map;
            for (Entry entry : map.entrySet()) {
                C0863a aVar = (C0863a) entry.getValue();
                List list = (List) this.f3444a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f3444a.put(aVar, list);
                }
                list.add(entry.getKey());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4421a(LifecycleOwner lifecycleOwner, C0863a aVar, Object obj) {
            m4013a((List) this.f3444a.get(aVar), lifecycleOwner, aVar, obj);
            m4013a((List) this.f3444a.get(C0863a.ON_ANY), lifecycleOwner, aVar, obj);
        }

        /* renamed from: a */
        private static void m4013a(List<C0854b> list, LifecycleOwner lifecycleOwner, C0863a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0854b) list.get(size)).mo4422a(lifecycleOwner, aVar, obj);
                }
            }
        }
    }

    /* renamed from: androidx.lifecycle.b$b */
    static class C0854b {

        /* renamed from: a */
        final int f3446a;

        /* renamed from: b */
        final Method f3447b;

        C0854b(int i, Method method) {
            this.f3446a = i;
            this.f3447b = method;
            this.f3447b.setAccessible(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4422a(LifecycleOwner lifecycleOwner, C0863a aVar, Object obj) {
            try {
                int i = this.f3446a;
                if (i == 0) {
                    this.f3447b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f3447b.invoke(obj, new Object[]{lifecycleOwner});
                } else if (i == 2) {
                    this.f3447b.invoke(obj, new Object[]{lifecycleOwner, aVar});
                }
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to call observer method", e.getCause());
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            }
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C0854b.class != obj.getClass()) {
                return false;
            }
            C0854b bVar = (C0854b) obj;
            if (this.f3446a != bVar.f3446a || !this.f3447b.getName().equals(bVar.f3447b.getName())) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.f3446a * 31) + this.f3447b.getName().hashCode();
        }
    }

    C0852b() {
    }

    /* renamed from: c */
    private Method[] m4010c(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0853a mo4419a(Class<?> cls) {
        C0853a aVar = (C0853a) this.f3442a.get(cls);
        if (aVar != null) {
            return aVar;
        }
        return m4008a(cls, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4420b(Class<?> cls) {
        Boolean bool = (Boolean) this.f3443b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] c = m4010c(cls);
        for (Method annotation : c) {
            if (((C0875o) annotation.getAnnotation(C0875o.class)) != null) {
                m4008a(cls, c);
                return true;
            }
        }
        this.f3443b.put(cls, Boolean.valueOf(false));
        return false;
    }

    /* renamed from: a */
    private void m4009a(Map<C0854b, C0863a> map, C0854b bVar, C0863a aVar, Class<?> cls) {
        C0863a aVar2 = (C0863a) map.get(bVar);
        if (aVar2 != null && aVar != aVar2) {
            Method method = bVar.f3447b;
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(method.getName());
            sb.append(" in ");
            sb.append(cls.getName());
            sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
            sb.append(aVar2);
            sb.append(", new value ");
            sb.append(aVar);
            throw new IllegalArgumentException(sb.toString());
        } else if (aVar2 == null) {
            map.put(bVar, aVar);
        }
    }

    /* renamed from: a */
    private C0853a m4008a(Class<?> cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            C0853a a = mo4419a(superclass);
            if (a != null) {
                hashMap.putAll(a.f3445b);
            }
        }
        for (Class a2 : cls.getInterfaces()) {
            for (Entry entry : mo4419a(a2).f3445b.entrySet()) {
                m4009a(hashMap, (C0854b) entry.getKey(), (C0863a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m4010c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            C0875o oVar = (C0875o) method.getAnnotation(C0875o.class);
            if (oVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0863a value = oVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(C0863a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0863a.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m4009a(hashMap, new C0854b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0853a aVar = new C0853a(hashMap);
        this.f3442a.put(cls, aVar);
        this.f3443b.put(cls, Boolean.valueOf(z));
        return aVar;
    }
}
