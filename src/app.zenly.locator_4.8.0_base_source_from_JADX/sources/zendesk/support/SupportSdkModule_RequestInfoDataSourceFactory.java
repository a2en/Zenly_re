package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource;

public final class SupportSdkModule_RequestInfoDataSourceFactory implements Factory<LocalDataSource> {
    private final Provider<ExecutorService> backgroundThreadExecutorProvider;
    private final Provider<Executor> mainThreadExecutorProvider;
    private final SupportSdkModule module;
    private final Provider<SupportUiStorage> supportUiStorageProvider;

    public SupportSdkModule_RequestInfoDataSourceFactory(SupportSdkModule supportSdkModule, Provider<SupportUiStorage> provider, Provider<Executor> provider2, Provider<ExecutorService> provider3) {
        this.module = supportSdkModule;
        this.supportUiStorageProvider = provider;
        this.mainThreadExecutorProvider = provider2;
        this.backgroundThreadExecutorProvider = provider3;
    }

    public static Factory<LocalDataSource> create(SupportSdkModule supportSdkModule, Provider<SupportUiStorage> provider, Provider<Executor> provider2, Provider<ExecutorService> provider3) {
        return new SupportSdkModule_RequestInfoDataSourceFactory(supportSdkModule, provider, provider2, provider3);
    }

    public LocalDataSource get() {
        LocalDataSource requestInfoDataSource = this.module.requestInfoDataSource((SupportUiStorage) this.supportUiStorageProvider.get(), (Executor) this.mainThreadExecutorProvider.get(), (ExecutorService) this.backgroundThreadExecutorProvider.get());
        C12021c.m31671a(requestInfoDataSource, "Cannot return null from a non-@Nullable @Provides method");
        return requestInfoDataSource;
    }
}
