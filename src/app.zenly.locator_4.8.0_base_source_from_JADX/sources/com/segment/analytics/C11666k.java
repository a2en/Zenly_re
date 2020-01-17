package com.segment.analytics;

import android.content.Context;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.segment.analytics.k */
class C11666k extends C11685r {

    /* renamed from: com.segment.analytics.k$a */
    static class C11667a extends C11686a<C11666k> {
        C11667a(Context context, C11621c cVar, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("project-settings-plan-");
            sb.append(str);
            super(context, cVar, sb.toString(), str, C11666k.class);
        }

        /* renamed from: a */
        public C11666k m30598a(Map<String, Object> map) {
            return new C11666k(map);
        }
    }

    C11666k(Map<String, Object> map) {
        super(Collections.unmodifiableMap(map));
    }

    /* renamed from: a */
    static C11666k m30592a(Map<String, Object> map) {
        map.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        return new C11666k(map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11685r mo34369b() {
        return mo34422b("integrations");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C11685r mo34370c() {
        return mo34422b("plan");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public long mo34371d() {
        return mo34415a("timestamp", 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C11685r mo34372e() {
        C11685r c = mo34370c();
        if (c == null) {
            return null;
        }
        return c.mo34422b("track");
    }
}
