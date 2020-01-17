package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvidesCacheDirFactory implements Factory<File> {
    private final Provider<Context> contextProvider;

    public ZendeskStorageModule_ProvidesCacheDirFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<File> create(Provider<Context> provider) {
        return new ZendeskStorageModule_ProvidesCacheDirFactory(provider);
    }

    public File get() {
        File providesCacheDir = ZendeskStorageModule.providesCacheDir((Context) this.contextProvider.get());
        C12021c.m31671a(providesCacheDir, "Cannot return null from a non-@Nullable @Provides method");
        return providesCacheDir;
    }
}
