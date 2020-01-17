package zendesk.core;

import dagger.internal.Factory;

public final class CoreModule_GetNetworkInfoProviderFactory implements Factory<NetworkInfoProvider> {
    public static NetworkInfoProvider proxyGetNetworkInfoProvider(CoreModule coreModule) {
        return coreModule.getNetworkInfoProvider();
    }
}
