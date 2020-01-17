package com.google.android.material.internal;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.view.C0643e;
import androidx.core.view.ViewCompat;

public class FlowLayout extends ViewGroup {

    /* renamed from: e */
    private int f28103e;

    /* renamed from: f */
    private int f28104f;

    /* renamed from: g */
    private boolean f28105g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo31175a() {
        return this.f28105g;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f28104f;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f28103e;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() != 0) {
            boolean z2 = true;
            if (ViewCompat.m2862o(this) != 1) {
                z2 = false;
            }
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        i5 = C0643e.m3007b(marginLayoutParams);
                        i6 = C0643e.m3006a(marginLayoutParams);
                    } else {
                        i6 = 0;
                        i5 = 0;
                    }
                    int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                    if (!this.f28105g && measuredWidth > i7) {
                        i9 = paddingTop + this.f28103e;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i5;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i5, measuredHeight);
                    } else {
                        childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    }
                    i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f28104f;
                    paddingTop = measuredHeight;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingRight = i5 - getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() == 8) {
                int i9 = i;
                int i10 = i2;
            } else {
                measureChild(childAt, i, i2);
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                int i11 = paddingLeft;
                if (paddingLeft + i4 + childAt.getMeasuredWidth() > paddingRight && !mo31175a()) {
                    i6 = this.f28103e + paddingTop;
                    i11 = getPaddingLeft();
                }
                int measuredWidth = i11 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingTop = measuredHeight;
                paddingLeft = i11 + i4 + i3 + childAt.getMeasuredWidth() + this.f28104f;
            }
        }
        setMeasuredDimension(m27709a(size, mode, i7), m27709a(size2, mode2, paddingTop));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f28104f = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f28103e = i;
    }

    public void setSingleLine(boolean z) {
        this.f28105g = z;
    }

    /* renamed from: a */
    private static int m27709a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }
}
