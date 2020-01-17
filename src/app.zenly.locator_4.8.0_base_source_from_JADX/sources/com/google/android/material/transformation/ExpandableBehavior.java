package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

public abstract class ExpandableBehavior extends Behavior<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f28356a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C10828a implements OnPreDrawListener {

        /* renamed from: e */
        final /* synthetic */ View f28357e;

        /* renamed from: f */
        final /* synthetic */ int f28358f;

        /* renamed from: g */
        final /* synthetic */ ExpandableWidget f28359g;

        C10828a(View view, int i, ExpandableWidget expandableWidget) {
            this.f28357e = view;
            this.f28358f = i;
            this.f28359g = expandableWidget;
        }

        public boolean onPreDraw() {
            this.f28357e.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f28356a == this.f28358f) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                ExpandableWidget expandableWidget = this.f28359g;
                expandableBehavior.mo31439a((View) expandableWidget, this.f28357e, expandableWidget.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo31439a(View view, View view2, boolean z, boolean z2);

    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!m27937a(expandableWidget.isExpanded())) {
            return false;
        }
        this.f28356a = expandableWidget.isExpanded() ? 1 : 2;
        return mo31439a((View) expandableWidget, view, expandableWidget.isExpanded(), true);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!ViewCompat.m2804D(view)) {
            ExpandableWidget a = mo31438a(coordinatorLayout, view);
            if (a != null && m27937a(a.isExpanded())) {
                this.f28356a = a.isExpanded() ? 1 : 2;
                view.getViewTreeObserver().addOnPreDrawListener(new C10828a(view, this.f28356a, a));
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ExpandableWidget mo31438a(CoordinatorLayout coordinatorLayout, View view) {
        List b = coordinatorLayout.mo2816b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) b.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private boolean m27937a(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.f28356a;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.f28356a == 1) {
            z2 = true;
        }
        return z2;
    }
}
