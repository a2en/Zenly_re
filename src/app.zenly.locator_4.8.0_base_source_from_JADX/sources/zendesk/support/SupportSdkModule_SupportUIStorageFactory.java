package zendesk.support;

import com.google.gson.C11125d;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import p333g.p369e.p370a.C12095a;

public final class SupportSdkModule_SupportUIStorageFactory implements Factory<SupportUiStorage> {
    private final Provider<C12095a> diskLruCacheProvider;
    private final Provider<C11125d> gsonProvider;
    private final SupportSdkModule module;

    public SupportSdkModule_SupportUIStorageFactory(SupportSdkModule supportSdkModule, Provider<C12095a> provider, Provider<C11125d> provider2) {
        this.module = supportSdkModule;
        this.diskLruCacheProvider = provider;
        this.gsonProvider = provider2;
    }

    public static Factory<SupportUiStorage> create(SupportSdkModule supportSdkModule, Provider<C12095a> provider, Provider<C11125d> provider2) {
        return new SupportSdkModule_SupportUIStorageFactory(supportSdkModule, provider, provider2);
    }

    public SupportUiStorage get() {
        SupportUiStorage supportUIStorage = this.module.supportUIStorage((C12095a) this.diskLruCacheProvider.get(), (C11125d) this.gsonProvider.get());
        C12021c.m31671a(supportUIStorage, "Cannot return null from a non-@Nullable @Provides method");
        return supportUIStorage;
    }
}
