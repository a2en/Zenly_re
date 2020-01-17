package app.zenly.locator.map.marker.p115q0;

import android.animation.Animator;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import app.zenly.locator.p143s.p146j.C5432b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.marker.q0.a */
public final class C4242a {

    /* renamed from: a */
    private ImageView f11373a;

    /* renamed from: b */
    private GradientDrawable f11374b;

    /* renamed from: c */
    private int f11375c = -16777216;

    /* renamed from: d */
    private int f11376d = -1;

    /* renamed from: e */
    private int f11377e;

    /* renamed from: f */
    private final ViewGroup f11378f;

    /* renamed from: g */
    private final int f11379g;

    /* renamed from: h */
    private final int f11380h;

    /* renamed from: app.zenly.locator.map.marker.q0.a$a */
    public static final class C4243a extends C5432b {

        /* renamed from: b */
        final /* synthetic */ ImageView f11381b;

        C4243a(ImageView imageView) {
            this.f11381b = imageView;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            C12932j.m33818b(animator, "animation");
            if (!z) {
                this.f11381b.setVisibility(8);
            }
        }
    }

    public C4242a(ViewGroup viewGroup, int i, int i2) {
        C12932j.m33818b(viewGroup, "container");
        this.f11378f = viewGroup;
        this.f11379g = i;
        this.f11380h = i2;
    }

    /* renamed from: a */
    public final void mo11239a(int i) {
        this.f11375c = i;
        GradientDrawable gradientDrawable = this.f11374b;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
    }

    /* renamed from: b */
    public final void mo11241b(int i) {
        this.f11376d = i;
        GradientDrawable gradientDrawable = this.f11374b;
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(this.f11380h, i);
        }
    }

    /* renamed from: c */
    public final void mo11242c(int i) {
        this.f11377e = i;
        int i2 = this.f11377e;
        if (i2 == 0) {
            ImageView imageView = this.f11373a;
            if (imageView != null) {
                imageView.setImageTintList(null);
                return;
            }
            return;
        }
        ImageView imageView2 = this.f11373a;
        if (imageView2 != null) {
            imageView2.setImageTintList(ColorStateList.valueOf(i2));
        }
    }

    /* renamed from: a */
    public final void mo11238a() {
        ImageView imageView = this.f11373a;
        if (imageView != null) {
            imageView.animate().alpha(0.0f).setListener(new C4243a(imageView));
        }
    }

    /* renamed from: b */
    public final void mo11240b() {
        if (this.f11373a == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(this.f11375c);
            gradientDrawable.setStroke(this.f11380h, this.f11376d);
            this.f11374b = gradientDrawable;
            View findViewById = this.f11378f.findViewById(this.f11379g);
            if (findViewById != null) {
                View inflate = ((ViewStub) findViewById).inflate();
                if (inflate != null) {
                    ImageView imageView = (ImageView) inflate;
                    imageView.setAlpha(0.0f);
                    imageView.setBackground(this.f11374b);
                    int i = this.f11377e;
                    if (i != 0) {
                        imageView.setImageTintList(ColorStateList.valueOf(i));
                    }
                    this.f11373a = imageView;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewStub");
            }
        }
        ImageView imageView2 = this.f11373a;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
            imageView2.animate().alpha(1.0f).setListener(null);
        }
    }
}
