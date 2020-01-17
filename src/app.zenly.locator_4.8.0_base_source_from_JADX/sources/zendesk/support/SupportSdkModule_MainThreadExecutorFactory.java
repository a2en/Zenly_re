package zendesk.support;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.Executor;

public final class SupportSdkModule_MainThreadExecutorFactory implements Factory<Executor> {
    private final SupportSdkModule module;

    public SupportSdkModule_MainThreadExecutorFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static Factory<Executor> create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_MainThreadExecutorFactory(supportSdkModule);
    }

    public Executor get() {
        Executor mainThreadExecutor = this.module.mainThreadExecutor();
        C12021c.m31671a(mainThreadExecutor, "Cannot return null from a non-@Nullable @Provides method");
        return mainThreadExecutor;
    }
}
