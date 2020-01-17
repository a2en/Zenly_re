package com.bluelinelabs.conductor.changehandler;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.ControllerChangeHandler;

/* renamed from: com.bluelinelabs.conductor.changehandler.c */
public class C8816c extends C8812a {
    public C8816c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Animator mo9251a(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
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
                animatorSet.play(ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, new float[]{(view != null ? view.getTranslationX() : 0.0f) - ((float) view2.getWidth()), 0.0f}));
            }
        }
        return animatorSet;
    }

    /* renamed from: b */
    public ControllerChangeHandler mo12522b() {
        return new C8816c(mo23889f(), mo23853d());
    }

    public C8816c(boolean z) {
        super(z);
    }

    public C8816c(long j, boolean z) {
        super(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9252a(View view) {
        view.setTranslationX(0.0f);
    }
}
