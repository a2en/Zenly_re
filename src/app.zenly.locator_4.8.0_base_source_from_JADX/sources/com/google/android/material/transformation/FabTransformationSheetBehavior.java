package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.Map;
import p333g.p357d.p358a.p361b.C12066a;
import p333g.p357d.p358a.p361b.p362l.C12084h;
import p333g.p357d.p358a.p361b.p362l.C12086j;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: g */
    private Map<View, Integer> f28380g;

    public FabTransformationSheetBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C10834e mo31443a(Context context, boolean z) {
        int i;
        if (z) {
            i = C12066a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C12066a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        C10834e eVar = new C10834e();
        eVar.f28374a = C12084h.m31883a(context, i);
        eVar.f28375b = new C12086j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo31439a(View view, View view2, boolean z, boolean z2) {
        m27965a(view2, z);
        return super.mo31439a(view, view2, z, z2);
    }

    /* renamed from: a */
    private void m27965a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.f28380g = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof C0489d) && (((C0489d) childAt.getLayoutParams()).mo2901d() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f28380g;
                        if (map != null && map.containsKey(childAt)) {
                            ViewCompat.m2852g(childAt, ((Integer) this.f28380g.get(childAt)).intValue());
                        }
                    } else {
                        if (VERSION.SDK_INT >= 16) {
                            this.f28380g.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        ViewCompat.m2852g(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f28380g = null;
            }
        }
    }
}
