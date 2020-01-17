package app.zenly.locator.map.marker.p115q0;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import app.zenly.android.base.view.C1309a;
import app.zenly.locator.R;
import app.zenly.locator.map.marker.AvatarMarkerView;
import app.zenly.locator.p143s.p146j.C5432b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.map.marker.q0.e */
public final class C4254e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FrameLayout f11416a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ImageView f11417b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ImageView f11418c;

    /* renamed from: d */
    private final float f11419d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f11420e;

    /* renamed from: f */
    private final AnimatorSet f11421f;

    /* renamed from: g */
    private final AnimatorSet f11422g;

    /* renamed from: h */
    private final AnimatorSet f11423h;

    /* renamed from: i */
    private final GradientDrawable f11424i;

    /* renamed from: j */
    private boolean f11425j;

    /* renamed from: k */
    private BitmapDrawable f11426k;

    /* renamed from: app.zenly.locator.map.marker.q0.e$a */
    public static final class C4255a implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C4254e f11427a;

        public C4255a(C4254e eVar) {
            this.f11427a = eVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f11427a.m12663b();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.q0.e$b */
    public static final class C4256b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C4254e f11428a;

        public C4256b(C4254e eVar) {
            this.f11428a = eVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f11428a.f11416a.setVisibility(8);
            this.f11428a.m12663b();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.q0.e$c */
    public static final class C4257c extends C5432b {

        /* renamed from: b */
        final /* synthetic */ C4254e f11429b;

        /* renamed from: app.zenly.locator.map.marker.q0.e$c$a */
        static final class C4258a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C4257c f11430e;

            C4258a(C4257c cVar) {
                this.f11430e = cVar;
            }

            public final void run() {
                this.f11430e.f11429b.m12663b();
            }
        }

        C4257c(C4254e eVar, AnimatorSet animatorSet, AnimatorSet animatorSet2) {
            this.f11429b = eVar;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            super.mo7336a(animator, z);
            ImageView c = this.f11429b.f11418c;
            String str = "locationIcon";
            C12932j.m33815a((Object) c, str);
            c.setAlpha(0.0f);
            ImageView c2 = this.f11429b.f11418c;
            C12932j.m33815a((Object) c2, str);
            c2.setScaleX(0.0f);
            ImageView c3 = this.f11429b.f11418c;
            C12932j.m33815a((Object) c3, str);
            c3.setScaleY(0.0f);
            ImageView a = this.f11429b.f11417b;
            String str2 = "icon";
            C12932j.m33815a((Object) a, str2);
            a.setScaleX(1.0f);
            ImageView a2 = this.f11429b.f11417b;
            C12932j.m33815a((Object) a2, str2);
            a2.setScaleY(1.0f);
            ImageView a3 = this.f11429b.f11417b;
            C12932j.m33815a((Object) a3, str2);
            a3.setAlpha(1.0f);
            this.f11429b.f11420e = false;
            if (!z) {
                this.f11429b.f11416a.post(new C4258a(this));
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.q0.e$d */
    public static final class C4259d {
        private C4259d() {
        }

        public /* synthetic */ C4259d(C12928f fVar) {
            this();
        }
    }

    static {
        new C4259d(null);
    }

    public C4254e(AvatarMarkerView avatarMarkerView) {
        C12932j.m33818b(avatarMarkerView, "markerView");
        View findViewById = avatarMarkerView.findViewById(R.id.marker_sleeping);
        if (findViewById != null) {
            View inflate = ((ViewStub) findViewById).inflate();
            if (inflate != null) {
                this.f11416a = (FrameLayout) inflate;
                this.f11417b = (ImageView) this.f11416a.findViewById(R.id.sleeping_icon);
                this.f11418c = (ImageView) this.f11416a.findViewById(R.id.sleeping_location_icon);
                Context context = avatarMarkerView.getContext();
                C12932j.m33815a((Object) context, "markerView.context");
                this.f11419d = (float) context.getResources().getDimensionPixelSize(R.dimen.grid_size_200);
                this.f11421f = new AnimatorSet();
                this.f11422g = new AnimatorSet();
                this.f11423h = new AnimatorSet();
                this.f11424i = new GradientDrawable();
                this.f11425j = true;
                this.f11424i.setShape(1);
                FrameLayout frameLayout = this.f11416a;
                frameLayout.setBackground(this.f11424i);
                frameLayout.setVisibility(8);
                ImageView imageView = this.f11418c;
                imageView.setScaleX(0.0f);
                imageView.setScaleY(0.0f);
                AnimatorSet animatorSet = this.f11421f;
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11416a, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f11416a, View.TRANSLATION_Y, new float[]{this.f11419d, 0.0f}), ObjectAnimator.ofFloat(this.f11416a, C1309a.f4895a, new float[]{0.0f, 1.0f})});
                animatorSet.setInterpolator(C7657c.m18641a());
                animatorSet.setDuration(200);
                animatorSet.addListener(new C4255a(this));
                AnimatorSet animatorSet2 = this.f11422g;
                animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11416a, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11416a, View.TRANSLATION_Y, new float[]{0.0f, this.f11419d}), ObjectAnimator.ofFloat(this.f11416a, C1309a.f4895a, new float[]{1.0f, 0.0f})});
                animatorSet2.setDuration(150);
                animatorSet2.addListener(new C4256b(this));
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11417b, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11417b, C1309a.f4895a, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11418c, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f11418c, C1309a.f4895a, new float[]{0.0f, 1.0f})});
                animatorSet3.setInterpolator(C7657c.m18650f());
                animatorSet3.setStartDelay(600);
                animatorSet3.setDuration(400);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11418c, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11418c, C1309a.f4895a, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11417b, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f11417b, C1309a.f4895a, new float[]{0.0f, 1.0f})});
                animatorSet4.setInterpolator(C7657c.m18650f());
                animatorSet4.setStartDelay(600);
                animatorSet4.setDuration(400);
                AnimatorSet animatorSet5 = this.f11423h;
                animatorSet5.playSequentially(new Animator[]{animatorSet3, animatorSet4});
                animatorSet5.addListener(new C4257c(this, animatorSet3, animatorSet4));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewStub");
    }

    /* renamed from: b */
    public final void mo11272b(int i) {
        ImageView imageView = this.f11417b;
        C12932j.m33815a((Object) imageView, "icon");
        imageView.setImageTintList(ColorStateList.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m12663b() {
        this.f11418c.setImageDrawable(this.f11426k);
        boolean z = (this.f11416a.getVisibility() != 0 || !this.f11425j || this.f11417b == null || this.f11418c == null || this.f11426k == null) ? false : true;
        if (z && !this.f11420e) {
            this.f11420e = true;
            this.f11423h.start();
        } else if (!z && this.f11420e) {
            this.f11420e = false;
            this.f11423h.cancel();
        }
    }

    /* renamed from: a */
    public final void mo11270a(int i) {
        this.f11424i.setColor(i);
    }

    /* renamed from: a */
    public final void mo11271a(Bitmap bitmap) {
        if (bitmap != null) {
            Context context = this.f11416a.getContext();
            C12932j.m33815a((Object) context, "indicator.context");
            this.f11426k = new BitmapDrawable(context.getResources(), bitmap);
        } else {
            this.f11426k = null;
        }
        if (this.f11416a.getVisibility() == 8 || this.f11422g.isRunning()) {
            this.f11422g.cancel();
            this.f11416a.setVisibility(0);
            this.f11421f.start();
        }
    }

    /* renamed from: a */
    public final void mo11269a() {
        if (this.f11416a.getVisibility() == 0 && !this.f11422g.isRunning()) {
            this.f11421f.cancel();
            this.f11422g.start();
        }
    }
}
