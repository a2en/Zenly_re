package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings.Secure;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.share.Constants;

/* renamed from: com.appsflyer.internal.p */
public final class C8785p {

    /* renamed from: com.appsflyer.internal.p$d */
    static class C8786d extends IllegalStateException {
        C8786d(String str) {
            super(str);
        }
    }

    C8785p() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r8.length() == 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090 A[SYNTHETIC, Splitter:B:35:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20753(android.content.Context r12, java.util.Map<java.lang.String, java.lang.Object> r13) {
        /*
            java.lang.String r0 = "advertiserIdEnabled"
            java.lang.String r1 = "advertiserId"
            java.lang.String r2 = "Trying to fetch GAID.."
            com.appsflyer.AFLogger.afInfoLog(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.common.c r3 = com.google.android.gms.common.C10067c.m25293a()     // Catch:{ all -> 0x0017 }
            int r3 = r3.mo27284a(r12)     // Catch:{ all -> 0x0017 }
            goto L_0x0020
        L_0x0017:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r4, r3)
            r3 = -1
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.identifier.AdvertisingIdClient"
            r5 = 0
            r6 = 0
            r7 = 1
            java.lang.Class.forName(r4)     // Catch:{ all -> 0x0064 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r4 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r12)     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0057
            java.lang.String r8 = r4.getId()     // Catch:{ all -> 0x0064 }
            boolean r4 = r4.isLimitAdTrackingEnabled()     // Catch:{ all -> 0x0054 }
            if (r4 != 0) goto L_0x003a
            r4 = 1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            java.lang.String r5 = java.lang.Boolean.toString(r4)     // Catch:{ all -> 0x0054 }
            if (r8 == 0) goto L_0x0047
            int r4 = r8.length()     // Catch:{ all -> 0x0050 }
            if (r4 != 0) goto L_0x004c
        L_0x0047:
            java.lang.String r4 = "emptyOrNull |"
            r2.append(r4)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            r4 = r5
            r5 = 1
            goto L_0x00ec
        L_0x0050:
            r4 = move-exception
            r9 = r5
            r5 = 1
            goto L_0x0068
        L_0x0054:
            r4 = move-exception
            r9 = r5
            goto L_0x0067
        L_0x0057:
            java.lang.String r4 = "gpsAdInfo-null |"
            r2.append(r4)     // Catch:{ all -> 0x0064 }
            com.appsflyer.internal.p$d r4 = new com.appsflyer.internal.p$d     // Catch:{ all -> 0x0064 }
            java.lang.String r8 = "GpsAdIndo is null"
            r4.<init>(r8)     // Catch:{ all -> 0x0064 }
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r4 = move-exception
            r8 = r5
            r9 = r8
        L_0x0067:
            r5 = 0
        L_0x0068:
            java.lang.String r10 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r10, r4)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            java.lang.String r4 = " |"
            r2.append(r4)
            java.lang.String r10 = "WARNING: Google Play Services is missing."
            com.appsflyer.AFLogger.afInfoLog(r10)
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r11 = "enableGpsFallback"
            boolean r10 = r10.getBoolean(r11, r7)
            if (r10 == 0) goto L_0x00eb
            com.appsflyer.internal.t$c r8 = com.appsflyer.internal.C8792t.m20760(r12)     // Catch:{ all -> 0x00af }
            java.lang.String r9 = r8.f22777     // Catch:{ all -> 0x00af }
            boolean r8 = r8.f22778     // Catch:{ all -> 0x00af }
            if (r8 != 0) goto L_0x009b
            r6 = 1
        L_0x009b:
            java.lang.String r6 = java.lang.Boolean.toString(r6)     // Catch:{ all -> 0x00af }
            if (r9 == 0) goto L_0x00a7
            int r7 = r9.length()     // Catch:{ all -> 0x00af }
            if (r7 != 0) goto L_0x00ac
        L_0x00a7:
            java.lang.String r7 = "emptyOrNull (bypass) |"
            r2.append(r7)     // Catch:{ all -> 0x00af }
        L_0x00ac:
            r4 = r6
            r8 = r9
            goto L_0x00ec
        L_0x00af:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r7, r6)
            java.lang.Class r7 = r6.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r2.append(r7)
            r2.append(r4)
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r8 = r4.getString(r1)
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r4 = r4.getString(r0)
            java.lang.String r7 = r6.getLocalizedMessage()
            if (r7 == 0) goto L_0x00e3
            java.lang.String r6 = r6.getLocalizedMessage()
            com.appsflyer.AFLogger.afInfoLog(r6)
            goto L_0x00ec
        L_0x00e3:
            java.lang.String r6 = r6.toString()
            com.appsflyer.AFLogger.afInfoLog(r6)
            goto L_0x00ec
        L_0x00eb:
            r4 = r9
        L_0x00ec:
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r6 = "android.app.ReceiverRestrictedContext"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0111
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r8 = r12.getString(r1)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r4 = r12.getString(r0)
            java.lang.String r12 = "context = android.app.ReceiverRestrictedContext |"
            r2.append(r12)
        L_0x0111:
            int r12 = r2.length()
            if (r12 <= 0) goto L_0x0130
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r3 = ": "
            r12.append(r3)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            java.lang.String r2 = "gaidError"
            r13.put(r2, r12)
        L_0x0130:
            if (r8 == 0) goto L_0x0151
            if (r4 == 0) goto L_0x0151
            r13.put(r1, r8)
            r13.put(r0, r4)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            r12.set(r1, r8)
            com.appsflyer.AppsFlyerProperties r12 = com.appsflyer.AppsFlyerProperties.getInstance()
            r12.set(r0, r4)
            java.lang.String r12 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "isGaidWithGps"
            r13.put(r0, r12)
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8785p.m20753(android.content.Context, java.util.Map):void");
    }

    /* renamed from: ॱ */
    public static C8790s m20754(ContentResolver contentResolver) {
        String str;
        C8790s sVar = null;
        if (contentResolver == null) {
            return null;
        }
        if (AppsFlyerProperties.getInstance().getString("amazon_aid") == null) {
            if ("Amazon".equals(Build.MANUFACTURER)) {
                int i = Secure.getInt(contentResolver, "limit_ad_tracking", 2);
                String str2 = Constants.URL_ADVERTISING_ID;
                if (i == 0) {
                    sVar = new C8790s(C8791e.AMAZON, Secure.getString(contentResolver, str2), false);
                } else if (i != 2) {
                    try {
                        str = Secure.getString(contentResolver, str2);
                    } catch (Throwable th) {
                        AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                        str = "";
                    }
                    sVar = new C8790s(C8791e.AMAZON, str, true);
                }
            }
        }
        return sVar;
    }
}
