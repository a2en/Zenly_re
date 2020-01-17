package app.zenly.locator.core.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.C1241n;
import app.zenly.locator.R;

/* renamed from: app.zenly.locator.core.transition.e */
class C3067e {

    /* renamed from: app.zenly.locator.core.transition.e$b */
    private static class C3069b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f8474a;

        /* renamed from: b */
        private final View f8475b;

        /* renamed from: c */
        private final int f8476c;

        /* renamed from: d */
        private final int f8477d;

        /* renamed from: e */
        private int[] f8478e;

        /* renamed from: f */
        private float f8479f;

        /* renamed from: g */
        private float f8480g;

        /* renamed from: h */
        private final float f8481h;

        /* renamed from: i */
        private final float f8482i;

        public void onAnimationCancel(Animator animator) {
            if (this.f8478e == null) {
                this.f8478e = new int[2];
            }
            this.f8478e[0] = Math.round(((float) this.f8476c) + this.f8475b.getTranslationX());
            this.f8478e[1] = Math.round(((float) this.f8477d) + this.f8475b.getTranslationY());
            this.f8474a.setTag(R.id.transition_position, this.f8478e);
        }

        public void onAnimationEnd(Animator animator) {
            this.f8475b.setTranslationX(this.f8481h);
            this.f8475b.setTranslationY(this.f8482i);
        }

        public void onAnimationPause(Animator animator) {
            this.f8479f = this.f8475b.getTranslationX();
            this.f8480g = this.f8475b.getTranslationY();
            this.f8475b.setTranslationX(this.f8481h);
            this.f8475b.setTranslationY(this.f8482i);
        }

        public void onAnimationResume(Animator animator) {
            this.f8475b.setTranslationX(this.f8479f);
            this.f8475b.setTranslationY(this.f8480g);
        }

        private C3069b(View view, View view2, int i, int i2, float f, float f2) {
            this.f8475b = view;
            this.f8474a = view2;
            this.f8476c = i - Math.round(this.f8475b.getTranslationX());
            this.f8477d = i2 - Math.round(this.f8475b.getTranslationY());
            this.f8481h = f;
            this.f8482i = f2;
            this.f8478e = (int[]) this.f8474a.getTag(R.id.transition_position);
            if (this.f8478e != null) {
                this.f8474a.setTag(R.id.transition_position, null);
            }
        }
    }

    /* renamed from: a */
    static Animator m9603a(View view, C1241n nVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        View view2 = view;
        C1241n nVar2 = nVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) nVar2.f4646b.getTag(R.id.transition_position);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C3069b bVar = new C3069b(view, nVar2.f4646b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(bVar);
        ofPropertyValuesHolder.addPauseListener(bVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
