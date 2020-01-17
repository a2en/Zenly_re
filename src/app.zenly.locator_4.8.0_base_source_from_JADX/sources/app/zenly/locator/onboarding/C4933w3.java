package app.zenly.locator.onboarding;

import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.onboarding.w3 */
public final class C4933w3 {

    /* renamed from: a */
    private final ZenlyCore f12927a = C5448c.m15478a();

    /* renamed from: b */
    private final FriendStore f12928b;

    /* renamed from: app.zenly.locator.onboarding.w3$a */
    public static final class C4934a {

        /* renamed from: a */
        private final UserProto$User f12929a;

        /* renamed from: b */
        private final List<UserProto$User> f12930b;

        public C4934a(UserProto$User userProto$User, List<UserProto$User> list) {
            C12932j.m33818b(userProto$User, "userMe");
            C12932j.m33818b(list, "friends");
            this.f12929a = userProto$User;
            this.f12930b = list;
        }

        /* renamed from: a */
        public final List<UserProto$User> mo12139a() {
            return this.f12930b;
        }

        /* renamed from: b */
        public final UserProto$User mo12140b() {
            return this.f12929a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f12930b, (java.lang.Object) r3.f12930b) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof app.zenly.locator.onboarding.C4933w3.C4934a
                if (r0 == 0) goto L_0x001d
                app.zenly.locator.onboarding.w3$a r3 = (app.zenly.locator.onboarding.C4933w3.C4934a) r3
                co.znly.models.UserProto$User r0 = r2.f12929a
                co.znly.models.UserProto$User r1 = r3.f12929a
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.util.List<co.znly.models.UserProto$User> r0 = r2.f12930b
                java.util.List<co.znly.models.UserProto$User> r3 = r3.f12930b
                boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.onboarding.C4933w3.C4934a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            UserProto$User userProto$User = this.f12929a;
            int i = 0;
            int hashCode = (userProto$User != null ? userProto$User.hashCode() : 0) * 31;
            List<UserProto$User> list = this.f12930b;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("UserMeWithFriends(userMe=");
            sb.append(this.f12929a);
            sb.append(", friends=");
            sb.append(this.f12930b);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.w3$b */
    static final class C4935b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4935b f12931e = new C4935b();

        /* renamed from: app.zenly.locator.onboarding.w3$b$a */
        public static final class C4936a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return C12998b.m33940a(Boolean.valueOf(C3194b0.m10163a((UserProto$User) t2)), Boolean.valueOf(C3194b0.m10163a((UserProto$User) t)));
            }
        }

        C4935b() {
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(List<C2936a0> list) {
            C12932j.m33818b(list, "friends");
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (C2936a0 a : list) {
                arrayList.add(a.mo9074a());
            }
            return C12857w.m33675c((Iterable) C12857w.m33665a((Iterable) arrayList, (Comparator) new C4936a()), 5);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.w3$c */
    public static final class C4937c<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            return new C4934a((UserProto$User) t1, (List) t2);
        }
    }

    public C4933w3(FriendStore friendStore) {
        C12932j.m33818b(friendStore, "friendStore");
        this.f12928b = friendStore;
    }

    /* renamed from: b */
    private final C12279e<List<UserProto$User>> m14265b() {
        C12279e<List<UserProto$User>> i = this.f12928b.friends().mo36501i(C4935b.f12931e);
        C12932j.m33815a((Object) i, "friendStore.friends()\n  …       .take(5)\n        }");
        return i;
    }

    /* renamed from: c */
    private final C12279e<UserProto$User> m14266c() {
        C12279e<UserProto$User> userMeStream = this.f12927a.userMeStream();
        C12932j.m33815a((Object) userMeStream, "core.userMeStream()");
        return userMeStream;
    }

    /* renamed from: a */
    public final C12279e<C4934a> mo12138a() {
        C12774b bVar = C12774b.f33320a;
        C12279e<C4934a> a = C12279e.m32610a((ObservableSource<? extends T1>) m14266c(), (ObservableSource<? extends T2>) m14265b(), (BiFunction<? super T1, ? super T2, ? extends R>) new C4937c<Object,Object,Object>());
        C12932j.m33815a((Object) a, "Observables.combineLates…ds(userMe, friends)\n    }");
        return a;
    }
}
