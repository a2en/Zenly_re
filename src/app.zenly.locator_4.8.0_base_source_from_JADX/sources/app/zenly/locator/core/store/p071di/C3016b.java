package app.zenly.locator.core.store.p071di;

import app.zenly.locator.core.store.C2931a;
import app.zenly.locator.core.store.C3010c;
import app.zenly.locator.core.store.C3023e;
import app.zenly.locator.core.store.C3027g;
import app.zenly.locator.core.store.C3034i;
import app.zenly.locator.core.store.C3045k;
import app.zenly.locator.core.store.api.C2966p;
import app.zenly.locator.core.store.api.C2976r;
import app.zenly.locator.core.store.api.C2986t;
import app.zenly.locator.core.store.api.C2992v;
import app.zenly.locator.core.store.api.C2998x;
import app.zenly.locator.core.store.api.C3005z;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.core.store.di.b */
public final class C3016b implements StoreModule {

    /* renamed from: g */
    static final /* synthetic */ KProperty[] f8406g;

    /* renamed from: a */
    private final Lazy f8407a = C12896f.m33751a(C3018b.f8414f);

    /* renamed from: b */
    private final Lazy f8408b = C12896f.m33751a(new C3020d(this));

    /* renamed from: c */
    private final Lazy f8409c = C12896f.m33751a(C3019c.f8415f);

    /* renamed from: d */
    private final Lazy f8410d = C12896f.m33751a(C3017a.f8413f);

    /* renamed from: e */
    private final Lazy f8411e = C12896f.m33751a(C3022f.f8418f);

    /* renamed from: f */
    private final Lazy f8412f = C12896f.m33751a(C3021e.f8417f);

    /* renamed from: app.zenly.locator.core.store.di.b$a */
    static final class C3017a extends C12933k implements Function0<C2931a> {

        /* renamed from: f */
        public static final C3017a f8413f = new C3017a();

        C3017a() {
            super(0);
        }

        public final C2931a invoke() {
            return new C2931a(C2966p.f8355b);
        }
    }

    /* renamed from: app.zenly.locator.core.store.di.b$b */
    static final class C3018b extends C12933k implements Function0<C3023e> {

        /* renamed from: f */
        public static final C3018b f8414f = new C3018b();

        C3018b() {
            super(0);
        }

        public final C3023e invoke() {
            return new C3023e(C2992v.f8382b);
        }
    }

    /* renamed from: app.zenly.locator.core.store.di.b$c */
    static final class C3019c extends C12933k implements Function0<C3027g> {

        /* renamed from: f */
        public static final C3019c f8415f = new C3019c();

        C3019c() {
            super(0);
        }

        public final C3027g invoke() {
            return new C3027g(C2998x.f8389b);
        }
    }

    /* renamed from: app.zenly.locator.core.store.di.b$d */
    static final class C3020d extends C12933k implements Function0<C3034i> {

        /* renamed from: f */
        final /* synthetic */ C3016b f8416f;

        C3020d(C3016b bVar) {
            this.f8416f = bVar;
            super(0);
        }

        public final C3034i invoke() {
            return new C3034i(this.f8416f.m9529b(), C2986t.f8375b);
        }
    }

    /* renamed from: app.zenly.locator.core.store.di.b$e */
    static final class C3021e extends C12933k implements Function0<C3045k> {

        /* renamed from: f */
        public static final C3021e f8417f = new C3021e();

        C3021e() {
            super(0);
        }

        public final C3045k invoke() {
            return new C3045k(C3005z.f8396b);
        }
    }

    /* renamed from: app.zenly.locator.core.store.di.b$f */
    static final class C3022f extends C12933k implements Function0<C3010c> {

        /* renamed from: f */
        public static final C3022f f8418f = new C3022f();

        C3022f() {
            super(0);
        }

        public final C3010c invoke() {
            return new C3010c(C2976r.f8365b);
        }
    }

    static {
        Class<C3016b> cls = C3016b.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "bestFriendStore", "getBestFriendStore()Lapp/zenly/locator/core/store/DefaultFriendRankStore;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "friendStore", "getFriendStore()Lapp/zenly/locator/core/store/DefaultFriendStore;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "friendRequestStore", "getFriendRequestStore()Lapp/zenly/locator/core/store/DefaultFriendRequestStore;");
        C12946x.m33839a((C12940r) sVar3);
        C12941s sVar4 = new C12941s(C12946x.m33834a((Class) cls), "aozStore", "getAozStore()Lapp/zenly/locator/core/store/DefaultContactAlreadyOnZenlyStore;");
        C12946x.m33839a((C12940r) sVar4);
        C12941s sVar5 = new C12941s(C12946x.m33834a((Class) cls), "soonStore", "getSoonStore()Lapp/zenly/locator/core/store/DefaultContactSoonOnZenlyStore;");
        C12946x.m33839a((C12940r) sVar5);
        C12941s sVar6 = new C12941s(C12946x.m33834a((Class) cls), "friendshipStore", "getFriendshipStore()Lapp/zenly/locator/core/store/DefaultFriendshipStore;");
        C12946x.m33839a((C12940r) sVar6);
        f8406g = new KProperty[]{sVar, sVar2, sVar3, sVar4, sVar5, sVar6};
    }

    /* renamed from: a */
    private final C2931a m9527a() {
        Lazy lazy = this.f8410d;
        KProperty kProperty = f8406g[3];
        return (C2931a) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C3023e m9529b() {
        Lazy lazy = this.f8407a;
        KProperty kProperty = f8406g[0];
        return (C3023e) lazy.getValue();
    }

    /* renamed from: c */
    private final C3027g m9530c() {
        Lazy lazy = this.f8409c;
        KProperty kProperty = f8406g[2];
        return (C3027g) lazy.getValue();
    }

    /* renamed from: d */
    private final C3034i m9531d() {
        Lazy lazy = this.f8408b;
        KProperty kProperty = f8406g[1];
        return (C3034i) lazy.getValue();
    }

    /* renamed from: e */
    private final C3045k m9532e() {
        Lazy lazy = this.f8412f;
        KProperty kProperty = f8406g[5];
        return (C3045k) lazy.getValue();
    }

    /* renamed from: f */
    private final C3010c m9533f() {
        Lazy lazy = this.f8411e;
        KProperty kProperty = f8406g[4];
        return (C3010c) lazy.getValue();
    }

    public C2931a provideAlreadyOnZenlyStore() {
        return m9527a();
    }

    public C3023e provideFriendRankStore() {
        return m9529b();
    }

    public C3027g provideFriendRequestStore() {
        return m9530c();
    }

    public C3034i provideFriendStore() {
        return m9531d();
    }

    public C3045k provideFriendshipStore() {
        return m9532e();
    }

    public C3010c provideSoonOnZenlyStore() {
        return m9533f();
    }
}
