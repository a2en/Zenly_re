package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;
import zendesk.support.SupportUiStorage;

public final class RequestModule_ProvidesPersistenceComponentFactory implements Factory<ComponentPersistence> {
    private final Provider<ExecutorService> executorServiceProvider;
    private final Provider<PersistenceQueue> queueProvider;
    private final Provider<SupportUiStorage> supportUiStorageProvider;

    public RequestModule_ProvidesPersistenceComponentFactory(Provider<SupportUiStorage> provider, Provider<PersistenceQueue> provider2, Provider<ExecutorService> provider3) {
        this.supportUiStorageProvider = provider;
        this.queueProvider = provider2;
        this.executorServiceProvider = provider3;
    }

    public static Factory<ComponentPersistence> create(Provider<SupportUiStorage> provider, Provider<PersistenceQueue> provider2, Provider<ExecutorService> provider3) {
        return new RequestModule_ProvidesPersistenceComponentFactory(provider, provider2, provider3);
    }

    public ComponentPersistence get() {
        ComponentPersistence providesPersistenceComponent = RequestModule.providesPersistenceComponent((SupportUiStorage) this.supportUiStorageProvider.get(), (PersistenceQueue) this.queueProvider.get(), (ExecutorService) this.executorServiceProvider.get());
        C12021c.m31671a(providesPersistenceComponent, "Cannot return null from a non-@Nullable @Provides method");
        return providesPersistenceComponent;
    }
}
