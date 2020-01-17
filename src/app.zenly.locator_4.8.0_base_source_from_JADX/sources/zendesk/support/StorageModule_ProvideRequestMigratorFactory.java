package zendesk.support;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class StorageModule_ProvideRequestMigratorFactory implements Factory<RequestMigrator> {
    private final Provider<Context> contextProvider;
    private final StorageModule module;

    public StorageModule_ProvideRequestMigratorFactory(StorageModule storageModule, Provider<Context> provider) {
        this.module = storageModule;
        this.contextProvider = provider;
    }

    public static Factory<RequestMigrator> create(StorageModule storageModule, Provider<Context> provider) {
        return new StorageModule_ProvideRequestMigratorFactory(storageModule, provider);
    }

    public RequestMigrator get() {
        RequestMigrator provideRequestMigrator = this.module.provideRequestMigrator((Context) this.contextProvider.get());
        C12021c.m31671a(provideRequestMigrator, "Cannot return null from a non-@Nullable @Provides method");
        return provideRequestMigrator;
    }
}
