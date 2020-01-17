package zendesk.support;

import dagger.MembersInjector;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.AuthenticationProvider;

public final class Support_MembersInjector implements MembersInjector<Support> {
    public static void injectActionHandlerRegistry(Support support, ActionHandlerRegistry actionHandlerRegistry) {
        support.actionHandlerRegistry = actionHandlerRegistry;
    }

    public static void injectAuthenticationProvider(Support support, AuthenticationProvider authenticationProvider) {
        support.authenticationProvider = authenticationProvider;
    }

    public static void injectBlipsProvider(Support support, SupportBlipsProvider supportBlipsProvider) {
        support.blipsProvider = supportBlipsProvider;
    }

    public static void injectProviderStore(Support support, ProviderStore providerStore) {
        support.providerStore = providerStore;
    }

    public static void injectRequestMigrator(Support support, Object obj) {
        support.requestMigrator = (RequestMigrator) obj;
    }

    public static void injectRequestProvider(Support support, RequestProvider requestProvider) {
        support.requestProvider = requestProvider;
    }

    public static void injectSupportModule(Support support, SupportModule supportModule) {
        support.supportModule = supportModule;
    }
}
