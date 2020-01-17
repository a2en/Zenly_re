package zendesk.core;

class ZendeskAuthenticationProvider implements AuthenticationProvider {
    private final IdentityManager identityManager;

    ZendeskAuthenticationProvider(IdentityManager identityManager2) {
        this.identityManager = identityManager2;
    }

    public Identity getIdentity() {
        return this.identityManager.getIdentity();
    }
}
