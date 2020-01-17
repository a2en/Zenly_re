package app.zenly.locator.core.store;

import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.core.store.api.C2995v0;
import app.zenly.locator.core.store.api.C3002x0;
import app.zenly.locator.core.store.api.C3004y0;
import app.zenly.locator.core.store.api.C3008z0;
import app.zenly.locator.core.store.api.FriendshipDataSource;
import app.zenly.locator.core.store.api.FriendshipStore;
import java.util.Collection;
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

/* renamed from: app.zenly.locator.core.store.k */
public final class C3045k implements FriendshipStore {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12785a<Map<String, C2991u0>> f8442a;

    /* renamed from: b */
    private final FriendshipDataSource f8443b;

    /* renamed from: app.zenly.locator.core.store.k$a */
    static final class C3046a<T, R> implements Function<T, Iterable<? extends U>> {

        /* renamed from: e */
        public static final C3046a f8444e = new C3046a();

        C3046a() {
        }

        /* renamed from: a */
        public final Collection<C2991u0> apply(Map<String, C2991u0> map) {
            C12932j.m33818b(map, "it");
            return map.values();
        }
    }

    /* renamed from: app.zenly.locator.core.store.k$b */
    static final class C3047b<T> implements Predicate<C2991u0> {

        /* renamed from: e */
        final /* synthetic */ String f8445e;

        C3047b(String str) {
            this.f8445e = str;
        }

        /* renamed from: a */
        public final boolean test(C2991u0 u0Var) {
            C12932j.m33818b(u0Var, "it");
            return C12932j.m33817a((Object) u0Var.mo9175a().getUuid(), (Object) this.f8445e);
        }
    }

    /* renamed from: app.zenly.locator.core.store.k$c */
    static final /* synthetic */ class C3048c extends C12931i implements Function2<Map<String, ? extends C2991u0>, C3004y0, Map<String, ? extends C2991u0>> {
        C3048c(C3045k kVar) {
            super(2, kVar);
        }

        /* renamed from: a */
        public final Map<String, C2991u0> invoke(Map<String, C2991u0> map, C3004y0 y0Var) {
            C12932j.m33818b(map, "p1");
            C12932j.m33818b(y0Var, "p2");
            return ((C3045k) this.f33505f).m9570a(map, y0Var);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3045k.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "reduceState(Ljava/util/Map;Lapp/zenly/locator/core/store/api/FriendshipsAction;)Ljava/util/Map;";
        }

        public final String getName() {
            return "reduceState";
        }
    }

    /* renamed from: app.zenly.locator.core.store.k$d */
    static final class C3049d<T> implements Consumer<Map<String, ? extends C2991u0>> {

        /* renamed from: e */
        final /* synthetic */ C3045k f8446e;

        C3049d(C3045k kVar) {
            this.f8446e = kVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, C2991u0> map) {
            this.f8446e.f8442a.onNext(map);
        }
    }

    public C3045k(FriendshipDataSource friendshipDataSource) {
        C12932j.m33818b(friendshipDataSource, "dataSource");
        this.f8443b = friendshipDataSource;
        C12785a<Map<String, C2991u0>> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<Map<String, Friendship>>()");
        this.f8442a = u;
    }

    public C12279e<C2991u0> friendship(String str) {
        C12932j.m33818b(str, "uuid");
        C12279e<C2991u0> b = this.f8442a.mo36494f((Function<? super T, ? extends Iterable<? extends U>>) C3046a.f8444e).mo36459b((Predicate<? super T>) new C3047b<Object>(str));
        C12932j.m33815a((Object) b, "subject.flatMapIterable … { it.info.uuid == uuid }");
        return b;
    }

    public C2991u0 friendshipCache(String str) {
        C12932j.m33818b(str, "uuid");
        if (!this.f8442a.mo36964t()) {
            return (C2991u0) friendship(str).mo36445a();
        }
        Object s = this.f8442a.mo36963s();
        if (s != null) {
            return (C2991u0) ((Map) s).get(str);
        }
        C12932j.m33814a();
        throw null;
    }

    public C12279e<Map<String, C2991u0>> friendshipsMap() {
        return this.f8442a;
    }

    /* renamed from: a */
    public final Disposable mo9227a() {
        Disposable d = this.f8443b.friendshipEvents().mo36441a(C12835h0.m33545a(), (BiFunction<R, ? super T, R>) new C3050l<R,Object,R>(new C3048c(this))).mo36479d(1).mo36476d((Consumer<? super T>) new C3049d<Object>(this));
        C12932j.m33815a((Object) d, "dataSource.friendshipEve….onNext(it)\n            }");
        return d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, C2991u0> m9570a(Map<String, C2991u0> map, C3004y0 y0Var) {
        if (y0Var instanceof C3008z0) {
            List a = ((C3008z0) y0Var).mo9194a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(a, 10)), 16));
            for (Object next : a) {
                linkedHashMap.put(((C2991u0) next).mo9175a().getUuid(), next);
            }
            return linkedHashMap;
        } else if (y0Var instanceof C3002x0) {
            Map<String, C2991u0> c = C12835h0.m33555c(map);
            C3002x0 x0Var = (C3002x0) y0Var;
            String uuid = x0Var.mo9188a().mo9175a().getUuid();
            C12932j.m33815a((Object) uuid, "action.item.info.uuid");
            c.put(uuid, x0Var.mo9188a());
            return c;
        } else if (!(y0Var instanceof C2995v0)) {
            return map;
        } else {
            Map<String, C2991u0> c2 = C12835h0.m33555c(map);
            c2.remove(((C2995v0) y0Var).mo9181a().mo9175a().getUuid());
            return c2;
        }
    }
}
