package zendesk.support.request;

import android.content.Context;
import com.squareup.picasso.Picasso;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.suas.Dispatcher;
import zendesk.support.ZendeskDeepLinkHelper;

public final class RequestModule_ProvidesMessageFactoryFactory implements Factory<CellFactory> {
    private final Provider<ActionFactory> actionFactoryProvider;
    private final Provider<Context> contextProvider;
    private final Provider<ZendeskDeepLinkHelper> deepLinkHelperProvider;
    private final Provider<Dispatcher> dispatcherProvider;
    private final RequestModule module;
    private final Provider<Picasso> picassoProvider;

    public RequestModule_ProvidesMessageFactoryFactory(RequestModule requestModule, Provider<Context> provider, Provider<Picasso> provider2, Provider<ActionFactory> provider3, Provider<Dispatcher> provider4, Provider<ZendeskDeepLinkHelper> provider5) {
        this.module = requestModule;
        this.contextProvider = provider;
        this.picassoProvider = provider2;
        this.actionFactoryProvider = provider3;
        this.dispatcherProvider = provider4;
        this.deepLinkHelperProvider = provider5;
    }

    public static Factory<CellFactory> create(RequestModule requestModule, Provider<Context> provider, Provider<Picasso> provider2, Provider<ActionFactory> provider3, Provider<Dispatcher> provider4, Provider<ZendeskDeepLinkHelper> provider5) {
        RequestModule_ProvidesMessageFactoryFactory requestModule_ProvidesMessageFactoryFactory = new RequestModule_ProvidesMessageFactoryFactory(requestModule, provider, provider2, provider3, provider4, provider5);
        return requestModule_ProvidesMessageFactoryFactory;
    }

    public CellFactory get() {
        CellFactory providesMessageFactory = this.module.providesMessageFactory((Context) this.contextProvider.get(), (Picasso) this.picassoProvider.get(), (ActionFactory) this.actionFactoryProvider.get(), (Dispatcher) this.dispatcherProvider.get(), (ZendeskDeepLinkHelper) this.deepLinkHelperProvider.get());
        C12021c.m31671a(providesMessageFactory, "Cannot return null from a non-@Nullable @Provides method");
        return providesMessageFactory;
    }
}
