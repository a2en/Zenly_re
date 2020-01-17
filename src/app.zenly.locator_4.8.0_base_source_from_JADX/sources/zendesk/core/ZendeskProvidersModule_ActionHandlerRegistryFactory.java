package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class ZendeskProvidersModule_ActionHandlerRegistryFactory implements Factory<ActionHandlerRegistry> {
    private static final ZendeskProvidersModule_ActionHandlerRegistryFactory INSTANCE = new ZendeskProvidersModule_ActionHandlerRegistryFactory();

    public static Factory<ActionHandlerRegistry> create() {
        return INSTANCE;
    }

    public ActionHandlerRegistry get() {
        ActionHandlerRegistry actionHandlerRegistry = ZendeskProvidersModule.actionHandlerRegistry();
        C12021c.m31671a(actionHandlerRegistry, "Cannot return null from a non-@Nullable @Provides method");
        return actionHandlerRegistry;
    }
}
