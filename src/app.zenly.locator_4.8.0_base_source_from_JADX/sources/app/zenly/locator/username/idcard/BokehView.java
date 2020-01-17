package app.zenly.locator.username.idcard;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3240v;
import app.zenly.locator.p143s.p146j.C5433c;
import app.zenly.locator.p143s.p151o.p152c.C5467a;
import java.util.ArrayList;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.ClosedRange;

public final class BokehView extends View implements Callback {

    /* renamed from: e */
    private final ViewVisibilityAggregatedHelper<?> f15052e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ArrayList<Drawable> f15053f;

    /* renamed from: g */
    private boolean f15054g;

    /* renamed from: h */
    private boolean f15055h;

    /* renamed from: i */
    private C6019a f15056i;

    /* renamed from: j */
    private final C5987c f15057j;

    /* renamed from: app.zenly.locator.username.idcard.BokehView$a */
    public static final class C5985a {
        private C5985a() {
        }

        public /* synthetic */ C5985a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.BokehView$b */
    public static final class C5986b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ BokehView f15058a;

        /* renamed from: b */
        final /* synthetic */ Drawable f15059b;

        public C5986b(BokehView bokehView, Drawable drawable) {
            this.f15058a = bokehView;
            this.f15059b = drawable;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            this.f15059b.setCallback(null);
            this.f15058a.f15053f.remove(this.f15059b);
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.BokehView$c */
    public static final class C5987c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ BokehView f15060e;

        C5987c(BokehView bokehView) {
            this.f15060e = bokehView;
        }

        public void run() {
            BokehView.m16595a(this.f15060e, false, 1, null);
            this.f15060e.postDelayed(this, 1000);
        }
    }

    static {
        new C5985a(null);
    }

    public BokehView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BokehView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BokehView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    private final void m16596b() {
        removeCallbacks(this.f15057j);
        for (Drawable callback : this.f15053f) {
            callback.setCallback(null);
        }
        this.f15053f.clear();
        this.f15055h = false;
        m16594a();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f15052e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6427b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f15052e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6428c();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        C12932j.m33818b(canvas, "canvas");
        super.onDraw(canvas);
        for (Drawable draw : this.f15053f) {
            draw.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f15054g = true;
        m16594a();
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f15052e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6425a(z);
        }
    }

    public void onVisibilityAggregatedChanged(boolean z) {
        m16594a();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C12932j.m33818b(view, "changedView");
        super.onVisibilityChanged(view, i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f15052e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6424a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f15052e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6423a(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        C12932j.m33818b(drawable, "who");
        return super.verifyDrawable(drawable) || this.f15053f.contains(drawable);
    }

    public BokehView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f15052e = new ViewVisibilityAggregatedHelper<>(this);
        this.f15053f = new ArrayList<>();
        this.f15056i = C6019a.f15150h.mo13788a();
        this.f15057j = new C5987c(this);
    }

    /* renamed from: a */
    private final void m16594a() {
        ViewVisibilityAggregatedHelper<?> viewVisibilityAggregatedHelper = this.f15052e;
        boolean z = true;
        if (viewVisibilityAggregatedHelper == null || !viewVisibilityAggregatedHelper.mo6426a() || !this.f15054g) {
            z = false;
        }
        if (z != this.f15055h) {
            this.f15055h = z;
            if (z) {
                int b = this.f15056i.mo13781b();
                for (int i = 0; i < b; i++) {
                    m16597b(false);
                }
                postDelayed(this.f15057j, 1000);
            } else {
                removeCallbacks(this.f15057j);
                for (Drawable callback : this.f15053f) {
                    callback.setCallback(null);
                }
                this.f15053f.clear();
            }
        }
    }

    /* renamed from: b */
    private final void m16597b(boolean z) {
        Drawable drawable = getContext().getDrawable(this.f15056i.mo13782c());
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            if (mutate != null) {
                C12932j.m33815a((Object) mutate, "context.getDrawable(conf…esId)?.mutate() ?: return");
                double a = (double) C3200e0.m10183a(getContext(), 100);
                int max = (int) (((float) Math.max(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight())) * C3240v.m10273a((ClosedRange<Double>) this.f15056i.mo13783d()));
                double d = -a;
                double d2 = (double) (((float) max) / 2.0f);
                int a2 = (int) (C3240v.m10273a((ClosedRange<Double>) C12972k.m33882a(d, ((double) getWidth()) + a)) - d2);
                int a3 = (int) (C3240v.m10273a((ClosedRange<Double>) C12972k.m33882a(d, ((double) getHeight()) + a)) - d2);
                mutate.setBounds(a2, a3, a2 + max, max + a3);
                mutate.setAlpha(0);
                mutate.setCallback(this);
                this.f15053f.add(mutate);
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(mutate, new PropertyValuesHolder[]{m16592a(z), m16591a(mutate)});
                C12932j.m33815a((Object) ofPropertyValuesHolder, "ObjectAnimator.ofPropert…Holder(newCell)\n        )");
                ofPropertyValuesHolder.setDuration(20000);
                ofPropertyValuesHolder.addListener(new C5986b(this, mutate));
                ofPropertyValuesHolder.start();
            }
        }
    }

    /* renamed from: a */
    public final void mo13728a(C6019a aVar) {
        C12932j.m33818b(aVar, "config");
        if (!C12932j.m33817a((Object) this.f15056i, (Object) aVar)) {
            this.f15056i = aVar;
            m16596b();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m16595a(BokehView bokehView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        bokehView.m16597b(z);
    }

    /* renamed from: a */
    private final PropertyValuesHolder m16591a(Drawable drawable) {
        float a = (C3200e0.m10181a(getContext(), (float) C3240v.m10273a((ClosedRange<Double>) this.f15056i.mo13784e())) * ((float) 20000)) / ((float) 1000);
        double a2 = C3240v.m10273a((ClosedRange<Double>) C12972k.m33882a(0.0d, 6.283185307179586d));
        double d = (double) a;
        int cos = (int) (Math.cos(a2) * d);
        int sin = (int) (Math.sin(a2) * d);
        Rect rect = new Rect(drawable.getBounds());
        rect.offset(cos, sin);
        PropertyValuesHolder ofObject = PropertyValuesHolder.ofObject(C5467a.f14067b.mo13086a(new Rect()), C5433c.m15445a(new Rect()), new Rect[]{rect});
        C12932j.m33815a((Object) ofObject, "PropertyValuesHolder\n   …ect(Rect()), finalBounds)");
        return ofObject;
    }

    /* renamed from: a */
    private final PropertyValuesHolder m16592a(boolean z) {
        Keyframe keyframe;
        int a = (int) (C3240v.m10273a((ClosedRange<Double>) this.f15056i.mo13780a()) * ((float) 255));
        if (z) {
            keyframe = Keyframe.ofInt(0.0f, 0);
        } else {
            keyframe = Keyframe.ofInt(0.0f, a);
        }
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(C5467a.f14066a, new Keyframe[]{keyframe, Keyframe.ofInt(0.1f, a), Keyframe.ofInt(0.9f, a), Keyframe.ofInt(1.0f, 0)});
        C12932j.m33815a((Object) ofKeyframe, "PropertyValuesHolder.ofK….ofInt(1.0f, 0)\n        )");
        return ofKeyframe;
    }
}
