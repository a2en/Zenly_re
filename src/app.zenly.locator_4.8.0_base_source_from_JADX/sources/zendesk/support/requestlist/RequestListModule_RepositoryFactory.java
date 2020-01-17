package zendesk.support.requestlist;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import zendesk.support.RequestProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource;
import zendesk.support.requestlist.RequestInfoDataSource.Repository;

public final class RequestListModule_RepositoryFactory implements Factory<Repository> {
    private final Provider<ExecutorService> backgroundThreadExecutorProvider;
    private final Provider<LocalDataSource> localDataSourceProvider;
    private final Provider<Executor> mainThreadExecutorProvider;
    private final Provider<RequestProvider> requestProvider;
    private final Provider<SupportUiStorage> supportUiStorageProvider;

    public RequestListModule_RepositoryFactory(Provider<LocalDataSource> provider, Provider<SupportUiStorage> provider2, Provider<RequestProvider> provider3, Provider<Executor> provider4, Provider<ExecutorService> provider5) {
        this.localDataSourceProvider = provider;
        this.supportUiStorageProvider = provider2;
        this.requestProvider = provider3;
        this.mainThreadExecutorProvider = provider4;
        this.backgroundThreadExecutorProvider = provider5;
    }

    public static Factory<Repository> create(Provider<LocalDataSource> provider, Provider<SupportUiStorage> provider2, Provider<RequestProvider> provider3, Provider<Executor> provider4, Provider<ExecutorService> provider5) {
        RequestListModule_RepositoryFactory requestListModule_RepositoryFactory = new RequestListModule_RepositoryFactory(provider, provider2, provider3, provider4, provider5);
        return requestListModule_RepositoryFactory;
    }

    public Repository get() {
        Repository repository = RequestListModule.repository((LocalDataSource) this.localDataSourceProvider.get(), (SupportUiStorage) this.supportUiStorageProvider.get(), (RequestProvider) this.requestProvider.get(), (Executor) this.mainThreadExecutorProvider.get(), (ExecutorService) this.backgroundThreadExecutorProvider.get());
        C12021c.m31671a(repository, "Cannot return null from a non-@Nullable @Provides method");
        return repository;
    }
}
