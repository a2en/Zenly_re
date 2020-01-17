package zendesk.core;

public interface ProviderStore {
    PushRegistrationProvider pushRegistrationProvider();

    UserProvider userProvider();
}
