package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvidesDataDirFactory implements Factory<File> {
    private final Provider<Context> contextProvider;

    public ZendeskStorageModule_ProvidesDataDirFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<File> create(Provider<Context> provider) {
        return new ZendeskStorageModule_ProvidesDataDirFactory(provider);
    }

    public File get() {
        File providesDataDir = ZendeskStorageModule.providesDataDir((Context) this.contextProvider.get());
        C12021c.m31671a(providesDataDir, "Cannot return null from a non-@Nullable @Provides method");
        return providesDataDir;
    }
}
