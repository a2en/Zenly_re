package androidx.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import java.util.ArrayList;

/* renamed from: androidx.transition.a */
class C1214a {

    /* renamed from: androidx.transition.a$a */
    interface C1215a {
        void onAnimationPause(Animator animator);

        void onAnimationResume(Animator animator);
    }

    /* renamed from: a */
    static void m5911a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        if (VERSION.SDK_INT >= 19) {
            animator.addPauseListener(animatorListenerAdapter);
        }
    }

    /* renamed from: b */
    static void m5912b(Animator animator) {
        if (VERSION.SDK_INT >= 19) {
            animator.resume();
            return;
        }
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C1215a) {
                    ((C1215a) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }

    /* renamed from: a */
    static void m5910a(Animator animator) {
        if (VERSION.SDK_INT >= 19) {
            animator.pause();
            return;
        }
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C1215a) {
                    ((C1215a) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }
}
