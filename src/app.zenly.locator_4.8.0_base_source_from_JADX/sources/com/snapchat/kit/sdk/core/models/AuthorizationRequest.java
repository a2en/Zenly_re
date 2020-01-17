package com.snapchat.kit.sdk.core.models;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.gson.C11125d;
import com.google.gson.p315j.C11256a;
import com.google.gson.p315j.C11258c;
import com.snapchat.kit.sdk.util.SnapConstants;
import java.io.Serializable;
import java.util.Objects;

public class AuthorizationRequest implements Serializable {
    @C11256a
    @C11258c("mClientId")
    private String mClientId;
    @C11256a
    @C11258c("mCodeChallenge")
    private String mCodeChallenge;
    @C11256a
    @C11258c("mCodeChallengeMethod")
    private String mCodeChallengeMethod;
    @C11256a
    @C11258c("mCodeVerifier")
    private String mCodeVerifier;
    @C11256a
    @C11258c("mRedirectUri")
    private String mRedirectUri;
    @C11256a
    @C11258c("mResponseType")
    private String mResponseType;
    @C11256a
    @C11258c("mScope")
    private String mScope;
    @C11256a
    @C11258c("mState")
    private String mState;

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (!Objects.equals(this.mResponseType, authorizationRequest.mResponseType) || !Objects.equals(this.mClientId, authorizationRequest.mClientId) || !Objects.equals(this.mScope, authorizationRequest.mScope) || !Objects.equals(this.mRedirectUri, authorizationRequest.mRedirectUri) || !Objects.equals(this.mState, authorizationRequest.mState) || !Objects.equals(this.mCodeVerifier, authorizationRequest.mCodeVerifier) || !Objects.equals(this.mCodeChallengeMethod, authorizationRequest.mCodeChallengeMethod) || !Objects.equals(this.mCodeChallenge, authorizationRequest.mCodeChallenge)) {
            z = false;
        }
        return z;
    }

    public String getCodeVerifier() {
        return this.mCodeVerifier;
    }

    public String getRedirectUri() {
        return this.mRedirectUri;
    }

    public String getResponseType() {
        return this.mResponseType;
    }

    public String getState() {
        return this.mState;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mResponseType, this.mClientId, this.mScope, this.mRedirectUri, this.mState, this.mCodeVerifier, this.mCodeChallengeMethod, this.mCodeChallenge});
    }

    public String toJson() {
        return new C11125d().mo32460a((Object) this);
    }

    public String toString() {
        return toJson();
    }

    public Uri toUri(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            str = "https://accounts.snapchat.com/accounts";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String str5 = "redirect_uri";
        String str6 = "scope";
        String str7 = "state";
        String str8 = "code_challenge_method";
        String str9 = "code_challenge";
        Builder appendQueryParameter = Uri.parse(sb.toString()).buildUpon().appendQueryParameter("response_type", this.mResponseType).appendQueryParameter(SnapConstants.CLIENT_ID, this.mClientId).appendQueryParameter(str5, this.mRedirectUri).appendQueryParameter(str6, this.mScope).appendQueryParameter(str7, this.mState).appendQueryParameter(str8, this.mCodeChallengeMethod).appendQueryParameter(str9, this.mCodeChallenge);
        if (!TextUtils.isEmpty(str3)) {
            appendQueryParameter.appendQueryParameter("package_name", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            appendQueryParameter.appendQueryParameter("source", str4);
        }
        appendQueryParameter.appendQueryParameter("kit_version", "1.1.4");
        appendQueryParameter.appendQueryParameter("link", this.mClientId);
        return appendQueryParameter.build();
    }

    public AuthorizationRequest withClientId(String str) {
        this.mClientId = str;
        return this;
    }

    public AuthorizationRequest withCodeChallenge(String str) {
        this.mCodeChallenge = str;
        return this;
    }

    public AuthorizationRequest withCodeChallengeMethod(String str) {
        this.mCodeChallengeMethod = str;
        return this;
    }

    public AuthorizationRequest withCodeVerifier(String str) {
        this.mCodeVerifier = str;
        return this;
    }

    public AuthorizationRequest withRedirectUri(String str) {
        this.mRedirectUri = str;
        return this;
    }

    public AuthorizationRequest withResponseType(String str) {
        this.mResponseType = str;
        return this;
    }

    public AuthorizationRequest withScope(String str) {
        this.mScope = str;
        return this;
    }

    public AuthorizationRequest withState(String str) {
        this.mState = str;
        return this;
    }
}
