package app.zenly.locator.core.store;

import app.zenly.locator.core.store.api.C2944e0;
import app.zenly.locator.core.store.api.C2946f0;
import app.zenly.locator.core.store.api.C2950h0;
import app.zenly.locator.core.store.api.C2952i0;
import app.zenly.locator.core.store.api.C2954j0;
import app.zenly.locator.core.store.api.FriendRankDataSource;
import app.zenly.locator.core.store.api.FriendRankStore;
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
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.core.store.e */
public final class C3023e implements FriendRankStore {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12785a<Map<String, C2946f0>> f8419a;

    /* renamed from: b */
    private final FriendRankDataSource f8420b;

    /* renamed from: app.zenly.locator.core.store.e$a */
    static final /* synthetic */ class C3024a extends C12931i implements Function2<Map<String, ? extends C2946f0>, C2952i0, Map<String, ? extends C2946f0>> {
        C3024a(C3023e eVar) {
            super(2, eVar);
        }

        /* renamed from: a */
        public final Map<String, C2946f0> invoke(Map<String, C2946f0> map, C2952i0 i0Var) {
            C12932j.m33818b(map, "p1");
            C12932j.m33818b(i0Var, "p2");
            return ((C3023e) this.f33505f).m9536a(map, i0Var);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C3023e.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "reduceState(Ljava/util/Map;Lapp/zenly/locator/core/store/api/FriendRanksAction;)Ljava/util/Map;";
        }

        public final String getName() {
            return "reduceState";
        }
    }

    /* renamed from: app.zenly.locator.core.store.e$b */
    static final class C3025b<T> implements Consumer<Map<String, ? extends C2946f0>> {

        /* renamed from: e */
        final /* synthetic */ C3023e f8421e;

        C3025b(C3023e eVar) {
            this.f8421e = eVar;
        }

        /* renamed from: a */
        public final void accept(Map<String, C2946f0> map) {
            this.f8421e.f8419a.onNext(map);
        }
    }

    public C3023e(FriendRankDataSource friendRankDataSource) {
        C12932j.m33818b(friendRankDataSource, "dataSource");
        this.f8420b = friendRankDataSource;
        C12785a<Map<String, C2946f0>> u = C12785a.m33447u();
        C12932j.m33815a((Object) u, "BehaviorSubject.create<M…tring, FriendRankInfo>>()");
        this.f8419a = u;
    }

    public C12279e<Map<String, C2946f0>> bestFriendMap() {
        return this.f8419a;
    }

    /* renamed from: a */
    public final Disposable mo9208a() {
        Disposable d = this.f8420b.bestFriendEvents().mo36441a(C12835h0.m33545a(), (BiFunction<R, ? super T, R>) new C3026f<R,Object,R>(new C3024a(this))).mo36479d(1).mo36476d((Consumer<? super T>) new C3025b<Object>(this));
        C12932j.m33815a((Object) d, "dataSource.bestFriendEve….onNext(it)\n            }");
        return d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Map<String, C2946f0> m9536a(Map<String, C2946f0> map, C2952i0 i0Var) {
        if (i0Var instanceof C2954j0) {
            List a = ((C2954j0) i0Var).mo9113a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12973l.m33885a(C12835h0.m33544a(C12850p.m33647a(a, 10)), 16));
            for (Object next : a) {
                linkedHashMap.put(((C2946f0) next).mo9096c(), next);
            }
            return linkedHashMap;
        } else if (i0Var instanceof C2950h0) {
            Map<String, C2946f0> c = C12835h0.m33555c(map);
            C2950h0 h0Var = (C2950h0) i0Var;
            c.put(h0Var.mo9109a().mo9096c(), h0Var.mo9109a());
            return c;
        } else if (!(i0Var instanceof C2944e0)) {
            return map;
        } else {
            Map<String, C2946f0> c2 = C12835h0.m33555c(map);
            c2.remove(((C2944e0) i0Var).mo9086a().mo9096c());
            return c2;
        }
    }
}
