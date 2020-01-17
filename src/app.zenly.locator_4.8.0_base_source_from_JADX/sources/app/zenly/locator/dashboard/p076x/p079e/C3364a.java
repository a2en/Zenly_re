package app.zenly.locator.dashboard.p076x.p079e;

import android.view.View;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.dashboard.C3313j;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.dashboard.p081z.C3421a;
import app.zenly.locator.dashboard.p081z.C3422b;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.dashboard.x.e.a */
public final class C3364a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3313j f9337f;

    /* renamed from: g */
    private final C12279e<C3318o> f9338g;

    /* renamed from: h */
    private final FriendStore f9339h;

    /* renamed from: app.zenly.locator.dashboard.x.e.a$a */
    static final class C3365a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C3364a f9340e;

        C3365a(C3364a aVar) {
            this.f9340e = aVar;
        }

        /* renamed from: a */
        public final C3422b apply(List<C2936a0> list) {
            C12932j.m33818b(list, "friends");
            int size = list.size();
            List<C2936a0> c = C12857w.m33675c((Iterable) list, 8);
            ArrayList arrayList = new ArrayList(C12850p.m33647a(c, 10));
            for (C2936a0 a0Var : c) {
                C3313j a = this.f9340e.f9337f;
                C3364a aVar = this.f9340e;
                String uuid = a0Var.mo9074a().getUuid();
                String str = "it.user.uuid";
                C12932j.m33815a((Object) uuid, str);
                long a2 = a.mo9815a(aVar, uuid);
                UserProto$User a3 = a0Var.mo9074a();
                String uuid2 = a0Var.mo9074a().getUuid();
                C12932j.m33815a((Object) uuid2, str);
                String name = a0Var.mo9074a().getName();
                C12932j.m33815a((Object) name, "it.user.name");
                C3421a aVar2 = new C3421a(a2, a3, uuid2, name);
                arrayList.add(aVar2);
            }
            return new C3422b(size, arrayList);
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.a$b */
    public static final class C3366b<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            C11722a aVar = (C11722a) t2;
            Boolean bool = (Boolean) t1;
            C12932j.m33815a((Object) bool, "isQueryEmpty");
            if (bool.booleanValue()) {
                return C11751f.m30861a(aVar);
            }
            return C11751f.m30859a();
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.e.a$c */
    static final class C3367c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C3367c f9341e = new C3367c();

        C3367c() {
        }

        /* renamed from: a */
        public final boolean mo9874a(C3318o oVar) {
            C12932j.m33818b(oVar, "it");
            return oVar.mo9818b();
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo9874a((C3318o) obj));
        }
    }

    public C3364a(C3313j jVar, C12279e<C3318o> eVar, FriendStore friendStore) {
        C12932j.m33818b(jVar, "dataIdMapper");
        C12932j.m33818b(eVar, "queryStateObservable");
        C12932j.m33818b(friendStore, "friendsStore");
        this.f9337f = jVar;
        this.f9338g = eVar;
        this.f9339h = friendStore;
    }

    /* renamed from: b */
    private final C12279e<C11722a> m10561b() {
        C12279e<C11722a> i = this.f9339h.bestFriends().mo36501i(new C3365a(this));
        C12932j.m33815a((Object) i, "friendsStore.bestFriends…          )\n            }");
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e i = this.f9338g.mo36501i(C3367c.f9341e);
        C12279e b = m10561b();
        C12774b bVar = C12774b.f33320a;
        C12932j.m33815a((Object) i, "isQueryEmptyObservable");
        C12279e<Seekable<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) i, (ObservableSource<? extends T2>) b, (BiFunction<? super T1, ? super T2, ? extends R>) new C3366b<Object,Object,Object>());
        C12932j.m33815a((Object) a, "Observables.combineLates…)\n            }\n        }");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
