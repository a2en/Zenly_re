package app.zenly.locator.onboarding.p124x3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.changehandler.C8812a;

/* renamed from: app.zenly.locator.onboarding.x3.a */
public class C4942a extends C8812a {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Animator mo9251a(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (!z) {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{(float) (-view.getWidth())}));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{(float) view2.getWidth(), 0.0f}));
            }
        } else {
            if (view != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{(float) view.getWidth()}));
            }
            if (view2 != null) {
                animatorSet.play(ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{(float) (-view2.getWidth()), 0.0f}));
            }
        }
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9252a(View view) {
        view.setTranslationX(0.0f);
    }
}
