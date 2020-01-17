package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.ServerParameters;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.r */
public final class C8788r implements Runnable {

    /* renamed from: ॱ */
    private static String f22757;

    /* renamed from: ʻ */
    private String f22758;

    /* renamed from: ʼ */
    private String f22759;
    /* access modifiers changed from: private */

    /* renamed from: ʽ */
    public Map<String, String> f22760;

    /* renamed from: ˊ */
    private final Intent f22761;

    /* renamed from: ˋ */
    private String f22762;

    /* renamed from: ˎ */
    private String f22763;
    /* access modifiers changed from: private */

    /* renamed from: ˏ */
    public WeakReference<Context> f22764;

    /* renamed from: ॱॱ */
    private String f22765;

    /* renamed from: ᐝ */
    private String f22766;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AppsFlyerLibCore.f22530);
        sb.append("/androidevent?buildnumber=4.10.3&app_id=");
        f22757 = sb.toString();
    }

    public C8788r(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Intent intent) {
        this.f22764 = new WeakReference<>(context);
        this.f22762 = str;
        this.f22763 = str2;
        this.f22765 = str4;
        this.f22766 = str5;
        this.f22759 = str6;
        this.f22760 = map;
        this.f22758 = str3;
        this.f22761 = intent;
    }

    public final void run() {
        String str = "result";
        String str2 = ServerParameters.ADVERTISING_ID_PARAM;
        String str3 = this.f22762;
        if (str3 != null && str3.length() != 0 && !AppsFlyerLib.getInstance().isTrackingStopped()) {
            HttpURLConnection httpURLConnection = null;
            try {
                Context context = (Context) this.f22764.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.f22763);
                    hashMap.put("sig-data", this.f22765);
                    hashMap.put("signature", this.f22758);
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(hashMap);
                    Executors.newSingleThreadScheduledExecutor().schedule(new Runnable() {
                        public final void run() {
                            C8788r rVar = C8788r.this;
                            C8788r.m20758(rVar, hashMap2, rVar.f22760, C8788r.this.f22764);
                        }
                    }, 5, TimeUnit.MILLISECONDS);
                    hashMap.put("dev_key", this.f22762);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    hashMap.put(str2, AppsFlyerProperties.getInstance().getString(str2));
                    String jSONObject = new JSONObject(hashMap).toString();
                    String url = ServerConfigHandler.getUrl("https://%ssdk-services.%s/validate-android-signature");
                    if (C8752aa.f22603 == null) {
                        C8752aa.f22603 = new C8752aa();
                    }
                    C8752aa.f22603.mo23772("server_request", url, jSONObject);
                    HttpURLConnection r2 = m20757(jSONObject, url);
                    int i = -1;
                    if (r2 != null) {
                        i = r2.getResponseCode();
                    }
                    AppsFlyerLibCore.getInstance();
                    String r5 = AppsFlyerLibCore.m20641(r2);
                    if (C8752aa.f22603 == null) {
                        C8752aa.f22603 = new C8752aa();
                    }
                    C8752aa.f22603.mo23772("server_response", url, String.valueOf(i), r5);
                    JSONObject jSONObject2 = new JSONObject(r5);
                    jSONObject2.put("code", i);
                    if (i == 200) {
                        StringBuilder sb = new StringBuilder("Validate response 200 ok: ");
                        sb.append(jSONObject2.toString());
                        AFLogger.afInfoLog(sb.toString());
                        m20759(jSONObject2.optBoolean(str) ? jSONObject2.getBoolean(str) : false, this.f22765, this.f22766, this.f22759, jSONObject2.toString());
                    } else {
                        AFLogger.afInfoLog("Failed Validate request");
                        m20759(false, this.f22765, this.f22766, this.f22759, jSONObject2.toString());
                    }
                    if (r2 != null) {
                        r2.disconnect();
                    }
                }
            } catch (Throwable th) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        }
    }

    /* renamed from: ˎ */
    private static HttpURLConnection m20757(String str, String str2) throws IOException {
        try {
            C8801x xVar = new C8801x(null, AppsFlyerLib.getInstance().isTrackingStopped());
            xVar.f22796 = str;
            xVar.f22794 = false;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                StringBuilder sb = new StringBuilder("Main thread detected. Calling ");
                sb.append(str2);
                sb.append(" in a new thread.");
                AFLogger.afDebugLog(sb.toString());
                xVar.execute(new String[]{str2});
            } else {
                StringBuilder sb2 = new StringBuilder("Calling ");
                sb2.append(str2);
                sb2.append(" (on current thread: ");
                sb2.append(Thread.currentThread().toString());
                sb2.append(" )");
                AFLogger.afDebugLog(sb2.toString());
                xVar.onPreExecute();
                xVar.onPostExecute(xVar.doInBackground(str2));
            }
            return xVar.f22792;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not send callStats request", th);
            return null;
        }
    }

    /* renamed from: ˎ */
    private static void m20759(boolean z, String str, String str2, String str3, String str4) {
        if (AppsFlyerLibCore.f22527 != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            String str5 = " ";
            sb.append(str5);
            sb.append(str2);
            sb.append(str5);
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AppsFlyerLibCore.f22527.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AppsFlyerLibCore.f22527;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.net.HttpURLConnection, java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [java.net.HttpURLConnection, java.lang.String]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.String, ?[int, boolean, OBJECT, ARRAY, byte, short, char], java.net.HttpURLConnection]
      mth insns count: 133
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m20758(com.appsflyer.internal.C8788r r6, java.util.Map r7, java.util.Map r8, java.lang.ref.WeakReference r9) {
        /*
            java.lang.Object r0 = r9.get()
            if (r0 == 0) goto L_0x017a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f22757
            java.lang.String r1 = com.appsflyer.ServerConfigHandler.getUrl(r1)
            r0.append(r1)
            java.lang.Object r1 = r9.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r1 = r1.getPackageName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r1 = r9.get()
            android.content.Context r1 = (android.content.Context) r1
            android.content.SharedPreferences r1 = com.appsflyer.AppsFlyerLibCore.m20625(r1)
            r2 = 0
            java.lang.String r3 = "referrer"
            java.lang.String r1 = r1.getString(r3, r2)
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = ""
        L_0x003a:
            com.appsflyer.AppsFlyerLibCore r3 = com.appsflyer.AppsFlyerLibCore.getInstance()
            com.appsflyer.internal.h r4 = new com.appsflyer.internal.h
            r4.<init>()
            java.lang.Object r9 = r9.get()
            android.content.Context r9 = (android.content.Context) r9
            r4.f22720 = r9
            java.lang.String r9 = r6.f22762
            r4.f22726 = r9
            java.lang.String r9 = "af_purchase"
            r4.f22715 = r9
            r4.f22725 = r1
            android.content.Intent r9 = r6.f22761
            r4.f22716 = r9
            java.util.Map r9 = r3.mo23710(r4)
            java.lang.String r1 = r6.f22766
            java.lang.String r3 = "price"
            r9.put(r3, r1)
            java.lang.String r6 = r6.f22759
            java.lang.String r1 = "currency"
            r9.put(r1, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>(r9)
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.util.Set r7 = r7.entrySet()     // Catch:{ JSONException -> 0x009d }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x009d }
        L_0x007d:
            boolean r1 = r7.hasNext()     // Catch:{ JSONException -> 0x009d }
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r7.next()     // Catch:{ JSONException -> 0x009d }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ JSONException -> 0x009d }
            java.lang.Object r3 = r1.getKey()     // Catch:{ JSONException -> 0x009d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x009d }
            java.lang.Object r1 = r1.getValue()     // Catch:{ JSONException -> 0x009d }
            r9.put(r3, r1)     // Catch:{ JSONException -> 0x009d }
            goto L_0x007d
        L_0x0097:
            java.lang.String r7 = "receipt_data"
            r6.put(r7, r9)     // Catch:{ JSONException -> 0x009d }
            goto L_0x00a3
        L_0x009d:
            r7 = move-exception
            java.lang.String r9 = "Failed to build 'receipt_data'"
            com.appsflyer.AFLogger.afErrorLog(r9, r7)
        L_0x00a3:
            if (r8 == 0) goto L_0x00d8
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.util.Set r8 = r8.entrySet()     // Catch:{ JSONException -> 0x00d2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ JSONException -> 0x00d2 }
        L_0x00b2:
            boolean r9 = r8.hasNext()     // Catch:{ JSONException -> 0x00d2 }
            if (r9 == 0) goto L_0x00cc
            java.lang.Object r9 = r8.next()     // Catch:{ JSONException -> 0x00d2 }
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch:{ JSONException -> 0x00d2 }
            java.lang.Object r1 = r9.getKey()     // Catch:{ JSONException -> 0x00d2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x00d2 }
            java.lang.Object r9 = r9.getValue()     // Catch:{ JSONException -> 0x00d2 }
            r7.put(r1, r9)     // Catch:{ JSONException -> 0x00d2 }
            goto L_0x00b2
        L_0x00cc:
            java.lang.String r8 = "extra_prms"
            r6.put(r8, r7)     // Catch:{ JSONException -> 0x00d2 }
            goto L_0x00d8
        L_0x00d2:
            r7 = move-exception
            java.lang.String r8 = "Failed to build 'extra_prms'"
            com.appsflyer.AFLogger.afErrorLog(r8, r7)
        L_0x00d8:
            java.lang.String r6 = r6.toString()
            com.appsflyer.internal.aa r7 = com.appsflyer.internal.C8752aa.f22603
            if (r7 != 0) goto L_0x00e7
            com.appsflyer.internal.aa r7 = new com.appsflyer.internal.aa
            r7.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r7
        L_0x00e7:
            com.appsflyer.internal.aa r7 = com.appsflyer.internal.C8752aa.f22603
            r8 = 1
            java.lang.String[] r9 = new java.lang.String[r8]
            r1 = 0
            r9[r1] = r6
            java.lang.String r3 = "server_request"
            r7.mo23772(r3, r0, r9)
            java.net.HttpURLConnection r2 = m20757(r6, r0)     // Catch:{ all -> 0x0165 }
            r6 = -1
            if (r2 == 0) goto L_0x00ff
            int r6 = r2.getResponseCode()     // Catch:{ all -> 0x0165 }
        L_0x00ff:
            com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x0165 }
            java.lang.String r7 = com.appsflyer.AppsFlyerLibCore.m20641(r2)     // Catch:{ all -> 0x0165 }
            com.appsflyer.internal.aa r9 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x0165 }
            if (r9 != 0) goto L_0x0111
            com.appsflyer.internal.aa r9 = new com.appsflyer.internal.aa     // Catch:{ all -> 0x0165 }
            r9.<init>()     // Catch:{ all -> 0x0165 }
            com.appsflyer.internal.C8752aa.f22603 = r9     // Catch:{ all -> 0x0165 }
        L_0x0111:
            com.appsflyer.internal.aa r9 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x0165 }
            java.lang.String r3 = "server_response"
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0165 }
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0165 }
            r4[r1] = r5     // Catch:{ all -> 0x0165 }
            r4[r8] = r7     // Catch:{ all -> 0x0165 }
            r9.mo23772(r3, r0, r4)     // Catch:{ all -> 0x0165 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x0165 }
            r8.<init>(r7)     // Catch:{ all -> 0x0165 }
            r7 = 200(0xc8, float:2.8E-43)
            if (r6 != r7) goto L_0x0142
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            java.lang.String r7 = "Validate-WH response - 200: "
            r6.<init>(r7)     // Catch:{ all -> 0x0165 }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x0165 }
            r6.append(r7)     // Catch:{ all -> 0x0165 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0165 }
            com.appsflyer.AFLogger.afInfoLog(r6)     // Catch:{ all -> 0x0165 }
            goto L_0x015f
        L_0x0142:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0165 }
            java.lang.String r9 = "Validate-WH response failed - "
            r7.<init>(r9)     // Catch:{ all -> 0x0165 }
            r7.append(r6)     // Catch:{ all -> 0x0165 }
            java.lang.String r6 = ": "
            r7.append(r6)     // Catch:{ all -> 0x0165 }
            java.lang.String r6 = r8.toString()     // Catch:{ all -> 0x0165 }
            r7.append(r6)     // Catch:{ all -> 0x0165 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0165 }
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ all -> 0x0165 }
        L_0x015f:
            if (r2 == 0) goto L_0x017a
            r2.disconnect()
            return
        L_0x0165:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()     // Catch:{ all -> 0x0173 }
            com.appsflyer.AFLogger.afErrorLog(r7, r6)     // Catch:{ all -> 0x0173 }
            if (r2 == 0) goto L_0x017a
            r2.disconnect()
            return
        L_0x0173:
            r6 = move-exception
            if (r2 == 0) goto L_0x0179
            r2.disconnect()
        L_0x0179:
            throw r6
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8788r.m20758(com.appsflyer.internal.r, java.util.Map, java.util.Map, java.lang.ref.WeakReference):void");
    }
}
