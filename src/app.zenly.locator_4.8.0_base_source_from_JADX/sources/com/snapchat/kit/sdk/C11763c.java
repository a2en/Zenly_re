package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.google.gson.C11125d;
import com.snapchat.kit.sdk.core.controller.C11766a;
import com.snapchat.kit.sdk.core.controller.C11771b;
import com.snapchat.kit.sdk.core.controller.LoginStateController;
import com.snapchat.kit.sdk.core.metrics.C11772a;
import com.snapchat.kit.sdk.core.metrics.C11772a.C11780e;
import com.snapchat.kit.sdk.core.metrics.C11772a.C11782f;
import com.snapchat.kit.sdk.core.metrics.C11797e;
import com.snapchat.kit.sdk.core.metrics.C11798f;
import com.snapchat.kit.sdk.core.metrics.C11799g;
import com.snapchat.kit.sdk.core.metrics.C11800h;
import com.snapchat.kit.sdk.core.metrics.C11801i;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.MetricsClient;
import com.snapchat.kit.sdk.core.metrics.business.C11786a;
import com.snapchat.kit.sdk.core.metrics.business.C11788b;
import com.snapchat.kit.sdk.core.metrics.business.C11789c;
import com.snapchat.kit.sdk.core.metrics.business.C11790d;
import com.snapchat.kit.sdk.core.metrics.business.C11791e;
import com.snapchat.kit.sdk.core.metrics.business.C11792f;
import com.snapchat.kit.sdk.core.metrics.business.C11793g;
import com.snapchat.kit.sdk.core.metrics.business.C11794h;
import com.snapchat.kit.sdk.core.metrics.business.KitEventBaseFactory;
import com.snapchat.kit.sdk.core.metrics.model.OpMetric;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.p330b.C11783a;
import com.snapchat.kit.sdk.core.metrics.p330b.C11785b;
import com.snapchat.kit.sdk.core.networking.AuthTokenManager;
import com.snapchat.kit.sdk.core.networking.C11802a;
import com.snapchat.kit.sdk.core.networking.C11804c;
import com.snapchat.kit.sdk.core.networking.C11805d;
import com.snapchat.kit.sdk.core.networking.C11806e;
import com.snapchat.kit.sdk.core.networking.C11808f;
import com.snapchat.kit.sdk.core.networking.ClientFactory;
import com.snapchat.kit.sdk.core.security.C11811b;
import com.snapchat.kit.sdk.core.security.C11818g;
import com.snapchat.kit.sdk.core.security.Fingerprint;
import dagger.internal.C12019a;
import dagger.internal.C12020b;
import dagger.internal.C12021c;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Provider;
import okhttp3.C13204g;
import okhttp3.C13325v;

/* renamed from: com.snapchat.kit.sdk.c */
public final class C11763c implements SnapKitComponent {

    /* renamed from: a */
    private Provider<Context> f30475a;

    /* renamed from: b */
    private Provider<C11125d> f30476b;

    /* renamed from: c */
    private Provider<SharedPreferences> f30477c;

    /* renamed from: d */
    private Provider<C11818g> f30478d;

    /* renamed from: e */
    private Provider<Handler> f30479e;

    /* renamed from: f */
    private Provider<C11766a> f30480f;

    /* renamed from: g */
    private Provider<C13325v> f30481g;

    /* renamed from: h */
    private Provider<C11794h> f30482h;

    /* renamed from: i */
    private Provider<C13204g> f30483i;

    /* renamed from: j */
    private Provider<String> f30484j;

    /* renamed from: k */
    private Provider<C11806e> f30485k;

    /* renamed from: l */
    private Provider<Fingerprint> f30486l;

    /* renamed from: m */
    private Provider<C11804c> f30487m;

    /* renamed from: n */
    private Provider<ClientFactory> f30488n;

    /* renamed from: o */
    private Provider<MetricsClient> f30489o;

    /* renamed from: p */
    private Provider<C11783a> f30490p;

    /* renamed from: q */
    private Provider<C11786a> f30491q;

    /* renamed from: r */
    private Provider<ScheduledExecutorService> f30492r;

    /* renamed from: s */
    private Provider<C11772a<ServerEvent>> f30493s;

    /* renamed from: t */
    private Provider<C11789c> f30494t;

    /* renamed from: u */
    private Provider<KitEventBaseFactory> f30495u;

    /* renamed from: v */
    private Provider<C11791e> f30496v;

    /* renamed from: w */
    private Provider<C11780e> f30497w;

    /* renamed from: x */
    private Provider<MetricQueue<OpMetric>> f30498x;

    /* renamed from: y */
    private Provider<OAuth2Manager> f30499y;

    /* renamed from: z */
    private C11830e f30500z;

    /* renamed from: com.snapchat.kit.sdk.c$b */
    public static final class C11765b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C11830e f30501a;

        private C11765b() {
        }

        /* renamed from: a */
        public SnapKitComponent mo34614a() {
            if (this.f30501a != null) {
                return new C11763c(this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C11830e.class.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: a */
        public C11765b mo34615a(C11830e eVar) {
            C12021c.m31670a(eVar);
            this.f30501a = eVar;
            return this;
        }
    }

    /* renamed from: a */
    public static C11765b m30909a() {
        return new C11765b();
    }

    public MetricQueue<ServerEvent> analyticsEventQueue() {
        return (MetricQueue) this.f30494t.get();
    }

    public ClientFactory apiFactory() {
        return (ClientFactory) this.f30488n.get();
    }

    public AuthTokenManager authTokenManager() {
        OAuth2Manager oAuth2Manager = (OAuth2Manager) this.f30499y.get();
        this.f30500z.mo34994a(oAuth2Manager);
        C12021c.m31671a(oAuth2Manager, "Cannot return null from a non-@Nullable @Provides method");
        return oAuth2Manager;
    }

    public String clientId() {
        String b = this.f30500z.mo34996b();
        C12021c.m31671a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public Context context() {
        return (Context) this.f30475a.get();
    }

    public C11125d gson() {
        return (C11125d) this.f30476b.get();
    }

    public void inject(SnapKitActivity snapKitActivity) {
        m30908a(snapKitActivity);
    }

    public KitEventBaseFactory kitEventBaseFactory() {
        return C11793g.m30958a(clientId());
    }

    public LoginStateController logoutController() {
        C11766a aVar = (C11766a) this.f30480f.get();
        this.f30500z.mo34993a(aVar);
        C12021c.m31671a(aVar, "Cannot return null from a non-@Nullable @Provides method");
        return aVar;
    }

    public MetricQueue<OpMetric> operationalMetricsQueue() {
        return (MetricQueue) this.f30498x.get();
    }

    public String redirectUrl() {
        String c = this.f30500z.mo34997c();
        C12021c.m31671a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public SharedPreferences sharedPreferences() {
        return (SharedPreferences) this.f30477c.get();
    }

    private C11763c(C11765b bVar) {
        m30910a(bVar);
    }

    /* renamed from: a */
    private void m30910a(C11765b bVar) {
        this.f30475a = C12020b.m31669b(C11833h.m31046a(bVar.f30501a));
        this.f30476b = C12020b.m31669b(C11834i.m31048a(bVar.f30501a));
        this.f30477c = C12020b.m31669b(C11838m.m31056a(bVar.f30501a));
        this.f30478d = C12020b.m31669b(C11837l.m31054a(bVar.f30501a, this.f30476b, this.f30477c));
        this.f30479e = C11839n.m31058a(bVar.f30501a);
        this.f30480f = C12020b.m31669b(C11771b.m30922a(this.f30479e));
        this.f30481g = C12020b.m31669b(C11836k.m31052a(bVar.f30501a));
        this.f30482h = C11801i.m30980a(this.f30477c);
        this.f30483i = C12020b.m31669b(C11831f.m31042a(bVar.f30501a));
        this.f30499y = new C12019a();
        this.f30484j = C11832g.m31044a(bVar.f30501a);
        this.f30485k = C12020b.m31669b(C11808f.m30993a(this.f30499y, this.f30480f, this.f30484j));
        this.f30486l = C11811b.m30999a(this.f30475a);
        this.f30487m = C11805d.m30986a(this.f30499y, this.f30480f, this.f30484j, this.f30486l);
        this.f30488n = C12020b.m31669b(C11802a.m30983a(this.f30483i, this.f30476b, this.f30485k, this.f30487m));
        this.f30489o = C12020b.m31669b(C11798f.m30974a(this.f30488n));
        this.f30490p = C11785b.m30943a(this.f30476b);
        this.f30491q = C12020b.m31669b(C11788b.m30947a(this.f30477c, this.f30482h, this.f30489o, this.f30490p));
        this.f30492r = C12020b.m31669b(C11800h.m30978b());
        this.f30493s = C11797e.m30972a(this.f30491q, this.f30492r);
        this.f30494t = C12020b.m31669b(C11790d.m30950a(this.f30482h, this.f30493s));
        this.f30495u = C11793g.m30959a(this.f30484j);
        this.f30496v = C11792f.m30956a(this.f30495u);
        this.f30497w = C12020b.m31669b(C11782f.m30937a(this.f30477c, this.f30489o, this.f30490p));
        this.f30498x = C12020b.m31669b(C11799g.m30976a(this.f30497w, this.f30492r));
        C12019a aVar = (C12019a) this.f30499y;
        this.f30499y = C12020b.m31669b(C11835j.m31050a(bVar.f30501a, this.f30478d, this.f30480f, this.f30481g, this.f30476b, this.f30494t, this.f30496v, this.f30498x));
        aVar.mo35646a(this.f30499y);
        this.f30500z = bVar.f30501a;
    }

    /* renamed from: a */
    private SnapKitActivity m30908a(SnapKitActivity snapKitActivity) {
        C11829d.m31029a(snapKitActivity, (OAuth2Manager) this.f30499y.get());
        return snapKitActivity;
    }
}
