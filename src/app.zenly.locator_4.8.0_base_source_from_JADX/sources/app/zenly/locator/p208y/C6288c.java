package app.zenly.locator.p208y;

import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
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

/* renamed from: app.zenly.locator.y.c */
public final class C6288c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Lazy f15795b = C12896f.m33751a(C6289a.f15798f);

    /* renamed from: c */
    public static final C6290b f15796c = new C6290b(null);

    /* renamed from: a */
    private final AnalyticsTracker f15797a;

    /* renamed from: app.zenly.locator.y.c$a */
    static final class C6289a extends C12933k implements Function0<C6288c> {

        /* renamed from: f */
        public static final C6289a f15798f = new C6289a();

        C6289a() {
            super(0);
        }

        public final C6288c invoke() {
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            return new C6288c(a, null);
        }
    }

    /* renamed from: app.zenly.locator.y.c$b */
    public static final class C6290b {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f15799a;

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C6290b.class), "instance", "getInstance()Lapp/zenly/locator/phonesettings/PhoneSettingsAnalytics;");
            C12946x.m33839a((C12940r) sVar);
            f15799a = new KProperty[]{sVar};
        }

        private C6290b() {
        }

        /* renamed from: b */
        private final C6288c m17349b() {
            Lazy a = C6288c.f15795b;
            C6290b bVar = C6288c.f15796c;
            KProperty kProperty = f15799a[0];
            return (C6288c) a.getValue();
        }

        /* renamed from: a */
        public final C6288c mo14142a() {
            return m17349b();
        }

        public /* synthetic */ C6290b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.y.c$c */
    public enum C6291c {
        BANNER("banner"),
        MANDATORY_TROUBLESHOOTING("mandatory_troubleshooting"),
        ONBOARDING("onboarding"),
        SETTINGS("settings"),
        NONE("none");
        

        /* renamed from: e */
        private final String f15806e;

        private C6291c(String str) {
            this.f15806e = str;
        }

        /* renamed from: a */
        public final String mo14143a() {
            return this.f15806e;
        }
    }

    /* renamed from: app.zenly.locator.y.c$d */
    public enum C6292d {
        AUTO_STARTUP("auto_startup"),
        ENERGY_SAVING("energy_saving");
        

        /* renamed from: e */
        private final String f15810e;

        private C6292d(String str) {
            this.f15810e = str;
        }

        /* renamed from: a */
        public final String mo14144a() {
            return this.f15810e;
        }
    }

    private C6288c(AnalyticsTracker analyticsTracker) {
        this.f15797a = analyticsTracker;
    }

    /* renamed from: b */
    public static final C6288c m17344b() {
        return f15796c.mo14142a();
    }

    /* renamed from: b */
    public final void mo14140b(C6291c cVar, int i) {
        C12932j.m33818b(cVar, "openedOrigin");
        AnalyticsTracker analyticsTracker = this.f15797a;
        C5427c cVar2 = new C5427c();
        cVar2.mo12998a("device_configuration_opened_origin", cVar.mo14143a());
        cVar2.mo12998a("device_configuration_step_count", Integer.valueOf(i));
        analyticsTracker.track("Device Configuration Opened", cVar2);
    }

    public /* synthetic */ C6288c(AnalyticsTracker analyticsTracker, C12928f fVar) {
        this(analyticsTracker);
    }

    /* renamed from: a */
    public final void mo14138a(C6291c cVar, int i) {
        C12932j.m33818b(cVar, "openedOrigin");
        AnalyticsTracker analyticsTracker = this.f15797a;
        C5427c cVar2 = new C5427c();
        cVar2.mo12998a("device_configuration_opened_origin", cVar.mo14143a());
        cVar2.mo12998a("device_configuration_step_count", Integer.valueOf(i));
        analyticsTracker.track("Device Configuration End Displayed", cVar2);
    }

    /* renamed from: b */
    public final void mo14141b(C6291c cVar, C6292d dVar) {
        C12932j.m33818b(cVar, "openedOrigin");
        C12932j.m33818b(dVar, "stepType");
        AnalyticsTracker analyticsTracker = this.f15797a;
        C5427c cVar2 = new C5427c();
        cVar2.mo12998a("device_configuration_opened_origin", cVar.mo14143a());
        cVar2.mo12998a("device_configuration_step_type", dVar.mo14144a());
        analyticsTracker.track("Device Configuration Step Passed", cVar2);
    }

    /* renamed from: a */
    public final void mo14139a(C6291c cVar, C6292d dVar) {
        C12932j.m33818b(cVar, "openedOrigin");
        C12932j.m33818b(dVar, "stepType");
        AnalyticsTracker analyticsTracker = this.f15797a;
        C5427c cVar2 = new C5427c();
        cVar2.mo12998a("device_configuration_opened_origin", cVar.mo14143a());
        cVar2.mo12998a("device_configuration_step_type", dVar.mo14144a());
        analyticsTracker.track("Device Configuration Fix Button Tapped", cVar2);
    }
}
