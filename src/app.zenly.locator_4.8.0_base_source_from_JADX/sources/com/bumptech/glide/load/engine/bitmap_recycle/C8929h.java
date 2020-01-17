package com.bumptech.glide.load.engine.bitmap_recycle;

import android.util.Log;
import com.bumptech.glide.p301o.C9216j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h */
public final class C8929h implements ArrayPool {

    /* renamed from: a */
    private final C8926f<C8930a, Object> f23257a = new C8926f<>();

    /* renamed from: b */
    private final C8931b f23258b = new C8931b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f23259c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C8919a<?>> f23260d = new HashMap();

    /* renamed from: e */
    private final int f23261e;

    /* renamed from: f */
    private int f23262f;

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h$a */
    private static final class C8930a implements C8936k {

        /* renamed from: a */
        private final C8931b f23263a;

        /* renamed from: b */
        int f23264b;

        /* renamed from: c */
        private Class<?> f23265c;

        C8930a(C8931b bVar) {
            this.f23263a = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24351a(int i, Class<?> cls) {
            this.f23264b = i;
            this.f23265c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8930a)) {
                return false;
            }
            C8930a aVar = (C8930a) obj;
            if (this.f23264b == aVar.f23264b && this.f23265c == aVar.f23265c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f23264b * 31;
            Class<?> cls = this.f23265c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Key{size=");
            sb.append(this.f23264b);
            sb.append("array=");
            sb.append(this.f23265c);
            sb.append('}');
            return sb.toString();
        }

        /* renamed from: a */
        public void mo24333a() {
            this.f23263a.mo24340a(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.h$b */
    private static final class C8931b extends C8923c<C8930a> {
        C8931b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8930a mo24355a(int i, Class<?> cls) {
            C8930a aVar = (C8930a) mo24341b();
            aVar.mo24351a(i, cls);
            return aVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C8930a m21453a() {
            return new C8930a(this);
        }
    }

    public C8929h(int i) {
        this.f23261e = i;
    }

    /* renamed from: a */
    private <T> T m21441a(C8930a aVar, Class<T> cls) {
        C8919a a = m21438a(cls);
        T a2 = m21440a(aVar);
        if (a2 != null) {
            this.f23262f -= a.mo24323a(a2) * a.mo24322a();
            m21444a(a.mo24323a(a2), cls);
        }
        if (a2 != null) {
            return a2;
        }
        if (Log.isLoggable(a.getTag(), 2)) {
            String tag = a.getTag();
            StringBuilder sb = new StringBuilder();
            sb.append("Allocated ");
            sb.append(aVar.f23264b);
            sb.append(" bytes");
            Log.v(tag, sb.toString());
        }
        return a.newArray(aVar.f23264b);
    }

    /* renamed from: b */
    private boolean m21448b(int i) {
        return i <= this.f23261e / 2;
    }

    public synchronized void clearMemory() {
        m21443a(0);
    }

    public synchronized <T> T get(int i, Class<T> cls) {
        C8930a aVar;
        Integer num = (Integer) m21446b(cls).ceilingKey(Integer.valueOf(i));
        if (m21445a(i, num)) {
            aVar = this.f23258b.mo24355a(num.intValue(), cls);
        } else {
            aVar = this.f23258b.mo24355a(i, cls);
        }
        return m21441a(aVar, cls);
    }

    public synchronized <T> T getExact(int i, Class<T> cls) {
        return m21441a(this.f23258b.mo24355a(i, cls), cls);
    }

    @Deprecated
    public <T> void put(T t, Class<T> cls) {
        put(t);
    }

    public synchronized void trimMemory(int i) {
        if (i >= 40) {
            try {
                clearMemory();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m21443a(this.f23261e / 2);
        }
    }

    /* renamed from: b */
    private boolean m21447b() {
        int i = this.f23262f;
        return i == 0 || this.f23261e / i >= 2;
    }

    public synchronized <T> void put(T t) {
        Class cls = t.getClass();
        C8919a a = m21438a(cls);
        int a2 = a.mo24323a(t);
        int a3 = a.mo24322a() * a2;
        if (m21448b(a3)) {
            C8930a a4 = this.f23258b.mo24355a(a2, cls);
            this.f23257a.mo24345a(a4, t);
            NavigableMap b = m21446b(cls);
            Integer num = (Integer) b.get(Integer.valueOf(a4.f23264b));
            Integer valueOf = Integer.valueOf(a4.f23264b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            b.put(valueOf, Integer.valueOf(i));
            this.f23262f += a3;
            m21442a();
        }
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m21446b(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f23259c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f23259c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    private <T> T m21440a(C8930a aVar) {
        return this.f23257a.mo24344a(aVar);
    }

    /* renamed from: a */
    private boolean m21445a(int i, Integer num) {
        return num != null && (m21447b() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    private void m21442a() {
        m21443a(this.f23261e);
    }

    /* renamed from: a */
    private void m21443a(int i) {
        while (this.f23262f > i) {
            Object a = this.f23257a.mo24343a();
            C9216j.m22083a(a);
            C8919a a2 = m21439a((T) a);
            this.f23262f -= a2.mo24323a(a) * a2.mo24322a();
            m21444a(a2.mo24323a(a), a.getClass());
            if (Log.isLoggable(a2.getTag(), 2)) {
                String tag = a2.getTag();
                StringBuilder sb = new StringBuilder();
                sb.append("evicted: ");
                sb.append(a2.mo24323a(a));
                Log.v(tag, sb.toString());
            }
        }
    }

    /* renamed from: a */
    private void m21444a(int i, Class<?> cls) {
        NavigableMap b = m21446b(cls);
        Integer num = (Integer) b.get(Integer.valueOf(i));
        if (num == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(i);
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num.intValue() == 1) {
            b.remove(Integer.valueOf(i));
        } else {
            b.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: a */
    private <T> C8919a<T> m21439a(T t) {
        return m21438a(t.getClass());
    }

    /* renamed from: a */
    private <T> C8919a<T> m21438a(Class<T> cls) {
        C8919a<T> aVar = (C8919a) this.f23260d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C8928g<>();
            } else if (cls.equals(byte[].class)) {
                aVar = new C8925e<>();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("No array pool found for: ");
                sb.append(cls.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            this.f23260d.put(cls, aVar);
        }
        return aVar;
    }
}
