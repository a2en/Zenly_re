package zendesk.support.requestlist;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RequestListModule_RefreshHandlerFactory implements Factory<RequestListSyncHandler> {
    private final Provider<RequestListPresenter> presenterProvider;

    public RequestListModule_RefreshHandlerFactory(Provider<RequestListPresenter> provider) {
        this.presenterProvider = provider;
    }

    public static Factory<RequestListSyncHandler> create(Provider<RequestListPresenter> provider) {
        return new RequestListModule_RefreshHandlerFactory(provider);
    }

    public RequestListSyncHandler get() {
        RequestListSyncHandler refreshHandler = RequestListModule.refreshHandler((RequestListPresenter) this.presenterProvider.get());
        C12021c.m31671a(refreshHandler, "Cannot return null from a non-@Nullable @Provides method");
        return refreshHandler;
    }
}
