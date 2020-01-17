package app.zenly.locator.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;

public class MinimumRatioFrameLayout extends FrameLayout {

    /* renamed from: e */
    private final float f9076e;

    public MinimumRatioFrameLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        float f = (float) measuredWidth;
        float measuredHeight = f / ((float) getMeasuredHeight());
        float f2 = this.f9076e;
        if (measuredHeight < f2) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec((int) (f / f2), 1073741824));
        }
    }

    public MinimumRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.minimumRatioFrameLayoutStyle);
    }

    public MinimumRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.MinimumRatioFrameLayout, i, 0);
        this.f9076e = obtainStyledAttributes.getFloat(0, 1.0f);
        obtainStyledAttributes.recycle();
    }
}
