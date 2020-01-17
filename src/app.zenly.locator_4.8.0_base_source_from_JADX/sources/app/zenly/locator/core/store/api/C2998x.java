package app.zenly.locator.core.store.api;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7280e;
import p213co.znly.models.core.StatesProto$FriendRequestsState;
import p213co.znly.models.core.StatesProto$FriendRequestsState.C7018b;
import p213co.znly.models.core.StatesProto$FriendRequestsState.C7020c;
import p213co.znly.models.services.ZenlyProto$FriendRequestWithUser;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.store.api.x */
public final class C2998x implements FriendRequestDataSource {

    /* renamed from: a */
    private static final ZenlyCore f8388a = C5448c.m15478a();

    /* renamed from: b */
    public static final C2998x f8389b = new C2998x();

    /* renamed from: app.zenly.locator.core.store.api.x$a */
    static final class C2999a<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C2999a f8390e = new C2999a();

        C2999a() {
        }

        /* renamed from: a */
        public final List<C2956k0> apply(C2973p0 p0Var) {
            C12932j.m33818b(p0Var, "action");
            if (p0Var instanceof C2975q0) {
                return ((C2975q0) p0Var).mo9156a();
            }
            if (p0Var instanceof C2965o0) {
                return C12846n.m33635a(((C2965o0) p0Var).mo9147a());
            }
            return C12848o.m33640a();
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.x$b */
    static final class C3000b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3000b f8391e = new C3000b();

        C3000b() {
        }

        /* renamed from: a */
        public final C2973p0 apply(StatesProto$FriendRequestsState statesProto$FriendRequestsState) {
            C2973p0 p0Var;
            C12932j.m33818b(statesProto$FriendRequestsState, "it");
            if (statesProto$FriendRequestsState.hasState()) {
                C7020c state = statesProto$FriendRequestsState.getState();
                C12932j.m33815a((Object) state, "it.state");
                List<ZenlyProto$FriendRequestWithUser> stateList = state.getStateList();
                C12932j.m33815a((Object) stateList, "it.state.stateList");
                ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
                for (ZenlyProto$FriendRequestWithUser zenlyProto$FriendRequestWithUser : stateList) {
                    C12932j.m33815a((Object) zenlyProto$FriendRequestWithUser, "item");
                    arrayList.add(C2959l0.m9479b(zenlyProto$FriendRequestWithUser));
                }
                return new C2975q0(arrayList);
            } else if (!statesProto$FriendRequestsState.hasEvent()) {
                return C2963n0.f8351a;
            } else {
                C7018b event = statesProto$FriendRequestsState.getEvent();
                String str = "it.event";
                C12932j.m33815a((Object) event, str);
                C7280e op = event.getOp();
                if (op != null) {
                    int i = C2996w.f8386a[op.ordinal()];
                    String str2 = "it.event.entity";
                    if (i == 1 || i == 2) {
                        C7018b event2 = statesProto$FriendRequestsState.getEvent();
                        C12932j.m33815a((Object) event2, str);
                        ZenlyProto$FriendRequestWithUser entity = event2.getEntity();
                        C12932j.m33815a((Object) entity, str2);
                        p0Var = new C2965o0(C2959l0.m9479b(entity));
                    } else if (i == 3) {
                        C7018b event3 = statesProto$FriendRequestsState.getEvent();
                        C12932j.m33815a((Object) event3, str);
                        ZenlyProto$FriendRequestWithUser entity2 = event3.getEntity();
                        C12932j.m33815a((Object) entity2, str2);
                        p0Var = new C2961m0(C2959l0.m9479b(entity2));
                    }
                    return p0Var;
                }
                return C2963n0.f8351a;
            }
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.x$c */
    static final class C3001c<T> implements Predicate<C2973p0> {

        /* renamed from: e */
        public static final C3001c f8392e = new C3001c();

        C3001c() {
        }

        /* renamed from: a */
        public final boolean test(C2973p0 p0Var) {
            C12932j.m33818b(p0Var, "it");
            return !(p0Var instanceof C2963n0);
        }
    }

    private C2998x() {
    }

    /* renamed from: a */
    public static final C2998x m9509a() {
        return f8389b;
    }

    public C12279e<C2956k0> friendRequests() {
        C12279e<C2956k0> f = friendRequestsEvents().mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C2999a.f8390e);
        C12932j.m33815a((Object) f, "friendRequestsEvents()\n …          }\n            }");
        return f;
    }

    public C12279e<C2973p0> friendRequestsEvents() {
        C12279e<C2973p0> b = f8388a.friendRequestsStateStream().mo36501i(C3000b.f8391e).mo36459b((Predicate<? super T>) C3001c.f8392e);
        C12932j.m33815a((Object) b, "core.friendRequestsState…t !is FriendRequestNoop }");
        return b;
    }
}
