package com.appsflyer;

import android.content.Context;
import com.appsflyer.share.Constants;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateOneLinkHttpTask extends OneLinkHttpTask {

    /* renamed from: ʻ */
    private Context f22594;

    /* renamed from: ˊ */
    private Map<String, String> f22595;

    /* renamed from: ˋ */
    private ResponseListener f22596;

    /* renamed from: ˎ */
    private String f22597;

    /* renamed from: ॱ */
    private String f22598 = "";

    /* renamed from: ॱॱ */
    private boolean f22599 = false;

    public interface ResponseListener {
        void onResponse(String str);

        void onResponseError(String str);
    }

    public CreateOneLinkHttpTask(String str, Map<String, String> map, AppsFlyerLibCore appsFlyerLibCore, Context context, boolean z) {
        super(appsFlyerLibCore);
        this.f22599 = z;
        this.f22594 = context;
        if (this.f22594 != null) {
            this.f22598 = context.getPackageName();
        } else {
            AFLogger.afWarnLog("CreateOneLinkHttpTask: context can't be null");
        }
        this.f22601 = str;
        this.f22597 = "-1";
        this.f22595 = map;
    }

    public void setListener(ResponseListener responseListener) {
        this.f22596 = responseListener;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final void mo23757(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        if (!this.f22599) {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setUseCaches(false);
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject(this.f22595);
            jSONObject.put("ttl", this.f22597);
            jSONObject.put("data", jSONObject2);
            httpsURLConnection.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
            dataOutputStream.writeBytes(jSONObject.toString());
            dataOutputStream.flush();
            dataOutputStream.close();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˎ */
    public final void mo23758(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                this.f22596.onResponse(jSONObject.optString((String) keys.next()));
            }
        } catch (JSONException e) {
            this.f22596.onResponseError("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ॱ */
    public final String mo23759() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append(Constants.URL_PATH_DELIMITER);
        sb.append(this.f22601);
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˋ */
    public final void mo23756() {
        LinkGenerator addParameters = new LinkGenerator(Constants.USER_INVITE_LINK_TYPE).setBaseURL(this.f22601, AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN), this.f22598).addParameter(Constants.URL_SITE_ID, this.f22598).addParameters(this.f22595);
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (string != null) {
            addParameters.setReferrerCustomerId(string);
        }
        this.f22596.onResponse(addParameters.generateLink());
    }
}
