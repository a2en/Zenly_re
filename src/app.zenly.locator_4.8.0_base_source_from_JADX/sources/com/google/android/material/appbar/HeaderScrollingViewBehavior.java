package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.view.C0641c;
import androidx.core.view.C0666p;
import androidx.core.view.ViewCompat;
import java.util.List;
import p214e.p234h.p238g.C7631a;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private int overlayTop;
    final Rect tempRect1 = new Rect();
    final Rect tempRect2 = new Rect();
    private int verticalLayoutGap = 0;

    public HeaderScrollingViewBehavior() {
    }

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public abstract View findFirstDependency(List<View> list);

    /* access modifiers changed from: 0000 */
    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i = this.overlayTop;
        return C7631a.m18585a((int) (overlapRatioForOffset * ((float) i)), 0, i);
    }

    /* access modifiers changed from: 0000 */
    public abstract float getOverlapRatioForOffset(View view);

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.mo2816b(view));
        if (findFirstDependency != null) {
            C0489d dVar = (C0489d) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, findFirstDependency.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            C0666p lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.m2859l(coordinatorLayout) && !ViewCompat.m2859l(view)) {
                rect.left += lastWindowInsets.mo3444b();
                rect.right -= lastWindowInsets.mo3445c();
            }
            Rect rect2 = this.tempRect2;
            C0641c.m3003a(resolveGravity(dVar.f2363c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - findFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.verticalLayoutGap = 0;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View findFirstDependency = findFirstDependency(coordinatorLayout.mo2816b(view));
            if (findFirstDependency != null) {
                if (!ViewCompat.m2859l(findFirstDependency) || ViewCompat.m2859l(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    ViewCompat.m2829a(view, true);
                    if (ViewCompat.m2859l(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.mo2811a(view, i, i2, MeasureSpec.makeMeasureSpec((size - findFirstDependency.getMeasuredHeight()) + getScrollRange(findFirstDependency), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    public final void setOverlayTop(int i) {
        this.overlayTop = i;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
