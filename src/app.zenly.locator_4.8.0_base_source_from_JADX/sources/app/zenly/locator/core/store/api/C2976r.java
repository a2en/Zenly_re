package app.zenly.locator.core.store.api;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7280e;
import p213co.znly.models.C7351j;
import p213co.znly.models.core.StatesProto$ContactsSoonState;
import p213co.znly.models.core.StatesProto$ContactsSoonState.C7008b;
import p213co.znly.models.core.StatesProto$ContactsSoonState.C7010c;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableTransformer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.store.api.r */
public final class C2976r implements ContactSoonOnZenlyDataSource {

    /* renamed from: a */
    private static final ZenlyCore f8364a = C5448c.m15478a();

    /* renamed from: b */
    public static final C2976r f8365b = new C2976r();

    /* renamed from: app.zenly.locator.core.store.api.r$a */
    static final class C2977a<T> implements Predicate<StatesProto$ContactsSoonState> {

        /* renamed from: e */
        public static final C2977a f8366e = new C2977a();

        C2977a() {
        }

        /* renamed from: a */
        public final boolean test(StatesProto$ContactsSoonState statesProto$ContactsSoonState) {
            C12932j.m33818b(statesProto$ContactsSoonState, "it");
            return statesProto$ContactsSoonState.hasState();
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.r$b */
    static final class C2978b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2978b f8367e = new C2978b();

        C2978b() {
        }

        /* renamed from: a */
        public final List<C2949h> apply(StatesProto$ContactsSoonState statesProto$ContactsSoonState) {
            C12932j.m33818b(statesProto$ContactsSoonState, "it");
            C7010c state = statesProto$ContactsSoonState.getState();
            C12932j.m33815a((Object) state, "it.state");
            List<C7351j> stateList = state.getStateList();
            C12932j.m33815a((Object) stateList, "it.state.stateList");
            ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
            for (C7351j jVar : stateList) {
                C12932j.m33815a((Object) jVar, "aoz");
                arrayList.add(C2953j.m9467b(jVar));
            }
            return arrayList;
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.r$c */
    static final class C2979c<T, R> implements Function<Throwable, List<? extends C2949h>> {

        /* renamed from: e */
        public static final C2979c f8368e = new C2979c();

        C2979c() {
        }

        /* renamed from: a */
        public final List<C2949h> apply(Throwable th) {
            C12932j.m33818b(th, "it");
            return C12848o.m33640a();
        }
    }

    /* renamed from: app.zenly.locator.core.store.api.r$d */
    static final class C2980d<Upstream, Downstream> implements ObservableTransformer<StatesProto$ContactsSoonState, C2951i> {

        /* renamed from: a */
        public static final C2980d f8369a = new C2980d();

        /* renamed from: app.zenly.locator.core.store.api.r$d$a */
        static final class C2981a<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C2981a f8370e = new C2981a();

            C2981a() {
            }

            /* renamed from: a */
            public final C2951i apply(StatesProto$ContactsSoonState statesProto$ContactsSoonState) {
                C2951i iVar;
                C12932j.m33818b(statesProto$ContactsSoonState, "it");
                if (statesProto$ContactsSoonState.hasState()) {
                    C7010c state = statesProto$ContactsSoonState.getState();
                    C12932j.m33815a((Object) state, "it.state");
                    List<C7351j> stateList = state.getStateList();
                    C12932j.m33815a((Object) stateList, "it.state.stateList");
                    ArrayList arrayList = new ArrayList(C12850p.m33647a(stateList, 10));
                    for (C7351j jVar : stateList) {
                        C12932j.m33815a((Object) jVar, "aoz");
                        arrayList.add(C2953j.m9467b(jVar));
                    }
                    return new C2962n(arrayList);
                } else if (!statesProto$ContactsSoonState.hasEvent()) {
                    return C2958l.f8347a;
                } else {
                    C7008b event = statesProto$ContactsSoonState.getEvent();
                    String str = "it.event";
                    C12932j.m33815a((Object) event, str);
                    C7280e op = event.getOp();
                    if (op != null) {
                        int i = C2974q.f8362a[op.ordinal()];
                        String str2 = "it.event.entity";
                        if (i == 1 || i == 2) {
                            C7008b event2 = statesProto$ContactsSoonState.getEvent();
                            C12932j.m33815a((Object) event2, str);
                            C7351j entity = event2.getEntity();
                            C12932j.m33815a((Object) entity, str2);
                            iVar = new C2960m(C2953j.m9467b(entity));
                        } else if (i == 3) {
                            C7008b event3 = statesProto$ContactsSoonState.getEvent();
                            C12932j.m33815a((Object) event3, str);
                            C7351j entity2 = event3.getEntity();
                            C12932j.m33815a((Object) entity2, str2);
                            iVar = new C2955k(C2953j.m9467b(entity2));
                        }
                        return iVar;
                    }
                    return C2958l.f8347a;
                }
            }
        }

        /* renamed from: app.zenly.locator.core.store.api.r$d$b */
        static final class C2982b<T> implements Predicate<C2951i> {

            /* renamed from: e */
            public static final C2982b f8371e = new C2982b();

            C2982b() {
            }

            /* renamed from: a */
            public final boolean test(C2951i iVar) {
                C12932j.m33818b(iVar, "it");
                return !(iVar instanceof C2958l);
            }
        }

        C2980d() {
        }

        public final C12279e<C2951i> apply(C12279e<StatesProto$ContactsSoonState> eVar) {
            C12932j.m33818b(eVar, "observable");
            return eVar.mo36501i(C2981a.f8370e).mo36459b((Predicate<? super T>) C2982b.f8371e);
        }
    }

    private C2976r() {
    }

    /* renamed from: a */
    public static final C2976r m9492a() {
        return f8365b;
    }

    /* renamed from: b */
    private final ObservableTransformer<StatesProto$ContactsSoonState, C2951i> m9493b() {
        return C2980d.f8369a;
    }

    public C12279e<C2951i> contactsSoonOnZenlyEvents() {
        C12279e<C2951i> a = f8364a.contactsSoonOnZenlyStateStream().mo36427a(m9493b());
        C12932j.m33815a((Object) a, "core.contactsSoonOnZenly…     .compose(toAction())");
        return a;
    }

    public C12291g<List<C2949h>> onboardingContactsSoonOnZenly() {
        C12291g<List<C2949h>> e = f8364a.onboardingContactsSoon().mo36459b((Predicate<? super T>) C2977a.f8366e).mo36501i(C2978b.f8367e).mo36495f().mo36554e(C2979c.f8368e);
        C12932j.m33815a((Object) e, "core.onboardingContactsS…rorReturn { emptyList() }");
        return e;
    }
}
