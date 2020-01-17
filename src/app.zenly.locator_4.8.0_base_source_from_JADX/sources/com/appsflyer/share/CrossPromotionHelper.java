package com.appsflyer.share;

import android.content.Context;
import android.os.AsyncTask;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.ServerParameters;
import com.appsflyer.internal.C8758af;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {

    /* renamed from: com.appsflyer.share.CrossPromotionHelper$b */
    static class C8805b extends AsyncTask<String, Void, Void> {

        /* renamed from: ˋ */
        private boolean f22802;

        /* renamed from: ˎ */
        private WeakReference<Context> f22803;

        /* renamed from: ˏ */
        private C8758af f22804;

        C8805b(C8758af afVar, Context context, boolean z) {
            this.f22804 = afVar;
            this.f22803 = new WeakReference<>(context);
            this.f22802 = z;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x009c, code lost:
            if (r2 != null) goto L_0x00ad;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b0, code lost:
            return null;
         */
        /* renamed from: ˊ */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.String... r6) {
            /*
                r5 = this;
                boolean r0 = r5.f22802
                r1 = 0
                if (r0 == 0) goto L_0x0006
                return r1
            L_0x0006:
                r0 = 0
                r6 = r6[r0]     // Catch:{ all -> 0x00a1 }
                java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x00a1 }
                r2.<init>(r6)     // Catch:{ all -> 0x00a1 }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x00a1 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x00a1 }
                r3 = 10000(0x2710, float:1.4013E-41)
                r2.setConnectTimeout(r3)     // Catch:{ all -> 0x009f }
                r2.setInstanceFollowRedirects(r0)     // Catch:{ all -> 0x009f }
                int r3 = r2.getResponseCode()     // Catch:{ all -> 0x009f }
                r4 = 200(0xc8, float:2.8E-43)
                if (r3 != r4) goto L_0x0032
                java.lang.String r3 = "Cross promotion impressions success: "
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x009f }
                java.lang.String r6 = r3.concat(r6)     // Catch:{ all -> 0x009f }
                com.appsflyer.AFLogger.afInfoLog(r6, r0)     // Catch:{ all -> 0x009f }
                goto L_0x009c
            L_0x0032:
                r4 = 301(0x12d, float:4.22E-43)
                if (r3 == r4) goto L_0x0055
                r4 = 302(0x12e, float:4.23E-43)
                if (r3 != r4) goto L_0x003b
                goto L_0x0055
            L_0x003b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
                java.lang.String r4 = "call to "
                r0.<init>(r4)     // Catch:{ all -> 0x009f }
                r0.append(r6)     // Catch:{ all -> 0x009f }
                java.lang.String r6 = " failed: "
                r0.append(r6)     // Catch:{ all -> 0x009f }
                r0.append(r3)     // Catch:{ all -> 0x009f }
                java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x009f }
                com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ all -> 0x009f }
                goto L_0x009c
            L_0x0055:
                java.lang.String r3 = "Cross promotion redirection success: "
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x009f }
                java.lang.String r6 = r3.concat(r6)     // Catch:{ all -> 0x009f }
                com.appsflyer.AFLogger.afInfoLog(r6, r0)     // Catch:{ all -> 0x009f }
                com.appsflyer.internal.af r6 = r5.f22804     // Catch:{ all -> 0x009f }
                if (r6 == 0) goto L_0x009c
                java.lang.ref.WeakReference<android.content.Context> r6 = r5.f22803     // Catch:{ all -> 0x009f }
                java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x009f }
                if (r6 == 0) goto L_0x009c
                java.lang.String r6 = "Location"
                java.lang.String r6 = r2.getHeaderField(r6)     // Catch:{ all -> 0x009f }
                com.appsflyer.internal.af r0 = r5.f22804     // Catch:{ all -> 0x009f }
                r0.f22649 = r6     // Catch:{ all -> 0x009f }
                com.appsflyer.internal.af r6 = r5.f22804     // Catch:{ all -> 0x009f }
                java.lang.ref.WeakReference<android.content.Context> r0 = r5.f22803     // Catch:{ all -> 0x009f }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x009f }
                android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x009f }
                java.lang.String r3 = r6.f22649     // Catch:{ all -> 0x009f }
                if (r3 == 0) goto L_0x009c
                android.content.Intent r3 = new android.content.Intent     // Catch:{ all -> 0x009f }
                java.lang.String r4 = "android.intent.action.VIEW"
                java.lang.String r6 = r6.f22649     // Catch:{ all -> 0x009f }
                android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ all -> 0x009f }
                r3.<init>(r4, r6)     // Catch:{ all -> 0x009f }
                r6 = 268435456(0x10000000, float:2.5243549E-29)
                android.content.Intent r6 = r3.setFlags(r6)     // Catch:{ all -> 0x009f }
                r0.startActivity(r6)     // Catch:{ all -> 0x009f }
            L_0x009c:
                if (r2 == 0) goto L_0x00b0
                goto L_0x00ad
            L_0x009f:
                r6 = move-exception
                goto L_0x00a3
            L_0x00a1:
                r6 = move-exception
                r2 = r1
            L_0x00a3:
                java.lang.String r0 = r6.getMessage()     // Catch:{ all -> 0x00b1 }
                r3 = 1
                com.appsflyer.AFLogger.afErrorLog(r0, r6, r3)     // Catch:{ all -> 0x00b1 }
                if (r2 == 0) goto L_0x00b0
            L_0x00ad:
                r2.disconnect()
            L_0x00b0:
                return r1
            L_0x00b1:
                r6 = move-exception
                if (r2 == 0) goto L_0x00b7
                r2.disconnect()
            L_0x00b7:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.share.CrossPromotionHelper.C8805b.doInBackground(java.lang.String[]):java.lang.Void");
        }
    }

    public static void trackAndOpenStore(Context context, String str, String str2) {
        trackAndOpenStore(context, str, str2, null);
    }

    public static void trackCrossPromoteImpression(Context context, String str, String str2) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        LinkGenerator r4 = m20783(context, str, str2, null, ServerConfigHandler.getUrl("https://%simpression.%s"));
        new C8805b(null, null, AppsFlyerLib.getInstance().isTrackingStopped()).execute(new String[]{r4.generateLink()});
    }

    /* renamed from: ˏ */
    private static LinkGenerator m20783(Context context, String str, String str2, Map<String, String> map, String str3) {
        LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.f22811 = str3;
        linkGenerator.f22814 = str;
        linkGenerator.addParameter(Constants.URL_SITE_ID, context.getPackageName());
        if (str2 != null) {
            linkGenerator.setCampaign(str2);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        String string = AppsFlyerProperties.getInstance().getString(ServerParameters.ADVERTISING_ID_PARAM);
        if (string != null) {
            linkGenerator.addParameter(Constants.URL_ADVERTISING_ID, string);
        }
        return linkGenerator;
    }

    public static void trackAndOpenStore(Context context, String str, String str2, Map<String, String> map) {
        LinkGenerator r4 = m20783(context, str, str2, map, ServerConfigHandler.getUrl(Constants.BASE_URL_APP_APPSFLYER_COM));
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("af_campaign", str2);
        AppsFlyerLib.getInstance().trackEvent(context, "af_cross_promotion", hashMap);
        new C8805b(new C8758af(), context, AppsFlyerLib.getInstance().isTrackingStopped()).execute(new String[]{r4.generateLink()});
    }
}
