package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.List;
import zendesk.core.ActionHandler;

public final class SupportSdkModule_ProvidesActionHandlersFactory implements Factory<List<ActionHandler>> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesActionHandlersFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static Factory<List<ActionHandler>> create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesActionHandlersFactory(supportSdkModule);
    }

    public List<ActionHandler> get() {
        List<ActionHandler> providesActionHandlers = this.module.providesActionHandlers();
        C12021c.m31671a(providesActionHandlers, "Cannot return null from a non-@Nullable @Provides method");
        return providesActionHandlers;
    }
}
