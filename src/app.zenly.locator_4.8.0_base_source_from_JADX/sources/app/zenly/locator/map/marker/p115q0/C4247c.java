package app.zenly.locator.map.marker.p115q0;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.android.base.util.C1302f;
import app.zenly.android.base.view.C1309a;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3229p;
import app.zenly.locator.core.util.C3229p.C3230a;
import app.zenly.locator.map.marker.AvatarMarkerView;
import app.zenly.locator.p143s.p146j.C5432b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;

/* renamed from: app.zenly.locator.map.marker.q0.c */
public final class C4247c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FrameLayout f11391a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ImageView f11392b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LinearLayout f11393c;

    /* renamed from: d */
    private final TextView f11394d;

    /* renamed from: e */
    private final TextView f11395e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ImageView f11396f;

    /* renamed from: g */
    private String f11397g;

    /* renamed from: h */
    private String f11398h;

    /* renamed from: i */
    private final float f11399i;

    /* renamed from: j */
    private final AnimatorSet f11400j;

    /* renamed from: k */
    private final AnimatorSet f11401k;

    /* renamed from: l */
    private final AnimatorSet f11402l;

    /* renamed from: m */
    private final AnimatorSet f11403m;

    /* renamed from: n */
    private final AnimatorSet f11404n;

    /* renamed from: o */
    private final GradientDrawable f11405o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f11406p;

    /* renamed from: q */
    private final Drawable f11407q;

    /* renamed from: r */
    private Bitmap f11408r;

    /* renamed from: s */
    private boolean f11409s;

    /* renamed from: t */
    private boolean f11410t;

    /* renamed from: app.zenly.locator.map.marker.q0.c$a */
    public static final class C4248a implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C4247c f11411a;

        public C4248a(C4247c cVar) {
            this.f11411a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f11411a.m12647c();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.q0.c$b */
    public static final class C4249b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C4247c f11412a;

        public C4249b(C4247c cVar) {
            this.f11412a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f11412a.f11391a.setVisibility(8);
            this.f11412a.m12647c();
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.q0.c$c */
    public static final class C4250c {
        private C4250c() {
        }

        public /* synthetic */ C4250c(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.q0.c$d */
    public static final class C4251d extends C5432b {

        /* renamed from: b */
        final /* synthetic */ C4247c f11413b;

        /* renamed from: app.zenly.locator.map.marker.q0.c$d$a */
        static final class C4252a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C4251d f11414e;

            C4252a(C4251d dVar) {
                this.f11414e = dVar;
            }

            public final void run() {
                this.f11414e.f11413b.m12647c();
            }
        }

        C4251d(C4247c cVar) {
            this.f11413b = cVar;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            super.mo7336a(animator, z);
            ImageView b = this.f11413b.f11396f;
            C12932j.m33815a((Object) b, "destination");
            b.setAlpha(0.0f);
            LinearLayout c = this.f11413b.f11393c;
            C12932j.m33815a((Object) c, "speedContainer");
            c.setAlpha(0.0f);
            ImageView d = this.f11413b.f11392b;
            String str = "traject";
            C12932j.m33815a((Object) d, str);
            d.setScaleX(1.0f);
            ImageView d2 = this.f11413b.f11392b;
            C12932j.m33815a((Object) d2, str);
            d2.setScaleY(1.0f);
            ImageView d3 = this.f11413b.f11392b;
            C12932j.m33815a((Object) d3, str);
            d3.setAlpha(1.0f);
            this.f11413b.f11406p = false;
            if (!z) {
                this.f11413b.f11391a.post(new C4252a(this));
            }
        }
    }

    static {
        new C4250c(null);
    }

    public C4247c(AvatarMarkerView avatarMarkerView) {
        AvatarMarkerView avatarMarkerView2 = avatarMarkerView;
        C12932j.m33818b(avatarMarkerView2, "markerView");
        View findViewById = avatarMarkerView2.findViewById(R.id.marker_heading);
        if (findViewById != null) {
            View inflate = ((ViewStub) findViewById).inflate();
            if (inflate != null) {
                this.f11391a = (FrameLayout) inflate;
                this.f11392b = (ImageView) this.f11391a.findViewById(R.id.marker_heading_traject);
                this.f11393c = (LinearLayout) this.f11391a.findViewById(R.id.marker_heading_speed);
                this.f11394d = (TextView) this.f11391a.findViewById(R.id.marker_heading_speed_value);
                this.f11395e = (TextView) this.f11391a.findViewById(R.id.marker_heading_speed_unit);
                this.f11396f = (ImageView) this.f11391a.findViewById(R.id.marker_heading_destination);
                String string = this.f11391a.getContext().getString(R.string.units_symbols_kmh);
                C12932j.m33815a((Object) string, "container.context.getStr…string.units_symbols_kmh)");
                this.f11397g = string;
                String string2 = this.f11391a.getContext().getString(R.string.units_symbols_mph);
                C12932j.m33815a((Object) string2, "container.context.getStr…string.units_symbols_mph)");
                this.f11398h = string2;
                Context context = avatarMarkerView.getContext();
                C12932j.m33815a((Object) context, "markerView.context");
                this.f11399i = (float) context.getResources().getDimensionPixelSize(R.dimen.grid_size_200);
                this.f11400j = new AnimatorSet();
                this.f11401k = new AnimatorSet();
                this.f11402l = new AnimatorSet();
                this.f11403m = new AnimatorSet();
                this.f11404n = new AnimatorSet();
                this.f11405o = new GradientDrawable();
                ImageView imageView = this.f11392b;
                String str = "traject";
                C12932j.m33815a((Object) imageView, str);
                this.f11407q = imageView.getDrawable();
                this.f11409s = true;
                this.f11405o.setShape(1);
                FrameLayout frameLayout = this.f11391a;
                frameLayout.setBackground(this.f11405o);
                frameLayout.setVisibility(8);
                AnimatorSet animatorSet = this.f11400j;
                animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11391a, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f11391a, View.TRANSLATION_Y, new float[]{this.f11399i, 0.0f}), ObjectAnimator.ofFloat(this.f11391a, C1309a.f4895a, new float[]{0.0f, 1.0f})});
                animatorSet.setInterpolator(C7657c.m18641a());
                animatorSet.setDuration(200);
                animatorSet.addListener(new C4248a(this));
                AnimatorSet animatorSet2 = this.f11401k;
                animatorSet2.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11391a, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11391a, View.TRANSLATION_Y, new float[]{0.0f, this.f11399i}), ObjectAnimator.ofFloat(this.f11391a, C1309a.f4895a, new float[]{1.0f, 0.0f})});
                animatorSet2.setDuration(150);
                animatorSet2.addListener(new C4249b(this));
                C4251d dVar = new C4251d(this);
                AnimatorSet animatorSet3 = this.f11402l;
                ImageView imageView2 = this.f11392b;
                C12932j.m33815a((Object) imageView2, str);
                ImageView imageView3 = this.f11396f;
                String str2 = "destination";
                C12932j.m33815a((Object) imageView3, str2);
                ImageView imageView4 = this.f11396f;
                C12932j.m33815a((Object) imageView4, str2);
                ImageView imageView5 = this.f11392b;
                C12932j.m33815a((Object) imageView5, str);
                animatorSet3.playSequentially(new Animator[]{m12641a((View) imageView2, (View) imageView3), m12641a((View) imageView4, (View) imageView5)});
                animatorSet3.addListener(dVar);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11392b, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11392b, C1309a.f4895a, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11393c, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f11394d, C1309a.f4895a, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f11395e, C1309a.f4895a, new float[]{0.0f, 1.0f})});
                animatorSet4.setInterpolator(C7657c.m18650f());
                animatorSet4.setStartDelay(600);
                animatorSet4.setDuration(400);
                AnimatorSet animatorSet5 = new AnimatorSet();
                animatorSet5.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11393c, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11394d, C1309a.f4895a, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11395e, C1309a.f4895a, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11392b, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f11392b, C1309a.f4895a, new float[]{0.0f, 1.0f})});
                animatorSet5.setInterpolator(C7657c.m18650f());
                animatorSet5.setStartDelay(600);
                animatorSet5.setDuration(400);
                AnimatorSet animatorSet6 = this.f11403m;
                animatorSet6.playSequentially(new Animator[]{animatorSet4, animatorSet5});
                animatorSet6.addListener(dVar);
                AnimatorSet animatorSet7 = new AnimatorSet();
                animatorSet7.playTogether(new Animator[]{ObjectAnimator.ofFloat(this.f11393c, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11394d, C1309a.f4895a, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11395e, C1309a.f4895a, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(this.f11396f, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(this.f11396f, C1309a.f4895a, new float[]{0.0f, 1.0f})});
                animatorSet7.setInterpolator(C7657c.m18650f());
                animatorSet7.setStartDelay(600);
                animatorSet7.setDuration(400);
                AnimatorSet animatorSet8 = this.f11404n;
                ImageView imageView6 = this.f11396f;
                C12932j.m33815a((Object) imageView6, str2);
                ImageView imageView7 = this.f11392b;
                C12932j.m33815a((Object) imageView7, str);
                animatorSet8.playSequentially(new Animator[]{animatorSet4, animatorSet7, m12641a((View) imageView6, (View) imageView7)});
                animatorSet8.addListener(dVar);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewStub");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m12647c() {
        boolean z = this.f11391a.getVisibility() == 0 && this.f11409s && (this.f11408r != null || this.f11410t);
        if (z && !this.f11406p) {
            this.f11406p = true;
            if (this.f11408r != null && this.f11410t) {
                this.f11404n.start();
            } else if (this.f11408r != null) {
                this.f11402l.start();
            } else {
                this.f11403m.start();
            }
        } else if (!z && this.f11406p) {
            this.f11406p = false;
            this.f11404n.cancel();
            this.f11402l.cancel();
            this.f11403m.cancel();
        }
    }

    /* renamed from: b */
    public final void mo11258b(Bitmap bitmap) {
        if (bitmap == null) {
            this.f11392b.setImageDrawable(this.f11407q);
        } else {
            this.f11392b.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public final void mo11254a(Bitmap bitmap) {
        this.f11408r = bitmap;
        this.f11396f.setImageBitmap(bitmap);
    }

    /* renamed from: b */
    public final void mo11257b(int i) {
        ImageView imageView = this.f11392b;
        C12932j.m33815a((Object) imageView, "traject");
        imageView.setImageTintList(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public final void mo11253a(int i) {
        this.f11405o.setColor(i);
    }

    /* renamed from: b */
    public final void mo11259b(boolean z) {
        this.f11410t = z;
        m12647c();
    }

    /* renamed from: a */
    public final void mo11255a(boolean z) {
        this.f11409s = z;
        m12647c();
    }

    /* renamed from: b */
    public final void mo11256b() {
        if (this.f11391a.getVisibility() == 8 || this.f11401k.isRunning()) {
            this.f11401k.cancel();
            this.f11391a.setVisibility(0);
            this.f11400j.start();
        }
    }

    /* renamed from: a */
    private final Animator m12641a(View view, View view2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(view, C1309a.f4895a, new float[]{1.0f, 0.0f}), ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f, 1.0f}), ObjectAnimator.ofFloat(view2, C1309a.f4895a, new float[]{0.0f, 1.0f})});
        animatorSet.setInterpolator(C7657c.m18650f());
        animatorSet.setStartDelay(600);
        animatorSet.setDuration(400);
        return animatorSet;
    }

    /* renamed from: a */
    public final void mo11251a() {
        if (this.f11391a.getVisibility() == 0 && !this.f11401k.isRunning()) {
            this.f11400j.cancel();
            this.f11401k.start();
        }
    }

    /* renamed from: a */
    public final void mo11252a(double d, boolean z) {
        this.f11393c.setBackgroundResource(z ? R.drawable.circle_gray_dark : R.drawable.circle_green_dark);
        C3230a aVar = C3229p.f9009i;
        Context context = this.f11391a.getContext();
        C12932j.m33815a((Object) context, "container.context");
        int i = C4253d.f11415a[aVar.mo9649a(context).ordinal()];
        String str = "speedUnit";
        String str2 = "speedValue";
        if (i == 1 || i == 2) {
            TextView textView = this.f11394d;
            C12932j.m33815a((Object) textView, str2);
            textView.setText(m12643a(C1302f.METERS_PER_SECOND.mo6420c(d)));
            TextView textView2 = this.f11395e;
            C12932j.m33815a((Object) textView2, str);
            textView2.setText(this.f11398h);
        } else if (i == 3) {
            TextView textView3 = this.f11394d;
            C12932j.m33815a((Object) textView3, str2);
            textView3.setText(m12643a(C1302f.METERS_PER_SECOND.mo6418a(d)));
            TextView textView4 = this.f11395e;
            C12932j.m33815a((Object) textView4, str);
            textView4.setText(this.f11397g);
        }
    }

    /* renamed from: a */
    private final String m12643a(double d) {
        Context context = this.f11391a.getContext();
        C12932j.m33815a((Object) context, "container.context");
        return C7706a.m18754a(context, C13045c.m34053a(d), 0, 4, (Object) null);
    }
}
