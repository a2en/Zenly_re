package zendesk.core;

public enum AuthenticationType {
    JWT("jwt"),
    ANONYMOUS("anonymous");
    
    private final String authenticationType;

    private AuthenticationType(String str) {
        this.authenticationType = str;
    }

    static AuthenticationType getAuthType(String str) {
        if (JWT.authenticationType.equals(str)) {
            return JWT;
        }
        if (ANONYMOUS.authenticationType.equals(str)) {
            return ANONYMOUS;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String getAuthenticationType() {
        return this.authenticationType;
    }
}
