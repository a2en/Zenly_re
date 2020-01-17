package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {
    private int tempLeftRightOffset = 0;
    private int tempTopBottomOffset = 0;
    private C10729a viewOffsetHelper;

    public ViewOffsetBehavior() {
    }

    public int getTopAndBottomOffset() {
        C10729a aVar = this.viewOffsetHelper;
        if (aVar != null) {
            return aVar.mo30623a();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2818b((View) v, i);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        layoutChild(coordinatorLayout, v, i);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new C10729a(v);
        }
        this.viewOffsetHelper.mo30625b();
        int i2 = this.tempTopBottomOffset;
        if (i2 != 0) {
            this.viewOffsetHelper.mo30626b(i2);
            this.tempTopBottomOffset = 0;
        }
        int i3 = this.tempLeftRightOffset;
        if (i3 != 0) {
            this.viewOffsetHelper.mo30624a(i3);
            this.tempLeftRightOffset = 0;
        }
        return true;
    }

    public boolean setTopAndBottomOffset(int i) {
        C10729a aVar = this.viewOffsetHelper;
        if (aVar != null) {
            return aVar.mo30626b(i);
        }
        this.tempTopBottomOffset = i;
        return false;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
