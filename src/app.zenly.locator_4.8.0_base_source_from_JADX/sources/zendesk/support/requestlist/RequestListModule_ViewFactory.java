package zendesk.support.requestlist;

import com.squareup.picasso.Picasso;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class RequestListModule_ViewFactory implements Factory<RequestListView> {
    private final RequestListModule module;
    private final Provider<Picasso> picassoProvider;

    public RequestListModule_ViewFactory(RequestListModule requestListModule, Provider<Picasso> provider) {
        this.module = requestListModule;
        this.picassoProvider = provider;
    }

    public static Factory<RequestListView> create(RequestListModule requestListModule, Provider<Picasso> provider) {
        return new RequestListModule_ViewFactory(requestListModule, provider);
    }

    public RequestListView get() {
        RequestListView view = this.module.view((Picasso) this.picassoProvider.get());
        C12021c.m31671a(view, "Cannot return null from a non-@Nullable @Provides method");
        return view;
    }
}
