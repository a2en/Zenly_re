package org.greenrobot.eventbus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

/* renamed from: org.greenrobot.eventbus.l */
class C13385l {

    /* renamed from: d */
    private static final Map<Class<?>, List<C13384k>> f34739d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final C13386a[] f34740e = new C13386a[4];

    /* renamed from: a */
    private List<SubscriberInfoIndex> f34741a;

    /* renamed from: b */
    private final boolean f34742b;

    /* renamed from: c */
    private final boolean f34743c;

    /* renamed from: org.greenrobot.eventbus.l$a */
    static class C13386a {

        /* renamed from: a */
        final List<C13384k> f34744a = new ArrayList();

        /* renamed from: b */
        final Map<Class, Object> f34745b = new HashMap();

        /* renamed from: c */
        final Map<String, Class> f34746c = new HashMap();

        /* renamed from: d */
        final StringBuilder f34747d = new StringBuilder(128);

        /* renamed from: e */
        Class<?> f34748e;

        /* renamed from: f */
        boolean f34749f;

        /* renamed from: g */
        SubscriberInfo f34750g;

        C13386a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38606a(Class<?> cls) {
            this.f34748e = cls;
            this.f34749f = false;
            this.f34750g = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo38608b() {
            this.f34744a.clear();
            this.f34745b.clear();
            this.f34746c.clear();
            this.f34747d.setLength(0);
            this.f34748e = null;
            this.f34749f = false;
            this.f34750g = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo38607a(Method method, Class<?> cls) {
            Object put = this.f34745b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m35474b((Method) put, cls)) {
                    this.f34745b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m35474b(method, cls);
        }

        /* renamed from: b */
        private boolean m35474b(Method method, Class<?> cls) {
            this.f34747d.setLength(0);
            this.f34747d.append(method.getName());
            StringBuilder sb = this.f34747d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f34747d.toString();
            Class declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f34746c.put(sb2, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f34746c.put(sb2, cls2);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38605a() {
            if (this.f34749f) {
                this.f34748e = null;
                return;
            }
            this.f34748e = this.f34748e.getSuperclass();
            String name = this.f34748e.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                this.f34748e = null;
            }
        }
    }

    C13385l(List<SubscriberInfoIndex> list, boolean z, boolean z2) {
        this.f34741a = list;
        this.f34742b = z;
        this.f34743c = z2;
    }

    /* renamed from: b */
    private List<C13384k> m35469b(Class<?> cls) {
        C13384k[] subscriberMethods;
        C13386a a = m35467a();
        a.mo38606a(cls);
        while (a.f34748e != null) {
            a.f34750g = m35472c(a);
            SubscriberInfo subscriberInfo = a.f34750g;
            if (subscriberInfo != null) {
                for (C13384k kVar : subscriberInfo.getSubscriberMethods()) {
                    if (a.mo38607a(kVar.f34733a, kVar.f34735c)) {
                        a.f34744a.add(kVar);
                    }
                }
            } else {
                m35468a(a);
            }
            a.mo38605a();
        }
        return m35470b(a);
    }

    /* renamed from: c */
    private SubscriberInfo m35472c(C13386a aVar) {
        SubscriberInfo subscriberInfo = aVar.f34750g;
        if (!(subscriberInfo == null || subscriberInfo.getSuperSubscriberInfo() == null)) {
            SubscriberInfo superSubscriberInfo = aVar.f34750g.getSuperSubscriberInfo();
            if (aVar.f34748e == superSubscriberInfo.getSubscriberClass()) {
                return superSubscriberInfo;
            }
        }
        List<SubscriberInfoIndex> list = this.f34741a;
        if (list != null) {
            for (SubscriberInfoIndex subscriberInfo2 : list) {
                SubscriberInfo subscriberInfo3 = subscriberInfo2.getSubscriberInfo(aVar.f34748e);
                if (subscriberInfo3 != null) {
                    return subscriberInfo3;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C13384k> mo38604a(Class<?> cls) {
        List<C13384k> list;
        List<C13384k> list2 = (List) f34739d.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.f34743c) {
            list = m35471c(cls);
        } else {
            list = m35469b(cls);
        }
        if (!list.isEmpty()) {
            f34739d.put(cls, list);
            return list;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Subscriber ");
        sb.append(cls);
        sb.append(" and its super classes have no public methods with the @Subscribe annotation");
        throw new EventBusException(sb.toString());
    }

    /* renamed from: c */
    private List<C13384k> m35471c(Class<?> cls) {
        C13386a a = m35467a();
        a.mo38606a(cls);
        while (a.f34748e != null) {
            m35468a(a);
            a.mo38605a();
        }
        return m35470b(a);
    }

    /* renamed from: a */
    private C13386a m35467a() {
        synchronized (f34740e) {
            for (int i = 0; i < 4; i++) {
                C13386a aVar = f34740e[i];
                if (aVar != null) {
                    f34740e[i] = null;
                    return aVar;
                }
            }
            return new C13386a();
        }
    }

    /* renamed from: b */
    private List<C13384k> m35470b(C13386a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f34744a);
        aVar.mo38608b();
        synchronized (f34740e) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                } else if (f34740e[i] == null) {
                    f34740e[i] = aVar;
                    break;
                } else {
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m35468a(C13386a aVar) {
        Method[] methodArr;
        try {
            methodArr = aVar.f34748e.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f34748e.getMethods();
            aVar.f34749f = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            String str = ".";
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    C13382i iVar = (C13382i) method.getAnnotation(C13382i.class);
                    if (iVar != null) {
                        Class cls = parameterTypes[0];
                        if (aVar.mo38607a(method, cls)) {
                            ThreadMode threadMode = iVar.threadMode();
                            List<C13384k> list = aVar.f34744a;
                            C13384k kVar = new C13384k(method, cls, threadMode, iVar.priority(), iVar.sticky());
                            list.add(kVar);
                        }
                    }
                } else if (this.f34742b && method.isAnnotationPresent(C13382i.class)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(method.getDeclaringClass().getName());
                    sb.append(str);
                    sb.append(method.getName());
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("@Subscribe method ");
                    sb3.append(sb2);
                    sb3.append("must have exactly 1 parameter but has ");
                    sb3.append(parameterTypes.length);
                    throw new EventBusException(sb3.toString());
                }
            } else if (this.f34742b && method.isAnnotationPresent(C13382i.class)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(method.getDeclaringClass().getName());
                sb4.append(str);
                sb4.append(method.getName());
                String sb5 = sb4.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(sb5);
                sb6.append(" is a illegal @Subscribe method: must be public, non-static, and non-abstract");
                throw new EventBusException(sb6.toString());
            }
        }
    }
}
