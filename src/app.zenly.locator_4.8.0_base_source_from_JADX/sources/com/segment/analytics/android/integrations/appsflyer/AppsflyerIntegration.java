package com.segment.analytics.android.integrations.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.segment.analytics.Analytics;
import com.segment.analytics.Analytics.C11615l;
import com.segment.analytics.C11668l;
import com.segment.analytics.C11685r;
import com.segment.analytics.integrations.C11655d;
import com.segment.analytics.integrations.C11657e;
import com.segment.analytics.integrations.C11660g;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Integration.Factory;
import com.segment.analytics.p326t.C11692b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class AppsflyerIntegration extends Integration<AppsFlyerLib> {

    /* renamed from: g */
    static final Map<String, String> f30176g;

    /* renamed from: h */
    public static ConversionListenerDisplay f30177h;

    /* renamed from: i */
    public static final Factory f30178i = new C11618a();

    /* renamed from: a */
    final C11657e f30179a;

    /* renamed from: b */
    final AppsFlyerLib f30180b;

    /* renamed from: c */
    final boolean f30181c;

    /* renamed from: d */
    private Context f30182d;

    /* renamed from: e */
    private String f30183e;

    /* renamed from: f */
    private String f30184f;

    public interface ConversionListenerDisplay {
        void display(Map<String, String> map);
    }

    /* renamed from: com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration$a */
    static class C11618a implements Factory {
        C11618a() {
        }

        public Integration<AppsFlyerLib> create(C11685r rVar, Analytics analytics) {
            C11657e a = analytics.mo34215a("AppsFlyer");
            AppsFlyerLib instance = AppsFlyerLib.getInstance();
            String a2 = rVar.mo34419a("appsFlyerDevKey");
            boolean a3 = rVar.mo34421a("trackAttributionData", false);
            Application a4 = analytics.mo34214a();
            instance.init(a2, a3 ? new C11619b(analytics) : null, a4.getApplicationContext());
            instance.trackEvent(a4.getApplicationContext(), null, null);
            instance.startTracking(a4);
            StringBuilder sb = new StringBuilder();
            sb.append(a2.substring(0, 1));
            sb.append("*****");
            sb.append(a2.substring(a2.length() - 2));
            a.mo34350c("AppsFlyer.getInstance().startTracking(%s, %s)", a4, sb.toString());
            return new AppsflyerIntegration(a4, a, instance, a2);
        }

        public String key() {
            return "AppsFlyer";
        }
    }

    /* renamed from: com.segment.analytics.android.integrations.appsflyer.AppsflyerIntegration$b */
    static class C11619b implements AppsFlyerConversionListener {

        /* renamed from: a */
        final Analytics f30185a;

        public C11619b(Analytics analytics) {
            this.f30185a = analytics;
        }

        /* renamed from: b */
        private Object m30456b(String str) {
            return str != null ? str : "";
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo34279a(Map<String, String> map) {
            String str = "media_source";
            String str2 = "campaign";
            String str3 = "adgroup";
            C11685r b = new C11685r().mo34265b("source", m30456b((String) map.get(str))).mo34265b("name", m30456b((String) map.get(str2))).mo34265b("adGroup", m30456b((String) map.get(str3)));
            C11668l lVar = new C11668l();
            lVar.mo34265b("provider", (Object) "AppsFlyer");
            lVar.remove(str);
            lVar.remove(str3);
            lVar.mo34265b(str2, (Object) b);
            lVar.putAll(map);
            this.f30185a.mo34221a("Install Attributed", lVar);
        }

        public void onAppOpenAttribution(Map<String, String> map) {
            String str = "AF_onInstall_Attr";
            if (!m30455a(str)) {
                mo34279a(map);
                m30454a(str, true);
            }
            ConversionListenerDisplay conversionListenerDisplay = AppsflyerIntegration.f30177h;
            if (conversionListenerDisplay != null) {
                conversionListenerDisplay.display(map);
            }
        }

        public void onAttributionFailure(String str) {
        }

        public void onInstallConversionDataLoaded(Map<String, String> map) {
            String str = "AF_onConversion_Data";
            if (!m30455a(str)) {
                mo34279a(map);
                m30454a(str, true);
            }
            ConversionListenerDisplay conversionListenerDisplay = AppsflyerIntegration.f30177h;
            if (conversionListenerDisplay != null) {
                conversionListenerDisplay.display(map);
            }
        }

        public void onInstallConversionFailure(String str) {
        }

        /* renamed from: a */
        private boolean m30455a(String str) {
            Context a = m30452a();
            if (a == null) {
                return false;
            }
            return a.getSharedPreferences("appsflyer-segment-data", 0).getBoolean(str, false);
        }

        /* renamed from: a */
        private void m30454a(String str, boolean z) {
            Context a = m30452a();
            if (a != null) {
                Editor edit = a.getSharedPreferences("appsflyer-segment-data", 0).edit();
                edit.putBoolean(str, z);
                m30453a(edit);
            }
        }

        /* renamed from: a */
        private void m30453a(Editor editor) {
            if (VERSION.SDK_INT >= 9) {
                editor.apply();
            } else {
                editor.commit();
            }
        }

        /* renamed from: a */
        private Context m30452a() {
            return this.f30185a.mo34214a().getApplicationContext();
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("revenue", AFInAppEventParameterName.REVENUE);
        linkedHashMap.put("currency", AFInAppEventParameterName.CURRENCY);
        f30176g = Collections.unmodifiableMap(linkedHashMap);
    }

    public AppsflyerIntegration(Context context, C11657e eVar, AppsFlyerLib appsFlyerLib, String str) {
        this.f30182d = context;
        this.f30179a = eVar;
        this.f30180b = appsFlyerLib;
        this.f30181c = eVar.f30237a != C11615l.NONE;
    }

    /* renamed from: c */
    private void m30448c() {
        this.f30180b.setCustomerUserId(this.f30183e);
        this.f30179a.mo34350c("appsflyer.setCustomerUserId(%s)", this.f30183e);
        this.f30180b.setCurrencyCode(this.f30184f);
        this.f30179a.mo34350c("appsflyer.setCurrencyCode(%s)", this.f30184f);
        this.f30180b.setDebugLog(this.f30181c);
        this.f30179a.mo34350c("appsflyer.setDebugLog(%s)", Boolean.valueOf(this.f30181c));
    }

    /* renamed from: a */
    public void mo34273a(Activity activity, Bundle bundle) {
        super.mo34273a(activity, bundle);
        m30448c();
    }

    /* renamed from: a */
    public void mo34274a(C11655d dVar) {
        super.mo34274a(dVar);
        this.f30183e = dVar.mo34334d();
        this.f30184f = dVar.mo34344e().mo34419a(AppsFlyerProperties.CURRENCY_CODE);
        if (this.f30180b != null) {
            m30448c();
            return;
        }
        this.f30179a.mo34350c("couldn't update 'Identify' attributes", new Object[0]);
    }

    /* renamed from: a */
    public void mo34275a(C11660g gVar) {
        String e = gVar.mo34358e();
        C11668l f = gVar.mo34359f();
        this.f30180b.trackEvent(this.f30182d, e, C11692b.m30707a((Map<String, T>) f, f30176g));
        this.f30179a.mo34350c("appsflyer.trackEvent(context, %s, %s)", e, f);
    }
}
