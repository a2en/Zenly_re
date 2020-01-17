package app.zenly.locator.core.store;

import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.store.api.C2961m0;
import app.zenly.locator.core.store.api.C2965o0;
import app.zenly.locator.core.store.api.C2973p0;
import app.zenly.locator.core.store.api.C2975q0;
import app.zenly.locator.core.store.api.FriendRequestDataSource;
import app.zenly.locator.core.store.api.FriendRequestStore;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.core.store.g */
public final class C3027g implements FriendRequestStore {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C12785a<Map<String, C2956k0>> f8423a;

    /* renamed from: b */
    private final FriendRequestDataSource f8424b;

    /* renamed from: app.zenly.locator.core.store.g$a */
    static final class C3028a<T> implements Predicate<Map<String, ? extends C2956k0>> {

        /* renamed from: e */
        final /* synthetic */ String f8425e;

        C3028a(String str) {
            this.f8425e = str;
        }

        /* renamed from: a */
        public final boolean test(Map<String, C2956k0> map) {
            C12932j.m33818b(map, "it");
            return map.containsKey(this.f8425e);
        }
    }

    /* renamed from: app.zenly.locator.core.store.g$b */
    static final class C3029b<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ String f8426e;

        C3029b(String str) {
            this.f8426e = str;
        }

        /* renamed from: a */
        public final C2956k0 apply(Map<String, C2956k0> map) {
            C12932j.m33818b(map, "it");
            return (C2956k0) map.get(this.f8426e);
        }
    }

    /* renamed from: app.zenly.locator.core.store.g$c */
    static final class C3030c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3030c f8427e = new C3030c();

        C3030c() {
        }

        /* renamed from: a */
        public final List<C2956k0> apply(Map<String, C2956k0> map) {
            C12932j.m33818b(map, "it");
            return C12857w.m33689j(map.values());
        }
    }

    /* renamed from: app.zenly.locator.core.store.g$d */
    static final /* synthetic */ class C3031d extends C12931i implements Function2<Map<String, ? extends C2956k0>, C2973p0, Map<String, ? extends C2956k0>> {
        C3031d(C3027g gVar) {
            super(2, gVar);
        }

        /* renamed from: a */
        public final Map<String, C2956k0> invoke(Map<String, C2956k0> map, C2973p0 p0Var) {
            C12932j.m33818b(map, "p1");
            C12932j.m33818b(p0Var, "p2");
            return ((C3027g) this.f33505f).m9544a(map, p0Var);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3027g.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "reduceState(Ljava/util/Map;Lapp/zenly/locator/core/store/api/FriendRequestsAction;)Ljava/util/Map;";
        }

        public final String getName() {
            return "reduceState";
        }
    }

    /* renamed from: app.zenly.locator.core.store.g$e */
    static final class C3032e<T> implements Consumer<Map<String, ? extends C2956k0>> {

        /* renamed from: e */
        final /* synthetic */ C3027g f8428e;

        C3032e(C3027g gVar) {
            this.f8428e = gVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, C2956k0> map) {
            this.f8428e.f8423a.onNext(map);
        }
    }

    public C3027g(FriendRequestDataSource friendRequestDataSource) {
        C12932j.m33818b(friendRequestDataSource, "friendRequestDataSource");
        this.f8424b = friendRequestDataSource;
        C12785a<Map<String, C2956k0>> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<M…String, FriendRequest>>()");
        this.f8423a = u;
    }

    public C12279e<C2956k0> friendRequest(String str) {
        C12932j.m33818b(str, "uuid");
        C12279e<C2956k0> i = this.f8423a.mo36459b((Predicate<? super T>) new C3028a<Object>(str)).mo36501i(new C3029b(str));
        C12932j.m33815a((Object) i, "subject.filter { it.cont…(uuid) }.map { it[uuid] }");
        return i;
    }

    public C2956k0 friendRequestCache(String str) {
        C12932j.m33818b(str, "uuid");
        if (!this.f8423a.mo36964t()) {
            return (C2956k0) ((Map) this.f8423a.mo36445a()).get(str);
        }
        Object s = this.f8423a.mo36963s();
        if (s != null) {
            return (C2956k0) ((Map) s).get(str);
        }
        C12932j.m33814a();
        throw null;
    }

    public C12279e<List<C2956k0>> friendRequests() {
        C12279e<List<C2956k0>> i = this.f8423a.mo36501i(C3030c.f8427e);
        C12932j.m33815a((Object) i, "subject.map { it.values.toList() }");
        return i;
    }

    public C12279e<Map<String, C2956k0>> friendRequestsMap() {
        return this.f8423a;
    }

    /* renamed from: a */
    public final Disposable mo9211a() {
        Disposable d = this.f8424b.friendRequestsEvents().mo36441a(C12835h0.m33545a(), (BiFunction<R, ? super T, R>) new C3033h<R,Object,R>(new C3031d(this))).mo36479d(1).mo36476d((Consumer<? super T>) new C3032e<Object>(this));
        C12932j.m33815a((Object) d, "friendRequestDataSource.….onNext(it)\n            }");
        return d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, C2956k0> m9544a(Map<String, C2956k0> map, C2973p0 p0Var) {
        if (p0Var instanceof C2975q0) {
            List a = ((C2975q0) p0Var).mo9156a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(a, 10)), 16));
            for (Object next : a) {
                linkedHashMap.put(((C2956k0) next).mo9124d(), next);
            }
            return linkedHashMap;
        } else if (p0Var instanceof C2965o0) {
            Map<String, C2956k0> c = C12835h0.m33555c(map);
            C2965o0 o0Var = (C2965o0) p0Var;
            c.put(o0Var.mo9147a().mo9124d(), o0Var.mo9147a());
            return c;
        } else if (!(p0Var instanceof C2961m0)) {
            return map;
        } else {
            Map<String, C2956k0> c2 = C12835h0.m33555c(map);
            c2.remove(((C2961m0) p0Var).mo9139a().mo9124d());
            return c2;
        }
    }
}
