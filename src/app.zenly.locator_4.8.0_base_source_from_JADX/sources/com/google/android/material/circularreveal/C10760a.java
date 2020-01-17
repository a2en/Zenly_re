package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.CircularRevealWidget.C10756b;
import com.google.android.material.circularreveal.CircularRevealWidget.C10757c;
import com.google.android.material.circularreveal.CircularRevealWidget.C10759e;

/* renamed from: com.google.android.material.circularreveal.a */
public final class C10760a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    static class C10761a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ CircularRevealWidget f28021a;

        C10761a(CircularRevealWidget circularRevealWidget) {
            this.f28021a = circularRevealWidget;
        }

        public void onAnimationEnd(Animator animator) {
            this.f28021a.destroyCircularRevealCache();
        }

        public void onAnimationStart(Animator animator) {
            this.f28021a.buildCircularRevealCache();
        }
    }

    /* renamed from: a */
    public static Animator m27587a(CircularRevealWidget circularRevealWidget, float f, float f2, float f3) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(circularRevealWidget, C10757c.f28016a, C10756b.f28014b, new C10759e[]{new C10759e(f, f2, f3)});
        if (VERSION.SDK_INT < 21) {
            return ofObject;
        }
        C10759e revealInfo = circularRevealWidget.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) circularRevealWidget, (int) f, (int) f2, revealInfo.f28020c, f3);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: a */
    public static AnimatorListener m27586a(CircularRevealWidget circularRevealWidget) {
        return new C10761a(circularRevealWidget);
    }
}
