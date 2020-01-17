package app.zenly.locator.map.fog;

import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.api.FriendRequestStore;
import app.zenly.locator.core.util.C3194b0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C6947a3;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7159m1;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Function4;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.map.fog.d */
public final class C3968d {

    /* renamed from: a */
    private final ZenlyCore f10490a;

    /* renamed from: b */
    private final C2718k5 f10491b;

    /* renamed from: c */
    private final ContactAlreadyOnZenlyStore f10492c;

    /* renamed from: d */
    private final FriendRequestStore f10493d;

    /* renamed from: app.zenly.locator.map.fog.d$a */
    public static final class C3969a {

        /* renamed from: a */
        private UserProto$User f10494a;

        /* renamed from: b */
        private List<UserProto$User> f10495b = C12848o.m33640a();

        /* renamed from: c */
        private final String f10496c;

        /* renamed from: d */
        private final boolean f10497d;

        /* renamed from: e */
        private final boolean f10498e;

        /* renamed from: f */
        private final long f10499f;

        public C3969a(String str, boolean z, boolean z2, long j) {
            C12932j.m33818b(str, "displayName");
            this.f10496c = str;
            this.f10497d = z;
            this.f10498e = z2;
            this.f10499f = j;
            UserProto$User defaultInstance = UserProto$User.getDefaultInstance();
            C12932j.m33815a((Object) defaultInstance, "UserProto.User.getDefaultInstance()");
            this.f10494a = defaultInstance;
        }

        /* renamed from: a */
        public final String mo10628a() {
            return this.f10496c;
        }

        /* renamed from: b */
        public final boolean mo10631b() {
            return this.f10498e;
        }

        /* renamed from: c */
        public final long mo10632c() {
            return this.f10499f;
        }

        /* renamed from: d */
        public final List<UserProto$User> mo10633d() {
            return this.f10495b;
        }

        /* renamed from: e */
        public final UserProto$User mo10634e() {
            return this.f10494a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C3969a) {
                    C3969a aVar = (C3969a) obj;
                    if (C12932j.m33817a((Object) this.f10496c, (Object) aVar.f10496c)) {
                        if (this.f10497d == aVar.f10497d) {
                            if (this.f10498e == aVar.f10498e) {
                                if (this.f10499f == aVar.f10499f) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final boolean mo10636f() {
            return this.f10497d;
        }

        public int hashCode() {
            String str = this.f10496c;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            boolean z = this.f10497d;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z2 = this.f10498e;
            if (z2) {
                z2 = true;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + Long.valueOf(this.f10499f).hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FogUserInfo(displayName=");
            sb.append(this.f10496c);
            sb.append(", isInMyAddressBook=");
            sb.append(this.f10497d);
            sb.append(", hasBeenInvited=");
            sb.append(this.f10498e);
            sb.append(", lastInviteUnixTimestamp=");
            sb.append(this.f10499f);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public final void mo10629a(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "<set-?>");
            this.f10494a = userProto$User;
        }

        /* renamed from: a */
        public final void mo10630a(List<UserProto$User> list) {
            C12932j.m33818b(list, "<set-?>");
            this.f10495b = list;
        }
    }

    /* renamed from: app.zenly.locator.map.fog.d$b */
    public static final class C3970b<T1, T2, T3, T4, R> implements Function4<T1, T2, T3, T4, R> {

        /* renamed from: a */
        final /* synthetic */ String f10500a;

        public C3970b(String str) {
            this.f10500a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            if (r0 != null) goto L_0x004d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final R apply(T1 r11, T2 r12, T3 r13, T4 r14) {
            /*
                r10 = this;
                java.util.List r14 = (java.util.List) r14
                java.util.List r13 = (java.util.List) r13
                java.util.List r12 = (java.util.List) r12
                co.znly.models.UserProto$User r11 = (p213co.znly.models.UserProto$User) r11
                java.util.Iterator r13 = r13.iterator()
            L_0x000c:
                boolean r0 = r13.hasNext()
                r1 = 0
                if (r0 == 0) goto L_0x002b
                java.lang.Object r0 = r13.next()
                r2 = r0
                app.zenly.locator.core.store.api.a r2 = (app.zenly.locator.core.store.api.C2935a) r2
                co.znly.models.UserProto$User r2 = r2.mo9070b()
                java.lang.String r2 = r2.getUuid()
                java.lang.String r3 = r10.f10500a
                boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r2, r3)
                if (r2 == 0) goto L_0x000c
                goto L_0x002c
            L_0x002b:
                r0 = r1
            L_0x002c:
                app.zenly.locator.core.store.api.a r0 = (app.zenly.locator.core.store.api.C2935a) r0
                r13 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0034
                r5 = 1
                goto L_0x0035
            L_0x0034:
                r5 = 0
            L_0x0035:
                java.lang.String r9 = "user"
                if (r0 == 0) goto L_0x0046
                co.znly.models.i r0 = r0.mo9069a()
                if (r0 == 0) goto L_0x0046
                java.lang.String r0 = r0.getFull()
                if (r0 == 0) goto L_0x0046
                goto L_0x004d
            L_0x0046:
                kotlin.jvm.internal.C12932j.m33815a(r11, r9)
                java.lang.String r0 = r11.getName()
            L_0x004d:
                r4 = r0
                java.lang.String r0 = "friendRequests"
                kotlin.jvm.internal.C12932j.m33815a(r14, r0)
                java.util.Iterator r14 = r14.iterator()
            L_0x0057:
                boolean r0 = r14.hasNext()
                if (r0 == 0) goto L_0x0086
                java.lang.Object r0 = r14.next()
                r3 = r0
                app.zenly.locator.core.store.api.k0 r3 = (app.zenly.locator.core.store.api.C2956k0) r3
                co.znly.models.FriendRequestProto$FriendRequest r6 = r3.mo9122b()
                java.lang.String r6 = r6.getTargetUuid()
                java.lang.String r7 = r10.f10500a
                boolean r6 = kotlin.jvm.internal.C12932j.m33817a(r6, r7)
                if (r6 == 0) goto L_0x0082
                co.znly.models.FriendRequestProto$FriendRequest r3 = r3.mo9122b()
                co.znly.models.FriendRequestProto$FriendRequest$c r3 = r3.getStatus()
                co.znly.models.FriendRequestProto$FriendRequest$c r6 = p213co.znly.models.FriendRequestProto$FriendRequest.C6812c.pending
                if (r3 != r6) goto L_0x0082
                r3 = 1
                goto L_0x0083
            L_0x0082:
                r3 = 0
            L_0x0083:
                if (r3 == 0) goto L_0x0057
                goto L_0x0087
            L_0x0086:
                r0 = r1
            L_0x0087:
                app.zenly.locator.core.store.api.k0 r0 = (app.zenly.locator.core.store.api.C2956k0) r0
                if (r0 == 0) goto L_0x008d
                r6 = 1
                goto L_0x008e
            L_0x008d:
                r6 = 0
            L_0x008e:
                if (r0 == 0) goto L_0x00a1
                co.znly.models.FriendRequestProto$FriendRequest r13 = r0.mo9122b()
                if (r13 == 0) goto L_0x00a1
                co.znly.core.vendor.com.google.protobuf.Timestamp r13 = r13.getUpdatedAt()
                if (r13 == 0) goto L_0x00a1
                long r13 = app.zenly.locator.core.util.C3245z.m10288g(r13)
                goto L_0x00a3
            L_0x00a1:
                r13 = 0
            L_0x00a3:
                r7 = r13
                app.zenly.locator.map.fog.d$a r13 = new app.zenly.locator.map.fog.d$a
                java.lang.String r14 = "displayName"
                kotlin.jvm.internal.C12932j.m33815a(r4, r14)
                r3 = r13
                r3.<init>(r4, r5, r6, r7)
                kotlin.jvm.internal.C12932j.m33815a(r11, r9)
                r13.mo10629a(r11)
                r13.mo10630a(r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.fog.C3968d.C3970b.apply(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: app.zenly.locator.map.fog.d$c */
    static final class C3971c<T> implements Predicate<C2831a> {

        /* renamed from: e */
        public static final C3971c f10501e = new C3971c();

        C3971c() {
        }

        /* renamed from: a */
        public final boolean test(C2831a aVar) {
            C12932j.m33818b(aVar, "event");
            if (C2831a.m9302a(aVar.mo8857b(), 1)) {
                C2896p c = aVar.mo8858c();
                C12932j.m33815a((Object) c, "event.friend");
                if (c.mo8979d()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: app.zenly.locator.map.fog.d$d */
    static final class C3972d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3972d f10502e = new C3972d();

        /* renamed from: app.zenly.locator.map.fog.d$d$a */
        public static final class C3973a<T> implements Comparator<T> {
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

        C3972d() {
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(C7159m1 m1Var) {
            C12932j.m33818b(m1Var, "friendsState");
            List friendsList = m1Var.getFriendsList();
            C12932j.m33815a((Object) friendsList, "friendsState.friendsList");
            List<UserProto$User> d = C12857w.m33678d((Collection) friendsList);
            if (d.size() > 1) {
                C12853s.m33649a(d, new C3973a());
            }
            return d;
        }
    }

    public C3968d(ZenlyCore zenlyCore, C2718k5 k5Var, ContactAlreadyOnZenlyStore contactAlreadyOnZenlyStore, FriendRequestStore friendRequestStore) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(k5Var, "friendsManager");
        C12932j.m33818b(contactAlreadyOnZenlyStore, "aozStore");
        C12932j.m33818b(friendRequestStore, "friendRequestStore");
        this.f10490a = zenlyCore;
        this.f10491b = k5Var;
        this.f10492c = contactAlreadyOnZenlyStore;
        this.f10493d = friendRequestStore;
    }

    /* renamed from: c */
    private final C12279e<List<UserProto$User>> m11598c(String str) {
        C12279e<List<UserProto$User>> i = this.f10490a.userPublicMutualFriendsState(str).mo36501i(C3972d.f10502e);
        C12932j.m33815a((Object) i, "core.userPublicMutualFri…    friends\n            }");
        return i;
    }

    /* renamed from: a */
    public final C12279e<C3969a> mo10625a(String str) {
        C12932j.m33818b(str, "userUuid");
        C12774b bVar = C12774b.f33320a;
        C12279e c = this.f10490a.userPublicStream(str).mo36466c((ObservableSource<? extends T>) C12279e.m32633q());
        C12932j.m33815a((Object) c, "core.userPublicStream(us…eNext(Observable.empty())");
        C12279e c2 = m11598c(str);
        C12279e contactsAlreadyOnZenly = this.f10492c.contactsAlreadyOnZenly();
        C12279e e = this.f10493d.friendRequests().mo36487e(1);
        C12932j.m33815a((Object) e, "friendRequestStore.friendRequests().take(1)");
        C12279e<C3969a> a = C12279e.m32608a(c, c2, contactsAlreadyOnZenly, e, new C3970b(str));
        C12932j.m33815a((Object) a, "Observables.combineLates…s\n            }\n        }");
        return a;
    }

    /* renamed from: b */
    public final C12279e<C2831a> mo10627b(String str) {
        C12932j.m33818b(str, "userUuid");
        C12279e<C2831a> b = this.f10491b.mo8789b(str).mo36459b((Predicate<? super T>) C3971c.f10501e);
        C12932j.m33815a((Object) b, "friendsManager.getFriend…end.isValid\n            }");
        return b;
    }

    /* renamed from: a */
    public final boolean mo10626a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        C2896p a = this.f10491b.mo8779a(userProto$User.getUuid());
        boolean z = (a != null ? a.f8198b : null) == null || a.f8201e;
        if (userProto$User.getBlockRelationship() == C6947a3.IS_BLOCKED || userProto$User.getBlockRelationship() == C6947a3.BLOCKED_YOU || userProto$User.getPrivateMode() || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final long mo10624a(long j) {
        Date timeNow = this.f10490a.timeNow();
        C12932j.m33815a((Object) timeNow, "core.timeNow()");
        return timeNow.getTime() - j;
    }
}
