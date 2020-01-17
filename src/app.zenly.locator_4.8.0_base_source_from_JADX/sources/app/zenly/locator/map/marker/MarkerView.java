package app.zenly.locator.map.marker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper;
import app.zenly.android.base.view.ViewVisibilityAggregatedHelper.Callback;

public abstract class MarkerView extends FrameLayout implements Callback {

    /* renamed from: g */
    private static final float f11060g = (1.0f / (Resources.getSystem().getDisplayMetrics().density * 72.0f));

    /* renamed from: e */
    private ViewVisibilityAggregatedHelper f11061e;

    /* renamed from: f */
    private boolean f11062f;

    public MarkerView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo10879a(float[] fArr) {
        fArr[0] = ((float) (getLeft() + getRight())) / 2.0f;
        fArr[1] = ((float) (getTop() + getBottom())) / 2.0f;
        getMatrix().mapPoints(fArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo10831b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo10834c();

    public View getMarkerShape() {
        return this;
    }

    public float getSignificantAreaRadius() {
        return Math.max((((float) getWidth()) / 2.0f) * getScaleX(), (((float) getHeight()) / 2.0f) * getScaleY());
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public boolean isLaidOut() {
        return this.f11062f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11061e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6427b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11061e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6428c();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f11062f = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(mo11150a(i), mo11150a(i2));
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11061e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6425a(z);
        }
    }

    public void onVisibilityAggregatedChanged(boolean z) {
        if (z) {
            mo10831b();
        } else {
            mo10834c();
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11061e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6424a(view, i);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11061e;
        if (viewVisibilityAggregatedHelper != null) {
            viewVisibilityAggregatedHelper.mo6423a(i);
        }
    }

    public void setScale(float f) {
        if (Math.abs(f - getScaleX()) > f11060g) {
            setScaleX(f);
        }
        if (Math.abs(f - getScaleY()) > f11060g) {
            setScaleY(f);
        }
    }

    public MarkerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MarkerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11061e = new ViewVisibilityAggregatedHelper(this);
    }

    /* renamed from: a */
    public void mo10978a(Rect rect) {
        View markerShape = getMarkerShape();
        rect.left = 0;
        rect.top = 0;
        View view = markerShape;
        while (view != this) {
            View view2 = (View) view.getParent();
            rect.left = (int) (((float) rect.left) + view.getX() + ((float) view2.getPaddingLeft()));
            rect.top = (int) (((float) rect.top) + view.getY() + ((float) view2.getPaddingTop()));
            view = view2;
        }
        rect.right = rect.left + markerShape.getWidth();
        rect.bottom = rect.top + markerShape.getHeight();
    }

    /* renamed from: a */
    public boolean mo10979a() {
        ViewVisibilityAggregatedHelper viewVisibilityAggregatedHelper = this.f11061e;
        return viewVisibilityAggregatedHelper != null && viewVisibilityAggregatedHelper.mo6426a();
    }

    /* renamed from: a */
    private int mo11150a(int i) {
        return MeasureSpec.getMode(i) == Integer.MIN_VALUE ? MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i), 0) : i;
    }
}
