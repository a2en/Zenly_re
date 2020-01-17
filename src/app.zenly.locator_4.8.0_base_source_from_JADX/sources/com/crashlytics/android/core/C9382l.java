package com.crashlytics.android.core;

import android.content.Context;
import android.util.Log;
import com.appsflyer.share.Constants;
import com.crashlytics.android.answers.C9278k;
import com.crashlytics.android.answers.EventLogger;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12178f;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12186j;
import p389io.fabric.sdk.android.services.common.C12188l;
import p389io.fabric.sdk.android.services.common.C12194o;
import p389io.fabric.sdk.android.services.common.C12195p;
import p389io.fabric.sdk.android.services.concurrency.C12214c;
import p389io.fabric.sdk.android.services.concurrency.C12215d;
import p389io.fabric.sdk.android.services.concurrency.C12219f;
import p389io.fabric.sdk.android.services.concurrency.Task;
import p389io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import p389io.fabric.sdk.android.services.network.C12239b;
import p389io.fabric.sdk.android.services.network.HttpRequestFactory;
import p389io.fabric.sdk.android.services.network.PinningInfoProvider;
import p389io.fabric.sdk.android.services.persistence.C12245a;
import p389io.fabric.sdk.android.services.persistence.C12246b;
import p389io.fabric.sdk.android.services.settings.C12266r;
import p389io.fabric.sdk.android.services.settings.Settings;

@C12214c({CrashlyticsNdkDataProvider.class})
/* renamed from: com.crashlytics.android.core.l */
public class C9382l extends C12161g<Void> {

    /* renamed from: k */
    private final long f24316k;

    /* renamed from: l */
    private final ConcurrentHashMap<String, String> f24317l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9390m f24318m;

    /* renamed from: n */
    private C9390m f24319n;

    /* renamed from: o */
    private CrashlyticsListener f24320o;

    /* renamed from: p */
    private C9337k f24321p;

    /* renamed from: q */
    private String f24322q;

    /* renamed from: r */
    private String f24323r;

    /* renamed from: s */
    private String f24324s;

    /* renamed from: t */
    private float f24325t;

    /* renamed from: u */
    private boolean f24326u;

    /* renamed from: v */
    private final PinningInfoProvider f24327v;

    /* renamed from: w */
    private HttpRequestFactory f24328w;

    /* renamed from: x */
    private C9331j f24329x;

    /* renamed from: y */
    private CrashlyticsNdkDataProvider f24330y;

    /* renamed from: com.crashlytics.android.core.l$a */
    class C9383a extends C12219f<Void> {
        C9383a() {
        }

        public C12215d getPriority() {
            return C12215d.IMMEDIATE;
        }

        public Void call() throws Exception {
            return C9382l.this.mo24942a();
        }
    }

    /* renamed from: com.crashlytics.android.core.l$b */
    class C9384b implements Callable<Void> {
        C9384b() {
        }

        public Void call() throws Exception {
            C9382l.this.f24318m.mo25209a();
            C12154c.m32113f().mo35954d("CrashlyticsCore", "Initialization marker file created.");
            return null;
        }
    }

    /* renamed from: com.crashlytics.android.core.l$c */
    class C9385c implements Callable<Boolean> {
        C9385c() {
        }

        public Boolean call() throws Exception {
            String str = "CrashlyticsCore";
            try {
                boolean c = C9382l.this.f24318m.mo25211c();
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Initialization marker file removed: ");
                sb.append(c);
                f.mo35954d(str, sb.toString());
                return Boolean.valueOf(c);
            } catch (Exception e) {
                C12154c.m32113f().mo35957e(str, "Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.valueOf(false);
            }
        }
    }

    /* renamed from: com.crashlytics.android.core.l$d */
    private static final class C9386d implements Callable<Boolean> {

        /* renamed from: e */
        private final C9390m f24334e;

        public C9386d(C9390m mVar) {
            this.f24334e = mVar;
        }

        public Boolean call() throws Exception {
            if (!this.f24334e.mo25210b()) {
                return Boolean.FALSE;
            }
            C12154c.m32113f().mo35954d("CrashlyticsCore", "Found previous crash marker.");
            this.f24334e.mo25211c();
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.crashlytics.android.core.l$e */
    private static final class C9387e implements CrashlyticsListener {
        private C9387e() {
        }

        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }

        /* synthetic */ C9387e(C9383a aVar) {
            this();
        }
    }

    public C9382l() {
        this(1.0f, null, null, false);
    }

    /* renamed from: b */
    private void m22668b(int i, String str, String str2) {
        if (!this.f24326u && m22671c("prior to logging messages.")) {
            this.f24321p.mo25135a(System.currentTimeMillis() - this.f24316k, m22670c(i, str, str2));
        }
    }

    /* renamed from: c */
    private static String m22670c(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C12180h.m32243a(i));
        sb.append(Constants.URL_PATH_DELIMITER);
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: d */
    private static String m22672d(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    /* renamed from: u */
    private void m22673u() {
        if (Boolean.TRUE.equals((Boolean) this.f24329x.mo25128b(new C9386d(this.f24319n)))) {
            try {
                this.f24320o.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (Exception e) {
                C12154c.m32113f().mo35957e("CrashlyticsCore", "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    /* renamed from: v */
    private void m22674v() {
        C9383a aVar = new C9383a();
        for (Task a : mo36011c()) {
            aVar.addDependency(a);
        }
        Future submit = mo36013d().mo35983b().submit(aVar);
        String str = "CrashlyticsCore";
        C12154c.m32113f().mo35954d(str, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C12154c.m32113f().mo35957e(str, "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C12154c.m32113f().mo35957e(str, "Problem encountered during Crashlytics initialization.", e2);
        } catch (TimeoutException e3) {
            C12154c.m32113f().mo35957e(str, "Crashlytics timed out during initialization.", e3);
        }
    }

    /* renamed from: w */
    public static C9382l m22675w() {
        return (C9382l) C12154c.m32104a(C9382l.class);
    }

    /* renamed from: f */
    public String mo24943f() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    /* renamed from: h */
    public String mo24945h() {
        return "2.6.8.32";
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo24961k() {
        return mo25193a(super.mo36008b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo25195l() {
        this.f24319n.mo25209a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo25196m() {
        return this.f24318m.mo25210b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public Map<String, String> mo25197n() {
        return Collections.unmodifiableMap(this.f24317l);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public C9399o mo25198o() {
        CrashlyticsNdkDataProvider crashlyticsNdkDataProvider = this.f24330y;
        if (crashlyticsNdkDataProvider != null) {
            return crashlyticsNdkDataProvider.getCrashlyticsNdkData();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public String mo25199p() {
        if (mo36014e().mo36083a()) {
            return this.f24323r;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public String mo25200q() {
        if (mo36014e().mo36083a()) {
            return this.f24322q;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public String mo25201r() {
        if (mo36014e().mo36083a()) {
            return this.f24324s;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo25202s() {
        this.f24329x.mo25127a((Callable<T>) new C9385c<T>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo25203t() {
        this.f24329x.mo25128b(new C9384b());
    }

    C9382l(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z) {
        this(f, crashlyticsListener, pinningInfoProvider, z, C12188l.m32291a("Crashlytics Exception Handler"));
    }

    /* renamed from: c */
    private static boolean m22671c(String str) {
        C9382l w = m22675w();
        if (w != null && w.f24321p != null) {
            return true;
        }
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
        sb.append(str);
        f.mo35957e("CrashlyticsCore", sb.toString(), null);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25193a(Context context) {
        Context context2 = context;
        String str = "CrashlyticsCore";
        if (!C12186j.m32286a(context).mo36071a()) {
            C12154c.m32113f().mo35954d(str, "Crashlytics is disabled, because data collection is disabled by Firebase.");
            this.f24326u = true;
        }
        if (this.f24326u) {
            return false;
        }
        String d = new C12178f().mo36064d(context2);
        if (d == null) {
            return false;
        }
        String n = C12180h.m32280n(context);
        if (m22669b(n, C12180h.m32258a(context2, "com.crashlytics.RequireBuildId", true))) {
            try {
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Initializing Crashlytics ");
                sb.append(mo24945h());
                f.mo35959i(str, sb.toString());
                C12245a aVar = new C12245a(this);
                this.f24319n = new C9390m("crash_marker", aVar);
                this.f24318m = new C9390m("initialization_marker", aVar);
                C9320g0 a = C9320g0.m22525a(new C12246b(mo36008b(), "com.crashlytics.android.core.CrashlyticsCore"), this);
                PinningInfoProvider pVar = this.f24327v != null ? new C9401p(this.f24327v) : null;
                this.f24328w = new C12239b(C12154c.m32113f());
                this.f24328w.setPinningInfoProvider(pVar);
                C12195p e = mo36014e();
                C9303a a2 = C9303a.m22426a(context2, e, d, n);
                C9398n0 n0Var = new C9398n0(context2, new C9425z(context2, a2.f24157d));
                C9411t tVar = new C9411t(this);
                EventLogger b = C9278k.m22355b(context);
                Logger f2 = C12154c.m32113f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Installer package name is: ");
                sb2.append(a2.f24156c);
                f2.mo35954d(str, sb2.toString());
                C9337k kVar = r1;
                C9337k kVar2 = new C9337k(this, this.f24329x, this.f24328w, e, a, aVar, a2, n0Var, tVar, b);
                this.f24321p = kVar;
                boolean m = mo25196m();
                m22673u();
                this.f24321p.mo25140a(Thread.getDefaultUncaughtExceptionHandler(), new C12194o().mo36082e(context2));
                if (!m || !C12180h.m32263b(context)) {
                    C12154c.m32113f().mo35954d(str, "Exception handling initialization successful");
                    return true;
                }
                C12154c.m32113f().mo35954d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                m22674v();
                return false;
            } catch (Exception e2) {
                C12154c.m32113f().mo35957e(str, "Crashlytics was not started due to an exception during initialization", e2);
                this.f24321p = null;
                return false;
            }
        } else {
            throw new UnmetDependencyException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    C9382l(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.f24322q = null;
        this.f24323r = null;
        this.f24324s = null;
        this.f24325t = f;
        if (crashlyticsListener == null) {
            crashlyticsListener = new C9387e(null);
        }
        this.f24320o = crashlyticsListener;
        this.f24327v = pinningInfoProvider;
        this.f24326u = z;
        this.f24329x = new C9331j(executorService);
        this.f24317l = new ConcurrentHashMap<>();
        this.f24316k = System.currentTimeMillis();
    }

    /* renamed from: b */
    public void mo25194b(String str) {
        if (!this.f24326u && m22671c("prior to setting user data.")) {
            this.f24322q = m22672d(str);
            this.f24321p.mo25139a(this.f24322q, this.f24324s, this.f24323r);
        }
    }

    /* renamed from: b */
    static boolean m22669b(String str, boolean z) {
        String str2 = "CrashlyticsCore";
        if (!z) {
            C12154c.m32113f().mo35954d(str2, "Configured not to require a build ID.");
            return true;
        } else if (!C12180h.m32264b(str)) {
            return true;
        } else {
            String str3 = ".";
            Log.e(str2, str3);
            Log.e(str2, ".     |  | ");
            String str4 = ".     |  |";
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, ".   \\ |  | /");
            Log.e(str2, ".    \\    /");
            Log.e(str2, ".     \\  /");
            Log.e(str2, ".      \\/");
            Log.e(str2, str3);
            Log.e(str2, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e(str2, str3);
            Log.e(str2, ".      /\\");
            Log.e(str2, ".     /  \\");
            Log.e(str2, ".    /    \\");
            Log.e(str2, ".   / |  | \\");
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, str4);
            Log.e(str2, str3);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Void m22677a() {
        String str = "CrashlyticsCore";
        mo25203t();
        this.f24321p.mo25132a();
        try {
            this.f24321p.mo25155k();
            C12266r a = Settings.m32463d().mo36256a();
            if (a == null) {
                C12154c.m32113f().mo35967w(str, "Received null settings, skipping report submission!");
                mo25202s();
                return null;
            }
            this.f24321p.mo25138a(a);
            if (!a.f31919d.f31891c) {
                C12154c.m32113f().mo35954d(str, "Collection of crash reports disabled in Crashlytics settings.");
                mo25202s();
                return null;
            } else if (!C12186j.m32286a(mo36008b()).mo36071a()) {
                C12154c.m32113f().mo35954d(str, "Automatic collection of crash reports disabled by Firebase settings.");
                mo25202s();
                return null;
            } else {
                C9399o o = mo25198o();
                if (o != null && !this.f24321p.mo25144a(o)) {
                    C12154c.m32113f().mo35954d(str, "Could not finalize previous NDK sessions.");
                }
                if (!this.f24321p.mo25146b(a.f31917b)) {
                    C12154c.m32113f().mo35954d(str, "Could not finalize previous sessions.");
                }
                this.f24321p.mo25133a(this.f24325t, a);
                mo25202s();
                return null;
            }
        } catch (Exception e) {
            C12154c.m32113f().mo35957e(str, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            mo25202s();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo25192a(Throwable th) {
        if (this.f24326u || !m22671c("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            C12154c.m32113f().log(5, "CrashlyticsCore", "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.f24321p.mo25141a(Thread.currentThread(), th);
        }
    }

    /* renamed from: a */
    public void mo25189a(String str) {
        m22668b(3, "CrashlyticsCore", str);
    }

    /* renamed from: a */
    public void mo25187a(int i, String str, String str2) {
        m22668b(i, str, str2);
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(str2);
        f.log(i, sb2, sb3.toString(), true);
    }

    /* renamed from: a */
    public void mo25190a(String str, String str2) {
        String str3;
        if (!this.f24326u && m22671c("prior to setting keys.")) {
            String str4 = "CrashlyticsCore";
            if (str == null) {
                Context b = mo36008b();
                if (b == null || !C12180h.m32276j(b)) {
                    C12154c.m32113f().mo35957e(str4, "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String d = m22672d(str);
            if (this.f24317l.size() < 64 || this.f24317l.containsKey(d)) {
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = m22672d(str2);
                }
                this.f24317l.put(d, str3);
                this.f24321p.mo25142a((Map<String, String>) this.f24317l);
                return;
            }
            C12154c.m32113f().mo35954d(str4, "Exceeded maximum number of custom attributes (64)");
        }
    }

    /* renamed from: a */
    public void mo25191a(String str, boolean z) {
        mo25190a(str, Boolean.toString(z));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25188a(CrashlyticsNdkDataProvider crashlyticsNdkDataProvider) {
        this.f24330y = crashlyticsNdkDataProvider;
    }
}
