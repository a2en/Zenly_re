package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvidesDiskLruStorageFactory implements Factory<BaseStorage> {
    private final Provider<File> fileProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvidesDiskLruStorageFactory(Provider<File> provider, Provider<Serializer> provider2) {
        this.fileProvider = provider;
        this.serializerProvider = provider2;
    }

    public static Factory<BaseStorage> create(Provider<File> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvidesDiskLruStorageFactory(provider, provider2);
    }

    public BaseStorage get() {
        BaseStorage providesDiskLruStorage = ZendeskStorageModule.providesDiskLruStorage((File) this.fileProvider.get(), (Serializer) this.serializerProvider.get());
        C12021c.m31671a(providesDiskLruStorage, "Cannot return null from a non-@Nullable @Provides method");
        return providesDiskLruStorage;
    }
}
