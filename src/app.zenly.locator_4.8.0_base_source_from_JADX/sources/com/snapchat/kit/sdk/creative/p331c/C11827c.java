package com.snapchat.kit.sdk.creative.p331c;

import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;

/* renamed from: com.snapchat.kit.sdk.creative.c.c */
public class C11827c {

    /* renamed from: b */
    private static final String f30609b = "1.1.4".replace('.', '_');

    /* renamed from: a */
    private final MetricQueue<OpMetric> f30610a;

    public C11827c(MetricQueue<OpMetric> metricQueue) {
        this.f30610a = metricQueue;
    }

    /* renamed from: a */
    public synchronized void mo34967a(String str, long j) {
        this.f30610a.push(OpMetricFactory.createCount(m31024a(str), j));
    }

    /* renamed from: b */
    public synchronized void mo34968b(String str, long j) {
        this.f30610a.push(OpMetricFactory.createTimer(m31024a(str), j));
    }

    /* renamed from: a */
    private static String m31024a(String str) {
        return String.format("%s:creative:%s", new Object[]{f30609b, str});
    }
}
