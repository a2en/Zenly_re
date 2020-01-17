package com.appsflyer;

import java.io.IOException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

public abstract class OneLinkHttpTask implements Runnable {

    /* renamed from: ˊ */
    private AppsFlyerLibCore f22600;

    /* renamed from: ˏ */
    protected String f22601;

    /* renamed from: ॱ */
    private HttpsUrlConnectionProvider f22602;

    public static class HttpsUrlConnectionProvider {
        /* renamed from: ˎ */
        static HttpsURLConnection m20673(String str) throws IOException {
            return (HttpsURLConnection) new URL(str).openConnection();
        }
    }

    protected OneLinkHttpTask(AppsFlyerLibCore appsFlyerLibCore) {
        this.f22600 = appsFlyerLibCore;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            java.lang.String r3 = r9.mo23759()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "oneLinkUrl: "
            java.lang.String r4 = r5.concat(r4)
            com.appsflyer.AFLogger.afRDLog(r4)
            javax.net.ssl.HttpsURLConnection r4 = com.appsflyer.OneLinkHttpTask.HttpsUrlConnectionProvider.m20673(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "content-type"
            java.lang.String r6 = "application/json"
            r4.addRequestProperty(r5, r6)     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "authorization"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r6.<init>()     // Catch:{ all -> 0x0087 }
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0087 }
            java.lang.String r8 = "AppsFlyerKey"
            java.lang.String r7 = r7.getString(r8)     // Catch:{ all -> 0x0087 }
            r6.append(r7)     // Catch:{ all -> 0x0087 }
            r6.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0087 }
            java.lang.String r6 = com.appsflyer.internal.C8757ad.m20697(r6)     // Catch:{ all -> 0x0087 }
            r4.addRequestProperty(r5, r6)     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "af-timestamp"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0087 }
            r4.addRequestProperty(r5, r1)     // Catch:{ all -> 0x0087 }
            r1 = 3000(0xbb8, float:4.204E-42)
            r4.setReadTimeout(r1)     // Catch:{ all -> 0x0087 }
            r4.setConnectTimeout(r1)     // Catch:{ all -> 0x0087 }
            r9.mo23757(r4)     // Catch:{ all -> 0x0087 }
            int r1 = r4.getResponseCode()     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = com.appsflyer.AppsFlyerLibCore.m20641(r4)     // Catch:{ all -> 0x0087 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r1 != r4) goto L_0x006d
            java.lang.String r1 = "Status 200 ok"
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ all -> 0x0084 }
            goto L_0x00ae
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "Response code = "
            r0.<init>(r4)     // Catch:{ all -> 0x0084 }
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = " content = "
            r0.append(r1)     // Catch:{ all -> 0x0084 }
            r0.append(r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0084 }
            goto L_0x00ae
        L_0x0084:
            r0 = move-exception
            r1 = r0
            goto L_0x0089
        L_0x0087:
            r1 = move-exception
            r2 = r0
        L_0x0089:
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Error while calling "
            java.lang.String r0 = r4.concat(r0)
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            r0.append(r3)
            java.lang.String r3 = " stacktrace: "
            r0.append(r3)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x00ae:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x00c5
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Connection call succeeded: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            r9.mo23758(r2)
            return
        L_0x00c5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Connection error: "
            java.lang.String r0 = r1.concat(r0)
            com.appsflyer.AFLogger.afWarnLog(r0)
            r9.mo23756()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.OneLinkHttpTask.run():void");
    }

    public void setConnProvider(HttpsUrlConnectionProvider httpsUrlConnectionProvider) {
        this.f22602 = httpsUrlConnectionProvider;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ˋ */
    public abstract void mo23756();

    /* access modifiers changed from: protected */
    /* renamed from: ˋ */
    public abstract void mo23757(HttpsURLConnection httpsURLConnection) throws JSONException, IOException;

    /* access modifiers changed from: protected */
    /* renamed from: ˎ */
    public abstract void mo23758(String str);

    /* access modifiers changed from: protected */
    /* renamed from: ॱ */
    public abstract String mo23759();
}
