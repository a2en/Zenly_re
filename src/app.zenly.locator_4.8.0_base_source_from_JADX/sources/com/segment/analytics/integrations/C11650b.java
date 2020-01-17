package com.segment.analytics.integrations;

import com.appsflyer.AppsFlyerProperties;
import com.segment.analytics.C11685r;
import com.segment.analytics.p326t.C11692b;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.segment.analytics.integrations.b */
public abstract class C11650b extends C11685r {

    /* renamed from: com.segment.analytics.integrations.b$a */
    public static abstract class C11651a<P extends C11650b, B extends C11651a> {

        /* renamed from: a */
        private String f30220a;

        /* renamed from: b */
        private Date f30221b;

        /* renamed from: c */
        private Map<String, Object> f30222c;

        /* renamed from: d */
        private Map<String, Object> f30223d;

        /* renamed from: e */
        private String f30224e;

        /* renamed from: f */
        private String f30225f;

        C11651a() {
        }

        /* renamed from: a */
        public B mo34336a(Map<String, ?> map) {
            C11692b.m30698a(map, "context");
            this.f30222c = Collections.unmodifiableMap(new LinkedHashMap(map));
            return mo34339b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract P mo34338a(String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract B mo34339b();

        /* renamed from: b */
        public B mo34341b(Map<String, ?> map) {
            if (C11692b.m30718b((Map) map)) {
                return mo34339b();
            }
            if (this.f30223d == null) {
                this.f30223d = new LinkedHashMap();
            }
            this.f30223d.putAll(map);
            return mo34339b();
        }

        /* renamed from: a */
        public B mo34335a(String str) {
            C11692b.m30702a(str, "anonymousId");
            this.f30225f = str;
            return mo34339b();
        }

        /* renamed from: a */
        public P mo34337a() {
            Map map;
            if (!C11692b.m30721c((CharSequence) this.f30224e) || !C11692b.m30721c((CharSequence) this.f30225f)) {
                if (C11692b.m30718b((Map) this.f30223d)) {
                    map = Collections.emptyMap();
                } else {
                    map = C11692b.m30706a(this.f30223d);
                }
                Map map2 = map;
                if (C11692b.m30721c((CharSequence) this.f30220a)) {
                    this.f30220a = UUID.randomUUID().toString();
                }
                if (this.f30221b == null) {
                    this.f30221b = new Date();
                }
                if (C11692b.m30718b((Map) this.f30222c)) {
                    this.f30222c = Collections.emptyMap();
                }
                return mo34338a(this.f30220a, this.f30221b, this.f30222c, map2, this.f30224e, this.f30225f);
            }
            throw new NullPointerException("either userId or anonymousId is required");
        }

        /* renamed from: b */
        public B mo34340b(String str) {
            C11692b.m30702a(str, "userId");
            this.f30224e = str;
            return mo34339b();
        }
    }

    /* renamed from: com.segment.analytics.integrations.b$b */
    public enum C11652b {
        browser,
        mobile,
        server
    }

    /* renamed from: com.segment.analytics.integrations.b$c */
    public enum C11653c {
        alias,
        group,
        identify,
        screen,
        track
    }

    C11650b(C11653c cVar, String str, Date date, Map<String, Object> map, Map<String, Object> map2, String str2, String str3) {
        put(AppsFlyerProperties.CHANNEL, (Object) C11652b.mobile);
        put("type", (Object) cVar);
        put("messageId", (Object) str);
        put("timestamp", (Object) C11692b.m30715b(date));
        put("context", (Object) map);
        put("integrations", (Object) map2);
        if (!C11692b.m30721c((CharSequence) str2)) {
            put("userId", (Object) str2);
        }
        put("anonymousId", (Object) str3);
    }

    /* renamed from: c */
    public C11653c mo34333c() {
        return (C11653c) mo34417a(C11653c.class, "type");
    }

    /* renamed from: d */
    public String mo34334d() {
        return mo34419a("userId");
    }

    /* renamed from: b */
    public C11685r mo34332b() {
        return mo34422b("integrations");
    }

    /* renamed from: b */
    public C11650b mo34265b(String str, Object obj) {
        super.mo34265b(str, obj);
        return this;
    }
}
