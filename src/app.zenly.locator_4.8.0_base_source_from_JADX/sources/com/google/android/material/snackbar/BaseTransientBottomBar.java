package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.C0489d;
import androidx.core.view.C0615a;
import androidx.core.view.C0666p;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.C0628c;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.behavior.SwipeDismissBehavior.OnDismissListener;
import com.google.android.material.internal.C10793g;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.List;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12073h;
import p333g.p357d.p358a.p361b.C12076k;
import p333g.p357d.p358a.p361b.p362l.C12077a;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: j */
    static final Handler f28216j = new Handler(Looper.getMainLooper(), new C10799c());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final boolean f28217k;

    /* renamed from: l */
    private static final int[] f28218l = {C12067b.snackbarStyle};

    /* renamed from: a */
    private final ViewGroup f28219a;

    /* renamed from: b */
    private final Context f28220b;

    /* renamed from: c */
    protected final C10811n f28221c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ContentViewCallback f28222d;

    /* renamed from: e */
    private int f28223e;

    /* renamed from: f */
    private List<C10809l<B>> f28224f;

    /* renamed from: g */
    private Behavior f28225g;

    /* renamed from: h */
    private final AccessibilityManager f28226h;

    /* renamed from: i */
    final C10816b f28227i = new C10802f();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k */
        private final C10810m f28228k = new C10810m(this);

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f28228k.mo31292a(coordinatorLayout, view, motionEvent);
            return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m27814a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f28228k.mo31293a(baseTransientBottomBar);
        }

        /* renamed from: a */
        public boolean mo30633a(View view) {
            return this.f28228k.mo31294a(view);
        }
    }

    @Deprecated
    public interface ContentViewCallback extends ContentViewCallback {
    }

    protected interface OnAttachStateChangeListener {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    protected interface OnLayoutChangeListener {
        void onLayoutChange(View view, int i, int i2, int i3, int i4);
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    class C10797a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f28229a;

        C10797a(int i) {
            this.f28229a = i;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo31266c(this.f28229a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f28222d.animateContentOut(0, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    class C10798b implements AnimatorUpdateListener {

        /* renamed from: a */
        private int f28231a = 0;

        C10798b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f28217k) {
                ViewCompat.m2848e(BaseTransientBottomBar.this.f28221c, intValue - this.f28231a);
            } else {
                BaseTransientBottomBar.this.f28221c.setTranslationY((float) intValue);
            }
            this.f28231a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    static class C10799c implements Callback {
        C10799c() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                ((BaseTransientBottomBar) message.obj).mo31276l();
                return true;
            } else if (i != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).mo31264b(message.arg1);
                return true;
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    class C10800d implements OnApplyWindowInsetsListener {
        C10800d(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public C0666p onApplyWindowInsets(View view, C0666p pVar) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), pVar.mo3442a());
            return pVar;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    class C10801e extends C0615a {
        C10801e() {
        }

        /* renamed from: a */
        public void mo3292a(View view, C0628c cVar) {
            super.mo3292a(view, cVar);
            cVar.mo3317a(1048576);
            cVar.mo3344e(true);
        }

        /* renamed from: a */
        public boolean mo3293a(View view, int i, Bundle bundle) {
            if (i != 1048576) {
                return super.mo3293a(view, i, bundle);
            }
            BaseTransientBottomBar.this.mo31263b();
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$f */
    class C10802f implements C10816b {
        C10802f() {
        }

        /* renamed from: a */
        public void mo31284a(int i) {
            Handler handler = BaseTransientBottomBar.f28216j;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        public void show() {
            Handler handler = BaseTransientBottomBar.f28216j;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$g */
    class C10803g implements OnDismissListener {
        C10803g() {
        }

        public void onDismiss(View view) {
            view.setVisibility(8);
            BaseTransientBottomBar.this.mo31262a(0);
        }

        public void onDragStateChanged(int i) {
            if (i == 0) {
                C10814a.m27838a().mo31319e(BaseTransientBottomBar.this.f28227i);
            } else if (i == 1 || i == 2) {
                C10814a.m27838a().mo31318d(BaseTransientBottomBar.this.f28227i);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h */
    class C10804h implements OnAttachStateChangeListener {

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$h$a */
        class C10805a implements Runnable {
            C10805a() {
            }

            public void run() {
                BaseTransientBottomBar.this.mo31266c(3);
            }
        }

        C10804h() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.mo31272h()) {
                BaseTransientBottomBar.f28216j.post(new C10805a());
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$i */
    class C10806i implements OnLayoutChangeListener {
        C10806i() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4) {
            BaseTransientBottomBar.this.f28221c.setOnLayoutChangeListener(null);
            if (BaseTransientBottomBar.this.mo31274j()) {
                BaseTransientBottomBar.this.mo31261a();
            } else {
                BaseTransientBottomBar.this.mo31273i();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$j */
    class C10807j extends AnimatorListenerAdapter {
        C10807j() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.mo31273i();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f28222d.animateContentIn(70, 180);
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$k */
    class C10808k implements AnimatorUpdateListener {

        /* renamed from: a */
        private int f28240a = this.f28241b;

        /* renamed from: b */
        final /* synthetic */ int f28241b;

        C10808k(int i) {
            this.f28241b = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f28217k) {
                ViewCompat.m2848e(BaseTransientBottomBar.this.f28221c, intValue - this.f28240a);
            } else {
                BaseTransientBottomBar.this.f28221c.setTranslationY((float) intValue);
            }
            this.f28240a = intValue;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$l */
    public static abstract class C10809l<B> {
        /* renamed from: a */
        public void mo31290a(B b) {
        }

        /* renamed from: a */
        public void mo31291a(B b, int i) {
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$m */
    public static class C10810m {

        /* renamed from: a */
        private C10816b f28243a;

        public C10810m(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.mo30634b(0.1f);
            swipeDismissBehavior.mo30630a(0.6f);
            swipeDismissBehavior.mo30631a(0);
        }

        /* renamed from: a */
        public void mo31293a(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f28243a = baseTransientBottomBar.f28227i;
        }

        /* renamed from: a */
        public boolean mo31294a(View view) {
            return view instanceof C10811n;
        }

        /* renamed from: a */
        public void mo31292a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C10814a.m27838a().mo31319e(this.f28243a);
                }
            } else if (coordinatorLayout.mo2815a(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C10814a.m27838a().mo31318d(this.f28243a);
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n */
    protected static class C10811n extends FrameLayout {

        /* renamed from: e */
        private final AccessibilityManager f28244e;

        /* renamed from: f */
        private final TouchExplorationStateChangeListener f28245f;

        /* renamed from: g */
        private OnLayoutChangeListener f28246g;

        /* renamed from: h */
        private OnAttachStateChangeListener f28247h;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$n$a */
        class C10812a implements TouchExplorationStateChangeListener {
            C10812a() {
            }

            public void onTouchExplorationStateChanged(boolean z) {
                C10811n.this.setClickableOrFocusableBasedOnAccessibility(z);
            }
        }

        protected C10811n(Context context) {
            this(context, null);
        }

        /* access modifiers changed from: private */
        public void setClickableOrFocusableBasedOnAccessibility(boolean z) {
            setClickable(!z);
            setFocusable(z);
        }

        /* access modifiers changed from: protected */
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            OnAttachStateChangeListener onAttachStateChangeListener = this.f28247h;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewAttachedToWindow(this);
            }
            ViewCompat.m2809I(this);
        }

        /* access modifiers changed from: protected */
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            OnAttachStateChangeListener onAttachStateChangeListener = this.f28247h;
            if (onAttachStateChangeListener != null) {
                onAttachStateChangeListener.onViewDetachedFromWindow(this);
            }
            AccessibilityManagerCompat.m2907b(this.f28244e, this.f28245f);
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            OnLayoutChangeListener onLayoutChangeListener = this.f28246g;
            if (onLayoutChangeListener != null) {
                onLayoutChangeListener.onLayoutChange(this, i, i2, i3, i4);
            }
        }

        /* access modifiers changed from: 0000 */
        public void setOnAttachStateChangeListener(OnAttachStateChangeListener onAttachStateChangeListener) {
            this.f28247h = onAttachStateChangeListener;
        }

        /* access modifiers changed from: 0000 */
        public void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
            this.f28246g = onLayoutChangeListener;
        }

        protected C10811n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12076k.SnackbarLayout);
            if (obtainStyledAttributes.hasValue(C12076k.SnackbarLayout_elevation)) {
                ViewCompat.m2835b((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C12076k.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            this.f28244e = (AccessibilityManager) context.getSystemService("accessibility");
            this.f28245f = new C10812a();
            AccessibilityManagerCompat.m2906a(this.f28244e, this.f28245f);
            setClickableOrFocusableBasedOnAccessibility(this.f28244e.isTouchExplorationEnabled());
        }
    }

    static {
        int i = VERSION.SDK_INT;
        f28217k = i >= 16 && i <= 19;
    }

    protected BaseTransientBottomBar(ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (contentViewCallback != null) {
            this.f28219a = viewGroup;
            this.f28222d = contentViewCallback;
            this.f28220b = viewGroup.getContext();
            C10793g.m27771a(this.f28220b);
            this.f28221c = (C10811n) LayoutInflater.from(this.f28220b).inflate(mo31270f(), this.f28219a, false);
            this.f28221c.addView(view);
            ViewCompat.m2850f(this.f28221c, 1);
            ViewCompat.m2852g(this.f28221c, 1);
            ViewCompat.m2829a((View) this.f28221c, true);
            ViewCompat.m2823a((View) this.f28221c, (OnApplyWindowInsetsListener) new C10800d(this));
            ViewCompat.m2824a((View) this.f28221c, (C0615a) new C10801e());
            this.f28226h = (AccessibilityManager) this.f28220b.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    /* renamed from: n */
    private int m27796n() {
        int height = this.f28221c.getHeight();
        LayoutParams layoutParams = this.f28221c.getLayoutParams();
        return layoutParams instanceof MarginLayoutParams ? height + ((MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* renamed from: b */
    public void mo31263b() {
        mo31262a(3);
    }

    /* renamed from: c */
    public Context mo31265c() {
        return this.f28220b;
    }

    /* renamed from: d */
    public B mo31268d(int i) {
        this.f28223e = i;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public SwipeDismissBehavior<? extends View> mo31269e() {
        return new Behavior();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo31270f() {
        return mo31271g() ? C12073h.mtrl_layout_snackbar : C12073h.design_layout_snackbar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo31271g() {
        TypedArray obtainStyledAttributes = this.f28220b.obtainStyledAttributes(f28218l);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean mo31272h() {
        return C10814a.m27838a().mo31315a(this.f28227i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo31273i() {
        C10814a.m27838a().mo31317c(this.f28227i);
        List<C10809l<B>> list = this.f28224f;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C10809l) this.f28224f.get(size)).mo31290a(this);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo31274j() {
        List enabledAccessibilityServiceList = this.f28226h.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public void mo31275k() {
        C10814a.m27838a().mo31312a(mo31267d(), this.f28227i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo31276l() {
        if (this.f28221c.getParent() == null) {
            LayoutParams layoutParams = this.f28221c.getLayoutParams();
            if (layoutParams instanceof C0489d) {
                C0489d dVar = (C0489d) layoutParams;
                SwipeDismissBehavior swipeDismissBehavior = this.f28225g;
                if (swipeDismissBehavior == null) {
                    swipeDismissBehavior = mo31269e();
                }
                if (swipeDismissBehavior instanceof Behavior) {
                    ((Behavior) swipeDismissBehavior).m27814a(this);
                }
                swipeDismissBehavior.mo30632a((OnDismissListener) new C10803g());
                dVar.mo2892a((androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior) swipeDismissBehavior);
                dVar.f2367g = 80;
            }
            this.f28219a.addView(this.f28221c);
        }
        this.f28221c.setOnAttachStateChangeListener(new C10804h());
        if (!ViewCompat.m2804D(this.f28221c)) {
            this.f28221c.setOnLayoutChangeListener(new C10806i());
        } else if (mo31274j()) {
            mo31261a();
        } else {
            mo31273i();
        }
    }

    /* renamed from: e */
    private void mo31305e(int i) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, m27796n()});
        valueAnimator.setInterpolator(C12077a.f31461b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C10797a(i));
        valueAnimator.addUpdateListener(new C10798b());
        valueAnimator.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31262a(int i) {
        C10814a.m27838a().mo31313a(this.f28227i, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo31264b(int i) {
        if (!mo31274j() || this.f28221c.getVisibility() != 0) {
            mo31266c(i);
        } else {
            mo31305e(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo31266c(int i) {
        C10814a.m27838a().mo31316b(this.f28227i);
        List<C10809l<B>> list = this.f28224f;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C10809l) this.f28224f.get(size)).mo31291a(this, i);
            }
        }
        ViewParent parent = this.f28221c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f28221c);
        }
    }

    /* renamed from: d */
    public int mo31267d() {
        return this.f28223e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo31261a() {
        int n = m27796n();
        if (f28217k) {
            ViewCompat.m2848e(this.f28221c, n);
        } else {
            this.f28221c.setTranslationY((float) n);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{n, 0});
        valueAnimator.setInterpolator(C12077a.f31461b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new C10807j());
        valueAnimator.addUpdateListener(new C10808k(n));
        valueAnimator.start();
    }
}
