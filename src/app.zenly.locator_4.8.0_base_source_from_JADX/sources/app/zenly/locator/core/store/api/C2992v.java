package app.zenly.locator.core.store.api;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7280e;
import p213co.znly.models.C7337h3;
import p213co.znly.models.core.StatesProto$TopFriendsState;
import p213co.znly.models.core.StatesProto$TopFriendsState.C7036b;
import p213co.znly.models.core.StatesProto$TopFriendsState.C7038c;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.store.api.v */
public final class C2992v implements FriendRankDataSource {

    /* renamed from: a */
    private static final ZenlyCore f8381a = C5448c.m15478a();

    /* renamed from: b */
    public static final C2992v f8382b = new C2992v();

    /* renamed from: app.zenly.locator.core.store.api.v$a */
    static final class C2993a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2993a f8383e = new C2993a();

        C2993a() {
        }

        /* renamed from: a */
        public final C2952i0 apply(StatesProto$TopFriendsState statesProto$TopFriendsState) {
            C2952i0 i0Var;
            C12932j.m33818b(statesProto$TopFriendsState, "it");
            if (statesProto$TopFriendsState.hasState()) {
                C7038c state = statesProto$TopFriendsState.getState();
                C12932j.m33815a((Object) state, "it.state");
                List<C7337h3> stateList = state.getStateList();
                C12932j.m33815a((Object) stateList, "it.state.stateList");
                ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
                for (C7337h3 h3Var : stateList) {
                    C12932j.m33815a((Object) h3Var, "info");
                    arrayList.add(C2942d0.m9456b(h3Var));
                }
                return new C2954j0(arrayList);
            } else if (!statesProto$TopFriendsState.hasEvent()) {
                return C2948g0.f8334a;
            } else {
                C7036b event = statesProto$TopFriendsState.getEvent();
                String str = "it.event";
                C12932j.m33815a((Object) event, str);
                C7280e op = event.getOp();
                if (op != null) {
                    int i = C2990u.f8379a[op.ordinal()];
                    String str2 = "it.event.entity";
                    if (i == 1 || i == 2) {
                        C7036b event2 = statesProto$TopFriendsState.getEvent();
                        C12932j.m33815a((Object) event2, str);
                        C7337h3 entity = event2.getEntity();
                        C12932j.m33815a((Object) entity, str2);
                        i0Var = new C2950h0(C2942d0.m9456b(entity));
                    } else if (i == 3) {
                        C7036b event3 = statesProto$TopFriendsState.getEvent();
                        C12932j.m33815a((Object) event3, str);
                        C7337h3 entity2 = event3.getEntity();
                        C12932j.m33815a((Object) entity2, str2);
                        i0Var = new C2944e0(C2942d0.m9456b(entity2));
                    }
                    return i0Var;
                }
                return C2948g0.f8334a;
            }
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.v$b */
    static final class C2994b<T> implements Predicate<C2952i0> {

        /* renamed from: e */
        public static final C2994b f8384e = new C2994b();

        C2994b() {
        }

        /* renamed from: a */
        public final boolean test(C2952i0 i0Var) {
            C12932j.m33818b(i0Var, "it");
            return !(i0Var instanceof C2948g0);
        }
    }

    private C2992v() {
    }

    /* renamed from: a */
    public static final C2992v m9505a() {
        return f8382b;
    }

    public C12279e<C2952i0> bestFriendEvents() {
        C12279e<C2952i0> b = f8381a.topFriendsStateStream().mo36501i(C2993a.f8383e).mo36459b((Predicate<? super T>) C2994b.f8384e);
        C12932j.m33815a((Object) b, "core.topFriendsStateStre…{ it !is FriendRankNoop }");
        return b;
    }
}
