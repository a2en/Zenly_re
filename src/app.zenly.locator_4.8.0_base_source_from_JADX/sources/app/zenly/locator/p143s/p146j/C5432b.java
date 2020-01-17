package app.zenly.locator.p143s.p146j;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.j.b */
public abstract class C5432b extends AnimatorListenerAdapter {

    /* renamed from: a */
    private boolean f13986a;

    /* renamed from: a */
    public void mo7336a(Animator animator, boolean z) {
        C12932j.m33818b(animator, "animation");
    }

    public void onAnimationCancel(Animator animator) {
        C12932j.m33818b(animator, "animation");
        this.f13986a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        C12932j.m33818b(animator, "animation");
        mo7336a(animator, this.f13986a);
    }

    public void onAnimationStart(Animator animator) {
        C12932j.m33818b(animator, "animation");
        this.f13986a = false;
    }
}
