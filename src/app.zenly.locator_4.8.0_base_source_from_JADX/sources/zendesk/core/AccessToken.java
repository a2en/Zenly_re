package zendesk.core;

import com.google.gson.p315j.C11258c;

class AccessToken {
    private String accessToken;
    @C11258c("user_id")
    private String userId;

    AccessToken() {
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || AccessToken.class != obj.getClass()) {
            return false;
        }
        AccessToken accessToken2 = (AccessToken) obj;
        String str = this.accessToken;
        if (str == null ? accessToken2.accessToken != null : !str.equals(accessToken2.accessToken)) {
            return false;
        }
        String str2 = this.userId;
        String str3 = accessToken2.userId;
        if (str2 != null) {
            z = str2.equals(str3);
        } else if (str3 != null) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public String getAccessToken() {
        return this.accessToken;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.accessToken;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.userId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    AccessToken(String str, String str2) {
        this.accessToken = str;
        this.userId = str2;
    }
}
