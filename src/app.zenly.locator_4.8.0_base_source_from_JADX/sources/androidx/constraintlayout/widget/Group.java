package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2244a(AttributeSet attributeSet) {
        super.mo2244a(attributeSet);
        this.f2075i = false;
    }

    /* renamed from: b */
    public void mo2694b(ConstraintLayout constraintLayout) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.f2151m0.mo2611u(0);
        layoutParams.f2151m0.mo2594m(0);
    }

    /* renamed from: d */
    public void mo2696d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f2072f; i++) {
            View a = constraintLayout.mo2701a(this.f2071e[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && VERSION.SDK_INT >= 21) {
                    a.setElevation(elevation);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
