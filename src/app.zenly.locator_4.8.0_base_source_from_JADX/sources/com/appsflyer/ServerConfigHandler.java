package com.appsflyer;

public class ServerConfigHandler {
    public static String getUrl(String str) {
        return String.format(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLibCore.getInstance().getHostName()});
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091  */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static org.json.JSONObject m20674(java.lang.String r3) {
        /*
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007c, all -> 0x0052 }
            r1.<init>(r3)     // Catch:{ JSONException -> 0x007c, all -> 0x0052 }
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            java.lang.String r0 = "disableProxy"
            r2 = 0
            boolean r3 = r3.getBoolean(r0, r2)     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            java.lang.String r0 = "monitor"
            boolean r0 = r1.optBoolean(r0, r2)     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            if (r0 == 0) goto L_0x002d
            if (r3 != 0) goto L_0x002d
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            if (r3 != 0) goto L_0x0026
            com.appsflyer.internal.aa r3 = new com.appsflyer.internal.aa     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            r3.<init>()     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            com.appsflyer.internal.C8752aa.f22603 = r3     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
        L_0x0026:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            r3.mo23773()     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            goto L_0x009d
        L_0x002d:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            if (r3 != 0) goto L_0x0038
            com.appsflyer.internal.aa r3 = new com.appsflyer.internal.aa     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            r3.<init>()     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            com.appsflyer.internal.C8752aa.f22603 = r3     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
        L_0x0038:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            r3.mo23769()     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            if (r3 != 0) goto L_0x0048
            com.appsflyer.internal.aa r3 = new com.appsflyer.internal.aa     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            r3.<init>()     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            com.appsflyer.internal.C8752aa.f22603 = r3     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
        L_0x0048:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            r3.mo23771()     // Catch:{ JSONException -> 0x0050, all -> 0x004e }
            goto L_0x009d
        L_0x004e:
            r3 = move-exception
            goto L_0x0054
        L_0x0050:
            goto L_0x007d
        L_0x0052:
            r3 = move-exception
            r1 = r0
        L_0x0054:
            java.lang.String r0 = r3.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r3)
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603
            if (r3 != 0) goto L_0x0066
            com.appsflyer.internal.aa r3 = new com.appsflyer.internal.aa
            r3.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r3
        L_0x0066:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603
            r3.mo23769()
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603
            if (r3 != 0) goto L_0x0076
            com.appsflyer.internal.aa r3 = new com.appsflyer.internal.aa
            r3.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r3
        L_0x0076:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603
            r3.mo23771()
            goto L_0x009d
        L_0x007c:
            r1 = r0
        L_0x007d:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603
            if (r3 != 0) goto L_0x0088
            com.appsflyer.internal.aa r3 = new com.appsflyer.internal.aa
            r3.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r3
        L_0x0088:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603
            r3.mo23769()
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603
            if (r3 != 0) goto L_0x0098
            com.appsflyer.internal.aa r3 = new com.appsflyer.internal.aa
            r3.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r3
        L_0x0098:
            com.appsflyer.internal.aa r3 = com.appsflyer.internal.C8752aa.f22603
            r3.mo23771()
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.ServerConfigHandler.m20674(java.lang.String):org.json.JSONObject");
    }
}
