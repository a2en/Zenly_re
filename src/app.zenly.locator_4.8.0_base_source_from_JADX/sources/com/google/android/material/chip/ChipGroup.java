package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup.OnHierarchyChangeListener;
import com.google.android.material.internal.FlowLayout;

public class ChipGroup extends FlowLayout {

    /* renamed from: h */
    private int f28006h;

    /* renamed from: i */
    private int f28007i;

    /* renamed from: j */
    private boolean f28008j;

    /* renamed from: k */
    private OnCheckedChangeListener f28009k;

    /* renamed from: l */
    private C10754a f28010l;

    /* renamed from: m */
    private int f28011m;

    public static class LayoutParams extends MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    private class C10754a implements OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public OnHierarchyChangeListener f28012e;
    }

    /* renamed from: a */
    private void m27577a(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            ((Chip) findViewById).setChecked(z);
        }
    }

    private void setCheckedId(int i) {
        this.f28011m = i;
        OnCheckedChangeListener onCheckedChangeListener = this.f28009k;
        if (onCheckedChangeListener != null && this.f28008j) {
            onCheckedChangeListener.onCheckedChanged(this, i);
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f28011m;
                if (i2 != -1 && this.f28008j) {
                    m27577a(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public void mo30980b() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        setCheckedId(-1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f28008j) {
            return this.f28011m;
        }
        return -1;
    }

    public int getChipSpacingHorizontal() {
        return this.f28006h;
    }

    public int getChipSpacingVertical() {
        return this.f28007i;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f28011m;
        if (i != -1) {
            m27577a(i, true);
            setCheckedId(this.f28011m);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f28006h != i) {
            this.f28006h = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f28007i != i) {
            this.f28007i = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.f28009k = onCheckedChangeListener;
    }

    public void setOnHierarchyChangeListener(OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f28010l.f28012e = onHierarchyChangeListener;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f28008j != z) {
            this.f28008j = z;
            mo30980b();
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
