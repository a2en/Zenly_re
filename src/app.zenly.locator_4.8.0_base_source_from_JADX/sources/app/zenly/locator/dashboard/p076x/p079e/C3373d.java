package app.zenly.locator.dashboard.p076x.p079e;

import android.view.View;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.util.C3201f;
import app.zenly.locator.dashboard.C3313j;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.dashboard.p081z.C3435m;
import app.zenly.locator.dashboard.p081z.C3437o;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.dashboard.x.e.d */
public final class C3373d extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3313j f9348f;

    /* renamed from: g */
    private final C12279e<C3318o> f9349g;

    /* renamed from: h */
    private final FriendStore f9350h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3201f<C2936a0> f9351i;

    /* renamed from: app.zenly.locator.dashboard.x.e.d$a */
    static final class C3374a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C3373d f9352e;

        C3374a(C3373d dVar) {
            this.f9352e = dVar;
        }

        /* renamed from: a */
        public final List<C3437o> apply(List<C2936a0> list) {
            C12932j.m33818b(list, "friends");
            List<C2936a0> a = C12857w.m33665a((Iterable) C12857w.m33669b((Iterable) list, 8), (Comparator) this.f9352e.f9351i);
            ArrayList arrayList = new ArrayList(C12850p.m33647a(a, 10));
            for (C2936a0 a0Var : a) {
                C3313j a2 = this.f9352e.f9348f;
                C3373d dVar = this.f9352e;
                String uuid = a0Var.mo9074a().getUuid();
                C12932j.m33815a((Object) uuid, "it.user.uuid");
                long a3 = a2.mo9815a(dVar, uuid);
                C3435m mVar = C3435m.DEFAULT;
                UserProto$User a4 = a0Var.mo9074a();
                String name = a0Var.mo9074a().getName();
                C12932j.m33815a((Object) name, "it.user.name");
                C3437o oVar = new C3437o(a3, mVar, a4, name, true, false, false, 64, null);
                arrayList.add(oVar);
            }
            return arrayList;
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.d$b */
    public static final class C3375b<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            List list = (List) t2;
            Boolean bool = (Boolean) t1;
            C12932j.m33815a((Object) bool, "isQueryEmpty");
            if (bool.booleanValue()) {
                return C11751f.m30863b(list);
            }
            return C11751f.m30859a();
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.d$c */
    static final class C3376c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3376c f9353e = new C3376c();

        C3376c() {
        }

        /* renamed from: a */
        public final boolean mo9877a(C3318o oVar) {
            C12932j.m33818b(oVar, "it");
            return oVar.mo9818b();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo9877a((C3318o) obj));
        }
    }

    public C3373d(C3313j jVar, C12279e<C3318o> eVar, FriendStore friendStore, C3201f<C2936a0> fVar) {
        C12932j.m33818b(jVar, "dataIdMapper");
        C12932j.m33818b(eVar, "queryStateObservable");
        C12932j.m33818b(friendStore, "friendsStore");
        C12932j.m33818b(fVar, "friendComparator");
        this.f9348f = jVar;
        this.f9349g = eVar;
        this.f9350h = friendStore;
        this.f9351i = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e i = this.f9349g.mo36501i(C3376c.f9353e);
        C12279e b = m10570b();
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) i, "isQueryEmptyObservable");
        C12279e<Seekable<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) i, (ObservableSource<? extends T2>) b, (BiFunction<? super T1, ? super T2, ? extends R>) new C3375b<Object,Object,Object>());
        C12932j.m33815a((Object) a, "Observables.combineLates…)\n            }\n        }");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }

    /* renamed from: b */
    private final C12279e<List<C11722a>> m10570b() {
        C12279e<List<C11722a>> i = this.f9350h.bestFriends().mo36501i(new C3374a(this));
        C12932j.m33815a((Object) i, "friendsStore.bestFriends…          }\n            }");
        return i;
    }
}
