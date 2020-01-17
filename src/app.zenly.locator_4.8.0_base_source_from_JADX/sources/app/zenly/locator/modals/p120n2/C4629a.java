package app.zenly.locator.modals.p120n2;

import android.app.Activity;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2587f0.C2588a;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.C2625y.C2626a;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5362s;
import app.zenly.locator.recommendation.C5249f;
import app.zenly.locator.recommendation.C5266k;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12943u;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6810b;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7135k0;
import p213co.znly.models.core.C7135k0.C7136a;
import p213co.znly.models.core.C7142l0;
import p213co.znly.models.core.C7159m1;
import p213co.znly.models.services.C7979a3;
import p213co.znly.models.services.C8399z2;
import p213co.znly.models.services.C8399z2.C8400a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.modals.n2.a */
public final class C4629a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f12303a;

    /* renamed from: b */
    private final ZenlySchedulers f12304b = C1351e.m6372a(C5249f.f13535b.mo19916a("modalViewModel"));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Activity f12305c;

    /* renamed from: d */
    private final FriendRequestStore f12306d;

    /* renamed from: e */
    private final C5266k f12307e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ZenlyCore f12308f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C5343a f12309g;

    /* renamed from: app.zenly.locator.modals.n2.a$a */
    static final class C4630a<T> implements Predicate<C7159m1> {

        /* renamed from: e */
        public static final C4630a f12310e = new C4630a();

        C4630a() {
        }

        /* renamed from: a */
        public final boolean test(C7159m1 m1Var) {
            C12932j.m33818b(m1Var, "it");
            List friendsList = m1Var.getFriendsList();
            C12932j.m33815a((Object) friendsList, "it.friendsList");
            return !friendsList.isEmpty();
        }
    }

    /* renamed from: app.zenly.locator.modals.n2.a$b */
    static final class C4631b<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C4629a f12311e;

        /* renamed from: app.zenly.locator.modals.n2.a$b$a */
        public static final class C4632a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                UserProto$User userProto$User = (UserProto$User) t2;
                String str = "user";
                C12932j.m33815a((Object) userProto$User, str);
                Boolean valueOf = Boolean.valueOf(C3194b0.m10163a(userProto$User));
                UserProto$User userProto$User2 = (UserProto$User) t;
                C12932j.m33815a((Object) userProto$User2, str);
                return C12998b.m33940a(valueOf, Boolean.valueOf(C3194b0.m10163a(userProto$User2)));
            }
        }

        C4631b(C4629a aVar) {
            this.f12311e = aVar;
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(C7159m1 m1Var) {
            C12932j.m33818b(m1Var, "mutualFriendsState");
            this.f12311e.f12303a = m1Var.getFriendsList().size();
            List friendsList = m1Var.getFriendsList();
            C12932j.m33815a((Object) friendsList, "mutualFriendsState.friendsList");
            return C12857w.m33665a((Iterable) friendsList, (Comparator) new C4632a());
        }
    }

    /* renamed from: app.zenly.locator.modals.n2.a$c */
    static final class C4633c<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ C4629a f12312e;

        /* renamed from: f */
        final /* synthetic */ UserProto$User f12313f;

        /* renamed from: app.zenly.locator.modals.n2.a$c$a */
        public static final class C4634a implements InvitationCallback {

            /* renamed from: a */
            final /* synthetic */ CountDownLatch f12314a;

            /* renamed from: b */
            final /* synthetic */ C12943u f12315b;

            C4634a(CountDownLatch countDownLatch, C12943u uVar) {
                this.f12314a = countDownLatch;
                this.f12315b = uVar;
            }

            public void onCancel() {
                this.f12315b.f33526e = false;
                this.f12314a.countDown();
            }

            public boolean onError(C2624x xVar) {
                C12932j.m33818b(xVar, "error");
                this.f12315b.f33526e = false;
                this.f12314a.countDown();
                return false;
            }

            public void onSuccess() {
                this.f12314a.countDown();
            }
        }

        C4633c(C4629a aVar, UserProto$User userProto$User) {
            this.f12312e = aVar;
            this.f12313f = userProto$User;
        }

        public final boolean call() {
            C12943u uVar = new C12943u();
            uVar.f33526e = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C2538c0.m8837a(this.f12312e.f12305c).mo8670a(C2626a.m8955a(C2625y.f7738e, C2587f0.SOURCE_RECOMMENDATION, this.f12313f, false, null, false, 28, null), (InvitationCallback) new C4634a(countDownLatch, uVar));
            countDownLatch.await();
            return uVar.f33526e;
        }
    }

    /* renamed from: app.zenly.locator.modals.n2.a$d */
    static final class C4635d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C4629a f12316e;

        /* renamed from: f */
        final /* synthetic */ UserProto$User f12317f;

        /* renamed from: app.zenly.locator.modals.n2.a$d$a */
        static final class C4636a<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C4636a f12318e = new C4636a();

            C4636a() {
            }

            /* renamed from: a */
            public final boolean mo11792a(C7979a3 a3Var) {
                C12932j.m33818b(a3Var, "response");
                FriendRequestProto$FriendRequest friendRequest = a3Var.getFriendRequest();
                C12932j.m33815a((Object) friendRequest, "response.friendRequest");
                return friendRequest.getStatus() == C6812c.accepted;
            }

            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return Boolean.valueOf(mo11792a((C7979a3) obj));
            }
        }

        C4635d(C4629a aVar, UserProto$User userProto$User) {
            this.f12316e = aVar;
            this.f12317f = userProto$User;
        }

        /* renamed from: a */
        public final C12279e<Boolean> apply(List<C2956k0> list) {
            Object obj;
            C12932j.m33818b(list, "friendRequests");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C12932j.m33817a((Object) ((C2956k0) obj).mo9122b().getAuthorUuid(), (Object) this.f12317f.getUuid())) {
                    break;
                }
            }
            C2956k0 k0Var = (C2956k0) obj;
            if (k0Var == null || k0Var.mo9122b().getStatus() != C6812c.pending) {
                return this.f12316e.m13539b(this.f12317f);
            }
            C5343a a = this.f12316e.f12309g;
            C2588a aVar = C2587f0.f7651C;
            C6810b source = k0Var.mo9122b().getSource();
            C12932j.m33815a((Object) source, "pendingFriendRequest.request.source");
            a.mo12814a(aVar.mo8693a(source), Boolean.valueOf(false), C3194b0.m10163a(this.f12317f), Integer.valueOf(this.f12316e.f12303a), (C5362s) null);
            C8400a newBuilder = C8399z2.newBuilder();
            newBuilder.setUuid(k0Var.mo9124d());
            newBuilder.mo22342a(C6812c.accepted);
            return this.f12316e.f12308f.friendRequestRespond((C8399z2) newBuilder.build()).mo36501i(C4636a.f12318e);
        }
    }

    public C4629a(Activity activity, FriendRequestStore friendRequestStore, C5266k kVar, ZenlyCore zenlyCore, C5343a aVar) {
        C12932j.m33818b(activity, "context");
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        C12932j.m33818b(kVar, "recommendationRepository");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(aVar, "analytics");
        this.f12305c = activity;
        this.f12306d = friendRequestStore;
        this.f12307e = kVar;
        this.f12308f = zenlyCore;
        this.f12309g = aVar;
    }

    /* renamed from: b */
    public final C12291g<C7142l0> mo11786b(String str) {
        C12932j.m33818b(str, "newComerUuid");
        C7136a newBuilder = C7135k0.newBuilder();
        newBuilder.mo19124a(str);
        C12291g<C7142l0> recoPotentialMatches = this.f12308f.recoPotentialMatches((C7135k0) newBuilder.build());
        C12932j.m33815a((Object) recoPotentialMatches, "core.recoPotentialMatches(request)");
        return recoPotentialMatches;
    }

    /* renamed from: a */
    public final C12279e<List<UserProto$User>> mo11784a(String str) {
        C12932j.m33818b(str, "userUuid");
        C12279e<List<UserProto$User>> i = this.f12308f.userPublicMutualFriendsState(str).mo36428a((C12286f) this.f12304b.getComputation().mo6569a("mutualFriends")).mo36459b((Predicate<? super T>) C4630a.f12310e).mo36501i(new C4631b(this));
        C12932j.m33815a((Object) i, "core.userPublicMutualFri…sAvatar() }\n            }");
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C12279e<Boolean> m13539b(UserProto$User userProto$User) {
        C12279e<Boolean> a = C12279e.m32616a((Callable<? extends T>) new C4633c<Object>(this, userProto$User));
        C12932j.m33815a((Object) a, "Observable.fromCallable …        success\n        }");
        return a;
    }

    /* renamed from: a */
    public final void mo11785a(UserProto$User userProto$User, boolean z) {
        C12932j.m33818b(userProto$User, "potentialMatch");
        C5266k kVar = this.f12307e;
        String uuid = userProto$User.getUuid();
        C12932j.m33815a((Object) uuid, "potentialMatch.uuid");
        kVar.mo12623a(uuid, z);
    }

    /* renamed from: a */
    public final C12279e<Boolean> mo11783a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "potentialMatch");
        C12279e<Boolean> m = this.f12306d.friendRequests().mo36495f().mo36535a((C12286f) this.f12304b.getComputation().mo6569a("sendFriendRequest")).mo36553e().mo36509m(new C4635d(this, userProto$User));
        C12932j.m33815a((Object) m, "friendRequestStore.frien…          }\n            }");
        return m;
    }
}
