package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvidePushDeviceIdStorageFactory implements Factory<PushDeviceIdStorage> {
    private final Provider<BaseStorage> additionalSdkStorageProvider;

    public ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(Provider<BaseStorage> provider) {
        this.additionalSdkStorageProvider = provider;
    }

    public static Factory<PushDeviceIdStorage> create(Provider<BaseStorage> provider) {
        return new ZendeskStorageModule_ProvidePushDeviceIdStorageFactory(provider);
    }

    public PushDeviceIdStorage get() {
        PushDeviceIdStorage providePushDeviceIdStorage = ZendeskStorageModule.providePushDeviceIdStorage((BaseStorage) this.additionalSdkStorageProvider.get());
        C12021c.m31671a(providePushDeviceIdStorage, "Cannot return null from a non-@Nullable @Provides method");
        return providePushDeviceIdStorage;
    }
}
