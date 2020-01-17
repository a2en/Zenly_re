package app.zenly.locator.support.p171t0.p173g.p175i;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.support.C5667e0;
import app.zenly.locator.support.p171t0.C5815b;
import app.zenly.locator.support.p171t0.p173g.p175i.p176c.C5852a;
import app.zenly.locator.support.p171t0.p173g.p175i.p184f.C5879a;
import app.zenly.locator.support.p194u0.C5917a;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.support.t0.g.i.a */
public final class C5850a extends ZenlyController {

    /* renamed from: P */
    private final C12275b f14796P = new C12275b();

    /* renamed from: Q */
    private final C5815b f14797Q = new C5815b();

    /* renamed from: R */
    private C11705b f14798R;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_missing_place, viewGroup, false);
        C12932j.m33815a((Object) inflate, "view");
        ((ScreenBar) inflate.findViewById(C3891l.screen_bar)).setTitle((int) R.string.support_places_missing_title);
        ZenlySchedulers a = C1351e.m6372a(C5667e0.f14437b.mo19916a("missingPlace"));
        C11700c cVar = new C11700c();
        C11727c cVar2 = new C11727c(C12846n.m33635a(C5851b.class));
        EventDispatcher a2 = cVar.mo34447a();
        C12932j.m33815a((Object) a2, "bus.eventDispatcher");
        C11705b bVar = new C11705b(cVar2, a2, a.getComputation(), a.getMainThread(), C12846n.m33635a(new C5879a(this.f14797Q)), null, 32, null);
        this.f14798R = bVar;
        Context context = inflate.getContext();
        C12932j.m33815a((Object) context, "view.context");
        Disposable b = cVar.mo34449b(new C5852a(this, context));
        C12932j.m33815a((Object) b, "bus.subscribe(EventDispa…roxy(this, view.context))");
        C12773a.m33432a(b, this.f14796P);
        C11705b bVar2 = this.f14798R;
        String str = "adapter";
        if (bVar2 != null) {
            C12773a.m33432a(bVar2.mo34464b(), this.f14796P);
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C3891l.options);
            C12932j.m33815a((Object) recyclerView, "view.options");
            C11705b bVar3 = this.f14798R;
            if (bVar3 != null) {
                recyclerView.setAdapter(bVar3);
                ((RecyclerView) inflate.findViewById(C3891l.options)).mo5045a((C1074l) new C5917a(inflate.getResources().getDimensionPixelOffset(R.dimen.spacing_200)));
                return inflate;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f14796P.mo36401a();
        super.mo7066c(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
