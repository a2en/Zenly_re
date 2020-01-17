package zendesk.core;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ExecutorService;

public final class ZendeskApplicationModule_ProvideExecutorFactory implements Factory<ExecutorService> {
    private static final ZendeskApplicationModule_ProvideExecutorFactory INSTANCE = new ZendeskApplicationModule_ProvideExecutorFactory();

    public static Factory<ExecutorService> create() {
        return INSTANCE;
    }

    public ExecutorService get() {
        ExecutorService provideExecutor = ZendeskApplicationModule.provideExecutor();
        C12021c.m31671a(provideExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return provideExecutor;
    }
}
