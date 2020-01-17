package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory implements Factory<BaseStorage> {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(Provider<Context> provider, Provider<Serializer> provider2) {
        this.contextProvider = provider;
        this.serializerProvider = provider2;
    }

    public static Factory<BaseStorage> create(Provider<Context> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvideAdditionalSdkBaseStorageFactory(provider, provider2);
    }

    public BaseStorage get() {
        BaseStorage provideAdditionalSdkBaseStorage = ZendeskStorageModule.provideAdditionalSdkBaseStorage((Context) this.contextProvider.get(), (Serializer) this.serializerProvider.get());
        C12021c.m31671a(provideAdditionalSdkBaseStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideAdditionalSdkBaseStorage;
    }
}
