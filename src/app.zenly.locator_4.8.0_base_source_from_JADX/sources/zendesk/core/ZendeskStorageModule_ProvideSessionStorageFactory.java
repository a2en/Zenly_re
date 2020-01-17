package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;
import okhttp3.C13204g;

public final class ZendeskStorageModule_ProvideSessionStorageFactory implements Factory<SessionStorage> {
    private final Provider<BaseStorage> additionalSdkStorageProvider;
    private final Provider<File> belvedereDirProvider;
    private final Provider<File> cacheDirProvider;
    private final Provider<C13204g> cacheProvider;
    private final Provider<File> dataDirProvider;
    private final Provider<IdentityStorage> identityStorageProvider;
    private final Provider<BaseStorage> mediaCacheProvider;

    public ZendeskStorageModule_ProvideSessionStorageFactory(Provider<IdentityStorage> provider, Provider<BaseStorage> provider2, Provider<BaseStorage> provider3, Provider<C13204g> provider4, Provider<File> provider5, Provider<File> provider6, Provider<File> provider7) {
        this.identityStorageProvider = provider;
        this.additionalSdkStorageProvider = provider2;
        this.mediaCacheProvider = provider3;
        this.cacheProvider = provider4;
        this.cacheDirProvider = provider5;
        this.dataDirProvider = provider6;
        this.belvedereDirProvider = provider7;
    }

    public static Factory<SessionStorage> create(Provider<IdentityStorage> provider, Provider<BaseStorage> provider2, Provider<BaseStorage> provider3, Provider<C13204g> provider4, Provider<File> provider5, Provider<File> provider6, Provider<File> provider7) {
        ZendeskStorageModule_ProvideSessionStorageFactory zendeskStorageModule_ProvideSessionStorageFactory = new ZendeskStorageModule_ProvideSessionStorageFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
        return zendeskStorageModule_ProvideSessionStorageFactory;
    }

    public SessionStorage get() {
        SessionStorage provideSessionStorage = ZendeskStorageModule.provideSessionStorage((IdentityStorage) this.identityStorageProvider.get(), (BaseStorage) this.additionalSdkStorageProvider.get(), (BaseStorage) this.mediaCacheProvider.get(), (C13204g) this.cacheProvider.get(), (File) this.cacheDirProvider.get(), (File) this.dataDirProvider.get(), (File) this.belvedereDirProvider.get());
        C12021c.m31671a(provideSessionStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideSessionStorage;
    }
}
