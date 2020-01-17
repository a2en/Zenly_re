package app.zenly.locator.support.p171t0.p173g.p175i.p184f;

import android.view.View;
import app.zenly.locator.support.p171t0.C5815b;
import app.zenly.locator.support.p171t0.p173g.p175i.p177d.C5854a;
import app.zenly.locator.support.p171t0.p173g.p175i.p186h.C5884a;
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

/* renamed from: app.zenly.locator.support.t0.g.i.f.a */
public final class C5879a extends C12292a implements ObservableSectionController {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C12119a f14860f = new C12119a();

    /* renamed from: g */
    private final C5815b f14861g;

    /* renamed from: app.zenly.locator.support.t0.g.i.f.a$a */
    static final class C5880a<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ C5879a f14862e;

        C5880a(C5879a aVar) {
            this.f14862e = aVar;
        }

        /* renamed from: a */
        public final Seekable<C11722a> apply(List<C5854a> list) {
            C12932j.m33818b(list, "it");
            ArrayList arrayList = new ArrayList(C12850p.m33647a(list, 10));
            for (C5854a aVar : list) {
                arrayList.add(new C5884a(this.f14862e.f14860f.mo35844a(aVar.toString()), aVar));
            }
            return C11751f.m30863b(arrayList);
        }
    }

    public C5879a(C5815b bVar) {
        C12932j.m33818b(bVar, "repository");
        this.f14861g = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> i = this.f14861g.mo13493a().mo36501i(new C5880a(this));
        C12932j.m33815a((Object) i, "repository.getMissingPla…          )\n            }");
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
