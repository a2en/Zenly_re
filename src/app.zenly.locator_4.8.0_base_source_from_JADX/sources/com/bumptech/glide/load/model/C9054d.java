package com.bumptech.glide.load.model;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.model.d */
public final class C9054d implements Headers {

    /* renamed from: b */
    private final Map<String, List<LazyHeaderFactory>> f23594b;

    /* renamed from: c */
    private volatile Map<String, String> f23595c;

    /* renamed from: com.bumptech.glide.load.model.d$a */
    public static final class C9055a {

        /* renamed from: b */
        private static final String f23596b = m21719b();

        /* renamed from: c */
        private static final Map<String, List<LazyHeaderFactory>> f23597c;

        /* renamed from: a */
        private Map<String, List<LazyHeaderFactory>> f23598a = f23597c;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f23596b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C9056b(f23596b)));
            }
            f23597c = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m21719b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C9054d mo24566a() {
            return new C9054d(this.f23598a);
        }
    }

    /* renamed from: com.bumptech.glide.load.model.d$b */
    static final class C9056b implements LazyHeaderFactory {

        /* renamed from: a */
        private final String f23599a;

        C9056b(String str) {
            this.f23599a = str;
        }

        public String buildHeader() {
            return this.f23599a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9056b)) {
                return false;
            }
            return this.f23599a.equals(((C9056b) obj).f23599a);
        }

        public int hashCode() {
            return this.f23599a.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("StringHeaderFactory{value='");
            sb.append(this.f23599a);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    C9054d(Map<String, List<LazyHeaderFactory>> map) {
        this.f23594b = Collections.unmodifiableMap(map);
    }

    /* renamed from: a */
    private Map<String, String> m21718a() {
        HashMap hashMap = new HashMap();
        for (Entry entry : this.f23594b.entrySet()) {
            String a = m21717a((List) entry.getValue());
            if (!TextUtils.isEmpty(a)) {
                hashMap.put(entry.getKey(), a);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9054d)) {
            return false;
        }
        return this.f23594b.equals(((C9054d) obj).f23594b);
    }

    public Map<String, String> getHeaders() {
        if (this.f23595c == null) {
            synchronized (this) {
                if (this.f23595c == null) {
                    this.f23595c = Collections.unmodifiableMap(m21718a());
                }
            }
        }
        return this.f23595c;
    }

    public int hashCode() {
        return this.f23594b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LazyHeaders{headers=");
        sb.append(this.f23594b);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private String m21717a(List<LazyHeaderFactory> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String buildHeader = ((LazyHeaderFactory) list.get(i)).buildHeader();
            if (!TextUtils.isEmpty(buildHeader)) {
                sb.append(buildHeader);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }
}
