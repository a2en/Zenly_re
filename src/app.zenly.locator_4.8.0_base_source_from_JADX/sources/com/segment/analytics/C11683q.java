package com.segment.analytics;

import android.content.Context;
import com.segment.analytics.p326t.C11692b;
import com.segment.analytics.p326t.C11692b.C11696d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.segment.analytics.q */
public class C11683q extends C11685r {

    /* renamed from: com.segment.analytics.q$a */
    static class C11684a extends C11686a<C11683q> {
        C11684a(Context context, C11621c cVar, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("traits-");
            sb.append(str);
            super(context, cVar, sb.toString(), str, C11683q.class);
        }

        /* renamed from: a */
        public C11683q m30656a(Map<String, Object> map) {
            return new C11683q(new C11696d(map));
        }
    }

    C11683q(Map<String, Object> map) {
        super(map);
    }

    /* renamed from: h */
    static C11683q m30644h() {
        C11683q qVar = new C11683q(new C11696d());
        qVar.mo34405b(UUID.randomUUID().toString());
        return qVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C11683q mo34407c(String str) {
        mo34265b("userId", (Object) str);
        return this;
    }

    /* renamed from: d */
    public String mo34409d() {
        return mo34419a("lastName");
    }

    /* renamed from: e */
    public String mo34410e() {
        String a = mo34419a("name");
        if (C11692b.m30721c((CharSequence) a) && C11692b.m30721c((CharSequence) mo34408c()) && C11692b.m30721c((CharSequence) mo34409d())) {
            return null;
        }
        if (C11692b.m30721c((CharSequence) a)) {
            StringBuilder sb = new StringBuilder();
            String c = mo34408c();
            boolean z = false;
            if (!C11692b.m30721c((CharSequence) c)) {
                z = true;
                sb.append(c);
            }
            String d = mo34409d();
            if (!C11692b.m30721c((CharSequence) d)) {
                if (z) {
                    sb.append(' ');
                }
                sb.append(d);
            }
            a = sb.toString();
        }
        return a;
    }

    /* renamed from: f */
    public C11683q mo34411f() {
        return new C11683q(Collections.unmodifiableMap(new LinkedHashMap(this)));
    }

    /* renamed from: g */
    public String mo34412g() {
        return mo34419a("userId");
    }

    public C11683q() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C11683q mo34405b(String str) {
        mo34265b("anonymousId", (Object) str);
        return this;
    }

    /* renamed from: c */
    public String mo34408c() {
        return mo34419a("firstName");
    }

    /* renamed from: b */
    public String mo34406b() {
        return mo34419a("anonymousId");
    }

    /* renamed from: b */
    public C11683q mo34265b(String str, Object obj) {
        super.mo34265b(str, obj);
        return this;
    }
}
