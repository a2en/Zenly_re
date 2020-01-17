package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator.C1057b;

/* renamed from: androidx.recyclerview.widget.s */
public abstract class C1144s extends ItemAnimator {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(C1085v vVar);

    public boolean animateAppearance(C1085v vVar, C1057b bVar, C1057b bVar2) {
        if (bVar == null || (bVar.f4049a == bVar2.f4049a && bVar.f4050b == bVar2.f4050b)) {
            return animateAdd(vVar);
        }
        return animateMove(vVar, bVar.f4049a, bVar.f4050b, bVar2.f4049a, bVar2.f4050b);
    }

    public abstract boolean animateChange(C1085v vVar, C1085v vVar2, int i, int i2, int i3, int i4);

    public boolean animateChange(C1085v vVar, C1085v vVar2, C1057b bVar, C1057b bVar2) {
        int i;
        int i2;
        int i3 = bVar.f4049a;
        int i4 = bVar.f4050b;
        if (vVar2.shouldIgnore()) {
            int i5 = bVar.f4049a;
            i = bVar.f4050b;
            i2 = i5;
        } else {
            i2 = bVar2.f4049a;
            i = bVar2.f4050b;
        }
        return animateChange(vVar, vVar2, i3, i4, i2, i);
    }

    public boolean animateDisappearance(C1085v vVar, C1057b bVar, C1057b bVar2) {
        int i = bVar.f4049a;
        int i2 = bVar.f4050b;
        View view = vVar.itemView;
        int left = bVar2 == null ? view.getLeft() : bVar2.f4049a;
        int top = bVar2 == null ? view.getTop() : bVar2.f4050b;
        if (vVar.isRemoved() || (i == left && i2 == top)) {
            return animateRemove(vVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(vVar, i, i2, left, top);
    }

    public abstract boolean animateMove(C1085v vVar, int i, int i2, int i3, int i4);

    public boolean animatePersistence(C1085v vVar, C1057b bVar, C1057b bVar2) {
        if (bVar.f4049a == bVar2.f4049a && bVar.f4050b == bVar2.f4050b) {
            dispatchMoveFinished(vVar);
            return false;
        }
        return animateMove(vVar, bVar.f4049a, bVar.f4050b, bVar2.f4049a, bVar2.f4050b);
    }

    public abstract boolean animateRemove(C1085v vVar);

    public boolean canReuseUpdatedViewHolder(C1085v vVar) {
        return !this.mSupportsChangeAnimations || vVar.isInvalid();
    }

    public final void dispatchAddFinished(C1085v vVar) {
        onAddFinished(vVar);
        dispatchAnimationFinished(vVar);
    }

    public final void dispatchAddStarting(C1085v vVar) {
        onAddStarting(vVar);
    }

    public final void dispatchChangeFinished(C1085v vVar, boolean z) {
        onChangeFinished(vVar, z);
        dispatchAnimationFinished(vVar);
    }

    public final void dispatchChangeStarting(C1085v vVar, boolean z) {
        onChangeStarting(vVar, z);
    }

    public final void dispatchMoveFinished(C1085v vVar) {
        onMoveFinished(vVar);
        dispatchAnimationFinished(vVar);
    }

    public final void dispatchMoveStarting(C1085v vVar) {
        onMoveStarting(vVar);
    }

    public final void dispatchRemoveFinished(C1085v vVar) {
        onRemoveFinished(vVar);
        dispatchAnimationFinished(vVar);
    }

    public final void dispatchRemoveStarting(C1085v vVar) {
        onRemoveStarting(vVar);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(C1085v vVar) {
    }

    public void onAddStarting(C1085v vVar) {
    }

    public void onChangeFinished(C1085v vVar, boolean z) {
    }

    public void onChangeStarting(C1085v vVar, boolean z) {
    }

    public void onMoveFinished(C1085v vVar) {
    }

    public void onMoveStarting(C1085v vVar) {
    }

    public void onRemoveFinished(C1085v vVar) {
    }

    public void onRemoveStarting(C1085v vVar) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }
}
