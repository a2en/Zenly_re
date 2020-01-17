package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7521a;
import p214e.p215a.C7526f;
import p214e.p215a.C7527g;
import p214e.p215a.C7530j;

public class ActionBarContextView extends C0237a {

    /* renamed from: m */
    private CharSequence f754m;

    /* renamed from: n */
    private CharSequence f755n;

    /* renamed from: o */
    private View f756o;

    /* renamed from: p */
    private View f757p;

    /* renamed from: q */
    private LinearLayout f758q;

    /* renamed from: r */
    private TextView f759r;

    /* renamed from: s */
    private TextView f760s;

    /* renamed from: t */
    private int f761t;

    /* renamed from: u */
    private int f762u;

    /* renamed from: v */
    private boolean f763v;

    /* renamed from: w */
    private int f764w;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0186a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ ActionMode f765e;

        C0186a(ActionBarContextView actionBarContextView, ActionMode actionMode) {
            this.f765e = actionMode;
        }

        public void onClick(View view) {
            this.f765e.mo588a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m731e() {
        if (this.f758q == null) {
            LayoutInflater.from(getContext()).inflate(C7527g.abc_action_bar_title_item, this);
            this.f758q = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f759r = (TextView) this.f758q.findViewById(C7526f.action_bar_title);
            this.f760s = (TextView) this.f758q.findViewById(C7526f.action_bar_subtitle);
            if (this.f761t != 0) {
                this.f759r.setTextAppearance(getContext(), this.f761t);
            }
            if (this.f762u != 0) {
                this.f760s.setTextAppearance(getContext(), this.f762u);
            }
        }
        this.f759r.setText(this.f754m);
        this.f760s.setText(this.f755n);
        boolean z = !TextUtils.isEmpty(this.f754m);
        boolean z2 = !TextUtils.isEmpty(this.f755n);
        int i = 0;
        this.f760s.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f758q;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f758q.getParent() == null) {
            addView(this.f758q);
        }
    }

    /* renamed from: b */
    public boolean mo1117b() {
        return this.f763v;
    }

    /* renamed from: c */
    public void mo1118c() {
        removeAllViews();
        this.f757p = null;
        this.f1081g = null;
    }

    /* renamed from: d */
    public boolean mo1119d() {
        ActionMenuPresenter actionMenuPresenter = this.f1082h;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1210h();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f755n;
    }

    public CharSequence getTitle() {
        return this.f754m;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1082h;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1206d();
            this.f1082h.mo1207e();
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f754m);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0254f0.m992a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f756o;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f756o.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = C0237a.m920a(paddingRight, i6, a);
            i5 = C0237a.m920a(a2 + mo1853a(this.f756o, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f758q;
        if (!(linearLayout == null || this.f757p != null || linearLayout.getVisibility() == 8)) {
            i5 += mo1853a(this.f758q, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        View view2 = this.f757p;
        if (view2 != null) {
            mo1853a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1081g;
        if (actionMenuView != null) {
            mo1853a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (MeasureSpec.getMode(i) != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(ActionBarContextView.class.getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            int i4 = this.f1083i;
            if (i4 <= 0) {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f756o;
            if (view != null) {
                int a = mo1852a(view, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f756o.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1081g;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1852a(this.f1081g, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f758q;
            if (linearLayout != null && this.f757p == null) {
                if (this.f763v) {
                    this.f758q.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f758q.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f758q.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1852a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f757p;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f757p.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1083i <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ActionBarContextView.class.getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public void setContentHeight(int i) {
        this.f1083i = i;
    }

    public void setCustomView(View view) {
        View view2 = this.f757p;
        if (view2 != null) {
            removeView(view2);
        }
        this.f757p = view;
        if (view != null) {
            LinearLayout linearLayout = this.f758q;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f758q = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f755n = charSequence;
        m731e();
    }

    public void setTitle(CharSequence charSequence) {
        this.f754m = charSequence;
        m731e();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f763v) {
            requestLayout();
        }
        this.f763v = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.actionModeStyle);
    }

    /* renamed from: a */
    public void mo1116a(ActionMode actionMode) {
        View view = this.f756o;
        if (view == null) {
            this.f756o = LayoutInflater.from(getContext()).inflate(this.f764w, this, false);
            addView(this.f756o);
        } else if (view.getParent() == null) {
            addView(this.f756o);
        }
        this.f756o.findViewById(C7526f.action_mode_close_button).setOnClickListener(new C0186a(this, actionMode));
        MenuBuilder menuBuilder = (MenuBuilder) actionMode.mo596c();
        ActionMenuPresenter actionMenuPresenter = this.f1082h;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1204b();
        }
        this.f1082h = new ActionMenuPresenter(getContext());
        this.f1082h.mo1203b(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        menuBuilder.mo720a((MenuPresenter) this.f1082h, this.f1080f);
        this.f1081g = (ActionMenuView) this.f1082h.getMenuView(this);
        ViewCompat.m2822a((View) this.f1081g, (Drawable) null);
        addView(this.f1081g, layoutParams);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0291z a = C0291z.m1196a(context, attributeSet, C7530j.ActionMode, i, 0);
        ViewCompat.m2822a((View) this, a.mo2106b(C7530j.ActionMode_background));
        this.f761t = a.mo2115g(C7530j.ActionMode_titleTextStyle, 0);
        this.f762u = a.mo2115g(C7530j.ActionMode_subtitleTextStyle, 0);
        this.f1083i = a.mo2113f(C7530j.ActionMode_height, 0);
        this.f764w = a.mo2115g(C7530j.ActionMode_closeItemLayout, C7527g.abc_action_mode_close_item_material);
        a.mo2102a();
    }

    /* renamed from: a */
    public void mo1115a() {
        if (this.f756o == null) {
            mo1118c();
        }
    }
}
