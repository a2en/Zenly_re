package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public AnimatorSet f28361b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    class C10829a extends AnimatorListenerAdapter {
        C10829a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f28361b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo31441b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo31439a(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.f28361b != null;
        if (z3) {
            this.f28361b.cancel();
        }
        this.f28361b = mo31441b(view, view2, z, z3);
        this.f28361b.addListener(new C10829a());
        this.f28361b.start();
        if (!z2) {
            this.f28361b.end();
        }
        return true;
    }
}
