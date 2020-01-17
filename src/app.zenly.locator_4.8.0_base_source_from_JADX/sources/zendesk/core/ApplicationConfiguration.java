package zendesk.core;

public class ApplicationConfiguration {
    private String applicationId;
    private String oauthClientId;
    private String zendeskUrl;

    public ApplicationConfiguration(String str, String str2, String str3) {
        this.applicationId = str;
        this.zendeskUrl = str2;
        this.oauthClientId = str3;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ApplicationConfiguration.class != obj.getClass()) {
            return false;
        }
        ApplicationConfiguration applicationConfiguration = (ApplicationConfiguration) obj;
        String str = this.applicationId;
        if (str == null ? applicationConfiguration.applicationId != null : !str.equals(applicationConfiguration.applicationId)) {
            return false;
        }
        String str2 = this.zendeskUrl;
        if (str2 == null ? applicationConfiguration.zendeskUrl != null : !str2.equals(applicationConfiguration.zendeskUrl)) {
            return false;
        }
        String str3 = this.oauthClientId;
        String str4 = applicationConfiguration.oauthClientId;
        if (str3 != null) {
            z = str3.equals(str4);
        } else if (str4 != null) {
            z = false;
        }
        return z;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getOauthClientId() {
        return this.oauthClientId;
    }

    public String getZendeskUrl() {
        return this.zendeskUrl;
    }

    public int hashCode() {
        String str = this.applicationId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.zendeskUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.oauthClientId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }
}
