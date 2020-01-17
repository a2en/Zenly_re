package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C0615a;
import androidx.core.view.C0645g;
import androidx.core.view.C0646h;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0628c;
import androidx.core.view.accessibility.C0635e;
import com.android.volley.toolbox.C8733j;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {

    /* renamed from: E */
    private static final C0670a f2845E = new C0670a();

    /* renamed from: F */
    private static final int[] f2846F = {16843130};

    /* renamed from: A */
    private final C0646h f2847A;

    /* renamed from: B */
    private final C0645g f2848B;

    /* renamed from: C */
    private float f2849C;

    /* renamed from: D */
    private OnScrollChangeListener f2850D;

    /* renamed from: e */
    private long f2851e;

    /* renamed from: f */
    private final Rect f2852f;

    /* renamed from: g */
    private OverScroller f2853g;

    /* renamed from: h */
    private EdgeEffect f2854h;

    /* renamed from: i */
    private EdgeEffect f2855i;

    /* renamed from: j */
    private int f2856j;

    /* renamed from: k */
    private boolean f2857k;

    /* renamed from: l */
    private boolean f2858l;

    /* renamed from: m */
    private View f2859m;

    /* renamed from: n */
    private boolean f2860n;

    /* renamed from: o */
    private VelocityTracker f2861o;

    /* renamed from: p */
    private boolean f2862p;

    /* renamed from: q */
    private boolean f2863q;

    /* renamed from: r */
    private int f2864r;

    /* renamed from: s */
    private int f2865s;

    /* renamed from: t */
    private int f2866t;

    /* renamed from: u */
    private int f2867u;

    /* renamed from: v */
    private final int[] f2868v;

    /* renamed from: w */
    private final int[] f2869w;

    /* renamed from: x */
    private int f2870x;

    /* renamed from: y */
    private int f2871y;

    /* renamed from: z */
    private SavedState f2872z;

    public interface OnScrollChangeListener {
        void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C0669a();

        /* renamed from: e */
        public int f2873e;

        /* renamed from: androidx.core.widget.NestedScrollView$SavedState$a */
        static class C0669a implements Creator<SavedState> {
            C0669a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.f2873e);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2873e);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f2873e = parcel.readInt();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    static class C0670a extends C0615a {
        C0670a() {
        }

        /* renamed from: a */
        public boolean mo3293a(View view, int i, Bundle bundle) {
            if (super.mo3293a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i == 4096) {
                int min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                if (min == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo3461b(0, min);
                return true;
            } else if (i != 8192) {
                return false;
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo3461b(0, max);
                return true;
            }
        }

        /* renamed from: b */
        public void mo3296b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3296b(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0635e.m2988a(accessibilityEvent, nestedScrollView.getScrollX());
            C0635e.m2990b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        /* renamed from: a */
        public void mo3292a(View view, C0628c cVar) {
            super.mo3292a(view, cVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            cVar.mo3322a((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    cVar.mo3358k(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        cVar.mo3317a(8192);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        cVar.mo3317a(4096);
                    }
                }
            }
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private static int m3091a(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: a */
    private void m3094a(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2848B.mo3390a(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* renamed from: b */
    private boolean m3102b() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m3105c(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m3107e() {
        VelocityTracker velocityTracker = this.f2861o;
        if (velocityTracker == null) {
            this.f2861o = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: f */
    private void m3109f() {
        this.f2853g = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2864r = viewConfiguration.getScaledTouchSlop();
        this.f2865s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2866t = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: g */
    private void m3110g() {
        if (this.f2861o == null) {
            this.f2861o = VelocityTracker.obtain();
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2849C == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2849C = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2849C;
    }

    /* renamed from: h */
    private void m3111h() {
        VelocityTracker velocityTracker = this.f2861o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2861o = null;
        }
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f2853g.isFinished()) {
            this.f2853g.computeScrollOffset();
            int currY = this.f2853g.getCurrY();
            int i = currY - this.f2871y;
            this.f2871y = currY;
            int[] iArr = this.f2869w;
            boolean z = false;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i, iArr, null, 1);
            int i2 = i - this.f2869w[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                mo3454a(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                int[] iArr2 = this.f2869w;
                iArr2[1] = 0;
                dispatchNestedScroll(0, scrollY2, 0, i3, this.f2868v, 1, iArr2);
                i2 = i3 - this.f2869w[1];
            }
            if (i2 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z = true;
                }
                if (z) {
                    m3106d();
                    if (i2 < 0) {
                        if (this.f2854h.isFinished()) {
                            this.f2854h.onAbsorb((int) this.f2853g.getCurrVelocity());
                        }
                    } else if (this.f2855i.isFinished()) {
                        this.f2855i.onAbsorb((int) this.f2853g.getCurrVelocity());
                    }
                }
                m3093a();
            }
            if (!this.f2853g.isFinished()) {
                ViewCompat.m2808H(this);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (getChildCount() == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            bottom -= scrollY;
        } else if (scrollY > max) {
            bottom += scrollY - max;
        }
        return bottom;
    }

    /* renamed from: d */
    public boolean mo3464d(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f2852f.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f2852f;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f2852f.top = getScrollY() - height;
            Rect rect2 = this.f2852f;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f2852f;
        int i2 = rect3.top;
        rect3.bottom = height + i2;
        return m3103b(i, i2, rect3.bottom);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3455a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2848B.mo3394a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2848B.mo3393a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f2848B.mo3400a(i, i2, iArr, iArr2, i3);
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.f2848B.mo3390a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2854h != null) {
            int scrollY = getScrollY();
            int i2 = 0;
            if (!this.f2854h.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    i = getPaddingLeft() + 0;
                } else {
                    i = 0;
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    min += getPaddingTop();
                }
                canvas.translate((float) i, (float) min);
                this.f2854h.setSize(width, height);
                if (this.f2854h.draw(canvas)) {
                    ViewCompat.m2808H(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f2855i.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingLeft() + getPaddingRight();
                    i2 = 0 + getPaddingLeft();
                }
                if (VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingTop() + getPaddingBottom();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i2 - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f2855i.setSize(width2, height2);
                if (this.f2855i.draw(canvas)) {
                    ViewCompat.m2808H(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f2847A.mo3405a();
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent(int i) {
        return this.f2848B.mo3395a(i);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2848B.mo3401b();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2858l = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f2860n) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    i = 0;
                } else if (i > scrollRange) {
                    i = scrollRange;
                }
                if (i != scrollY) {
                    super.scrollTo(getScrollX(), i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.f2860n) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.f2867u;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.f2856j) > this.f2864r && (2 & getNestedScrollAxes()) == 0) {
                                this.f2860n = true;
                                this.f2856j = y;
                                m3110g();
                                this.f2861o.addMovement(motionEvent);
                                this.f2870x = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        m3095a(motionEvent);
                    }
                }
            }
            this.f2860n = false;
            this.f2867u = -1;
            m3111h();
            if (this.f2853g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.m2808H(this);
            }
            stopNestedScroll(0);
        } else {
            int y2 = (int) motionEvent.getY();
            if (!m3105c((int) motionEvent.getX(), y2)) {
                this.f2860n = false;
                m3111h();
            } else {
                this.f2856j = y2;
                this.f2867u = motionEvent.getPointerId(0);
                m3107e();
                this.f2861o.addMovement(motionEvent);
                this.f2853g.computeScrollOffset();
                this.f2860n = !this.f2853g.isFinished();
                startNestedScroll(2, 0);
            }
        }
        return this.f2860n;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.f2857k = false;
        View view = this.f2859m;
        if (view != null && m3100a(view, (View) this)) {
            m3101b(this.f2859m);
        }
        this.f2859m = null;
        if (!this.f2858l) {
            if (this.f2872z != null) {
                scrollTo(getScrollX(), this.f2872z.f2873e);
                this.f2872z = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int a = m3091a(scrollY, paddingTop, i5);
            if (a != scrollY) {
                scrollTo(getScrollX(), a);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2858l = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2862p && MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        mo3460b((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m3094a(i4, i5, iArr);
    }

    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.f2847A.mo3409a(view, view2, i, i2);
        startNestedScroll(2, i2);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View view;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            view = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            view = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (view != null && !m3098a(view)) {
            return view.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2872z = savedState;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2873e = getScrollY();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OnScrollChangeListener onScrollChangeListener = this.f2850D;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m3099a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f2852f);
            offsetDescendantRectToMyCoords(findFocus, this.f2852f);
            m3108e(mo3451a(this.f2852f));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view, int i) {
        this.f2847A.mo3407a(view, i);
        stopNestedScroll(i);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        m3110g();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2870x = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f2870x);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f2861o;
                velocityTracker.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, (float) this.f2866t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f2867u);
                if (Math.abs(yVelocity) > this.f2865s) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        mo3460b(i);
                    }
                } else {
                    if (this.f2853g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        ViewCompat.m2808H(this);
                    }
                }
                this.f2867u = -1;
                m3104c();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent2.findPointerIndex(this.f2867u);
                if (findPointerIndex == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid pointerId=");
                    sb.append(this.f2867u);
                    sb.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sb.toString());
                } else {
                    int y = (int) motionEvent2.getY(findPointerIndex);
                    int i2 = this.f2856j - y;
                    if (dispatchNestedPreScroll(0, i2, this.f2869w, this.f2868v, 0)) {
                        i2 -= this.f2869w[1];
                        obtain.offsetLocation(0.0f, (float) this.f2868v[1]);
                        this.f2870x += this.f2868v[1];
                    }
                    if (!this.f2860n && Math.abs(i2) > this.f2864r) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f2860n = true;
                        if (i2 > 0) {
                            i2 -= this.f2864r;
                        } else {
                            i2 += this.f2864r;
                        }
                    }
                    int i3 = i2;
                    if (this.f2860n) {
                        this.f2856j = y - this.f2868v[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        int i4 = scrollRange;
                        int i5 = findPointerIndex;
                        if (mo3454a(0, i3, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(0)) {
                            this.f2861o.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int i6 = i3 - scrollY2;
                        int[] iArr = this.f2869w;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i6, this.f2868v, 0, iArr);
                        int i7 = this.f2856j;
                        int[] iArr2 = this.f2868v;
                        this.f2856j = i7 - iArr2[1];
                        obtain.offsetLocation(0.0f, (float) iArr2[1]);
                        this.f2870x += this.f2868v[1];
                        if (z) {
                            int i8 = i3 - this.f2869w[1];
                            m3106d();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                C0675c.m3162a(this.f2854h, ((float) i8) / ((float) getHeight()), motionEvent2.getX(i5) / ((float) getWidth()));
                                if (!this.f2855i.isFinished()) {
                                    this.f2855i.onRelease();
                                }
                            } else {
                                int i10 = i5;
                                if (i9 > i4) {
                                    C0675c.m3162a(this.f2855i, ((float) i8) / ((float) getHeight()), 1.0f - (motionEvent2.getX(i10) / ((float) getWidth())));
                                    if (!this.f2854h.isFinished()) {
                                        this.f2854h.onRelease();
                                    }
                                }
                            }
                            EdgeEffect edgeEffect = this.f2854h;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f2855i.isFinished())) {
                                ViewCompat.m2808H(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f2860n && getChildCount() > 0 && this.f2853g.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.m2808H(this);
                }
                this.f2867u = -1;
                m3104c();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f2856j = (int) motionEvent2.getY(actionIndex);
                this.f2867u = motionEvent2.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m3095a(motionEvent);
                this.f2856j = (int) motionEvent2.getY(motionEvent2.findPointerIndex(this.f2867u));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z2 = !this.f2853g.isFinished();
            this.f2860n = z2;
            if (z2) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.requestDisallowInterceptTouchEvent(true);
                }
            }
            if (!this.f2853g.isFinished()) {
                m3093a();
            }
            this.f2856j = (int) motionEvent.getY();
            this.f2867u = motionEvent2.getPointerId(0);
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f2861o;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f2857k) {
            m3101b(view2);
        } else {
            this.f2859m = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m3097a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m3111h();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f2857k = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int width = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int a = m3091a(i, (getWidth() - getPaddingLeft()) - getPaddingRight(), width);
            int a2 = m3091a(i2, height, height2);
            if (a != getScrollX() || a2 != getScrollY()) {
                super.scrollTo(a, a2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f2862p) {
            this.f2862p = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2848B.mo3391a(z);
    }

    public void setOnScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.f2850D = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2863q = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i, int i2) {
        return this.f2848B.mo3396a(i, i2);
    }

    public void stopNestedScroll(int i) {
        this.f2848B.mo3404c(i);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.f2848B.mo3398a(i, i2, i3, i4, iArr, i5);
    }

    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        m3094a(i4, i5, (int[]) null);
    }

    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2852f = new Rect();
        this.f2857k = true;
        this.f2858l = false;
        this.f2859m = null;
        this.f2860n = false;
        this.f2863q = true;
        this.f2867u = -1;
        this.f2868v = new int[2];
        this.f2869w = new int[2];
        m3109f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2846F, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2847A = new C0646h(this);
        this.f2848B = new C0645g(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m2824a((View) this, (C0615a) f2845E);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2848B.mo3397a(i, i2, i3, i4, iArr);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m3094a(i4, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    /* renamed from: e */
    private void m3108e(int i) {
        if (i == 0) {
            return;
        }
        if (this.f2863q) {
            mo3452a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    private boolean m3103b(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View a = m3092a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m3108e(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: a */
    public boolean mo3455a(KeyEvent keyEvent) {
        this.f2852f.setEmpty();
        boolean z = false;
        int i = 130;
        if (!m3102b()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (!(findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130))) {
                    z = true;
                }
            }
            return z;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                z = !keyEvent.isAltPressed() ? mo3453a(33) : mo3462c(33);
            } else if (keyCode == 20) {
                z = !keyEvent.isAltPressed() ? mo3453a(130) : mo3462c(130);
            } else if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                mo3464d(i);
            }
        }
        return z;
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: c */
    public boolean mo3462c(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2852f;
        rect.top = 0;
        rect.bottom = height;
        if (z) {
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                this.f2852f.bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect2 = this.f2852f;
                rect2.top = rect2.bottom - height;
            }
        }
        Rect rect3 = this.f2852f;
        return m3103b(i, rect3.top, rect3.bottom);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    /* renamed from: b */
    public final void mo3461b(int i, int i2) {
        mo3452a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    private void m3101b(View view) {
        view.getDrawingRect(this.f2852f);
        offsetDescendantRectToMyCoords(view, this.f2852f);
        int a = mo3451a(this.f2852f);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: d */
    private void m3106d() {
        if (getOverScrollMode() == 2) {
            this.f2854h = null;
            this.f2855i = null;
        } else if (this.f2854h == null) {
            Context context = getContext();
            this.f2854h = new EdgeEffect(context);
            this.f2855i = new EdgeEffect(context);
        }
    }

    /* renamed from: b */
    public void mo3460b(int i) {
        if (getChildCount() > 0) {
            this.f2853g.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m3096a(true);
        }
    }

    /* renamed from: c */
    private void m3104c() {
        this.f2860n = false;
        m3111h();
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.f2854h;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f2855i.onRelease();
        }
    }

    /* renamed from: a */
    private void m3095a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2867u) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2856j = (int) motionEvent.getY(i);
            this.f2867u = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2861o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0083 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3454a(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r7 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0053
            goto L_0x004e
        L_0x0053:
            r7 = r3
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r3 = r12.hasNestedScrollingParent(r5)
            if (r3 != 0) goto L_0x007e
            android.widget.OverScroller r3 = r0.f2853g
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r3
            r14 = r7
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r7, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.mo3454a(int, int, int, int, int, int, int, int, boolean):boolean");
    }

    /* renamed from: a */
    private View m3092a(boolean z, int i, int i2) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3) {
                            if (!z4) {
                            }
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (!z4) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public boolean mo3453a(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m3099a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m3108e(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f2852f);
            offsetDescendantRectToMyCoords(findNextFocus, this.f2852f);
            m3108e(mo3451a(this.f2852f));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m3098a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: a */
    private boolean m3098a(View view) {
        return !m3099a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m3099a(View view, int i, int i2) {
        view.getDrawingRect(this.f2852f);
        offsetDescendantRectToMyCoords(view, this.f2852f);
        return this.f2852f.bottom + i >= getScrollY() && this.f2852f.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    public final void mo3452a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f2851e > 250) {
                View childAt = getChildAt(0);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int scrollY = getScrollY();
                this.f2853g.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY);
                m3096a(false);
            } else {
                if (!this.f2853g.isFinished()) {
                    m3093a();
                }
                scrollBy(i, i2);
            }
            this.f2851e = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    private void m3096a(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f2871y = getScrollY();
        ViewCompat.m2808H(this);
    }

    /* renamed from: a */
    private void m3093a() {
        this.f2853g.abortAnimation();
        stopNestedScroll(1);
    }

    /* renamed from: a */
    private boolean m3097a(Rect rect, boolean z) {
        int a = mo3451a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo3452a(0, a);
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo3451a(Rect rect) {
        int i;
        int i2;
        int i3 = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        if (rect.bottom > i5 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i5;
            }
            i3 = Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top < scrollY && rect.bottom < i5) {
            if (rect.height() > height) {
                i = 0 - (i5 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            i3 = Math.max(i, -getScrollY());
        }
        return i3;
    }

    /* renamed from: a */
    private static boolean m3100a(View view, View view2) {
        boolean z = true;
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !m3100a((View) parent, view2)) {
            z = false;
        }
        return z;
    }
}
