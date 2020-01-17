package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;
import com.snapchat.kit.sdk.core.metrics.C11795c;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher;
import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventBatch.Builder;
import com.snapchat.kit.sdk.core.metrics.p330b.C11783a;
import java.io.IOException;
import java.util.List;
import retrofit2.C13429h;
import retrofit2.Call;
import retrofit2.Callback;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.a */
public class C11786a implements MetricPublisher<ServerEvent> {

    /* renamed from: a */
    private final SharedPreferences f30539a;

    /* renamed from: b */
    private final C11794h f30540b;

    /* renamed from: c */
    private final MetricsClient f30541c;

    /* renamed from: d */
    private final C11783a f30542d;

    /* renamed from: com.snapchat.kit.sdk.core.metrics.business.a$a */
    class C11787a implements Callback<Void> {

        /* renamed from: a */
        final /* synthetic */ PublishCallback f30543a;

        C11787a(C11786a aVar, PublishCallback publishCallback) {
            this.f30543a = publishCallback;
        }

        public void onFailure(Call<Void> call, Throwable th) {
            if (th instanceof IOException) {
                this.f30543a.onNetworkError();
            } else {
                this.f30543a.onServerError(new Error(th));
            }
        }

        public void onResponse(Call<Void> call, C13429h<Void> hVar) {
            if (hVar.mo38666e()) {
                this.f30543a.onSuccess();
            }
            try {
                this.f30543a.onServerError(new Error(hVar.mo38664c().mo37830g()));
            } catch (IOException | NullPointerException unused) {
                this.f30543a.onServerError(new Error("response unsuccessful"));
            }
        }
    }

    C11786a(SharedPreferences sharedPreferences, C11794h hVar, MetricsClient metricsClient, C11783a aVar) {
        this.f30539a = sharedPreferences;
        this.f30540b = hVar;
        this.f30541c = metricsClient;
        this.f30542d = aVar;
    }

    /* renamed from: a */
    private ServerEventBatch m30946a(List<ServerEvent> list) {
        return new Builder().server_events(list).max_sequence_id_on_instance(Long.valueOf(this.f30540b.mo34666c())).build();
    }

    public List<C11795c<ServerEvent>> getPersistedEvents() {
        return this.f30542d.mo34654a(ServerEvent.ADAPTER, this.f30539a.getString("unsent_analytics_events", null));
    }

    public void persistMetrics(List<C11795c<ServerEvent>> list) {
        this.f30539a.edit().putString("unsent_analytics_events", this.f30542d.mo34653a(list)).apply();
    }

    public void publishMetrics(List<ServerEvent> list, PublishCallback publishCallback) {
        this.f30541c.postAnalytics(m30946a(list)).enqueue(new C11787a(this, publishCallback));
    }
}
