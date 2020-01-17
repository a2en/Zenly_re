package com.appsflyer;

import com.appsflyer.internal.C8762b.C8763b.C8764a;
import com.appsflyer.internal.C8775l.C8776a;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService {
    public void onNewToken(String str) {
        super.onNewToken(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(str)));
            C8764a r2 = C8764a.m20718(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            C8764a aVar = new C8764a(currentTimeMillis, str);
            if (r2.mo23787(aVar.f22682, aVar.f22681)) {
                C8776a.m20739(getApplicationContext(), aVar.f22681);
            }
        }
    }
}
