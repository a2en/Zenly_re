package zendesk.support;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SupportApplicationModule_ProvideMetadataFactory implements Factory<SupportSdkMetadata> {
    private final Provider<Context> contextProvider;
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvideMetadataFactory(SupportApplicationModule supportApplicationModule, Provider<Context> provider) {
        this.module = supportApplicationModule;
        this.contextProvider = provider;
    }

    public static Factory<SupportSdkMetadata> create(SupportApplicationModule supportApplicationModule, Provider<Context> provider) {
        return new SupportApplicationModule_ProvideMetadataFactory(supportApplicationModule, provider);
    }

    public SupportSdkMetadata get() {
        SupportSdkMetadata provideMetadata = this.module.provideMetadata((Context) this.contextProvider.get());
        C12021c.m31671a(provideMetadata, "Cannot return null from a non-@Nullable @Provides method");
        return provideMetadata;
    }
}
