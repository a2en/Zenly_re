package app.zenly.locator.core.store.api;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C6980c3;
import p213co.znly.models.C7280e;
import p213co.znly.models.core.StatesProto$FriendshipsState;
import p213co.znly.models.core.StatesProto$FriendshipsState.C7028b;
import p213co.znly.models.core.StatesProto$FriendshipsState.C7030c;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.store.api.z */
public final class C3005z implements FriendshipDataSource {

    /* renamed from: a */
    private static final ZenlyCore f8395a = C5448c.m15478a();

    /* renamed from: b */
    public static final C3005z f8396b = new C3005z();

    /* renamed from: app.zenly.locator.core.store.api.z$a */
    static final class C3006a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3006a f8397e = new C3006a();

        C3006a() {
        }

        /* renamed from: a */
        public final C3004y0 apply(StatesProto$FriendshipsState statesProto$FriendshipsState) {
            C3004y0 y0Var;
            C12932j.m33818b(statesProto$FriendshipsState, "it");
            if (statesProto$FriendshipsState.hasState()) {
                C7030c state = statesProto$FriendshipsState.getState();
                C12932j.m33815a((Object) state, "it.state");
                List<C6980c3> stateList = state.getStateList();
                C12932j.m33815a((Object) stateList, "it.state.stateList");
                ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
                for (C6980c3 c3Var : stateList) {
                    C12932j.m33815a((Object) c3Var, "item");
                    arrayList.add(new C2991u0(c3Var));
                }
                return new C3008z0(arrayList);
            } else if (!statesProto$FriendshipsState.hasEvent()) {
                return C2997w0.f8387a;
            } else {
                C7028b event = statesProto$FriendshipsState.getEvent();
                String str = "it.event";
                C12932j.m33815a((Object) event, str);
                C7280e op = event.getOp();
                if (op != null) {
                    int i = C3003y.f8394a[op.ordinal()];
                    String str2 = "it.event.entity";
                    if (i == 1 || i == 2) {
                        C7028b event2 = statesProto$FriendshipsState.getEvent();
                        C12932j.m33815a((Object) event2, str);
                        C6980c3 entity = event2.getEntity();
                        C12932j.m33815a((Object) entity, str2);
                        y0Var = new C3002x0(new C2991u0(entity));
                    } else if (i == 3) {
                        C7028b event3 = statesProto$FriendshipsState.getEvent();
                        C12932j.m33815a((Object) event3, str);
                        C6980c3 entity2 = event3.getEntity();
                        C12932j.m33815a((Object) entity2, str2);
                        y0Var = new C2995v0(new C2991u0(entity2));
                    }
                    return y0Var;
                }
                return C2997w0.f8387a;
            }
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.z$b */
    static final class C3007b<T> implements Predicate<C3004y0> {

        /* renamed from: e */
        public static final C3007b f8398e = new C3007b();

        C3007b() {
        }

        /* renamed from: a */
        public final boolean test(C3004y0 y0Var) {
            C12932j.m33818b(y0Var, "it");
            return !(y0Var instanceof C2997w0);
        }
    }

    private C3005z() {
    }

    public C12279e<C3004y0> friendshipEvents() {
        C12279e<C3004y0> b = f8395a.friendshipsStateStream().mo36501i(C3006a.f8397e).mo36459b((Predicate<? super T>) C3007b.f8398e);
        C12932j.m33815a((Object) b, "core.friendshipsStateStr…endshipNoop\n            }");
        return b;
    }
}
