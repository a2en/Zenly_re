package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskApplicationModule_ProvideBase64SerializerFactory implements Factory<Serializer> {
    private final Provider<Serializer> gsonSerializerProvider;
    private final ZendeskApplicationModule module;

    public ZendeskApplicationModule_ProvideBase64SerializerFactory(ZendeskApplicationModule zendeskApplicationModule, Provider<Serializer> provider) {
        this.module = zendeskApplicationModule;
        this.gsonSerializerProvider = provider;
    }

    public static Factory<Serializer> create(ZendeskApplicationModule zendeskApplicationModule, Provider<Serializer> provider) {
        return new ZendeskApplicationModule_ProvideBase64SerializerFactory(zendeskApplicationModule, provider);
    }

    public Serializer get() {
        Serializer provideBase64Serializer = this.module.provideBase64Serializer((Serializer) this.gsonSerializerProvider.get());
        C12021c.m31671a(provideBase64Serializer, "Cannot return null from a non-@Nullable @Provides method");
        return provideBase64Serializer;
    }
}
