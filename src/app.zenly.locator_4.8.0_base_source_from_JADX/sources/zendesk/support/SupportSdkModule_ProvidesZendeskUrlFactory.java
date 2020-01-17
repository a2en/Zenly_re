package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.ApplicationConfiguration;

public final class SupportSdkModule_ProvidesZendeskUrlFactory implements Factory<String> {
    private final Provider<ApplicationConfiguration> applicationConfigurationProvider;
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesZendeskUrlFactory(SupportSdkModule supportSdkModule, Provider<ApplicationConfiguration> provider) {
        this.module = supportSdkModule;
        this.applicationConfigurationProvider = provider;
    }

    public static Factory<String> create(SupportSdkModule supportSdkModule, Provider<ApplicationConfiguration> provider) {
        return new SupportSdkModule_ProvidesZendeskUrlFactory(supportSdkModule, provider);
    }

    public String get() {
        String providesZendeskUrl = this.module.providesZendeskUrl((ApplicationConfiguration) this.applicationConfigurationProvider.get());
        C12021c.m31671a(providesZendeskUrl, "Cannot return null from a non-@Nullable @Provides method");
        return providesZendeskUrl;
    }
}
