package zendesk.support.requestlist;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RequestListModule_PresenterFactory implements Factory<RequestListPresenter> {
    private final Provider<RequestListModel> modelProvider;
    private final Provider<RequestListView> viewProvider;

    public RequestListModule_PresenterFactory(Provider<RequestListView> provider, Provider<RequestListModel> provider2) {
        this.viewProvider = provider;
        this.modelProvider = provider2;
    }

    public static Factory<RequestListPresenter> create(Provider<RequestListView> provider, Provider<RequestListModel> provider2) {
        return new RequestListModule_PresenterFactory(provider, provider2);
    }

    public RequestListPresenter get() {
        RequestListPresenter presenter = RequestListModule.presenter((RequestListView) this.viewProvider.get(), (RequestListModel) this.modelProvider.get());
        C12021c.m31671a(presenter, "Cannot return null from a non-@Nullable @Provides method");
        return presenter;
    }
}
