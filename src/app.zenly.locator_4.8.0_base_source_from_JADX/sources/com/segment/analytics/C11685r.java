package com.segment.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import com.segment.analytics.p326t.C11692b;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.segment.analytics.r */
public class C11685r implements Map<String, Object> {

    /* renamed from: e */
    private final Map<String, Object> f30300e;

    /* renamed from: com.segment.analytics.r$a */
    static class C11686a<T extends C11685r> {

        /* renamed from: a */
        private final SharedPreferences f30301a;

        /* renamed from: b */
        private final C11621c f30302b;

        /* renamed from: c */
        private final String f30303c;

        /* renamed from: d */
        private T f30304d;

        C11686a(Context context, C11621c cVar, String str, String str2, Class<T> cls) {
            this.f30302b = cVar;
            this.f30301a = C11692b.m30713b(context, str2);
            this.f30303c = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public T mo34373a(Map<String, Object> map) {
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34438a(T t) {
            this.f30304d = t;
            this.f30301a.edit().putString(this.f30303c, this.f30302b.mo34282a((Map<?, ?>) t)).apply();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public T mo34439b() {
            if (this.f30304d == null) {
                String string = this.f30301a.getString(this.f30303c, null);
                if (C11692b.m30721c((CharSequence) string)) {
                    return null;
                }
                try {
                    this.f30304d = mo34373a(this.f30302b.mo34284a(string));
                } catch (IOException unused) {
                    return null;
                }
            }
            return this.f30304d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo34440c() {
            return this.f30301a.contains(this.f30303c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34437a() {
            this.f30301a.edit().remove(this.f30303c).apply();
        }
    }

    public C11685r() {
        this.f30300e = new LinkedHashMap();
    }

    /* renamed from: a */
    static <T extends C11685r> T m30658a(Map map, Class<T> cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[]{Map.class});
            declaredConstructor.setAccessible(true);
            return (C11685r) declaredConstructor.newInstance(new Object[]{map});
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create instance of ");
            sb.append(cls.getCanonicalName());
            sb.append(".\n");
            sb.append(e);
            throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: b */
    public C11685r mo34265b(String str, Object obj) {
        this.f30300e.put(str, obj);
        return this;
    }

    public void clear() {
        this.f30300e.clear();
    }

    public boolean containsKey(Object obj) {
        return this.f30300e.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f30300e.containsValue(obj);
    }

    public Set<Entry<String, Object>> entrySet() {
        return this.f30300e.entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || this.f30300e.equals(obj);
    }

    public Object get(Object obj) {
        return this.f30300e.get(obj);
    }

    public int hashCode() {
        return this.f30300e.hashCode();
    }

    public boolean isEmpty() {
        return this.f30300e.isEmpty();
    }

    public Set<String> keySet() {
        return this.f30300e.keySet();
    }

    public void putAll(Map<? extends String, ?> map) {
        this.f30300e.putAll(map);
    }

    public Object remove(Object obj) {
        return this.f30300e.remove(obj);
    }

    public int size() {
        return this.f30300e.size();
    }

    public String toString() {
        return this.f30300e.toString();
    }

    public Collection<Object> values() {
        return this.f30300e.values();
    }

    /* renamed from: b */
    public C11685r mo34422b(Object obj) {
        Object obj2 = get(obj);
        if (obj2 instanceof C11685r) {
            return (C11685r) obj2;
        }
        if (obj2 instanceof Map) {
            return new C11685r((Map) obj2);
        }
        return null;
    }

    public C11685r(Map<String, Object> map) {
        if (map != null) {
            this.f30300e = map;
            return;
        }
        throw new IllegalArgumentException("Map must not be null.");
    }

    /* renamed from: a */
    public Object put(String str, Object obj) {
        return this.f30300e.put(str, obj);
    }

    /* renamed from: a */
    public int mo34414a(String str, int i) {
        Object obj = get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((String) obj).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: a */
    public long mo34415a(String str, long j) {
        Object obj = get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf((String) obj).longValue();
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }

    /* renamed from: a */
    public double mo34413a(String str, double d) {
        Object obj = get(str);
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj).doubleValue();
            } catch (NumberFormatException unused) {
            }
        }
        return d;
    }

    /* renamed from: a */
    public String mo34419a(String str) {
        Object obj = get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo34421a(String str, boolean z) {
        Object obj = get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return obj instanceof String ? Boolean.valueOf((String) obj).booleanValue() : z;
    }

    /* renamed from: a */
    public <T extends Enum<T>> T mo34417a(Class<T> cls, String str) {
        if (cls != null) {
            T t = get(str);
            if (cls.isInstance(t)) {
                return (Enum) t;
            }
            if (t instanceof String) {
                return Enum.valueOf(cls, (String) t);
            }
            return null;
        }
        throw new IllegalArgumentException("enumType may not be null");
    }

    /* renamed from: a */
    public <T extends C11685r> T mo34416a(String str, Class<T> cls) {
        return m30657a(get(str), cls);
    }

    /* renamed from: a */
    private <T extends C11685r> T m30657a(Object obj, Class<T> cls) {
        if (obj == null) {
            return null;
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return (C11685r) obj;
        }
        if (obj instanceof Map) {
            return m30658a((Map) obj, cls);
        }
        return null;
    }

    /* renamed from: a */
    public JSONObject mo34420a() {
        return C11692b.m30720c(this.f30300e);
    }
}
