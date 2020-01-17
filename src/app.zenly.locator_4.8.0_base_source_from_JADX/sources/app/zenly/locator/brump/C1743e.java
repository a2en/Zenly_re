package app.zenly.locator.brump;

import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8507d;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8819d.C8827h;
import com.bluelinelabs.conductor.C8829e;
import com.bluelinelabs.conductor.ControllerChangeHandler;

/* renamed from: app.zenly.locator.brump.e */
public class C1743e extends ZenlyController {

    /* renamed from: P */
    private LottieAnimationView f5841P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f5842Q = false;

    /* renamed from: R */
    private boolean f5843R = false;

    /* renamed from: S */
    private final LottieListener<C8506c> f5844S = new C1734b(this);

    /* renamed from: T */
    private final C8827h f5845T = new C1744a();

    /* renamed from: app.zenly.locator.brump.e$a */
    class C1744a extends C8827h {
        C1744a() {
        }

        /* renamed from: a */
        public void mo7344a(C8819d dVar, ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
            C1743e eVar2 = C1743e.this;
            if (dVar == eVar2) {
                eVar2.f5842Q = true;
                C1743e.this.m7137D();
            }
        }
    }

    /* renamed from: B */
    public static C1743e m7135B() {
        return new C1743e();
    }

    /* renamed from: C */
    private void m7136C() {
        if (this.f5841P.mo22804b()) {
            this.f5841P.mo22806c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m7137D() {
        if (mo23949n() && this.f5843R && this.f5842Q && !this.f5841P.mo22804b()) {
            ObjectAnimator.ofFloat(this.f5841P, View.ALPHA, new float[]{0.0f, 1.0f}).setDuration(200).start();
            this.f5841P.mo22807d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        m7137D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        m7136C();
        super.mo7053d(view);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        mo23946k().mo23997a((C8819d) this);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_bump_tuto, viewGroup, false);
        this.f5841P = (LottieAnimationView) inflate.findViewById(R.id.lottie);
        C8507d.m19679a(layoutInflater.getContext(), (int) R.raw.lottie_bump_tuto).mo23032b(this.f5844S);
        mo23911a(this.f5845T);
        inflate.findViewById(R.id.btn_close).setOnClickListener(new C1735c(this));
        return inflate;
    }

    /* renamed from: a */
    public /* synthetic */ void mo7343a(C8506c cVar) {
        this.f5843R = true;
        this.f5841P.setComposition(cVar);
        m7137D();
    }
}
