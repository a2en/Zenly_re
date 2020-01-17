package zendesk.core;

class ZendeskProviderStore implements ProviderStore {
    private final PushRegistrationProvider pushRegistrationProvider;
    private final UserProvider userProvider;

    ZendeskProviderStore(UserProvider userProvider2, PushRegistrationProvider pushRegistrationProvider2) {
        this.userProvider = userProvider2;
        this.pushRegistrationProvider = pushRegistrationProvider2;
    }

    public PushRegistrationProvider pushRegistrationProvider() {
        return this.pushRegistrationProvider;
    }

    public UserProvider userProvider() {
        return this.userProvider;
    }
}
