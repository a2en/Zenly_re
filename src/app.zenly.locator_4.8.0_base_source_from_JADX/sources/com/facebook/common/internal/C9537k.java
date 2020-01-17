package com.facebook.common.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.common.internal.k */
public final class C9537k {
    /* renamed from: a */
    public static <E> Set<E> m23281a(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    /* renamed from: b */
    public static <E> Set<E> m23283b() {
        return m23281a(new IdentityHashMap());
    }

    /* renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m23282a() {
        return new CopyOnWriteArraySet<>();
    }
}
