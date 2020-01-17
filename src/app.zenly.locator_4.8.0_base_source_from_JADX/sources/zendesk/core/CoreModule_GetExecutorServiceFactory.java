package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;

public final class CoreModule_GetExecutorServiceFactory implements Factory<ExecutorService> {
    private final CoreModule module;

    public CoreModule_GetExecutorServiceFactory(CoreModule coreModule) {
        this.module = coreModule;
    }

    public static Factory<ExecutorService> create(CoreModule coreModule) {
        return new CoreModule_GetExecutorServiceFactory(coreModule);
    }

    public ExecutorService get() {
        ExecutorService executorService = this.module.getExecutorService();
        C12021c.m31671a(executorService, "Cannot return null from a non-@Nullable @Provides method");
        return executorService;
    }
}
