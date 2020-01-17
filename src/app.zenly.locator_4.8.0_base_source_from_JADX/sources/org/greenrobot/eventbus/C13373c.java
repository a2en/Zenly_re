package org.greenrobot.eventbus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

/* renamed from: org.greenrobot.eventbus.c */
public class C13373c {

    /* renamed from: q */
    public static String f34684q = "EventBus";

    /* renamed from: r */
    private static final Map<Class<?>, List<Class<?>>> f34685r = new HashMap();

    /* renamed from: a */
    private final Map<Class<?>, CopyOnWriteArrayList<C13387m>> f34686a = new HashMap();

    /* renamed from: b */
    private final Map<Object, List<Class<?>>> f34687b = new HashMap();

    /* renamed from: c */
    private final Map<Class<?>, Object> f34688c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ThreadLocal<C13376c> f34689d = new C13374a(this);

    /* renamed from: e */
    private final C13378e f34690e = new C13378e(this, Looper.getMainLooper(), 10);

    /* renamed from: f */
    private final C13372b f34691f = new C13372b(this);

    /* renamed from: g */
    private final C13371a f34692g = new C13371a(this);

    /* renamed from: h */
    private final C13385l f34693h;

    /* renamed from: i */
    private final ExecutorService f34694i;

    /* renamed from: j */
    private final boolean f34695j;

    /* renamed from: k */
    private final boolean f34696k;

    /* renamed from: l */
    private final boolean f34697l;

    /* renamed from: m */
    private final boolean f34698m;

    /* renamed from: n */
    private final boolean f34699n;

    /* renamed from: o */
    private final boolean f34700o;

    /* renamed from: p */
    private final int f34701p;

    /* renamed from: org.greenrobot.eventbus.c$a */
    class C13374a extends ThreadLocal<C13376c> {
        C13374a(C13373c cVar) {
        }

        /* access modifiers changed from: protected */
        public C13376c initialValue() {
            return new C13376c();
        }
    }

    /* renamed from: org.greenrobot.eventbus.c$b */
    static /* synthetic */ class C13375b {

        /* renamed from: a */
        static final /* synthetic */ int[] f34702a = new int[ThreadMode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                org.greenrobot.eventbus.ThreadMode[] r0 = org.greenrobot.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34702a = r0
                int[] r0 = f34702a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f34702a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f34702a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f34702a     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.C13373c.C13375b.<clinit>():void");
        }
    }

    /* renamed from: org.greenrobot.eventbus.c$c */
    static final class C13376c {

        /* renamed from: a */
        final List<Object> f34703a = new ArrayList();

        /* renamed from: b */
        boolean f34704b;

        /* renamed from: c */
        boolean f34705c;

        /* renamed from: d */
        C13387m f34706d;

        /* renamed from: e */
        Object f34707e;

        /* renamed from: f */
        boolean f34708f;

        C13376c() {
        }
    }

    static {
        new C13377d();
    }

    C13373c(C13377d dVar) {
        List<SubscriberInfoIndex> list = dVar.f34719j;
        this.f34701p = list != null ? list.size() : 0;
        this.f34693h = new C13385l(dVar.f34719j, dVar.f34717h, dVar.f34716g);
        this.f34696k = dVar.f34710a;
        this.f34697l = dVar.f34711b;
        this.f34698m = dVar.f34712c;
        this.f34699n = dVar.f34713d;
        this.f34695j = dVar.f34714e;
        this.f34700o = dVar.f34715f;
        this.f34694i = dVar.f34718i;
    }

    /* renamed from: a */
    private void m35442a(Object obj, C13384k kVar) {
        Class<?> cls = kVar.f34735c;
        C13387m mVar = new C13387m(obj, kVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f34686a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f34686a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(mVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Subscriber ");
            sb.append(obj.getClass());
            sb.append(" already registered to event ");
            sb.append(cls);
            throw new EventBusException(sb.toString());
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || kVar.f34736d > ((C13387m) copyOnWriteArrayList.get(i)).f34752b.f34736d) {
                copyOnWriteArrayList.add(i, mVar);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, mVar);
        List list = (List) this.f34687b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f34687b.put(obj, list);
        }
        list.add(cls);
        if (!kVar.f34737e) {
            return;
        }
        if (this.f34700o) {
            for (Entry entry : this.f34688c.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    m35448b(mVar, entry.getValue());
                }
            }
            return;
        }
        m35448b(mVar, this.f34688c.get(cls));
    }

    /* renamed from: b */
    public static C13377d m35447b() {
        return new C13377d();
    }

    /* renamed from: c */
    public synchronized void mo38586c(Object obj) {
        List<Class> list = (List) this.f34687b.get(obj);
        if (list != null) {
            for (Class a : list) {
                m35440a(obj, a);
            }
            this.f34687b.remove(obj);
        } else {
            String str = f34684q;
            StringBuilder sb = new StringBuilder();
            sb.append("Subscriber to unregister was not registered before: ");
            sb.append(obj.getClass());
            Log.w(str, sb.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventBus[indexCount=");
        sb.append(this.f34701p);
        sb.append(", eventInheritance=");
        sb.append(this.f34700o);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public void mo38585b(Object obj) {
        List<C13384k> a = this.f34693h.mo38604a(obj.getClass());
        synchronized (this) {
            for (C13384k a2 : a) {
                m35442a(obj, a2);
            }
        }
    }

    /* renamed from: b */
    private void m35448b(C13387m mVar, Object obj) {
        if (obj != null) {
            m35445a(mVar, obj, Looper.getMainLooper() == Looper.myLooper());
        }
    }

    /* renamed from: a */
    private void m35440a(Object obj, Class<?> cls) {
        List list = (List) this.f34686a.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C13387m mVar = (C13387m) list.get(i);
                if (mVar.f34751a == obj) {
                    mVar.f34753c = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* renamed from: a */
    public void mo38582a(Object obj) {
        C13376c cVar = (C13376c) this.f34689d.get();
        List<Object> list = cVar.f34703a;
        list.add(obj);
        if (!cVar.f34704b) {
            cVar.f34705c = Looper.getMainLooper() == Looper.myLooper();
            cVar.f34704b = true;
            if (!cVar.f34708f) {
                while (!list.isEmpty()) {
                    try {
                        m35441a(list.remove(0), cVar);
                    } finally {
                        cVar.f34704b = false;
                        cVar.f34705c = false;
                    }
                }
                return;
            }
            throw new EventBusException("Internal error. Abort state was not reset");
        }
    }

    /* renamed from: a */
    private void m35441a(Object obj, C13376c cVar) throws Error {
        boolean z;
        Class<C13383j> cls = obj.getClass();
        if (this.f34700o) {
            List a = m35439a(cls);
            z = false;
            for (int i = 0; i < a.size(); i++) {
                z |= m35446a(obj, cVar, (Class) a.get(i));
            }
        } else {
            z = m35446a(obj, cVar, cls);
        }
        if (!z) {
            if (this.f34697l) {
                String str = f34684q;
                StringBuilder sb = new StringBuilder();
                sb.append("No subscribers registered for event ");
                sb.append(cls);
                Log.d(str, sb.toString());
            }
            if (this.f34699n && cls != C13379f.class && cls != C13383j.class) {
                mo38582a((Object) new C13379f(this, obj));
            }
        }
    }

    /* renamed from: a */
    private boolean m35446a(Object obj, C13376c cVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f34686a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C13387m mVar = (C13387m) it.next();
            cVar.f34707e = obj;
            cVar.f34706d = mVar;
            try {
                m35445a(mVar, obj, cVar.f34705c);
                if (cVar.f34708f) {
                    break;
                }
            } finally {
                cVar.f34707e = null;
                cVar.f34706d = null;
                cVar.f34708f = false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private void m35445a(C13387m mVar, Object obj, boolean z) {
        int i = C13375b.f34702a[mVar.f34752b.f34734b.ordinal()];
        if (i == 1) {
            mo38584a(mVar, obj);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.f34692g.mo38577a(mVar, obj);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown thread mode: ");
                sb.append(mVar.f34752b.f34734b);
                throw new IllegalStateException(sb.toString());
            } else if (z) {
                this.f34691f.mo38579a(mVar, obj);
            } else {
                mo38584a(mVar, obj);
            }
        } else if (z) {
            mo38584a(mVar, obj);
        } else {
            this.f34690e.mo38594a(mVar, obj);
        }
    }

    /* renamed from: a */
    private static List<Class<?>> m35439a(Class<?> cls) {
        List<Class<?>> list;
        synchronized (f34685r) {
            list = (List) f34685r.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m35443a(list, (Class<?>[]) cls2.getInterfaces());
                }
                f34685r.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: a */
    static void m35443a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m35443a(list, (Class<?>[]) cls.getInterfaces());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38583a(C13380g gVar) {
        Object obj = gVar.f34725a;
        C13387m mVar = gVar.f34726b;
        C13380g.m35462a(gVar);
        if (mVar.f34753c) {
            mo38584a(mVar, obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38584a(C13387m mVar, Object obj) {
        try {
            mVar.f34752b.f34733a.invoke(mVar.f34751a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            m35444a(mVar, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: a */
    private void m35444a(C13387m mVar, Object obj, Throwable th) {
        if (obj instanceof C13383j) {
            if (this.f34696k) {
                String str = f34684q;
                StringBuilder sb = new StringBuilder();
                sb.append("SubscriberExceptionEvent subscriber ");
                sb.append(mVar.f34751a.getClass());
                sb.append(" threw an exception");
                Log.e(str, sb.toString(), th);
                C13383j jVar = (C13383j) obj;
                String str2 = f34684q;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Initial event ");
                sb2.append(jVar.f34731b);
                sb2.append(" caused exception in ");
                sb2.append(jVar.f34732c);
                Log.e(str2, sb2.toString(), jVar.f34730a);
            }
        } else if (!this.f34695j) {
            if (this.f34696k) {
                String str3 = f34684q;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not dispatch event: ");
                sb3.append(obj.getClass());
                sb3.append(" to subscribing class ");
                sb3.append(mVar.f34751a.getClass());
                Log.e(str3, sb3.toString(), th);
            }
            if (this.f34698m) {
                mo38582a((Object) new C13383j(this, th, obj, mVar.f34751a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ExecutorService mo38581a() {
        return this.f34694i;
    }
}
