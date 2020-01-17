package app.zenly.locator.recommendation.section;

import android.view.View;
import app.zenly.locator.recommendation.C5266k;
import app.zenly.locator.recommendation.model.PotentialMatch;
import app.zenly.locator.recommendation.p140n.C5292a;
import app.zenly.locator.recommendation.p142p.C5300a;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7159m1;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.recommendation.section.a */
public final class C5303a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C12119a f13635k = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f13636f;

    /* renamed from: g */
    private final C12279e<String> f13637g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5266k f13638h;

    /* renamed from: i */
    private final C12279e<C7159m1> f13639i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C5292a f13640j;

    /* renamed from: app.zenly.locator.recommendation.section.a$a */
    public static final class C5304a {
        private C5304a() {
        }

        public /* synthetic */ C5304a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.recommendation.section.a$b */
    public static final class C5305b<T1, T2, R> implements BiFunction<T1, T2, R> {

        /* renamed from: a */
        final /* synthetic */ C5303a f13641a;

        public C5305b(C5303a aVar) {
            this.f13641a = aVar;
        }

        public final R apply(T1 t1, T2 t2) {
            List list = (List) t2;
            List list2 = (List) t1;
            C12932j.m33815a((Object) list2, "users");
            ArrayList<PotentialMatch> arrayList = new ArrayList<>();
            for (Object next : list2) {
                if (!C12932j.m33817a((Object) ((PotentialMatch) next).getId(), (Object) this.f13641a.f13636f)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C12850p.m33647a(arrayList, 10));
            for (PotentialMatch potentialMatch : arrayList) {
                C5300a aVar = new C5300a(C5303a.f13635k.mo35844a(potentialMatch.getId()), potentialMatch, this.f13641a.f13640j.mo12659a(potentialMatch.getId()), list.contains(potentialMatch.getId()));
                arrayList2.add(aVar);
            }
            return C11751f.m30863b(arrayList2);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.section.a$c */
    static final class C5306c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5303a f13642e;

        C5306c(C5303a aVar) {
            this.f13642e = aVar;
        }

        /* renamed from: a */
        public final C12279e<List<PotentialMatch>> apply(String str) {
            C12932j.m33818b(str, "it");
            return this.f13642e.f13638h.mo12624a(this.f13642e.f13640j.mo12657a(), str);
        }
    }

    /* renamed from: app.zenly.locator.recommendation.section.a$d */
    static final class C5307d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5307d f13643e = new C5307d();

        C5307d() {
        }

        /* renamed from: a */
        public final List<String> apply(C7159m1 m1Var) {
            C12932j.m33818b(m1Var, "it");
            List<UserProto$User> friendsList = m1Var.getFriendsList();
            C12932j.m33815a((Object) friendsList, "it.friendsList");
            ArrayList arrayList = new ArrayList(C12850p.m33647a(friendsList, 10));
            for (UserProto$User userProto$User : friendsList) {
                C12932j.m33815a((Object) userProto$User, "friend");
                arrayList.add(userProto$User.getUuid());
            }
            return arrayList;
        }
    }

    static {
        new C5304a(null);
    }

    public C5303a(String str, C12279e<String> eVar, C5266k kVar, C12279e<C7159m1> eVar2, C5292a aVar) {
        C12932j.m33818b(str, "newComerUuid");
        C12932j.m33818b(eVar, "queryObservable");
        C12932j.m33818b(kVar, "recommendationRepository");
        C12932j.m33818b(eVar2, "mutualFriendsStateObservable");
        C12932j.m33818b(aVar, "presenter");
        this.f13636f = str;
        this.f13637g = eVar;
        this.f13638h = kVar;
        this.f13639i = eVar2;
        this.f13640j = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e m = this.f13637g.mo36509m(new C5306c(this));
        C12932j.m33815a((Object) m, "queryObservable.switchMa…enter.newComerUuid, it) }");
        C12279e i = this.f13639i.mo36501i(C5307d.f13643e);
        C12932j.m33815a((Object) i, "mutualFriendsStateObserv…friend -> friend.uuid } }");
        C12279e<Seekable<C11722a>> a = C12279e.m32610a((ObservableSource<? extends T1>) m, (ObservableSource<? extends T2>) i, (BiFunction<? super T1, ? super T2, ? extends R>) new C5305b<Object,Object,Object>(this)).mo36428a(C12295a.m32802a());
        C12932j.m33815a((Object) a, "Observables.combineLates…dSchedulers.mainThread())");
        return a;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
