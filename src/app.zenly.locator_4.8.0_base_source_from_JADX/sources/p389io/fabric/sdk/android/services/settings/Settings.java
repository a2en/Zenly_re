package p389io.fabric.sdk.android.services.settings;

import android.content.Context;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.services.common.C12178f;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12186j;
import p389io.fabric.sdk.android.services.common.C12187k;
import p389io.fabric.sdk.android.services.common.C12195p;
import p389io.fabric.sdk.android.services.common.C12200s;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;

/* renamed from: io.fabric.sdk.android.services.settings.Settings */
public class Settings {

    /* renamed from: a */
    private final AtomicReference<C12266r> f31841a;

    /* renamed from: b */
    private final CountDownLatch f31842b;

    /* renamed from: c */
    private SettingsController f31843c;

    /* renamed from: d */
    private boolean f31844d;

    /* renamed from: io.fabric.sdk.android.services.settings.Settings$SettingsAccess */
    public interface SettingsAccess<T> {
        T usingSettings(C12266r rVar);
    }

    /* renamed from: io.fabric.sdk.android.services.settings.Settings$b */
    static class C12248b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Settings f31845a = new Settings();
    }

    /* renamed from: d */
    public static Settings m32463d() {
        return C12248b.f31845a;
    }

    /* renamed from: a */
    public synchronized Settings mo36255a(C12161g gVar, C12195p pVar, HttpRequestFactory httpRequestFactory, String str, String str2, String str3, C12186j jVar) {
        C12161g gVar2 = gVar;
        synchronized (this) {
            if (this.f31844d) {
                return this;
            }
            if (this.f31843c == null) {
                Context b = gVar.mo36008b();
                String c = pVar.mo36085c();
                String d = new C12178f().mo36064d(b);
                String f = pVar.mo36088f();
                C12200s sVar = new C12200s();
                C12259k kVar = new C12259k();
                C12257i iVar = new C12257i(gVar2);
                String c2 = C12180h.m32265c(b);
                String str4 = str3;
                C12260l lVar = new C12260l(gVar2, str4, String.format(Locale.US, "https://settings.crashlytics.com/spi/v2/platforms/android/apps/%s/settings", new Object[]{c}), httpRequestFactory);
                String g = pVar.mo36089g();
                String str5 = g;
                String str6 = str2;
                String str7 = str;
                C12268t tVar = new C12268t(d, str5, pVar.mo36090h(), pVar.mo36091i(), pVar.mo36086d(), C12180h.m32250a(C12180h.m32280n(b)), str6, str7, C12187k.m32289a(f).mo36073a(), c2);
                C12258j jVar2 = new C12258j(gVar, tVar, sVar, kVar, iVar, lVar, jVar);
                this.f31843c = jVar2;
            }
            this.f31844d = true;
            return this;
        }
    }

    /* renamed from: b */
    public synchronized boolean mo36257b() {
        C12266r loadSettingsData;
        loadSettingsData = this.f31843c.loadSettingsData();
        m32462a(loadSettingsData);
        return loadSettingsData != null;
    }

    /* renamed from: c */
    public synchronized boolean mo36258c() {
        C12266r loadSettingsData;
        loadSettingsData = this.f31843c.loadSettingsData(C12265q.SKIP_CACHE_LOOKUP);
        m32462a(loadSettingsData);
        if (loadSettingsData == null) {
            C12154c.m32113f().mo35957e("Fabric", "Failed to force reload of settings from Crashlytics.", null);
        }
        return loadSettingsData != null;
    }

    private Settings() {
        this.f31841a = new AtomicReference<>();
        this.f31842b = new CountDownLatch(1);
        this.f31844d = false;
    }

    /* renamed from: a */
    public C12266r mo36256a() {
        try {
            this.f31842b.await();
            return (C12266r) this.f31841a.get();
        } catch (InterruptedException unused) {
            C12154c.m32113f().mo35956e("Fabric", "Interrupted while waiting for settings data.");
            return null;
        }
    }

    /* renamed from: a */
    private void m32462a(C12266r rVar) {
        this.f31841a.set(rVar);
        this.f31842b.countDown();
    }
}
