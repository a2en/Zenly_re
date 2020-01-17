package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class SupportApplicationModule_ProvidesZendeskTrackerFactory implements Factory<ZendeskTracker> {
    private final SupportApplicationModule module;

    public SupportApplicationModule_ProvidesZendeskTrackerFactory(SupportApplicationModule supportApplicationModule) {
        this.module = supportApplicationModule;
    }

    public static Factory<ZendeskTracker> create(SupportApplicationModule supportApplicationModule) {
        return new SupportApplicationModule_ProvidesZendeskTrackerFactory(supportApplicationModule);
    }

    public ZendeskTracker get() {
        ZendeskTracker providesZendeskTracker = this.module.providesZendeskTracker();
        C12021c.m31671a(providesZendeskTracker, "Cannot return null from a non-@Nullable @Provides method");
        return providesZendeskTracker;
    }
}
