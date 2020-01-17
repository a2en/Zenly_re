package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.C0540a;
import androidx.core.view.C0645g;
import androidx.core.view.C0646h;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C0678f;

public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {

    /* renamed from: S */
    private static final String f4398S = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: T */
    private static final int[] f4399T = {16842766};

    /* renamed from: A */
    protected int f4400A;

    /* renamed from: B */
    float f4401B;

    /* renamed from: C */
    protected int f4402C;

    /* renamed from: D */
    int f4403D;

    /* renamed from: E */
    int f4404E;

    /* renamed from: F */
    C1173b f4405F;

    /* renamed from: G */
    private Animation f4406G;

    /* renamed from: H */
    private Animation f4407H;

    /* renamed from: I */
    private Animation f4408I;

    /* renamed from: J */
    private Animation f4409J;

    /* renamed from: K */
    private Animation f4410K;

    /* renamed from: L */
    boolean f4411L;

    /* renamed from: M */
    private int f4412M;

    /* renamed from: N */
    boolean f4413N;

    /* renamed from: O */
    private OnChildScrollUpCallback f4414O;

    /* renamed from: P */
    private AnimationListener f4415P;

    /* renamed from: Q */
    private final Animation f4416Q;

    /* renamed from: R */
    private final Animation f4417R;

    /* renamed from: e */
    private View f4418e;

    /* renamed from: f */
    OnRefreshListener f4419f;

    /* renamed from: g */
    boolean f4420g;

    /* renamed from: h */
    private int f4421h;

    /* renamed from: i */
    private float f4422i;

    /* renamed from: j */
    private float f4423j;

    /* renamed from: k */
    private final C0646h f4424k;

    /* renamed from: l */
    private final C0645g f4425l;

    /* renamed from: m */
    private final int[] f4426m;

    /* renamed from: n */
    private final int[] f4427n;

    /* renamed from: o */
    private boolean f4428o;

    /* renamed from: p */
    private int f4429p;

    /* renamed from: q */
    int f4430q;

    /* renamed from: r */
    private float f4431r;

    /* renamed from: s */
    private float f4432s;

    /* renamed from: t */
    private boolean f4433t;

    /* renamed from: u */
    private int f4434u;

    /* renamed from: v */
    boolean f4435v;

    /* renamed from: w */
    private boolean f4436w;

    /* renamed from: x */
    private final DecelerateInterpolator f4437x;

    /* renamed from: y */
    C1171a f4438y;

    /* renamed from: z */
    private int f4439z;

    public interface OnChildScrollUpCallback {
        boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface OnRefreshListener {
        void onRefresh();
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class C1163a implements AnimationListener {
        C1163a() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4420g) {
                swipeRefreshLayout.f4405F.setAlpha(255);
                SwipeRefreshLayout.this.f4405F.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f4411L) {
                    OnRefreshListener onRefreshListener = swipeRefreshLayout2.f4419f;
                    if (onRefreshListener != null) {
                        onRefreshListener.onRefresh();
                    }
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f4430q = swipeRefreshLayout3.f4438y.getTop();
                return;
            }
            swipeRefreshLayout.mo5844c();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C1164b extends Animation {
        C1164b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C1165c extends Animation {
        C1165c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C1166d extends Animation {

        /* renamed from: e */
        final /* synthetic */ int f4443e;

        /* renamed from: f */
        final /* synthetic */ int f4444f;

        C1166d(int i, int i2) {
            this.f4443e = i;
            this.f4444f = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C1173b bVar = SwipeRefreshLayout.this.f4405F;
            int i = this.f4443e;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f4444f - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class C1167e implements AnimationListener {
        C1167e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f4435v) {
                swipeRefreshLayout.mo5841a((AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C1168f extends Animation {
        C1168f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f4413N) {
                i = swipeRefreshLayout.f4403D - Math.abs(swipeRefreshLayout.f4402C);
            } else {
                i = swipeRefreshLayout.f4403D;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f4400A;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f4438y.getTop());
            SwipeRefreshLayout.this.f4405F.mo5891a(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C1169g extends Animation {
        C1169g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo5840a(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C1170h extends Animation {
        C1170h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f4401B;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo5840a(f);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m5690a(boolean z, boolean z2) {
        if (this.f4420g != z) {
            this.f4411L = z2;
            m5699e();
            this.f4420g = z;
            if (this.f4420g) {
                m5688a(this.f4430q, this.f4415P);
            } else {
                mo5841a(this.f4415P);
            }
        }
    }

    /* renamed from: b */
    private void m5694b(AnimationListener animationListener) {
        this.f4438y.setVisibility(0);
        this.f4405F.setAlpha(255);
        this.f4406G = new C1164b();
        this.f4406G.setDuration((long) this.f4429p);
        if (animationListener != null) {
            this.f4438y.mo5884a(animationListener);
        }
        this.f4438y.clearAnimation();
        this.f4438y.startAnimation(this.f4406G);
    }

    /* renamed from: d */
    private void m5697d() {
        this.f4438y = new C1171a(getContext(), -328966);
        this.f4405F = new C1173b(getContext());
        this.f4405F.mo5895a(1);
        this.f4438y.setImageDrawable(this.f4405F);
        this.f4438y.setVisibility(8);
        addView(this.f4438y);
    }

    /* renamed from: e */
    private void m5699e() {
        if (this.f4418e == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f4438y)) {
                    this.f4418e = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    private void m5700f() {
        this.f4409J = m5687a(this.f4405F.getAlpha(), 255);
    }

    /* renamed from: g */
    private void m5701g() {
        this.f4408I = m5687a(this.f4405F.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f4438y.getBackground().setAlpha(i);
        this.f4405F.setAlpha(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5844c() {
        this.f4438y.clearAnimation();
        this.f4405F.stop();
        this.f4438y.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4435v) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4402C - this.f4430q);
        }
        this.f4430q = this.f4438y.getTop();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f4425l.mo3394a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f4425l.mo3393a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f4425l.mo3399a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f4425l.mo3397a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f4439z;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            i2++;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        return this.f4424k.mo3405a();
    }

    public int getProgressCircleDiameter() {
        return this.f4412M;
    }

    public int getProgressViewEndOffset() {
        return this.f4403D;
    }

    public int getProgressViewStartOffset() {
        return this.f4402C;
    }

    public boolean hasNestedScrollingParent() {
        return this.f4425l.mo3392a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f4425l.mo3401b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5844c();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m5699e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4436w && actionMasked == 0) {
            this.f4436w = false;
        }
        if (!isEnabled() || this.f4436w || mo5842a() || this.f4420g || this.f4428o) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f4434u;
                    if (i == -1) {
                        Log.e(f4398S, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m5698d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m5689a(motionEvent);
                    }
                }
            }
            this.f4433t = false;
            this.f4434u = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f4402C - this.f4438y.getTop());
            this.f4434u = motionEvent.getPointerId(0);
            this.f4433t = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f4434u);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f4432s = motionEvent.getY(findPointerIndex2);
        }
        return this.f4433t;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f4418e == null) {
                m5699e();
            }
            View view = this.f4418e;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f4438y.getMeasuredWidth();
                int measuredHeight2 = this.f4438y.getMeasuredHeight();
                C1171a aVar = this.f4438y;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = i5 - i6;
                int i8 = this.f4430q;
                aVar.layout(i7, i8, i5 + i6, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4418e == null) {
            m5699e();
        }
        View view = this.f4418e;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f4438y.measure(MeasureSpec.makeMeasureSpec(this.f4412M, 1073741824), MeasureSpec.makeMeasureSpec(this.f4412M, 1073741824));
            this.f4439z = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                } else if (getChildAt(i3) == this.f4438y) {
                    this.f4439z = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f4423j;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f4423j = 0.0f;
                } else {
                    this.f4423j = f - f2;
                    iArr[1] = i2;
                }
                m5695c(this.f4423j);
            }
        }
        if (this.f4413N && i2 > 0 && this.f4423j == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f4438y.setVisibility(8);
        }
        int[] iArr2 = this.f4426m;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f4427n);
        int i5 = i4 + this.f4427n[1];
        if (i5 < 0 && !mo5842a()) {
            this.f4423j += (float) Math.abs(i5);
            m5695c(this.f4423j);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f4424k.mo3408a(view, view2, i);
        startNestedScroll(i & 2);
        this.f4423j = 0.0f;
        this.f4428o = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f4436w && !this.f4420g && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f4424k.mo3406a(view);
        this.f4428o = false;
        float f = this.f4423j;
        if (f > 0.0f) {
            m5692b(f);
            this.f4423j = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4436w && actionMasked == 0) {
            this.f4436w = false;
        }
        if (!isEnabled() || this.f4436w || mo5842a() || this.f4420g || this.f4428o) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4434u = motionEvent.getPointerId(0);
            this.f4433t = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4434u);
            if (findPointerIndex < 0) {
                Log.e(f4398S, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f4433t) {
                float y = (motionEvent.getY(findPointerIndex) - this.f4431r) * 0.5f;
                this.f4433t = false;
                m5692b(y);
            }
            this.f4434u = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f4434u);
            if (findPointerIndex2 < 0) {
                Log.e(f4398S, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            m5698d(y2);
            if (this.f4433t) {
                float f = (y2 - this.f4431r) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m5695c(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f4398S, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f4434u = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m5689a(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT >= 21 || !(this.f4418e instanceof AbsListView)) {
            View view = this.f4418e;
            if (view == null || ViewCompat.m2805E(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        this.f4438y.setScaleX(f);
        this.f4438y.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m5699e();
        this.f4405F.mo5897a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0540a.m2536a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f4422i = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo5844c();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f4425l.mo3391a(z);
    }

    public void setOnChildScrollUpCallback(OnChildScrollUpCallback onChildScrollUpCallback) {
        this.f4414O = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(OnRefreshListener onRefreshListener) {
        this.f4419f = onRefreshListener;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f4438y.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0540a.m2536a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f4420g == z) {
            m5690a(z, false);
            return;
        }
        this.f4420g = z;
        if (!this.f4413N) {
            i = this.f4403D + this.f4402C;
        } else {
            i = this.f4403D;
        }
        setTargetOffsetTopAndBottom(i - this.f4430q);
        this.f4411L = false;
        m5694b(this.f4415P);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f4412M = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f4412M = (int) (displayMetrics.density * 40.0f);
            }
            this.f4438y.setImageDrawable(null);
            this.f4405F.mo5895a(i);
            this.f4438y.setImageDrawable(this.f4405F);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f4404E = i;
    }

    /* access modifiers changed from: 0000 */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f4438y.bringToFront();
        ViewCompat.m2848e(this.f4438y, i);
        this.f4430q = this.f4438y.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f4425l.mo3402b(i);
    }

    public void stopNestedScroll() {
        this.f4425l.mo3403c();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4420g = false;
        this.f4422i = -1.0f;
        this.f4426m = new int[2];
        this.f4427n = new int[2];
        this.f4434u = -1;
        this.f4439z = -1;
        this.f4415P = new C1163a();
        this.f4416Q = new C1168f();
        this.f4417R = new C1169g();
        this.f4421h = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4429p = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f4437x = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4412M = (int) (displayMetrics.density * 40.0f);
        m5697d();
        setChildrenDrawingOrderEnabled(true);
        this.f4403D = (int) (displayMetrics.density * 64.0f);
        this.f4422i = (float) this.f4403D;
        this.f4424k = new C0646h(this);
        this.f4425l = new C0645g(this);
        setNestedScrollingEnabled(true);
        int i = -this.f4412M;
        this.f4430q = i;
        this.f4402C = i;
        mo5840a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4399T);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m5698d(float f) {
        float f2 = this.f4432s;
        float f3 = f - f2;
        int i = this.f4421h;
        if (f3 > ((float) i) && !this.f4433t) {
            this.f4431r = f2 + ((float) i);
            this.f4433t = true;
            this.f4405F.setAlpha(76);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5841a(AnimationListener animationListener) {
        this.f4407H = new C1165c();
        this.f4407H.setDuration(150);
        this.f4438y.mo5884a(animationListener);
        this.f4438y.clearAnimation();
        this.f4438y.startAnimation(this.f4407H);
    }

    /* renamed from: b */
    public boolean mo5843b() {
        return this.f4420g;
    }

    /* renamed from: b */
    private void m5692b(float f) {
        if (f > this.f4422i) {
            m5690a(true, true);
            return;
        }
        this.f4420g = false;
        this.f4405F.mo5892a(0.0f, 0.0f);
        C1167e eVar = null;
        if (!this.f4435v) {
            eVar = new C1167e();
        }
        m5693b(this.f4430q, eVar);
        this.f4405F.mo5896a(false);
    }

    /* renamed from: c */
    private void m5695c(float f) {
        this.f4405F.mo5896a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f4422i));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f4422i;
        int i = this.f4404E;
        if (i <= 0) {
            i = this.f4413N ? this.f4403D - this.f4402C : this.f4403D;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f4402C + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f4438y.getVisibility() != 0) {
            this.f4438y.setVisibility(0);
        }
        if (!this.f4435v) {
            this.f4438y.setScaleX(1.0f);
            this.f4438y.setScaleY(1.0f);
        }
        if (this.f4435v) {
            setAnimationProgress(Math.min(1.0f, f / this.f4422i));
        }
        if (f < this.f4422i) {
            if (this.f4405F.getAlpha() > 76 && !m5691a(this.f4408I)) {
                m5701g();
            }
        } else if (this.f4405F.getAlpha() < 255 && !m5691a(this.f4409J)) {
            m5700f();
        }
        this.f4405F.mo5892a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f4405F.mo5891a(Math.min(1.0f, max));
        this.f4405F.mo5898b((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f4430q);
    }

    /* renamed from: a */
    private Animation m5687a(int i, int i2) {
        C1166d dVar = new C1166d(i, i2);
        dVar.setDuration(300);
        this.f4438y.mo5884a(null);
        this.f4438y.clearAnimation();
        this.f4438y.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: b */
    private void m5693b(int i, AnimationListener animationListener) {
        if (this.f4435v) {
            m5696c(i, animationListener);
            return;
        }
        this.f4400A = i;
        this.f4417R.reset();
        this.f4417R.setDuration(200);
        this.f4417R.setInterpolator(this.f4437x);
        if (animationListener != null) {
            this.f4438y.mo5884a(animationListener);
        }
        this.f4438y.clearAnimation();
        this.f4438y.startAnimation(this.f4417R);
    }

    /* renamed from: a */
    public boolean mo5842a() {
        OnChildScrollUpCallback onChildScrollUpCallback = this.f4414O;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.canChildScrollUp(this, this.f4418e);
        }
        View view = this.f4418e;
        if (view instanceof ListView) {
            return C0678f.m3170a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    /* renamed from: a */
    private boolean m5691a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: a */
    private void m5688a(int i, AnimationListener animationListener) {
        this.f4400A = i;
        this.f4416Q.reset();
        this.f4416Q.setDuration(200);
        this.f4416Q.setInterpolator(this.f4437x);
        if (animationListener != null) {
            this.f4438y.mo5884a(animationListener);
        }
        this.f4438y.clearAnimation();
        this.f4438y.startAnimation(this.f4416Q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5840a(float f) {
        int i = this.f4400A;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f4402C - i)) * f))) - this.f4438y.getTop());
    }

    /* renamed from: a */
    private void m5689a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4434u) {
            this.f4434u = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: c */
    private void m5696c(int i, AnimationListener animationListener) {
        this.f4400A = i;
        this.f4401B = this.f4438y.getScaleX();
        this.f4410K = new C1170h();
        this.f4410K.setDuration(150);
        if (animationListener != null) {
            this.f4438y.mo5884a(animationListener);
        }
        this.f4438y.clearAnimation();
        this.f4438y.startAnimation(this.f4410K);
    }
}
