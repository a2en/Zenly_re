package app.zenly.locator.privacy.p134z;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p146j.C5432b;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.privacy.z.a */
public class C5123a {

    /* renamed from: a */
    private AnimatorSet f13294a;

    /* renamed from: b */
    private AnimatorSet f13295b;

    /* renamed from: c */
    private View f13296c;

    /* renamed from: d */
    private View f13297d;

    /* renamed from: e */
    private View f13298e;

    /* renamed from: f */
    private View f13299f;

    /* renamed from: g */
    private View f13300g;

    /* renamed from: h */
    private View f13301h;

    /* renamed from: i */
    private Drawable f13302i;

    /* renamed from: app.zenly.locator.privacy.z.a$a */
    class C5124a extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f13303b;

        /* renamed from: c */
        final /* synthetic */ boolean f13304c;

        C5124a(C5123a aVar, View view, boolean z) {
            this.f13303b = view;
            this.f13304c = z;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            super.mo7336a(animator, z);
            if (!this.f13304c) {
                this.f13303b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f13303b.setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.privacy.z.a$b */
    class C5125b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f13305b;

        /* renamed from: c */
        final /* synthetic */ boolean f13306c;

        C5125b(C5123a aVar, View view, boolean z) {
            this.f13305b = view;
            this.f13306c = z;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            super.mo7336a(animator, z);
            if (!this.f13306c) {
                this.f13305b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f13305b.setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.privacy.z.a$c */
    class C5126c extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f13307b;

        C5126c(C5123a aVar, View view) {
            this.f13307b = view;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f13307b.setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.privacy.z.a$d */
    class C5127d extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f13308b;

        C5127d(C5123a aVar, View view) {
            this.f13308b = view;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f13308b.setVisibility(0);
        }
    }

    public C5123a(View view, View view2, View view3, View view4, View view5, View view6, View view7) {
        this.f13301h = view;
        this.f13296c = view2;
        this.f13297d = view3;
        this.f13298e = view4;
        this.f13299f = view5;
        this.f13300g = view6;
        this.f13302i = view7.getBackground().mutate();
    }

    /* renamed from: a */
    public void mo12434a() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator d = mo12438d(true, this.f13301h, C7657c.m18641a(), 200);
        ObjectAnimator d2 = mo12438d(true, this.f13296c, C7657c.m18645c(), 200);
        ObjectAnimator a = mo12433a(false, this.f13297d, C7657c.m18641a(), 200);
        ObjectAnimator b = mo12435b(false, this.f13298e, C7657c.m18650f(), 200);
        ObjectAnimator d3 = mo12438d(false, this.f13299f, C7657c.m18649e(), 200);
        ObjectAnimator c = mo12437c(false, this.f13300g, C7657c.m18650f(), 200);
        Context context = this.f13301h.getContext();
        int a2 = C0540a.m2536a(context, (int) R.color.blue_black);
        int a3 = C0540a.m2536a(context, (int) R.color.white);
        animatorSet.playTogether(new Animator[]{b, d3, c, ObjectAnimator.ofArgb(this.f13302i, "tint", new int[]{a2, a3})});
        this.f13295b = new AnimatorSet();
        this.f13295b.playSequentially(new Animator[]{animatorSet, a, d2, d});
        AnimatorSet animatorSet2 = this.f13294a;
        if (animatorSet2 != null && animatorSet2.isStarted()) {
            this.f13294a.end();
        }
        this.f13295b.start();
    }

    /* renamed from: b */
    public void mo12436b() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator d = mo12438d(false, this.f13301h, C7657c.m18641a(), 200);
        ObjectAnimator d2 = mo12438d(false, this.f13296c, C7657c.m18641a(), 200);
        ObjectAnimator a = mo12433a(true, this.f13297d, C7657c.m18645c(), 200);
        ObjectAnimator b = mo12435b(true, this.f13298e, C7657c.m18650f(), 200);
        ObjectAnimator d3 = mo12438d(true, this.f13299f, C7657c.m18650f(), 200);
        ObjectAnimator c = mo12437c(true, this.f13300g, C7657c.m18650f(), 200);
        Context context = this.f13301h.getContext();
        int a2 = C0540a.m2536a(context, (int) R.color.white);
        int a3 = C0540a.m2536a(context, (int) R.color.blue_black);
        animatorSet.playTogether(new Animator[]{b, d3, c, ObjectAnimator.ofArgb(this.f13302i, "tint", new int[]{a2, a3})});
        this.f13294a = new AnimatorSet();
        this.f13294a.playSequentially(new Animator[]{d, d2, a, animatorSet});
        AnimatorSet animatorSet2 = this.f13295b;
        if (animatorSet2 != null && animatorSet2.isStarted()) {
            this.f13295b.end();
        }
        this.f13294a.start();
    }

    /* renamed from: c */
    public ObjectAnimator mo12437c(boolean z, View view, TimeInterpolator timeInterpolator, long j) {
        int measuredWidth = view.getMeasuredWidth() + Math.abs(((MarginLayoutParams) view.getLayoutParams()).leftMargin);
        float f = 0.0f;
        float f2 = z ? (float) measuredWidth : 0.0f;
        if (!z) {
            f = (float) measuredWidth;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{f2, f});
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(j);
        ofFloat.addListener(new C5127d(this, view));
        return ofFloat;
    }

    /* renamed from: d */
    public ObjectAnimator mo12438d(boolean z, View view, TimeInterpolator timeInterpolator, long j) {
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f2, f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f2, f})});
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        ofPropertyValuesHolder.setDuration(j);
        ofPropertyValuesHolder.addListener(new C5124a(this, view, z));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    public ObjectAnimator mo12433a(boolean z, View view, TimeInterpolator timeInterpolator, long j) {
        float f = 0.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (z) {
            f = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f2, f});
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(j);
        ofFloat.addListener(new C5125b(this, view, z));
        return ofFloat;
    }

    /* renamed from: b */
    public ObjectAnimator mo12435b(boolean z, View view, TimeInterpolator timeInterpolator, long j) {
        int measuredWidth = view.getMeasuredWidth() + Math.abs(((MarginLayoutParams) view.getLayoutParams()).rightMargin);
        float f = 0.0f;
        float f2 = z ? (float) (-measuredWidth) : 0.0f;
        if (!z) {
            f = (float) (-measuredWidth);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{f2, f});
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(j);
        ofFloat.addListener(new C5126c(this, view));
        return ofFloat;
    }
}
