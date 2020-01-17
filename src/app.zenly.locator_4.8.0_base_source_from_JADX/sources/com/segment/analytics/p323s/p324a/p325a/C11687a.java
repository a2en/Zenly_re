package com.segment.analytics.p323s.p324a.p325a;

import android.content.Context;
import com.amplitude.api.C8663a;
import com.amplitude.api.C8665c;
import com.amplitude.api.C8690i;
import com.amplitude.api.C8691j;
import com.segment.analytics.Analytics;
import com.segment.analytics.C11668l;
import com.segment.analytics.C11683q;
import com.segment.analytics.C11685r;
import com.segment.analytics.integrations.C11650b;
import com.segment.analytics.integrations.C11654c;
import com.segment.analytics.integrations.C11655d;
import com.segment.analytics.integrations.C11657e;
import com.segment.analytics.integrations.C11658f;
import com.segment.analytics.integrations.C11660g;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Integration.Factory;
import com.segment.analytics.p326t.C11692b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.segment.analytics.s.a.a.a */
public class C11687a extends Integration<C8665c> {

    /* renamed from: l */
    public static final Factory f30305l = new C11688a();

    /* renamed from: a */
    private final C8665c f30306a;

    /* renamed from: b */
    private final C11657e f30307b;

    /* renamed from: c */
    boolean f30308c;

    /* renamed from: d */
    boolean f30309d;

    /* renamed from: e */
    boolean f30310e;

    /* renamed from: f */
    boolean f30311f;

    /* renamed from: g */
    boolean f30312g;

    /* renamed from: h */
    String f30313h;

    /* renamed from: i */
    String f30314i;

    /* renamed from: j */
    Set<String> f30315j;

    /* renamed from: k */
    Set<String> f30316k;

    /* renamed from: com.segment.analytics.s.a.a.a$a */
    static class C11688a implements Factory {
        C11688a() {
        }

        public Integration<?> create(C11685r rVar, Analytics analytics) {
            return new C11687a(C11689b.f30317a, analytics, rVar);
        }

        public String key() {
            return "Amplitude";
        }
    }

    /* renamed from: com.segment.analytics.s.a.a.a$b */
    interface C11689b {

        /* renamed from: a */
        public static final C11689b f30317a = new C11690a();

        /* renamed from: com.segment.analytics.s.a.a.a$b$a */
        static class C11690a implements C11689b {
            C11690a() {
            }

            public C8665c get() {
                return C8663a.m20222a();
            }
        }

        C8665c get();
    }

    C11687a(C11689b bVar, Analytics analytics, C11685r rVar) {
        this.f30306a = bVar.get();
        this.f30308c = rVar.mo34421a("trackAllPages", false);
        this.f30309d = rVar.mo34421a("trackAllPagesV2", true);
        this.f30310e = rVar.mo34421a("trackCategorizedPages", false);
        this.f30311f = rVar.mo34421a("trackNamedPages", false);
        this.f30312g = rVar.mo34421a("useLogRevenueV2", false);
        this.f30313h = rVar.mo34419a("groupTypeTrait");
        this.f30314i = rVar.mo34419a("groupTypeValue");
        this.f30315j = m30675a(rVar, "traitsToIncrement");
        this.f30316k = m30675a(rVar, "traitsToSetOnce");
        this.f30307b = analytics.mo34215a("Amplitude");
        String a = rVar.mo34419a("apiKey");
        this.f30306a.mo23319a((Context) analytics.mo34214a(), a);
        this.f30307b.mo34350c("AmplitudeClient.getInstance().initialize(context, %s);", a);
        this.f30306a.mo23318a(analytics.mo34214a());
        this.f30307b.mo34350c("AmplitudeClient.getInstance().enableForegroundTracking(context);", new Object[0]);
        boolean a2 = rVar.mo34421a("trackSessionEvents", false);
        this.f30306a.mo23323a(a2);
        this.f30307b.mo34350c("AmplitudeClient.getInstance().trackSessionEvents(%s);", Boolean.valueOf(a2));
        if (!rVar.mo34421a("enableLocationListening", true)) {
            this.f30306a.mo23317a();
        }
        if (rVar.mo34421a("useAdvertisingIdForDeviceId", false)) {
            this.f30306a.mo23360g();
        }
    }

    /* renamed from: a */
    static Set<String> m30675a(C11685r rVar, String str) {
        try {
            List list = (List) rVar.get(str);
            if (list != null) {
                if (list.size() != 0) {
                    HashSet hashSet = new HashSet(list.size());
                    for (int i = 0; i < list.size(); i++) {
                        hashSet.add((String) list.get(i));
                    }
                    return hashSet;
                }
            }
            return Collections.emptySet();
        } catch (ClassCastException unused) {
            return Collections.emptySet();
        }
    }

    /* renamed from: b */
    private void m30683b(String str, Object obj, C8690i iVar) {
        if (obj instanceof Double) {
            iVar.mo23450c(str, ((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            iVar.mo23451c(str, ((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            iVar.mo23452c(str, ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            iVar.mo23453c(str, ((Long) obj).longValue());
        }
        if (obj instanceof String) {
            iVar.mo23454c(str, String.valueOf(obj));
        }
    }

    /* renamed from: c */
    private void m30684c(String str, Object obj, C8690i iVar) {
        if (obj instanceof Double) {
            iVar.mo23445b(str, ((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            iVar.mo23446b(str, ((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            iVar.mo23447b(str, ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            iVar.mo23448b(str, ((Long) obj).longValue());
        }
        if (obj instanceof String) {
            iVar.mo23449b(str, String.valueOf(obj));
        }
        if (obj instanceof String[]) {
            iVar.mo23444a(str, (String[]) obj);
        }
    }

    /* renamed from: a */
    public void mo34274a(C11655d dVar) {
        super.mo34274a(dVar);
        String d = dVar.mo34334d();
        this.f30306a.mo23351c(d);
        this.f30307b.mo34350c("AmplitudeClient.getInstance().setUserId(%s);", d);
        C11683q e = dVar.mo34344e();
        if (!C11692b.m30712a((Collection) this.f30315j) || !C11692b.m30712a((Collection) this.f30316k)) {
            m30679a(e);
        } else {
            JSONObject a = e.mo34420a();
            this.f30306a.mo23341a(a);
            this.f30307b.mo34350c("AmplitudeClient.getInstance().setUserProperties(%s);", a);
        }
        JSONObject a2 = m30676a((C11650b) dVar);
        if (a2 != null) {
            Iterator keys = a2.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                try {
                    this.f30306a.mo23333a(str, a2.get(str));
                } catch (JSONException e2) {
                    this.f30307b.mo34348a(e2, "error reading %s from %s", str, a2);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo34324b() {
        super.mo34324b();
        this.f30306a.mo23351c((String) null);
        this.f30306a.mo23353d();
        this.f30307b.mo34350c("AmplitudeClient.getInstance().setUserId(null)", new Object[0]);
        this.f30307b.mo34350c("AmplitudeClient.getInstance().regenerateDeviceId();", new Object[0]);
    }

    /* renamed from: a */
    private void m30679a(C11683q qVar) {
        C8690i iVar = new C8690i();
        for (Entry entry : qVar.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (this.f30315j.contains(str)) {
                m30681a(str, value, iVar);
            } else if (this.f30316k.contains(str)) {
                m30683b(str, value, iVar);
            } else {
                m30684c(str, value, iVar);
            }
        }
        this.f30306a.mo23328a(iVar);
        this.f30307b.mo34350c("Amplitude.getInstance().identify(identify)", new Object[0]);
    }

    /* renamed from: a */
    private void m30681a(String str, Object obj, C8690i iVar) {
        if (obj instanceof Double) {
            iVar.mo23437a(str, ((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            iVar.mo23438a(str, ((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            iVar.mo23439a(str, ((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            iVar.mo23440a(str, ((Long) obj).longValue());
        }
        if (obj instanceof String) {
            iVar.mo23442a(str, String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public void mo34323a(C11658f fVar) {
        super.mo34323a(fVar);
        if (this.f30309d) {
            C11668l lVar = new C11668l();
            lVar.putAll(fVar.mo34354h());
            lVar.put("name", (Object) fVar.mo34353g());
            m30680a("Loaded a Screen", lVar, null, null);
            return;
        }
        String str = "Viewed %s Screen";
        if (this.f30308c) {
            m30680a(String.format(str, new Object[]{fVar.mo34352f()}), fVar.mo34354h(), null, null);
        } else if (this.f30310e && !C11692b.m30721c((CharSequence) fVar.mo34351e())) {
            m30680a(String.format(str, new Object[]{fVar.mo34351e()}), fVar.mo34354h(), null, null);
        } else if (this.f30311f && !C11692b.m30721c((CharSequence) fVar.mo34353g())) {
            m30680a(String.format(str, new Object[]{fVar.mo34353g()}), fVar.mo34354h(), null, null);
        }
    }

    /* renamed from: a */
    public void mo34275a(C11660g gVar) {
        super.mo34275a(gVar);
        JSONObject a = m30676a((C11650b) gVar);
        m30680a(gVar.mo34358e(), gVar.mo34359f(), gVar.mo34332b().mo34422b("Amplitude"), a);
    }

    /* renamed from: a */
    static JSONObject m30676a(C11650b bVar) {
        C11685r b = bVar.mo34332b();
        if (C11692b.m30718b((Map) b)) {
            return null;
        }
        C11685r b2 = b.mo34422b("Amplitude");
        if (C11692b.m30718b((Map) b2)) {
            return null;
        }
        C11685r b3 = b2.mo34422b("groups");
        if (C11692b.m30718b((Map) b3)) {
            return null;
        }
        return b3.mo34420a();
    }

    /* renamed from: a */
    private void m30680a(String str, C11668l lVar, Map map, JSONObject jSONObject) {
        JSONObject a = lVar.mo34420a();
        this.f30306a.mo23338a(str, a, jSONObject, m30682a(map));
        this.f30307b.mo34350c("AmplitudeClient.getInstance().logEvent(%s, %s, %s, %s);", str, a, jSONObject, Boolean.valueOf(m30682a(map)));
        if (!lVar.containsKey("revenue") && !lVar.containsKey("total")) {
            return;
        }
        if (this.f30312g) {
            m30678a(lVar, a);
        } else {
            m30677a(lVar);
        }
    }

    /* renamed from: a */
    private boolean m30682a(Map map) {
        if (C11692b.m30718b(map)) {
            return false;
        }
        String str = "outOfSession";
        Object obj = map.get(str);
        if (obj != null && (obj instanceof Boolean)) {
            return ((Boolean) map.get(str)).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    private void m30677a(C11668l lVar) {
        double a = lVar.mo34413a("revenue", 0.0d);
        if (a == 0.0d) {
            a = lVar.mo34413a("total", 0.0d);
        }
        String a2 = lVar.mo34419a("productId");
        int a3 = lVar.mo34414a("quantity", 0);
        String a4 = lVar.mo34419a("receipt");
        String a5 = lVar.mo34419a("receiptSignature");
        this.f30306a.mo23332a(a2, a3, a, a4, a5);
        this.f30307b.mo34350c("AmplitudeClient.getInstance().logRevenue(%s, %s, %s, %s, %s);", a2, Integer.valueOf(a3), Double.valueOf(a), a4, a5);
    }

    /* renamed from: a */
    private void m30678a(C11668l lVar, JSONObject jSONObject) {
        String str = "price";
        double a = lVar.mo34413a(str, 0.0d);
        int a2 = lVar.mo34414a("quantity", 1);
        if (!lVar.containsKey(str)) {
            a = lVar.mo34413a("revenue", 0.0d);
            if (a == 0.0d) {
                a = lVar.mo34413a("total", 0.0d);
            }
            a2 = 1;
        }
        C8691j jVar = new C8691j();
        jVar.mo23455a(a);
        jVar.mo23456a(a2);
        String str2 = "productId";
        if (lVar.containsKey(str2)) {
            jVar.mo23457a(lVar.mo34419a(str2));
        }
        String str3 = "revenueType";
        if (lVar.containsKey(str3)) {
            jVar.mo23461b(lVar.mo34419a(str3));
        }
        String str4 = "receipt";
        if (lVar.containsKey(str4)) {
            String str5 = "receiptSignature";
            if (lVar.containsKey(str5)) {
                jVar.mo23458a(lVar.mo34419a(str4), lVar.mo34419a(str5));
            }
        }
        jVar.mo23459a(jSONObject);
        this.f30306a.mo23330a(jVar);
        this.f30307b.mo34350c("AmplitudeClient.getInstance().logRevenueV2(%s, %s);", Double.valueOf(a), Integer.valueOf(a2));
    }

    /* renamed from: a */
    public void mo34322a(C11654c cVar) {
        String str;
        String e = cVar.mo34342e();
        C11683q f = cVar.mo34343f();
        if (C11692b.m30718b((Map) f)) {
            str = null;
        } else if (!f.containsKey(this.f30313h) || !f.containsKey(this.f30314i)) {
            str = f.mo34410e();
        } else {
            String a = f.mo34419a(this.f30313h);
            str = a;
            e = f.mo34419a(this.f30314i);
        }
        if (C11692b.m30721c((CharSequence) str)) {
            str = "[Segment] Group";
        }
        this.f30306a.mo23333a(str, (Object) e);
        C8690i iVar = new C8690i();
        iVar.mo23449b("library", "segment");
        if (!C11692b.m30718b((Map) f)) {
            iVar.mo23443a("group_properties", f.mo34420a());
        }
        this.f30306a.mo23334a(str, (Object) e, iVar);
    }

    /* renamed from: a */
    public void mo34319a() {
        super.mo34319a();
        this.f30306a.mo23358f();
        this.f30307b.mo34350c("AmplitudeClient.getInstance().uploadEvents();", new Object[0]);
    }
}
