package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.p004os.C0563a;
import androidx.core.view.accessibility.C0628c;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p214e.p234h.C7612c;

public class ViewCompat {

    /* renamed from: a */
    private static Field f2746a;

    /* renamed from: b */
    private static boolean f2747b;

    /* renamed from: c */
    private static Field f2748c;

    /* renamed from: d */
    private static boolean f2749d;

    /* renamed from: e */
    private static WeakHashMap<View, String> f2750e;

    /* renamed from: f */
    private static WeakHashMap<View, C0661n> f2751f = null;

    /* renamed from: g */
    private static Field f2752g;

    /* renamed from: h */
    private static boolean f2753h = false;

    /* renamed from: i */
    private static ThreadLocal<Rect> f2754i;

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: androidx.core.view.ViewCompat$a */
    static class C0608a implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ OnApplyWindowInsetsListener f2755a;

        C0608a(OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            this.f2755a = onApplyWindowInsetsListener;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) C0666p.m3082a(this.f2755a.onApplyWindowInsets(view, C0666p.m3081a((Object) windowInsets)));
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$b */
    static class C0609b extends C0613f<Boolean> {
        C0609b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Boolean m2875a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$c */
    static class C0610c extends C0613f<CharSequence> {
        C0610c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence m2877a(View view) {
            return view.getAccessibilityPaneTitle();
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$d */
    static class C0611d extends C0613f<Boolean> {
        C0611d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Boolean m2879a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(19)
    /* renamed from: androidx.core.view.ViewCompat$e */
    static class C0612e implements OnGlobalLayoutListener, OnAttachStateChangeListener {

        /* renamed from: e */
        private WeakHashMap<View, Boolean> f2756e = new WeakHashMap<>();

        C0612e() {
        }

        /* renamed from: a */
        private void m2881a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    ViewCompat.m2842c(view, 16);
                }
                this.f2756e.put(view, Boolean.valueOf(z2));
            }
        }

        public void onGlobalLayout() {
            for (Entry entry : this.f2756e.entrySet()) {
                m2881a((View) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m2880a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }

        /* renamed from: a */
        private void m2880a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$f */
    static abstract class C0613f<T> {

        /* renamed from: a */
        private final int f2757a;

        /* renamed from: b */
        private final Class<T> f2758b;

        /* renamed from: c */
        private final int f2759c;

        C0613f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        /* renamed from: a */
        private boolean m2882a() {
            return VERSION.SDK_INT >= 19;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo3282a(View view);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public T mo3286b(View view) {
            if (m2883b()) {
                return mo3282a(view);
            }
            if (m2882a()) {
                T tag = view.getTag(this.f2757a);
                if (this.f2758b.isInstance(tag)) {
                    return tag;
                }
            }
            return null;
        }

        C0613f(int i, Class<T> cls, int i2, int i3) {
            this.f2757a = i;
            this.f2758b = cls;
            this.f2759c = i3;
        }

        /* renamed from: b */
        private boolean m2883b() {
            return VERSION.SDK_INT >= this.f2759c;
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$g */
    static class C0614g {

        /* renamed from: d */
        private static final ArrayList<WeakReference<View>> f2760d = new ArrayList<>();

        /* renamed from: a */
        private WeakHashMap<View, Boolean> f2761a = null;

        /* renamed from: b */
        private SparseArray<WeakReference<View>> f2762b = null;

        /* renamed from: c */
        private WeakReference<KeyEvent> f2763c = null;

        C0614g() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m2886a() {
            if (this.f2762b == null) {
                this.f2762b = new SparseArray<>();
            }
            return this.f2762b;
        }

        /* renamed from: b */
        private View m2888b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f2761a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b = m2888b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b != null) {
                            return b;
                        }
                    }
                }
                if (m2890c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: c */
        private boolean m2890c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C7612c.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: a */
        static C0614g m2887a(View view) {
            C0614g gVar = (C0614g) view.getTag(C7612c.tag_unhandled_key_event_manager);
            if (gVar != null) {
                return gVar;
            }
            C0614g gVar2 = new C0614g();
            view.setTag(C7612c.tag_unhandled_key_event_manager, gVar2);
            return gVar2;
        }

        /* renamed from: b */
        private void m2889b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f2761a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!f2760d.isEmpty()) {
                synchronized (f2760d) {
                    if (this.f2761a == null) {
                        this.f2761a = new WeakHashMap<>();
                    }
                    for (int size = f2760d.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f2760d.get(size)).get();
                        if (view == null) {
                            f2760d.remove(size);
                        } else {
                            this.f2761a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f2761a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3288a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m2889b();
            }
            View b = m2888b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m2886a().put(keyCode, new WeakReference(b));
                }
            }
            return b != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3287a(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.f2763c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f2763c = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray a = m2886a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference2 = (WeakReference) a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference) a.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && ViewCompat.m2802B(view)) {
                m2890c(view, keyEvent);
            }
            return true;
        }
    }

    static {
        new AtomicInteger(1);
        int[] iArr = {C7612c.accessibility_custom_action_0, C7612c.accessibility_custom_action_1, C7612c.accessibility_custom_action_2, C7612c.accessibility_custom_action_3, C7612c.accessibility_custom_action_4, C7612c.accessibility_custom_action_5, C7612c.accessibility_custom_action_6, C7612c.accessibility_custom_action_7, C7612c.accessibility_custom_action_8, C7612c.accessibility_custom_action_9, C7612c.accessibility_custom_action_10, C7612c.accessibility_custom_action_11, C7612c.accessibility_custom_action_12, C7612c.accessibility_custom_action_13, C7612c.accessibility_custom_action_14, C7612c.accessibility_custom_action_15, C7612c.accessibility_custom_action_16, C7612c.accessibility_custom_action_17, C7612c.accessibility_custom_action_18, C7612c.accessibility_custom_action_19, C7612c.accessibility_custom_action_20, C7612c.accessibility_custom_action_21, C7612c.accessibility_custom_action_22, C7612c.accessibility_custom_action_23, C7612c.accessibility_custom_action_24, C7612c.accessibility_custom_action_25, C7612c.accessibility_custom_action_26, C7612c.accessibility_custom_action_27, C7612c.accessibility_custom_action_28, C7612c.accessibility_custom_action_29, C7612c.accessibility_custom_action_30, C7612c.accessibility_custom_action_31};
        new C0612e();
    }

    /* renamed from: A */
    public static boolean m2801A(View view) {
        Boolean bool = (Boolean) m2812a().mo3286b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: B */
    public static boolean m2802B(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    /* renamed from: C */
    public static boolean m2803C(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.isImportantForAutofill();
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m2804D(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: E */
    public static boolean m2805E(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof NestedScrollingChild) {
            return ((NestedScrollingChild) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: F */
    public static boolean m2806F(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: G */
    public static boolean m2807G(View view) {
        Boolean bool = (Boolean) m2844d().mo3286b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: H */
    public static void m2808H(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: I */
    public static void m2809I(View view) {
        int i = VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: J */
    public static void m2810J(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof NestedScrollingChild) {
            ((NestedScrollingChild) view).stopNestedScroll();
        }
    }

    /* renamed from: K */
    private static void m2811K(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static void m2825a(View view, C0628c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo3370t());
    }

    /* renamed from: b */
    private static Rect m2832b() {
        if (f2754i == null) {
            f2754i = new ThreadLocal<>();
        }
        Rect rect = (Rect) f2754i.get();
        if (rect == null) {
            rect = new Rect();
            f2754i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: c */
    private static AccessibilityDelegate m2839c(View view) {
        if (C0563a.m2669a()) {
            return view.getAccessibilityDelegate();
        }
        return m2843d(view);
    }

    /* renamed from: d */
    private static AccessibilityDelegate m2843d(View view) {
        if (f2753h) {
            return null;
        }
        if (f2752g == null) {
            try {
                f2752g = View.class.getDeclaredField("mAccessibilityDelegate");
                f2752g.setAccessible(true);
            } catch (Throwable unused) {
                f2753h = true;
                return null;
            }
        }
        try {
            Object obj = f2752g.get(view);
            if (obj instanceof AccessibilityDelegate) {
                return (AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2753h = true;
            return null;
        }
    }

    /* renamed from: e */
    public static int m2847e(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: f */
    public static void m2850f(View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: g */
    public static void m2852g(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 19) {
            view.setImportantForAccessibility(i);
        } else if (i2 >= 16) {
            if (i == 4) {
                i = 2;
            }
            view.setImportantForAccessibility(i);
        }
    }

    /* renamed from: h */
    public static void m2854h(View view, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: i */
    public static void m2856i(View view, int i) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).stopNestedScroll(i);
        } else if (i == 0) {
            m2810J(view);
        }
    }

    /* renamed from: j */
    public static Display m2857j(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m2802B(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: k */
    public static float m2858k(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: l */
    public static boolean m2859l(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: m */
    public static int m2860m(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: n */
    public static int m2861n(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: o */
    public static int m2862o(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: p */
    public static int m2863p(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f2749d) {
            try {
                f2748c = View.class.getDeclaredField("mMinHeight");
                f2748c.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2749d = true;
        }
        Field field = f2748c;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: q */
    public static int m2864q(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f2747b) {
            try {
                f2746a = View.class.getDeclaredField("mMinWidth");
                f2746a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2747b = true;
        }
        Field field = f2746a;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: r */
    public static int m2865r(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: s */
    public static int m2866s(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: t */
    public static String m2867t(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f2750e;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    /* renamed from: u */
    public static float m2868u(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    /* renamed from: v */
    public static int m2869v(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: w */
    public static float m2870w(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: x */
    public static boolean m2871x(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m2872y(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: z */
    public static boolean m2873z(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: a */
    public static void m2824a(View view, C0615a aVar) {
        AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (m2839c(view) instanceof C0616a)) {
            aVar = new C0615a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.mo3289a();
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    /* renamed from: e */
    public static void m2848e(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect b = m2832b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2836b(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m2836b(view, i);
        }
    }

    /* renamed from: f */
    public static CharSequence m2849f(View view) {
        return (CharSequence) m2840c().mo3286b(view);
    }

    /* renamed from: h */
    public static Mode m2853h(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        return view instanceof TintableBackgroundView ? ((TintableBackgroundView) view).getSupportBackgroundTintMode() : null;
    }

    /* renamed from: c */
    public static void m2841c(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: g */
    public static ColorStateList m2851g(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        return view instanceof TintableBackgroundView ? ((TintableBackgroundView) view).getSupportBackgroundTintList() : null;
    }

    /* renamed from: i */
    public static Rect m2855i(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: a */
    public static void m2826a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    /* renamed from: c */
    private static C0613f<CharSequence> m2840c() {
        return new C0610c(C7612c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: b */
    public static C0615a m2833b(View view) {
        AccessibilityDelegate c = m2839c(view);
        if (c == null) {
            return null;
        }
        if (c instanceof C0616a) {
            return ((C0616a) c).f2767a;
        }
        return new C0615a(c);
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(19)
    /* renamed from: c */
    static void m2842c(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m2849f(view) != null;
            if (m2847e(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : ItemAnimator.FLAG_MOVED);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2827a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static boolean m2830a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: b */
    public static void m2837b(View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: d */
    public static void m2845d(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    /* renamed from: a */
    public static void m2818a(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public static void m2835b(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: d */
    public static void m2846d(View view, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect b = m2832b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2816a(view, i);
            if (z && b.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(b);
            }
        } else {
            m2816a(view, i);
        }
    }

    /* renamed from: b */
    public static C0666p m2834b(View view, C0666p pVar) {
        if (VERSION.SDK_INT < 21) {
            return pVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0666p.m3082a(pVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0666p.m3081a((Object) windowInsets);
    }

    /* renamed from: a */
    public static C0661n m2813a(View view) {
        if (f2751f == null) {
            f2751f = new WeakHashMap<>();
        }
        C0661n nVar = (C0661n) f2751f.get(view);
        if (nVar != null) {
            return nVar;
        }
        C0661n nVar2 = new C0661n(view);
        f2751f.put(view, nVar2);
        return nVar2;
    }

    @Deprecated
    /* renamed from: a */
    public static void m2815a(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: b */
    private static void m2836b(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m2811K(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2811K((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m2828a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f2750e == null) {
            f2750e = new WeakHashMap<>();
        }
        f2750e.put(view, str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m2829a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: b */
    static boolean m2838b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0614g.m2887a(view).mo3287a(keyEvent);
    }

    /* renamed from: a */
    public static void m2823a(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        if (VERSION.SDK_INT >= 21) {
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new C0608a(onApplyWindowInsetsListener));
        }
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    /* renamed from: d */
    private static C0613f<Boolean> m2844d() {
        return new C0609b(C7612c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: a */
    public static C0666p m2814a(View view, C0666p pVar) {
        if (VERSION.SDK_INT < 21) {
            return pVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0666p.m3082a(pVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (!dispatchApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0666p.m3081a((Object) windowInsets);
    }

    /* renamed from: a */
    public static void m2822a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m2819a(View view, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof TintableBackgroundView) {
            ((TintableBackgroundView) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2820a(View view, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof TintableBackgroundView) {
            ((TintableBackgroundView) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    private static void m2816a(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m2811K(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2811K((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m2821a(View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m2817a(View view, int i, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    static boolean m2831a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0614g.m2887a(view).mo3288a(view, keyEvent);
    }

    @SuppressLint({"BanTargetApiAnnotation"})
    @TargetApi(28)
    /* renamed from: a */
    private static C0613f<Boolean> m2812a() {
        return new C0611d(C7612c.tag_accessibility_heading, Boolean.class, 28);
    }
}
