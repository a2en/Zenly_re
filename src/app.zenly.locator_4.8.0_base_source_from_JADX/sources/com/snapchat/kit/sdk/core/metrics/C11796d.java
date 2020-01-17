package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.C11772a.C11780e;
import com.snapchat.kit.sdk.core.metrics.business.C11786a;
import com.snapchat.kit.sdk.core.metrics.business.C11794h;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.snapchat.kit.sdk.core.metrics.d */
public abstract class C11796d {
    /* renamed from: a */
    static ScheduledExecutorService m30971a() {
        return Executors.newSingleThreadScheduledExecutor();
    }

    /* renamed from: a */
    static C11772a<ServerEvent> m30969a(C11786a aVar, ScheduledExecutorService scheduledExecutorService) {
        C11772a<ServerEvent> aVar2 = new C11772a<>(aVar, scheduledExecutorService, 1);
        aVar2.mo34642a();
        return aVar2;
    }

    /* renamed from: a */
    static C11794h m30970a(SharedPreferences sharedPreferences) {
        C11794h hVar = new C11794h(sharedPreferences);
        hVar.mo34664a();
        return hVar;
    }

    /* renamed from: a */
    static MetricQueue<OpMetric> m30967a(C11780e eVar, ScheduledExecutorService scheduledExecutorService) {
        C11772a aVar = new C11772a(eVar, scheduledExecutorService, 1);
        aVar.mo34642a();
        return aVar;
    }

    /* renamed from: a */
    static MetricsClient m30968a(ClientFactory clientFactory) {
        return (MetricsClient) clientFactory.generateFingerprintedClient("https://api.snapkit.com", MetricsClient.class);
    }
}
