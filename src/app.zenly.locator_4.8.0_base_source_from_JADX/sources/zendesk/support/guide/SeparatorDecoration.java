package zendesk.support.guide;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

class SeparatorDecoration extends C1074l {
    private Drawable mDivider;

    SeparatorDecoration(Drawable drawable) {
        this.mDivider = drawable;
    }

    private boolean isItemACategory(C1085v vVar) {
        return vVar instanceof CategoryViewHolder;
    }

    private boolean isItemAnExpandedCategory(C1085v vVar) {
        return (vVar instanceof CategoryViewHolder) && ((CategoryViewHolder) vVar).isExpanded();
    }

    private boolean isItemAnUnexpandedCategory(C1085v vVar) {
        return (vVar instanceof CategoryViewHolder) && !((CategoryViewHolder) vVar).isExpanded();
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1082s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        if (recyclerView.getItemAnimator() == null || !recyclerView.getItemAnimator().isRunning()) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (shouldShowTopSeparator(recyclerView, i)) {
                    int top = childAt.getTop() + ((LayoutParams) childAt.getLayoutParams()).topMargin;
                    this.mDivider.setBounds(recyclerView.getPaddingLeft(), top, recyclerView.getWidth() - recyclerView.getPaddingRight(), this.mDivider.getIntrinsicHeight() + top);
                    this.mDivider.draw(canvas);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldShowTopSeparator(RecyclerView recyclerView, int i) {
        boolean isItemACategory = isItemACategory(recyclerView.mo5094g(recyclerView.getChildAt(i)));
        boolean isItemAnExpandedCategory = isItemAnExpandedCategory(recyclerView.mo5094g(recyclerView.getChildAt(i)));
        boolean z = i > 0 && isItemAnUnexpandedCategory(recyclerView.mo5094g(recyclerView.getChildAt(i - 1)));
        if (!isItemACategory) {
            return false;
        }
        if (isItemAnExpandedCategory || !z) {
            return true;
        }
        return false;
    }
}
