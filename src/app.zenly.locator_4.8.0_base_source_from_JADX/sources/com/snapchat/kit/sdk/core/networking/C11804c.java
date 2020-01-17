package com.snapchat.kit.sdk.core.networking;

import android.util.Log;
import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.core.controller.C11766a;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import okhttp3.C13331y.C13332a;
import okhttp3.Interceptor.Chain;

/* renamed from: com.snapchat.kit.sdk.core.networking.c */
public class C11804c extends C11806e {

    /* renamed from: d */
    private final Fingerprint f30575d;

    C11804c(OAuth2Manager oAuth2Manager, C11766a aVar, String str, Fingerprint fingerprint) {
        super(oAuth2Manager, aVar, str);
        this.f30575d = fingerprint;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13332a mo34940a(Chain chain) {
        C13332a a = super.mo34940a(chain);
        String a2 = this.f30575d.mo34945a();
        if (a2 == null) {
            Log.e("FingerprintInterceptor", "Could not generate fingerprint");
        } else {
            a.mo38403b("X-Snap-SDK-Client-Auth-Token", a2);
        }
        return a;
    }
}
