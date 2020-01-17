package com.snapchat.kit.sdk.core.metrics;

import java.util.List;

public interface MetricPublisher<T> {

    public interface PublishCallback {
        void onNetworkError();

        void onServerError(Error error);

        void onSuccess();
    }

    List<C11795c<T>> getPersistedEvents();

    void persistMetrics(List<C11795c<T>> list);

    void publishMetrics(List<T> list, PublishCallback publishCallback);
}
