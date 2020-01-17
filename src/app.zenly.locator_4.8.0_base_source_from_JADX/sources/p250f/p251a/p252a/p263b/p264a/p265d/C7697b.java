package p250f.p251a.p252a.p263b.p264a.p265d;

import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: f.a.a.b.a.d.b */
public final class C7697b {

    /* renamed from: f.a.a.b.a.d.b$a */
    static final class C7698a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f19321e;

        /* renamed from: f */
        final /* synthetic */ Function0 f19322f;

        C7698a(View view, Function0 function0) {
            this.f19321e = view;
            this.f19322f = function0;
        }

        public final void run() {
            Function0 function0 = this.f19322f;
            if (function0 != null) {
                C12956q qVar = (C12956q) function0.invoke();
            }
            this.f19321e.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static final void m18727a(View view) {
        m18730a(view, 0, null, 3, null);
    }

    /* renamed from: a */
    public static final void m18728a(View view, long j) {
        m18740c(view, j, null, 2, null);
    }

    /* renamed from: a */
    public static final void m18729a(View view, long j, Function0<C12956q> function0) {
        m18737b(view, C7700d.BOUNCE, j, function0);
    }

    /* renamed from: b */
    public static final void m18733b(View view) {
        m18736b(view, 0, null, 3, null);
    }

    /* renamed from: b */
    public static final void m18734b(View view, long j) {
        m18743d(view, j, null, 2, null);
    }

    /* renamed from: b */
    public static final void m18735b(View view, long j, Function0<C12956q> function0) {
        m18731a(view, C7700d.BOUNCE, j, function0);
    }

    /* renamed from: c */
    public static final void m18738c(View view) {
        m18740c(view, 0, null, 3, null);
    }

    /* renamed from: c */
    public static final void m18739c(View view, long j, Function0<C12956q> function0) {
        m18737b(view, C7700d.FADE, j, function0);
    }

    /* renamed from: d */
    public static final void m18741d(View view) {
        m18743d(view, 0, null, 3, null);
    }

    /* renamed from: d */
    public static final void m18742d(View view, long j, Function0<C12956q> function0) {
        m18731a(view, C7700d.FADE, j, function0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m18730a(View view, long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        m18729a(view, j, function0);
    }

    /* renamed from: b */
    public static /* synthetic */ void m18736b(View view, long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        m18735b(view, j, function0);
    }

    /* renamed from: c */
    public static /* synthetic */ void m18740c(View view, long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        m18739c(view, j, function0);
    }

    /* renamed from: d */
    public static /* synthetic */ void m18743d(View view, long j, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 300;
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        m18742d(view, j, function0);
    }

    /* renamed from: a */
    private static final void m18731a(View view, C7700d dVar, long j, Function0<C12956q> function0) {
        if (view != null) {
            ViewPropertyAnimator withEndAction = view.animate().setDuration(j).withEndAction(new C7698a(view, function0));
            C12932j.m33815a((Object) withEndAction, "animate()\n        .setDu…ity = View.GONE\n        }");
            m18726a(withEndAction, dVar);
            withEndAction.start();
        }
    }

    /* renamed from: b */
    private static final void m18737b(View view, C7700d dVar, long j, Function0<C12956q> function0) {
        if (view != null) {
            view.setVisibility(0);
            ViewPropertyAnimator withEndAction = view.animate().setDuration(j).withEndAction((Runnable) (function0 != 0 ? new C7699c(function0) : function0));
            C12932j.m33815a((Object) withEndAction, "animate()\n        .setDu….withEndAction(endAction)");
            m18732b(withEndAction, dVar);
            withEndAction.start();
        }
    }

    /* renamed from: a */
    private static final ViewPropertyAnimator m18726a(ViewPropertyAnimator viewPropertyAnimator, C7700d dVar) {
        int i = C7696a.f19319a[dVar.ordinal()];
        if (i == 1) {
            viewPropertyAnimator.setInterpolator(C7657c.m18643b());
            viewPropertyAnimator.scaleX(0.0f);
            viewPropertyAnimator.scaleY(0.0f);
        } else if (i == 2) {
            viewPropertyAnimator.setInterpolator(C7657c.m18649e());
            viewPropertyAnimator.alpha(0.0f);
        }
        return viewPropertyAnimator;
    }

    /* renamed from: b */
    private static final ViewPropertyAnimator m18732b(ViewPropertyAnimator viewPropertyAnimator, C7700d dVar) {
        int i = C7696a.f19320b[dVar.ordinal()];
        if (i == 1) {
            viewPropertyAnimator.setInterpolator(C7657c.m18650f());
            viewPropertyAnimator.scaleX(1.0f);
            viewPropertyAnimator.scaleY(1.0f);
        } else if (i == 2) {
            viewPropertyAnimator.setInterpolator(C7657c.m18649e());
            viewPropertyAnimator.alpha(1.0f);
        }
        return viewPropertyAnimator;
    }
}
