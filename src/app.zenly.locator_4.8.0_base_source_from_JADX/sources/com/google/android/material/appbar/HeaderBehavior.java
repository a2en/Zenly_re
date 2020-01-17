package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: a */
    private Runnable f27867a;

    /* renamed from: b */
    OverScroller f27868b;

    /* renamed from: c */
    private boolean f27869c;

    /* renamed from: d */
    private int f27870d = -1;

    /* renamed from: e */
    private int f27871e;

    /* renamed from: f */
    private int f27872f = -1;

    /* renamed from: g */
    private VelocityTracker f27873g;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    private class C10728a implements Runnable {

        /* renamed from: e */
        private final CoordinatorLayout f27874e;

        /* renamed from: f */
        private final V f27875f;

        C10728a(CoordinatorLayout coordinatorLayout, V v) {
            this.f27874e = coordinatorLayout;
            this.f27875f = v;
        }

        public void run() {
            if (this.f27875f != null) {
                OverScroller overScroller = HeaderBehavior.this.f27868b;
                if (overScroller == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.mo30612a(this.f27874e, this.f27875f, headerBehavior.f27868b.getCurrY());
                    ViewCompat.m2826a((View) this.f27875f, (Runnable) this);
                    return;
                }
                HeaderBehavior.this.mo30583a(this.f27874e, this.f27875f);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* renamed from: b */
    private void m27334b() {
        if (this.f27873g == null) {
            this.f27873g = VelocityTracker.obtain();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract int mo30581a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo30612a(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo30595b(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo30583a(CoordinatorLayout coordinatorLayout, V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo30589a(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo30594b(V v);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo30595b(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract int mo30598c(V v);

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != 3) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
        /*
            r4 = this;
            int r0 = r4.f27872f
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.f27872f = r0
        L_0x0012:
            int r0 = r7.getAction()
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x001f
            boolean r0 = r4.f27869c
            if (r0 == 0) goto L_0x001f
            return r2
        L_0x001f:
            int r0 = r7.getActionMasked()
            r3 = 0
            if (r0 == 0) goto L_0x0060
            r5 = -1
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x002f
            r6 = 3
            if (r0 == r6) goto L_0x0051
            goto L_0x0083
        L_0x002f:
            int r6 = r4.f27870d
            if (r6 != r5) goto L_0x0034
            goto L_0x0083
        L_0x0034:
            int r6 = r7.findPointerIndex(r6)
            if (r6 != r5) goto L_0x003b
            goto L_0x0083
        L_0x003b:
            float r5 = r7.getY(r6)
            int r5 = (int) r5
            int r6 = r4.f27871e
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            int r0 = r4.f27872f
            if (r6 <= r0) goto L_0x0083
            r4.f27869c = r2
            r4.f27871e = r5
            goto L_0x0083
        L_0x0051:
            r4.f27869c = r3
            r4.f27870d = r5
            android.view.VelocityTracker r5 = r4.f27873g
            if (r5 == 0) goto L_0x0083
            r5.recycle()
            r5 = 0
            r4.f27873g = r5
            goto L_0x0083
        L_0x0060:
            r4.f27869c = r3
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r2 = r4.mo30589a(r6)
            if (r2 == 0) goto L_0x0083
            boolean r5 = r5.mo2815a(r6, r0, r1)
            if (r5 == 0) goto L_0x0083
            r4.f27871e = r1
            int r5 = r7.getPointerId(r3)
            r4.f27870d = r5
            r4.m27334b()
        L_0x0083:
            android.view.VelocityTracker r5 = r4.f27873g
            if (r5 == 0) goto L_0x008a
            r5.addMovement(r7)
        L_0x008a:
            boolean r5 = r4.f27869c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 != 3) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r11.f27872f
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r12.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r11.f27872f = r0
        L_0x0012:
            int r0 = r14.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008d
            r3 = -1
            if (r0 == r1) goto L_0x005c
            r4 = 2
            if (r0 == r4) goto L_0x0025
            r12 = 3
            if (r0 == r12) goto L_0x007e
            goto L_0x00ae
        L_0x0025:
            int r0 = r11.f27870d
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r3) goto L_0x002e
            return r2
        L_0x002e:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r2 = r11.f27871e
            int r2 = r2 - r0
            boolean r3 = r11.f27869c
            if (r3 != 0) goto L_0x0049
            int r3 = java.lang.Math.abs(r2)
            int r4 = r11.f27872f
            if (r3 <= r4) goto L_0x0049
            r11.f27869c = r1
            if (r2 <= 0) goto L_0x0048
            int r2 = r2 - r4
            goto L_0x0049
        L_0x0048:
            int r2 = r2 + r4
        L_0x0049:
            r6 = r2
            boolean r2 = r11.f27869c
            if (r2 == 0) goto L_0x00ae
            r11.f27871e = r0
            int r7 = r11.mo30594b(r13)
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r3.mo30613a(r4, (V) r5, r6, r7, r8)
            goto L_0x00ae
        L_0x005c:
            android.view.VelocityTracker r0 = r11.f27873g
            if (r0 == 0) goto L_0x007e
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f27873g
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f27873g
            int r4 = r11.f27870d
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo30598c(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo30614a(r6, (V) r7, r8, r9, r10)
        L_0x007e:
            r11.f27869c = r2
            r11.f27870d = r3
            android.view.VelocityTracker r12 = r11.f27873g
            if (r12 == 0) goto L_0x00ae
            r12.recycle()
            r12 = 0
            r11.f27873g = r12
            goto L_0x00ae
        L_0x008d:
            float r0 = r14.getX()
            int r0 = (int) r0
            float r3 = r14.getY()
            int r3 = (int) r3
            boolean r12 = r12.mo2815a(r13, r0, r3)
            if (r12 == 0) goto L_0x00b6
            boolean r12 = r11.mo30589a(r13)
            if (r12 == 0) goto L_0x00b6
            r11.f27871e = r3
            int r12 = r14.getPointerId(r2)
            r11.f27870d = r12
            r11.m27334b()
        L_0x00ae:
            android.view.VelocityTracker r12 = r11.f27873g
            if (r12 == 0) goto L_0x00b5
            r12.addMovement(r14)
        L_0x00b5:
            return r1
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo30613a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo30595b(coordinatorLayout, v, mo30581a() - i, i2, i3);
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo30614a(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f27867a;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f27867a = null;
        }
        if (this.f27868b == null) {
            this.f27868b = new OverScroller(v.getContext());
        }
        this.f27868b.fling(0, getTopAndBottomOffset(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f27868b.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            this.f27867a = new C10728a(coordinatorLayout, v);
            ViewCompat.m2826a((View) v, this.f27867a);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo30583a(coordinatorLayout, v);
        return false;
    }
}
