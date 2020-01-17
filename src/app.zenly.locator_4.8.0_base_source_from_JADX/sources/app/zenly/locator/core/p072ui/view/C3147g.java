package app.zenly.locator.core.p072ui.view;

import androidx.constraintlayout.widget.C0473c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import app.zenly.locator.core.p072ui.view.StatefulLayout.C3131a;
import app.zenly.locator.core.transition.C3066d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;

/* renamed from: app.zenly.locator.core.ui.view.g */
public final class C3147g extends C0473c {

    /* renamed from: f */
    private final TransitionSet f8707f;

    /* renamed from: g */
    private final Set<StatefulLayout> f8708g = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Set<StatefulLayout> f8709h = new LinkedHashSet();

    /* renamed from: i */
    private boolean f8710i;

    /* renamed from: j */
    private final ConstraintLayout f8711j;

    /* renamed from: app.zenly.locator.core.ui.view.g$a */
    static final class C3148a extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        public static final C3148a f8712f = new C3148a();

        C3148a() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.g$b */
    static final class C3149b extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3147g f8713f;

        /* renamed from: g */
        final /* synthetic */ Function0 f8714g;

        C3149b(C3147g gVar, Function0 function0) {
            this.f8713f = gVar;
            this.f8714g = function0;
            super(0);
        }

        public final void invoke() {
            for (StatefulLayout statefulLayout : this.f8713f.f8709h) {
                this.f8713f.mo2785d(statefulLayout.getId(), statefulLayout.getState() != C3131a.EMPTY ? 0 : 8);
            }
            this.f8714g.invoke();
        }
    }

    public C3147g(ConstraintLayout constraintLayout) {
        C12932j.m33818b(constraintLayout, "view");
        this.f8711j = constraintLayout;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6054a(C3066d.m9601a());
        transitionSet.mo6054a((Transition) C3066d.m9602b());
        C12932j.m33815a((Object) transitionSet, "TransitionSet()\n        …ion(Transitions.bounceIn)");
        this.f8707f = transitionSet;
    }

    /* renamed from: b */
    public final TransitionSet mo9482b() {
        return this.f8707f;
    }

    /* renamed from: c */
    public final boolean mo9484c() {
        return this.f8710i;
    }

    /* renamed from: d */
    public final ConstraintLayout mo9485d() {
        return this.f8711j;
    }

    /* renamed from: a */
    public static /* synthetic */ void m9884a(C3147g gVar, Long l, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            function0 = C3148a.f8712f;
        }
        gVar.mo9481a(l, function0);
    }

    /* renamed from: b */
    public final void mo9483b(StatefulLayout statefulLayout) {
        C12932j.m33818b(statefulLayout, "layout");
        this.f8708g.remove(statefulLayout);
        this.f8709h.add(statefulLayout);
    }

    /* renamed from: a */
    public final void mo9481a(Long l, Function0<C12956q> function0) {
        C12932j.m33818b(function0, "action");
        C3150h.m9893a(this, l, null, new C3149b(this, function0), 2, null);
        this.f8709h.clear();
        this.f8708g.clear();
        this.f8710i = true;
    }

    /* renamed from: a */
    public final void mo9480a(StatefulLayout statefulLayout, boolean z) {
        C3131a aVar;
        C12932j.m33818b(statefulLayout, "layout");
        if (this.f8709h.contains(statefulLayout)) {
            if (z) {
                aVar = C3131a.DATA;
            } else if (this.f8708g.contains(statefulLayout)) {
                aVar = C3131a.LOADING;
            } else {
                aVar = C3131a.EMPTY;
            }
            statefulLayout.setState(aVar);
        }
    }

    /* renamed from: a */
    public final void mo9479a(StatefulLayout statefulLayout) {
        C12932j.m33818b(statefulLayout, "layout");
        if (!this.f8709h.contains(statefulLayout)) {
            this.f8708g.add(statefulLayout);
            this.f8709h.add(statefulLayout);
        }
    }
}
