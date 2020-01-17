package app.zenly.locator.core.manager.p069di;

import android.content.Context;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.locator.core.manager.C2694h5;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.C2800q5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.decision.C3444a;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.core.manager.di.a */
public final class C2660a {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f7820f;

    /* renamed from: a */
    private final Lazy f7821a;

    /* renamed from: b */
    private final Lazy f7822b;

    /* renamed from: c */
    private final Lazy f7823c = C12896f.m33751a(new C2665e(this));

    /* renamed from: d */
    private final Lazy f7824d = C12896f.m33751a(new C2663c(this));

    /* renamed from: e */
    private final Lazy f7825e = C12896f.m33751a(C2664d.f7829f);

    /* renamed from: app.zenly.locator.core.manager.di.a$a */
    static final class C2661a extends C12933k implements Function0<C2694h5> {

        /* renamed from: f */
        final /* synthetic */ Context f7826f;

        C2661a(Context context) {
            this.f7826f = context;
            super(0);
        }

        public final C2694h5 invoke() {
            return new C2694h5(this.f7826f);
        }
    }

    /* renamed from: app.zenly.locator.core.manager.di.a$b */
    static final class C2662b extends C12933k implements Function0<C1322a> {

        /* renamed from: f */
        final /* synthetic */ Context f7827f;

        C2662b(Context context) {
            this.f7827f = context;
            super(0);
        }

        public final C1322a invoke() {
            return C3444a.m10686a(this.f7827f);
        }
    }

    /* renamed from: app.zenly.locator.core.manager.di.a$c */
    static final class C2663c extends C12933k implements Function0<C2718k5> {

        /* renamed from: f */
        final /* synthetic */ C2660a f7828f;

        C2663c(C2660a aVar) {
            this.f7828f = aVar;
            super(0);
        }

        public final C2718k5 invoke() {
            return new C2718k5(this.f7828f.m9045h(), this.f7828f.m9041d(), this.f7828f.m9042e());
        }
    }

    /* renamed from: app.zenly.locator.core.manager.di.a$d */
    static final class C2664d extends C12933k implements Function0<C2800q5> {

        /* renamed from: f */
        public static final C2664d f7829f = new C2664d();

        C2664d() {
            super(0);
        }

        public final C2800q5 invoke() {
            return new C2800q5();
        }
    }

    /* renamed from: app.zenly.locator.core.manager.di.a$e */
    static final class C2665e extends C12933k implements Function0<MeUserManager> {

        /* renamed from: f */
        final /* synthetic */ C2660a f7830f;

        C2665e(C2660a aVar) {
            this.f7830f = aVar;
            super(0);
        }

        public final MeUserManager invoke() {
            return new MeUserManager(this.f7830f.m9041d(), this.f7830f.m9042e());
        }
    }

    static {
        Class<C2660a> cls = C2660a.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "bubblesManager", "getBubblesManager()Lapp/zenly/locator/core/manager/BubblesManager;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "decisionApi", "getDecisionApi()Lapp/zenly/android/feature/base/decision/DecisionApi;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "userMeManager", "getUserMeManager()Lapp/zenly/locator/core/manager/MeUserManager;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a((Class) cls), "friendsManager", "getFriendsManager()Lapp/zenly/locator/core/manager/FriendsManager;");
        C12946x.m33839a((C12940r) sVar4);
        C12941s sVar5 = new C12941s(C12946x.m33834a((Class) cls), "userAvatarManager", "getUserAvatarManager()Lapp/zenly/locator/core/manager/UserAvatarManager;");
        C12946x.m33839a((C12940r) sVar5);
        f7820f = new KProperty[]{sVar, sVar2, sVar3, sVar4, sVar5};
    }

    public C2660a(Context context) {
        C12932j.m33818b(context, "context");
        this.f7821a = C12896f.m33751a(new C2661a(context));
        this.f7822b = C12896f.m33751a(new C2662b(context));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final C2694h5 m9041d() {
        Lazy lazy = this.f7821a;
        KProperty kProperty = f7820f[0];
        return (C2694h5) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final C1322a m9042e() {
        Lazy lazy = this.f7822b;
        KProperty kProperty = f7820f[1];
        return (C1322a) lazy.getValue();
    }

    /* renamed from: f */
    private final C2718k5 m9043f() {
        Lazy lazy = this.f7824d;
        KProperty kProperty = f7820f[3];
        return (C2718k5) lazy.getValue();
    }

    /* renamed from: g */
    private final C2800q5 m9044g() {
        Lazy lazy = this.f7825e;
        KProperty kProperty = f7820f[4];
        return (C2800q5) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final MeUserManager m9045h() {
        Lazy lazy = this.f7823c;
        KProperty kProperty = f7820f[2];
        return (MeUserManager) lazy.getValue();
    }

    /* renamed from: a */
    public final C2718k5 mo8763a() {
        return m9043f();
    }

    /* renamed from: b */
    public final MeUserManager mo8764b() {
        return m9045h();
    }

    /* renamed from: c */
    public final C2800q5 mo8765c() {
        return m9044g();
    }
}
