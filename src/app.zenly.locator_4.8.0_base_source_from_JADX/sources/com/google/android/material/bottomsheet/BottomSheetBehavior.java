package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.C0695b;
import androidx.customview.widget.C0695b.C0698c;
import com.android.volley.toolbox.C8733j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p214e.p234h.p238g.C7631a;
import p333g.p357d.p358a.p361b.C12069d;
import p333g.p357d.p358a.p361b.C12076k;

public class BottomSheetBehavior<V extends View> extends Behavior<V> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f27925a = true;

    /* renamed from: b */
    private float f27926b;

    /* renamed from: c */
    private int f27927c;

    /* renamed from: d */
    private boolean f27928d;

    /* renamed from: e */
    private int f27929e;

    /* renamed from: f */
    private int f27930f;

    /* renamed from: g */
    int f27931g;

    /* renamed from: h */
    int f27932h;

    /* renamed from: i */
    int f27933i;

    /* renamed from: j */
    boolean f27934j;

    /* renamed from: k */
    private boolean f27935k;

    /* renamed from: l */
    int f27936l = 4;

    /* renamed from: m */
    C0695b f27937m;

    /* renamed from: n */
    private boolean f27938n;

    /* renamed from: o */
    private int f27939o;

    /* renamed from: p */
    private boolean f27940p;

    /* renamed from: q */
    int f27941q;

    /* renamed from: r */
    WeakReference<V> f27942r;

    /* renamed from: s */
    WeakReference<View> f27943s;

    /* renamed from: t */
    private C10744c f27944t;

    /* renamed from: u */
    private VelocityTracker f27945u;

    /* renamed from: v */
    int f27946v;

    /* renamed from: w */
    private int f27947w;

    /* renamed from: x */
    boolean f27948x;

    /* renamed from: y */
    private Map<View, Integer> f27949y;

    /* renamed from: z */
    private final C0698c f27950z = new C10743b();

    protected static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C10741a();

        /* renamed from: g */
        final int f27951g;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        static class C10741a implements ClassLoaderCreator<SavedState> {
            C10741a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27951g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f27951g);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f27951g = i;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    class C10742a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f27952e;

        /* renamed from: f */
        final /* synthetic */ int f27953f;

        C10742a(View view, int i) {
            this.f27952e = view;
            this.f27953f = i;
        }

        public void run() {
            BottomSheetBehavior.this.mo30683a(this.f27952e, this.f27953f);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    class C10743b extends C0698c {
        C10743b() {
        }

        /* renamed from: a */
        public void mo3598a(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.mo30682a(i2);
        }

        /* renamed from: b */
        public boolean mo3603b(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f27936l;
            boolean z = true;
            if (i2 == 1 || bottomSheetBehavior.f27948x) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f27946v == i) {
                View view2 = (View) bottomSheetBehavior.f27943s.get();
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference = BottomSheetBehavior.this.f27942r;
            if (weakReference == null || weakReference.get() != view) {
                z = false;
            }
            return z;
        }

        /* renamed from: c */
        public void mo3604c(int i) {
            if (i == 1) {
                BottomSheetBehavior.this.mo30692d(1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3596a(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
                r2 = 4
                r3 = 6
                r4 = 3
                int r5 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r5 >= 0) goto L_0x0028
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f27925a
                if (r9 == 0) goto L_0x0018
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f27931g
            L_0x0015:
                r2 = 3
                goto L_0x00c7
            L_0x0018:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f27932h
                if (r9 <= r10) goto L_0x0026
                r9 = r10
            L_0x0023:
                r2 = 6
                goto L_0x00c7
            L_0x0026:
                r9 = 0
                goto L_0x0015
            L_0x0028:
                com.google.android.material.bottomsheet.BottomSheetBehavior r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r5.f27934j
                if (r6 == 0) goto L_0x0051
                boolean r5 = r5.mo30685a(r8, r10)
                if (r5 == 0) goto L_0x0051
                int r5 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r6.f27933i
                if (r5 > r6) goto L_0x004a
                float r5 = java.lang.Math.abs(r9)
                float r6 = java.lang.Math.abs(r10)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x0051
            L_0x004a:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f27941q
                r2 = 5
                goto L_0x00c7
            L_0x0051:
                int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x0067
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0062
                goto L_0x0067
            L_0x0062:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r9 = r9.f27933i
                goto L_0x00c7
            L_0x0067:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r10 = r10.f27925a
                if (r10 == 0) goto L_0x0094
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.f27931g
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f27933i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x008e
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f27931g
                r9 = r0
                goto L_0x0015
            L_0x008e:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f27933i
            L_0x0092:
                r9 = r0
                goto L_0x00c7
            L_0x0094:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r10.f27932h
                if (r9 >= r1) goto L_0x00aa
                int r10 = r10.f27933i
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00a5
                goto L_0x0026
            L_0x00a5:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f27932h
                goto L_0x00bf
            L_0x00aa:
                int r10 = r9 - r1
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.f27933i
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x00c2
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f27932h
            L_0x00bf:
                r9 = r0
                goto L_0x0023
            L_0x00c2:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r9.f27933i
                goto L_0x0092
            L_0x00c7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                androidx.customview.widget.b r10 = r10.f27937m
                int r0 = r8.getLeft()
                boolean r9 = r10.mo3589c(r0, r9)
                if (r9 == 0) goto L_0x00e6
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r10 = 2
                r9.mo30692d(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior$d r9 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r9.<init>(r8, r2)
                androidx.core.view.ViewCompat.m2826a(r8, r9)
                goto L_0x00eb
            L_0x00e6:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                r8.mo30692d(r2)
            L_0x00eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C10743b.mo3596a(android.view.View, float, float):void");
        }

        /* renamed from: b */
        public int mo3600b(View view, int i, int i2) {
            int b = BottomSheetBehavior.this.m27419f();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C7631a.m18585a(i, b, bottomSheetBehavior.f27934j ? bottomSheetBehavior.f27941q : bottomSheetBehavior.f27933i);
        }

        /* renamed from: b */
        public int mo3599b(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f27934j) {
                return bottomSheetBehavior.f27941q;
            }
            return bottomSheetBehavior.f27933i;
        }

        /* renamed from: a */
        public int mo3594a(View view, int i, int i2) {
            return view.getLeft();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public static abstract class C10744c {
        /* renamed from: a */
        public abstract void mo7858a(View view, float f);

        /* renamed from: a */
        public abstract void mo7859a(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    private class C10745d implements Runnable {

        /* renamed from: e */
        private final View f27956e;

        /* renamed from: f */
        private final int f27957f;

        C10745d(View view, int i) {
            this.f27956e = view;
            this.f27957f = i;
        }

        public void run() {
            C0695b bVar = BottomSheetBehavior.this.f27937m;
            if (bVar == null || !bVar.mo3582a(true)) {
                BottomSheetBehavior.this.mo30692d(this.f27957f);
            } else {
                ViewCompat.m2826a(this.f27956e, (Runnable) this);
            }
        }
    }

    public BottomSheetBehavior() {
    }

    /* renamed from: e */
    private void mo14020e() {
        if (this.f27925a) {
            this.f27933i = Math.max(this.f27941q - this.f27930f, this.f27931g);
        } else {
            this.f27933i = this.f27941q - this.f27930f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public int m27419f() {
        if (this.f27925a) {
            return this.f27931g;
        }
        return 0;
    }

    /* renamed from: g */
    private float m27420g() {
        VelocityTracker velocityTracker = this.f27945u;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, this.f27926b);
        return this.f27945u.getYVelocity(this.f27946v);
    }

    /* renamed from: h */
    private void m27421h() {
        this.f27946v = -1;
        VelocityTracker velocityTracker = this.f27945u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f27945u = null;
        }
    }

    /* renamed from: c */
    public void mo30691c(boolean z) {
        this.f27935k = z;
    }

    /* renamed from: d */
    public boolean mo30693d() {
        return this.f27934j;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = false;
        if (!v.isShown()) {
            this.f27938n = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m27421h();
        }
        if (this.f27945u == null) {
            this.f27945u = VelocityTracker.obtain();
        }
        this.f27945u.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.f27947w = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f27943s;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && coordinatorLayout.mo2815a(view2, x, this.f27947w)) {
                this.f27946v = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f27948x = true;
            }
            this.f27938n = this.f27946v == -1 && !coordinatorLayout.mo2815a((View) v, x, this.f27947w);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f27948x = false;
            this.f27946v = -1;
            if (this.f27938n) {
                this.f27938n = false;
                return false;
            }
        }
        if (!this.f27938n) {
            C0695b bVar = this.f27937m;
            if (bVar != null && bVar.mo3586b(motionEvent)) {
                return true;
            }
        }
        WeakReference<View> weakReference2 = this.f27943s;
        if (weakReference2 != null) {
            view = (View) weakReference2.get();
        }
        if (actionMasked == 2 && view != null && !this.f27938n && this.f27936l != 1 && !coordinatorLayout.mo2815a(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.f27937m != null && Math.abs(((float) this.f27947w) - motionEvent.getY()) > ((float) this.f27937m.mo3583b())) {
            z = true;
        }
        return z;
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        if (ViewCompat.m2859l(coordinatorLayout) && !ViewCompat.m2859l(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        coordinatorLayout.mo2818b((View) v, i);
        this.f27941q = coordinatorLayout.getHeight();
        if (this.f27928d) {
            if (this.f27929e == 0) {
                this.f27929e = coordinatorLayout.getResources().getDimensionPixelSize(C12069d.design_bottom_sheet_peek_height_min);
            }
            this.f27930f = Math.max(this.f27929e, this.f27941q - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f27930f = this.f27927c;
        }
        this.f27931g = Math.max(0, this.f27941q - v.getHeight());
        this.f27932h = this.f27941q / 2;
        mo14020e();
        int i2 = this.f27936l;
        if (i2 == 3) {
            ViewCompat.m2848e(v, m27419f());
        } else if (i2 == 6) {
            ViewCompat.m2848e(v, this.f27932h);
        } else if (!this.f27934j || i2 != 5) {
            int i3 = this.f27936l;
            if (i3 == 4) {
                ViewCompat.m2848e(v, this.f27933i);
            } else if (i3 == 1 || i3 == 2) {
                ViewCompat.m2848e(v, top - v.getTop());
            }
        } else {
            ViewCompat.m2848e(v, this.f27941q);
        }
        if (this.f27937m == null) {
            this.f27937m = C0695b.m3271a((ViewGroup) coordinatorLayout, this.f27950z);
        }
        this.f27942r = new WeakReference<>(v);
        this.f27943s = new WeakReference<>(mo30681a((View) v));
        return true;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return view == this.f27943s.get() && (this.f27936l != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2));
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1 && view == ((View) this.f27943s.get())) {
            int top = v.getTop();
            int i4 = top - i2;
            if (i2 > 0) {
                if (i4 < m27419f()) {
                    iArr[1] = top - m27419f();
                    ViewCompat.m2848e(v, -iArr[1]);
                    mo30692d(3);
                } else {
                    iArr[1] = i2;
                    ViewCompat.m2848e(v, -i2);
                    mo30692d(1);
                }
            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                int i5 = this.f27933i;
                if (i4 <= i5 || this.f27934j) {
                    iArr[1] = i2;
                    ViewCompat.m2848e(v, -i2);
                    mo30692d(1);
                } else {
                    iArr[1] = top - i5;
                    ViewCompat.m2848e(v, -iArr[1]);
                    mo30692d(4);
                }
            }
            mo30682a(v.getTop());
            this.f27939o = i2;
            this.f27940p = true;
        }
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.mo3548a());
        int i = savedState.f27951g;
        if (i == 1 || i == 2) {
            this.f27936l = 4;
        } else {
            this.f27936l = i;
        }
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), this.f27936l);
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f27939o = 0;
        this.f27940p = false;
        if ((i & 2) != 0) {
            return true;
        }
        return false;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        int i4 = 3;
        if (v.getTop() == m27419f()) {
            mo30692d(3);
            return;
        }
        if (view == this.f27943s.get() && this.f27940p) {
            if (this.f27939o > 0) {
                i2 = m27419f();
            } else if (!this.f27934j || !mo30685a((View) v, m27420g())) {
                if (this.f27939o == 0) {
                    int top = v.getTop();
                    if (!this.f27925a) {
                        int i5 = this.f27932h;
                        if (top < i5) {
                            if (top < Math.abs(top - this.f27933i)) {
                                i2 = 0;
                            } else {
                                i2 = this.f27932h;
                            }
                        } else if (Math.abs(top - i5) < Math.abs(top - this.f27933i)) {
                            i2 = this.f27932h;
                        } else {
                            i3 = this.f27933i;
                        }
                        i4 = 6;
                    } else if (Math.abs(top - this.f27931g) < Math.abs(top - this.f27933i)) {
                        i2 = this.f27931g;
                    } else {
                        i3 = this.f27933i;
                    }
                } else {
                    i3 = this.f27933i;
                }
                i4 = 4;
            } else {
                i2 = this.f27941q;
                i4 = 5;
            }
            if (this.f27937m.mo3588b((View) v, v.getLeft(), i2)) {
                mo30692d(2);
                ViewCompat.m2826a((View) v, (Runnable) new C10745d(v, i4));
            } else {
                mo30692d(i4);
            }
            this.f27940p = false;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f27936l == 1 && actionMasked == 0) {
            return true;
        }
        C0695b bVar = this.f27937m;
        if (bVar != null) {
            bVar.mo3578a(motionEvent);
        }
        if (actionMasked == 0) {
            m27421h();
        }
        if (this.f27945u == null) {
            this.f27945u = VelocityTracker.obtain();
        }
        this.f27945u.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f27938n && Math.abs(((float) this.f27947w) - motionEvent.getY()) > ((float) this.f27937m.mo3583b())) {
            this.f27937m.mo3579a((View) v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f27938n;
    }

    /* renamed from: a */
    public void mo30684a(boolean z) {
        if (this.f27925a != z) {
            this.f27925a = z;
            if (this.f27942r != null) {
                mo14020e();
            }
            mo30692d((!this.f27925a || this.f27936l != 6) ? this.f27936l : 3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30686b(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.f27928d
            if (r4 != 0) goto L_0x0015
            r3.f27928d = r0
            goto L_0x0024
        L_0x000c:
            boolean r2 = r3.f27928d
            if (r2 != 0) goto L_0x0017
            int r2 = r3.f27927c
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0024
        L_0x0017:
            r3.f27928d = r1
            int r1 = java.lang.Math.max(r1, r4)
            r3.f27927c = r1
            int r1 = r3.f27941q
            int r1 = r1 - r4
            r3.f27933i = r1
        L_0x0024:
            if (r0 == 0) goto L_0x003a
            int r4 = r3.f27936l
            r0 = 4
            if (r4 != r0) goto L_0x003a
            java.lang.ref.WeakReference<V> r4 = r3.f27942r
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x003a
            r4.requestLayout()
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo30686b(int):void");
    }

    /* renamed from: c */
    public final void mo30690c(int i) {
        if (i != this.f27936l) {
            WeakReference<V> weakReference = this.f27942r;
            if (weakReference == null) {
                if (i == 4 || i == 3 || i == 6 || (this.f27934j && i == 5)) {
                    this.f27936l = i;
                }
                return;
            }
            View view = (View) weakReference.get();
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent == null || !parent.isLayoutRequested() || !ViewCompat.m2802B(view)) {
                    mo30683a(view, i);
                } else {
                    view.post(new C10742a(view, i));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo30692d(int i) {
        if (this.f27936l != i) {
            this.f27936l = i;
            if (i == 6 || i == 3) {
                m27417d(true);
            } else if (i == 5 || i == 4) {
                m27417d(false);
            }
            View view = (View) this.f27942r.get();
            if (view != null) {
                C10744c cVar = this.f27944t;
                if (cVar != null) {
                    cVar.mo7859a(view, i);
                }
            }
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12076k.BottomSheetBehavior_Layout);
        TypedValue peekValue = obtainStyledAttributes.peekValue(C12076k.BottomSheetBehavior_Layout_behavior_peekHeight);
        if (peekValue != null) {
            int i = peekValue.data;
            if (i == -1) {
                mo30686b(i);
                mo30687b(obtainStyledAttributes.getBoolean(C12076k.BottomSheetBehavior_Layout_behavior_hideable, false));
                mo30684a(obtainStyledAttributes.getBoolean(C12076k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
                mo30691c(obtainStyledAttributes.getBoolean(C12076k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
                obtainStyledAttributes.recycle();
                this.f27926b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            }
        }
        mo30686b(obtainStyledAttributes.getDimensionPixelSize(C12076k.BottomSheetBehavior_Layout_behavior_peekHeight, -1));
        mo30687b(obtainStyledAttributes.getBoolean(C12076k.BottomSheetBehavior_Layout_behavior_hideable, false));
        mo30684a(obtainStyledAttributes.getBoolean(C12076k.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        mo30691c(obtainStyledAttributes.getBoolean(C12076k.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        obtainStyledAttributes.recycle();
        this.f27926b = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* renamed from: a */
    public final int mo30680a() {
        if (this.f27928d) {
            return -1;
        }
        return this.f27927c;
    }

    /* renamed from: a */
    public void mo14019a(C10744c cVar) {
        this.f27944t = cVar;
    }

    /* renamed from: d */
    private void m27417d(boolean z) {
        WeakReference<V> weakReference = this.f27942r;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (VERSION.SDK_INT >= 16 && z) {
                    if (this.f27949y == null) {
                        this.f27949y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.f27942r.get()) {
                        if (!z) {
                            Map<View, Integer> map = this.f27949y;
                            if (map != null && map.containsKey(childAt)) {
                                ViewCompat.m2852g(childAt, ((Integer) this.f27949y.get(childAt)).intValue());
                            }
                        } else {
                            if (VERSION.SDK_INT >= 16) {
                                this.f27949y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            }
                            ViewCompat.m2852g(childAt, 4);
                        }
                    }
                }
                if (!z) {
                    this.f27949y = null;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo30685a(View view, float f) {
        boolean z = true;
        if (this.f27935k) {
            return true;
        }
        if (view.getTop() < this.f27933i) {
            return false;
        }
        if (Math.abs((((float) view.getTop()) + (f * 0.1f)) - ((float) this.f27933i)) / ((float) this.f27927c) <= 0.5f) {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public void mo30687b(boolean z) {
        this.f27934j = z;
    }

    /* renamed from: c */
    public final int mo30689c() {
        return this.f27936l;
    }

    /* renamed from: b */
    public boolean mo30688b() {
        return this.f27935k;
    }

    /* renamed from: b */
    public static <V extends View> BottomSheetBehavior<V> m27416b(V v) {
        LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C0489d) {
            Behavior d = ((C0489d) layoutParams).mo2901d();
            if (d instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) d;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo30681a(View view) {
        if (ViewCompat.m2805E(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View a = mo30681a(viewGroup.getChildAt(i));
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30683a(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.f27933i;
        } else if (i == 6) {
            int i3 = this.f27932h;
            if (this.f27925a) {
                int i4 = this.f27931g;
                if (i3 <= i4) {
                    i2 = i4;
                    i = 3;
                }
            }
            i2 = i3;
        } else if (i == 3) {
            i2 = m27419f();
        } else if (!this.f27934j || i != 5) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal state argument: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else {
            i2 = this.f27941q;
        }
        if (this.f27937m.mo3588b(view, view.getLeft(), i2)) {
            mo30692d(2);
            ViewCompat.m2826a(view, (Runnable) new C10745d(view, i));
            return;
        }
        mo30692d(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo30682a(int i) {
        View view = (View) this.f27942r.get();
        if (view != null) {
            C10744c cVar = this.f27944t;
            if (cVar != null) {
                int i2 = this.f27933i;
                if (i > i2) {
                    cVar.mo7858a(view, ((float) (i2 - i)) / ((float) (this.f27941q - i2)));
                } else {
                    cVar.mo7858a(view, ((float) (i2 - i)) / ((float) (i2 - m27419f())));
                }
            }
        }
    }
}
