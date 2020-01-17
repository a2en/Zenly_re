package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.io.File;
import javax.inject.Provider;

public final class ZendeskStorageModule_ProvidesBelvedereDirFactory implements Factory<File> {
    private final Provider<Context> contextProvider;

    public ZendeskStorageModule_ProvidesBelvedereDirFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<File> create(Provider<Context> provider) {
        return new ZendeskStorageModule_ProvidesBelvedereDirFactory(provider);
    }

    public File get() {
        File providesBelvedereDir = ZendeskStorageModule.providesBelvedereDir((Context) this.contextProvider.get());
        C12021c.m31671a(providesBelvedereDir, "Cannot return null from a non-@Nullable @Provides method");
        return providesBelvedereDir;
    }
}
