package app.zenly.locator.core.store;

import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2938b0;
import app.zenly.locator.core.store.api.C2946f0;
import app.zenly.locator.core.store.api.C2983r0;
import app.zenly.locator.core.store.api.C2985s0;
import app.zenly.locator.core.store.api.C2989t0;
import app.zenly.locator.core.store.api.FriendDataSource;
import app.zenly.locator.core.store.api.FriendRankStore;
import app.zenly.locator.core.store.api.FriendStore;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12929g;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.core.store.i */
public final class C3034i implements FriendStore {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C12785a<Map<String, C2936a0>> f8430a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C12785a<List<C2936a0>> f8431b;

    /* renamed from: c */
    private final FriendRankStore f8432c;

    /* renamed from: d */
    private final FriendDataSource f8433d;

    /* renamed from: app.zenly.locator.core.store.i$a */
    static final class C3035a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3035a f8434e = new C3035a();

        C3035a() {
        }

        /* renamed from: a */
        public final List<C2936a0> apply(List<C2936a0> list) {
            C12932j.m33818b(list, "it");
            return C12857w.m33689j(list);
        }
    }

    /* renamed from: app.zenly.locator.core.store.i$b */
    static final class C3036b<T> implements Predicate<Map<String, ? extends C2936a0>> {

        /* renamed from: e */
        final /* synthetic */ String f8435e;

        C3036b(String str) {
            this.f8435e = str;
        }

        /* renamed from: a */
        public final boolean test(Map<String, C2936a0> map) {
            C12932j.m33818b(map, "it");
            return map.containsKey(this.f8435e);
        }
    }

    /* renamed from: app.zenly.locator.core.store.i$c */
    static final class C3037c<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ String f8436e;

        C3037c(String str) {
            this.f8436e = str;
        }

        /* renamed from: a */
        public final C2936a0 apply(Map<String, C2936a0> map) {
            C12932j.m33818b(map, "it");
            return (C2936a0) map.get(this.f8436e);
        }
    }

    /* renamed from: app.zenly.locator.core.store.i$d */
    static final class C3038d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3038d f8437e = new C3038d();

        C3038d() {
        }

        /* renamed from: a */
        public final List<C2936a0> apply(Map<String, C2936a0> map) {
            C12932j.m33818b(map, "it");
            return C12857w.m33689j(map.values());
        }
    }

    /* renamed from: app.zenly.locator.core.store.i$e */
    public static final class C3039e<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: app.zenly.locator.core.store.i$e$a */
        static final class C3040a<T> implements Comparator<C2936a0> {

            /* renamed from: e */
            final /* synthetic */ Map f8438e;

            C3040a(Map map) {
                this.f8438e = map;
            }

            /* renamed from: a */
            public final int compare(C2936a0 a0Var, C2936a0 a0Var2) {
                C2946f0 f0Var = (C2946f0) this.f8438e.get(a0Var.mo9074a().getUuid());
                double b = f0Var != null ? f0Var.mo9095b() : C12929g.f33511c.mo37274a();
                C2946f0 f0Var2 = (C2946f0) this.f8438e.get(a0Var2.mo9074a().getUuid());
                return Double.compare(f0Var2 != null ? f0Var2.mo9095b() : C12929g.f33511c.mo37274a(), b);
            }
        }

        public final R apply(T1 t1, T2 t2) {
            return C12857w.m33665a((Iterable) (List) t1, (Comparator) new C3040a((Map) t2));
        }
    }

    /* renamed from: app.zenly.locator.core.store.i$f */
    static final class C3041f<T> implements Consumer<List<? extends C2936a0>> {

        /* renamed from: e */
        final /* synthetic */ C3034i f8439e;

        C3041f(C3034i iVar) {
            this.f8439e = iVar;
        }

        /* renamed from: a */
        public final void accept(List<C2936a0> list) {
            this.f8439e.f8431b.onNext(list);
        }
    }

    /* renamed from: app.zenly.locator.core.store.i$g */
    static final /* synthetic */ class C3042g extends C12931i implements Function2<Map<String, ? extends C2936a0>, C2985s0, Map<String, ? extends C2936a0>> {
        C3042g(C3034i iVar) {
            super(2, iVar);
        }

        /* renamed from: a */
        public final Map<String, C2936a0> invoke(Map<String, C2936a0> map, C2985s0 s0Var) {
            C12932j.m33818b(map, "p1");
            C12932j.m33818b(s0Var, "p2");
            return ((C3034i) this.f33505f).m9555a(map, s0Var);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3034i.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "reduceState(Ljava/util/Map;Lapp/zenly/locator/core/store/api/FriendsAction;)Ljava/util/Map;";
        }

        public final String getName() {
            return "reduceState";
        }
    }

    /* renamed from: app.zenly.locator.core.store.i$h */
    static final class C3043h<T> implements Consumer<Map<String, ? extends C2936a0>> {

        /* renamed from: e */
        final /* synthetic */ C3034i f8440e;

        C3043h(C3034i iVar) {
            this.f8440e = iVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, C2936a0> map) {
            this.f8440e.f8430a.onNext(map);
        }
    }

    public C3034i(FriendRankStore friendRankStore, FriendDataSource friendDataSource) {
        C12932j.m33818b(friendRankStore, "friendRankStore");
        C12932j.m33818b(friendDataSource, "friendDataSource");
        this.f8432c = friendRankStore;
        this.f8433d = friendDataSource;
        C12785a<Map<String, C2936a0>> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<Map<String, Friend>>()");
        this.f8430a = u;
        C12785a<List<C2936a0>> u2 = C12785a.m33447u();
        C12932j.m33815a((Object) u2, "BehaviorSubject.create<List<Friend>>()");
        this.f8431b = u2;
    }

    public C12279e<List<C2936a0>> bestFriends() {
        C12279e<List<C2936a0>> i = this.f8431b.mo36501i(C3035a.f8434e);
        C12932j.m33815a((Object) i, "bestFriendSubject.map { it.toList() }");
        return i;
    }

    public C12279e<C2936a0> friend(String str) {
        C12932j.m33818b(str, "uuid");
        C12279e<C2936a0> i = this.f8430a.mo36459b((Predicate<? super T>) new C3036b<Object>(str)).mo36501i(new C3037c(str));
        C12932j.m33815a((Object) i, "subject.filter { it.cont…(uuid) }.map { it[uuid] }");
        return i;
    }

    public C2936a0 friendCache(String str) {
        C12932j.m33818b(str, "uuid");
        if (!this.f8430a.mo36964t()) {
            return (C2936a0) ((Map) this.f8430a.mo36445a()).get(str);
        }
        Object s = this.f8430a.mo36963s();
        if (s != null) {
            return (C2936a0) ((Map) s).get(str);
        }
        C12932j.m33814a();
        throw null;
    }

    public C12279e<List<C2936a0>> friends() {
        C12279e<List<C2936a0>> i = this.f8430a.mo36501i(C3038d.f8437e);
        C12932j.m33815a((Object) i, "subject.map { it.values.toList() }");
        return i;
    }

    public List<C2936a0> friendsCache() {
        if (this.f8430a.mo36964t()) {
            Object s = this.f8430a.mo36963s();
            if (s != null) {
                return C12857w.m33689j(((Map) s).values());
            }
            C12932j.m33814a();
            throw null;
        }
        Object a = friends().mo36445a();
        C12932j.m33815a(a, "friends().blockingFirst()");
        return (List) a;
    }

    public C12279e<Map<String, C2936a0>> friendsMap() {
        return this.f8430a;
    }

    /* renamed from: a */
    public final Disposable mo9217a() {
        C12275b bVar = new C12275b();
        C12774b bVar2 = C12774b.f33320a;
        Disposable d = C12279e.m32610a((ObservableSource<? extends T1>) friends(), (ObservableSource<? extends T2>) this.f8432c.bestFriendMap(), (BiFunction<? super T1, ? super T2, ? extends R>) new C3039e<Object,Object,Object>()).mo36476d((Consumer<? super T>) new C3041f<Object>(this));
        C12932j.m33815a((Object) d, "Observables\n            ….onNext(it)\n            }");
        C12773a.m33432a(d, bVar);
        Disposable d2 = this.f8433d.friendEvents().mo36441a(C12835h0.m33545a(), (BiFunction<R, ? super T, R>) new C3044j<R,Object,R>(new C3042g(this))).mo36479d(1).mo36476d((Consumer<? super T>) new C3043h<Object>(this));
        C12932j.m33815a((Object) d2, "friendDataSource.friendE….onNext(it)\n            }");
        C12773a.m33432a(d2, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, C2936a0> m9555a(Map<String, C2936a0> map, C2985s0 s0Var) {
        if (s0Var instanceof C2989t0) {
            List a = ((C2989t0) s0Var).mo9171a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(a, 10)), 16));
            for (Object next : a) {
                linkedHashMap.put(((C2936a0) next).mo9074a().getUuid(), next);
            }
            return linkedHashMap;
        } else if (s0Var instanceof C2983r0) {
            Map<String, C2936a0> c = C12835h0.m33555c(map);
            C2983r0 r0Var = (C2983r0) s0Var;
            String uuid = r0Var.mo9165a().mo9074a().getUuid();
            C12932j.m33815a((Object) uuid, "action.friend.user.uuid");
            c.put(uuid, r0Var.mo9165a());
            return c;
        } else if (!(s0Var instanceof C2938b0)) {
            return map;
        } else {
            Map<String, C2936a0> c2 = C12835h0.m33555c(map);
            c2.remove(((C2938b0) s0Var).mo9078a().mo9074a().getUuid());
            return c2;
        }
    }
}
