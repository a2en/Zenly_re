package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.suas.Dispatcher;
import zendesk.suas.Store;

public final class RequestModule_ProvidesDispatcherFactory implements Factory<Dispatcher> {
    private final Provider<Store> storeProvider;

    public RequestModule_ProvidesDispatcherFactory(Provider<Store> provider) {
        this.storeProvider = provider;
    }

    public static Factory<Dispatcher> create(Provider<Store> provider) {
        return new RequestModule_ProvidesDispatcherFactory(provider);
    }

    public Dispatcher get() {
        Store store = (Store) this.storeProvider.get();
        RequestModule.providesDispatcher(store);
        C12021c.m31671a(store, "Cannot return null from a non-@Nullable @Provides method");
        return store;
    }
}
