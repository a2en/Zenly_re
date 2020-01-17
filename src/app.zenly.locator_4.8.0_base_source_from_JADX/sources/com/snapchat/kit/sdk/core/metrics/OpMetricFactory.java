package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.model.CounterMetric;
import com.snapchat.kit.sdk.core.metrics.model.LevelMetric;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.TimerMetric;
import com.snapchat.kit.sdk.core.metrics.model.Timestamp;
import com.snapchat.kit.sdk.core.metrics.model.Timestamp.Builder;
import java.util.concurrent.TimeUnit;

public class OpMetricFactory {

    /* renamed from: a */
    private static final long f30510a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b */
    private static final int f30511b = ((int) TimeUnit.MILLISECONDS.toNanos(1));

    /* renamed from: a */
    private static Timestamp m30924a() {
        long currentTimeMillis = System.currentTimeMillis();
        return new Builder().seconds(Long.valueOf(currentTimeMillis / f30510a)).nanos(Integer.valueOf(((int) (currentTimeMillis % f30510a)) * f30511b)).build();
    }

    public static OpMetric createCount(String str, long j) {
        return new OpMetric.Builder().counter_metric(new CounterMetric.Builder().name(str).count(Long.valueOf(j)).timestamp(m30924a()).build()).build();
    }

    public static OpMetric createLevel(String str, long j) {
        return new OpMetric.Builder().level_metric(new LevelMetric.Builder().name(str).level(Long.valueOf(j)).timestamp(m30924a()).build()).build();
    }

    public static OpMetric createTimer(String str, long j) {
        return new OpMetric.Builder().timer_metric(new TimerMetric.Builder().name(str).latency_millis(Long.valueOf(j)).timestamp(m30924a()).build()).build();
    }
}
