package com.snapchat.kit.sdk.creative.api;

import android.content.Context;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.creative.p331c.C11825a;
import com.snapchat.kit.sdk.creative.p331c.C11827c;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SnapCreativeKitApi_Factory implements Factory<SnapCreativeKitApi> {
    private final Provider<String> clientIdProvider;
    private final Provider<Context> contextProvider;
    private final Provider<C11827c> creativeKitOpMetricsManagerProvider;
    private final Provider<C11825a> eventFactoryProvider;
    private final Provider<MetricQueue<ServerEvent>> eventQueueProvider;
    private final Provider<String> redirectUrlProvider;

    public SnapCreativeKitApi_Factory(Provider<Context> provider, Provider<String> provider2, Provider<String> provider3, Provider<C11827c> provider4, Provider<MetricQueue<ServerEvent>> provider5, Provider<C11825a> provider6) {
        this.contextProvider = provider;
        this.clientIdProvider = provider2;
        this.redirectUrlProvider = provider3;
        this.creativeKitOpMetricsManagerProvider = provider4;
        this.eventQueueProvider = provider5;
        this.eventFactoryProvider = provider6;
    }

    public static Factory<SnapCreativeKitApi> create(Provider<Context> provider, Provider<String> provider2, Provider<String> provider3, Provider<C11827c> provider4, Provider<MetricQueue<ServerEvent>> provider5, Provider<C11825a> provider6) {
        SnapCreativeKitApi_Factory snapCreativeKitApi_Factory = new SnapCreativeKitApi_Factory(provider, provider2, provider3, provider4, provider5, provider6);
        return snapCreativeKitApi_Factory;
    }

    public static SnapCreativeKitApi newSnapCreativeKitApi(Context context, String str, String str2, C11827c cVar, MetricQueue<ServerEvent> metricQueue, C11825a aVar) {
        SnapCreativeKitApi snapCreativeKitApi = new SnapCreativeKitApi(context, str, str2, cVar, metricQueue, aVar);
        return snapCreativeKitApi;
    }

    public SnapCreativeKitApi get() {
        SnapCreativeKitApi snapCreativeKitApi = new SnapCreativeKitApi((Context) this.contextProvider.get(), (String) this.clientIdProvider.get(), (String) this.redirectUrlProvider.get(), (C11827c) this.creativeKitOpMetricsManagerProvider.get(), (MetricQueue) this.eventQueueProvider.get(), (C11825a) this.eventFactoryProvider.get());
        return snapCreativeKitApi;
    }
}
