package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

public final class RequestModule_ProvidesDiskQueueFactory implements Factory<PersistenceQueue> {
    private final Provider<ExecutorService> executorServiceProvider;

    public RequestModule_ProvidesDiskQueueFactory(Provider<ExecutorService> provider) {
        this.executorServiceProvider = provider;
    }

    public static Factory<PersistenceQueue> create(Provider<ExecutorService> provider) {
        return new RequestModule_ProvidesDiskQueueFactory(provider);
    }

    public PersistenceQueue get() {
        PersistenceQueue providesDiskQueue = RequestModule.providesDiskQueue((ExecutorService) this.executorServiceProvider.get());
        C12021c.m31671a(providesDiskQueue, "Cannot return null from a non-@Nullable @Provides method");
        return providesDiskQueue;
    }
}
