package com.segment.analytics.integrations;

import com.segment.analytics.C11683q;
import com.segment.analytics.integrations.C11650b.C11651a;
import com.segment.analytics.integrations.C11650b.C11653c;
import com.segment.analytics.p326t.C11692b;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.segment.analytics.integrations.d */
public class C11655d extends C11650b {

    /* renamed from: com.segment.analytics.integrations.d$a */
    public static class C11656a extends C11651a<C11655d, C11656a> {

        /* renamed from: g */
        private Map<String, Object> f30236g;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C11656a m30555b() {
            return this;
        }

        /* renamed from: c */
        public C11656a mo34345c(Map<String, ?> map) {
            C11692b.m30698a(map, "traits");
            this.f30236g = Collections.unmodifiableMap(new LinkedHashMap(map));
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11655d m30553a(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3) {
            if (!C11692b.m30721c((CharSequence) str2) || !C11692b.m30718b((Map) this.f30236g)) {
                C11655d dVar = new C11655d(str, date, map, map2, str2, str3, this.f30236g);
                return dVar;
            }
            throw new NullPointerException("either userId or traits are required");
        }
    }

    C11655d(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3, Map<String, Object> map3) {
        super(C11653c.identify, str, date, map, map2, str2, str3);
        put("traits", (Object) map3);
    }

    /* renamed from: e */
    public C11683q mo34344e() {
        return (C11683q) mo34416a("traits", C11683q.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IdentifyPayload{\"userId=\"");
        sb.append(mo34334d());
        sb.append("\"}");
        return sb.toString();
    }
}
