package zendesk.core;

import android.content.Context;
import dagger.internal.C12021c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ZendeskApplicationModule_ProvideDeviceInfoFactory implements Factory<DeviceInfo> {
    private final Provider<Context> contextProvider;

    public ZendeskApplicationModule_ProvideDeviceInfoFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static Factory<DeviceInfo> create(Provider<Context> provider) {
        return new ZendeskApplicationModule_ProvideDeviceInfoFactory(provider);
    }

    public DeviceInfo get() {
        DeviceInfo provideDeviceInfo = ZendeskApplicationModule.provideDeviceInfo((Context) this.contextProvider.get());
        C12021c.m31671a(provideDeviceInfo, "Cannot return null from a non-@Nullable @Provides method");
        return provideDeviceInfo;
    }
}
