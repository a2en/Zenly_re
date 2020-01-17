package app.zenly.locator.recommendation.section;

import android.view.View;
import app.zenly.locator.recommendation.C5266k;
import app.zenly.locator.recommendation.model.PotentialMatch;
import app.zenly.locator.recommendation.p142p.C5301b;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.List;
import kotlin.C12899i;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12774b;

public final class RecommendFriendsSection extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f13628f = new C12119a();

    /* renamed from: g */
    private final String f13629g;

    /* renamed from: h */
    private final C12279e<Integer> f13630h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Function1<PotentialMatch, C12956q> f13631i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Function0<C12956q> f13632j;

    /* renamed from: k */
    private final C5266k f13633k;

    public interface OnNewCardCallback {
        void onNewCardCallback(PotentialMatch potentialMatch);
    }

    /* renamed from: app.zenly.locator.recommendation.section.RecommendFriendsSection$a */
    static final class C5302a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ RecommendFriendsSection f13634e;

        C5302a(RecommendFriendsSection recommendFriendsSection) {
            this.f13634e = recommendFriendsSection;
        }

        /* renamed from: a */
        public final Seekable<C11722a> apply(C12899i<Integer, ? extends List<? extends PotentialMatch>> iVar) {
            C12932j.m33818b(iVar, "<name for destructuring parameter 0>");
            int intValue = ((Number) iVar.mo37202a()).intValue();
            List list = (List) iVar.mo37203b();
            if (intValue == 0 && list.isEmpty()) {
                this.f13634e.f13632j.invoke();
            }
            C12932j.m33815a((Object) list, "potentialMatches");
            List<PotentialMatch> d = C12857w.m33679d(list, list.size() - intValue);
            if (!d.isEmpty()) {
                this.f13634e.f13631i.invoke(d.get(0));
            }
            ArrayList arrayList = new ArrayList(C12850p.m33647a(d, 10));
            for (PotentialMatch potentialMatch : d) {
                arrayList.add(new C5301b(this.f13634e.f13628f.mo35844a(potentialMatch.getId()), potentialMatch));
            }
            return C11751f.m30863b(arrayList);
        }
    }

    public RecommendFriendsSection(String str, C12279e<Integer> eVar, Function1<? super PotentialMatch, C12956q> function1, Function0<C12956q> function0, C5266k kVar) {
        C12932j.m33818b(str, "newComerUuid");
        C12932j.m33818b(eVar, "onItemSwipedSubject");
        C12932j.m33818b(function1, "onNewCardCallback");
        C12932j.m33818b(function0, "onEmptyRecommendationCallback");
        C12932j.m33818b(kVar, "recommendationRepository");
        this.f13629g = str;
        this.f13630h = eVar;
        this.f13631i = function1;
        this.f13632j = function0;
        this.f13633k = kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12774b bVar = C12774b.f33320a;
        C12279e<Integer> eVar = this.f13630h;
        C12279e e = this.f13633k.mo12625a(this.f13629g).mo36553e();
        C12932j.m33815a((Object) e, "recommendationRepository…ComerUuid).toObservable()");
        C12279e<Seekable<C11722a>> i = bVar.mo36955a(eVar, e).mo36428a(C12295a.m32802a()).mo36501i(new C5302a(this));
        C12932j.m33815a((Object) i, "Observables.combineLates…          )\n            }");
        return i;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
