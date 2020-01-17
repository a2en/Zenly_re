package com.appsflyer.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.OneLinkHttpTask;
import com.appsflyer.ServerConfigHandler;
import com.appsflyer.share.Constants;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.appsflyer.internal.y */
public final class C8802y extends OneLinkHttpTask {

    /* renamed from: ˊ */
    private static List<String> f22799 = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});

    /* renamed from: ˎ */
    public C8803a f22800;

    /* renamed from: ॱ */
    public String f22801;

    /* renamed from: com.appsflyer.internal.y$a */
    public interface C8803a {
        /* renamed from: ˊ */
        void mo23716(String str);

        /* renamed from: ˏ */
        void mo23717(Map<String, String> map);
    }

    public C8802y(Uri uri, AppsFlyerLibCore appsFlyerLibCore) {
        super(appsFlyerLibCore);
        if (!TextUtils.isEmpty(uri.getHost()) && !TextUtils.isEmpty(uri.getPath())) {
            boolean z = false;
            for (String contains : f22799) {
                if (uri.getHost().contains(contains)) {
                    z = true;
                }
            }
            String[] strArr = C8770g.f22701;
            if (strArr != null) {
                for (String str : strArr) {
                    if (uri.getHost().contains(str) && str != "") {
                        z = true;
                    }
                }
            }
            String[] split = uri.getPath().split(Constants.URL_PATH_DELIMITER);
            if (z && split.length == 3) {
                this.f22601 = split[1];
                this.f22801 = split[2];
            }
        }
    }

    /* renamed from: ˋ */
    public final void mo23757(HttpsURLConnection httpsURLConnection) throws JSONException, IOException {
        httpsURLConnection.setRequestMethod("GET");
    }

    /* renamed from: ˎ */
    public final void mo23758(String str) {
        try {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                hashMap.put(str2, jSONObject.optString(str2));
            }
            this.f22800.mo23717(hashMap);
        } catch (JSONException e) {
            this.f22800.mo23716("Can't parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: ॱ */
    public final String mo23759() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1"));
        sb.append(Constants.URL_PATH_DELIMITER);
        sb.append(this.f22601);
        sb.append("?id=");
        sb.append(this.f22801);
        return sb.toString();
    }

    /* renamed from: ˋ */
    public final void mo23756() {
        this.f22800.mo23716("Can't get one link data");
    }
}
