package zendesk.support.request;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;
import zendesk.core.ActionHandlerRegistry;
import zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource;

public final class RequestModule_ProvidesConversationsUpdatesComponentFactory implements Factory<ComponentUpdateActionHandlers> {
    private final Provider<ActionHandlerRegistry> actionHandlerRegistryProvider;
    private final Provider<Context> contextProvider;
    private final Provider<LocalDataSource> requestInfoDataSourceProvider;

    public RequestModule_ProvidesConversationsUpdatesComponentFactory(Provider<Context> provider, Provider<ActionHandlerRegistry> provider2, Provider<LocalDataSource> provider3) {
        this.contextProvider = provider;
        this.actionHandlerRegistryProvider = provider2;
        this.requestInfoDataSourceProvider = provider3;
    }

    public static Factory<ComponentUpdateActionHandlers> create(Provider<Context> provider, Provider<ActionHandlerRegistry> provider2, Provider<LocalDataSource> provider3) {
        return new RequestModule_ProvidesConversationsUpdatesComponentFactory(provider, provider2, provider3);
    }

    public ComponentUpdateActionHandlers get() {
        ComponentUpdateActionHandlers providesConversationsUpdatesComponent = RequestModule.providesConversationsUpdatesComponent((Context) this.contextProvider.get(), (ActionHandlerRegistry) this.actionHandlerRegistryProvider.get(), (LocalDataSource) this.requestInfoDataSourceProvider.get());
        C12021c.m31671a(providesConversationsUpdatesComponent, "Cannot return null from a non-@Nullable @Provides method");
        return providesConversationsUpdatesComponent;
    }
}
