package com.crashlytics.android.answers.shim;

import com.crashlytics.android.answers.C9279l;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.crashlytics.android.answers.shim.c */
public class C9289c {

    /* renamed from: a */
    private final String f24134a;

    /* renamed from: b */
    private final Map<String, Object> f24135b = new HashMap();

    public C9289c(String str) {
        this.f24134a = str;
    }

    /* renamed from: a */
    public C9289c mo25023a(String str, String str2) {
        this.f24135b.put(str, str2);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9279l mo25022a() {
        C9279l lVar = new C9279l(this.f24134a);
        for (String str : this.f24135b.keySet()) {
            Object obj = this.f24135b.get(str);
            if (obj instanceof String) {
                lVar.mo24974a(str, (String) obj);
            } else if (obj instanceof Number) {
                lVar.mo24973a(str, (Number) obj);
            }
        }
        return lVar;
    }
}
