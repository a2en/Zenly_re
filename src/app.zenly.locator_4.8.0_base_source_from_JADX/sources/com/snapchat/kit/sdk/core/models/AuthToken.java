package com.snapchat.kit.sdk.core.models;

import com.google.gson.C11125d;
import com.google.gson.p315j.C11256a;
import com.google.gson.p315j.C11258c;
import java.io.Serializable;
import java.util.Objects;

public class AuthToken implements Serializable {
    @C11256a
    @C11258c("access_token")
    private String mAccessToken;
    @C11256a
    @C11258c("expires_in")
    private long mExpiresIn;
    @C11256a
    @C11258c("last_updated")
    private long mLastUpdated;
    @C11256a
    @C11258c("refresh_token")
    private String mRefreshToken;
    @C11256a
    @C11258c("scope")
    private String mScope;
    @C11256a
    @C11258c("token_type")
    private String mTokenType;

    public AuthToken(String str, String str2) {
        this.mAccessToken = str;
        this.mScope = str2;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthToken)) {
            return false;
        }
        AuthToken authToken = (AuthToken) obj;
        if (!Objects.equals(this.mAccessToken, authToken.mAccessToken) || !Objects.equals(this.mTokenType, authToken.mTokenType) || !Objects.equals(this.mRefreshToken, authToken.mRefreshToken) || !Objects.equals(Long.valueOf(this.mExpiresIn), Long.valueOf(authToken.mExpiresIn)) || !Objects.equals(Long.valueOf(this.mLastUpdated), Long.valueOf(authToken.mLastUpdated))) {
            z = false;
        }
        return z;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public long getExpiresIn() {
        return this.mExpiresIn;
    }

    public long getExpiresInMillis() {
        return this.mExpiresIn * 1000;
    }

    public long getLastUpdated() {
        return this.mLastUpdated;
    }

    public String getRefreshToken() {
        return this.mRefreshToken;
    }

    public String getScope() {
        return this.mScope;
    }

    public String getTokenType() {
        return this.mTokenType;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.mAccessToken, this.mTokenType, this.mRefreshToken, Long.valueOf(this.mExpiresIn), Long.valueOf(this.mLastUpdated)});
    }

    public void setLastUpdated(long j) {
        this.mLastUpdated = j;
    }

    public void setRefreshToken(String str) {
        this.mRefreshToken = str;
    }

    public String toJson() {
        return new C11125d().mo32460a((Object) this);
    }

    public String toString() {
        return toJson();
    }
}
