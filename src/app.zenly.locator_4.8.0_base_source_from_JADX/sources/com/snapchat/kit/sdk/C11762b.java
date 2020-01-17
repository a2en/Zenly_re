package com.snapchat.kit.sdk;

import android.text.TextUtils;
import android.util.Base64;
import com.snapchat.kit.sdk.core.models.AuthorizationRequest;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.b */
class C11762b {

    /* renamed from: a */
    private static int f30473a = 32;

    /* renamed from: b */
    private static int f30474b = 32;

    /* renamed from: a */
    static AuthorizationRequest m30905a(String str, String str2, List<String> list) {
        String a = m30906a(f30474b);
        String a2 = m30907a(a);
        return new AuthorizationRequest().withResponseType("code").withClientId(str).withScope(TextUtils.join(" ", list)).withRedirectUri(str2).withCodeChallengeMethod("S256").withCodeVerifier(a).withCodeChallenge(a2).withState(m30906a(f30473a));
    }

    /* renamed from: a */
    private static String m30906a(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: a */
    private static String m30907a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("US-ASCII"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (Exception unused) {
            return str;
        }
    }
}
