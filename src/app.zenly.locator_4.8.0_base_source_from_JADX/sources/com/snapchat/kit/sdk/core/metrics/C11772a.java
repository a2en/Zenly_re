package com.snapchat.kit.sdk.core.metrics;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import com.snapchat.kit.sdk.core.metrics.model.CounterMetric;
import com.snapchat.kit.sdk.core.metrics.model.LevelMetric;
import com.snapchat.kit.sdk.core.metrics.model.Metrics;
import com.snapchat.kit.sdk.core.metrics.model.Metrics.Builder;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.TimerMetric;
import com.snapchat.kit.sdk.core.metrics.p330b.C11783a;
import dagger.internal.Factory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Provider;
import retrofit2.C13429h;
import retrofit2.Call;
import retrofit2.Callback;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a */
public class C11772a<T> implements MetricQueue<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MetricPublisher<T> f30512a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f30513b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LinkedHashSet<C11795c<T>> f30514c = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final LinkedHashSet<C11795c<T>> f30515d = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicReference<Future<?>> f30516e = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f30517f;

    /* renamed from: g */
    final Runnable f30518g = new C11773a();

    /* renamed from: com.snapchat.kit.sdk.core.metrics.a$a */
    class C11773a implements Runnable {
        C11773a() {
        }

        public void run() {
            C11772a.this.mo34643b();
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.metrics.a$b */
    class C11774b implements Runnable {
        C11774b() {
        }

        public void run() {
            List persistedEvents = C11772a.this.f30512a.getPersistedEvents();
            if (persistedEvents != null && !persistedEvents.isEmpty()) {
                C11772a.this.f30514c.addAll(persistedEvents);
                C11772a.this.f30516e.set(C11772a.this.f30513b.schedule(C11772a.this.f30518g, 1000, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.metrics.a$c */
    class C11775c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Object f30521e;

        C11775c(Object obj) {
            this.f30521e = obj;
        }

        public void run() {
            C11772a.this.f30514c.add(new C11795c(this.f30521e));
            C11772a.this.m30929c();
            if (C11772a.this.f30514c.size() >= C11772a.this.f30517f) {
                C11772a.this.mo34643b();
            } else if (C11772a.this.f30516e.get() == null) {
                C11772a.this.f30516e.set(C11772a.this.f30513b.schedule(C11772a.this.f30518g, 30000, TimeUnit.MILLISECONDS));
            }
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.metrics.a$d */
    class C11776d implements PublishCallback {

        /* renamed from: a */
        final /* synthetic */ List f30523a;

        /* renamed from: com.snapchat.kit.sdk.core.metrics.a$d$a */
        class C11777a implements Runnable {
            C11777a() {
            }

            public void run() {
                C11772a.this.f30515d.removeAll(C11776d.this.f30523a);
                C11772a.this.m30929c();
            }
        }

        /* renamed from: com.snapchat.kit.sdk.core.metrics.a$d$b */
        class C11778b implements Runnable {
            C11778b() {
            }

            public void run() {
                C11772a.this.f30515d.removeAll(C11776d.this.f30523a);
                C11772a.this.f30514c.addAll(C11776d.this.f30523a);
            }
        }

        /* renamed from: com.snapchat.kit.sdk.core.metrics.a$d$c */
        class C11779c implements Runnable {
            C11779c(Error error) {
            }

            public void run() {
                C11772a.this.f30515d.removeAll(C11776d.this.f30523a);
                for (C11795c cVar : C11776d.this.f30523a) {
                    if (cVar.mo34668b() < 1) {
                        cVar.mo34667a();
                        C11772a.this.f30514c.add(cVar);
                    }
                }
                C11772a.this.m30929c();
            }
        }

        C11776d(List list) {
            this.f30523a = list;
        }

        public void onNetworkError() {
            C11772a.this.f30513b.execute(new C11778b());
        }

        public void onServerError(Error error) {
            C11772a.this.f30513b.execute(new C11779c(error));
        }

        public void onSuccess() {
            C11772a.this.f30513b.execute(new C11777a());
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.metrics.a$e */
    public class C11780e implements MetricPublisher<OpMetric> {

        /* renamed from: a */
        private final SharedPreferences f30528a;

        /* renamed from: b */
        private final MetricsClient f30529b;

        /* renamed from: c */
        private final C11783a f30530c;

        /* renamed from: com.snapchat.kit.sdk.core.metrics.a$e$a */
        class C11781a implements Callback<Void> {

            /* renamed from: a */
            final /* synthetic */ PublishCallback f30531a;

            C11781a(C11780e eVar, PublishCallback publishCallback) {
                this.f30531a = publishCallback;
            }

            public void onFailure(Call<Void> call, Throwable th) {
                if (th instanceof IOException) {
                    this.f30531a.onNetworkError();
                } else {
                    this.f30531a.onServerError(new Error(th));
                }
            }

            public void onResponse(Call<Void> call, C13429h<Void> hVar) {
                if (hVar.mo38666e()) {
                    this.f30531a.onSuccess();
                    return;
                }
                try {
                    this.f30531a.onServerError(new Error(hVar.mo38664c().mo37830g()));
                } catch (IOException | NullPointerException unused) {
                    this.f30531a.onServerError(new Error("response unsuccessful"));
                }
            }
        }

        C11780e(SharedPreferences sharedPreferences, MetricsClient metricsClient, C11783a aVar) {
            this.f30528a = sharedPreferences;
            this.f30529b = metricsClient;
            this.f30530c = aVar;
        }

        /* renamed from: a */
        private static Metrics m30936a(List<OpMetric> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (OpMetric opMetric : list) {
                CounterMetric counterMetric = opMetric.counter_metric;
                if (counterMetric != null) {
                    arrayList.add(counterMetric);
                } else {
                    TimerMetric timerMetric = opMetric.timer_metric;
                    if (timerMetric != null) {
                        arrayList2.add(timerMetric);
                    } else {
                        LevelMetric levelMetric = opMetric.level_metric;
                        if (levelMetric != null) {
                            arrayList3.add(levelMetric);
                        }
                    }
                }
            }
            return new Builder().counters(arrayList).timers(arrayList2).levels(arrayList3).build();
        }

        public List<C11795c<OpMetric>> getPersistedEvents() {
            return this.f30530c.mo34654a(OpMetric.ADAPTER, this.f30528a.getString("unsent_operational_metrics", null));
        }

        public void persistMetrics(List<C11795c<OpMetric>> list) {
            this.f30528a.edit().putString("unsent_operational_metrics", this.f30530c.mo34653a(list)).apply();
        }

        public void publishMetrics(List<OpMetric> list, PublishCallback publishCallback) {
            this.f30529b.postOperationalMetrics(m30936a(list)).enqueue(new C11781a(this, publishCallback));
        }
    }

    /* renamed from: com.snapchat.kit.sdk.core.metrics.a$f */
    public final class C11782f implements Factory<C11780e> {

        /* renamed from: a */
        private final Provider<SharedPreferences> f30532a;

        /* renamed from: b */
        private final Provider<MetricsClient> f30533b;

        /* renamed from: c */
        private final Provider<C11783a> f30534c;

        public C11782f(Provider<SharedPreferences> provider, Provider<MetricsClient> provider2, Provider<C11783a> provider3) {
            this.f30532a = provider;
            this.f30533b = provider2;
            this.f30534c = provider3;
        }

        /* renamed from: a */
        public C11780e get() {
            return new C11780e((SharedPreferences) this.f30532a.get(), (MetricsClient) this.f30533b.get(), (C11783a) this.f30534c.get());
        }

        /* renamed from: a */
        public static Factory<C11780e> m30937a(Provider<SharedPreferences> provider, Provider<MetricsClient> provider2, Provider<C11783a> provider3) {
            return new C11782f(provider, provider2, provider3);
        }
    }

    C11772a(MetricPublisher<T> metricPublisher, ScheduledExecutorService scheduledExecutorService, int i) {
        this.f30512a = metricPublisher;
        this.f30513b = scheduledExecutorService;
        this.f30517f = i;
    }

    public void push(T t) {
        this.f30513b.execute(new C11775c(t));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m30929c() {
        ArrayList arrayList = new ArrayList(this.f30514c);
        arrayList.addAll(this.f30515d);
        this.f30512a.persistMetrics(arrayList);
    }

    /* renamed from: a */
    public void mo34642a() {
        this.f30513b.execute(new C11774b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34643b() {
        Future future = (Future) this.f30516e.getAndSet(null);
        if (future != null) {
            future.cancel(false);
        }
        if (!this.f30514c.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f30514c);
            this.f30514c.clear();
            this.f30515d.addAll(arrayList);
            this.f30512a.publishMetrics(m30926a((Collection<C11795c<T>>) arrayList), new C11776d(arrayList));
        }
    }

    /* renamed from: a */
    static <T> List<T> m30926a(Collection<C11795c<T>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C11795c c : collection) {
            arrayList.add(c.mo34669c());
        }
        return arrayList;
    }
}
