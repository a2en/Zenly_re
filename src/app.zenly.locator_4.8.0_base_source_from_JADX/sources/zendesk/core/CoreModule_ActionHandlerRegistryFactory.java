package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_ActionHandlerRegistryFactory implements Factory<ActionHandlerRegistry> {
    private final CoreModule module;

    public CoreModule_ActionHandlerRegistryFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<ActionHandlerRegistry> create(CoreModule coreModule) {
        return new CoreModule_ActionHandlerRegistryFactory(coreModule);
    }

    public static ActionHandlerRegistry proxyActionHandlerRegistry(CoreModule coreModule) {
        return coreModule.actionHandlerRegistry();
    }

    public ActionHandlerRegistry get() {
        ActionHandlerRegistry actionHandlerRegistry = this.module.actionHandlerRegistry();
        C12021c.m31671a(actionHandlerRegistry, "Cannot return null from a non-@Nullable @Provides method");
        return actionHandlerRegistry;
    }
}
