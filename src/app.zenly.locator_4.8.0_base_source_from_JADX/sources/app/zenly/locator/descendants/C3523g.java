package app.zenly.locator.descendants;

import app.zenly.android.feature.descendants.model.Descendant;
import app.zenly.android.feature.descendants.model.RankedDescendant;
import app.zenly.android.feature.descendants.repository.DescendantsRepository;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.descendants.p085j.C3543a;
import app.zenly.locator.descendants.p085j.C3544b;
import app.zenly.locator.descendants.p085j.C3546d;
import app.zenly.locator.descendants.p085j.C3547e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C12844m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12946x;
import kotlin.ranges.C12963e;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;
import org.reactivestreams.Publisher;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6926b;
import p213co.znly.models.core.C7226u0;
import p213co.znly.models.core.C7236v0;
import p213co.znly.models.services.C7977a2;
import p213co.znly.models.services.C7977a2.C7978a;
import p213co.znly.models.services.C7995b2;
import p389io.reactivex.C12272c;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.descendants.g */
public final class C3523g implements DescendantsRepository {

    /* renamed from: a */
    private final C3201f<UserProto$User> f9511a = new C3539n().reversed();

    /* renamed from: b */
    private final ZenlyCore f9512b;

    /* renamed from: c */
    private final FriendStore f9513c;

    /* renamed from: d */
    private final ContactAlreadyOnZenlyStore f9514d;

    /* renamed from: app.zenly.locator.descendants.g$a */
    public static final class C3524a {
        private C3524a() {
        }

        public /* synthetic */ C3524a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$b */
    public static final class C3525b<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Timestamp descendantSince = ((C7226u0) t2).getDescendantSince();
            String str = "descendant.descendantSince";
            C12932j.m33815a((Object) descendantSince, str);
            Long valueOf = Long.valueOf(C3245z.m10288g(descendantSince));
            Timestamp descendantSince2 = ((C7226u0) t).getDescendantSince();
            C12932j.m33815a((Object) descendantSince2, str);
            return C12998b.m33940a(valueOf, Long.valueOf(C3245z.m10288g(descendantSince2)));
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$c */
    static final class C3526c extends C12933k implements Function1<List<? extends RankedDescendant>, List<? extends RankedDescendant>> {

        /* renamed from: f */
        final /* synthetic */ C3523g f9515f;

        /* renamed from: g */
        final /* synthetic */ String f9516g;

        C3526c(C3523g gVar, String str) {
            this.f9515f = gVar;
            this.f9516g = str;
            super(1);
        }

        /* renamed from: a */
        public final List<RankedDescendant> invoke(List<? extends RankedDescendant> list) {
            C12932j.m33818b(list, "rankedDescendants");
            C3523g gVar = this.f9515f;
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (C12932j.m33817a((Object) this.f9516g, (Object) ((RankedDescendant) it.next()).getId())) {
                    break;
                }
                i++;
            }
            return C12857w.m33667a((List) list, gVar.m10726a(i, list.size()));
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$d */
    public static final class C3527d<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C3523g f9517a;

        /* renamed from: b */
        final /* synthetic */ long f9518b;

        public C3527d(C3523g gVar, long j) {
            this.f9517a = gVar;
            this.f9518b = j;
        }

        public final R apply(T1 t1, T2 t2) {
            List list = (List) t2;
            List list2 = (List) t1;
            C3523g gVar = this.f9517a;
            C12932j.m33815a((Object) list, "descendantsList");
            C12932j.m33815a((Object) list2, "contacts");
            return gVar.m10724a(list, list2, this.f9518b);
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$e */
    static final class C3528e<T, R> implements Function<Throwable, List<? extends C2935a>> {

        /* renamed from: e */
        public static final C3528e f9519e = new C3528e();

        C3528e() {
        }

        /* renamed from: a */
        public final List<C2935a> apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return C12848o.m33640a();
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$f */
    static final /* synthetic */ class C3529f extends C12931i implements Function1<C7236v0, List<C7226u0>> {

        /* renamed from: i */
        public static final C3529f f9520i = new C3529f();

        C3529f() {
            super(1);
        }

        /* renamed from: a */
        public final List<C7226u0> invoke(C7236v0 v0Var) {
            C12932j.m33818b(v0Var, "p1");
            return v0Var.getDescendantsList();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C7236v0.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "getDescendantsList()Ljava/util/List;";
        }

        public final String getName() {
            return "getDescendantsList";
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$g */
    public static final class C3530g<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            UserProto$User userProto$User = (UserProto$User) t2;
            List list = (List) t1;
            C12932j.m33815a((Object) list, "friends");
            return C12857w.m33666a((Collection) list, (Object) userProto$User);
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$h */
    static final class C3531h<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3531h f9521e = new C3531h();

        C3531h() {
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(List<C2936a0> list) {
            C12932j.m33818b(list, "it");
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (C2936a0 a : list) {
                arrayList.add(a.mo9074a());
            }
            return arrayList;
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$i */
    static final /* synthetic */ class C3532i extends C12931i implements Function1<List<? extends UserProto$User>, List<? extends RankedDescendant>> {
        C3532i(C3523g gVar) {
            super(1, gVar);
        }

        /* renamed from: a */
        public final List<RankedDescendant> invoke(List<UserProto$User> list) {
            C12932j.m33818b(list, "p1");
            return ((C3523g) this.f33505f).m10723a(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3523g.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "toRankedDescendantList(Ljava/util/List;)Ljava/util/List;";
        }

        public final String getName() {
            return "toRankedDescendantList";
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$j */
    static final /* synthetic */ class C3533j extends C12931i implements Function1<List<? extends UserProto$User>, List<? extends RankedDescendant>> {
        C3533j(C3523g gVar) {
            super(1, gVar);
        }

        /* renamed from: a */
        public final List<RankedDescendant> invoke(List<UserProto$User> list) {
            C12932j.m33818b(list, "p1");
            return ((C3523g) this.f33505f).m10723a(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3523g.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "toRankedDescendantList(Ljava/util/List;)Ljava/util/List;";
        }

        public final String getName() {
            return "toRankedDescendantList";
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$k */
    static final class C3534k<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3534k f9522e = new C3534k();

        C3534k() {
        }

        /* renamed from: a */
        public final int mo9992a(List<? extends Descendant> list) {
            C12932j.m33818b(list, "it");
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Descendant newPop : list) {
                    if (newPop.getNewPop()) {
                        i++;
                        if (i < 0) {
                            C12844m.m33610b();
                            throw null;
                        }
                    }
                }
            }
            return i;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(mo9992a((List) obj));
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$l */
    static final class C3535l<T, R> implements Function<C12272c<Throwable>, Publisher<?>> {

        /* renamed from: e */
        public static final C3535l f9523e = new C3535l();

        /* renamed from: app.zenly.locator.descendants.g$l$a */
        public static final class C3536a<T1, T2, R> implements BiFunction<Throwable, Integer, R> {
            public final R apply(Throwable th, Integer num) {
                R r = num;
                Throwable th2 = th;
                if (C12932j.m33811a(r.intValue(), 4) <= 0) {
                    return r;
                }
                C12932j.m33815a((Object) th2, "error");
                throw th2;
            }
        }

        /* renamed from: app.zenly.locator.descendants.g$l$b */
        static final class C3537b<T, R> implements Function<T, Publisher<? extends R>> {

            /* renamed from: e */
            public static final C3537b f9524e = new C3537b();

            C3537b() {
            }

            /* renamed from: a */
            public final C12272c<Long> apply(Integer num) {
                C12932j.m33818b(num, "retryCount");
                return C12272c.m32525a((long) Math.pow(2.0d, (double) num.intValue()), TimeUnit.SECONDS);
            }
        }

        C3535l() {
        }

        /* renamed from: a */
        public final C12272c<Long> apply(C12272c<Throwable> cVar) {
            C12932j.m33818b(cVar, "errors");
            C12272c a = C12272c.m32523a(1, 5);
            C12932j.m33815a((Object) a, "Flowable.range(1, MAX_RETRIES + 1)");
            C12272c a2 = cVar.mo36360a((Publisher<? extends U>) a, (BiFunction<? super T, ? super U, ? extends R>) new C3536a<Object,Object,Object>());
            C12932j.m33815a((Object) a2, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
            return a2.mo36366b(C3537b.f9524e);
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$m */
    static final class C3538m<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3538m f9525e = new C3538m();

        C3538m() {
        }

        /* renamed from: a */
        public final int mo9995a(C7995b2 b2Var) {
            C12932j.m33818b(b2Var, "it");
            return b2Var.getRank();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(mo9995a((C7995b2) obj));
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$n */
    public static final class C3539n extends C3201f<UserProto$User> {
        C3539n() {
        }

        /* renamed from: a */
        public int compare(UserProto$User userProto$User, UserProto$User userProto$User2) {
            C12932j.m33818b(userProto$User, "o1");
            C12932j.m33818b(userProto$User2, "o2");
            C6926b events = userProto$User.getEvents();
            C12932j.m33815a((Object) events, "o1.events");
            int inviterCount = events.getInviterCount();
            C6926b events2 = userProto$User2.getEvents();
            C12932j.m33815a((Object) events2, "o2.events");
            return C12932j.m33811a(inviterCount, events2.getInviterCount());
        }
    }

    /* renamed from: app.zenly.locator.descendants.g$o */
    static final class C3540o extends C12933k implements Function1<UserProto$User, RankedDescendant> {

        /* renamed from: f */
        final /* synthetic */ C3544b f9526f;

        C3540o(C3544b bVar) {
            this.f9526f = bVar;
            super(1);
        }

        /* renamed from: a */
        public final RankedDescendant invoke(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            C3544b bVar = this.f9526f;
            C6926b events = userProto$User.getEvents();
            C12932j.m33815a((Object) events, "it.events");
            C3547e eVar = new C3547e(bVar.mo10001a(events.getInviterCount()), userProto$User, false, 4, null);
            return eVar;
        }
    }

    static {
        new C3524a(null);
    }

    public C3523g(ZenlyCore zenlyCore, FriendStore friendStore, ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(contactAlreadyOnZenlyStore, "aozStore");
        this.f9512b = zenlyCore;
        this.f9513c = friendStore;
        this.f9514d = contactAlreadyOnZenlyStore;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [app.zenly.locator.descendants.g$f, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r3v0, types: [app.zenly.locator.descendants.h] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p389io.reactivex.C12291g<java.util.List<app.zenly.android.feature.descendants.model.Descendant>> getCurrentUserDescendants(long r5) {
        /*
            r4 = this;
            app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore r0 = r4.f9514d
            io.reactivex.e r0 = r0.contactsAlreadyOnZenly()
            app.zenly.locator.descendants.g$e r1 = app.zenly.locator.descendants.C3523g.C3528e.f9519e
            io.reactivex.e r0 = r0.mo36504k(r1)
            co.znly.core.ZenlyCore r1 = r4.f9512b
            io.reactivex.g r1 = r1.descendantUsers()
            app.zenly.locator.descendants.g$f r2 = app.zenly.locator.descendants.C3523g.C3529f.f9520i
            if (r2 == 0) goto L_0x001c
            app.zenly.locator.descendants.h r3 = new app.zenly.locator.descendants.h
            r3.<init>(r2)
            r2 = r3
        L_0x001c:
            io.reactivex.functions.Function r2 = (p389io.reactivex.functions.Function) r2
            io.reactivex.g r1 = r1.mo36552d(r2)
            io.reactivex.e r1 = r1.mo36553e()
            io.reactivex.m.b r2 = p389io.reactivex.p405m.C12774b.f33320a
            java.lang.String r2 = "contactsOnZenly"
            kotlin.jvm.internal.C12932j.m33815a(r0, r2)
            java.lang.String r2 = "descendants"
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            app.zenly.locator.descendants.g$d r2 = new app.zenly.locator.descendants.g$d
            r2.<init>(r4, r5)
            io.reactivex.e r5 = p389io.reactivex.C12279e.m32610a(r0, r1, r2)
            io.reactivex.g r5 = r5.mo36495f()
            java.lang.String r6 = "Observables\n            …          .firstOrError()"
            kotlin.jvm.internal.C12932j.m33815a(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.descendants.C3523g.getCurrentUserDescendants(long):io.reactivex.g");
    }

    public C12291g<List<RankedDescendant>> getFullLeaderBoard() {
        C12291g<List<RankedDescendant>> d = m10720a().mo36552d((Function<? super T, ? extends R>) new C3541h<Object,Object>(new C3532i(this)));
        C12932j.m33815a((Object) d, "getFriendList()\n        …::toRankedDescendantList)");
        return d;
    }

    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r1v1, types: [app.zenly.locator.descendants.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p389io.reactivex.C12291g<java.util.List<app.zenly.android.feature.descendants.model.RankedDescendant>> getLeaderBoard(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "targetUuid"
            kotlin.jvm.internal.C12932j.m33818b(r4, r0)
            kotlin.jvm.functions.Function1 r4 = r3.m10725a(r4)
            io.reactivex.g r0 = r3.m10720a()
            app.zenly.locator.descendants.g$j r1 = new app.zenly.locator.descendants.g$j
            r1.<init>(r3)
            app.zenly.locator.descendants.h r2 = new app.zenly.locator.descendants.h
            r2.<init>(r1)
            io.reactivex.g r0 = r0.mo36552d(r2)
            if (r4 == 0) goto L_0x0023
            app.zenly.locator.descendants.h r1 = new app.zenly.locator.descendants.h
            r1.<init>(r4)
            r4 = r1
        L_0x0023:
            io.reactivex.functions.Function r4 = (p389io.reactivex.functions.Function) r4
            io.reactivex.g r4 = r0.mo36552d(r4)
            java.lang.String r0 = "getFriendList()\n        …      .map(toLeaderBoard)"
            kotlin.jvm.internal.C12932j.m33815a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.descendants.C3523g.getLeaderBoard(java.lang.String):io.reactivex.g");
    }

    public C12291g<Integer> getNewDescendantCount(long j) {
        C12291g<Integer> d = getCurrentUserDescendants(j).mo36552d((Function<? super T, ? extends R>) C3534k.f9522e);
        C12932j.m33815a((Object) d, "getCurrentUserDescendant… it.count { it.newPop } }");
        return d;
    }

    public C12291g<Integer> getWorldwideRank(int i) {
        C7978a newBuilder = C7977a2.newBuilder();
        newBuilder.mo22053a(i);
        C12291g<Integer> d = this.f9512b.descendantWorldRank((C7977a2) newBuilder.build()).mo36555f(C3535l.f9523e).mo36552d((Function<? super T, ? extends R>) C3538m.f9525e);
        C12932j.m33815a((Object) d, "core.descendantWorldRank…         .map { it.rank }");
        return d;
    }

    /* renamed from: a */
    private final C12291g<List<UserProto$User>> m10720a() {
        C12279e i = this.f9513c.friends().mo36501i(C3531h.f9521e);
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) i, "friendsObservable");
        C12279e userMeStream = this.f9512b.userMeStream();
        C12932j.m33815a((Object) userMeStream, "core.userMeStream()");
        C12291g<List<UserProto$User>> f = C12279e.m32610a((ObservableSource<? extends T1>) i, (ObservableSource<? extends T2>) userMeStream, (BiFunction<? super T1, ? super T2, ? extends R>) new C3530g<Object,Object,Object>()).mo36495f();
        C12932j.m33815a((Object) f, "Observables.combineLates…          .firstOrError()");
        return f;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<RankedDescendant> m10723a(List<UserProto$User> list) {
        C3544b bVar = new C3544b(0, 0, 0, 7, null);
        Sequence b = C12857w.m33671b((Iterable) list);
        C3201f<UserProto$User> fVar = this.f9511a;
        C12932j.m33815a((Object) fVar, "sortByDescendingDescendantCount");
        return C12990j.m33935g(C12990j.m33934f(C12990j.m33930c(C12990j.m33925a(b, (Comparator) fVar), new C3540o(bVar))));
    }

    /* renamed from: a */
    private final Function1<List<? extends RankedDescendant>, List<RankedDescendant>> m10725a(String str) {
        return new C3526c(this, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12963e m10726a(int i, int i2) {
        if (i2 <= 5 || i < 3) {
            return C12973l.m33894d(0, Math.min(i2, 5));
        }
        if (i > i2 - 4) {
            return C12973l.m33894d(i2 - 5, i2);
        }
        return C12973l.m33894d(i - 2, i + 3);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<Descendant> m10724a(List<C7226u0> list, List<C2935a> list2, long j) {
        Object obj;
        List<C7226u0> a = C12857w.m33665a((Iterable) list, (Comparator) new C3525b());
        ArrayList arrayList = new ArrayList(C12850p.m33647a(a, 10));
        for (C7226u0 u0Var : a) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(list2, 10)), 16));
            for (Object next : list2) {
                linkedHashMap.put(((C2935a) next).mo9070b().getUuid(), next);
            }
            C2935a aVar = (C2935a) linkedHashMap.get(u0Var.getUuid());
            Timestamp descendantSince = u0Var.getDescendantSince();
            C12932j.m33815a((Object) descendantSince, "it.descendantSince");
            boolean z = C3245z.m10288g(descendantSince) > j;
            if (aVar != null) {
                obj = new C3543a(aVar, z);
            } else {
                obj = new C3546d(u0Var, z);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
