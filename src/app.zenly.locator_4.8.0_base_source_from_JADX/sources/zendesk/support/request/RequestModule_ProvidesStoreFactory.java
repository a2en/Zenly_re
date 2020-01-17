package zendesk.support.request;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.List;
import javax.inject.Provider;
import zendesk.suas.C13621h;
import zendesk.suas.Store;

public final class RequestModule_ProvidesStoreFactory implements Factory<Store> {
    private final Provider<AsyncMiddleware> asyncMiddlewareProvider;
    private final Provider<List<C13621h>> reducersProvider;

    public RequestModule_ProvidesStoreFactory(Provider<List<C13621h>> provider, Provider<AsyncMiddleware> provider2) {
        this.reducersProvider = provider;
        this.asyncMiddlewareProvider = provider2;
    }

    public static Factory<Store> create(Provider<List<C13621h>> provider, Provider<AsyncMiddleware> provider2) {
        return new RequestModule_ProvidesStoreFactory(provider, provider2);
    }

    public Store get() {
        Store providesStore = RequestModule.providesStore((List) this.reducersProvider.get(), (AsyncMiddleware) this.asyncMiddlewareProvider.get());
        C12021c.m31671a(providesStore, "Cannot return null from a non-@Nullable @Provides method");
        return providesStore;
    }
}
