package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.p004os.CancellationSignal;
import androidx.core.p004os.CancellationSignal.OnCancelListener;
import androidx.core.view.C0647i;
import p214e.p243k.C7639a;
import p214e.p243k.C7640b;

/* renamed from: androidx.fragment.app.c */
class C0798c {

    /* renamed from: androidx.fragment.app.c$a */
    static class C0799a implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f3260a;

        C0799a(Fragment fragment) {
            this.f3260a = fragment;
        }

        public void onCancel() {
            if (this.f3260a.getAnimatingAway() != null) {
                View animatingAway = this.f3260a.getAnimatingAway();
                this.f3260a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f3260a.setAnimator(null);
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    static class C0800b implements AnimationListener {

        /* renamed from: e */
        final /* synthetic */ ViewGroup f3261e;

        /* renamed from: f */
        final /* synthetic */ Fragment f3262f;

        /* renamed from: g */
        final /* synthetic */ C0828g f3263g;

        /* renamed from: h */
        final /* synthetic */ CancellationSignal f3264h;

        /* renamed from: androidx.fragment.app.c$b$a */
        class C0801a implements Runnable {
            C0801a() {
            }

            public void run() {
                if (C0800b.this.f3262f.getAnimatingAway() != null) {
                    C0800b.this.f3262f.setAnimatingAway(null);
                    C0800b bVar = C0800b.this;
                    bVar.f3263g.mo4140a(bVar.f3262f, bVar.f3264h);
                }
            }
        }

        C0800b(ViewGroup viewGroup, Fragment fragment, C0828g gVar, CancellationSignal cancellationSignal) {
            this.f3261e = viewGroup;
            this.f3262f = fragment;
            this.f3263g = gVar;
            this.f3264h = cancellationSignal;
        }

        public void onAnimationEnd(Animation animation) {
            this.f3261e.post(new C0801a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.fragment.app.c$c */
    static class C0802c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3266a;

        /* renamed from: b */
        final /* synthetic */ View f3267b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3268c;

        /* renamed from: d */
        final /* synthetic */ C0828g f3269d;

        /* renamed from: e */
        final /* synthetic */ CancellationSignal f3270e;

        C0802c(ViewGroup viewGroup, View view, Fragment fragment, C0828g gVar, CancellationSignal cancellationSignal) {
            this.f3266a = viewGroup;
            this.f3267b = view;
            this.f3268c = fragment;
            this.f3269d = gVar;
            this.f3270e = cancellationSignal;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3266a.endViewTransition(this.f3267b);
            Animator animator2 = this.f3268c.getAnimator();
            this.f3268c.setAnimator(null);
            if (animator2 != null && this.f3266a.indexOfChild(this.f3267b) < 0) {
                this.f3269d.mo4140a(this.f3268c, this.f3270e);
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$d */
    static class C0803d {

        /* renamed from: a */
        public final Animation f3271a;

        /* renamed from: b */
        public final Animator f3272b;

        C0803d(Animation animation) {
            this.f3271a = animation;
            this.f3272b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        C0803d(Animator animator) {
            this.f3271a = null;
            this.f3272b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$e */
    private static class C0804e extends AnimationSet implements Runnable {

        /* renamed from: e */
        private final ViewGroup f3273e;

        /* renamed from: f */
        private final View f3274f;

        /* renamed from: g */
        private boolean f3275g;

        /* renamed from: h */
        private boolean f3276h;

        /* renamed from: i */
        private boolean f3277i = true;

        C0804e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f3273e = viewGroup;
            this.f3274f = view;
            addAnimation(animation);
            this.f3273e.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f3277i = true;
            if (this.f3275g) {
                return !this.f3276h;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f3275g = true;
                C0647i.m3033a(this.f3273e, this);
            }
            return true;
        }

        public void run() {
            if (this.f3275g || !this.f3277i) {
                this.f3273e.endViewTransition(this.f3274f);
                this.f3276h = true;
                return;
            }
            this.f3277i = false;
            this.f3273e.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f3277i = true;
            if (this.f3275g) {
                return !this.f3276h;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f3275g = true;
                C0647i.m3033a(this.f3273e, this);
            }
            return true;
        }
    }

    /* renamed from: a */
    static C0803d m3756a(Context context, C0805d dVar, Fragment fragment, boolean z) {
        int nextTransition = fragment.getNextTransition();
        int nextAnim = fragment.getNextAnim();
        boolean z2 = false;
        fragment.setNextAnim(0);
        View a = dVar.mo3993a(fragment.mContainerId);
        if (!(a == null || a.getTag(C7640b.visible_removing_fragment_view_tag) == null)) {
            a.setTag(C7640b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, nextAnim);
        if (onCreateAnimation != null) {
            return new C0803d(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, nextAnim);
        if (onCreateAnimator != null) {
            return new C0803d(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (loadAnimation != null) {
                        return new C0803d(loadAnimation);
                    }
                    z2 = true;
                } catch (NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                    if (loadAnimator != null) {
                        return new C0803d(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                        if (loadAnimation2 != null) {
                            return new C0803d(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        if (nextTransition == 0) {
            return null;
        }
        int a2 = m3755a(nextTransition, z);
        if (a2 < 0) {
            return null;
        }
        return new C0803d(AnimationUtils.loadAnimation(context, a2));
    }

    /* renamed from: a */
    static void m3757a(Fragment fragment, C0803d dVar, C0828g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        CancellationSignal cancellationSignal = new CancellationSignal();
        cancellationSignal.mo3156a(new C0799a(fragment));
        gVar.mo4141b(fragment, cancellationSignal);
        Animation animation = dVar.f3271a;
        if (animation != null) {
            C0804e eVar = new C0804e(animation, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new C0800b(viewGroup, fragment, gVar, cancellationSignal));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f3272b;
        fragment.setAnimator(animator);
        C0802c cVar = new C0802c(viewGroup, view, fragment, gVar, cancellationSignal);
        animator.addListener(cVar);
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* renamed from: a */
    private static int m3755a(int i, boolean z) {
        if (i == 4097) {
            return z ? C7639a.fragment_open_enter : C7639a.fragment_open_exit;
        }
        if (i == 4099) {
            return z ? C7639a.fragment_fade_enter : C7639a.fragment_fade_exit;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? C7639a.fragment_close_enter : C7639a.fragment_close_exit;
    }
}
