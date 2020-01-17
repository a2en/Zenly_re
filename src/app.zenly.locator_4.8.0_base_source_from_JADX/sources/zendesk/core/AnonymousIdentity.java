package zendesk.core;

public final class AnonymousIdentity implements Identity {
    private String email;
    private String name;
    private String sdkGuid;

    public static class Builder {
        /* access modifiers changed from: private */
        public String email;
        /* access modifiers changed from: private */
        public String name;

        public Identity build() {
            return new AnonymousIdentity(this);
        }

        public Builder withEmailIdentifier(String str) {
            this.email = str;
            return this;
        }

        public Builder withNameIdentifier(String str) {
            this.name = str;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousIdentity.class != obj.getClass()) {
            return false;
        }
        AnonymousIdentity anonymousIdentity = (AnonymousIdentity) obj;
        String str = this.email;
        if (str == null ? anonymousIdentity.email != null : !str.equals(anonymousIdentity.email)) {
            return false;
        }
        String str2 = this.name;
        String str3 = anonymousIdentity.name;
        return str2 == null ? str3 == null : str2.equals(str3);
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getSdkGuid() {
        return this.sdkGuid;
    }

    public int hashCode() {
        String str = this.email;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    /* access modifiers changed from: 0000 */
    public void setSdkGuid(String str) {
        this.sdkGuid = str;
    }

    public AnonymousIdentity() {
    }

    private AnonymousIdentity(Builder builder) {
        this.email = builder.email;
        this.name = builder.name;
    }
}
