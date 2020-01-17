package com.amplitude.api;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amplitude.api.a */
public class C8663a {

    /* renamed from: a */
    static final Map<String, C8665c> f22253a = new HashMap();

    /* renamed from: a */
    public static C8665c m20222a() {
        return m20223a(null);
    }

    /* renamed from: a */
    public static synchronized C8665c m20223a(String str) {
        C8665c cVar;
        synchronized (C8663a.class) {
            String b = C8693l.m20453b(str);
            cVar = (C8665c) f22253a.get(b);
            if (cVar == null) {
                cVar = new C8665c(b);
                f22253a.put(b, cVar);
            }
        }
        return cVar;
    }
}
