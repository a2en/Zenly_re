package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.List;
import zendesk.support.ZendeskDeepLinkParser.Module;

public final class SupportSdkModule_ProvidesParserModuleFactory implements Factory<List<Module>> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesParserModuleFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static Factory<List<Module>> create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesParserModuleFactory(supportSdkModule);
    }

    public List<Module> get() {
        List<Module> providesParserModule = this.module.providesParserModule();
        C12021c.m31671a(providesParserModule, "Cannot return null from a non-@Nullable @Provides method");
        return providesParserModule;
    }
}
