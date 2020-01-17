package com.wonderkiln.camerakit;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class SurfaceViewContainer extends FrameLayout {

    /* renamed from: e */
    private C11991r f31166e;

    /* renamed from: com.wonderkiln.camerakit.SurfaceViewContainer$a */
    class C11956a implements Runnable {
        C11956a() {
        }

        public void run() {
            SurfaceViewContainer surfaceViewContainer = SurfaceViewContainer.this;
            surfaceViewContainer.m31465a(surfaceViewContainer.getWidth(), SurfaceViewContainer.this.getHeight());
        }
    }

    public SurfaceViewContainer(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (z && getChildCount() > 0) {
            m31465a(i3 - i, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(FrameLayout.resolveSize(getSuggestedMinimumWidth(), i), FrameLayout.resolveSize(getSuggestedMinimumHeight(), i2));
    }

    public void setPreviewSize(C11991r rVar) {
        this.f31166e = rVar;
        if (getChildCount() > 0) {
            post(new C11956a());
        }
    }

    public SurfaceViewContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31465a(int i, int i2) {
        int i3;
        int i4;
        View childAt = getChildAt(0);
        C11991r rVar = this.f31166e;
        if (rVar != null) {
            i4 = rVar.mo35600b();
            i3 = this.f31166e.mo35598a();
        } else {
            i4 = i;
            i3 = i2;
        }
        int i5 = i * i3;
        int i6 = i2 * i4;
        if (i5 > i6) {
            int i7 = i5 / i4;
            childAt.layout(0, (i2 - i7) / 2, i, (i2 + i7) / 2);
            return;
        }
        int i8 = i6 / i3;
        childAt.layout((i - i8) / 2, 0, (i + i8) / 2, i2);
    }

    public SurfaceViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
