package p250f.p251a.p252a.p263b.p264a.p272j.p273g;

import android.view.View;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import com.snap.p327ui.seeking.C11751f;
import com.snap.p327ui.seeking.Seekable;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.p390h.C12292a;

/* renamed from: f.a.a.b.a.j.g.b */
public final class C7715b extends C12292a implements ObservableSectionController {

    /* renamed from: f */
    private final C7714a f19341f = new C7714a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6944a() {
    }

    public C12279e<Seekable<C11722a>> getViewModels() {
        C12279e<Seekable<C11722a>> e = C12279e.m32626e(C11751f.m30861a(this.f19341f));
        C12932j.m33815a((Object) e, "Observable.just(Seekable…rViewModel>(anchorModel))");
        return e;
    }

    public void onViewBound(View view, C11722a aVar) {
    }

    public void onViewRecycled(View view, C11722a aVar) {
    }
}
