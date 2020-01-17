package app.zenly.locator.p143s;

import android.content.Context;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.AppLifecycleObserver;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.util.C3196c0;
import app.zenly.locator.p143s.p144i.C5424a;
import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.userprofile.p198me.appicons.C6042a;
import app.zenly.locator.userprofile.p198me.appicons.C6042a.C6044b;
import app.zenly.locator.userprofile.p198me.appicons.C6050d;
import app.zenly.locator.userprofile.p198me.appicons.C6052e;
import app.zenly.locator.userprofile.p198me.appicons.C6058i;
import java.util.Collection;
import java.util.List;
import kotlin.C12899i;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7286e2;
import p213co.znly.models.PlaceProto$Place;
import p213co.znly.models.PlaceProto$Place.C6845c;
import p213co.znly.models.PlaceProto$Place.C6845c.C6847b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$UserEngagementStats;
import p213co.znly.models.UserProto$UserEngagementStats.C6929b;
import p213co.znly.models.core.C7219t0;
import p213co.znly.models.core.C7243w0;
import p213co.znly.models.services.C8230p5;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.s.b */
public final class C5367b implements AppLifecycleObserver {

    /* renamed from: e */
    static final /* synthetic */ KProperty[] f13908e;

    /* renamed from: a */
    private final ZenlySchedulers f13909a = C1351e.m6372a(C5424a.f13975b.mo19916a("traitsManager"));

    /* renamed from: b */
    private final Lazy f13910b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f13911c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ZenlyCore f13912d;

    /* renamed from: app.zenly.locator.s.b$a */
    public static final class C5368a {
        private C5368a() {
        }

        public /* synthetic */ C5368a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.s.b$b */
    private static final class C5369b {

        /* renamed from: a */
        private final String f13913a;

        /* renamed from: b */
        private final String f13914b;

        /* renamed from: c */
        private final String f13915c;

        public C5369b(String str) {
            C12932j.m33818b(str, "key");
            this.f13915c = str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f13915c);
            sb.append("_control_a");
            this.f13913a = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f13915c);
            sb2.append("_control_b");
            this.f13914b = sb2.toString();
        }

        /* renamed from: a */
        public final String mo12915a() {
            return this.f13913a;
        }

        /* renamed from: b */
        public final String mo12916b() {
            return this.f13914b;
        }

        /* renamed from: c */
        public final String mo12917c() {
            return this.f13915c;
        }
    }

    /* renamed from: app.zenly.locator.s.b$c */
    private static final class C5370c {

        /* renamed from: h */
        static final /* synthetic */ KProperty[] f13916h;

        /* renamed from: a */
        private final C12279e<UserProto$User> f13917a;

        /* renamed from: b */
        private final Lazy f13918b = C12896f.m33751a(new C5377g(this));

        /* renamed from: c */
        private final C12279e<Integer> f13919c;

        /* renamed from: d */
        private final C12279e<Integer> f13920d;

        /* renamed from: e */
        private final Context f13921e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final ZenlyCore f13922f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C6052e f13923g;

        /* renamed from: app.zenly.locator.s.b$c$a */
        public static final class C5371a {

            /* renamed from: a */
            private final int f13924a;

            /* renamed from: b */
            private final int f13925b;

            public C5371a(int i, int i2) {
                this.f13924a = i;
                this.f13925b = i2;
            }

            /* renamed from: a */
            public final int mo12926a() {
                return this.f13925b;
            }

            /* renamed from: b */
            public final int mo12927b() {
                return this.f13924a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C5371a) {
                        C5371a aVar = (C5371a) obj;
                        if (this.f13924a == aVar.f13924a) {
                            if (this.f13925b == aVar.f13925b) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return (Integer.valueOf(this.f13924a).hashCode() * 31) + Integer.valueOf(this.f13925b).hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("UserCountsInfo(friendCount=");
                sb.append(this.f13924a);
                sb.append(", aozCount=");
                sb.append(this.f13925b);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$b */
        public static final class C5372b {

            /* renamed from: a */
            private final C6042a f13926a;

            /* renamed from: b */
            private final int f13927b;

            /* renamed from: c */
            private final int f13928c;

            public C5372b(C6042a aVar, int i, int i2) {
                C12932j.m33818b(aVar, "currentAppIcon");
                this.f13926a = aVar;
                this.f13927b = i;
                this.f13928c = i2;
            }

            /* renamed from: a */
            public final C6042a mo12931a() {
                return this.f13926a;
            }

            /* renamed from: b */
            public final int mo12932b() {
                return this.f13927b;
            }

            /* renamed from: c */
            public final int mo12933c() {
                return this.f13928c;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C5372b) {
                        C5372b bVar = (C5372b) obj;
                        if (C12932j.m33817a((Object) this.f13926a, (Object) bVar.f13926a)) {
                            if (this.f13927b == bVar.f13927b) {
                                if (this.f13928c == bVar.f13928c) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C6042a aVar = this.f13926a;
                return ((((aVar != null ? aVar.hashCode() : 0) * 31) + Integer.valueOf(this.f13927b).hashCode()) * 31) + Integer.valueOf(this.f13928c).hashCode();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("UserEngagementInfo(currentAppIcon=");
                sb.append(this.f13926a);
                sb.append(", currentStreak=");
                sb.append(this.f13927b);
                sb.append(", maxStreak=");
                sb.append(this.f13928c);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$c */
        public static final class C5373c {

            /* renamed from: a */
            private final boolean f13929a;

            /* renamed from: b */
            private final boolean f13930b;

            /* renamed from: c */
            private final boolean f13931c;

            public C5373c(boolean z, boolean z2, boolean z3) {
                this.f13929a = z;
                this.f13930b = z2;
                this.f13931c = z3;
            }

            /* renamed from: a */
            public final boolean mo12937a() {
                return this.f13929a;
            }

            /* renamed from: b */
            public final boolean mo12938b() {
                return this.f13931c;
            }

            /* renamed from: c */
            public final boolean mo12939c() {
                return this.f13930b;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C5373c) {
                        C5373c cVar = (C5373c) obj;
                        if (this.f13929a == cVar.f13929a) {
                            if (this.f13930b == cVar.f13930b) {
                                if (this.f13931c == cVar.f13931c) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                boolean z = this.f13929a;
                int i = 1;
                if (z) {
                    z = true;
                }
                int i2 = (z ? 1 : 0) * true;
                boolean z2 = this.f13930b;
                if (z2) {
                    z2 = true;
                }
                int i3 = (i2 + (z2 ? 1 : 0)) * 31;
                boolean z3 = this.f13931c;
                if (!z3) {
                    i = z3;
                }
                return i3 + i;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("UserPlacesInfo(isHomeSet=");
                sb.append(this.f13929a);
                sb.append(", isWorkSet=");
                sb.append(this.f13930b);
                sb.append(", isSchoolSet=");
                sb.append(this.f13931c);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$d */
        static final class C5374d<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C5374d f13932e = new C5374d();

            C5374d() {
            }

            /* renamed from: a */
            public final int mo12943a(List<C2935a> list) {
                C12932j.m33818b(list, "it");
                return list.size();
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(mo12943a((List) obj));
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$e */
        static final class C5375e<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C5375e f13933e = new C5375e();

            C5375e() {
            }

            /* renamed from: a */
            public final int mo12944a(C7219t0 t0Var) {
                C12932j.m33818b(t0Var, "it");
                return t0Var.getFriendsCount();
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(mo12944a((C7219t0) obj));
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$f */
        static final class C5376f<T, R> implements Function<Throwable, Integer> {

            /* renamed from: e */
            public static final C5376f f13934e = new C5376f();

            C5376f() {
            }

            /* renamed from: a */
            public final int mo12945a(Throwable th) {
                C12932j.m33818b(th, "it");
                return 0;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(mo12945a((Throwable) obj));
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$g */
        static final class C5377g extends C12933k implements Function0<C12279e<C7219t0>> {

            /* renamed from: f */
            final /* synthetic */ C5370c f13935f;

            C5377g(C5370c cVar) {
                this.f13935f = cVar;
                super(0);
            }

            public final C12279e<C7219t0> invoke() {
                return this.f13935f.f13922f.bestFriendsStream();
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$h */
        static final class C5378h<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C5378h f13936e = new C5378h();

            C5378h() {
            }

            /* renamed from: a */
            public final int mo12946a(UserProto$User userProto$User) {
                C12932j.m33818b(userProto$User, "it");
                return userProto$User.getFriendsCount();
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(mo12946a((UserProto$User) obj));
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$i */
        public static final class C5379i<T1, T2, R> implements BiFunction<T1, T2, R> {
            public final R apply(T1 t1, T2 t2) {
                return new C5371a(((Number) t1).intValue(), ((Number) t2).intValue());
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$j */
        static final /* synthetic */ class C5380j extends C12931i implements Function1<C8230p5, UserProto$UserEngagementStats> {

            /* renamed from: i */
            public static final C5380j f13937i = new C5380j();

            C5380j() {
                super(1);
            }

            /* renamed from: a */
            public final UserProto$UserEngagementStats invoke(C8230p5 p5Var) {
                C12932j.m33818b(p5Var, "p1");
                return p5Var.getUserEngagement();
            }

            /* renamed from: d */
            public final KDeclarationContainer mo6620d() {
                return C12946x.m33834a(C8230p5.class);
            }

            /* renamed from: f */
            public final String mo6621f() {
                return "getUserEngagement()Lco/znly/models/UserProto$UserEngagementStats;";
            }

            public final String getName() {
                return "getUserEngagement";
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$k */
        static final class C5381k<T, R> implements Function<T, R> {

            /* renamed from: e */
            final /* synthetic */ C5370c f13938e;

            C5381k(C5370c cVar) {
                this.f13938e = cVar;
            }

            /* renamed from: a */
            public final C5372b apply(UserProto$UserEngagementStats userProto$UserEngagementStats) {
                C12932j.m33818b(userProto$UserEngagementStats, "userEngagement");
                C6042a a = C6042a.f15226p.mo13858a(this.f13938e.f13923g.mo13863a());
                int a2 = C6058i.m16808a(userProto$UserEngagementStats);
                C6052e a3 = this.f13938e.f13923g;
                C6044b bVar = C6042a.f15226p;
                C6929b level = userProto$UserEngagementStats.getLevel();
                C12932j.m33815a((Object) level, "userEngagement.level");
                a3.mo13871c(bVar.mo13857a(level));
                this.f13938e.f13923g.mo13864a(Math.max(a.mo13856e(), a2));
                return new C5372b(a, a2, this.f13938e.f13923g.mo13868b());
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$l */
        static final class C5382l<T> implements Predicate<C12899i<? extends UserProto$User, ? extends C7286e2>> {

            /* renamed from: e */
            public static final C5382l f13939e = new C5382l();

            C5382l() {
            }

            /* renamed from: a */
            public final boolean test(C12899i<UserProto$User, C7286e2> iVar) {
                C12932j.m33818b(iVar, "it");
                String uuid = ((UserProto$User) iVar.mo37204c()).getUuid();
                Object d = iVar.mo37205d();
                C12932j.m33815a(d, "it.second");
                return C12932j.m33817a((Object) uuid, (Object) ((C7286e2) d).getUserUuid());
            }
        }

        /* renamed from: app.zenly.locator.s.b$c$m */
        static final class C5383m<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C5383m f13940e = new C5383m();

            /* renamed from: app.zenly.locator.s.b$c$m$a */
            static final class C5384a extends C12933k implements Function2<C7286e2, C6847b, Boolean> {

                /* renamed from: f */
                public static final C5384a f13941f = new C5384a();

                C5384a() {
                    super(2);
                }

                /* renamed from: a */
                public final boolean mo12951a(C7286e2 e2Var, C6847b bVar) {
                    boolean z;
                    C12932j.m33818b(e2Var, "places");
                    C12932j.m33818b(bVar, "tag");
                    List<PlaceProto$Place> placeList = e2Var.getPlaceList();
                    C12932j.m33815a((Object) placeList, "places.placeList");
                    if ((placeList instanceof Collection) && placeList.isEmpty()) {
                        return false;
                    }
                    for (PlaceProto$Place placeProto$Place : placeList) {
                        C12932j.m33815a((Object) placeProto$Place, "it");
                        C6845c label = placeProto$Place.getLabel();
                        C12932j.m33815a((Object) label, "it.label");
                        if (label.getTag() == bVar) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            return true;
                        }
                    }
                    return false;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return Boolean.valueOf(mo12951a((C7286e2) obj, (C6847b) obj2));
                }
            }

            C5383m() {
            }

            /* renamed from: a */
            public final C5373c apply(C12899i<UserProto$User, C7286e2> iVar) {
                C12932j.m33818b(iVar, "it");
                C5384a aVar = C5384a.f13941f;
                Object d = iVar.mo37205d();
                String str = "it.second";
                C12932j.m33815a(d, str);
                boolean a = aVar.mo12951a((C7286e2) d, C6847b.HOME);
                Object d2 = iVar.mo37205d();
                C12932j.m33815a(d2, str);
                boolean a2 = aVar.mo12951a((C7286e2) d2, C6847b.WORK);
                Object d3 = iVar.mo37205d();
                C12932j.m33815a(d3, str);
                return new C5373c(a, a2, aVar.mo12951a((C7286e2) d3, C6847b.SCHOOL));
            }
        }

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C5370c.class), "bestFriendsObservable", "getBestFriendsObservable()Lio/reactivex/Observable;");
            C12946x.m33839a((C12940r) sVar);
            f13916h = new KProperty[]{sVar};
        }

        public C5370c(Context context, ZenlyCore zenlyCore, ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore, C6052e eVar) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(zenlyCore, "zenlyCore");
            C12932j.m33818b(contactAlreadyOnZenlyStore, "aozStore");
            C12932j.m33818b(eVar, "appIconsPrefs");
            this.f13921e = context;
            this.f13922f = zenlyCore;
            this.f13923g = eVar;
            C12279e<UserProto$User> userMeStream = this.f13922f.userMeStream();
            C12932j.m33815a((Object) userMeStream, "zenlyCore.userMeStream()");
            this.f13917a = userMeStream;
            C12279e<Integer> d = this.f13917a.mo36501i(C5378h.f13936e).mo36477d();
            C12932j.m33815a((Object) d, "userObservable\n         …  .distinctUntilChanged()");
            this.f13919c = d;
            C12279e<Integer> s = contactAlreadyOnZenlyStore.contactsAlreadyOnZenly().mo36501i(C5374d.f13932e).mo36477d().mo36475c(1).mo36947s();
            C12932j.m33815a((Object) s, "aozStore.contactsAlready…)\n            .refCount()");
            this.f13920d = s;
        }

        /* renamed from: i */
        private final C12279e<C7219t0> m15338i() {
            Lazy lazy = this.f13918b;
            KProperty kProperty = f13916h[0];
            return (C12279e) lazy.getValue();
        }

        /* renamed from: c */
        public final C12279e<String> mo12920c() {
            C12279e<String> e = C12279e.m32626e(C3196c0.m10167a(this.f13921e, "com.google.android.gms"));
            C12932j.m33815a((Object) e, "Observable.just(\n       …ES_PACKAGE)\n            )");
            return e;
        }

        /* renamed from: d */
        public final C12279e<UserProto$User> mo12921d() {
            C12279e<UserProto$User> e = this.f13917a.mo36487e(1);
            C12932j.m33815a((Object) e, "userObservable.take(1)");
            return e;
        }

        /* renamed from: e */
        public final C12279e<C5371a> mo12922e() {
            C12774b bVar = C12774b.f33320a;
            C12279e<C5371a> a = C12279e.m32610a((ObservableSource<? extends T1>) this.f13919c, (ObservableSource<? extends T2>) this.f13920d, (BiFunction<? super T1, ? super T2, ? extends R>) new C5379i<Object,Object,Object>());
            C12932j.m33815a((Object) a, "Observables.combineLates…, aozCount)\n            }");
            return a;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, app.zenly.locator.s.b$c$j] */
        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r2v0, types: [app.zenly.locator.s.d] */
        /* JADX WARNING: type inference failed for: r1v5 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p389io.reactivex.C12279e<app.zenly.locator.p143s.C5367b.C5370c.C5372b> mo12923f() {
            /*
                r3 = this;
                co.znly.core.ZenlyCore r0 = r3.f13922f
                io.reactivex.e r0 = r0.userEngagement()
                app.zenly.locator.s.b$c$j r1 = app.zenly.locator.p143s.C5367b.C5370c.C5380j.f13937i
                if (r1 == 0) goto L_0x0010
                app.zenly.locator.s.d r2 = new app.zenly.locator.s.d
                r2.<init>(r1)
                r1 = r2
            L_0x0010:
                io.reactivex.functions.Function r1 = (p389io.reactivex.functions.Function) r1
                io.reactivex.e r0 = r0.mo36501i(r1)
                app.zenly.locator.s.b$c$k r1 = new app.zenly.locator.s.b$c$k
                r1.<init>(r3)
                io.reactivex.e r0 = r0.mo36501i(r1)
                io.reactivex.e r0 = r0.mo36477d()
                java.lang.String r1 = "zenlyCore.userEngagement…  .distinctUntilChanged()"
                kotlin.jvm.internal.C12932j.m33815a(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p143s.C5367b.C5370c.mo12923f():io.reactivex.e");
        }

        /* renamed from: g */
        public final C12279e<C7243w0> mo12924g() {
            return this.f13922f.userMeTraits().mo36477d();
        }

        /* renamed from: h */
        public final C12279e<C5373c> mo12925h() {
            C12774b bVar = C12774b.f33320a;
            C12279e<UserProto$User> eVar = this.f13917a;
            C12279e userPlacesStream = this.f13922f.userPlacesStream();
            C12932j.m33815a((Object) userPlacesStream, "zenlyCore.userPlacesStream()");
            return bVar.mo36955a(eVar, userPlacesStream).mo36459b((Predicate<? super T>) C5382l.f13939e).mo36501i(C5383m.f13940e).mo36477d();
        }

        /* renamed from: a */
        public final C12279e<String> mo12918a() {
            String str = "store";
            if (str.hashCode() != 109770977) {
                str = "love";
            }
            C12279e<String> e = C12279e.m32626e(str);
            C12932j.m33815a((Object) e, "Observable.just(flavor)");
            return e;
        }

        /* renamed from: b */
        public final C12279e<Integer> mo12919b() {
            C12279e<Integer> d = m15338i().mo36501i(C5375e.f13933e).mo36504k(C5376f.f13934e).mo36477d();
            C12932j.m33815a((Object) d, "bestFriendsObservable\n  …  .distinctUntilChanged()");
            return d;
        }
    }

    /* renamed from: app.zenly.locator.s.b$d */
    static final class C5385d<T> implements Consumer<String> {

        /* renamed from: e */
        public static final C5385d f13942e = new C5385d();

        C5385d() {
        }

        /* renamed from: a */
        public final void accept(String str) {
            C5343a.m15160U().mo12843a(C5447b.m15477d(C5448c.m15478a()), str);
        }
    }

    /* renamed from: app.zenly.locator.s.b$e */
    static final class C5386e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5386e f13943e = new C5386e();

        C5386e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "unable to subscribeToAppFlavor", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.s.b$f */
    static final class C5387f<T> implements Consumer<String> {

        /* renamed from: e */
        final /* synthetic */ C5367b f13944e;

        C5387f(C5367b bVar) {
            this.f13944e = bVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            C5343a.m15160U().mo12864b(C5447b.m15477d(this.f13944e.f13912d), str);
        }
    }

    /* renamed from: app.zenly.locator.s.b$g */
    static final class C5388g<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5388g f13945e = new C5388g();

        C5388g() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "unable to subscribeToInitialUser", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.s.b$h */
    static final class C5389h<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        final /* synthetic */ C5367b f13946e;

        C5389h(C5367b bVar) {
            this.f13946e = bVar;
        }

        /* renamed from: a */
        public final void accept(UserProto$User userProto$User) {
            C5343a U = C5343a.m15160U();
            C5367b bVar = this.f13946e;
            C12932j.m33815a((Object) userProto$User, "user");
            U.mo12833a(userProto$User, bVar.m15323a(userProto$User));
        }
    }

    /* renamed from: app.zenly.locator.s.b$i */
    static final class C5390i<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5390i f13947e = new C5390i();

        C5390i() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "unable to subscribeToInitialUser", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.s.b$j */
    static final class C5391j<T> implements Consumer<Integer> {

        /* renamed from: e */
        final /* synthetic */ C5367b f13948e;

        C5391j(C5367b bVar) {
            this.f13948e = bVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            C5343a U = C5343a.m15160U();
            String d = C5447b.m15477d(this.f13948e.f13912d);
            C12932j.m33815a((Object) num, "bestFriendsCount");
            U.mo12836a(d, num.intValue());
        }
    }

    /* renamed from: app.zenly.locator.s.b$k */
    static final class C5392k<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5392k f13949e = new C5392k();

        C5392k() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "unable to subscribeToUserBestFriendsCount", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.s.b$l */
    static final class C5393l<T> implements Consumer<C5371a> {

        /* renamed from: e */
        final /* synthetic */ C5367b f13950e;

        C5393l(C5367b bVar) {
            this.f13950e = bVar;
        }

        /* renamed from: a */
        public final void accept(C5371a aVar) {
            C5343a.m15160U().mo12837a(C5447b.m15477d(this.f13950e.f13912d), aVar.mo12927b(), aVar.mo12926a());
        }
    }

    /* renamed from: app.zenly.locator.s.b$m */
    static final class C5394m<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5394m f13951e = new C5394m();

        C5394m() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "unable to subscribeToUserCount", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.s.b$n */
    static final class C5395n<T> implements Consumer<C5372b> {

        /* renamed from: e */
        final /* synthetic */ C5367b f13952e;

        C5395n(C5367b bVar) {
            this.f13952e = bVar;
        }

        /* renamed from: a */
        public final void accept(C5372b bVar) {
            C5343a.m15160U().mo12844a(C5447b.m15477d(this.f13952e.f13912d), C6050d.f15238b.mo13862a(bVar.mo12931a()), bVar.mo12932b(), bVar.mo12933c());
        }
    }

    /* renamed from: app.zenly.locator.s.b$o */
    static final class C5396o<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5396o f13953e = new C5396o();

        C5396o() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "unable to subscribeToUserCount", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.s.b$p */
    static final class C5397p<T> implements Consumer<C5373c> {

        /* renamed from: e */
        final /* synthetic */ C5367b f13954e;

        C5397p(C5367b bVar) {
            this.f13954e = bVar;
        }

        /* renamed from: a */
        public final void accept(C5373c cVar) {
            C5343a.m15160U().mo12848a(C5447b.m15477d(this.f13954e.f13912d), cVar.mo12937a(), cVar.mo12939c(), cVar.mo12938b());
        }
    }

    /* renamed from: app.zenly.locator.s.b$q */
    static final class C5398q<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5398q f13955e = new C5398q();

        C5398q() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "unable to subscribeToInitialUser", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.s.b$r */
    static final class C5399r<T> implements Consumer<C7243w0> {

        /* renamed from: e */
        final /* synthetic */ C5367b f13956e;

        C5399r(C5367b bVar) {
            this.f13956e = bVar;
        }

        /* renamed from: a */
        public final void accept(C7243w0 w0Var) {
            C5343a.m15160U().mo12842a(C5447b.m15477d(this.f13956e.f13912d), w0Var);
        }
    }

    /* renamed from: app.zenly.locator.s.b$s */
    static final class C5400s<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5400s f13957e = new C5400s();

        C5400s() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "unable to subscribeToInitialUser", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.s.b$t */
    static final class C5401t extends C12933k implements Function0<C5370c> {

        /* renamed from: f */
        final /* synthetic */ C5367b f13958f;

        /* renamed from: g */
        final /* synthetic */ Provider f13959g;

        /* renamed from: h */
        final /* synthetic */ Provider f13960h;

        C5401t(C5367b bVar, Provider provider, Provider provider2) {
            this.f13958f = bVar;
            this.f13959g = provider;
            this.f13960h = provider2;
            super(0);
        }

        public final C5370c invoke() {
            return new C5370c(this.f13958f.f13911c, this.f13958f.f13912d, (ContactAlreadyOnZenlyStore) this.f13959g.get(), (C6052e) this.f13960h.get());
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5367b.class), "traitsRepository", "getTraitsRepository()Lapp/zenly/locator/core/AnalyticsTraitsManager$TraitsRepository;");
        C12946x.m33839a((C12940r) sVar);
        f13908e = new KProperty[]{sVar};
        new C5368a(null);
    }

    public C5367b(Context context, ZenlyCore zenlyCore, Provider<ContactAlreadyOnZenlyStore> provider, Provider<C6052e> provider2) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(zenlyCore, "zenlyCore");
        C12932j.m33818b(provider, "aozStore");
        C12932j.m33818b(provider2, "appIconsPrefs");
        this.f13911c = context;
        this.f13912d = zenlyCore;
        this.f13910b = C12896f.m33751a(new C5401t(this, provider, provider2));
    }

    /* renamed from: a */
    private final C5370c m15321a() {
        Lazy lazy = this.f13910b;
        KProperty kProperty = f13908e[0];
        return (C5370c) lazy.getValue();
    }

    /* renamed from: c */
    private final Disposable m15326c() {
        Disposable a = m15321a().mo12920c().mo36428a((C12286f) this.f13909a.getMainThread()).mo36412a((Consumer<? super T>) new C5387f<Object>(this), (Consumer<? super Throwable>) C5388g.f13945e);
        C12932j.m33815a((Object) a, "traitsRepository.googleP…ialUser\") }\n            )");
        return a;
    }

    /* renamed from: d */
    private final Disposable m15327d() {
        Disposable a = m15321a().mo12921d().mo36428a((C12286f) this.f13909a.getMainThread()).mo36412a((Consumer<? super T>) new C5389h<Object>(this), (Consumer<? super Throwable>) C5390i.f13947e);
        C12932j.m33815a((Object) a, "traitsRepository.initial…ialUser\") }\n            )");
        return a;
    }

    /* renamed from: e */
    private final Disposable m15328e() {
        Disposable a = m15321a().mo12919b().mo36428a((C12286f) this.f13909a.getMainThread()).mo36412a((Consumer<? super T>) new C5391j<Object>(this), (Consumer<? super Throwable>) C5392k.f13949e);
        C12932j.m33815a((Object) a, "traitsRepository.bestFri…dsCount\") }\n            )");
        return a;
    }

    /* renamed from: f */
    private final Disposable m15329f() {
        Disposable a = m15321a().mo12922e().mo36428a((C12286f) this.f13909a.getMainThread()).mo36412a((Consumer<? super T>) new C5393l<Object>(this), (Consumer<? super Throwable>) C5394m.f13951e);
        C12932j.m33815a((Object) a, "traitsRepository.userCou…erCount\") }\n            )");
        return a;
    }

    /* renamed from: g */
    private final Disposable m15330g() {
        Disposable a = m15321a().mo12923f().mo36428a((C12286f) this.f13909a.getMainThread()).mo36412a((Consumer<? super T>) new C5395n<Object>(this), (Consumer<? super Throwable>) C5396o.f13953e);
        C12932j.m33815a((Object) a, "traitsRepository.userEng…erCount\") }\n            )");
        return a;
    }

    /* renamed from: h */
    private final Disposable m15331h() {
        Disposable a = m15321a().mo12925h().mo36428a((C12286f) this.f13909a.getMainThread()).mo36412a((Consumer<? super T>) new C5397p<Object>(this), (Consumer<? super Throwable>) C5398q.f13955e);
        C12932j.m33815a((Object) a, "traitsRepository.userPla…ialUser\") }\n            )");
        return a;
    }

    /* renamed from: i */
    private final Disposable m15332i() {
        Disposable a = m15321a().mo12924g().mo36428a((C12286f) this.f13909a.getMainThread()).mo36412a((Consumer<? super T>) new C5399r<Object>(this), (Consumer<? super Throwable>) C5400s.f13957e);
        C12932j.m33815a((Object) a, "traitsRepository.userMeT…ialUser\") }\n            )");
        return a;
    }

    public Disposable onInitialize() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    /* renamed from: b */
    private final Disposable m15325b() {
        Disposable a = m15321a().mo12918a().mo36428a((C12286f) this.f13909a.getMainThread()).mo36412a((Consumer<? super T>) C5385d.f13942e, (Consumer<? super Throwable>) C5386e.f13943e);
        C12932j.m33815a((Object) a, "traitsRepository.appFlav…pFlavor\") }\n            )");
        return a;
    }

    public C12275b onForeground() {
        C7707a.m18761b("analytics:start");
        try {
            return new C12275b(m15325b(), m15327d(), m15328e(), m15329f(), m15330g(), m15332i(), m15331h(), m15326c());
        } finally {
            C7707a.m18759a();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00cb, code lost:
        if (r5 != null) goto L_0x00d2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] m15323a(p213co.znly.models.UserProto$User r11) {
        /*
            r10 = this;
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            co.znly.core.ZenlyCore r0 = r10.f13912d
            co.znly.models.ConfigurationProto$Configuration$e r0 = r0.experimentFlags()
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00ce
            r5 = 10
            kotlin.i[] r5 = new kotlin.C12899i[r5]
            co.znly.models.ConfigurationProto$Configuration$e$d r6 = r0.getNoFriendsSingleDialog()
            app.zenly.locator.s.b$b r7 = new app.zenly.locator.s.b$b
            java.lang.String r8 = "track3exp1var1"
            r7.<init>(r8)
            kotlin.i r6 = kotlin.C12954o.m33853a(r6, r7)
            r5[r2] = r6
            co.znly.models.ConfigurationProto$Configuration$e$d r6 = r0.getNoFriendsMultipleDialogs()
            app.zenly.locator.s.b$b r7 = new app.zenly.locator.s.b$b
            java.lang.String r8 = "track3exp2var1"
            r7.<init>(r8)
            kotlin.i r6 = kotlin.C12954o.m33853a(r6, r7)
            r5[r4] = r6
            co.znly.models.ConfigurationProto$Configuration$e$d r6 = r0.getNoFriendsCarousel()
            app.zenly.locator.s.b$b r7 = new app.zenly.locator.s.b$b
            java.lang.String r8 = "track3exp3var1"
            r7.<init>(r8)
            kotlin.i r6 = kotlin.C12954o.m33853a(r6, r7)
            r5[r3] = r6
            co.znly.models.ConfigurationProto$Configuration$e$d r6 = r0.getNoFriendsPushNotification()
            app.zenly.locator.s.b$b r7 = new app.zenly.locator.s.b$b
            java.lang.String r8 = "track3exp4var1"
            r7.<init>(r8)
            kotlin.i r6 = kotlin.C12954o.m33853a(r6, r7)
            r5[r1] = r6
            r6 = 4
            co.znly.models.ConfigurationProto$Configuration$e$d r7 = r0.getUseInviteLink()
            app.zenly.locator.s.b$b r8 = new app.zenly.locator.s.b$b
            java.lang.String r9 = "track5exp1var1"
            r8.<init>(r9)
            kotlin.i r7 = kotlin.C12954o.m33853a(r7, r8)
            r5[r6] = r7
            r6 = 5
            co.znly.models.ConfigurationProto$Configuration$e$d r7 = r0.getDisplaySocialNetwork()
            app.zenly.locator.s.b$b r8 = new app.zenly.locator.s.b$b
            java.lang.String r9 = "track1exp1var1"
            r8.<init>(r9)
            kotlin.i r7 = kotlin.C12954o.m33853a(r7, r8)
            r5[r6] = r7
            r6 = 6
            co.znly.models.ConfigurationProto$Configuration$e$d r7 = r0.getWatchersLocked()
            app.zenly.locator.s.b$b r8 = new app.zenly.locator.s.b$b
            java.lang.String r9 = "track4exp2var1"
            r8.<init>(r9)
            kotlin.i r7 = kotlin.C12954o.m33853a(r7, r8)
            r5[r6] = r7
            r6 = 7
            co.znly.models.ConfigurationProto$Configuration$e$d r7 = r0.getBroadcastedInvitesDisabled()
            app.zenly.locator.s.b$b r8 = new app.zenly.locator.s.b$b
            java.lang.String r9 = "track7exp2var1"
            r8.<init>(r9)
            kotlin.i r7 = kotlin.C12954o.m33853a(r7, r8)
            r5[r6] = r7
            r6 = 8
            co.znly.models.ConfigurationProto$Configuration$e$d r7 = r0.getQuickAddInbox()
            app.zenly.locator.s.b$b r8 = new app.zenly.locator.s.b$b
            java.lang.String r9 = "track4exp3var1"
            r8.<init>(r9)
            kotlin.i r7 = kotlin.C12954o.m33853a(r7, r8)
            r5[r6] = r7
            r6 = 9
            co.znly.models.ConfigurationProto$Configuration$e$d r7 = r0.getSocialNetworksWithBroadcastedInvites()
            app.zenly.locator.s.b$b r8 = new app.zenly.locator.s.b$b
            java.lang.String r9 = "track1exp1var2"
            r8.<init>(r9)
            kotlin.i r7 = kotlin.C12954o.m33853a(r7, r8)
            r5[r6] = r7
            java.util.List r5 = kotlin.collections.C12848o.m33643b(r5)
            if (r5 == 0) goto L_0x00ce
            goto L_0x00d2
        L_0x00ce:
            java.util.List r5 = kotlin.collections.C12848o.m33640a()
        L_0x00d2:
            java.util.Iterator r5 = r5.iterator()
        L_0x00d6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0124
            java.lang.Object r6 = r5.next()
            kotlin.i r6 = (kotlin.C12899i) r6
            java.lang.Object r7 = r6.mo37204c()
            co.znly.models.ConfigurationProto$Configuration$e$d r7 = (p213co.znly.models.ConfigurationProto$Configuration.C6770e.C6775d) r7
            if (r7 != 0) goto L_0x00eb
            goto L_0x00d6
        L_0x00eb:
            int[] r8 = app.zenly.locator.p143s.C5402c.f13961a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L_0x0116
            if (r7 == r3) goto L_0x0108
            if (r7 == r1) goto L_0x00fa
            goto L_0x00d6
        L_0x00fa:
            java.lang.Object r6 = r6.mo37205d()
            app.zenly.locator.s.b$b r6 = (app.zenly.locator.p143s.C5367b.C5369b) r6
            java.lang.String r6 = r6.mo12916b()
            r11.add(r6)
            goto L_0x00d6
        L_0x0108:
            java.lang.Object r6 = r6.mo37205d()
            app.zenly.locator.s.b$b r6 = (app.zenly.locator.p143s.C5367b.C5369b) r6
            java.lang.String r6 = r6.mo12915a()
            r11.add(r6)
            goto L_0x00d6
        L_0x0116:
            java.lang.Object r6 = r6.mo37205d()
            app.zenly.locator.s.b$b r6 = (app.zenly.locator.p143s.C5367b.C5369b) r6
            java.lang.String r6 = r6.mo12917c()
            r11.add(r6)
            goto L_0x00d6
        L_0x0124:
            if (r0 == 0) goto L_0x012b
            co.znly.models.ConfigurationProto$Configuration$e$e r0 = r0.getMasterGroup()
            goto L_0x012c
        L_0x012b:
            r0 = 0
        L_0x012c:
            if (r0 != 0) goto L_0x012f
            goto L_0x0147
        L_0x012f:
            int[] r1 = app.zenly.locator.p143s.C5402c.f13962b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r4) goto L_0x0142
            if (r0 == r3) goto L_0x013c
            goto L_0x0147
        L_0x013c:
            java.lang.String r0 = "master_control_b"
            r11.add(r0)
            goto L_0x0147
        L_0x0142:
            java.lang.String r0 = "master_control_a"
            r11.add(r0)
        L_0x0147:
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r11 = r11.toArray(r0)
            if (r11 == 0) goto L_0x0152
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
        L_0x0152:
            kotlin.TypeCastException r11 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p143s.C5367b.m15323a(co.znly.models.UserProto$User):java.lang.String[]");
    }
}
