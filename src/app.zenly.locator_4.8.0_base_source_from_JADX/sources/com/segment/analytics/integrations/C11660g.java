package com.segment.analytics.integrations;

import com.segment.analytics.C11668l;
import com.segment.analytics.integrations.C11650b.C11651a;
import com.segment.analytics.integrations.C11650b.C11653c;
import com.segment.analytics.p326t.C11692b;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.segment.analytics.integrations.g */
public class C11660g extends C11650b {

    /* renamed from: com.segment.analytics.integrations.g$a */
    public static class C11661a extends C11651a<C11660g, C11661a> {

        /* renamed from: g */
        private String f30242g;

        /* renamed from: h */
        private Map<String, Object> f30243h;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C11661a m30580b() {
            return this;
        }

        /* renamed from: c */
        public C11661a mo34360c(String str) {
            C11692b.m30702a(str, "event");
            this.f30242g = str;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11660g m30578a(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3) {
            C11692b.m30702a(this.f30242g, "event");
            Map<String, Object> map3 = this.f30243h;
            if (C11692b.m30718b((Map) map3)) {
                map3 = Collections.emptyMap();
            }
            String str4 = str;
            Date date2 = date;
            Map<String, Object> map4 = map;
            Map<String, Object> map5 = map2;
            String str5 = str2;
            String str6 = str3;
            C11660g gVar = new C11660g(str4, date2, map4, map5, str5, str6, this.f30242g, map3);
            return gVar;
        }

        /* renamed from: c */
        public C11661a mo34361c(Map<String, ?> map) {
            C11692b.m30698a(map, "properties");
            this.f30243h = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }
    }

    C11660g(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, String str4, Map<String, Object> map3) {
        super(C11653c.track, str, date, map, map2, str2, str3);
        put("event", (Object) str4);
        put("properties", (Object) map3);
    }

    /* renamed from: e */
    public String mo34358e() {
        return mo34419a("event");
    }

    /* renamed from: f */
    public C11668l mo34359f() {
        return (C11668l) mo34416a("properties", C11668l.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackPayload{event=\"");
        sb.append(mo34358e());
        sb.append("\"}");
        return sb.toString();
    }
}
