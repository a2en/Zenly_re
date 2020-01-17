package app.zenly.locator.core.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bluelinelabs.conductor.changehandler.C8812a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.transition.b */
public final class C3061b extends C8812a {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public RainbowTransitionView f8466o;

    /* renamed from: app.zenly.locator.core.transition.b$a */
    public static final class C3062a implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C3061b f8467a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f8468b;

        /* renamed from: c */
        final /* synthetic */ View f8469c;

        /* renamed from: app.zenly.locator.core.transition.b$a$a */
        static final class C3063a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C3062a f8470e;

            C3063a(C3062a aVar) {
                this.f8470e = aVar;
            }

            public final void run() {
                this.f8470e.f8469c.setVisibility(0);
            }
        }

        public C3062a(C3061b bVar, ViewGroup viewGroup, View view) {
            this.f8467a = bVar;
            this.f8468b = viewGroup;
            this.f8469c = view;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f8468b.setClipChildren(false);
            C3061b bVar = this.f8467a;
            Context context = this.f8468b.getContext();
            C12932j.m33815a((Object) context, "container.context");
            RainbowTransitionView rainbowTransitionView = new RainbowTransitionView(context, null, 0, 6, null);
            bVar.f8466o = rainbowTransitionView;
            C3061b.m9597a(this.f8467a).setOnRainbowHalfwayListener(new C3063a(this));
            this.f8468b.addView(C3061b.m9597a(this.f8467a));
        }
    }

    /* renamed from: app.zenly.locator.core.transition.b$b */
    public static final class C3064b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C3061b f8471a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f8472b;

        /* renamed from: c */
        final /* synthetic */ View f8473c;

        public C3064b(C3061b bVar, ViewGroup viewGroup, View view) {
            this.f8471a = bVar;
            this.f8472b = viewGroup;
            this.f8473c = view;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f8472b.removeView(C3061b.m9597a(this.f8471a));
            this.f8472b.setClipChildren(true);
            this.f8473c.setVisibility(0);
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RainbowTransitionView m9597a(C3061b bVar) {
        RainbowTransitionView rainbowTransitionView = bVar.f8466o;
        if (rainbowTransitionView != null) {
            return rainbowTransitionView;
        }
        C12932j.m33820c("rainbowTransitionView");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9252a(View view) {
        C12932j.m33818b(view, "from");
        view.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Animator mo9251a(ViewGroup viewGroup, View view, View view2, boolean z, boolean z2) {
        C12932j.m33818b(viewGroup, "container");
        AnimatorSet animatorSet = new AnimatorSet();
        if (view2 != null) {
            view2.setVisibility(4);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0});
            ofInt.setDuration(500);
            ofInt.addListener(new C3062a(this, viewGroup, view2));
            ofInt.addListener(new C3064b(this, viewGroup, view2));
            animatorSet.play(ofInt);
        }
        return animatorSet;
    }
}
