package p389io.fabric.sdk.android;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;
import p389io.fabric.sdk.android.services.common.C12178f;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12186j;
import p389io.fabric.sdk.android.services.common.C12187k;
import p389io.fabric.sdk.android.services.network.C12239b;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;
import p389io.fabric.sdk.android.services.settings.C12252d;
import p389io.fabric.sdk.android.services.settings.C12253e;
import p389io.fabric.sdk.android.services.settings.C12256h;
import p389io.fabric.sdk.android.services.settings.C12262n;
import p389io.fabric.sdk.android.services.settings.C12266r;
import p389io.fabric.sdk.android.services.settings.C12269u;
import p389io.fabric.sdk.android.services.settings.Settings;

/* renamed from: io.fabric.sdk.android.i */
class C12163i extends C12161g<Boolean> {

    /* renamed from: k */
    private final HttpRequestFactory f31615k = new C12239b();

    /* renamed from: l */
    private PackageManager f31616l;

    /* renamed from: m */
    private String f31617m;

    /* renamed from: n */
    private PackageInfo f31618n;

    /* renamed from: o */
    private String f31619o;

    /* renamed from: p */
    private String f31620p;

    /* renamed from: q */
    private String f31621q;

    /* renamed from: r */
    private String f31622r;

    /* renamed from: s */
    private String f31623s;

    /* renamed from: t */
    private final Future<Map<String, C12162h>> f31624t;

    /* renamed from: u */
    private final Collection<C12161g> f31625u;

    public C12163i(Future<Map<String, C12162h>> future, Collection<C12161g> collection) {
        this.f31624t = future;
        this.f31625u = collection;
    }

    /* renamed from: b */
    private boolean m32164b(String str, C12253e eVar, Collection<C12162h> collection) {
        return new C12256h(this, mo36022l(), eVar.f31873c, this.f31615k).mo36266a(m32161a(C12262n.m32501a(mo36008b(), str), collection));
    }

    /* renamed from: c */
    private boolean m32165c(String str, C12253e eVar, Collection<C12162h> collection) {
        return m32162a(eVar, C12262n.m32501a(mo36008b(), str), collection);
    }

    /* renamed from: m */
    private C12266r m32166m() {
        try {
            Settings d = Settings.m32463d();
            d.mo36255a(this, this.f31610i, this.f31615k, this.f31619o, this.f31620p, mo36022l(), C12186j.m32286a(mo36008b()));
            d.mo36257b();
            return Settings.m32463d().mo36256a();
        } catch (Exception e) {
            C12154c.m32113f().mo35957e("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    /* renamed from: f */
    public String mo24943f() {
        return "io.fabric.sdk.android:fabric";
    }

    /* renamed from: h */
    public String mo24945h() {
        return "1.4.8.32";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo24961k() {
        try {
            this.f31621q = mo36014e().mo36088f();
            this.f31616l = mo36008b().getPackageManager();
            this.f31617m = mo36008b().getPackageName();
            this.f31618n = this.f31616l.getPackageInfo(this.f31617m, 0);
            this.f31619o = Integer.toString(this.f31618n.versionCode);
            this.f31620p = this.f31618n.versionName == null ? "0.0" : this.f31618n.versionName;
            this.f31622r = this.f31616l.getApplicationLabel(mo36008b().getApplicationInfo()).toString();
            this.f31623s = Integer.toString(mo36008b().getApplicationInfo().targetSdkVersion);
            return true;
        } catch (NameNotFoundException e) {
            C12154c.m32113f().mo35957e("Fabric", "Failed init", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public String mo36022l() {
        return C12180h.m32261b(mo36008b(), "com.crashlytics.ApiEndpoint");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean m32168a() {
        boolean z;
        Map map;
        String c = C12180h.m32265c(mo36008b());
        C12266r m = m32166m();
        if (m != null) {
            try {
                if (this.f31624t != null) {
                    map = (Map) this.f31624t.get();
                } else {
                    map = new HashMap();
                }
                mo36021a(map, this.f31625u);
                z = m32163a(c, m.f31916a, map.values());
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("Fabric", "Error performing auto configuration.", e);
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, C12162h> mo36021a(Map<String, C12162h> map, Collection<C12161g> collection) {
        for (C12161g gVar : collection) {
            if (!map.containsKey(gVar.mo24943f())) {
                map.put(gVar.mo24943f(), new C12162h(gVar.mo24943f(), gVar.mo24945h(), "binary"));
            }
        }
        return map;
    }

    /* renamed from: a */
    private boolean m32163a(String str, C12253e eVar, Collection<C12162h> collection) {
        String str2 = "Fabric";
        if (!"new".equals(eVar.f31872b)) {
            if ("configured".equals(eVar.f31872b)) {
                return Settings.m32463d().mo36258c();
            }
            if (eVar.f31876f) {
                C12154c.m32113f().mo35954d(str2, "Server says an update is required - forcing a full App update.");
                m32165c(str, eVar, collection);
            }
            return true;
        } else if (m32164b(str, eVar, collection)) {
            return Settings.m32463d().mo36258c();
        } else {
            C12154c.m32113f().mo35957e(str2, "Failed to create app with Crashlytics service.", null);
            return false;
        }
    }

    /* renamed from: a */
    private boolean m32162a(C12253e eVar, C12262n nVar, Collection<C12162h> collection) {
        return new C12269u(this, mo36022l(), eVar.f31873c, this.f31615k).mo36266a(m32161a(nVar, collection));
    }

    /* renamed from: a */
    private C12252d m32161a(C12262n nVar, Collection<C12162h> collection) {
        Context b = mo36008b();
        C12252d dVar = new C12252d(new C12178f().mo36064d(b), mo36014e().mo36085c(), this.f31620p, this.f31619o, C12180h.m32250a(C12180h.m32280n(b)), this.f31622r, C12187k.m32289a(this.f31621q).mo36073a(), this.f31623s, "0", nVar, collection);
        return dVar;
    }
}
