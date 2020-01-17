package com.snapchat.kit.sdk.core.networking;

import android.text.TextUtils;
import com.google.gson.C11125d;
import com.snapchat.kit.sdk.OAuth2Manager;
import com.snapchat.kit.sdk.OAuth2Manager.OnTokenRefreshCallback;
import com.snapchat.kit.sdk.core.controller.C11766a;
import com.snapchat.kit.sdk.core.models.TokenErrorResponse;
import java.io.IOException;
import java.util.UUID;
import okhttp3.C13167a0;
import okhttp3.C13331y.C13332a;
import okhttp3.Interceptor;
import okhttp3.Interceptor.Chain;

/* renamed from: com.snapchat.kit.sdk.core.networking.e */
public class C11806e implements Interceptor {

    /* renamed from: a */
    private final OAuth2Manager f30580a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11766a f30581b;

    /* renamed from: c */
    private final String f30582c;

    /* renamed from: com.snapchat.kit.sdk.core.networking.e$a */
    class C11807a implements OnTokenRefreshCallback {
        C11807a() {
        }

        public void onTokenRefreshFailed(boolean z) {
            if (z) {
                C11806e.this.f30581b.mo34624a();
            }
        }

        public void onTokenRefreshSucceeded(boolean z) {
        }
    }

    C11806e(OAuth2Manager oAuth2Manager, C11766a aVar, String str) {
        this.f30580a = oAuth2Manager;
        this.f30581b = aVar;
        this.f30582c = str;
    }

    /* renamed from: b */
    private boolean m30991b(TokenErrorResponse tokenErrorResponse) {
        return tokenErrorResponse != null && !TextUtils.isEmpty(tokenErrorResponse.getError()) && TextUtils.equals(tokenErrorResponse.getError().toLowerCase(), "force_logout");
    }

    public C13167a0 intercept(Chain chain) throws IOException {
        this.f30580a.mo34577a(false);
        C13167a0 proceed = chain.proceed(mo34940a(chain).mo38400a());
        if (!(proceed == null || proceed.mo37789a() == null || proceed.mo37793d() != 401)) {
            TokenErrorResponse tokenErrorResponse = (TokenErrorResponse) new C11125d().mo32455a(proceed.mo37789a().mo37825c(), TokenErrorResponse.class);
            if (m30990a(tokenErrorResponse)) {
                this.f30580a.mo34578a(true, (OnTokenRefreshCallback) new C11807a());
            } else if (m30991b(tokenErrorResponse)) {
                this.f30580a.mo34572a();
                this.f30581b.mo34624a();
            }
        }
        return proceed;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C13332a mo34940a(Chain chain) {
        C13332a f = chain.request().mo38388f();
        f.mo38403b("User-Agent", C11803b.f30574a);
        StringBuilder sb = new StringBuilder();
        sb.append("Bearer ");
        sb.append(this.f30580a.mo34581b());
        f.mo38403b("authorization", sb.toString());
        f.mo38403b("X-Snap-SDK-OAuth-Client-Id", this.f30582c);
        f.mo38403b("X-Cloud-Trace-Context", String.format("%s/0;o=1", new Object[]{m30989a()}));
        f.mo38403b("X-SnapKit-Core-Version", "1.1.4");
        return f;
    }

    /* renamed from: a */
    private synchronized String m30989a() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /* renamed from: a */
    private boolean m30990a(TokenErrorResponse tokenErrorResponse) {
        return tokenErrorResponse != null && !TextUtils.isEmpty(tokenErrorResponse.getError()) && TextUtils.equals(tokenErrorResponse.getError().toLowerCase(), "invalid_token");
    }
}
