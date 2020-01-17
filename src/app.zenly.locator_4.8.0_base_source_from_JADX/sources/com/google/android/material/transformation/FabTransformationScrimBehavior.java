package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p333g.p357d.p358a.p361b.p362l.C12078b;
import p333g.p357d.p358a.p361b.p362l.C12085i;

public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C12085i f28376c = new C12085i(75, 150);

    /* renamed from: d */
    private final C12085i f28377d = new C12085i(0, 150);

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    class C10835a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f28378a;

        /* renamed from: b */
        final /* synthetic */ View f28379b;

        C10835a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
            this.f28378a = z;
            this.f28379b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f28378a) {
                this.f28379b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f28378a) {
                this.f28379b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    /* renamed from: a */
    private void m27963a(View view, boolean z, boolean z2, List<Animator> list, List<AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        C12085i iVar = z ? this.f28376c : this.f28377d;
        if (z) {
            if (!z2) {
                view.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.0f});
        }
        iVar.mo35802a((Animator) objectAnimator);
        list.add(objectAnimator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AnimatorSet mo31441b(View view, View view2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        m27963a(view2, z, z2, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        C12078b.m31873a(animatorSet, arrayList);
        animatorSet.addListener(new C10835a(this, z, view2));
        return animatorSet;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
