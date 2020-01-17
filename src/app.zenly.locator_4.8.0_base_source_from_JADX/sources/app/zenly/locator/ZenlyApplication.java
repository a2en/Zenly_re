package app.zenly.locator;

import android.app.Application;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.descendants.DescendantsModule;
import app.zenly.android.feature.descendants.DescendantsModuleProvider;
import app.zenly.android.feature.spam.prevention.SpamPreventionModule;
import app.zenly.android.feature.spam.prevention.SpamPreventionModuleProvider;
import app.zenly.locator.core.manager.p069di.C2660a;
import app.zenly.locator.core.manager.p069di.ManagerModuleProvider;
import app.zenly.locator.core.store.p071di.C3016b;
import app.zenly.locator.core.store.p071di.StoreModule;
import app.zenly.locator.core.store.p071di.StoreModuleProvider;
import app.zenly.locator.decision.DecisionApiProvider;
import app.zenly.locator.decision.p082b.C3445a;
import app.zenly.locator.decision.p082b.C3447b;
import app.zenly.locator.decision.p082b.C3449c;
import app.zenly.locator.decision.p082b.C3451d;
import app.zenly.locator.decision.p082b.C3453e;
import app.zenly.locator.decision.p082b.C3455f;
import app.zenly.locator.decision.p082b.C3457g;
import app.zenly.locator.decision.p082b.C3459h;
import app.zenly.locator.decision.p082b.C3461i;
import app.zenly.locator.decision.p082b.C3463j;
import app.zenly.locator.decision.p082b.C3465k;
import app.zenly.locator.decision.p082b.C3467l;
import app.zenly.locator.decision.p082b.C3469m;
import app.zenly.locator.decision.p082b.C3471n;
import app.zenly.locator.decision.p082b.C3473o;
import app.zenly.locator.decision.p082b.C3475p;
import app.zenly.locator.decision.p082b.C3477q;
import app.zenly.locator.decision.p082b.C3479r;
import app.zenly.locator.decision.p082b.C3481s;
import app.zenly.locator.decision.p082b.C3483t;
import app.zenly.locator.descendants.C3506c;
import app.zenly.locator.friendshipfacts.C3782f;
import app.zenly.locator.friendshipfacts.FriendshipFactsModule;
import app.zenly.locator.friendshipfacts.FriendshipFactsModuleProvider;
import app.zenly.locator.map.p104di.C3913a;
import app.zenly.locator.map.p104di.MapModuleProvider;
import app.zenly.locator.notifications.p122di.C4720a;
import app.zenly.locator.notifications.p122di.NotificationModuleProvider;
import app.zenly.locator.p042b0.C1691c;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.powermoves.p132di.C5020a;
import app.zenly.locator.powermoves.p132di.PowerMovesModuleProvider;
import app.zenly.locator.recommendation.C5263h;
import app.zenly.locator.recommendation.RecommendationModuleProvider;
import app.zenly.locator.support.p168di.C5663a;
import app.zenly.locator.support.p168di.SupportModuleProvider;
import app.zenly.locator.userprofile.p198me.appicons.AppIconsPrefsProvider;
import app.zenly.locator.userprofile.p198me.appicons.C6052e;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.core.ZenlyCore;

public final class ZenlyApplication extends Application implements DescendantsModuleProvider, StoreModuleProvider, ManagerModuleProvider, AppIconsPrefsProvider, AuthenticatedNotifierProvider, MapModuleProvider, NotificationModuleProvider, SpamPreventionModuleProvider, RecommendationModuleProvider, SupportModuleProvider, FriendshipFactsModuleProvider, DecisionApiProvider, PowerMovesModuleProvider {

    /* renamed from: p */
    static final /* synthetic */ KProperty[] f5343p;

    /* renamed from: e */
    private final Lazy f5344e = C12896f.m33751a(C1499k.f5365f);

    /* renamed from: f */
    private final Lazy f5345f = C12896f.m33751a(new C1495g(this));

    /* renamed from: g */
    private final Lazy f5346g = C12896f.m33751a(new C1496h(this));

    /* renamed from: h */
    private final Lazy f5347h = C12896f.m33751a(new C1497i(this));

    /* renamed from: i */
    private final Lazy f5348i = C12896f.m33751a(new C1493e(this));

    /* renamed from: j */
    private final Lazy f5349j = C12896f.m33751a(new C1494f(this));

    /* renamed from: k */
    private final Lazy f5350k = C12896f.m33751a(new C1498j(this));

    /* renamed from: l */
    private final Lazy f5351l = C12896f.m33751a(new C1500l(this));

    /* renamed from: m */
    private final AppLifecycleDispatcher f5352m = new AppLifecycleDispatcher(C3818g.m11315a(), new C1489a(this), new C1490b(this));

    /* renamed from: n */
    private final Lazy f5353n = C12896f.m33751a(new C1492d(this));

    /* renamed from: o */
    private final Lazy f5354o = C12896f.m33751a(new C1491c(this));

    /* renamed from: app.zenly.locator.ZenlyApplication$a */
    public static final class C1489a implements Provider<Set<? extends AppLifecycleObserver>> {

        /* renamed from: a */
        final /* synthetic */ ZenlyApplication f5355a;

        public C1489a(ZenlyApplication zenlyApplication) {
            this.f5355a = zenlyApplication;
        }

        public Set<? extends AppLifecycleObserver> get() {
            return C1745c.m7147b(this.f5355a);
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$b */
    public static final class C1490b implements Provider<Set<? extends AppLifecycleObserver>> {

        /* renamed from: a */
        final /* synthetic */ ZenlyApplication f5356a;

        public C1490b(ZenlyApplication zenlyApplication) {
            this.f5356a = zenlyApplication;
        }

        public Set<? extends AppLifecycleObserver> get() {
            return C1745c.m7146a(this.f5356a);
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$c */
    static final class C1491c extends C12933k implements Function0<C6052e> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5357f;

        C1491c(ZenlyApplication zenlyApplication) {
            this.f5357f = zenlyApplication;
            super(0);
        }

        public final C6052e invoke() {
            return new C6052e(C5407g.f13966d.mo12991a(this.f5357f));
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$d */
    static final class C1492d extends C12933k implements Function0<C1322a> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5358f;

        C1492d(ZenlyApplication zenlyApplication) {
            this.f5358f = zenlyApplication;
            super(0);
        }

        public final C1322a invoke() {
            ZenlyCore a = C5448c.m15478a();
            C5407g a2 = C5407g.f13966d.mo12991a(this.f5358f);
            C4958p a3 = C4958p.f12964b.mo12157a(this.f5358f);
            C1322a aVar = new C1322a();
            aVar.mo6510a(new C3445a(a), new C3447b(a), new C3449c(), new C3453e(a3), new C3457g(), new C3467l(a), new C3469m(a), new C3473o(), new C3477q(), new C3483t(a), new C3455f(this.f5358f), new C3463j(a, a3), new C3461i(a, a3), new C3459h(a, a3), new C3475p(a, a3), new C3479r(a), new C3451d(a), new C3481s(a2, a3), new C3465k(a), new C3471n(a));
            return aVar;
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$e */
    static final class C1493e extends C12933k implements Function0<C3506c> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5359f;

        C1493e(ZenlyApplication zenlyApplication) {
            this.f5359f = zenlyApplication;
            super(0);
        }

        public final C3506c invoke() {
            ZenlyApplication zenlyApplication = this.f5359f;
            ZenlyCore a = C5448c.m15478a();
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            return new C3506c(zenlyApplication, a, U);
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$f */
    static final class C1494f extends C12933k implements Function0<C3782f> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5360f;

        C1494f(ZenlyApplication zenlyApplication) {
            this.f5360f = zenlyApplication;
            super(0);
        }

        public final C3782f invoke() {
            return new C3782f(this.f5360f);
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$g */
    static final class C1495g extends C12933k implements Function0<C2660a> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5361f;

        C1495g(ZenlyApplication zenlyApplication) {
            this.f5361f = zenlyApplication;
            super(0);
        }

        public final C2660a invoke() {
            return new C2660a(this.f5361f);
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$h */
    static final class C1496h extends C12933k implements Function0<C3913a> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5362f;

        C1496h(ZenlyApplication zenlyApplication) {
            this.f5362f = zenlyApplication;
            super(0);
        }

        public final C3913a invoke() {
            return new C3913a(this.f5362f);
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$i */
    static final class C1497i extends C12933k implements Function0<C4720a> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5363f;

        C1497i(ZenlyApplication zenlyApplication) {
            this.f5363f = zenlyApplication;
            super(0);
        }

        public final C4720a invoke() {
            return new C4720a(this.f5363f);
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$j */
    static final class C1498j extends C12933k implements Function0<C5020a> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5364f;

        C1498j(ZenlyApplication zenlyApplication) {
            this.f5364f = zenlyApplication;
            super(0);
        }

        public final C5020a invoke() {
            return new C5020a(this.f5364f);
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$k */
    static final class C1499k extends C12933k implements Function0<C3016b> {

        /* renamed from: f */
        public static final C1499k f5365f = new C1499k();

        C1499k() {
            super(0);
        }

        public final C3016b invoke() {
            return new C3016b();
        }
    }

    /* renamed from: app.zenly.locator.ZenlyApplication$l */
    static final class C1500l extends C12933k implements Function0<C5663a> {

        /* renamed from: f */
        final /* synthetic */ ZenlyApplication f5366f;

        C1500l(ZenlyApplication zenlyApplication) {
            this.f5366f = zenlyApplication;
            super(0);
        }

        public final C5663a invoke() {
            return new C5663a(this.f5366f);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(ZenlyApplication.class), "storeModule", "getStoreModule()Lapp/zenly/locator/core/store/di/ZenStoreModule;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "managerModule", "getManagerModule()Lapp/zenly/locator/core/manager/di/ManagerModule;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "mapModule", "getMapModule()Lapp/zenly/locator/map/di/MapModule;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "notificationModule", "getNotificationModule()Lapp/zenly/locator/notifications/di/NotificationModule;");
        C12946x.m33839a((C12940r) sVar4);
        C12941s sVar5 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "descendantModule", "getDescendantModule()Lapp/zenly/locator/descendants/ZenDescendantsModule;");
        C12946x.m33839a((C12940r) sVar5);
        C12941s sVar6 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "friendshipFactsModule", "getFriendshipFactsModule()Lapp/zenly/locator/friendshipfacts/ZenFriendshipFactsModule;");
        C12946x.m33839a((C12940r) sVar6);
        C12941s sVar7 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "powerMovesModule", "getPowerMovesModule()Lapp/zenly/locator/powermoves/di/PowerMovesModule;");
        C12946x.m33839a((C12940r) sVar7);
        C12941s sVar8 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "supportModule", "getSupportModule()Lapp/zenly/locator/support/di/SupportModule;");
        C12946x.m33839a((C12940r) sVar8);
        C12941s sVar9 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "decisionApi", "getDecisionApi()Lapp/zenly/android/feature/base/decision/DecisionApi;");
        C12946x.m33839a((C12940r) sVar9);
        C12941s sVar10 = new C12941s(C12946x.m33834a(ZenlyApplication.class), "appIconsPrefs", "getAppIconsPrefs()Lapp/zenly/locator/userprofile/me/appicons/AppIconsPrefs;");
        C12946x.m33839a((C12940r) sVar10);
        f5343p = new KProperty[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6, sVar7, sVar8, sVar9, sVar10};
    }

    /* renamed from: a */
    private final C6052e m6640a() {
        Lazy lazy = this.f5354o;
        KProperty kProperty = f5343p[9];
        return (C6052e) lazy.getValue();
    }

    /* renamed from: b */
    private final C1322a m6641b() {
        Lazy lazy = this.f5353n;
        KProperty kProperty = f5343p[8];
        return (C1322a) lazy.getValue();
    }

    /* renamed from: c */
    private final C3506c m6642c() {
        Lazy lazy = this.f5348i;
        KProperty kProperty = f5343p[4];
        return (C3506c) lazy.getValue();
    }

    /* renamed from: d */
    private final C3782f m6643d() {
        Lazy lazy = this.f5349j;
        KProperty kProperty = f5343p[5];
        return (C3782f) lazy.getValue();
    }

    /* renamed from: e */
    private final C2660a m6644e() {
        Lazy lazy = this.f5345f;
        KProperty kProperty = f5343p[1];
        return (C2660a) lazy.getValue();
    }

    /* renamed from: f */
    private final C3913a m6645f() {
        Lazy lazy = this.f5346g;
        KProperty kProperty = f5343p[2];
        return (C3913a) lazy.getValue();
    }

    /* renamed from: g */
    private final C4720a m6646g() {
        Lazy lazy = this.f5347h;
        KProperty kProperty = f5343p[3];
        return (C4720a) lazy.getValue();
    }

    /* renamed from: h */
    private final C5020a m6647h() {
        Lazy lazy = this.f5350k;
        KProperty kProperty = f5343p[6];
        return (C5020a) lazy.getValue();
    }

    /* renamed from: i */
    private final C3016b m6648i() {
        Lazy lazy = this.f5344e;
        KProperty kProperty = f5343p[0];
        return (C3016b) lazy.getValue();
    }

    /* renamed from: j */
    private final C5663a m6649j() {
        Lazy lazy = this.f5351l;
        KProperty kProperty = f5343p[7];
        return (C5663a) lazy.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0105, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0109, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0113, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0119, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0122, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate() {
        /*
            r4 = this;
            java.lang.String r0 = "ProcessLifecycleOwner.get()"
            java.lang.String r1 = "ZenlyApplication.onCreate"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r1)
            super.onCreate()     // Catch:{ all -> 0x0123 }
            boolean r1 = app.zenly.locator.C4734o.m13751a(r4)     // Catch:{ all -> 0x0123 }
            if (r1 != 0) goto L_0x0014
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
            return
        L_0x0014:
            boolean r1 = app.zenly.locator.core.util.C3237t.m10267b(r4)     // Catch:{ all -> 0x0123 }
            if (r1 != 0) goto L_0x001e
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
            return
        L_0x001e:
            java.lang.String r1 = "crashlytics:init"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r1)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.f r1 = app.zenly.locator.C3763f.f10063a     // Catch:{ all -> 0x011e }
            r1.mo10321a(r4)     // Catch:{ all -> 0x011e }
            co.znly.models.n2 r1 = p213co.znly.core.ZenlyCore.lastSession(r4)     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0033
            app.zenly.locator.f r2 = app.zenly.locator.C3763f.f10063a     // Catch:{ all -> 0x011e }
            r2.mo10322a(r1)     // Catch:{ all -> 0x011e }
        L_0x0033:
            kotlin.q r1 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x011e }
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            app.zenly.locator.p$a r1 = app.zenly.locator.C4958p.f12964b     // Catch:{ all -> 0x0123 }
            app.zenly.locator.p r1 = r1.mo12157a(r4)     // Catch:{ all -> 0x0123 }
            java.lang.String r2 = "prefs:tweaks:instabugEnabled"
            r3 = 1
            r1.mo12155a(r2, r3)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.C3890k.m11459a(r4)     // Catch:{ all -> 0x0123 }
            app.zenly.android.feature.base.scheduling.C1352f.m6377h()     // Catch:{ all -> 0x0123 }
            app.zenly.locator.p143s.C5405f.m15384a()     // Catch:{ all -> 0x0123 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0123 }
            r2 = 26
            if (r1 < r2) goto L_0x0060
            app.zenly.locator.notifications.NotificationChannelsHelper r1 = new app.zenly.locator.notifications.NotificationChannelsHelper     // Catch:{ all -> 0x0123 }
            r1.<init>(r4)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.notifications.b r1 = new app.zenly.locator.notifications.b     // Catch:{ all -> 0x0123 }
            r1.<init>(r4)     // Catch:{ all -> 0x0123 }
            r1.mo11902a()     // Catch:{ all -> 0x0123 }
        L_0x0060:
            java.lang.String r1 = "core:touch"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r1)     // Catch:{ all -> 0x0123 }
            p213co.znly.zenlygocore.Zenlygocore.touch()     // Catch:{ all -> 0x0119 }
            kotlin.q r1 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x0119 }
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "core:paniclogger"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r1)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.f r1 = app.zenly.locator.C3763f.f10063a     // Catch:{ all -> 0x0114 }
            r1.mo10320a()     // Catch:{ all -> 0x0114 }
            kotlin.q r1 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x0114 }
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            app.zenly.locator.core.helper.AuthenticatedSessionLifecycleOwner$a r1 = app.zenly.locator.core.helper.AuthenticatedSessionLifecycleOwner.f7494i     // Catch:{ all -> 0x0123 }
            androidx.lifecycle.LifecycleOwner r2 = androidx.lifecycle.C0876p.m4065g()     // Catch:{ all -> 0x0123 }
            kotlin.jvm.internal.C12932j.m33815a(r2, r0)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.g r3 = app.zenly.locator.C3818g.m11315a()     // Catch:{ all -> 0x0123 }
            r1.mo8562a(r2, r3)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "analytics:init"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r1)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.s.i.e.a r1 = new app.zenly.locator.s.i.e.a     // Catch:{ all -> 0x010f }
            app.zenly.locator.decision.b.u.e r2 = app.zenly.locator.decision.p082b.p083u.C3489e.f9471a     // Catch:{ all -> 0x010f }
            boolean r2 = r2.isOpen()     // Catch:{ all -> 0x010f }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x010f }
            app.zenly.locator.p143s.C5343a.m15162a(r1)     // Catch:{ all -> 0x010f }
            kotlin.q r1 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x010f }
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            app.zenly.locator.f r1 = app.zenly.locator.C3763f.f10063a     // Catch:{ all -> 0x0123 }
            r1.mo10323b()     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "core:init"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r1)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.p143s.p148l.C5448c.m15479a(r4)     // Catch:{ all -> 0x010a }
            kotlin.q r1 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x010a }
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            app.zenly.android.feature.base.scheduling.C1352f.m6376g()     // Catch:{ all -> 0x0123 }
            app.zenly.locator.core.app.C2451c.m8551a(r4)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.p143s.p160v.C5514a.m15635a(r4)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.core.manager.l5$a r1 = app.zenly.locator.core.manager.C2733l5.f7951b     // Catch:{ all -> 0x0123 }
            r1.mo8803a(r4)     // Catch:{ all -> 0x0123 }
            app.zenly.locator.core.manager.j5$a r1 = app.zenly.locator.core.manager.C2710j5.f7884a     // Catch:{ all -> 0x0123 }
            app.zenly.locator.core.manager.l5$a r2 = app.zenly.locator.core.manager.C2733l5.f7951b     // Catch:{ all -> 0x0123 }
            app.zenly.locator.core.manager.l5 r2 = r2.mo8802a()     // Catch:{ all -> 0x0123 }
            r1.mo8775a(r4, r2)     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "patchStaticConstructorMap"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r1)     // Catch:{ all -> 0x0123 }
            r1 = 0
            com.snap.p327ui.recycling.factory.C11726b.m30817a(r1)     // Catch:{ all -> 0x0105 }
            kotlin.q r1 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x0105 }
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            java.lang.String r1 = "patchStaticTypefaceCache"
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18761b(r1)     // Catch:{ all -> 0x0123 }
            p333g.p378f.p380b.p381a.C12123e.m31999a()     // Catch:{ all -> 0x0100 }
            kotlin.q r1 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x0100 }
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            androidx.lifecycle.LifecycleOwner r1 = androidx.lifecycle.C0876p.m4065g()     // Catch:{ all -> 0x0123 }
            kotlin.jvm.internal.C12932j.m33815a(r1, r0)     // Catch:{ all -> 0x0123 }
            androidx.lifecycle.g r0 = r1.getLifecycle()     // Catch:{ all -> 0x0123 }
            app.zenly.locator.AppLifecycleDispatcher r1 = r4.f5352m     // Catch:{ all -> 0x0123 }
            r0.mo4446a(r1)     // Catch:{ all -> 0x0123 }
            kotlin.q r0 = kotlin.C12956q.f33541a     // Catch:{ all -> 0x0123 }
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
            return
        L_0x0100:
            r0 = move-exception
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x0105:
            r0 = move-exception
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x010a:
            r0 = move-exception
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x010f:
            r0 = move-exception
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x0114:
            r0 = move-exception
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x0119:
            r0 = move-exception
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x011e:
            r0 = move-exception
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()     // Catch:{ all -> 0x0123 }
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r0 = move-exception
            p250f.p251a.p252a.p263b.p264a.p271i.C7707a.m18759a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.ZenlyApplication.onCreate():void");
    }

    public C6052e provideAppIconsPrefs() {
        return m6640a();
    }

    public AuthenticatedNotifier provideAuthenticatedNotifier() {
        return C3818g.m11315a();
    }

    public C1322a provideDecisionApi() {
        return m6641b();
    }

    public DescendantsModule provideDescendantsModule() {
        return m6642c();
    }

    public FriendshipFactsModule provideFriendshipFactsModule() {
        return m6643d();
    }

    public C2660a provideManagerModule() {
        return m6644e();
    }

    public C3913a provideMapModule() {
        return m6645f();
    }

    public C4720a provideNotificationModule() {
        return m6646g();
    }

    public C5020a providePowerMovesModule() {
        return m6647h();
    }

    public C5263h provideRecommendationModule() {
        return new C5263h(this, C5448c.m15478a());
    }

    public SpamPreventionModule provideSpamPreventionModule() {
        C1691c cVar = new C1691c(this, m6648i().provideFriendRequestStore(), m6648i().provideAlreadyOnZenlyStore(), C5448c.m15478a(), m6644e().mo8764b());
        return cVar;
    }

    public StoreModule provideStoreModule() {
        return m6648i();
    }

    public C5663a provideSupportModule() {
        return m6649j();
    }
}
