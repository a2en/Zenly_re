package app.zenly.locator.core.p072ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import app.zenly.locator.C3892m;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.ui.view.StatefulLayout */
public final class StatefulLayout extends FrameLayout {

    /* renamed from: e */
    private C3131a f8671e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f8672f;

    /* renamed from: app.zenly.locator.core.ui.view.StatefulLayout$LayoutParams */
    public static final class LayoutParams extends android.widget.FrameLayout.LayoutParams {

        /* renamed from: a */
        private boolean f8673a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            C12932j.m33818b(context, "context");
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.StatefulLayout_Layout);
            this.f8673a = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public final boolean mo9443a() {
            return this.f8673a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.view.StatefulLayout$a */
    public enum C3131a {
        DATA,
        EMPTY,
        LOADING
    }

    /* renamed from: app.zenly.locator.core.ui.view.StatefulLayout$b */
    static final class C3132b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ StatefulLayout f8678e;

        /* renamed from: f */
        final /* synthetic */ View f8679f;

        C3132b(StatefulLayout statefulLayout, View view) {
            this.f8678e = statefulLayout;
            this.f8679f = view;
        }

        public final void run() {
            this.f8679f.setVisibility(this.f8678e.f8672f);
        }
    }

    public StatefulLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public StatefulLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ StatefulLayout(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    private final void m9843b(View view) {
        if (view.getVisibility() != this.f8672f) {
            ViewPropertyAnimator withEndAction = view.animate().alpha(0.0f).withEndAction(new C3132b(this, view));
            C12932j.m33815a((Object) withEndAction, "animate()\n            .a…lity = hiddenVisibility }");
            withEndAction.setDuration(300);
        }
    }

    /* renamed from: c */
    private final boolean m9844c(View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            return ((LayoutParams) layoutParams).mo9443a();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.ui.view.StatefulLayout.LayoutParams");
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        C12932j.m33818b(layoutParams, "p");
        return layoutParams instanceof LayoutParams;
    }

    public final C3131a getState() {
        return this.f8671e;
    }

    public final void setState(C3131a aVar) {
        C12932j.m33818b(aVar, "value");
        if (this.f8671e != aVar) {
            this.f8671e = aVar;
            m9841a();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        m9841a();
    }

    public StatefulLayout(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f8671e = C3131a.EMPTY;
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.StatefulLayout);
        this.f8672f = obtainStyledAttributes.getInt(0, 8);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private final void m9842a(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            ViewPropertyAnimator alpha = view.animate().alpha(1.0f);
            C12932j.m33815a((Object) alpha, "animate()\n            .alpha(1f)");
            alpha.setDuration(300);
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C12932j.m33818b(attributeSet, "attrs");
        super.generateLayoutParams(attributeSet);
        Context context = getContext();
        C12932j.m33815a((Object) context, "context");
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    private final void m9841a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C12932j.m33815a((Object) childAt, "getChildAt(index)");
            if ((!m9844c(childAt) || this.f8671e != C3131a.LOADING) && (m9844c(childAt) || this.f8671e != C3131a.DATA)) {
                m9843b(childAt);
            } else {
                m9842a(childAt);
            }
        }
    }
}
