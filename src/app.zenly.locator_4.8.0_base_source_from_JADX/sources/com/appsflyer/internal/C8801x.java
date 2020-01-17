package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.TrafficStats;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.appsflyer.AFFacebookDeferredDeeplink.C87402;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.ServerConfigHandler;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.x */
public final class C8801x extends AsyncTask<String, Void, String> {

    /* renamed from: ʻ */
    private boolean f22789 = false;

    /* renamed from: ʼ */
    private String f22790 = "";

    /* renamed from: ʽ */
    private boolean f22791 = false;

    /* renamed from: ˊ */
    HttpURLConnection f22792;

    /* renamed from: ˋ */
    boolean f22793;

    /* renamed from: ˎ */
    boolean f22794;

    /* renamed from: ˏ */
    public Map<String, String> f22795;

    /* renamed from: ॱ */
    String f22796;

    /* renamed from: ॱॱ */
    private URL f22797;

    /* renamed from: ᐝ */
    private WeakReference<Context> f22798;

    public C8801x(Context context, boolean z) {
        this.f22798 = new WeakReference<>(context);
        this.f22793 = true;
        this.f22794 = true;
        this.f22791 = z;
    }

    /* access modifiers changed from: protected */
    public final void onCancelled() {
    }

    public final void onPreExecute() {
        if (this.f22796 == null) {
            this.f22796 = new JSONObject(this.f22795).toString();
        }
    }

    /* renamed from: ˏ */
    public final String doInBackground(String... strArr) {
        if (this.f22791) {
            return null;
        }
        try {
            this.f22797 = new URL(strArr[0]);
            String str = "UTF-8";
            if (this.f22793) {
                if (C8752aa.f22603 == null) {
                    C8752aa.f22603 = new C8752aa();
                }
                C8752aa.f22603.mo23772("server_request", this.f22797.toString(), this.f22796);
                int length = this.f22796.getBytes(str).length;
                StringBuilder sb = new StringBuilder("call = ");
                sb.append(this.f22797);
                sb.append("; size = ");
                sb.append(length);
                sb.append(" byte");
                sb.append(length > 1 ? "s" : "");
                sb.append("; body = ");
                sb.append(this.f22796);
                C87402.m20581(sb.toString());
            }
            if (VERSION.SDK_INT >= 14) {
                TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
            }
            this.f22792 = (HttpURLConnection) this.f22797.openConnection();
            this.f22792.setReadTimeout(30000);
            this.f22792.setConnectTimeout(30000);
            this.f22792.setRequestMethod("POST");
            this.f22792.setDoInput(true);
            this.f22792.setDoOutput(true);
            this.f22792.setRequestProperty("Content-Type", "application/json");
            OutputStream outputStream = this.f22792.getOutputStream();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, str));
            bufferedWriter.write(this.f22796);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStream.close();
            this.f22792.connect();
            int responseCode = this.f22792.getResponseCode();
            if (this.f22794) {
                AppsFlyerLibCore.getInstance();
                this.f22790 = AppsFlyerLibCore.m20641(this.f22792);
            }
            if (this.f22793) {
                if (C8752aa.f22603 == null) {
                    C8752aa.f22603 = new C8752aa();
                }
                C8752aa.f22603.mo23772("server_response", this.f22797.toString(), String.valueOf(responseCode), this.f22790);
            }
            if (responseCode == 200) {
                AFLogger.afInfoLog("Status 200 ok");
                Context context = (Context) this.f22798.get();
                if (this.f22797.toString().startsWith(ServerConfigHandler.getUrl(AppsFlyerLibCore.f22531)) && context != null) {
                    Editor edit = AppsFlyerLibCore.m20625(context).edit();
                    edit.putBoolean("sentRegisterRequestToAF", true);
                    edit.apply();
                    AFLogger.afDebugLog("Successfully registered for Uninstall Tracking");
                }
            } else {
                this.f22789 = true;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Error while calling ");
            sb2.append(this.f22797.toString());
            AFLogger.afErrorLog(sb2.toString(), th);
            this.f22789 = true;
        }
        return this.f22790;
    }

    /* renamed from: ॱ */
    public final void onPostExecute(String str) {
        if (this.f22789) {
            AFLogger.afInfoLog("Connection error: ".concat(String.valueOf(str)));
            return;
        }
        AFLogger.afInfoLog("Connection call succeeded: ".concat(String.valueOf(str)));
    }
}
