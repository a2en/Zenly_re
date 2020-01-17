package com.facebook.common.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.common.internal.g */
public class C9530g<K, V> extends HashMap<K, V> {
    private C9530g(Map<? extends K, ? extends V> map) {
        super(map);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m23258a(K k, V v) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m23259a(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public static <K, V> C9530g<K, V> m23257a(Map<? extends K, ? extends V> map) {
        return new C9530g<>(map);
    }
}
