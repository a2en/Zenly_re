package com.android.volley;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public interface Cache {

    /* renamed from: com.android.volley.Cache$a */
    public static class C8702a {

        /* renamed from: a */
        public byte[] f22397a;

        /* renamed from: b */
        public String f22398b;

        /* renamed from: c */
        public long f22399c;

        /* renamed from: d */
        public long f22400d;

        /* renamed from: e */
        public long f22401e;

        /* renamed from: f */
        public long f22402f;

        /* renamed from: g */
        public Map<String, String> f22403g = Collections.emptyMap();

        /* renamed from: h */
        public List<C8713d> f22404h;

        /* renamed from: a */
        public boolean mo23496a() {
            return this.f22401e < System.currentTimeMillis();
        }

        /* renamed from: b */
        public boolean mo23497b() {
            return this.f22402f < System.currentTimeMillis();
        }
    }

    void clear();

    C8702a get(String str);

    void initialize();

    void invalidate(String str, boolean z);

    void put(String str, C8702a aVar);

    void remove(String str);
}
