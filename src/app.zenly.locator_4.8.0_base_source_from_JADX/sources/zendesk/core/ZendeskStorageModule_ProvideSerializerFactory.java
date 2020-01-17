package zendesk.core;

import com.google.gson.C11125d;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvideSerializerFactory implements Factory<Serializer> {
    private final Provider<C11125d> gsonProvider;

    public ZendeskStorageModule_ProvideSerializerFactory(Provider<C11125d> provider) {
        this.gsonProvider = provider;
    }

    public static Factory<Serializer> create(Provider<C11125d> provider) {
        return new ZendeskStorageModule_ProvideSerializerFactory(provider);
    }

    public Serializer get() {
        Serializer provideSerializer = ZendeskStorageModule.provideSerializer((C11125d) this.gsonProvider.get());
        C12021c.m31671a(provideSerializer, "Cannot return null from a non-@Nullable @Provides method");
        return provideSerializer;
    }
}
