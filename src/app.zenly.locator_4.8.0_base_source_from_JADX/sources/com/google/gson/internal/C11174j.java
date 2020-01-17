package com.google.gson.internal;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.gson.internal.j */
public final class C11174j {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f28909a;

    static {
        HashMap hashMap = new HashMap(16);
        HashMap hashMap2 = new HashMap(16);
        m28741a(hashMap, hashMap2, Boolean.TYPE, Boolean.class);
        m28741a(hashMap, hashMap2, Byte.TYPE, Byte.class);
        m28741a(hashMap, hashMap2, Character.TYPE, Character.class);
        m28741a(hashMap, hashMap2, Double.TYPE, Double.class);
        m28741a(hashMap, hashMap2, Float.TYPE, Float.class);
        m28741a(hashMap, hashMap2, Integer.TYPE, Integer.class);
        m28741a(hashMap, hashMap2, Long.TYPE, Long.class);
        m28741a(hashMap, hashMap2, Short.TYPE, Short.class);
        m28741a(hashMap, hashMap2, Void.TYPE, Void.class);
        f28909a = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m28741a(Map<Class<?>, Class<?>> map, Map<Class<?>, Class<?>> map2, Class<?> cls, Class<?> cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }

    /* renamed from: a */
    public static boolean m28742a(Type type) {
        return f28909a.containsKey(type);
    }

    /* renamed from: a */
    public static <T> Class<T> m28740a(Class<T> cls) {
        Map<Class<?>, Class<?>> map = f28909a;
        C11140a.m28677a(cls);
        Class cls2 = (Class) map.get(cls);
        return cls2 == null ? cls : cls2;
    }
}
