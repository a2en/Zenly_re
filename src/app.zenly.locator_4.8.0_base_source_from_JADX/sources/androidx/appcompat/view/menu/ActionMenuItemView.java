package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.MenuBuilder.ItemInvoker;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.widget.ActionMenuView.ActionMenuChildView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0243b0;
import androidx.appcompat.widget.C0266o;
import p214e.p215a.C7530j;

public class ActionMenuItemView extends AppCompatTextView implements ItemView, OnClickListener, ActionMenuChildView {

    /* renamed from: e */
    C0169i f512e;

    /* renamed from: f */
    private CharSequence f513f;

    /* renamed from: g */
    private Drawable f514g;

    /* renamed from: h */
    ItemInvoker f515h;

    /* renamed from: i */
    private C0266o f516i;

    /* renamed from: j */
    C0154b f517j;

    /* renamed from: k */
    private boolean f518k;

    /* renamed from: l */
    private boolean f519l;

    /* renamed from: m */
    private int f520m;

    /* renamed from: n */
    private int f521n;

    /* renamed from: o */
    private int f522o;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0153a extends C0266o {
        public C0153a() {
            super(ActionMenuItemView.this);
        }

        /* renamed from: a */
        public ShowableListMenu mo695a() {
            C0154b bVar = ActionMenuItemView.this.f517j;
            if (bVar != null) {
                return bVar.mo697a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo696b() {
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            ItemInvoker itemInvoker = actionMenuItemView.f515h;
            if (itemInvoker == null || !itemInvoker.invokeItem(actionMenuItemView.f512e)) {
                return false;
            }
            ShowableListMenu a = mo695a();
            if (a == null || !a.isShowing()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class C0154b {
        /* renamed from: a */
        public abstract ShowableListMenu mo697a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private boolean m543b() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: c */
    private void m544c() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f513f);
        if (this.f514g != null && (!this.f512e.mo947l() || (!this.f518k && !this.f519l))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f513f : null);
        CharSequence contentDescription = this.f512e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f512e.getTitle();
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f512e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f512e.getTitle();
            }
            C0243b0.m933a(this, charSequence2);
            return;
        }
        C0243b0.m933a(this, tooltipText);
    }

    /* renamed from: a */
    public boolean mo674a() {
        return !TextUtils.isEmpty(getText());
    }

    public C0169i getItemData() {
        return this.f512e;
    }

    public void initialize(C0169i iVar, int i) {
        this.f512e = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.mo911a((ItemView) this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f516i == null) {
            this.f516i = new C0153a();
        }
    }

    public boolean needsDividerAfter() {
        return mo674a();
    }

    public boolean needsDividerBefore() {
        return mo674a() && this.f512e.getIcon() == null;
    }

    public void onClick(View view) {
        ItemInvoker itemInvoker = this.f515h;
        if (itemInvoker != null) {
            itemInvoker.invokeItem(this.f512e);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f518k = m543b();
        m544c();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean a = mo674a();
        if (a) {
            int i3 = this.f521n;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f520m) : this.f520m;
        if (mode != 1073741824 && this.f520m > 0 && measuredWidth < min) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!a && this.f514g != null) {
            super.setPadding((getMeasuredWidth() - this.f514g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f512e.hasSubMenu()) {
            C0266o oVar = this.f516i;
            if (oVar != null && oVar.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f519l != z) {
            this.f519l = z;
            C0169i iVar = this.f512e;
            if (iVar != null) {
                iVar.mo912a();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f514g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f522o;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            int i2 = this.f522o;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m544c();
    }

    public void setItemInvoker(ItemInvoker itemInvoker) {
        this.f515h = itemInvoker;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f521n = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(C0154b bVar) {
        this.f517j = bVar;
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f513f = charSequence;
        m544c();
    }

    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f518k = m543b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7530j.ActionMenuItemView, i, 0);
        this.f520m = obtainStyledAttributes.getDimensionPixelSize(C7530j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f522o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f521n = -1;
        setSaveEnabled(false);
    }
}
