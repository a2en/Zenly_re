package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0481f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MotionHelper extends ConstraintHelper implements Animatable {

    /* renamed from: m */
    private boolean f1397m;

    /* renamed from: n */
    private boolean f1398n;

    /* renamed from: o */
    private float f1399o;

    /* renamed from: p */
    protected View[] f1400p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2244a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0481f.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.MotionHelper_onShow) {
                    this.f1397m = obtainStyledAttributes.getBoolean(index, this.f1397m);
                } else if (index == C0481f.MotionHelper_onHide) {
                    this.f1398n = obtainStyledAttributes.getBoolean(index, this.f1398n);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2245a(View view, float f) {
    }

    /* renamed from: b */
    public boolean mo2246b() {
        return this.f1398n;
    }

    /* renamed from: c */
    public boolean mo2247c() {
        return this.f1397m;
    }

    public float getProgress() {
        return this.f1399o;
    }

    public void setProgress(float f) {
        this.f1399o = f;
        int i = 0;
        if (this.f2072f > 0) {
            this.f1400p = mo2693a((ConstraintLayout) getParent());
            while (i < this.f2072f) {
                mo2245a(this.f1400p[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                mo2245a(childAt, f);
            }
            i++;
        }
    }
}
