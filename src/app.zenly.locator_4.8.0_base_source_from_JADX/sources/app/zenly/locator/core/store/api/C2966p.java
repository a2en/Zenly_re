package app.zenly.locator.core.store.api;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7280e;
import p213co.znly.models.C7370k;
import p213co.znly.models.core.StatesProto$ContactsAlreadyState;
import p213co.znly.models.core.StatesProto$ContactsAlreadyState.C7003b;
import p213co.znly.models.core.StatesProto$ContactsAlreadyState.C7005c;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableTransformer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.store.api.p */
public final class C2966p implements ContactAlreadyOnZenlyDataSource {

    /* renamed from: a */
    private static final ZenlyCore f8354a = C5448c.m15478a();

    /* renamed from: b */
    public static final C2966p f8355b = new C2966p();

    /* renamed from: app.zenly.locator.core.store.api.p$a */
    static final class C2967a<T> implements Predicate<StatesProto$ContactsAlreadyState> {

        /* renamed from: e */
        public static final C2967a f8356e = new C2967a();

        C2967a() {
        }

        /* renamed from: a */
        public final boolean test(StatesProto$ContactsAlreadyState statesProto$ContactsAlreadyState) {
            C12932j.m33818b(statesProto$ContactsAlreadyState, "it");
            return statesProto$ContactsAlreadyState.hasState();
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.p$b */
    static final class C2968b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2968b f8357e = new C2968b();

        C2968b() {
        }

        /* renamed from: a */
        public final List<C2935a> apply(StatesProto$ContactsAlreadyState statesProto$ContactsAlreadyState) {
            C12932j.m33818b(statesProto$ContactsAlreadyState, "it");
            C7005c state = statesProto$ContactsAlreadyState.getState();
            C12932j.m33815a((Object) state, "it.state");
            List<C7370k> stateList = state.getStateList();
            C12932j.m33815a((Object) stateList, "it.state.stateList");
            ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
            for (C7370k kVar : stateList) {
                C12932j.m33815a((Object) kVar, "aoz");
                arrayList.add(C2939c.m9453a(kVar));
            }
            return arrayList;
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.p$c */
    static final class C2969c<T, R> implements Function<Throwable, List<? extends C2935a>> {

        /* renamed from: e */
        public static final C2969c f8358e = new C2969c();

        C2969c() {
        }

        /* renamed from: a */
        public final List<C2935a> apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return C12848o.m33640a();
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.p$d */
    static final class C2970d<Upstream, Downstream> implements ObservableTransformer<StatesProto$ContactsAlreadyState, C2937b> {

        /* renamed from: a */
        public static final C2970d f8359a = new C2970d();

        /* renamed from: app.zenly.locator.core.store.api.p$d$a */
        static final class C2971a<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C2971a f8360e = new C2971a();

            C2971a() {
            }

            /* renamed from: a */
            public final C2937b apply(StatesProto$ContactsAlreadyState statesProto$ContactsAlreadyState) {
                C2937b bVar;
                C12932j.m33818b(statesProto$ContactsAlreadyState, "it");
                if (statesProto$ContactsAlreadyState.hasState()) {
                    C7005c state = statesProto$ContactsAlreadyState.getState();
                    C12932j.m33815a((Object) state, "it.state");
                    List<C7370k> stateList = state.getStateList();
                    C12932j.m33815a((Object) stateList, "it.state.stateList");
                    ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
                    for (C7370k kVar : stateList) {
                        C12932j.m33815a((Object) kVar, "aoz");
                        arrayList.add(C2939c.m9453a(kVar));
                    }
                    return new C2947g(arrayList);
                } else if (!statesProto$ContactsAlreadyState.hasEvent()) {
                    return C2943e.f8326a;
                } else {
                    C7003b event = statesProto$ContactsAlreadyState.getEvent();
                    String str = "it.event";
                    C12932j.m33815a((Object) event, str);
                    C7280e op = event.getOp();
                    if (op != null) {
                        int i = C2964o.f8352a[op.ordinal()];
                        String str2 = "it.event.entity";
                        if (i == 1 || i == 2) {
                            C7003b event2 = statesProto$ContactsAlreadyState.getEvent();
                            C12932j.m33815a((Object) event2, str);
                            C7370k entity = event2.getEntity();
                            C12932j.m33815a((Object) entity, str2);
                            bVar = new C2945f(C2939c.m9453a(entity));
                        } else if (i == 3) {
                            C7003b event3 = statesProto$ContactsAlreadyState.getEvent();
                            C12932j.m33815a((Object) event3, str);
                            C7370k entity2 = event3.getEntity();
                            C12932j.m33815a((Object) entity2, str2);
                            bVar = new C2941d(C2939c.m9453a(entity2));
                        }
                        return bVar;
                    }
                    return C2943e.f8326a;
                }
            }
        }

        /* renamed from: app.zenly.locator.core.store.api.p$d$b */
        static final class C2972b<T> implements Predicate<C2937b> {

            /* renamed from: e */
            public static final C2972b f8361e = new C2972b();

            C2972b() {
            }

            /* renamed from: a */
            public final boolean test(C2937b bVar) {
                C12932j.m33818b(bVar, "it");
                return !(bVar instanceof C2943e);
            }
        }

        C2970d() {
        }

        public final C12279e<C2937b> apply(C12279e<StatesProto$ContactsAlreadyState> eVar) {
            C12932j.m33818b(eVar, "observable");
            return eVar.mo36501i(C2971a.f8360e).mo36459b((Predicate<? super T>) C2972b.f8361e);
        }
    }

    private C2966p() {
    }

    /* renamed from: a */
    public static final C2966p m9484a() {
        return f8355b;
    }

    /* renamed from: b */
    private final ObservableTransformer<StatesProto$ContactsAlreadyState, C2937b> m9485b() {
        return C2970d.f8359a;
    }

    public C12279e<C2937b> contactsAlreadyOnZenlyEvents() {
        C12279e<C2937b> a = f8354a.contactsAlreadyOnZenlyStateStream().mo36427a(m9485b());
        C12932j.m33815a((Object) a, "core.contactsAlreadyOnZe…     .compose(toAction())");
        return a;
    }

    public C12291g<List<C2935a>> onboardingContactsAlreadyOnZenly() {
        C12291g<List<C2935a>> e = f8354a.contactsAlreadyOnZenlyStateStream().mo36459b((Predicate<? super T>) C2967a.f8356e).mo36501i(C2968b.f8357e).mo36495f().mo36554e(C2969c.f8358e);
        C12932j.m33815a((Object) e, "core.contactsAlreadyOnZe…rorReturn { emptyList() }");
        return e;
    }
}
