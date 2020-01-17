package com.mapbox.android.telemetry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.C13213i;
import okhttp3.C13213i.C13214a;

/* renamed from: com.mapbox.android.telemetry.h */
class C11348h {

    /* renamed from: a */
    private static final Map<C11388r, Map<String, List<String>>> f29427a = new C11349a();

    /* renamed from: com.mapbox.android.telemetry.h$a */
    static class C11349a extends HashMap<C11388r, Map<String, List<String>>> {
        C11349a() {
            put(C11388r.STAGING, C11396u0.f29496a);
            put(C11388r.COM, C11367l.f29457a);
            put(C11388r.CHINA, C11351i.f29432a);
        }
    }

    C11348h() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13213i mo32990a(C11388r rVar, C11341g gVar) {
        C13214a aVar = new C13214a();
        Map a = mo32989a(rVar);
        m29224a(a, gVar);
        m29225a(a, aVar);
        return aVar.mo37963a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, List<String>> mo32989a(C11388r rVar) {
        return (Map) f29427a.get(rVar);
    }

    /* renamed from: a */
    private void m29225a(Map<String, List<String>> map, C13214a aVar) {
        for (Entry entry : map.entrySet()) {
            for (String str : (List) entry.getValue()) {
                aVar.mo37962a((String) entry.getKey(), String.format("sha256/%s", new Object[]{str}));
            }
        }
    }

    /* renamed from: a */
    private Map<String, List<String>> m29224a(Map<String, List<String>> map, C11341g gVar) {
        String a = m29222a(map);
        List list = (List) map.get(a);
        if (list != null) {
            m29223a(gVar, list);
            map.put(a, list);
        }
        return map;
    }

    /* renamed from: a */
    private String m29222a(Map<String, List<String>> map) {
        return (String) map.keySet().iterator().next();
    }

    /* renamed from: a */
    private List<String> m29223a(C11341g gVar, List<String> list) {
        for (String str : list) {
            if (gVar.mo32985b(str)) {
                list.remove(str);
            }
        }
        return list;
    }
}
