package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.appsflyer.AFExecutor;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.share.Constants;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.g */
public final class C8770g {

    /* renamed from: ʼ */
    private static Uri f22700 = null;

    /* renamed from: ˊ */
    public static String[] f22701;

    /* renamed from: ˋ */
    static final int f22702 = ((int) TimeUnit.SECONDS.toMillis(2));

    /* renamed from: ˎ */
    static Uri f22703 = null;

    /* renamed from: ˏ */
    public static String[] f22704;

    /* renamed from: ॱ */
    public static volatile boolean f22705;

    /* renamed from: ᐝ */
    private static C8770g f22706 = null;

    /* renamed from: ʻ */
    public int f22707 = -1;

    /* renamed from: com.appsflyer.internal.g$2 */
    public class C87712 implements Runnable {

        /* renamed from: ˊ */
        private /* synthetic */ Uri f22708;

        /* renamed from: ˏ */
        private /* synthetic */ Context f22710;

        /* renamed from: ॱ */
        private /* synthetic */ Map f22711;

        C87712(Uri uri, Map map, Context context) {
            this.f22708 = uri;
            this.f22711 = map;
            this.f22710 = context;
        }

        /* renamed from: ˏ */
        public static void m20732(Context context) {
            Context applicationContext = context.getApplicationContext();
            AFLogger.afInfoLog("onBecameBackground");
            AppsFlyerLibCore.getInstance().f22561 = System.currentTimeMillis();
            AFLogger.afInfoLog("callStatsBackground background call");
            AppsFlyerLibCore.getInstance().mo23713(new WeakReference<>(applicationContext));
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
            }
            C8752aa aaVar = C8752aa.f22603;
            if (aaVar.f22625) {
                aaVar.mo23771();
                if (applicationContext != null) {
                    String packageName = applicationContext.getPackageName();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    try {
                        if (C8752aa.f22603 == null) {
                            C8752aa.f22603 = new C8752aa();
                        }
                        C8752aa.f22603.mo23770(packageName, packageManager);
                        if (C8752aa.f22603 == null) {
                            C8752aa.f22603 = new C8752aa();
                        }
                        String r6 = C8752aa.f22603.mo23768();
                        C8801x xVar = new C8801x(null, AppsFlyerLib.getInstance().isTrackingStopped());
                        xVar.f22796 = r6;
                        xVar.f22793 = false;
                        StringBuilder sb = new StringBuilder();
                        sb.append(ServerConfigHandler.getUrl("https://%smonitorsdk.%s/remote-debug?app_id="));
                        sb.append(packageName);
                        xVar.execute(new String[]{sb.toString()});
                    } catch (Throwable unused) {
                    }
                }
                aaVar.mo23767();
            } else {
                AFLogger.afDebugLog("RD status is OFF");
            }
            AFExecutor instance = AFExecutor.getInstance();
            try {
                AFExecutor.m20576(instance.f22505);
                if (instance.f22503 instanceof ThreadPoolExecutor) {
                    AFExecutor.m20576((ThreadPoolExecutor) instance.f22503);
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("failed to stop Executors", th);
            }
        }

        public final void run() {
            long j;
            HashMap hashMap = new HashMap();
            long currentTimeMillis = System.currentTimeMillis();
            Uri uri = null;
            try {
                StringBuilder sb = new StringBuilder("ESP deeplink resoling is started: ");
                sb.append(this.f22708.toString());
                AFLogger.afRDLog(sb.toString());
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f22708.toString()).openConnection();
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setReadTimeout(C8770g.f22702);
                httpURLConnection.setConnectTimeout(C8770g.f22702);
                httpURLConnection.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                httpURLConnection.connect();
                AFLogger.afRDLog("ESP deeplink resoling is finished");
                hashMap.put("status", String.valueOf(httpURLConnection.getResponseCode()));
                if (httpURLConnection.getResponseCode() >= 300 && httpURLConnection.getResponseCode() <= 305) {
                    uri = Uri.parse(httpURLConnection.getHeaderField(Constants.HTTP_REDIRECT_URL_HEADER_FIELD));
                }
                j = System.currentTimeMillis() - currentTimeMillis;
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                hashMap.put("error", th.getLocalizedMessage());
                hashMap.put("status", "-1");
                j = System.currentTimeMillis() - currentTimeMillis;
                AFLogger.afErrorLog(th.getMessage(), th);
            }
            hashMap.put("latency", Long.toString(j));
            if (uri != null) {
                hashMap.put("res", uri.toString());
            } else {
                hashMap.put("res", "");
            }
            StringBuilder sb2 = new StringBuilder("ESP deeplink results: ");
            sb2.append(new JSONObject(hashMap).toString());
            AFLogger.afRDLog(sb2.toString());
            synchronized (this.f22711) {
                this.f22711.put("af_deeplink_r", hashMap);
                this.f22711.put("af_deeplink", this.f22708.toString());
            }
            C8770g.f22705 = false;
            if (uri == null) {
                uri = this.f22708;
            }
            AppsFlyerLibCore.getInstance().handleDeepLinkCallback(this.f22710, this.f22711, uri);
        }

        C87712() {
        }
    }

    private C8770g() {
    }

    /* renamed from: ˋ */
    private void m20728(Context context, Map<String, Object> map, Uri uri) {
        String obj = uri.toString();
        boolean z = false;
        if (f22704 != null && !obj.contains("af_tranid=")) {
            StringBuilder sb = new StringBuilder("Validate ESP deeplinks : ");
            sb.append(Arrays.asList(f22704));
            AFLogger.afRDLog(sb.toString());
            String[] strArr = f22704;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str = strArr[i];
                if (obj.contains("://".concat(String.valueOf(str)))) {
                    z = true;
                    break;
                }
                AFLogger.afRDLog("Validate ESP: reject ".concat(String.valueOf(str)));
                i++;
            }
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder("Validation ESP succeeded for: ");
            sb2.append(uri.toString());
            AFLogger.afRDLog(sb2.toString());
            f22705 = true;
            AFExecutor instance = AFExecutor.getInstance();
            if (instance.f22504 == null) {
                instance.f22504 = Executors.newSingleThreadScheduledExecutor(instance.f22502);
            }
            instance.f22504.execute(new C87712(uri, map, context));
            return;
        }
        f22700 = uri;
        AppsFlyerLibCore.getInstance().handleDeepLinkCallback(context, map, uri);
    }

    /* renamed from: ˏ */
    public static C8770g m20730() {
        if (f22706 == null) {
            f22706 = new C8770g();
        }
        return f22706;
    }

    /* renamed from: ˏ */
    static Uri m20729(Intent intent) {
        if (intent != null) {
            if ("android.intent.action.VIEW".equals(intent.getAction())) {
                return intent.getData();
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: ˋ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23790(android.content.Intent r10, android.content.Context r11, java.util.Map<java.lang.String, java.lang.Object> r12) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0014
            java.lang.String r1 = r10.getAction()
            java.lang.String r2 = "android.intent.action.VIEW"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0014
            android.net.Uri r1 = r10.getData()
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            if (r1 == 0) goto L_0x00f0
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            r2 = 0
            java.lang.String r3 = "consumeAfDeepLink"
            boolean r0 = r0.getBoolean(r3, r2)
            int r3 = r10.getFlags()
            r4 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r4
            if (r3 != 0) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            java.lang.String r4 = "appsflyer_click_ts"
            boolean r5 = r10.hasExtra(r4)
            java.lang.String r6 = "skipping re-use of previously consumed deep link: "
            if (r5 == 0) goto L_0x007d
            if (r0 != 0) goto L_0x007d
            r2 = 0
            long r4 = r10.getLongExtra(r4, r2)
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "appsflyer_click_consumed_ts"
            long r7 = r10.getLong(r0, r2)
            int r10 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x005d
            int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x005d
            r9.m20728(r11, r12, r1)
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()
            r10.set(r0, r4)
            return
        L_0x005d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            java.lang.String r11 = r1.toString()
            r10.append(r11)
            java.lang.String r11 = " w/Ex: "
            r10.append(r11)
            java.lang.String r11 = java.lang.String.valueOf(r4)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.appsflyer.AFLogger.afInfoLog(r10)
            return
        L_0x007d:
            if (r0 != 0) goto L_0x00be
            if (r3 != 0) goto L_0x00be
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "lastActivityHash"
            int r10 = r10.getInt(r0, r2)
            int r2 = r9.f22707
            if (r2 == r10) goto L_0x009c
            r9.m20728(r11, r12, r1)
            com.appsflyer.AppsFlyerProperties r10 = com.appsflyer.AppsFlyerProperties.getInstance()
            int r11 = r9.f22707
            r10.set(r0, r11)
            return
        L_0x009c:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            java.lang.String r11 = r1.toString()
            r10.append(r11)
            java.lang.String r11 = " w/hC: "
            r10.append(r11)
            int r11 = r9.f22707
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.appsflyer.AFLogger.afInfoLog(r10)
            return
        L_0x00be:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            android.net.Uri r0 = f22700
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ce
            r9.m20728(r11, r12, r1)
            return
        L_0x00ce:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r6)
            java.lang.String r12 = r1.toString()
            r11.append(r12)
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00e3
            java.lang.String r10 = " w/sT"
            goto L_0x00e5
        L_0x00e3:
            java.lang.String r10 = " w/cAPI"
        L_0x00e5:
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            com.appsflyer.AFLogger.afInfoLog(r10)
            return
        L_0x00f0:
            android.net.Uri r10 = f22703
            if (r10 == 0) goto L_0x0115
            android.net.Uri r1 = f22700
            if (r10 == r1) goto L_0x0115
            r9.m20728(r11, r12, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "using trampoline Intent fallback with URI : "
            r10.<init>(r11)
            android.net.Uri r11 = f22703
            java.lang.String r11 = r11.toString()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.appsflyer.AFLogger.afInfoLog(r10)
            f22703 = r0
            return
        L_0x0115:
            com.appsflyer.AppsFlyerLibCore r10 = com.appsflyer.AppsFlyerLibCore.getInstance()
            android.net.Uri r10 = r10.latestDeepLink
            if (r10 == 0) goto L_0x0126
            com.appsflyer.AppsFlyerLibCore r10 = com.appsflyer.AppsFlyerLibCore.getInstance()
            android.net.Uri r10 = r10.latestDeepLink
            r9.m20728(r11, r12, r10)
        L_0x0126:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8770g.mo23790(android.content.Intent, android.content.Context, java.util.Map):void");
    }
}
