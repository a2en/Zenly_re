package app.zenly.locator.dashboard.p076x;

import android.content.Context;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.store.SuggestedStore;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.util.C3205g;
import app.zenly.locator.dashboard.C3313j;
import app.zenly.locator.dashboard.C3318o;
import app.zenly.locator.dashboard.p075w.C3327b.C3328a;
import app.zenly.locator.dashboard.p075w.C3331e;
import app.zenly.locator.dashboard.p075w.C3333f;
import app.zenly.locator.dashboard.p075w.C3335g;
import app.zenly.locator.dashboard.p075w.C3337h;
import app.zenly.locator.dashboard.p076x.p077c.C3353a;
import app.zenly.locator.dashboard.p076x.p077c.C3356b;
import app.zenly.locator.dashboard.p076x.p078d.C3359a;
import app.zenly.locator.dashboard.p076x.p079e.C3364a;
import app.zenly.locator.dashboard.p076x.p079e.C3368b;
import app.zenly.locator.dashboard.p076x.p079e.C3373d;
import app.zenly.locator.dashboard.p076x.p079e.C3377e;
import app.zenly.locator.p143s.p148l.C5448c;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.factory.C11727c;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.dashboard.x.b */
public final class C3352b {

    /* renamed from: a */
    private final C12785a<Boolean> f9299a;

    /* renamed from: b */
    private final C12767a<C3335g> f9300b;

    /* renamed from: c */
    private final C3313j f9301c = new C3313j();

    /* renamed from: d */
    private final Context f9302d;

    /* renamed from: e */
    private final ZenlySchedulers f9303e;

    /* renamed from: f */
    private final C12279e<C3318o> f9304f;

    /* renamed from: g */
    private final C12279e<C3328a> f9305g;

    /* renamed from: h */
    private final List<C2545e0> f9306h;

    /* renamed from: i */
    private final C3331e f9307i;

    /* renamed from: j */
    private final C3333f f9308j;

    /* renamed from: k */
    private final FriendStore f9309k;

    /* renamed from: l */
    private final C11700c f9310l;

    /* renamed from: m */
    private final C11727c f9311m;

    public C3352b(Context context, ZenlySchedulers zenlySchedulers, C3337h hVar, C12279e<C3318o> eVar, C12279e<C3328a> eVar2, List<? extends C2545e0> list, C3331e eVar3, C3333f fVar, FriendStore friendStore, C11700c cVar, C11727c cVar2) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(zenlySchedulers, "schedulers");
        C12932j.m33818b(hVar, "domainObserver");
        C12932j.m33818b(eVar, "queryStateObservable");
        C12932j.m33818b(eVar2, "broadcastInviteSectionObservable");
        C12932j.m33818b(list, "availableSharingOptions");
        C12932j.m33818b(eVar3, "recentSearchRepository");
        C12932j.m33818b(fVar, "recentlyViewedRepository");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(cVar, "bus");
        C12932j.m33818b(cVar2, "viewFactory");
        this.f9302d = context;
        this.f9303e = zenlySchedulers;
        this.f9304f = eVar;
        this.f9305g = eVar2;
        this.f9306h = list;
        this.f9307i = eVar3;
        this.f9308j = fVar;
        this.f9309k = friendStore;
        this.f9310l = cVar;
        this.f9311m = cVar2;
        C12785a<Boolean> h = C12785a.m33446h(Boolean.valueOf(false));
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(false)");
        this.f9299a = h;
        this.f9300b = hVar.mo9856a().mo36475c(1);
    }

    /* renamed from: a */
    public final List<ObservableSectionController> mo9867a() {
        Context context = this.f9302d;
        C3313j jVar = this.f9301c;
        C12767a<C3335g> aVar = this.f9300b;
        String str = "domainObservable";
        C12932j.m33815a((Object) aVar, str);
        C12279e<C3318o> eVar = this.f9304f;
        C12279e a = this.f9299a.mo36428a((C12286f) this.f9303e.getUserInteractive());
        String str2 = "editModeObservable.obser…hedulers.userInteractive)";
        C12932j.m33815a((Object) a, str2);
        C3356b bVar = new C3356b(context, jVar, aVar, eVar, a, this.f9308j, this.f9310l, this.f9311m);
        C3313j jVar2 = this.f9301c;
        C12767a<C3335g> aVar2 = this.f9300b;
        C12932j.m33815a((Object) aVar2, str);
        C12279e<C3318o> eVar2 = this.f9304f;
        C12279e a2 = this.f9299a.mo36428a((C12286f) this.f9303e.getUserInteractive());
        C12932j.m33815a((Object) a2, str2);
        C3353a aVar3 = new C3353a(jVar2, aVar2, eVar2, a2, this.f9307i);
        C3313j jVar3 = this.f9301c;
        C12767a<C3335g> aVar4 = this.f9300b;
        C12932j.m33815a((Object) aVar4, str);
        C3359a aVar5 = new C3359a(jVar3, aVar4, this.f9304f, C5448c.m15478a(), C3205g.m10194c(C7713f.m18776a(this.f9302d)), C3205g.m10190a(C7713f.m18776a(this.f9302d)));
        C3313j jVar4 = this.f9301c;
        C12767a<C3335g> aVar6 = this.f9300b;
        C12932j.m33815a((Object) aVar6, str);
        return C12848o.m33643b((Object[]) new ObservableSectionController[]{bVar, aVar3, aVar5, new C3364a(this.f9301c, this.f9304f, this.f9309k), new C3368b(this.f9304f, this.f9305g, this.f9306h), new C3373d(this.f9301c, this.f9304f, this.f9309k, C3205g.m10194c(C7713f.m18776a(this.f9302d))), new C3377e(jVar4, aVar6, this.f9304f, SuggestedStore.f8303i)});
    }

    /* renamed from: b */
    public final Disposable mo9869b() {
        Disposable r = this.f9300b.mo36946r();
        C12932j.m33815a((Object) r, "domainObservable.connect()");
        return r;
    }

    /* renamed from: a */
    public final void mo9868a(boolean z) {
        this.f9299a.onNext(Boolean.valueOf(z));
    }
}
