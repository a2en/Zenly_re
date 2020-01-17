package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C0169i;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.widget.C0243b0;
import androidx.appcompat.widget.LinearLayoutCompat.LayoutParams;
import androidx.core.content.res.C0554e;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.C0615a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0628c;
import androidx.core.widget.C0680h;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import p214e.p215a.C7521a;
import p333g.p357d.p358a.p361b.C12069d;
import p333g.p357d.p358a.p361b.C12070e;
import p333g.p357d.p358a.p361b.C12071f;
import p333g.p357d.p358a.p361b.C12073h;

public class NavigationMenuItemView extends ForegroundLinearLayout implements ItemView {

    /* renamed from: u */
    private static final int[] f28112u = {16842912};

    /* renamed from: k */
    private final int f28113k;

    /* renamed from: l */
    private boolean f28114l;

    /* renamed from: m */
    boolean f28115m;

    /* renamed from: n */
    private final CheckedTextView f28116n;

    /* renamed from: o */
    private FrameLayout f28117o;

    /* renamed from: p */
    private C0169i f28118p;

    /* renamed from: q */
    private ColorStateList f28119q;

    /* renamed from: r */
    private boolean f28120r;

    /* renamed from: s */
    private Drawable f28121s;

    /* renamed from: t */
    private final C0615a f28122t;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C10781a extends C0615a {
        C10781a() {
        }

        /* renamed from: a */
        public void mo3292a(View view, C0628c cVar) {
            super.mo3292a(view, cVar);
            cVar.mo3332b(NavigationMenuItemView.this.f28115m);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m27711a() {
        if (m27713c()) {
            this.f28116n.setVisibility(8);
            FrameLayout frameLayout = this.f28117o;
            if (frameLayout != null) {
                LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.f28117o.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f28116n.setVisibility(0);
        FrameLayout frameLayout2 = this.f28117o;
        if (frameLayout2 != null) {
            LayoutParams layoutParams2 = (LayoutParams) frameLayout2.getLayoutParams();
            layoutParams2.width = -2;
            this.f28117o.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: b */
    private StateListDrawable m27712b() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C7521a.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f28112u, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: c */
    private boolean m27713c() {
        return this.f28118p.getTitle() == null && this.f28118p.getIcon() == null && this.f28118p.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f28117o == null) {
                this.f28117o = (FrameLayout) ((ViewStub) findViewById(C12071f.design_menu_item_action_area_stub)).inflate();
            }
            this.f28117o.removeAllViews();
            this.f28117o.addView(view);
        }
    }

    public C0169i getItemData() {
        return this.f28118p;
    }

    public void initialize(C0169i iVar, int i) {
        this.f28118p = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.m2822a((View) this, (Drawable) m27712b());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        C0243b0.m933a(this, iVar.getTooltipText());
        m27711a();
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0169i iVar = this.f28118p;
        if (iVar != null && iVar.isCheckable() && this.f28118p.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f28112u);
        }
        return onCreateDrawableState;
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f28115m != z) {
            this.f28115m = z;
            this.f28122t.mo3291a((View) this.f28116n, (int) ItemAnimator.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f28116n.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f28120r) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0559a.m2657i(drawable).mutate();
                C0559a.m2642a(drawable, this.f28119q);
            }
            int i = this.f28113k;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f28114l) {
            if (this.f28121s == null) {
                this.f28121s = C0554e.m2609b(getResources(), C12070e.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f28121s;
                if (drawable2 != null) {
                    int i2 = this.f28113k;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f28121s;
        }
        C0680h.m3180a(this.f28116n, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f28116n.setCompoundDrawablePadding(i);
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f28119q = colorStateList;
        this.f28120r = this.f28119q != null;
        C0169i iVar = this.f28118p;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f28114l = z;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        C0680h.m3189d(this.f28116n, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f28116n.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f28116n.setText(charSequence);
    }

    public boolean showsIcon() {
        return true;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28122t = new C10781a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C12073h.design_navigation_menu_item, this, true);
        this.f28113k = context.getResources().getDimensionPixelSize(C12069d.design_navigation_icon_size);
        this.f28116n = (CheckedTextView) findViewById(C12071f.design_menu_item_text);
        this.f28116n.setDuplicateParentStateEnabled(true);
        ViewCompat.m2824a((View) this.f28116n, this.f28122t);
    }
}
