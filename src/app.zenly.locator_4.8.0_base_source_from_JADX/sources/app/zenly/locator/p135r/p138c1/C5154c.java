package app.zenly.locator.p135r.p138c1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8812a;
import com.bluelinelabs.conductor.changehandler.C8815b;

/* renamed from: app.zenly.locator.r.c1.c */
public class C5154c extends C8812a {
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
        return animatorSet;
    }

    /* renamed from: b */
    public ControllerChangeHandler mo12522b() {
        return new C8815b(mo23889f(), mo23853d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9252a(View view) {
        view.setAlpha(1.0f);
    }
}
