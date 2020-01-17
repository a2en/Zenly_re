package app.zenly.locator.onboarding;

import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker.C2442a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p144i.C5427c;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.onboarding.l3 */
public final class C4847l3 {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Lazy f12794b = C12896f.m33751a(C4848a.f12797f);

    /* renamed from: c */
    public static final C4849b f12795c = new C4849b(null);

    /* renamed from: a */
    private final AnalyticsTracker f12796a;

    /* renamed from: app.zenly.locator.onboarding.l3$a */
    static final class C4848a extends C12933k implements Function0<C4847l3> {

        /* renamed from: f */
        public static final C4848a f12797f = new C4848a();

        C4848a() {
            super(0);
        }

        public final C4847l3 invoke() {
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            return new C4847l3(a, null);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.l3$b */
    public static final class C4849b {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f12798a;

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C4849b.class), "instance", "getInstance()Lapp/zenly/locator/onboarding/OnboardingAnalytics;");
            C12946x.m33839a((C12940r) sVar);
            f12798a = new KProperty[]{sVar};
        }

        private C4849b() {
        }

        /* renamed from: b */
        private final C4847l3 m14165b() {
            Lazy i = C4847l3.f12794b;
            C4849b bVar = C4847l3.f12795c;
            KProperty kProperty = f12798a[0];
            return (C4847l3) i.getValue();
        }

        /* renamed from: a */
        public final C4847l3 mo12083a() {
            return m14165b();
        }

        public /* synthetic */ C4849b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.l3$c */
    public enum C4850c {
        HIGH_ACCURACY("set_high_accuracy"),
        IMPROVE_ACCURACY("toggle_improve_accuracy");
        

        /* renamed from: e */
        private final String f12802e;

        private C4850c(String str) {
            this.f12802e = str;
        }

        /* renamed from: a */
        public final String mo12084a() {
            return this.f12802e;
        }
    }

    private C4847l3(AnalyticsTracker analyticsTracker) {
        this.f12796a = analyticsTracker;
    }

    /* renamed from: j */
    public static final C4847l3 m14146j() {
        return f12795c.mo12083a();
    }

    /* renamed from: a */
    public final void mo12067a(int i, Integer num) {
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("age", Integer.valueOf(i));
        cVar.mo13000b("network_strength_gsm", num);
        analyticsTracker.track("Account Birth Date Submitted", cVar);
    }

    /* renamed from: b */
    public final void mo12073b(int i, int i2) {
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_account_name_prefilled", Boolean.valueOf(false));
        cVar.mo12998a("is_account_name_edited", Boolean.valueOf(true));
        cVar.mo12998a("sim_card_slot_count", Integer.valueOf(i));
        cVar.mo12998a("sim_card_installed_count", Integer.valueOf(i2));
        analyticsTracker.track("Account Name Submitted", cVar);
    }

    /* renamed from: c */
    public final void mo12077c() {
        C2442a.m8540a(this.f12796a, "Permission Contacts Allowed", null, 2, null);
    }

    /* renamed from: d */
    public final void mo12078d() {
        C2442a.m8540a(this.f12796a, "Permission Contacts Denied", null, 2, null);
    }

    /* renamed from: e */
    public final void mo12079e() {
        C2442a.m8540a(this.f12796a, "Permission Contacts System Dialog Opened", null, 2, null);
    }

    /* renamed from: f */
    public final void mo12080f() {
        C2442a.m8540a(this.f12796a, "Permission Location Always Allowed", null, 2, null);
    }

    /* renamed from: g */
    public final void mo12081g() {
        C2442a.m8540a(this.f12796a, "Permission Location Denied", null, 2, null);
    }

    /* renamed from: h */
    public final void mo12082h() {
        C2442a.m8540a(this.f12796a, "Permission Location System Dialog Opened", null, 2, null);
    }

    public /* synthetic */ C4847l3(AnalyticsTracker analyticsTracker, C12928f fVar) {
        this(analyticsTracker);
    }

    /* renamed from: a */
    public final void mo12069a(boolean z) {
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_phone_number_valid", Boolean.valueOf(z));
        analyticsTracker.track("Account Phone Submitted", cVar);
    }

    /* renamed from: b */
    public final void mo12075b(boolean z) {
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_returning", Boolean.valueOf(z));
        analyticsTracker.track("Account Verified", cVar);
    }

    /* renamed from: a */
    public final void mo12071a(boolean z, boolean z2) {
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("is_code_valid", Boolean.valueOf(z));
        cVar.mo12998a("is_auto_fetched_from_sms", Boolean.valueOf(z2));
        analyticsTracker.track("Account Code Submitted", cVar);
    }

    /* renamed from: b */
    public final void mo12072b() {
        C2442a.m8540a(this.f12796a, "Account Location Passed", null, 2, null);
    }

    /* renamed from: b */
    public final void mo12076b(boolean z, int i, int i2) {
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("auto_skipped", Boolean.valueOf(z));
        cVar.mo12998a("suggested_available_count", Integer.valueOf(i));
        cVar.mo12998a("suggested_added_count", Integer.valueOf(i2));
        analyticsTracker.track("Account Suggested Passed", cVar);
    }

    /* renamed from: a */
    public final void mo12070a(boolean z, int i, int i2) {
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("auto_skipped", Boolean.valueOf(z));
        cVar.mo12998a("aoz_available_count", Integer.valueOf(i));
        cVar.mo12998a("aoz_added_count", Integer.valueOf(i2));
        analyticsTracker.track("Account AOZ Passed", cVar);
    }

    /* renamed from: b */
    public final void mo12074b(C4850c cVar) {
        C12932j.m33818b(cVar, "dialogType");
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar2 = new C5427c();
        cVar2.mo12998a("permission_location_accuracy_dialog_type", cVar.mo12084a());
        analyticsTracker.track("Permission Location Accuracy System Dialog Tapped", cVar2);
    }

    /* renamed from: a */
    public final void mo12066a(int i, int i2) {
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar = new C5427c();
        cVar.mo12998a("contacts_phone_available_count", Integer.valueOf(i));
        cVar.mo12998a("contacts_added_count", Integer.valueOf(i2));
        analyticsTracker.track("Account Contacts Passed", cVar);
    }

    /* renamed from: a */
    public final void mo12065a() {
        C2442a.m8540a(this.f12796a, "Account Completed", null, 2, null);
    }

    /* renamed from: a */
    public final void mo12068a(C4850c cVar) {
        C12932j.m33818b(cVar, "dialogType");
        AnalyticsTracker analyticsTracker = this.f12796a;
        C5427c cVar2 = new C5427c();
        cVar2.mo12998a("permission_location_accuracy_dialog_type", cVar.mo12084a());
        analyticsTracker.track("Permission Location Accuracy System Dialog Opened", cVar2);
    }
}
