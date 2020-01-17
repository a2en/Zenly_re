package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition.TransitionListener;

public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    class C1193a extends C1235j {

        /* renamed from: a */
        final /* synthetic */ View f4524a;

        C1193a(Fade fade, View view) {
            this.f4524a = view;
        }

        public void onTransitionEnd(Transition transition) {
            C1254y.m6011a(this.f4524a, 1.0f);
            C1254y.m6010a(this.f4524a);
            transition.mo6023b((TransitionListener) this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    private static class C1194b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f4525a;

        /* renamed from: b */
        private boolean f4526b = false;

        C1194b(View view) {
            this.f4525a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C1254y.m6011a(this.f4525a, 1.0f);
            if (this.f4526b) {
                this.f4525a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (ViewCompat.m2872y(this.f4525a) && this.f4525a.getLayerType() == 0) {
                this.f4526b = true;
                this.f4525a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i) {
        mo6057a(i);
    }

    /* renamed from: a */
    private Animator m5794a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1254y.m6011a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1254y.f4669d, new float[]{f2});
        ofFloat.addListener(new C1194b(view));
        mo6008a((TransitionListener) new C1193a(this, view));
        return ofFloat;
    }

    /* renamed from: b */
    public Animator mo5999b(ViewGroup viewGroup, View view, C1241n nVar, C1241n nVar2) {
        C1254y.m6019e(view);
        return m5794a(view, m5793a(nVar, 1.0f), 0.0f);
    }

    /* renamed from: c */
    public void mo5963c(C1241n nVar) {
        super.mo5963c(nVar);
        nVar.f4645a.put("android:fade:transitionAlpha", Float.valueOf(C1254y.m6017c(nVar.f4646b)));
    }

    public Fade() {
    }

    /* renamed from: a */
    public Animator mo5998a(ViewGroup viewGroup, View view, C1241n nVar, C1241n nVar2) {
        float f = 0.0f;
        float a = m5793a(nVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return m5794a(view, f, 1.0f);
    }

    /* renamed from: a */
    private static float m5793a(C1241n nVar, float f) {
        if (nVar == null) {
            return f;
        }
        Float f2 = (Float) nVar.f4645a.get("android:fade:transitionAlpha");
        return f2 != null ? f2.floatValue() : f;
    }
}
