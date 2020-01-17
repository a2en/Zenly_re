package zendesk.support;

import android.annotation.SuppressLint;
import java.util.List;
import java.util.UUID;
import zendesk.core.ActionHandler;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.Zendesk;
import zendesk.support.DaggerSupportSdkComponent.Builder;

public enum SdkDependencyProvider {
    INSTANCE;
    
    List<ActionHandler> actionHandlers;

    /* renamed from: id */
    private UUID f35199id;
    ActionHandlerRegistry registry;
    private SupportSdkComponent supportSdkComponent;

    private void registerActionHandlers() {
        for (ActionHandler add : this.actionHandlers) {
            this.registry.add(add);
        }
    }

    public boolean isInitialized() {
        return Zendesk.INSTANCE.isInitialized() && Support.INSTANCE.isInitialized() && Support.INSTANCE.isAuthenticated();
    }

    @SuppressLint({"RestrictedApi"})
    public SupportSdkComponent provideSupportSdkComponent() {
        SupportModule supportModule = Support.INSTANCE.getSupportModule();
        UUID id = supportModule.getId();
        if (this.supportSdkComponent == null || !id.equals(this.f35199id)) {
            SupportSdkModule supportSdkModule = new SupportSdkModule();
            Builder builder = DaggerSupportSdkComponent.builder();
            builder.coreModule(Zendesk.INSTANCE.coreModule());
            builder.supportModule(supportModule);
            builder.supportSdkModule(supportSdkModule);
            this.supportSdkComponent = builder.build();
            this.f35199id = supportModule.getId();
            this.supportSdkComponent.inject(this);
            registerActionHandlers();
        }
        return this.supportSdkComponent;
    }
}
