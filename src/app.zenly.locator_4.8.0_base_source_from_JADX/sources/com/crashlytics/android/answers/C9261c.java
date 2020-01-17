package com.crashlytics.android.answers;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.crashlytics.android.answers.c */
class C9261c {

    /* renamed from: a */
    final C9265e f24060a;

    /* renamed from: b */
    final Map<String, Object> f24061b = new ConcurrentHashMap();

    public C9261c(C9265e eVar) {
        this.f24060a = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24970a(String str, String str2) {
        if (!this.f24060a.mo24980a((Object) str, "key") && !this.f24060a.mo24980a((Object) str2, "value")) {
            mo24969a(this.f24060a.mo24979a(str), (Object) this.f24060a.mo24979a(str2));
        }
    }

    public String toString() {
        return new JSONObject(this.f24061b).toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24968a(String str, Number number) {
        if (!this.f24060a.mo24980a((Object) str, "key") && !this.f24060a.mo24980a((Object) number, "value")) {
            mo24969a(this.f24060a.mo24979a(str), (Object) number);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24969a(String str, Object obj) {
        if (!this.f24060a.mo24981a(this.f24061b, str)) {
            this.f24061b.put(str, obj);
        }
    }
}
