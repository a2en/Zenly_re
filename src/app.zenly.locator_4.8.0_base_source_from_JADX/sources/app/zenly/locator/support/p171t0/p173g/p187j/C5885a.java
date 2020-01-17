package app.zenly.locator.support.p171t0.p173g.p187j;

import android.view.View;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.support.C5724n0.C5738f;
import app.zenly.locator.support.p171t0.C5815b;
import app.zenly.locator.support.p171t0.p173g.p189l.C5889a;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p333g.p378f.p380b.p381a.C12119a;
import p389io.reactivex.C12279e;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.C12292a;

/* renamed from: app.zenly.locator.support.t0.g.j.a */
public final class C5885a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f14869f = new C12119a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C2918b f14870g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f14871h;

    /* renamed from: i */
    private final C5815b f14872i;

    /* renamed from: app.zenly.locator.support.t0.g.j.a$a */
    static final class C5886a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C5885a f14873e;

        C5886a(C5885a aVar) {
            this.f14873e = aVar;
        }

        /* renamed from: a */
        public final Seekable<C11722a> apply(List<? extends C5738f> list) {
            C12932j.m33818b(list, "it");
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (C5738f fVar : list) {
                C5889a aVar = new C5889a(this.f14873e.f14869f.mo35844a(fVar.toString()), this.f14873e.f14870g, this.f14873e.f14871h, fVar);
                arrayList.add(aVar);
            }
            return C11751f.m30863b(arrayList);
        }
    }

    public C5885a(C2918b bVar, String str, C5815b bVar2) {
        C12932j.m33818b(bVar, "placeTag");
        C12932j.m33818b(str, "placeAddress");
        C12932j.m33818b(bVar2, "repository");
        this.f14870g = bVar;
        this.f14871h = str;
        this.f14872i = bVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> i = this.f14872i.mo13494a(this.f14870g.mo9024a().getNumber()).mo36501i(new C5886a(this));
        C12932j.m33815a((Object) i, "repository.getPlaceIssue…          )\n            }");
        return i;
    }

    public void onViewBound(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "model");
    }

    public void onViewRecycled(View view, C11722a aVar) {
        C12932j.m33818b(view, "itemView");
        C12932j.m33818b(aVar, "viewModel");
    }
}
