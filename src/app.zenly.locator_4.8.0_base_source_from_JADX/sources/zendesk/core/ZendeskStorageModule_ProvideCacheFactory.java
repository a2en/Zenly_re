package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;
import okhttp3.C13204g;

public final class ZendeskStorageModule_ProvideCacheFactory implements Factory<C13204g> {
    private final Provider<File> fileProvider;

    public ZendeskStorageModule_ProvideCacheFactory(Provider<File> provider) {
        this.fileProvider = provider;
    }

    public static Factory<C13204g> create(Provider<File> provider) {
        return new ZendeskStorageModule_ProvideCacheFactory(provider);
    }

    public C13204g get() {
        C13204g provideCache = ZendeskStorageModule.provideCache((File) this.fileProvider.get());
        C12021c.m31671a(provideCache, "Cannot return null from a non-@Nullable @Provides method");
        return provideCache;
    }
}
