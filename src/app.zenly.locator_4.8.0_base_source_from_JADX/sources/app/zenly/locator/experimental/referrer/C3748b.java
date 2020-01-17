package app.zenly.locator.experimental.referrer;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.InvalidReferrerException;
import app.zenly.locator.p196u.p197b.C5943a;
import com.android.installreferrer.api.C8695a;
import com.android.installreferrer.api.C8701c;
import com.android.installreferrer.api.InstallReferrerStateListener;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.experimental.referrer.b */
public final class C3748b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3756e f10031a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5943a f10032b;

    /* renamed from: c */
    private final C1322a f10033c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C8695a f10034d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final SharedPreferences f10035e;

    /* renamed from: app.zenly.locator.experimental.referrer.b$a */
    public static final class C3749a {
        private C3749a() {
        }

        public /* synthetic */ C3749a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.experimental.referrer.b$b */
    public static final class C3750b implements InstallReferrerStateListener {

        /* renamed from: a */
        final /* synthetic */ C3748b f10036a;

        C3750b(C3748b bVar) {
            this.f10036a = bVar;
        }

        public void onInstallReferrerServiceDisconnected() {
        }

        public void onInstallReferrerSetupFinished(int i) {
            String str = "";
            if (i == 0) {
                try {
                    C8701c b = this.f10036a.f10034d.mo23481b();
                    C12932j.m33815a((Object) b, "installReferrerClient.installReferrer");
                    String b2 = b.mo23487b();
                    if (b2 != null) {
                        str = b2;
                    }
                } catch (Exception e) {
                    C12143a.m32029a(e, "Error reading referrer details", new Object[0]);
                    return;
                }
            }
            this.f10036a.f10032b.mo13639a(ReferrerDetails.f9994e.mo10288a(this.f10036a.f10031a.mo10312a(str)));
            Editor edit = this.f10036a.f10035e.edit();
            C12932j.m33815a((Object) edit, "this");
            edit.putString("key:installReferrer", str);
            edit.apply();
            this.f10036a.f10034d.mo23479a();
        }
    }

    static {
        new C3749a(null);
    }

    public C3748b(C3756e eVar, C5943a aVar, C1322a aVar2, C8695a aVar3, SharedPreferences sharedPreferences) {
        C12932j.m33818b(eVar, "referrerEncryption");
        C12932j.m33818b(aVar, "experimentalAnalytics");
        C12932j.m33818b(aVar2, "decisionApi");
        C12932j.m33818b(aVar3, "installReferrerClient");
        C12932j.m33818b(sharedPreferences, "sharedPreferences");
        this.f10031a = eVar;
        this.f10032b = aVar;
        this.f10033c = aVar2;
        this.f10034d = aVar3;
        this.f10035e = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo10298a() {
        Editor edit = this.f10035e.edit();
        C12932j.m33815a((Object) edit, "this");
        edit.putString("key:installReferrer", "");
        edit.apply();
    }

    /* renamed from: b */
    public final ReferrerDetails mo10299b() {
        try {
            C3756e eVar = this.f10031a;
            String string = this.f10035e.getString("key:installReferrer", "");
            if (string != null) {
                C12932j.m33815a((Object) string, "sharedPreferences.getStr…Y_INSTALL_REFERRER, \"\")!!");
                return ReferrerDetails.f9994e.mo10288a(eVar.mo10312a(string));
            }
            C12932j.m33814a();
            throw null;
        } catch (InvalidReferrerException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo10300c() {
        if (this.f10033c.mo6511a("feature:decodeTargetedDownloadLinkFeature") && !this.f10035e.contains("key:installReferrer")) {
            try {
                this.f10034d.mo23480a((InstallReferrerStateListener) new C3750b(this));
            } catch (Exception e) {
                C12143a.m32032b(e, "Error connecting to playstore", new Object[0]);
            }
        }
    }
}
