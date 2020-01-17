package com.snapchat.kit.sdk.p329a;

import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.OpMetricFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import dagger.Lazy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.snapchat.kit.sdk.a.a */
public class C11760a {

    /* renamed from: a */
    private final Lazy<MetricQueue<OpMetric>> f30467a;

    /* renamed from: b */
    private final Map<C11761a, Long> f30468b = new ConcurrentHashMap();

    /* renamed from: com.snapchat.kit.sdk.a.a$a */
    public enum C11761a {
        REVOKE,
        REFRESH,
        GRANT
    }

    public C11760a(Lazy<MetricQueue<OpMetric>> lazy) {
        this.f30467a = lazy;
    }

    /* renamed from: b */
    private String m30898b(C11761a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString().toLowerCase());
        sb.append("TokenLatency");
        return m30899b(sb.toString());
    }

    /* renamed from: c */
    private static String m30900c(C11761a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString().toLowerCase());
        sb.append("TokenFailure");
        return m30899b(sb.toString());
    }

    /* renamed from: d */
    private static String m30901d(C11761a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.toString().toLowerCase());
        sb.append("TokenRequest");
        return m30899b(sb.toString());
    }

    /* renamed from: a */
    public synchronized void mo34613a(String str) {
        ((MetricQueue) this.f30467a.get()).push(OpMetricFactory.createCount(m30899b(str), 1));
    }

    /* renamed from: b */
    private static String m30899b(String str) {
        return String.format("%s:login:%s", new Object[]{"1.1.4".replace('.', '_'), str});
    }

    /* renamed from: a */
    public synchronized void mo34611a(C11761a aVar) {
        ((MetricQueue) this.f30467a.get()).push(OpMetricFactory.createCount(m30901d(aVar), 1));
        this.f30468b.put(aVar, Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public synchronized void mo34612a(C11761a aVar, boolean z) {
        MetricQueue metricQueue = (MetricQueue) this.f30467a.get();
        if (z) {
            Long l = (Long) this.f30468b.remove(aVar);
            if (l != null) {
                metricQueue.push(OpMetricFactory.createTimer(m30898b(aVar), System.currentTimeMillis() - l.longValue()));
            }
        } else {
            metricQueue.push(OpMetricFactory.createCount(m30900c(aVar), 1));
        }
    }
}
