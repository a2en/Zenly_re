package app.zenly.locator.core.p072ui.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.locator.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.core.ui.view.AvatarListLoaderView */
public final class AvatarListLoaderView extends LinearLayout implements Callback {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final ViewVisibilityAggregatedHelper<?> f8608v;

    /* renamed from: app.zenly.locator.core.ui.view.AvatarListLoaderView$a */
    public static final class C3116a {
        private C3116a() {
        }

        public /* synthetic */ C3116a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.AvatarListLoaderView$b */
    public static final class C3117b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ AvatarListLoaderView f8609a;

        public C3117b(AvatarListLoaderView avatarListLoaderView, boolean z) {
            this.f8609a = avatarListLoaderView;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
            ViewVisibilityAggregatedHelper a = this.f8609a.f8608v;
            if (a == null || !a.mo6426a()) {
                this.f8609a.removeAllViews();
            } else {
                this.f8609a.m9786a(false);
            }
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    static {
        new C3116a(null);
    }

    public AvatarListLoaderView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AvatarListLoaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AvatarListLoaderView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: c */
    private final ObjectAnimator m9787c(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ROTATION, new float[]{0.0f, -20.0f, 20.0f, -20.0f});
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.setDuration(900);
        ofFloat.setInterpolator(C7657c.m18649e());
        C12932j.m33815a((Object) ofFloat, "ObjectAnimator.ofFloat(t…lators.linear()\n        }");
        return ofFloat;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8608v;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6427b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8608v;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6428c();
        }
        super.onDetachedFromWindow();
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8608v;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6425a(z);
        }
    }

    public void onVisibilityAggregatedChanged(boolean z) {
        if (z) {
            m9786a(true);
        } else {
            removeAllViews();
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C12932j.m33818b(view, "changedView");
        super.onVisibilityChanged(view, i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8608v;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6424a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f8608v;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6423a(i);
        }
    }

    public AvatarListLoaderView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f8608v = new ViewVisibilityAggregatedHelper<>(this);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(450);
        setLayoutTransition(layoutTransition);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m9786a(boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_user_avatar, this, false);
        if (inflate != null) {
            ImageView imageView = (ImageView) inflate;
            ObjectAnimator c = m9787c(imageView);
            if (z) {
                c.addListener(new C3117b(this, z));
                c.setStartDelay(900);
            }
            c.start();
            addView(imageView);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
    }
}
