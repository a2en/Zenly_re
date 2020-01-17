package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import retrofit2.Call;
import retrofit2.p427m.C13445a;
import retrofit2.p427m.C13456l;

public interface MetricsClient {
    @C13456l("/v1/sdk/metrics/business")
    Call<Void> postAnalytics(@C13445a ServerEventBatch serverEventBatch);

    @C13456l("/v1/sdk/metrics/operational")
    Call<Void> postOperationalMetrics(@C13445a Metrics metrics);
}
