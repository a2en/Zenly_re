package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import p333g.p357d.p358a.p361b.p362l.C12077a;

public class HideBottomViewOnScrollBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    private int f27883a = 0;

    /* renamed from: b */
    private int f27884b = 2;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ViewPropertyAnimator f27885c;

    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    class C10731a extends AnimatorListenerAdapter {
        C10731a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f27885c = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30628b(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f27885c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f27884b = 2;
        m27353a(v, 0, 225, C12077a.f31463d);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f27883a = v.getMeasuredHeight();
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f27884b != 1 && i2 > 0) {
            mo30627a(v);
        } else if (this.f27884b != 2 && i2 < 0) {
            mo30628b(v);
        }
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30627a(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.f27885c;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f27884b = 1;
        m27353a(v, this.f27883a, 175, C12077a.f31462c);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m27353a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f27885c = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new C10731a());
    }
}
