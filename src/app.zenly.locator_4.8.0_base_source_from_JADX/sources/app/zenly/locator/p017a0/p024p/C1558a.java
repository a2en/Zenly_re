package app.zenly.locator.p017a0.p024p;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.manager.C2800q5.C2801a;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p017a0.C1525l;
import app.zenly.locator.p017a0.p024p.p025d.C1565c;
import app.zenly.locator.p017a0.p024p.p026e.C1572g;
import app.zenly.locator.p017a0.p024p.p027f.C1585a;
import app.zenly.locator.p017a0.p024p.p027f.C1588b;
import app.zenly.locator.p017a0.p024p.p027f.C1593c;
import app.zenly.locator.p143s.p148l.C5448c;
import com.snap.p327ui.event.C11700c;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.ObservableSectionController;
import com.snap.p327ui.recycling.adapter.C11705b;
import com.snap.p327ui.recycling.factory.C11727c;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.romutils.ResolutionSolver;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p406n.C12791d;

/* renamed from: app.zenly.locator.a0.p.a */
public final class C1558a extends ZenlyController {

    /* renamed from: P */
    private final C12275b f5474P = new C12275b();

    /* renamed from: Q */
    private final C12275b f5475Q = new C12275b();

    /* renamed from: R */
    private C11705b f5476R;

    /* renamed from: S */
    private ScreenBarLayout f5477S;

    /* renamed from: T */
    private RecyclerView f5478T;

    /* renamed from: U */
    private final C12791d<Boolean> f5479U;

    /* renamed from: app.zenly.locator.a0.p.a$a */
    static final class C1559a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1559a f5480e = new C1559a();

        C1559a() {
        }

        /* renamed from: a */
        public final boolean mo7102a(C2801a aVar) {
            C12932j.m33818b(aVar, "it");
            return aVar == C2801a.UPLOAD;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo7102a((C2801a) obj));
        }
    }

    public C1558a() {
        C12791d<Boolean> f = C12791d.m33469f(1);
        C12932j.m33815a((Object) f, "ReplaySubject.create<Boolean>(1)");
        this.f5479U = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C12932j.m33818b(layoutInflater2, "inflater");
        C12932j.m33818b(viewGroup2, "container");
        View inflate = layoutInflater2.inflate(R.layout.controller_settings, viewGroup2, false);
        C12932j.m33815a((Object) inflate, "view");
        Context context = inflate.getContext();
        C12279e userMeStream = C5448c.m15478a().userMeStream();
        C12932j.m33815a((Object) userMeStream, "ZenlyCoreProvider.get().userMeStream()");
        C12932j.m33815a((Object) context, "context");
        C1565c cVar = new C1565c(context);
        ZenlySchedulers a = C1351e.m6372a(C1525l.f5415b.mo19916a("settings"));
        C12279e i = C2666b.m9049a(context).mo8765c().mo8845b().mo36501i(C1559a.f5480e);
        C2477e eVar = new C2477e(context);
        C12932j.m33815a((Object) i, "isOnAvatarUpdateObservable");
        C1593c cVar2 = new C1593c(context, userMeStream, eVar, i);
        C1588b bVar = new C1588b(context, userMeStream, cVar.mo7117a());
        C1585a aVar = new C1585a(context, this.f5479U);
        C11727c cVar3 = new C11727c(C12846n.m33635a(C1561c.class));
        C11700c cVar4 = new C11700c();
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        Disposable b = cVar4.mo34449b(new C1572g(A, this, cVar));
        C12932j.m33815a((Object) b, "bus.subscribe(EventDispa…, preferencesRepository))");
        C12773a.m33432a(b, this.f5475Q);
        EventDispatcher a2 = cVar4.mo34447a();
        C12932j.m33815a((Object) a2, "bus.eventDispatcher");
        C11705b bVar2 = new C11705b(cVar3, a2, a.getComputation(), a.getMainThread(), C12848o.m33643b((Object[]) new ObservableSectionController[]{cVar2, bVar, aVar}), null, 32, null);
        this.f5476R = bVar2;
        View findViewById = inflate.findViewById(R.id.screen_bar_layout);
        C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.screen_bar_layout)");
        this.f5477S = (ScreenBarLayout) findViewById;
        View findViewById2 = inflate.findViewById(R.id.settings_list);
        C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.settings_list)");
        this.f5478T = (RecyclerView) findViewById2;
        RecyclerView recyclerView = this.f5478T;
        if (recyclerView != null) {
            C11705b bVar3 = this.f5476R;
            if (bVar3 != null) {
                recyclerView.setAdapter(bVar3);
                return inflate;
            }
            C12932j.m33820c("adapter");
            throw null;
        }
        C12932j.m33820c("recyclerView");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        ResolutionSolver.get().autoResolve(view.getContext());
        C12791d<Boolean> dVar = this.f5479U;
        List resolutions = ResolutionSolver.get().getResolutions(view.getContext());
        C12932j.m33815a((Object) resolutions, "ResolutionSolver.get().g…Resolutions(view.context)");
        dVar.onNext(Boolean.valueOf(!resolutions.isEmpty()));
        C11705b bVar = this.f5476R;
        if (bVar != null) {
            C12773a.m33432a(bVar.mo34464b(), this.f5474P);
        } else {
            C12932j.m33820c("adapter");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        this.f5475Q.mo36401a();
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        this.f5474P.mo36401a();
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        ScreenBarLayout screenBarLayout = this.f5477S;
        if (screenBarLayout != null) {
            screenBarLayout.setPadding(rect.left, rect.top, rect.right, screenBarLayout.getPaddingBottom());
            RecyclerView recyclerView = this.f5478T;
            if (recyclerView != null) {
                recyclerView.setPadding(rect.left, recyclerView.getPaddingTop(), rect.right, rect.bottom);
                return;
            }
            C12932j.m33820c("recyclerView");
            throw null;
        }
        C12932j.m33820c("screenBarLayout");
        throw null;
    }
}
