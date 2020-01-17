package zendesk.support;

import com.google.gson.C11125d;
import dagger.internal.C12021c;
import dagger.internal.Factory;

public final class SupportSdkModule_ProvidesFactory implements Factory<C11125d> {
    private final SupportSdkModule module;

    public SupportSdkModule_ProvidesFactory(SupportSdkModule supportSdkModule) {
        this.module = supportSdkModule;
    }

    public static Factory<C11125d> create(SupportSdkModule supportSdkModule) {
        return new SupportSdkModule_ProvidesFactory(supportSdkModule);
    }

    public C11125d get() {
        C11125d provides = this.module.provides();
        C12021c.m31671a(provides, "Cannot return null from a non-@Nullable @Provides method");
        return provides;
    }
}
