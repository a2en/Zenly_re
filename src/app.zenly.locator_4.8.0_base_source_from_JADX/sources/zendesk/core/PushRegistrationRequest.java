package zendesk.core;

class PushRegistrationRequest {
    private final String deviceType = "android";
    private String identifier;
    private String locale;
    private String sdkGuid;
    private String tokenType;

    PushRegistrationRequest() {
    }

    /* access modifiers changed from: 0000 */
    public String getIdentifier() {
        return this.identifier;
    }

    /* access modifiers changed from: 0000 */
    public String getLocale() {
        return this.locale;
    }

    /* access modifiers changed from: 0000 */
    public String getSdkGuid() {
        return this.sdkGuid;
    }

    /* access modifiers changed from: 0000 */
    public String getTokenType() {
        return this.tokenType;
    }

    /* access modifiers changed from: 0000 */
    public void setIdentifier(String str) {
        this.identifier = str;
    }

    /* access modifiers changed from: 0000 */
    public void setLocale(String str) {
        this.locale = str;
    }

    /* access modifiers changed from: 0000 */
    public void setSdkGuid(String str) {
        this.sdkGuid = str;
    }

    /* access modifiers changed from: 0000 */
    public void setTokenType(String str) {
        this.tokenType = str;
    }
}
