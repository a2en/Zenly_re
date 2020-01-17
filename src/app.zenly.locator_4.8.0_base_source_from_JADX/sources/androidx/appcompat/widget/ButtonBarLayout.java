package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7526f;
import p214e.p215a.C7530j;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: e */
    private boolean f902e;

    /* renamed from: f */
    private int f903f = -1;

    /* renamed from: g */
    private int f904g = 0;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7530j.ButtonBarLayout);
        this.f902e = obtainStyledAttributes.getBoolean(C7530j.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m826a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C7526f.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public int getMinimumHeight() {
        return Math.max(this.f904g, super.getMinimumHeight());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f902e) {
            if (size > this.f903f && m827a()) {
                setStacked(false);
            }
            this.f903f = size;
        }
        if (m827a() || MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f902e && !m827a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m826a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m827a()) {
                int a2 = m826a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (ViewCompat.m2863p(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f902e != z) {
            this.f902e = z;
            if (!this.f902e && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* renamed from: a */
    private boolean m827a() {
        return getOrientation() == 1;
    }
}
