package com.segment.analytics.integrations;

import com.segment.analytics.C11668l;
import com.segment.analytics.integrations.C11650b.C11651a;
import com.segment.analytics.integrations.C11650b.C11653c;
import com.segment.analytics.p326t.C11692b;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.segment.analytics.integrations.f */
public class C11658f extends C11650b {

    /* renamed from: com.segment.analytics.integrations.f$a */
    public static class C11659a extends C11651a<C11658f, C11659a> {

        /* renamed from: g */
        private String f30239g;

        /* renamed from: h */
        private String f30240h;

        /* renamed from: i */
        private Map<String, Object> f30241i;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C11659a m30571b() {
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C11659a mo34355c(String str) {
            this.f30240h = str;
            return this;
        }

        /* renamed from: d */
        public C11659a mo34357d(String str) {
            this.f30239g = str;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11658f m30569a(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3) {
            if (!C11692b.m30721c((CharSequence) this.f30239g) || !C11692b.m30721c((CharSequence) this.f30240h)) {
                Map<String, Object> map3 = this.f30241i;
                if (C11692b.m30718b((Map) map3)) {
                    map3 = Collections.emptyMap();
                }
                String str4 = str;
                Date date2 = date;
                Map<String, Object> map4 = map;
                Map<String, Object> map5 = map2;
                String str5 = str2;
                String str6 = str3;
                C11658f fVar = new C11658f(str4, date2, map4, map5, str5, str6, this.f30239g, this.f30240h, map3);
                return fVar;
            }
            throw new NullPointerException("either name or category is required");
        }

        /* renamed from: c */
        public C11659a mo34356c(Map<String, ?> map) {
            C11692b.m30698a(map, "properties");
            this.f30241i = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }
    }

    C11658f(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, String str4, String str5, Map<String, Object> map3) {
        super(C11653c.screen, str, date, map, map2, str2, str3);
        if (!C11692b.m30721c((CharSequence) str4)) {
            put("name", (Object) str4);
        }
        if (!C11692b.m30721c((CharSequence) str5)) {
            put("category", (Object) str5);
        }
        put("properties", (Object) map3);
    }

    @Deprecated
    /* renamed from: e */
    public String mo34351e() {
        return mo34419a("category");
    }

    /* renamed from: f */
    public String mo34352f() {
        String g = mo34353g();
        if (!C11692b.m30721c((CharSequence) g)) {
            return g;
        }
        return mo34351e();
    }

    /* renamed from: g */
    public String mo34353g() {
        return mo34419a("name");
    }

    /* renamed from: h */
    public C11668l mo34354h() {
        return (C11668l) mo34416a("properties", C11668l.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScreenPayload{name=\"");
        sb.append(mo34353g());
        sb.append(",category=\"");
        sb.append(mo34351e());
        sb.append("\"}");
        return sb.toString();
    }
}
