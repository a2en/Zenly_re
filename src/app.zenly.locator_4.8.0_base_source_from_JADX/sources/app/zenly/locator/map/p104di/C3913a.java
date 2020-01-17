package app.zenly.locator.map.p104di;

import android.content.Context;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.C2741m5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.PlaceManager;
import app.zenly.locator.core.manager.PlaceManager.Formatter;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.map.p109i1.C4031m1;
import app.zenly.locator.map.p109i1.C4037n1;
import app.zenly.locator.map.p109i1.C4047p1;
import app.zenly.locator.map.p109i1.C4059r1;
import app.zenly.locator.map.text.C4300c;
import app.zenly.locator.map.text.ContextualLabelingFormatterVariant;
import app.zenly.locator.p044c0.C1758a;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12938p;
import kotlin.jvm.internal.C12939q;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.map.di.a */
public final class C3913a {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f10371f;

    /* renamed from: a */
    private final Lazy f10372a = C12896f.m33751a(new C3927d(this));

    /* renamed from: b */
    private final Lazy f10373b = C12896f.m33751a(new C3923b(this));

    /* renamed from: c */
    private final Lazy f10374c = C12896f.m33751a(new C3914a(this));

    /* renamed from: d */
    private final Lazy f10375d = C12896f.m33751a(new C3924c(this));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Context f10376e;

    /* renamed from: app.zenly.locator.map.di.a$a */
    static final class C3914a extends C12933k implements Function0<C4031m1> {

        /* renamed from: f */
        final /* synthetic */ C3913a f10377f;

        /* renamed from: app.zenly.locator.map.di.a$a$a */
        public static final class C3915a implements Provider<C2718k5> {

            /* renamed from: a */
            final /* synthetic */ C3914a f10378a;

            public C3915a(C3914a aVar) {
                this.f10378a = aVar;
            }

            public C2718k5 get() {
                return C2666b.m9049a(this.f10378a.f10377f.f10376e).mo8763a();
            }
        }

        /* renamed from: app.zenly.locator.map.di.a$a$b */
        public static final class C3916b implements Provider<PlaceManager> {

            /* renamed from: a */
            final /* synthetic */ C3914a f10379a;

            public C3916b(C3914a aVar) {
                this.f10379a = aVar;
            }

            public PlaceManager get() {
                return this.f10379a.f10377f.m11524h();
            }
        }

        /* renamed from: app.zenly.locator.map.di.a$a$c */
        public static final class C3917c implements Provider<C4037n1> {

            /* renamed from: a */
            final /* synthetic */ Lazy f10380a;

            /* renamed from: b */
            final /* synthetic */ KProperty f10381b;

            public C3917c(Lazy lazy, KProperty kProperty) {
                this.f10380a = lazy;
                this.f10381b = kProperty;
            }

            public C4037n1 get() {
                return (C4037n1) this.f10380a.getValue();
            }
        }

        /* renamed from: app.zenly.locator.map.di.a$a$d */
        public static final class C3918d implements Provider<ContextualLabelingFormatterVariant> {

            /* renamed from: a */
            final /* synthetic */ C3914a f10382a;

            public C3918d(C3914a aVar) {
                this.f10382a = aVar;
            }

            public ContextualLabelingFormatterVariant get() {
                return this.f10382a.f10377f.m11522f();
            }
        }

        /* renamed from: app.zenly.locator.map.di.a$a$e */
        static final class C3919e extends C12933k implements Function0<C4037n1> {

            /* renamed from: f */
            final /* synthetic */ C3914a f10383f;

            /* renamed from: app.zenly.locator.map.di.a$a$e$a */
            public static final class C3920a implements Provider<C2718k5> {

                /* renamed from: a */
                final /* synthetic */ C3919e f10384a;

                public C3920a(C3919e eVar) {
                    this.f10384a = eVar;
                }

                public C2718k5 get() {
                    return C2666b.m9049a(this.f10384a.f10383f.f10377f.f10376e).mo8763a();
                }
            }

            /* renamed from: app.zenly.locator.map.di.a$a$e$b */
            public static final class C3921b implements Provider<C4059r1> {
                public C4059r1 get() {
                    return C4059r1.m11760g();
                }
            }

            /* renamed from: app.zenly.locator.map.di.a$a$e$c */
            public static final class C3922c implements Provider<ContextualLabelingFormatterVariant> {

                /* renamed from: a */
                final /* synthetic */ C3919e f10385a;

                public C3922c(C3919e eVar) {
                    this.f10385a = eVar;
                }

                public ContextualLabelingFormatterVariant get() {
                    return this.f10385a.f10383f.f10377f.m11522f();
                }
            }

            C3919e(C3914a aVar) {
                this.f10383f = aVar;
                super(0);
            }

            public final C4037n1 invoke() {
                return new C4037n1(new C3920a(this), new C3921b(), new C3922c(this));
            }
        }

        C3914a(C3913a aVar) {
            this.f10377f = aVar;
            super(0);
        }

        public final C4031m1 invoke() {
            return new C4031m1(new C3915a(this), new C3916b(this), new C3917c(C12896f.m33751a(new C3919e(this)), C3913a.f10371f[3]), new C3918d(this));
        }
    }

    /* renamed from: app.zenly.locator.map.di.a$b */
    static final class C3923b extends C12933k implements Function0<C4300c> {

        /* renamed from: f */
        final /* synthetic */ C3913a f10386f;

        C3923b(C3913a aVar) {
            this.f10386f = aVar;
            super(0);
        }

        public final C4300c invoke() {
            return new C4300c(this.f10386f.f10376e);
        }
    }

    /* renamed from: app.zenly.locator.map.di.a$c */
    static final class C3924c extends C12933k implements Function0<C2741m5> {

        /* renamed from: f */
        final /* synthetic */ C3913a f10387f;

        /* renamed from: app.zenly.locator.map.di.a$c$a */
        public static final class C3925a implements Provider<MeUserManager> {

            /* renamed from: a */
            final /* synthetic */ C3924c f10388a;

            public C3925a(C3924c cVar) {
                this.f10388a = cVar;
            }

            public MeUserManager get() {
                return C2666b.m9049a(this.f10388a.f10387f.f10376e).mo8764b();
            }
        }

        /* renamed from: app.zenly.locator.map.di.a$c$b */
        public static final class C3926b implements Provider<C2718k5> {

            /* renamed from: a */
            final /* synthetic */ C3924c f10389a;

            public C3926b(C3924c cVar) {
                this.f10389a = cVar;
            }

            public C2718k5 get() {
                return C2666b.m9049a(this.f10389a.f10387f.f10376e).mo8763a();
            }
        }

        C3924c(C3913a aVar) {
            this.f10387f = aVar;
            super(0);
        }

        public final C2741m5 invoke() {
            return new C2741m5(new C3925a(this), new C3926b(this));
        }
    }

    /* renamed from: app.zenly.locator.map.di.a$d */
    static final class C3927d extends C12933k implements Function0<PlaceManager> {

        /* renamed from: f */
        final /* synthetic */ C3913a f10390f;

        /* renamed from: app.zenly.locator.map.di.a$d$a */
        public static final class C3928a implements Provider<C2718k5> {

            /* renamed from: a */
            final /* synthetic */ C3927d f10391a;

            public C3928a(C3927d dVar) {
                this.f10391a = dVar;
            }

            public C2718k5 get() {
                return C2666b.m9049a(this.f10391a.f10390f.f10376e).mo8763a();
            }
        }

        /* renamed from: app.zenly.locator.map.di.a$d$b */
        public static final class C3929b implements Provider<Formatter> {

            /* renamed from: a */
            final /* synthetic */ C3927d f10392a;

            public C3929b(C3927d dVar) {
                this.f10392a = dVar;
            }

            public Formatter get() {
                return new C1758a(this.f10392a.f10390f.f10376e);
            }
        }

        C3927d(C3913a aVar) {
            this.f10390f = aVar;
            super(0);
        }

        public final PlaceManager invoke() {
            return new PlaceManager(this.f10390f.f10376e, new C3928a(this), new C3929b(this));
        }
    }

    static {
        Class<C3913a> cls = C3913a.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "placeManager", "getPlaceManager()Lapp/zenly/locator/core/manager/PlaceManager;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "formatter", "getFormatter()Lapp/zenly/locator/map/text/ContextualLabelingFormatterVariantImpl;");
        C12946x.m33839a((C12940r) sVar2);
        C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "contextualLabelingManager", "getContextualLabelingManager()Lapp/zenly/locator/map/manager/ContextualLabelingManager;");
        C12946x.m33839a((C12940r) sVar3);
        C12939q qVar = new C12939q(C12946x.m33834a((Class) cls), "manager", "<v#0>");
        C12946x.m33838a((C12938p) qVar);
        C12941s sVar4 = new C12941s(C12946x.m33834a((Class) cls), "meetManager", "getMeetManager()Lapp/zenly/locator/core/manager/MeetManager;");
        C12946x.m33839a((C12940r) sVar4);
        f10371f = new KProperty[]{sVar, sVar2, sVar3, qVar, sVar4};
    }

    public C3913a(Context context) {
        C12932j.m33818b(context, "context");
        this.f10376e = context;
    }

    /* renamed from: e */
    private final C4031m1 m11521e() {
        Lazy lazy = this.f10374c;
        KProperty kProperty = f10371f[2];
        return (C4031m1) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final C4300c m11522f() {
        Lazy lazy = this.f10373b;
        KProperty kProperty = f10371f[1];
        return (C4300c) lazy.getValue();
    }

    /* renamed from: g */
    private final C2741m5 m11523g() {
        Lazy lazy = this.f10375d;
        KProperty kProperty = f10371f[4];
        return (C2741m5) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final PlaceManager m11524h() {
        Lazy lazy = this.f10372a;
        KProperty kProperty = f10371f[0];
        return (PlaceManager) lazy.getValue();
    }

    /* renamed from: d */
    public final C4059r1 mo10580d() {
        C4059r1 g = C4059r1.m11760g();
        C12932j.m33815a((Object) g, "WeatherManager.getInstance()");
        return g;
    }

    /* renamed from: a */
    public final C4031m1 mo10577a() {
        return m11521e();
    }

    /* renamed from: b */
    public final C4047p1 mo10578b() {
        C4047p1 a = C4047p1.m11729a(this.f10376e);
        C12932j.m33815a((Object) a, "UserHistoryManager.getInstance(context)");
        return a;
    }

    /* renamed from: c */
    public final C2741m5 mo10579c() {
        return m11523g();
    }
}
