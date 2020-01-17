package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.List;
import javax.inject.Provider;
import zendesk.support.ZendeskDeepLinkParser.Module;

public final class SupportSdkModule_ProvidesDeepLinkParserFactory implements Factory<ZendeskDeepLinkParser> {
    private final SupportSdkModule module;
    private final Provider<List<Module>> parserModulesProvider;
    private final Provider<String> zendeskUrlProvider;

    public SupportSdkModule_ProvidesDeepLinkParserFactory(SupportSdkModule supportSdkModule, Provider<String> provider, Provider<List<Module>> provider2) {
        this.module = supportSdkModule;
        this.zendeskUrlProvider = provider;
        this.parserModulesProvider = provider2;
    }

    public static Factory<ZendeskDeepLinkParser> create(SupportSdkModule supportSdkModule, Provider<String> provider, Provider<List<Module>> provider2) {
        return new SupportSdkModule_ProvidesDeepLinkParserFactory(supportSdkModule, provider, provider2);
    }

    public ZendeskDeepLinkParser get() {
        ZendeskDeepLinkParser providesDeepLinkParser = this.module.providesDeepLinkParser((String) this.zendeskUrlProvider.get(), (List) this.parserModulesProvider.get());
        C12021c.m31671a(providesDeepLinkParser, "Cannot return null from a non-@Nullable @Provides method");
        return providesDeepLinkParser;
    }
}
