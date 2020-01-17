package app.zenly.locator.dashboard.p076x.p077c;

import android.view.View;
import app.zenly.locator.R;
import app.zenly.locator.dashboard.C3313j;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.dashboard.p075w.C3331e;
import app.zenly.locator.dashboard.p075w.C3335g;
import app.zenly.locator.dashboard.p075w.C3342j;
import app.zenly.locator.dashboard.p075w.C3342j.C3343a;
import app.zenly.locator.dashboard.p075w.C3342j.C3344b;
import app.zenly.locator.dashboard.p081z.C3428g;
import app.zenly.locator.dashboard.p081z.C3430i;
import app.zenly.locator.dashboard.p081z.C3431j;
import app.zenly.locator.dashboard.p081z.C3431j.C3432a;
import app.zenly.locator.dashboard.p081z.C3435m;
import app.zenly.locator.dashboard.p081z.C3437o;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.C7712e;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function3;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.dashboard.x.c.a */
public final class C3353a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3313j f9312f;

    /* renamed from: g */
    private final C12279e<C3335g> f9313g;

    /* renamed from: h */
    private final C12279e<C3318o> f9314h;

    /* renamed from: i */
    private final C12279e<Boolean> f9315i;

    /* renamed from: j */
    private final C3331e f9316j;

    /* renamed from: app.zenly.locator.dashboard.x.c.a$a */
    public static final class C3354a<T1, T2, T3, R> implements Function3<T1, T2, T3, R> {

        /* renamed from: a */
        final /* synthetic */ C3353a f9317a;

        public C3354a(C3353a aVar) {
            this.f9317a = aVar;
        }

        public final R apply(T1 t1, T2 t2, T3 t3) {
            C3437o oVar;
            List<C3342j> list = (List) t3;
            C3335g gVar = (C3335g) t2;
            boolean booleanValue = ((Boolean) t1).booleanValue();
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (C3342j jVar : list) {
                if (jVar instanceof C3344b) {
                    C3313j a = this.f9317a.f9312f;
                    C3353a aVar = this.f9317a;
                    C3344b bVar = (C3344b) jVar;
                    String uuid = bVar.mo9861a().getUuid();
                    C12932j.m33815a((Object) uuid, "recent.user.uuid");
                    long a2 = a.mo9815a(aVar, uuid);
                    C3435m mVar = C3435m.RECENT_SEARCH_RESULT;
                    UserProto$User a3 = bVar.mo9861a();
                    String name = bVar.mo9861a().getName();
                    C12932j.m33815a((Object) name, "recent.user.name");
                    C3437o oVar2 = new C3437o(a2, mVar, a3, name, gVar.mo9851a(bVar.mo9861a()), gVar.mo9853b(bVar.mo9861a()), booleanValue);
                    oVar = oVar2;
                } else if (jVar instanceof C3343a) {
                    C3343a aVar2 = (C3343a) jVar;
                    UserProto$User d = gVar.mo9855d(aVar2.mo9860a());
                    if (d != null) {
                        C3313j a4 = this.f9317a.f9312f;
                        C3353a aVar3 = this.f9317a;
                        String uuid2 = d.getUuid();
                        C12932j.m33815a((Object) uuid2, "user.uuid");
                        long a5 = a4.mo9815a(aVar3, uuid2);
                        C3435m mVar2 = C3435m.RECENT_SEARCH_RESULT;
                        String full = aVar2.mo9860a().getFull();
                        C12932j.m33815a((Object) full, "recent.contact.full");
                        C3437o oVar3 = new C3437o(a5, mVar2, d, full, gVar.mo9851a(d), gVar.mo9853b(d), booleanValue);
                        oVar = oVar3;
                    } else {
                        C3313j a6 = this.f9317a.f9312f;
                        C3353a aVar4 = this.f9317a;
                        String deviceContactId = aVar2.mo9860a().getDeviceContactId();
                        C12932j.m33815a((Object) deviceContactId, "recent.contact.deviceContactId");
                        C3428g gVar2 = new C3428g(a6.mo9815a(aVar4, deviceContactId), C3435m.RECENT_SEARCH_RESULT, aVar2.mo9860a(), gVar.mo9852b(aVar2.mo9860a()), gVar.mo9849a(aVar2.mo9860a()), booleanValue);
                        oVar = gVar2;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(oVar);
            }
            return C7712e.f19340a.mo19920a(new C3431j(R.string.dashboard_search_searchedSection_title, arrayList.isEmpty() ^ true ? C3432a.Edit : C3432a.None, booleanValue), new C3430i(R.string.dashboard_search_searchedSection_empty), arrayList);
        }
    }

    /* renamed from: app.zenly.locator.dashboard.x.c.a$b */
    public static final class C3355b<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            return ((C3318o) t1).mo9819c() ? (Seekable) t2 : C11751f.m30859a();
        }
    }

    public C3353a(C3313j jVar, C12279e<C3335g> eVar, C12279e<C3318o> eVar2, C12279e<Boolean> eVar3, C3331e eVar4) {
        C12932j.m33818b(jVar, "dataIdMapper");
        C12932j.m33818b(eVar, "domainObservable");
        C12932j.m33818b(eVar2, "queryStateObservable");
        C12932j.m33818b(eVar3, "editModeObservable");
        C12932j.m33818b(eVar4, "recentSearchRepository");
        this.f9312f = jVar;
        this.f9313g = eVar;
        this.f9314h = eVar2;
        this.f9315i = eVar3;
        this.f9316j = eVar4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e a = C12279e.m32609a((ObservableSource<? extends T1>) this.f9315i, (ObservableSource<? extends T2>) this.f9313g, (ObservableSource<? extends T3>) this.f9316j.mo9837a(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) new C3354a<Object,Object,Object,Object>(this));
        C12774b bVar2 = C12774b.f33320a;
        C12279e<C3318o> eVar = this.f9314h;
        C12932j.m33815a((Object) a, "modelsObservable");
        C12279e<Seekable<C11722a>> a2 = C12279e.m32610a((ObservableSource<? extends T1>) eVar, (ObservableSource<? extends T2>) a, (BiFunction<? super T1, ? super T2, ? extends R>) new C3355b<Object,Object,Object>());
        C12932j.m33815a((Object) a2, "Observables.combineLates…)\n            }\n        }");
        return a2;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
