package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.C8695a;
import com.android.installreferrer.api.C8701c;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.appsflyer.AFLogger;
import java.util.HashMap;

/* renamed from: com.appsflyer.internal.f */
public final class C8769f implements InstallReferrerStateListener {

    /* renamed from: ˊ */
    private C8695a f22698;

    /* renamed from: ॱ */
    private C8774k f22699;

    public final void onInstallReferrerServiceDisconnected() {
        AFLogger.afDebugLog("Install Referrer service disconnected");
    }

    public final void onInstallReferrerSetupFinished(int i) {
        String str = "ReferrerClient: InstallReferrer is not ready";
        String str2 = "install";
        String str3 = "clk";
        String str4 = "val";
        String str5 = "err";
        HashMap hashMap = new HashMap();
        hashMap.put("code", String.valueOf(i));
        C8701c cVar = null;
        if (i != 0) {
            String str6 = "InstallReferrer not supported";
            if (i == 1) {
                AFLogger.afWarnLog(str6);
            } else if (i != 2) {
                AFLogger.afWarnLog("responseCode not found.");
            } else {
                AFLogger.afWarnLog(str6);
            }
        } else {
            try {
                AFLogger.afDebugLog("InstallReferrer connected");
                if (this.f22698.mo23482c()) {
                    cVar = this.f22698.mo23481b();
                    this.f22698.mo23479a();
                } else {
                    AFLogger.afWarnLog(str);
                    hashMap.put(str5, str);
                }
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                AFLogger.afWarnLog(sb.toString());
                hashMap.put(str5, th.getMessage());
            }
        }
        if (cVar != null) {
            try {
                if (cVar.mo23487b() != null) {
                    hashMap.put(str4, cVar.mo23487b());
                }
                hashMap.put(str3, Long.toString(cVar.mo23488c()));
                hashMap.put(str2, Long.toString(cVar.mo23486a()));
            } catch (Exception e) {
                e.printStackTrace();
                String str7 = "-1";
                hashMap.put(str4, str7);
                hashMap.put(str3, str7);
                hashMap.put(str2, str7);
            }
        }
        C8774k kVar = this.f22699;
        if (kVar != null) {
            kVar.onHandleReferrer(hashMap);
        }
    }

    /* renamed from: ˋ */
    public final void mo23789(Context context, C8774k kVar) {
        this.f22699 = kVar;
        try {
            this.f22698 = C8695a.m20457a(context).mo23483a();
            this.f22698.mo23480a((InstallReferrerStateListener) this);
        } catch (Throwable th) {
            AFLogger.afErrorLog("referrerClient -> startConnection", th);
        }
    }
}
