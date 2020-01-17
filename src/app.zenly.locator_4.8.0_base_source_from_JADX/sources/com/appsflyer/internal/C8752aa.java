package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerParameters;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.aa */
public final class C8752aa {

    /* renamed from: ˋ */
    public static C8752aa f22603;

    /* renamed from: ʻ */
    private final String f22604;

    /* renamed from: ʻॱ */
    private final String f22605;

    /* renamed from: ʼ */
    private final String f22606;

    /* renamed from: ʼॱ */
    private final String f22607;

    /* renamed from: ʽ */
    private final String f22608;

    /* renamed from: ʽॱ */
    private final String f22609;

    /* renamed from: ʾ */
    private final String f22610;

    /* renamed from: ʿ */
    private final String f22611;

    /* renamed from: ˈ */
    private final String f22612;

    /* renamed from: ˉ */
    private final String f22613;

    /* renamed from: ˊ */
    public boolean f22614;

    /* renamed from: ˊˊ */
    private boolean f22615;

    /* renamed from: ˊˋ */
    private JSONObject f22616;

    /* renamed from: ˊॱ */
    private final String f22617;

    /* renamed from: ˊᐝ */
    private JSONArray f22618;

    /* renamed from: ˋˊ */
    private final String f22619;

    /* renamed from: ˋˋ */
    private String f22620;

    /* renamed from: ˋॱ */
    private final String f22621;

    /* renamed from: ˋᐝ */
    private int f22622;

    /* renamed from: ˎ */
    private final String f22623;

    /* renamed from: ˎˎ */
    private boolean f22624;

    /* renamed from: ˏ */
    public boolean f22625;

    /* renamed from: ˏॱ */
    private final String f22626;

    /* renamed from: ͺ */
    private final String f22627;

    /* renamed from: ॱ */
    private final String f22628;

    /* renamed from: ॱˊ */
    private final String f22629;

    /* renamed from: ॱˋ */
    private final String f22630;

    /* renamed from: ॱˎ */
    private final String f22631;

    /* renamed from: ॱॱ */
    private final String f22632;

    /* renamed from: ॱᐝ */
    private final String f22633;

    /* renamed from: ᐝ */
    private final String f22634;

    /* renamed from: ᐝॱ */
    private final String f22635;

    public C8752aa() {
        this.f22628 = "brand";
        this.f22623 = "model";
        this.f22634 = "platform";
        this.f22608 = "platform_version";
        this.f22606 = ServerParameters.ADVERTISING_ID_PARAM;
        this.f22632 = "imei";
        this.f22604 = "android_id";
        this.f22617 = "sdk_version";
        this.f22621 = "devkey";
        this.f22627 = "originalAppsFlyerId";
        this.f22629 = "uid";
        this.f22626 = "app_id";
        this.f22605 = "app_version";
        this.f22635 = AppsFlyerProperties.CHANNEL;
        this.f22633 = "preInstall";
        this.f22631 = "data";
        this.f22630 = "r_debugging_off";
        this.f22610 = "r_debugging_on";
        this.f22607 = "public_api_call";
        this.f22609 = "exception";
        this.f22611 = "server_request";
        this.f22612 = "server_response";
        this.f22613 = "yyyy-MM-dd HH:mm:ssZ";
        this.f22619 = "MM-dd HH:mm:ss.SSS";
        this.f22615 = true;
        this.f22622 = 0;
        this.f22620 = "-1";
        this.f22624 = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
        this.f22614 = true ^ this.f22624;
        this.f22618 = new JSONArray();
        this.f22622 = 0;
        this.f22625 = false;
    }

    /* renamed from: ˋ */
    private synchronized void m20675(String str, String str2, String str3, String str4) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    this.f22616.put("app_id", str);
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (str2 != null && str2.length() > 0) {
            this.f22616.put("app_version", str2);
        }
        if (str3 != null && str3.length() > 0) {
            this.f22616.put(AppsFlyerProperties.CHANNEL, str3);
        }
        if (str4 != null && str4.length() > 0) {
            this.f22616.put("preInstall", str4);
        }
    }

    /* renamed from: ˎ */
    private synchronized void m20676(String str, String str2, String str3, String str4) {
        try {
            this.f22616.put("sdk_version", str);
            if (str2 != null && str2.length() > 0) {
                this.f22616.put("devkey", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.f22616.put("originalAppsFlyerId", str3);
            }
            if (str4 != null && str4.length() > 0) {
                this.f22616.put("uid", str4);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ॱॱ */
    private synchronized void m20678() {
        this.f22618 = null;
        this.f22618 = new JSONArray();
        this.f22622 = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˊ */
    public final synchronized void mo23767() {
        this.f22616 = null;
        this.f22618 = null;
        f22603 = null;
    }

    /* renamed from: ˏ */
    public final synchronized void mo23771() {
        mo23772("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        this.f22625 = false;
        this.f22615 = false;
    }

    /* renamed from: ॱ */
    public final synchronized void mo23774(String str) {
        this.f22620 = str;
    }

    /* renamed from: ॱ */
    public final synchronized void mo23773() {
        this.f22625 = true;
        mo23772("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
    }

    /* renamed from: ˏ */
    private synchronized void m20677(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.f22616.put("brand", str);
            this.f22616.put("model", str2);
            this.f22616.put("platform", "Android");
            this.f22616.put("platform_version", str3);
            if (str4 != null && str4.length() > 0) {
                this.f22616.put(ServerParameters.ADVERTISING_ID_PARAM, str4);
            }
            if (str5 != null && str5.length() > 0) {
                this.f22616.put("imei", str5);
            }
            if (str6 != null && str6.length() > 0) {
                this.f22616.put("android_id", str6);
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0070 */
    /* renamed from: ˎ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo23770(java.lang.String r11, android.content.pm.PackageManager r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0081 }
            com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.getInstance()     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "remote_debug_static_data"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0019
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x0070 }
            r11.<init>(r2)     // Catch:{ all -> 0x0070 }
            r10.f22616 = r11     // Catch:{ all -> 0x0070 }
            goto L_0x0070
        L_0x0019:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0081 }
            r2.<init>()     // Catch:{ all -> 0x0081 }
            r10.f22616 = r2     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = android.os.Build.MODEL     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "advertiserId"
            java.lang.String r7 = r0.getString(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r8 = r1.f22558     // Catch:{ all -> 0x0081 }
            java.lang.String r9 = r1.f22547     // Catch:{ all -> 0x0081 }
            r3 = r10
            r3.m20677(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "4.10.3.233"
            java.lang.String r2 = "AppsFlyerKey"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0081 }
            java.lang.String r3 = "KSAppsFlyerId"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "uid"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x0081 }
            r10.m20676(r1, r2, r3, r4)     // Catch:{ all -> 0x0081 }
            r1 = 0
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r11, r1)     // Catch:{ all -> 0x0065 }
            int r12 = r12.versionCode     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "channel"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "preInstallName"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x0065 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0065 }
            r10.m20675(r11, r12, r1, r2)     // Catch:{ all -> 0x0065 }
        L_0x0065:
            java.lang.String r11 = "remote_debug_static_data"
            org.json.JSONObject r12 = r10.f22616     // Catch:{ all -> 0x0081 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0081 }
            r0.set(r11, r12)     // Catch:{ all -> 0x0081 }
        L_0x0070:
            org.json.JSONObject r11 = r10.f22616     // Catch:{ JSONException -> 0x007b }
            java.lang.String r12 = "launch_counter"
            java.lang.String r0 = r10.f22620     // Catch:{ JSONException -> 0x007b }
            r11.put(r12, r0)     // Catch:{ JSONException -> 0x007b }
            monitor-exit(r10)
            return
        L_0x007b:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x0081 }
            monitor-exit(r10)
            return
        L_0x0081:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8752aa.mo23770(java.lang.String, android.content.pm.PackageManager):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final synchronized String mo23768() {
        String str;
        str = null;
        try {
            this.f22616.put("data", this.f22618);
            str = this.f22616.toString();
            m20678();
        } catch (JSONException unused) {
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        return;
     */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo23772(java.lang.String r12, java.lang.String r13, java.lang.String... r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f22614     // Catch:{ all -> 0x00b5 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0011
            boolean r0 = r11.f22615     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x000f
            boolean r0 = r11.f22625     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0011
        L_0x000f:
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x00b3
            int r0 = r11.f22622     // Catch:{ all -> 0x00b5 }
            r3 = 98304(0x18000, float:1.37753E-40)
            if (r0 < r3) goto L_0x001d
            goto L_0x00b3
        L_0x001d:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = ""
            int r5 = r14.length     // Catch:{ all -> 0x00b1 }
            if (r5 <= 0) goto L_0x0045
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b1 }
            r0.<init>()     // Catch:{ all -> 0x00b1 }
            int r5 = r14.length     // Catch:{ all -> 0x00b1 }
            int r5 = r5 - r1
        L_0x002d:
            if (r5 <= 0) goto L_0x003c
            r6 = r14[r5]     // Catch:{ all -> 0x00b1 }
            r0.append(r6)     // Catch:{ all -> 0x00b1 }
            java.lang.String r6 = ", "
            r0.append(r6)     // Catch:{ all -> 0x00b1 }
            int r5 = r5 + -1
            goto L_0x002d
        L_0x003c:
            r14 = r14[r2]     // Catch:{ all -> 0x00b1 }
            r0.append(r14)     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b1 }
        L_0x0045:
            java.text.SimpleDateFormat r14 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "MM-dd HH:mm:ss.SSS"
            java.util.Locale r6 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x00b1 }
            r14.<init>(r5, r6)     // Catch:{ all -> 0x00b1 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00b1 }
            java.lang.String r14 = r14.format(r3)     // Catch:{ all -> 0x00b1 }
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 5
            if (r12 == 0) goto L_0x0080
            java.lang.String r7 = "%18s %5s _/%s [%s] %s %s"
            r8 = 6
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00b1 }
            r8[r2] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b1 }
            long r9 = r14.getId()     // Catch:{ all -> 0x00b1 }
            java.lang.Long r14 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00b1 }
            r8[r1] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.String r14 = "AppsFlyer_4.10.3"
            r8[r5] = r14     // Catch:{ all -> 0x00b1 }
            r8[r4] = r12     // Catch:{ all -> 0x00b1 }
            r8[r3] = r13     // Catch:{ all -> 0x00b1 }
            r8[r6] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r12 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00b1 }
            goto L_0x00a0
        L_0x0080:
            java.lang.String r12 = "%18s %5s %s/%s %s"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x00b1 }
            r6[r2] = r14     // Catch:{ all -> 0x00b1 }
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00b1 }
            long r7 = r14.getId()     // Catch:{ all -> 0x00b1 }
            java.lang.Long r14 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x00b1 }
            r6[r1] = r14     // Catch:{ all -> 0x00b1 }
            r6[r5] = r13     // Catch:{ all -> 0x00b1 }
            java.lang.String r13 = "AppsFlyer_4.10.3"
            r6[r4] = r13     // Catch:{ all -> 0x00b1 }
            r6[r3] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r12 = java.lang.String.format(r12, r6)     // Catch:{ all -> 0x00b1 }
        L_0x00a0:
            org.json.JSONArray r13 = r11.f22618     // Catch:{ all -> 0x00b1 }
            r13.put(r12)     // Catch:{ all -> 0x00b1 }
            int r13 = r11.f22622     // Catch:{ all -> 0x00b1 }
            byte[] r12 = r12.getBytes()     // Catch:{ all -> 0x00b1 }
            int r12 = r12.length     // Catch:{ all -> 0x00b1 }
            int r13 = r13 + r12
            r11.f22622 = r13     // Catch:{ all -> 0x00b1 }
            monitor-exit(r11)
            return
        L_0x00b1:
            monitor-exit(r11)
            return
        L_0x00b3:
            monitor-exit(r11)
            return
        L_0x00b5:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C8752aa.mo23772(java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    /* renamed from: ˎ */
    public final synchronized void mo23769() {
        this.f22615 = false;
        m20678();
    }
}
