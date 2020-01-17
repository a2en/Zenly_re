package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.Locale;

public final class SupportApplicationModule_ProvideLocaleFactory implements Factory<Locale> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideLocaleFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static Factory<Locale> create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvideLocaleFactory(supportApplicationModule);
    }

    public Locale get() {
        Locale provideLocale = this.module.provideLocale();
        C12021c.m31671a(provideLocale, "Cannot return null from a non-@Nullable @Provides method");
        return provideLocale;
    }
}
