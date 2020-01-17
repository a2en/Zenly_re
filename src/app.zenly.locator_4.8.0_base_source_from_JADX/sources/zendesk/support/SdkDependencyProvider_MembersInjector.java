package zendesk.support;

import dagger.MembersInjector;
import java.util.List;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;

public final class SdkDependencyProvider_MembersInjector implements MembersInjector<SdkDependencyProvider> {
    public static void injectActionHandlers(SdkDependencyProvider sdkDependencyProvider, List<ActionHandler> list) {
        sdkDependencyProvider.actionHandlers = list;
    }

    public static void injectRegistry(SdkDependencyProvider sdkDependencyProvider, ActionHandlerRegistry actionHandlerRegistry) {
        sdkDependencyProvider.registry = actionHandlerRegistry;
    }
}
