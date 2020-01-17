package app.zenly.locator.p042b0;

import app.zenly.android.feature.spam.prevention.model.C1468a;
import app.zenly.android.feature.spam.prevention.model.SpammedUser;
import app.zenly.android.feature.spam.prevention.repository.SpamPreventionRepository;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.p042b0.p043g.C1710a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6810b;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.services.C7979a3;
import p213co.znly.models.services.C8399z2;
import p213co.znly.models.services.C8399z2.C8400a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.b0.d */
public final class C1692d implements SpamPreventionRepository {

    /* renamed from: e */
    private static final C6810b[] f5742e = {C6810b.SOURCE_PROFILE_OTHER_FRIEND_LIST, C6810b.SOURCE_ADDFRIEND_SUGGESTED, C6810b.SOURCE_DASHBOARD_SUGGESTED, C6810b.SOURCE_ONBOARDING_SUGGESTED};

    /* renamed from: a */
    private final FriendRequestStore f5743a;

    /* renamed from: b */
    private final ContactAlreadyOnZenlyStore f5744b;

    /* renamed from: c */
    private final ZenlyCore f5745c;

    /* renamed from: d */
    private final MeUserManager f5746d;

    /* renamed from: app.zenly.locator.b0.d$a */
    public static final class C1693a {
        private C1693a() {
        }

        public /* synthetic */ C1693a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.b0.d$b */
    static final class C1694b<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C1694b f5747e = new C1694b();

        C1694b() {
        }

        /* renamed from: a */
        public final List<C2956k0> mo7304a(List<C2956k0> list) {
            C12932j.m33818b(list, "it");
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo7304a(list);
            return list;
        }
    }

    /* renamed from: app.zenly.locator.b0.d$c */
    static final /* synthetic */ class C1695c extends C12931i implements Function1<C2956k0, C12279e<Boolean>> {
        C1695c(C1692d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final C12279e<Boolean> invoke(C2956k0 k0Var) {
            C12932j.m33818b(k0Var, "p1");
            return ((C1692d) this.f33505f).m7026a(k0Var);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1692d.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "cancelFriendRequest(Lapp/zenly/locator/core/store/api/FriendRequest;)Lio/reactivex/Observable;";
        }

        public final String getName() {
            return "cancelFriendRequest";
        }
    }

    /* renamed from: app.zenly.locator.b0.d$d */
    static final class C1696d<T1, T2, R> implements BiFunction<Boolean, Boolean, Boolean> {

        /* renamed from: a */
        public static final C1696d f5748a = new C1696d();

        C1696d() {
        }

        /* renamed from: a */
        public final boolean mo7306a(Boolean bool, Boolean bool2) {
            C12932j.m33818b(bool, "r1");
            C12932j.m33818b(bool2, "r2");
            return bool.booleanValue() && bool2.booleanValue();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return Boolean.valueOf(mo7306a((Boolean) obj, (Boolean) obj2));
        }
    }

    /* renamed from: app.zenly.locator.b0.d$e */
    static final class C1697e<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1697e f5749e = new C1697e();

        C1697e() {
        }

        /* renamed from: a */
        public final boolean mo7307a(C7979a3 a3Var) {
            C12932j.m33818b(a3Var, "it");
            FriendRequestProto$FriendRequest friendRequest = a3Var.getFriendRequest();
            C12932j.m33815a((Object) friendRequest, "it.friendRequest");
            return friendRequest.getStatus() == C6812c.canceled;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo7307a((C7979a3) obj));
        }
    }

    /* renamed from: app.zenly.locator.b0.d$f */
    static final class C1698f<T, R> implements Function<Throwable, Boolean> {

        /* renamed from: e */
        public static final C1698f f5750e = new C1698f();

        C1698f() {
        }

        /* renamed from: a */
        public final boolean mo7308a(Throwable th) {
            C12932j.m33818b(th, "it");
            return false;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo7308a((Throwable) obj));
        }
    }

    /* renamed from: app.zenly.locator.b0.d$g */
    public static final class C1699g<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C1692d f5751a;

        public C1699g(C1692d dVar) {
            this.f5751a = dVar;
        }

        public final R apply(T1 t1, T2 t2) {
            return this.f5751a.m7028a((List) t1, (List) t2);
        }
    }

    /* renamed from: app.zenly.locator.b0.d$h */
    static final class C1700h<T, R> implements Function<Throwable, List<? extends C2935a>> {

        /* renamed from: e */
        public static final C1700h f5752e = new C1700h();

        C1700h() {
        }

        /* renamed from: a */
        public final List<C2935a> apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return C12848o.m33640a();
        }
    }

    /* renamed from: app.zenly.locator.b0.d$i */
    static final class C1701i<T, R> implements Function<Throwable, List<? extends C2956k0>> {

        /* renamed from: e */
        public static final C1701i f5753e = new C1701i();

        C1701i() {
        }

        /* renamed from: a */
        public final List<C2956k0> apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return C12848o.m33640a();
        }
    }

    /* renamed from: app.zenly.locator.b0.d$j */
    static final /* synthetic */ class C1702j extends C12931i implements Function1<List<? extends C2956k0>, List<? extends C2956k0>> {
        C1702j(C1692d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final List<C2956k0> invoke(List<C2956k0> list) {
            C12932j.m33818b(list, "p1");
            return ((C1692d) this.f33505f).m7030b(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1692d.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "keepPotentialSpamRequests(Ljava/util/List;)Ljava/util/List;";
        }

        public final String getName() {
            return "keepPotentialSpamRequests";
        }
    }

    /* renamed from: app.zenly.locator.b0.d$k */
    static final /* synthetic */ class C1703k extends C12931i implements Function1<List<? extends C2956k0>, C1468a> {
        C1703k(C1692d dVar) {
            super(1, dVar);
        }

        /* renamed from: a */
        public final C1468a invoke(List<C2956k0> list) {
            C12932j.m33818b(list, "p1");
            return ((C1692d) this.f33505f).m7024a(list);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1692d.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "checkThresholds(Ljava/util/List;)Lapp/zenly/android/feature/spam/prevention/model/SpamType;";
        }

        public final String getName() {
            return "checkThresholds";
        }
    }

    /* renamed from: app.zenly.locator.b0.d$l */
    static final class C1704l<T, R> implements Function<Throwable, C1468a> {

        /* renamed from: e */
        public static final C1704l f5754e = new C1704l();

        C1704l() {
        }

        /* renamed from: a */
        public final C1468a apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return C1468a.NO_SPAM;
        }
    }

    /* renamed from: app.zenly.locator.b0.d$m */
    static final class C1705m<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C1705m f5755e = new C1705m();

        C1705m() {
        }

        /* renamed from: a */
        public final List<C2956k0> mo7314a(List<C2956k0> list) {
            C12932j.m33818b(list, "it");
            return list;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            mo7314a(list);
            return list;
        }
    }

    /* renamed from: app.zenly.locator.b0.d$n */
    static final class C1706n<T> implements Predicate<C2956k0> {

        /* renamed from: e */
        public static final C1706n f5756e = new C1706n();

        C1706n() {
        }

        /* renamed from: a */
        public final boolean test(C2956k0 k0Var) {
            C12932j.m33818b(k0Var, "it");
            return k0Var.mo9122b().getStatus() == C6812c.pending;
        }
    }

    /* renamed from: app.zenly.locator.b0.d$o */
    static final class C1707o<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1707o f5757e = new C1707o();

        C1707o() {
        }

        /* renamed from: a */
        public final int mo7316a(Long l) {
            C12932j.m33818b(l, "it");
            return ((int) l.longValue()) + 1;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(mo7316a((Long) obj));
        }
    }

    static {
        new C1693a(null);
    }

    public C1692d(FriendRequestStore friendRequestStore, ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore, ZenlyCore zenlyCore, MeUserManager meUserManager) {
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        C12932j.m33818b(contactAlreadyOnZenlyStore, "aozStore");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(meUserManager, "meUserManager");
        this.f5743a = friendRequestStore;
        this.f5744b = contactAlreadyOnZenlyStore;
        this.f5745c = zenlyCore;
        this.f5746d = meUserManager;
    }

    /* renamed from: c */
    private final boolean m7031c(List<C2956k0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C1709f.m7053b(((C2956k0) next).mo9122b(), this.f5745c) <= TimeUnit.HOURS.toMillis(1)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() + 1 >= 20) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m7032d(List<C2956k0> list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C1709f.m7053b(((C2956k0) next).mo9122b(), this.f5745c) <= ((long) 3500)) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() + 1 >= 5) {
            return true;
        }
        return false;
    }

    public C12279e<Boolean> cancelAllFriendRequests() {
        C12279e<Boolean> b = this.f5743a.friendRequests().mo36495f().mo36553e().mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C1694b.f5747e).mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C1708e<Object,Object>(new C1695c(this))).mo36411a((BiFunction<T, T, T>) C1696d.f5748a).mo36396b();
        C12932j.m33815a((Object) b, "friendRequestStore.frien…          .toObservable()");
        return b;
    }

    public C12279e<Boolean> cancelFriendRequest(String str) {
        C12932j.m33818b(str, "uuid");
        C8400a newBuilder = C8399z2.newBuilder();
        newBuilder.setUuid(str);
        newBuilder.mo22342a(C6812c.canceled);
        C12279e<Boolean> k = this.f5745c.friendRequestRespond((C8399z2) newBuilder.build()).mo36501i(C1697e.f5749e).mo36504k(C1698f.f5750e);
        C12932j.m33815a((Object) k, "core.friendRequestRespon… .onErrorReturn { false }");
        return k;
    }

    public C12279e<List<SpammedUser>> getSpammedUsers() {
        C12279e k = this.f5743a.friendRequests().mo36504k(C1701i.f5753e);
        C12279e k2 = this.f5744b.contactsAlreadyOnZenly().mo36504k(C1700h.f5752e);
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) k2, "contactsOnZenly");
        C12932j.m33815a((Object) k, "friendRequests");
        C12279e<List<SpammedUser>> a = C12279e.m32610a((ObservableSource<? extends T1>) k2, (ObservableSource<? extends T2>) k, (BiFunction<? super T1, ? super T2, ? extends R>) new C1699g<Object,Object,Object>(this));
        C12932j.m33815a((Object) a, "Observables.combineLates…ests, ::buildSpammedUser)");
        return a;
    }

    public C12279e<C1468a> isSpamThresholdReachedOnNextRequest() {
        C12279e<C1468a> k = this.f5743a.friendRequests().mo36495f().mo36553e().mo36501i(new C1708e(new C1702j(this))).mo36501i(new C1708e(new C1703k(this))).mo36504k(C1704l.f5754e);
        C12932j.m33815a((Object) k, "friendRequestStore.frien…turn { SpamType.NO_SPAM }");
        return k;
    }

    public C12279e<Integer> uponNextRequestGetFriendRequestCount() {
        C12279e<Integer> e = this.f5743a.friendRequests().mo36495f().mo36553e().mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C1705m.f5755e).mo36459b((Predicate<? super T>) C1706n.f5756e).mo36474c().mo36552d((Function<? super T, ? extends R>) C1707o.f5757e).mo36553e();
        C12932j.m33815a((Object) e, "friendRequestStore.frien…          .toObservable()");
        return e;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final List<C2956k0> m7030b(List<C2956k0> list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (C12840k.m33571a((Object[]) f5742e, (Object) ((C2956k0) next).mo9122b().getSource())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12279e<Boolean> m7026a(C2956k0 k0Var) {
        String uuid = k0Var.mo9122b().getUuid();
        C12932j.m33815a((Object) uuid, "friendRequest.request.uuid");
        return cancelFriendRequest(uuid);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C1468a m7024a(List<C2956k0> list) {
        if (m7031c(list)) {
            return C1468a.HOUR;
        }
        if (m7032d(list)) {
            return C1468a.SHORT_TIME;
        }
        return C1468a.NO_SPAM;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final List<SpammedUser> m7028a(List<C2935a> list, List<C2956k0> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(list, 10)), 16));
        for (Object next : list) {
            linkedHashMap.put(((C2935a) next).mo9070b().getUuid(), next);
        }
        ArrayList<C2956k0> arrayList = new ArrayList<>();
        for (Object next2 : list2) {
            C2956k0 k0Var = (C2956k0) next2;
            if (k0Var.mo9122b().getStatus() == C6812c.pending && C12932j.m33817a((Object) k0Var.mo9122b().getAuthorUuid(), (Object) this.f5746d.mo8756b().f8250a.mo8945g())) {
                arrayList.add(next2);
            }
        }
        ArrayList arrayList2 = new ArrayList(C12850p.m33647a(arrayList, 10));
        for (C2956k0 k0Var2 : arrayList) {
            C2935a aVar = (C2935a) linkedHashMap.get(k0Var2.mo9123c().getUuid());
            arrayList2.add(new C1710a(k0Var2, aVar != null ? aVar.mo9069a() : null));
        }
        return arrayList2;
    }
}
