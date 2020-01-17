package com.android.volley.toolbox;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.http.AndroidHttpClient;
import android.os.Build.VERSION;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.appsflyer.share.Constants;
import java.io.File;

/* renamed from: com.android.volley.toolbox.n */
public class C8737n {
    /* renamed from: a */
    public static RequestQueue m20575a(Context context, C8721b bVar) {
        C8722c cVar;
        String str;
        if (bVar != null) {
            cVar = new C8722c(bVar);
        } else if (VERSION.SDK_INT >= 9) {
            cVar = new C8722c((C8721b) new HurlStack());
        } else {
            try {
                String packageName = context.getPackageName();
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
                StringBuilder sb = new StringBuilder();
                sb.append(packageName);
                sb.append(Constants.URL_PATH_DELIMITER);
                sb.append(packageInfo.versionCode);
                str = sb.toString();
            } catch (NameNotFoundException unused) {
                str = "volley/0";
            }
            cVar = new C8722c((HttpStack) new C8728f(AndroidHttpClient.newInstance(str)));
        }
        return m20574a(context, (Network) cVar);
    }

    /* renamed from: a */
    private static RequestQueue m20574a(Context context, Network network) {
        RequestQueue requestQueue = new RequestQueue(new C8725e(new File(context.getCacheDir(), "volley")), network);
        requestQueue.mo23549b();
        return requestQueue;
    }

    /* renamed from: a */
    public static RequestQueue m20573a(Context context) {
        return m20575a(context, (C8721b) null);
    }
}
