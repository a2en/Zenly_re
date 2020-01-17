package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class CoreModule_GetSessionStorageFactory implements Factory<SessionStorage> {
    private final CoreModule module;

    public CoreModule_GetSessionStorageFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<SessionStorage> create(CoreModule coreModule) {
        return new CoreModule_GetSessionStorageFactory(coreModule);
    }

    public SessionStorage get() {
        SessionStorage sessionStorage = this.module.getSessionStorage();
        C12021c.m31671a(sessionStorage, "Cannot return null from a non-@Nullable @Provides method");
        return sessionStorage;
    }
}
