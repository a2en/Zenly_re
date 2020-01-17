package p389io.fabric.sdk.android.services.settings;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12169a;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.network.C12241c;
import p389io.fabric.sdk.android.services.network.HttpRequest;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;

/* renamed from: io.fabric.sdk.android.services.settings.l */
class C12260l extends C12169a implements SettingsSpiCall {
    public C12260l(C12161g gVar, String str, String str2, HttpRequestFactory httpRequestFactory) {
        this(gVar, str, str2, httpRequestFactory, C12241c.GET);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public JSONObject mo36272a(HttpRequest httpRequest) {
        int g = httpRequest.mo36213g();
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Settings result was: ");
        sb.append(g);
        String str = "Fabric";
        f.mo35954d(str, sb.toString());
        if (mo36273a(g)) {
            return m32497a(httpRequest.mo36197a());
        }
        Logger f2 = C12154c.m32113f();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to retrieve settings from ");
        sb2.append(mo36046b());
        f2.mo35956e(str, sb2.toString());
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36273a(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject invoke(p389io.fabric.sdk.android.services.settings.C12268t r9) {
        /*
            r8 = this;
            java.lang.String r0 = "X-REQUEST-ID"
            java.lang.String r1 = "Settings request ID: "
            java.lang.String r2 = "Fabric"
            r3 = 0
            java.util.Map r4 = r8.m32496a(r9)     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0069 }
            io.fabric.sdk.android.services.network.HttpRequest r5 = r8.mo36045a(r4)     // Catch:{ HttpRequestException -> 0x006c, all -> 0x0069 }
            r8.m32495a(r5, r9)     // Catch:{ HttpRequestException -> 0x0067 }
            io.fabric.sdk.android.Logger r9 = p389io.fabric.sdk.android.C12154c.m32113f()     // Catch:{ HttpRequestException -> 0x0067 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0067 }
            r6.<init>()     // Catch:{ HttpRequestException -> 0x0067 }
            java.lang.String r7 = "Requesting settings from "
            r6.append(r7)     // Catch:{ HttpRequestException -> 0x0067 }
            java.lang.String r7 = r8.mo36046b()     // Catch:{ HttpRequestException -> 0x0067 }
            r6.append(r7)     // Catch:{ HttpRequestException -> 0x0067 }
            java.lang.String r6 = r6.toString()     // Catch:{ HttpRequestException -> 0x0067 }
            r9.mo35954d(r2, r6)     // Catch:{ HttpRequestException -> 0x0067 }
            io.fabric.sdk.android.Logger r9 = p389io.fabric.sdk.android.C12154c.m32113f()     // Catch:{ HttpRequestException -> 0x0067 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0067 }
            r6.<init>()     // Catch:{ HttpRequestException -> 0x0067 }
            java.lang.String r7 = "Settings query params were: "
            r6.append(r7)     // Catch:{ HttpRequestException -> 0x0067 }
            r6.append(r4)     // Catch:{ HttpRequestException -> 0x0067 }
            java.lang.String r4 = r6.toString()     // Catch:{ HttpRequestException -> 0x0067 }
            r9.mo35954d(r2, r4)     // Catch:{ HttpRequestException -> 0x0067 }
            org.json.JSONObject r3 = r8.mo36272a(r5)     // Catch:{ HttpRequestException -> 0x0067 }
            if (r5 == 0) goto L_0x0083
            io.fabric.sdk.android.Logger r9 = p389io.fabric.sdk.android.C12154c.m32113f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0055:
            r4.append(r1)
            java.lang.String r0 = r5.mo36205c(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r9.mo35954d(r2, r0)
            goto L_0x0083
        L_0x0067:
            r9 = move-exception
            goto L_0x006e
        L_0x0069:
            r9 = move-exception
            r5 = r3
            goto L_0x0085
        L_0x006c:
            r9 = move-exception
            r5 = r3
        L_0x006e:
            io.fabric.sdk.android.Logger r4 = p389io.fabric.sdk.android.C12154c.m32113f()     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = "Settings request failed."
            r4.mo35957e(r2, r6, r9)     // Catch:{ all -> 0x0084 }
            if (r5 == 0) goto L_0x0083
            io.fabric.sdk.android.Logger r9 = p389io.fabric.sdk.android.C12154c.m32113f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0055
        L_0x0083:
            return r3
        L_0x0084:
            r9 = move-exception
        L_0x0085:
            if (r5 == 0) goto L_0x00a1
            io.fabric.sdk.android.Logger r3 = p389io.fabric.sdk.android.C12154c.m32113f()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r0 = r5.mo36205c(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.mo35954d(r2, r0)
        L_0x00a1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.fabric.sdk.android.services.settings.C12260l.invoke(io.fabric.sdk.android.services.settings.t):org.json.JSONObject");
    }

    C12260l(C12161g gVar, String str, String str2, HttpRequestFactory httpRequestFactory, C12241c cVar) {
        super(gVar, str, str2, httpRequestFactory, cVar);
    }

    /* renamed from: a */
    private JSONObject m32497a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Logger f = C12154c.m32113f();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse settings JSON from ");
            sb.append(mo36046b());
            String str2 = "Fabric";
            f.mo35955d(str2, sb.toString(), e);
            Logger f2 = C12154c.m32113f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Settings response ");
            sb2.append(str);
            f2.mo35954d(str2, sb2.toString());
            return null;
        }
    }

    /* renamed from: a */
    private Map<String, String> m32496a(C12268t tVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", tVar.f31933h);
        hashMap.put("display_version", tVar.f31932g);
        hashMap.put("source", Integer.toString(tVar.f31934i));
        String str = tVar.f31935j;
        if (str != null) {
            hashMap.put("icon_hash", str);
        }
        String str2 = tVar.f31931f;
        if (!C12180h.m32264b(str2)) {
            hashMap.put("instance", str2);
        }
        return hashMap;
    }

    /* renamed from: a */
    private HttpRequest m32495a(HttpRequest httpRequest, C12268t tVar) {
        m32498a(httpRequest, "X-CRASHLYTICS-API-KEY", tVar.f31926a);
        m32498a(httpRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m32498a(httpRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", this.f31648e.mo24945h());
        m32498a(httpRequest, "Accept", "application/json");
        m32498a(httpRequest, "X-CRASHLYTICS-DEVICE-MODEL", tVar.f31927b);
        m32498a(httpRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", tVar.f31928c);
        m32498a(httpRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", tVar.f31929d);
        m32498a(httpRequest, "X-CRASHLYTICS-INSTALLATION-ID", tVar.f31930e);
        return httpRequest;
    }

    /* renamed from: a */
    private void m32498a(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.mo36203c(str, str2);
        }
    }
}
