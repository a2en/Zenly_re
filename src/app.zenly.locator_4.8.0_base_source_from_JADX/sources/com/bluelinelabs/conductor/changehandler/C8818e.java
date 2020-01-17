package com.bluelinelabs.conductor.changehandler;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import java.util.ArrayList;

/* renamed from: com.bluelinelabs.conductor.changehandler.e */
public class C8818e extends C8812a {
    public C8818e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Animator mo9251a(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (z && view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{(float) view2.getHeight(), 0.0f}));
        } else if (!z && view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{(float) view.getHeight()}));
        }
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9252a(View view) {
    }

    /* renamed from: b */
    public ControllerChangeHandler mo12522b() {
        return new C8818e(mo23889f(), mo23853d());
    }

    public C8818e(long j, boolean z) {
        super(j, z);
    }
}
