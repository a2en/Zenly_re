package com.appsflyer;

import com.appsflyer.internal.C8762b.C8763b.C8764a;
import com.appsflyer.internal.C8775l.C8776a;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

@Deprecated
public class FirebaseInstanceIdListener extends FirebaseInstanceIdService {
    public void onTokenRefresh() {
        String str;
        super.onTokenRefresh();
        AFLogger.afInfoLog("FirebaseInstanceIdService is deprecated in firebase-messaging:v17.1.0 .");
        AFLogger.afInfoLog("When using v17.1.0 or newer, please use com.appsflyer.FirebaseMessagingServiceListener instead of FirebaseInstanceIdListener");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            str = FirebaseInstanceId.getInstance().getToken();
        } catch (Throwable th) {
            AFLogger.afErrorLog("Error registering for uninstall tracking", th);
            str = null;
        }
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            C8764a r3 = C8764a.m20718(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            C8764a aVar = new C8764a(currentTimeMillis, str);
            if (r3.mo23787(aVar.f22682, aVar.f22681)) {
                C8776a.m20739(getApplicationContext(), aVar.f22681);
            }
        }
    }
}
