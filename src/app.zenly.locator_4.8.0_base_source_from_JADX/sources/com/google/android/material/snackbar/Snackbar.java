package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12073h;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: o */
    private static final int[] f28249o = {C12067b.snackbarButtonStyle};

    /* renamed from: m */
    private final AccessibilityManager f28250m;

    /* renamed from: n */
    private boolean f28251n;

    public static final class SnackbarLayout extends C10811n {
        public SnackbarLayout(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    class C10813a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ OnClickListener f28252e;

        C10813a(OnClickListener onClickListener) {
            this.f28252e = onClickListener;
        }

        public void onClick(View view) {
            this.f28252e.onClick(view);
            Snackbar.this.mo31262a(1);
        }
    }

    private Snackbar(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        super(viewGroup, view, contentViewCallback);
        this.f28250m = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: a */
    public static Snackbar m27827a(View view, CharSequence charSequence, int i) {
        ViewGroup a = m27825a(view);
        if (a != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(a.getContext()).inflate(m27828a(a.getContext()) ? C12073h.mtrl_layout_snackbar_include : C12073h.design_layout_snackbar_include, a, false);
            Snackbar snackbar = new Snackbar(a, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo31303a(charSequence);
            snackbar.mo31268d(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: b */
    public void mo31263b() {
        super.mo31263b();
    }

    /* renamed from: d */
    public int mo31267d() {
        if (!this.f28251n || !this.f28250m.isTouchExplorationEnabled()) {
            return super.mo31267d();
        }
        return -2;
    }

    /* renamed from: e */
    public Snackbar mo31305e(int i) {
        mo31303a(mo31265c().getText(i));
        return this;
    }

    /* renamed from: k */
    public void mo31275k() {
        super.mo31275k();
    }

    /* renamed from: a */
    protected static boolean m27828a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f28249o);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Snackbar m27826a(View view, int i, int i2) {
        return m27827a(view, view.getResources().getText(i), i2);
    }

    /* renamed from: a */
    private static ViewGroup m27825a(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    public Snackbar mo31303a(CharSequence charSequence) {
        ((SnackbarContentLayout) this.f28221c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    /* renamed from: a */
    public Snackbar mo31302a(int i, OnClickListener onClickListener) {
        mo31304a(mo31265c().getText(i), onClickListener);
        return this;
    }

    /* renamed from: a */
    public Snackbar mo31304a(CharSequence charSequence, OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f28221c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f28251n = false;
        } else {
            this.f28251n = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C10813a(onClickListener));
        }
        return this;
    }
}
