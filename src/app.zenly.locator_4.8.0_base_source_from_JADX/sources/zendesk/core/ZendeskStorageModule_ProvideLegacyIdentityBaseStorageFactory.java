package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory implements Factory<SharedPreferencesStorage> {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(Provider<Context> provider, Provider<Serializer> provider2) {
        this.contextProvider = provider;
        this.serializerProvider = provider2;
    }

    public static Factory<SharedPreferencesStorage> create(Provider<Context> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvideLegacyIdentityBaseStorageFactory(provider, provider2);
    }

    public SharedPreferencesStorage get() {
        SharedPreferencesStorage provideLegacyIdentityBaseStorage = ZendeskStorageModule.provideLegacyIdentityBaseStorage((Context) this.contextProvider.get(), (Serializer) this.serializerProvider.get());
        C12021c.m31671a(provideLegacyIdentityBaseStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideLegacyIdentityBaseStorage;
    }
}
