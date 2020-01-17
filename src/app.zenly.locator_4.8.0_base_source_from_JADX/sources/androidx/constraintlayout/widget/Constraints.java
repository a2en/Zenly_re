package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class Constraints extends ViewGroup {

    /* renamed from: e */
    C0473c f2170e;

    public static class LayoutParams extends androidx.constraintlayout.widget.ConstraintLayout.LayoutParams {

        /* renamed from: A0 */
        public float f2171A0;

        /* renamed from: o0 */
        public float f2172o0;

        /* renamed from: p0 */
        public boolean f2173p0;

        /* renamed from: q0 */
        public float f2174q0;

        /* renamed from: r0 */
        public float f2175r0;

        /* renamed from: s0 */
        public float f2176s0;

        /* renamed from: t0 */
        public float f2177t0;

        /* renamed from: u0 */
        public float f2178u0;

        /* renamed from: v0 */
        public float f2179v0;

        /* renamed from: w0 */
        public float f2180w0;

        /* renamed from: x0 */
        public float f2181x0;

        /* renamed from: y0 */
        public float f2182y0;

        /* renamed from: z0 */
        public float f2183z0;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2172o0 = 1.0f;
            this.f2173p0 = false;
            this.f2174q0 = 0.0f;
            this.f2175r0 = 0.0f;
            this.f2176s0 = 0.0f;
            this.f2177t0 = 0.0f;
            this.f2178u0 = 1.0f;
            this.f2179v0 = 1.0f;
            this.f2180w0 = 0.0f;
            this.f2181x0 = 0.0f;
            this.f2182y0 = 0.0f;
            this.f2183z0 = 0.0f;
            this.f2171A0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2172o0 = 1.0f;
            this.f2173p0 = false;
            this.f2174q0 = 0.0f;
            this.f2175r0 = 0.0f;
            this.f2176s0 = 0.0f;
            this.f2177t0 = 0.0f;
            this.f2178u0 = 1.0f;
            this.f2179v0 = 1.0f;
            this.f2180w0 = 0.0f;
            this.f2181x0 = 0.0f;
            this.f2182y0 = 0.0f;
            this.f2183z0 = 0.0f;
            this.f2171A0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.ConstraintSet_android_alpha) {
                    this.f2172o0 = obtainStyledAttributes.getFloat(index, this.f2172o0);
                } else if (index == C0481f.ConstraintSet_android_elevation) {
                    if (VERSION.SDK_INT >= 21) {
                        this.f2174q0 = obtainStyledAttributes.getFloat(index, this.f2174q0);
                        this.f2173p0 = true;
                    }
                } else if (index == C0481f.ConstraintSet_android_rotationX) {
                    this.f2176s0 = obtainStyledAttributes.getFloat(index, this.f2176s0);
                } else if (index == C0481f.ConstraintSet_android_rotationY) {
                    this.f2177t0 = obtainStyledAttributes.getFloat(index, this.f2177t0);
                } else if (index == C0481f.ConstraintSet_android_rotation) {
                    this.f2175r0 = obtainStyledAttributes.getFloat(index, this.f2175r0);
                } else if (index == C0481f.ConstraintSet_android_scaleX) {
                    this.f2178u0 = obtainStyledAttributes.getFloat(index, this.f2178u0);
                } else if (index == C0481f.ConstraintSet_android_scaleY) {
                    this.f2179v0 = obtainStyledAttributes.getFloat(index, this.f2179v0);
                } else if (index == C0481f.ConstraintSet_android_transformPivotX) {
                    this.f2180w0 = obtainStyledAttributes.getFloat(index, this.f2180w0);
                } else if (index == C0481f.ConstraintSet_android_transformPivotY) {
                    this.f2181x0 = obtainStyledAttributes.getFloat(index, this.f2181x0);
                } else if (index == C0481f.ConstraintSet_android_translationX) {
                    this.f2182y0 = obtainStyledAttributes.getFloat(index, this.f2182y0);
                } else if (index == C0481f.ConstraintSet_android_translationY) {
                    this.f2183z0 = obtainStyledAttributes.getFloat(index, this.f2183z0);
                } else if (index == C0481f.ConstraintSet_android_translationZ && VERSION.SDK_INT >= 21) {
                    this.f2171A0 = obtainStyledAttributes.getFloat(index, this.f2171A0);
                }
            }
        }
    }

    public C0473c getConstraintSet() {
        if (this.f2170e == null) {
            this.f2170e = new C0473c();
        }
        this.f2170e.mo2772a(this);
        return this.f2170e;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(layoutParams);
    }
}
