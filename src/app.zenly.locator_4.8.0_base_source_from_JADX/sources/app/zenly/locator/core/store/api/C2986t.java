package app.zenly.locator.core.store.api;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7280e;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.StatesProto$FriendsState;
import p213co.znly.models.core.StatesProto$FriendsState.C7023b;
import p213co.znly.models.core.StatesProto$FriendsState.C7025c;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.store.api.t */
public final class C2986t implements FriendDataSource {

    /* renamed from: a */
    private static final ZenlyCore f8374a = C5448c.m15478a();

    /* renamed from: b */
    public static final C2986t f8375b = new C2986t();

    /* renamed from: app.zenly.locator.core.store.api.t$a */
    static final class C2987a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2987a f8376e = new C2987a();

        C2987a() {
        }

        /* renamed from: a */
        public final C2985s0 apply(StatesProto$FriendsState statesProto$FriendsState) {
            C2985s0 s0Var;
            C12932j.m33818b(statesProto$FriendsState, "it");
            if (statesProto$FriendsState.hasState()) {
                C7025c state = statesProto$FriendsState.getState();
                C12932j.m33815a((Object) state, "it.state");
                List<UserProto$User> stateList = state.getStateList();
                C12932j.m33815a((Object) stateList, "it.state.stateList");
                ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
                for (UserProto$User userProto$User : stateList) {
                    C12932j.m33815a((Object) userProto$User, "user");
                    arrayList.add(new C2936a0(userProto$User));
                }
                return new C2989t0(arrayList);
            } else if (!statesProto$FriendsState.hasEvent()) {
                return C2940c0.f8324a;
            } else {
                C7023b event = statesProto$FriendsState.getEvent();
                String str = "it.event";
                C12932j.m33815a((Object) event, str);
                C7280e op = event.getOp();
                if (op != null) {
                    int i = C2984s.f8373a[op.ordinal()];
                    String str2 = "it.event.entity";
                    if (i == 1 || i == 2) {
                        C7023b event2 = statesProto$FriendsState.getEvent();
                        C12932j.m33815a((Object) event2, str);
                        UserProto$User entity = event2.getEntity();
                        C12932j.m33815a((Object) entity, str2);
                        s0Var = new C2983r0(new C2936a0(entity));
                    } else if (i == 3) {
                        C7023b event3 = statesProto$FriendsState.getEvent();
                        C12932j.m33815a((Object) event3, str);
                        UserProto$User entity2 = event3.getEntity();
                        C12932j.m33815a((Object) entity2, str2);
                        s0Var = new C2938b0(new C2936a0(entity2));
                    }
                    return s0Var;
                }
                return C2940c0.f8324a;
            }
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.t$b */
    static final class C2988b<T> implements Predicate<C2985s0> {

        /* renamed from: e */
        public static final C2988b f8377e = new C2988b();

        C2988b() {
        }

        /* renamed from: a */
        public final boolean test(C2985s0 s0Var) {
            C12932j.m33818b(s0Var, "it");
            return !(s0Var instanceof C2940c0);
        }
    }

    private C2986t() {
    }

    /* renamed from: a */
    public static final C2986t m9500a() {
        return f8375b;
    }

    public C12279e<C2985s0> friendEvents() {
        C12279e<C2985s0> b = f8374a.friendsStateStream().mo36501i(C2987a.f8376e).mo36459b((Predicate<? super T>) C2988b.f8377e);
        C12932j.m33815a((Object) b, "core.friendsStateStream(…ter { it !is FriendNoop }");
        return b;
    }
}
