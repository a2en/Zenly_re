package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0540a;
import androidx.core.view.C0615a;
import androidx.core.view.C0666p;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0628c;
import androidx.customview.view.AbsSavedState;
import com.android.volley.toolbox.C8733j;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {

    /* renamed from: j0 */
    static final int[] f4787j0 = {16842931};

    /* renamed from: k0 */
    private static final Comparator<C1290f> f4788k0 = new C1285a();

    /* renamed from: l0 */
    private static final Interpolator f4789l0 = new C1286b();

    /* renamed from: m0 */
    private static final C1294j f4790m0 = new C1294j();

    /* renamed from: A */
    private int f4791A = 1;

    /* renamed from: B */
    private boolean f4792B;

    /* renamed from: C */
    private boolean f4793C;

    /* renamed from: D */
    private int f4794D;

    /* renamed from: E */
    private int f4795E;

    /* renamed from: F */
    private int f4796F;

    /* renamed from: G */
    private float f4797G;

    /* renamed from: H */
    private float f4798H;

    /* renamed from: I */
    private float f4799I;

    /* renamed from: J */
    private float f4800J;

    /* renamed from: K */
    private int f4801K = -1;

    /* renamed from: L */
    private VelocityTracker f4802L;

    /* renamed from: M */
    private int f4803M;

    /* renamed from: N */
    private int f4804N;

    /* renamed from: O */
    private int f4805O;

    /* renamed from: P */
    private int f4806P;

    /* renamed from: Q */
    private boolean f4807Q;

    /* renamed from: R */
    private EdgeEffect f4808R;

    /* renamed from: S */
    private EdgeEffect f4809S;

    /* renamed from: T */
    private boolean f4810T = true;

    /* renamed from: U */
    private boolean f4811U;

    /* renamed from: V */
    private int f4812V;

    /* renamed from: W */
    private List<OnPageChangeListener> f4813W;

    /* renamed from: a0 */
    private OnPageChangeListener f4814a0;

    /* renamed from: b0 */
    private OnPageChangeListener f4815b0;

    /* renamed from: c0 */
    private List<OnAdapterChangeListener> f4816c0;

    /* renamed from: d0 */
    private PageTransformer f4817d0;

    /* renamed from: e */
    private int f4818e;

    /* renamed from: e0 */
    private int f4819e0;

    /* renamed from: f */
    private final ArrayList<C1290f> f4820f = new ArrayList<>();

    /* renamed from: f0 */
    private int f4821f0;

    /* renamed from: g */
    private final C1290f f4822g = new C1290f();

    /* renamed from: g0 */
    private ArrayList<View> f4823g0;

    /* renamed from: h */
    private final Rect f4824h = new Rect();

    /* renamed from: h0 */
    private final Runnable f4825h0 = new C1287c();

    /* renamed from: i */
    C1295a f4826i;

    /* renamed from: i0 */
    private int f4827i0 = 0;

    /* renamed from: j */
    int f4828j;

    /* renamed from: k */
    private int f4829k = -1;

    /* renamed from: l */
    private Parcelable f4830l = null;

    /* renamed from: m */
    private ClassLoader f4831m = null;

    /* renamed from: n */
    private Scroller f4832n;

    /* renamed from: o */
    private boolean f4833o;

    /* renamed from: p */
    private C1292h f4834p;

    /* renamed from: q */
    private int f4835q;

    /* renamed from: r */
    private Drawable f4836r;

    /* renamed from: s */
    private int f4837s;

    /* renamed from: t */
    private int f4838t;

    /* renamed from: u */
    private float f4839u = -3.4028235E38f;

    /* renamed from: v */
    private float f4840v = Float.MAX_VALUE;

    /* renamed from: w */
    private int f4841w;

    /* renamed from: x */
    private boolean f4842x;

    /* renamed from: y */
    private boolean f4843y;

    /* renamed from: z */
    private boolean f4844z;

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f4845a;

        /* renamed from: b */
        public int f4846b;

        /* renamed from: c */
        float f4847c = 0.0f;

        /* renamed from: d */
        boolean f4848d;

        /* renamed from: e */
        int f4849e;

        /* renamed from: f */
        int f4850f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4787j0);
            this.f4846b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(ViewPager viewPager, C1295a aVar, C1295a aVar2);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    public interface PageTransformer {
        void transformPage(View view, float f);
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C1284a();

        /* renamed from: g */
        int f4851g;

        /* renamed from: h */
        Parcelable f4852h;

        /* renamed from: i */
        ClassLoader f4853i;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        static class C1284a implements ClassLoaderCreator<SavedState> {
            C1284a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f4851g);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4851g);
            parcel.writeParcelable(this.f4852h, i);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = SavedState.class.getClassLoader();
            }
            this.f4851g = parcel.readInt();
            this.f4852h = parcel.readParcelable(classLoader);
            this.f4853i = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    static class C1285a implements Comparator<C1290f> {
        C1285a() {
        }

        /* renamed from: a */
        public int compare(C1290f fVar, C1290f fVar2) {
            return fVar.f4858b - fVar2.f4858b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    static class C1286b implements Interpolator {
        C1286b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    class C1287c implements Runnable {
        C1287c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo6354e();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    class C1288d implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        private final Rect f4855a = new Rect();

        C1288d() {
        }

        public C0666p onApplyWindowInsets(View view, C0666p pVar) {
            C0666p b = ViewCompat.m2834b(view, pVar);
            if (b.mo3447e()) {
                return b;
            }
            Rect rect = this.f4855a;
            rect.left = b.mo3444b();
            rect.top = b.mo3446d();
            rect.right = b.mo3445c();
            rect.bottom = b.mo3442a();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0666p a = ViewCompat.m2814a(ViewPager.this.getChildAt(i), b);
                rect.left = Math.min(a.mo3444b(), rect.left);
                rect.top = Math.min(a.mo3446d(), rect.top);
                rect.right = Math.min(a.mo3445c(), rect.right);
                rect.bottom = Math.min(a.mo3442a(), rect.bottom);
            }
            return b.mo3443a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C1289e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    static class C1290f {

        /* renamed from: a */
        Object f4857a;

        /* renamed from: b */
        int f4858b;

        /* renamed from: c */
        boolean f4859c;

        /* renamed from: d */
        float f4860d;

        /* renamed from: e */
        float f4861e;

        C1290f() {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    class C1291g extends C0615a {
        C1291g() {
        }

        /* renamed from: a */
        public void mo3292a(View view, C0628c cVar) {
            super.mo3292a(view, cVar);
            cVar.mo3322a((CharSequence) ViewPager.class.getName());
            cVar.mo3358k(m6212b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.mo3317a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.mo3317a(8192);
            }
        }

        /* renamed from: b */
        public void mo3296b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3296b(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m6212b());
            if (accessibilityEvent.getEventType() == 4096) {
                C1295a aVar = ViewPager.this.f4826i;
                if (aVar != null) {
                    accessibilityEvent.setItemCount(aVar.getCount());
                    accessibilityEvent.setFromIndex(ViewPager.this.f4828j);
                    accessibilityEvent.setToIndex(ViewPager.this.f4828j);
                }
            }
        }

        /* renamed from: b */
        private boolean m6212b() {
            C1295a aVar = ViewPager.this.f4826i;
            return aVar != null && aVar.getCount() > 1;
        }

        /* renamed from: a */
        public boolean mo3293a(View view, int i, Bundle bundle) {
            if (super.mo3293a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f4828j - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f4828j + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    private class C1292h extends DataSetObserver {
        C1292h() {
        }

        public void onChanged() {
            ViewPager.this.mo6325a();
        }

        public void onInvalidated() {
            ViewPager.this.mo6325a();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public static class C1293i implements OnPageChangeListener {
        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    static class C1294j implements Comparator<View> {
        C1294j() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f4845a;
            if (z == layoutParams2.f4845a) {
                return layoutParams.f4849e - layoutParams2.f4849e;
            }
            return z ? 1 : -1;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo6342b();
    }

    /* renamed from: d */
    private void m6180d(int i) {
        OnPageChangeListener onPageChangeListener = this.f4814a0;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(i);
        }
        List<OnPageChangeListener> list = this.f4813W;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f4813W.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageSelected(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f4815b0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageSelected(i);
        }
    }

    /* renamed from: f */
    private boolean m6183f(int i) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.f4820f.size() != 0) {
            C1290f g = m6184g();
            int clientWidth = getClientWidth();
            int i2 = this.f4835q;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            float f2 = ((float) i2) / f;
            int i4 = g.f4858b;
            float f3 = ((((float) i) / f) - g.f4861e) / (g.f4860d + f2);
            int i5 = (int) (((float) i3) * f3);
            this.f4811U = false;
            mo6326a(i4, f3, i5);
            if (this.f4811U) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.f4810T) {
            return false;
        } else {
            this.f4811U = false;
            mo6326a(0, 0.0f, 0);
            if (this.f4811U) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    private C1290f m6184g() {
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f4835q) / ((float) clientWidth) : 0.0f;
        C1290f fVar = null;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i < this.f4820f.size()) {
            C1290f fVar2 = (C1290f) this.f4820f.get(i);
            if (!z) {
                int i3 = i2 + 1;
                if (fVar2.f4858b != i3) {
                    fVar2 = this.f4822g;
                    fVar2.f4861e = f2 + f3 + f;
                    fVar2.f4858b = i3;
                    fVar2.f4860d = this.f4826i.mo6401a(fVar2.f4858b);
                    i--;
                }
            }
            f2 = fVar2.f4861e;
            float f4 = fVar2.f4860d + f2 + f;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f4 || i == this.f4820f.size() - 1) {
                return fVar2;
            }
            i2 = fVar2.f4858b;
            f3 = fVar2.f4860d;
            i++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m6185h() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).f4845a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: i */
    private boolean m6186i() {
        this.f4801K = -1;
        m6182f();
        this.f4808R.onRelease();
        this.f4809S.onRelease();
        return this.f4808R.isFinished() || this.f4809S.isFinished();
    }

    /* renamed from: j */
    private void m6187j() {
        if (this.f4821f0 != 0) {
            ArrayList<View> arrayList = this.f4823g0;
            if (arrayList == null) {
                this.f4823g0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f4823g0.add(getChildAt(i));
            }
            Collections.sort(this.f4823g0, f4790m0);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f4843y != z) {
            this.f4843y = z;
        }
    }

    /* renamed from: a */
    public void mo6328a(int i, boolean z) {
        this.f4844z = false;
        mo6329a(i, z, false);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C1290f b = mo6341b(childAt);
                    if (b != null && b.f4858b == this.f4828j) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C1290f b = mo6341b(childAt);
                if (b != null && b.f4858b == this.f4828j) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        layoutParams2.f4845a |= m6179c(view);
        if (!this.f4842x) {
            super.addView(view, i, layoutParams);
        } else if (layoutParams2 == null || !layoutParams2.f4845a) {
            layoutParams2.f4848d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6342b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4832n = new Scroller(context, f4789l0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f4796F = viewConfiguration.getScaledPagingTouchSlop();
        this.f4803M = (int) (400.0f * f);
        this.f4804N = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4808R = new EdgeEffect(context);
        this.f4809S = new EdgeEffect(context);
        this.f4805O = (int) (25.0f * f);
        this.f4806P = (int) (2.0f * f);
        this.f4794D = (int) (f * 16.0f);
        ViewCompat.m2824a((View) this, (C0615a) new C1291g());
        if (ViewCompat.m2860m(this) == 0) {
            ViewCompat.m2852g(this, 1);
        }
        ViewCompat.m2823a((View) this, (OnApplyWindowInsetsListener) new C1288d());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6344c(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f4828j
            if (r2 == r1) goto L_0x000f
            androidx.viewpager.widget.ViewPager$f r2 = r0.mo6340b(r2)
            r0.f4828j = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            androidx.viewpager.widget.a r1 = r0.f4826i
            if (r1 != 0) goto L_0x0018
            r17.m6187j()
            return
        L_0x0018:
            boolean r1 = r0.f4844z
            if (r1 == 0) goto L_0x0020
            r17.m6187j()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            androidx.viewpager.widget.a r1 = r0.f4826i
            r1.mo4288b(r0)
            int r1 = r0.f4791A
            int r4 = r0.f4828j
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.a r6 = r0.f4826i
            int r6 = r6.getCount()
            int r7 = r6 + -1
            int r8 = r0.f4828j
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f4818e
            if (r6 != r7) goto L_0x0211
            r7 = 0
        L_0x004a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f4820f
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.f4820f
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$f r8 = (androidx.viewpager.widget.ViewPager.C1290f) r8
            int r9 = r8.f4858b
            int r10 = r0.f4828j
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f4828j
            androidx.viewpager.widget.ViewPager$f r8 = r0.mo6323a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x019e
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r11 = r0.f4820f
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$f r11 = (androidx.viewpager.widget.ViewPager.C1290f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r3 = 0
            goto L_0x0099
        L_0x008c:
            float r14 = r8.f4860d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r3 = r14 + r15
        L_0x0099:
            int r14 = r0.f4828j
            int r14 = r14 + -1
            r15 = r10
            r10 = r7
            r7 = 0
        L_0x00a0:
            if (r14 < 0) goto L_0x0100
            int r16 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r16 < 0) goto L_0x00ce
            if (r14 >= r4) goto L_0x00ce
            if (r11 != 0) goto L_0x00ab
            goto L_0x0100
        L_0x00ab:
            int r5 = r11.f4858b
            if (r14 != r5) goto L_0x00fc
            boolean r5 = r11.f4859c
            if (r5 != 0) goto L_0x00fc
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            r5.remove(r15)
            androidx.viewpager.widget.a r5 = r0.f4826i
            java.lang.Object r11 = r11.f4857a
            r5.mo4284a(r0, r14, r11)
            int r15 = r15 + -1
            int r10 = r10 + -1
            if (r15 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1290f) r5
            goto L_0x00fb
        L_0x00ce:
            if (r11 == 0) goto L_0x00e4
            int r5 = r11.f4858b
            if (r14 != r5) goto L_0x00e4
            float r5 = r11.f4860d
            float r7 = r7 + r5
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1290f) r5
            goto L_0x00fb
        L_0x00e4:
            int r5 = r15 + 1
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo6323a(r14, r5)
            float r5 = r5.f4860d
            float r7 = r7 + r5
            int r10 = r10 + 1
            if (r15 < 0) goto L_0x00fa
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            java.lang.Object r5 = r5.get(r15)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1290f) r5
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            r11 = r5
        L_0x00fc:
            int r14 = r14 + -1
            r5 = 0
            goto L_0x00a0
        L_0x0100:
            float r3 = r8.f4860d
            int r4 = r10 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0192
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0119
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1290f) r5
            goto L_0x011a
        L_0x0119:
            r5 = 0
        L_0x011a:
            if (r12 > 0) goto L_0x011e
            r7 = 0
            goto L_0x0126
        L_0x011e:
            int r7 = r17.getPaddingRight()
            float r7 = (float) r7
            float r11 = (float) r12
            float r7 = r7 / r11
            float r7 = r7 + r13
        L_0x0126:
            int r11 = r0.f4828j
        L_0x0128:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0192
            int r12 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x015c
            if (r11 <= r1) goto L_0x015c
            if (r5 != 0) goto L_0x0135
            goto L_0x0192
        L_0x0135:
            int r12 = r5.f4858b
            if (r11 != r12) goto L_0x0191
            boolean r12 = r5.f4859c
            if (r12 != 0) goto L_0x0191
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r12 = r0.f4820f
            r12.remove(r4)
            androidx.viewpager.widget.a r12 = r0.f4826i
            java.lang.Object r5 = r5.f4857a
            r12.mo4284a(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1290f) r5
            goto L_0x0191
        L_0x015a:
            r5 = 0
            goto L_0x0191
        L_0x015c:
            if (r5 == 0) goto L_0x0178
            int r12 = r5.f4858b
            if (r11 != r12) goto L_0x0178
            float r5 = r5.f4860d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1290f) r5
            goto L_0x0191
        L_0x0178:
            androidx.viewpager.widget.ViewPager$f r5 = r0.mo6323a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f4860d
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x015a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.f4820f
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C1290f) r5
        L_0x0191:
            goto L_0x0128
        L_0x0192:
            r0.m6172a(r8, r10, r2)
            androidx.viewpager.widget.a r1 = r0.f4826i
            int r2 = r0.f4828j
            java.lang.Object r3 = r8.f4857a
            r1.mo4289b(r0, r2, r3)
        L_0x019e:
            androidx.viewpager.widget.a r1 = r0.f4826i
            r1.mo4283a(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x01a8:
            if (r2 >= r1) goto L_0x01d1
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            r4.f4850f = r2
            boolean r5 = r4.f4845a
            if (r5 != 0) goto L_0x01ce
            float r5 = r4.f4847c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ce
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo6341b(r3)
            if (r3 == 0) goto L_0x01ce
            float r5 = r3.f4860d
            r4.f4847c = r5
            int r3 = r3.f4858b
            r4.f4849e = r3
        L_0x01ce:
            int r2 = r2 + 1
            goto L_0x01a8
        L_0x01d1:
            r17.m6187j()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x0210
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01e5
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo6324a(r1)
            goto L_0x01e6
        L_0x01e5:
            r3 = 0
        L_0x01e6:
            if (r3 == 0) goto L_0x01ee
            int r1 = r3.f4858b
            int r2 = r0.f4828j
            if (r1 == r2) goto L_0x0210
        L_0x01ee:
            r1 = 0
        L_0x01ef:
            int r2 = r17.getChildCount()
            if (r1 >= r2) goto L_0x0210
            android.view.View r2 = r0.getChildAt(r1)
            androidx.viewpager.widget.ViewPager$f r3 = r0.mo6341b(r2)
            if (r3 == 0) goto L_0x020d
            int r3 = r3.f4858b
            int r4 = r0.f4828j
            if (r3 != r4) goto L_0x020d
            r3 = 2
            boolean r2 = r2.requestFocus(r3)
            if (r2 == 0) goto L_0x020d
            goto L_0x0210
        L_0x020d:
            int r1 = r1 + 1
            goto L_0x01ef
        L_0x0210:
            return
        L_0x0211:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x021e }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x021e }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x021e }
            goto L_0x0226
        L_0x021e:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0226:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f4818e
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            androidx.viewpager.widget.a r1 = r0.f4826i
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo6344c(int):void");
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.f4826i == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f4839u))) {
                z = true;
            }
            return z;
        }
        if (i > 0 && scrollX < ((int) (((float) clientWidth) * this.f4840v))) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f4833o = true;
        if (this.f4832n.isFinished() || !this.f4832n.computeScrollOffset()) {
            m6173a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f4832n.getCurrX();
        int currY = this.f4832n.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m6183f(currX)) {
                this.f4832n.abortAnimation();
                scrollTo(0, currY);
            }
        }
        ViewCompat.m2808H(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo6335a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C1290f b = mo6341b(childAt);
                if (b != null && b.f4858b == this.f4828j && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0.getCount() > 1) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r0 != r2) goto L_0x0018
            androidx.viewpager.widget.a r0 = r7.f4826i
            if (r0 == 0) goto L_0x0018
            int r0 = r0.getCount()
            if (r0 <= r2) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            android.widget.EdgeEffect r8 = r7.f4808R
            r8.finish()
            android.widget.EdgeEffect r8 = r7.f4809S
            r8.finish()
            goto L_0x00a9
        L_0x0024:
            android.widget.EdgeEffect r0 = r7.f4808R
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0065
            int r0 = r8.save()
            int r2 = r7.getHeight()
            int r3 = r7.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r7.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r7.getWidth()
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = -r2
            int r5 = r7.getPaddingTop()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r5 = r7.f4839u
            float r6 = (float) r3
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f4808R
            r4.setSize(r2, r3)
            android.widget.EdgeEffect r2 = r7.f4808R
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x0065:
            android.widget.EdgeEffect r0 = r7.f4809S
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00a9
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.f4840v
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f4809S
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.f4809S
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            androidx.core.view.ViewCompat.m2808H(r7)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4836r;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo6354e() {
        mo6344c(this.f4828j);
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C1295a getAdapter() {
        return this.f4826i;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f4821f0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) this.f4823g0.get(i2)).getLayoutParams()).f4850f;
    }

    public int getCurrentItem() {
        return this.f4828j;
    }

    public int getOffscreenPageLimit() {
        return this.f4791A;
    }

    public int getPageMargin() {
        return this.f4835q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4810T = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f4825h0);
        Scroller scroller = this.f4832n;
        if (scroller != null && !scroller.isFinished()) {
            this.f4832n.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f4835q > 0 && this.f4836r != null && this.f4820f.size() > 0 && this.f4826i != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.f4835q) / f3;
            int i = 0;
            C1290f fVar = (C1290f) this.f4820f.get(0);
            float f5 = fVar.f4861e;
            int size = this.f4820f.size();
            int i2 = fVar.f4858b;
            int i3 = ((C1290f) this.f4820f.get(size - 1)).f4858b;
            while (i2 < i3) {
                while (i2 > fVar.f4858b && i < size) {
                    i++;
                    fVar = (C1290f) this.f4820f.get(i);
                }
                if (i2 == fVar.f4858b) {
                    float f6 = fVar.f4861e;
                    float f7 = fVar.f4860d;
                    f = (f6 + f7) * f3;
                    f5 = f6 + f7 + f4;
                } else {
                    float a = this.f4826i.mo6401a(i2);
                    f = (f5 + a) * f3;
                    f5 += a + f4;
                }
                if (((float) this.f4835q) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.f4836r.setBounds(Math.round(f), this.f4837s, Math.round(((float) this.f4835q) + f), this.f4838t);
                    this.f4836r.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m6186i();
            return false;
        }
        if (action != 0) {
            if (this.f4792B) {
                return true;
            }
            if (this.f4793C) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f4799I = x;
            this.f4797G = x;
            float y = motionEvent.getY();
            this.f4800J = y;
            this.f4798H = y;
            this.f4801K = motionEvent2.getPointerId(0);
            this.f4793C = false;
            this.f4833o = true;
            this.f4832n.computeScrollOffset();
            if (this.f4827i0 != 2 || Math.abs(this.f4832n.getFinalX() - this.f4832n.getCurrX()) <= this.f4806P) {
                m6173a(false);
                this.f4792B = false;
            } else {
                this.f4832n.abortAnimation();
                this.f4844z = false;
                mo6354e();
                this.f4792B = true;
                m6178c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f4801K;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f4797G;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f4800J);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !m6174a(this.f4797G, f)) {
                    if (mo6336a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f4797G = x2;
                        this.f4798H = y2;
                        this.f4793C = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f4796F) && abs * 0.5f > abs2) {
                    this.f4792B = true;
                    m6178c(true);
                    setScrollState(1);
                    float f2 = this.f4799I;
                    float f3 = (float) this.f4796F;
                    this.f4797G = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.f4798H = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f4796F)) {
                    this.f4793C = true;
                }
                if (this.f4792B && m6177b(x2)) {
                    ViewCompat.m2808H(this);
                }
            }
        } else if (action == 6) {
            mo9720a(motionEvent);
        }
        if (this.f4802L == null) {
            this.f4802L = VelocityTracker.obtain();
        }
        this.f4802L.addMovement(motionEvent2);
        return this.f4792B;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i9 = paddingBottom;
        int i10 = 0;
        int i11 = paddingTop;
        int i12 = paddingLeft;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f4845a) {
                    int i14 = layoutParams.f4846b;
                    int i15 = i14 & 7;
                    int i16 = i14 & 112;
                    if (i15 == 1) {
                        i5 = Math.max((i7 - childAt.getMeasuredWidth()) / 2, i12);
                    } else if (i15 == 3) {
                        i5 = i12;
                        i12 = childAt.getMeasuredWidth() + i12;
                    } else if (i15 != 5) {
                        i5 = i12;
                    } else {
                        i5 = (i7 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                    }
                    if (i16 == 16) {
                        i6 = Math.max((i8 - childAt.getMeasuredHeight()) / 2, i11);
                    } else if (i16 == 48) {
                        i6 = i11;
                        i11 = childAt.getMeasuredHeight() + i11;
                    } else if (i16 != 80) {
                        i6 = i11;
                    } else {
                        i6 = (i8 - i9) - childAt.getMeasuredHeight();
                        i9 += childAt.getMeasuredHeight();
                    }
                    int i17 = i5 + scrollX;
                    childAt.layout(i17, i6, childAt.getMeasuredWidth() + i17, i6 + childAt.getMeasuredHeight());
                    i10++;
                }
            }
        }
        int i18 = (i7 - i12) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (!layoutParams2.f4845a) {
                    C1290f b = mo6341b(childAt2);
                    if (b != null) {
                        float f = (float) i18;
                        int i20 = ((int) (b.f4861e * f)) + i12;
                        if (layoutParams2.f4848d) {
                            layoutParams2.f4848d = false;
                            childAt2.measure(MeasureSpec.makeMeasureSpec((int) (f * layoutParams2.f4847c), 1073741824), MeasureSpec.makeMeasureSpec((i8 - i11) - i9, 1073741824));
                        }
                        childAt2.layout(i20, i11, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + i11);
                    }
                }
            }
        }
        this.f4837s = i11;
        this.f4838t = i8 - i9;
        this.f4812V = i10;
        if (this.f4810T) {
            z2 = false;
            m6170a(this.f4828j, false, 0, false);
        } else {
            z2 = false;
        }
        this.f4810T = z2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f4794D
            int r15 = java.lang.Math.min(r15, r1)
            r13.f4795E = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = r15
            r15 = r14
            r14 = 0
        L_0x0039:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r14 >= r1) goto L_0x00b4
            android.view.View r6 = r13.getChildAt(r14)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00b1
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r3 = (androidx.viewpager.widget.ViewPager.LayoutParams) r3
            if (r3 == 0) goto L_0x00b1
            boolean r7 = r3.f4845a
            if (r7 == 0) goto L_0x00b1
            int r7 = r3.f4846b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0067
            r9 = 80
            if (r7 != r9) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r7 = 0
            goto L_0x0068
        L_0x0067:
            r7 = 1
        L_0x0068:
            r9 = 3
            if (r8 == r9) goto L_0x0070
            r9 = 5
            if (r8 != r9) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r4 = 0
        L_0x0070:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0077
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x0077:
            if (r4 == 0) goto L_0x007c
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007e
        L_0x007c:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007e:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x008b
            if (r10 == r11) goto L_0x0087
            goto L_0x0088
        L_0x0087:
            r10 = r15
        L_0x0088:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008c
        L_0x008b:
            r10 = r15
        L_0x008c:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0095
            if (r3 == r11) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            r3 = r2
            goto L_0x0097
        L_0x0095:
            r3 = r2
            r5 = r9
        L_0x0097:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00aa
            int r3 = r6.getMeasuredHeight()
            int r2 = r2 - r3
            goto L_0x00b1
        L_0x00aa:
            if (r4 == 0) goto L_0x00b1
            int r3 = r6.getMeasuredWidth()
            int r15 = r15 - r3
        L_0x00b1:
            int r14 = r14 + 1
            goto L_0x0039
        L_0x00b4:
            android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            r13.f4841w = r14
            r13.f4842x = r4
            r13.mo6354e()
            r13.f4842x = r0
            int r14 = r13.getChildCount()
        L_0x00c8:
            if (r0 >= r14) goto L_0x00f2
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ef
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r2 = (androidx.viewpager.widget.ViewPager.LayoutParams) r2
            if (r2 == 0) goto L_0x00e0
            boolean r4 = r2.f4845a
            if (r4 != 0) goto L_0x00ef
        L_0x00e0:
            float r4 = (float) r15
            float r2 = r2.f4847c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f4841w
            r1.measure(r2, r4)
        L_0x00ef:
            int r0 = r0 + 1
            goto L_0x00c8
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C1290f b = mo6341b(childAt);
                if (b != null && b.f4858b == this.f4828j && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3548a());
        C1295a aVar = this.f4826i;
        if (aVar != null) {
            aVar.mo4282a(savedState.f4852h, savedState.f4853i);
            mo6329a(savedState.f4851g, false, true);
        } else {
            this.f4829k = savedState.f4851g;
            this.f4830l = savedState.f4852h;
            this.f4831m = savedState.f4853i;
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4851g = this.f4828j;
        C1295a aVar = this.f4826i;
        if (aVar != null) {
            savedState.f4852h = aVar.mo4286b();
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f4835q;
            m6169a(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f4807Q) {
            return true;
        }
        boolean z = false;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        C1295a aVar = this.f4826i;
        if (aVar == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.f4802L == null) {
            this.f4802L = VelocityTracker.obtain();
        }
        this.f4802L.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f4832n.abortAnimation();
            this.f4844z = false;
            mo6354e();
            float x = motionEvent.getX();
            this.f4799I = x;
            this.f4797G = x;
            float y = motionEvent.getY();
            this.f4800J = y;
            this.f4798H = y;
            this.f4801K = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.f4792B) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f4801K);
                    if (findPointerIndex == -1) {
                        z = m6186i();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f4797G);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f4798H);
                        if (abs > ((float) this.f4796F) && abs > abs2) {
                            this.f4792B = true;
                            m6178c(true);
                            float f = this.f4799I;
                            this.f4797G = x2 - f > 0.0f ? f + ((float) this.f4796F) : f - ((float) this.f4796F);
                            this.f4798H = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f4792B) {
                    z = false | m6177b(motionEvent.getX(motionEvent.findPointerIndex(this.f4801K)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.f4797G = motionEvent.getX(actionIndex);
                    this.f4801K = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    mo9720a(motionEvent);
                    this.f4797G = motionEvent.getX(motionEvent.findPointerIndex(this.f4801K));
                }
            } else if (this.f4792B) {
                m6170a(this.f4828j, true, 0, false);
                z = m6186i();
            }
        } else if (this.f4792B) {
            VelocityTracker velocityTracker = this.f4802L;
            velocityTracker.computeCurrentVelocity(C8733j.DEFAULT_IMAGE_TIMEOUT_MS, (float) this.f4804N);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f4801K);
            this.f4844z = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C1290f g = m6184g();
            float f2 = (float) clientWidth;
            mo6330a(m6167a(g.f4858b, ((((float) scrollX) / f2) - g.f4861e) / (g.f4860d + (((float) this.f4835q) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f4801K)) - this.f4799I)), true, true, xVelocity);
            z = m6186i();
        }
        if (z) {
            ViewCompat.m2808H(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f4842x) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C1295a aVar) {
        C1295a aVar2 = this.f4826i;
        if (aVar2 != null) {
            aVar2.mo6407b((DataSetObserver) null);
            this.f4826i.mo4288b((ViewGroup) this);
            for (int i = 0; i < this.f4820f.size(); i++) {
                C1290f fVar = (C1290f) this.f4820f.get(i);
                this.f4826i.mo4284a((ViewGroup) this, fVar.f4858b, fVar.f4857a);
            }
            this.f4826i.mo4283a((ViewGroup) this);
            this.f4820f.clear();
            m6185h();
            this.f4828j = 0;
            scrollTo(0, 0);
        }
        C1295a aVar3 = this.f4826i;
        this.f4826i = aVar;
        this.f4818e = 0;
        if (this.f4826i != null) {
            if (this.f4834p == null) {
                this.f4834p = new C1292h();
            }
            this.f4826i.mo6407b((DataSetObserver) this.f4834p);
            this.f4844z = false;
            boolean z = this.f4810T;
            this.f4810T = true;
            this.f4818e = this.f4826i.getCount();
            if (this.f4829k >= 0) {
                this.f4826i.mo4282a(this.f4830l, this.f4831m);
                mo6329a(this.f4829k, false, true);
                this.f4829k = -1;
                this.f4830l = null;
                this.f4831m = null;
            } else if (!z) {
                mo6354e();
            } else {
                requestLayout();
            }
        }
        List<OnAdapterChangeListener> list = this.f4816c0;
        if (list != null && !list.isEmpty()) {
            int size = this.f4816c0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((OnAdapterChangeListener) this.f4816c0.get(i2)).onAdapterChanged(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f4844z = false;
        mo6329a(i, !this.f4810T, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.f4791A) {
            this.f4791A = i;
            mo6354e();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f4814a0 = onPageChangeListener;
    }

    public void setPageMargin(int i) {
        int i2 = this.f4835q;
        this.f4835q = i;
        int width = getWidth();
        m6169a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4836r = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (this.f4827i0 != i) {
            this.f4827i0 = i;
            if (this.f4817d0 != null) {
                m6176b(i != 0);
            }
            m6181e(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4836r;
    }

    /* renamed from: e */
    private void m6181e(int i) {
        OnPageChangeListener onPageChangeListener = this.f4814a0;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
        List<OnPageChangeListener> list = this.f4813W;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f4813W.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrollStateChanged(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f4815b0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrollStateChanged(i);
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6329a(int i, boolean z, boolean z2) {
        mo6330a(i, z, z2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6330a(int i, boolean z, boolean z2, int i2) {
        C1295a aVar = this.f4826i;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f4828j != i || this.f4820f.size() == 0) {
            boolean z3 = true;
            if (i < 0) {
                i = 0;
            } else if (i >= this.f4826i.getCount()) {
                i = this.f4826i.getCount() - 1;
            }
            int i3 = this.f4791A;
            int i4 = this.f4828j;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f4820f.size(); i5++) {
                    ((C1290f) this.f4820f.get(i5)).f4859c = true;
                }
            }
            if (this.f4828j == i) {
                z3 = false;
            }
            if (this.f4810T) {
                this.f4828j = i;
                if (z3) {
                    m6180d(i);
                }
                requestLayout();
            } else {
                mo6344c(i);
                m6170a(i, z, i2, z3);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0540a.m2546c(getContext(), i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo6349d() {
        C1295a aVar = this.f4826i;
        if (aVar == null || this.f4828j >= aVar.getCount() - 1) {
            return false;
        }
        mo6328a(this.f4828j + 1, true);
        return true;
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6342b();
    }

    /* renamed from: f */
    private void m6182f() {
        this.f4792B = false;
        this.f4793C = false;
        VelocityTracker velocityTracker = this.f4802L;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4802L = null;
        }
    }

    /* renamed from: b */
    public void mo6343b(OnPageChangeListener onPageChangeListener) {
        List<OnPageChangeListener> list = this.f4813W;
        if (list != null) {
            list.remove(onPageChangeListener);
        }
    }

    /* renamed from: a */
    private void m6170a(int i, boolean z, int i2, boolean z2) {
        C1290f b = mo6340b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f4839u, Math.min(b.f4861e, this.f4840v))) : 0;
        if (z) {
            mo6327a(clientWidth, 0, i2);
            if (z2) {
                m6180d(i);
                return;
            }
            return;
        }
        if (z2) {
            m6180d(i);
        }
        m6173a(false);
        scrollTo(clientWidth, 0);
        m6183f(clientWidth);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1290f mo6341b(View view) {
        for (int i = 0; i < this.f4820f.size(); i++) {
            C1290f fVar = (C1290f) this.f4820f.get(i);
            if (this.f4826i.mo4285a(view, fVar.f4857a)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1290f mo6340b(int i) {
        for (int i2 = 0; i2 < this.f4820f.size(); i2++) {
            C1290f fVar = (C1290f) this.f4820f.get(i2);
            if (fVar.f4858b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m6175b(int i, float f, int i2) {
        OnPageChangeListener onPageChangeListener = this.f4814a0;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(i, f, i2);
        }
        List<OnPageChangeListener> list = this.f4813W;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.f4813W.get(i3);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.onPageScrolled(i, f, i2);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.f4815b0;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.onPageScrolled(i, f, i2);
        }
    }

    /* renamed from: a */
    public void mo6331a(OnPageChangeListener onPageChangeListener) {
        if (this.f4813W == null) {
            this.f4813W = new ArrayList();
        }
        this.f4813W.add(onPageChangeListener);
    }

    /* renamed from: a */
    public void mo6332a(boolean z, PageTransformer pageTransformer) {
        mo6333a(z, pageTransformer, 2);
    }

    /* renamed from: b */
    private void m6176b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f4819e0 : 0, null);
        }
    }

    /* renamed from: a */
    public void mo6333a(boolean z, PageTransformer pageTransformer, int i) {
        int i2 = 1;
        boolean z2 = pageTransformer != null;
        boolean z3 = z2 != (this.f4817d0 != null);
        this.f4817d0 = pageTransformer;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.f4821f0 = i2;
            this.f4819e0 = i;
        } else {
            this.f4821f0 = 0;
        }
        if (z3) {
            mo6354e();
        }
    }

    /* renamed from: b */
    private boolean m6177b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f4797G - f;
        this.f4797G = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f4839u * clientWidth;
        float f4 = this.f4840v * clientWidth;
        boolean z3 = false;
        C1290f fVar = (C1290f) this.f4820f.get(0);
        ArrayList<C1290f> arrayList = this.f4820f;
        C1290f fVar2 = (C1290f) arrayList.get(arrayList.size() - 1);
        if (fVar.f4858b != 0) {
            f3 = fVar.f4861e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f4858b != this.f4826i.getCount() - 1) {
            f4 = fVar2.f4861e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f4808R.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f4809S.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f4797G += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m6183f(i);
        return z3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo6322a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6327a(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f4832n;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f4833o ? this.f4832n.getCurrX() : this.f4832n.getStartX();
            this.f4832n.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            m6173a(false);
            mo6354e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float a = f2 + (mo6322a(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((f * this.f4826i.mo6401a(this.f4828j)) + ((float) this.f4835q))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.f4833o = false;
        this.f4832n.startScroll(i6, scrollY, i7, i8, min);
        ViewCompat.m2808H(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1290f mo6323a(int i, int i2) {
        C1290f fVar = new C1290f();
        fVar.f4858b = i;
        fVar.f4857a = this.f4826i.mo4281a((ViewGroup) this, i);
        fVar.f4860d = this.f4826i.mo6401a(i);
        if (i2 < 0 || i2 >= this.f4820f.size()) {
            this.f4820f.add(fVar);
        } else {
            this.f4820f.add(i2, fVar);
        }
        return fVar;
    }

    /* renamed from: c */
    private static boolean m6179c(View view) {
        return view.getClass().getAnnotation(C1289e.class) != null;
    }

    /* renamed from: c */
    private void m6178c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6325a() {
        int count = this.f4826i.getCount();
        this.f4818e = count;
        boolean z = this.f4820f.size() < (this.f4791A * 2) + 1 && this.f4820f.size() < count;
        int i = this.f4828j;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f4820f.size()) {
            C1290f fVar = (C1290f) this.f4820f.get(i2);
            int a = this.f4826i.mo6402a(fVar.f4857a);
            if (a != -1) {
                if (a == -2) {
                    this.f4820f.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f4826i.mo4288b((ViewGroup) this);
                        z2 = true;
                    }
                    this.f4826i.mo4284a((ViewGroup) this, fVar.f4858b, fVar.f4857a);
                    int i3 = this.f4828j;
                    if (i3 == fVar.f4858b) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = fVar.f4858b;
                    if (i4 != a) {
                        if (i4 == this.f4828j) {
                            i = a;
                        }
                        fVar.f4858b = a;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f4826i.mo4283a((ViewGroup) this);
        }
        Collections.sort(this.f4820f, f4788k0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.f4845a) {
                    layoutParams.f4847c = 0.0f;
                }
            }
            mo6329a(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo6345c() {
        int i = this.f4828j;
        if (i <= 0) {
            return false;
        }
        mo6328a(i - 1, true);
        return true;
    }

    /* renamed from: a */
    private void m6172a(C1290f fVar, int i, C1290f fVar2) {
        int i2;
        int i3;
        C1290f fVar3;
        C1290f fVar4;
        int count = this.f4826i.getCount();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f4835q) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f4858b;
            int i5 = fVar.f4858b;
            if (i4 < i5) {
                int i6 = 0;
                float f2 = fVar2.f4861e + fVar2.f4860d + f;
                while (true) {
                    i4++;
                    if (i4 > fVar.f4858b || i6 >= this.f4820f.size()) {
                        break;
                    }
                    Object obj = this.f4820f.get(i6);
                    while (true) {
                        fVar4 = (C1290f) obj;
                        if (i4 > fVar4.f4858b && i6 < this.f4820f.size() - 1) {
                            i6++;
                            obj = this.f4820f.get(i6);
                        }
                    }
                    while (i4 < fVar4.f4858b) {
                        f2 += this.f4826i.mo6401a(i4) + f;
                        i4++;
                    }
                    fVar4.f4861e = f2;
                    f2 += fVar4.f4860d + f;
                }
            } else if (i4 > i5) {
                int size = this.f4820f.size() - 1;
                float f3 = fVar2.f4861e;
                while (true) {
                    int i7 = i4 - 1;
                    if (i7 < fVar.f4858b || size < 0) {
                        break;
                    }
                    Object obj2 = this.f4820f.get(size);
                    while (true) {
                        fVar3 = (C1290f) obj2;
                        if (i7 < fVar3.f4858b && size > 0) {
                            size--;
                            obj2 = this.f4820f.get(size);
                        }
                    }
                    while (i4 > fVar3.f4858b) {
                        f3 -= this.f4826i.mo6401a(i4) + f;
                        i7 = i4 - 1;
                    }
                    f3 -= fVar3.f4860d + f;
                    fVar3.f4861e = f3;
                }
            }
        }
        int size2 = this.f4820f.size();
        float f4 = fVar.f4861e;
        int i8 = fVar.f4858b;
        int i9 = i8 - 1;
        this.f4839u = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = count - 1;
        this.f4840v = fVar.f4858b == i10 ? (fVar.f4861e + fVar.f4860d) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C1290f fVar5 = (C1290f) this.f4820f.get(i11);
            while (true) {
                i3 = fVar5.f4858b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f4826i.mo6401a(i9) + f;
                i9--;
            }
            f4 -= fVar5.f4860d + f;
            fVar5.f4861e = f4;
            if (i3 == 0) {
                this.f4839u = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f4861e + fVar.f4860d + f;
        int i12 = fVar.f4858b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C1290f fVar6 = (C1290f) this.f4820f.get(i13);
            while (true) {
                i2 = fVar6.f4858b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f4826i.mo6401a(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f4840v = (fVar6.f4860d + f5) - 1.0f;
            }
            fVar6.f4861e = f5;
            f5 += fVar6.f4860d + f;
            i13++;
            i12++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1290f mo6324a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo6341b(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m6169a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f4820f.isEmpty()) {
            C1290f b = mo6340b(this.f4828j);
            int min = (int) ((b != null ? Math.min(b.f4861e, this.f4840v) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m6173a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f4832n.isFinished()) {
            this.f4832n.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6326a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f4812V
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006d
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r4
            r4 = r3
            r3 = 0
        L_0x001d:
            if (r3 >= r6) goto L_0x006d
            android.view.View r8 = r12.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f4845a
            if (r10 != 0) goto L_0x002e
            goto L_0x006a
        L_0x002e:
            int r9 = r9.f4846b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004f
            r10 = 3
            if (r9 == r10) goto L_0x0049
            r10 = 5
            if (r9 == r10) goto L_0x003c
            r9 = r4
            goto L_0x005e
        L_0x003c:
            int r9 = r5 - r7
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r7 = r7 + r10
            goto L_0x005b
        L_0x0049:
            int r9 = r8.getWidth()
            int r9 = r9 + r4
            goto L_0x005e
        L_0x004f:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r4)
        L_0x005b:
            r11 = r9
            r9 = r4
            r4 = r11
        L_0x005e:
            int r4 = r4 + r0
            int r10 = r8.getLeft()
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x0069
            r8.offsetLeftAndRight(r4)
        L_0x0069:
            r4 = r9
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x001d
        L_0x006d:
            r12.m6175b(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$PageTransformer r13 = r12.f4817d0
            if (r13 == 0) goto L_0x00a1
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007c:
            if (r1 >= r14) goto L_0x00a1
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.f4845a
            if (r0 == 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r12.f4817d0
            r3.transformPage(r15, r0)
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x007c
        L_0x00a1:
            r12.f4811U = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.mo6326a(int, float, int):void");
    }

    /* renamed from: a */
    private void m6173a(boolean z) {
        boolean z2 = this.f4827i0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f4832n.isFinished()) {
                this.f4832n.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4832n.getCurrX();
                int currY = this.f4832n.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m6183f(currX);
                    }
                }
            }
        }
        this.f4844z = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f4820f.size(); i++) {
            C1290f fVar = (C1290f) this.f4820f.get(i);
            if (fVar.f4859c) {
                fVar.f4859c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            ViewCompat.m2826a((View) this, this.f4825h0);
        } else {
            this.f4825h0.run();
        }
    }

    /* renamed from: a */
    private boolean m6174a(float f, float f2) {
        return (f < ((float) this.f4795E) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f4795E)) && f2 < 0.0f);
    }

    /* renamed from: a */
    private int m6167a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f4805O || Math.abs(i2) <= this.f4803M) {
            i += (int) (f + (i >= this.f4828j ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f4820f.size() <= 0) {
            return i;
        }
        C1290f fVar = (C1290f) this.f4820f.get(0);
        ArrayList<C1290f> arrayList = this.f4820f;
        return Math.max(fVar.f4858b, Math.min(i, ((C1290f) arrayList.get(arrayList.size() - 1)).f4858b));
    }

    /* renamed from: a */
    private void mo9720a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4801K) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f4797G = motionEvent.getX(i);
            this.f4801K = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f4802L;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6336a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo6336a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: a */
    public boolean mo6335a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo6334a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo6334a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo6349d();
                } else {
                    return mo6334a(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo6345c();
            } else {
                return mo6334a(17);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo6334a(int i) {
        boolean requestFocus;
        boolean z;
        View findFocus = findFocus();
        boolean z2 = false;
        View view = null;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("arrowScroll tried to find focus based on non-child current focused view ");
                    sb2.append(sb.toString());
                    Log.e("ViewPager", sb2.toString());
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus != null && findNextFocus != view) {
            if (i == 17) {
                int i2 = m6168a(this.f4824h, findNextFocus).left;
                int i3 = m6168a(this.f4824h, view).left;
                if (view == null || i2 < i3) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = mo6345c();
                }
            } else if (i == 66) {
                int i4 = m6168a(this.f4824h, findNextFocus).left;
                int i5 = m6168a(this.f4824h, view).left;
                if (view == null || i4 > i5) {
                    requestFocus = findNextFocus.requestFocus();
                } else {
                    requestFocus = mo6349d();
                }
            }
            z2 = requestFocus;
        } else if (i == 17 || i == 1) {
            z2 = mo6345c();
        } else if (i == 66 || i == 2) {
            z2 = mo6349d();
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    /* renamed from: a */
    private Rect m6168a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }
}
