package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory implements Factory<SharedPreferencesStorage> {
    private final Provider<Context> contextProvider;
    private final Provider<Serializer> serializerProvider;

    public ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(Provider<Context> provider, Provider<Serializer> provider2) {
        this.contextProvider = provider;
        this.serializerProvider = provider2;
    }

    public static Factory<SharedPreferencesStorage> create(Provider<Context> provider, Provider<Serializer> provider2) {
        return new ZendeskStorageModule_ProvideLegacyPushBaseStorageFactory(provider, provider2);
    }

    public SharedPreferencesStorage get() {
        SharedPreferencesStorage provideLegacyPushBaseStorage = ZendeskStorageModule.provideLegacyPushBaseStorage((Context) this.contextProvider.get(), (Serializer) this.serializerProvider.get());
        C12021c.m31671a(provideLegacyPushBaseStorage, "Cannot return null from a non-@Nullable @Provides method");
        return provideLegacyPushBaseStorage;
    }
}
