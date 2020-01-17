package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.ActionHandlerRegistry;

public final class SupportSdkModule_ProvidesDeepLinkHelperFactory implements Factory<ZendeskDeepLinkHelper> {
    private final SupportSdkModule module;
    private final Provider<ZendeskDeepLinkParser> parserProvider;
    private final Provider<ActionHandlerRegistry> registryProvider;

    public SupportSdkModule_ProvidesDeepLinkHelperFactory(SupportSdkModule supportSdkModule, Provider<ActionHandlerRegistry> provider, Provider<ZendeskDeepLinkParser> provider2) {
        this.module = supportSdkModule;
        this.registryProvider = provider;
        this.parserProvider = provider2;
    }

    public static Factory<ZendeskDeepLinkHelper> create(SupportSdkModule supportSdkModule, Provider<ActionHandlerRegistry> provider, Provider<ZendeskDeepLinkParser> provider2) {
        return new SupportSdkModule_ProvidesDeepLinkHelperFactory(supportSdkModule, provider, provider2);
    }

    public ZendeskDeepLinkHelper get() {
        ZendeskDeepLinkHelper providesDeepLinkHelper = this.module.providesDeepLinkHelper((ActionHandlerRegistry) this.registryProvider.get(), (ZendeskDeepLinkParser) this.parserProvider.get());
        C12021c.m31671a(providesDeepLinkHelper, "Cannot return null from a non-@Nullable @Provides method");
        return providesDeepLinkHelper;
    }
}
