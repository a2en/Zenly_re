package com.bluelinelabs.conductor.changehandler;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.ControllerChangeHandler;

/* renamed from: com.bluelinelabs.conductor.changehandler.b */
public class C8815b extends C8812a {
    public C8815b() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Animator mo9251a(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        float f;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view2 != null) {
            if (z2) {
                f = 0.0f;
            } else {
                f = view2.getAlpha();
            }
            animatorSet.play(ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{f, 1.0f}));
        }
        if (view != null && (!z || mo23853d())) {
            animatorSet.play(ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f}));
        }
        return animatorSet;
    }

    /* renamed from: b */
    public ControllerChangeHandler mo12522b() {
        return new C8815b(mo23889f(), mo23853d());
    }

    public C8815b(boolean z) {
        super(z);
    }

    public C8815b(long j) {
        super(j);
    }

    public C8815b(long j, boolean z) {
        super(j, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9252a(View view) {
        view.setAlpha(1.0f);
    }
}
