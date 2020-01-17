package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0615a;
import androidx.core.view.C0660m;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0628c;
import androidx.core.view.accessibility.C0632d;
import androidx.core.view.accessibility.C0635e;
import androidx.customview.widget.FocusStrategy.BoundsAdapter;
import androidx.customview.widget.FocusStrategy.CollectionAdapter;
import java.util.ArrayList;
import java.util.List;
import p214e.p228e.C7585h;

/* renamed from: androidx.customview.widget.a */
public abstract class C0691a extends C0615a {

    /* renamed from: n */
    private static final Rect f2937n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    private static final BoundsAdapter<C0628c> f2938o = new C0692a();

    /* renamed from: p */
    private static final CollectionAdapter<C7585h<C0628c>, C0628c> f2939p = new C0693b();

    /* renamed from: d */
    private final Rect f2940d;

    /* renamed from: e */
    private final Rect f2941e;

    /* renamed from: f */
    private final Rect f2942f;

    /* renamed from: g */
    private final int[] f2943g;

    /* renamed from: h */
    private final AccessibilityManager f2944h;

    /* renamed from: i */
    private final View f2945i;

    /* renamed from: j */
    private C0694c f2946j;

    /* renamed from: k */
    int f2947k;

    /* renamed from: l */
    int f2948l;

    /* renamed from: m */
    private int f2949m;

    /* renamed from: androidx.customview.widget.a$a */
    static class C0692a implements BoundsAdapter<C0628c> {
        C0692a() {
        }

        /* renamed from: a */
        public void obtainBounds(C0628c cVar, Rect rect) {
            cVar.mo3318a(rect);
        }
    }

    /* renamed from: androidx.customview.widget.a$b */
    static class C0693b implements CollectionAdapter<C7585h<C0628c>, C0628c> {
        C0693b() {
        }

        /* renamed from: a */
        public C0628c get(C7585h<C0628c> hVar, int i) {
            return (C0628c) hVar.mo19627f(i);
        }

        /* renamed from: a */
        public int size(C7585h<C0628c> hVar) {
            return hVar.mo19615a();
        }
    }

    /* renamed from: androidx.customview.widget.a$c */
    private class C0694c extends C0632d {
        C0694c() {
        }

        /* renamed from: a */
        public C0628c mo3374a(int i) {
            return C0628c.m2913a(C0691a.this.mo3570b(i));
        }

        /* renamed from: b */
        public C0628c mo3378b(int i) {
            int i2 = i == 2 ? C0691a.this.f2947k : C0691a.this.f2948l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo3374a(i2);
        }

        /* renamed from: a */
        public boolean mo3377a(int i, int i2, Bundle bundle) {
            return C0691a.this.mo3571b(i, i2, bundle);
        }
    }

    /* renamed from: b */
    private boolean m3230b(int i, Rect rect) {
        C0628c cVar;
        C0628c cVar2;
        C7585h d = m3234d();
        int i2 = this.f2948l;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = (C0628c) d.mo19617a(i2);
        }
        Object obj = cVar;
        if (i == 1 || i == 2) {
            cVar2 = (C0628c) FocusStrategy.m3210a(d, f2939p, f2938o, obj, i, ViewCompat.m2862o(this.f2945i) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f2948l;
            if (i4 != Integer.MIN_VALUE) {
                m3225a(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m3224a(this.f2945i, i, rect2);
            }
            cVar2 = (C0628c) FocusStrategy.m3211a(d, f2939p, f2938o, obj, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (cVar2 != null) {
            i3 = d.mo19621c(d.mo19616a(cVar2));
        }
        return mo3572c(i3);
    }

    /* renamed from: c */
    private AccessibilityEvent m3231c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0628c b = mo3570b(i);
        obtain.getText().add(b.mo3349g());
        obtain.setContentDescription(b.mo3338d());
        obtain.setScrollable(b.mo3367q());
        obtain.setPassword(b.mo3366p());
        obtain.setEnabled(b.mo3361l());
        obtain.setChecked(b.mo3357j());
        mo3558a(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b.mo3333c());
            C0635e.m2989a(obtain, this.f2945i, i);
            obtain.setPackageName(this.f2945i.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: d */
    private C7585h<C0628c> m3234d() {
        ArrayList arrayList = new ArrayList();
        mo3563a((List<Integer>) arrayList);
        C7585h<C0628c> hVar = new C7585h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.mo19622c(i, m3237f(i));
        }
        return hVar;
    }

    /* renamed from: e */
    private AccessibilityEvent m3236e(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f2945i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: f */
    private C0628c m3237f(int i) {
        C0628c w = C0628c.m2925w();
        w.mo3348f(true);
        w.mo3350g(true);
        w.mo3322a((CharSequence) "android.view.View");
        w.mo3334c(f2937n);
        w.mo3339d(f2937n);
        w.mo3319a(this.f2945i);
        mo3559a(i, w);
        if (w.mo3349g() == null && w.mo3338d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        w.mo3318a(this.f2941e);
        if (!this.f2941e.equals(f2937n)) {
            int a = w.mo3316a();
            if ((a & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((a & 128) == 0) {
                w.mo3340d((CharSequence) this.f2945i.getContext().getPackageName());
                w.mo3335c(this.f2945i, i);
                if (this.f2947k == i) {
                    w.mo3325a(true);
                    w.mo3317a(128);
                } else {
                    w.mo3325a(false);
                    w.mo3317a(64);
                }
                boolean z = this.f2948l == i;
                if (z) {
                    w.mo3317a(2);
                } else if (w.mo3363m()) {
                    w.mo3317a(1);
                }
                w.mo3352h(z);
                this.f2945i.getLocationOnScreen(this.f2943g);
                w.mo3328b(this.f2940d);
                if (this.f2940d.equals(f2937n)) {
                    w.mo3318a(this.f2940d);
                    if (w.f2774b != -1) {
                        C0628c w2 = C0628c.m2925w();
                        for (int i2 = w.f2774b; i2 != -1; i2 = w2.f2774b) {
                            w2.mo3329b(this.f2945i, -1);
                            w2.mo3334c(f2937n);
                            mo3559a(i2, w2);
                            w2.mo3318a(this.f2941e);
                            Rect rect = this.f2940d;
                            Rect rect2 = this.f2941e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        w2.mo3369s();
                    }
                    this.f2940d.offset(this.f2943g[0] - this.f2945i.getScrollX(), this.f2943g[1] - this.f2945i.getScrollY());
                }
                if (this.f2945i.getLocalVisibleRect(this.f2942f)) {
                    this.f2942f.offset(this.f2943g[0] - this.f2945i.getScrollX(), this.f2943g[1] - this.f2945i.getScrollY());
                    if (this.f2940d.intersect(this.f2942f)) {
                        w.mo3339d(this.f2940d);
                        if (m3227a(this.f2940d)) {
                            w.mo3362m(true);
                        }
                    }
                }
                return w;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: g */
    private static int m3238g(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: h */
    private boolean m3239h(int i) {
        if (this.f2944h.isEnabled() && this.f2944h.isTouchExplorationEnabled()) {
            int i2 = this.f2947k;
            if (i2 != i) {
                if (i2 != Integer.MIN_VALUE) {
                    m3235d(i2);
                }
                this.f2947k = i;
                this.f2945i.invalidate();
                mo3566a(i, 32768);
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m3240i(int i) {
        int i2 = this.f2949m;
        if (i2 != i) {
            this.f2949m = i;
            mo3566a(i, 128);
            mo3566a(i2, 256);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo3557a(float f, float f2);

    /* renamed from: a */
    public C0632d mo3290a(View view) {
        if (this.f2946j == null) {
            this.f2946j = new C0694c();
        }
        return this.f2946j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3558a(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3559a(int i, C0628c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3560a(int i, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3561a(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3562a(C0628c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo3563a(List<Integer> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo3567a(int i, int i2, Bundle bundle);

    /* renamed from: a */
    public final boolean mo3569a(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f2944h.isEnabled() && this.f2944h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int a = mo3557a(motionEvent.getX(), motionEvent.getY());
                m3240i(a);
                if (a != Integer.MIN_VALUE) {
                    z = true;
                }
            } else if (action != 10 || this.f2949m == Integer.MIN_VALUE) {
                return false;
            } else {
                m3240i(Integer.MIN_VALUE);
                return true;
            }
        }
        return z;
    }

    /* renamed from: d */
    private boolean m3235d(int i) {
        if (this.f2947k != i) {
            return false;
        }
        this.f2947k = Integer.MIN_VALUE;
        this.f2945i.invalidate();
        mo3566a(i, 65536);
        return true;
    }

    /* renamed from: a */
    public final boolean mo3568a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int g = m3238g(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m3230b(g, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m3229b();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m3230b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m3230b(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: c */
    private C0628c m3232c() {
        C0628c d = C0628c.m2920d(this.f2945i);
        ViewCompat.m2825a(this.f2945i, d);
        ArrayList arrayList = new ArrayList();
        mo3563a((List<Integer>) arrayList);
        if (d.mo3327b() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                d.mo3320a(this.f2945i, ((Integer) arrayList.get(i)).intValue());
            }
            return d;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: b */
    private boolean m3229b() {
        int i = this.f2948l;
        return i != Integer.MIN_VALUE && mo3567a(i, 16, (Bundle) null);
    }

    /* renamed from: b */
    private AccessibilityEvent m3228b(int i, int i2) {
        if (i != -1) {
            return m3231c(i, i2);
        }
        return m3236e(i2);
    }

    /* renamed from: b */
    public void mo3296b(View view, AccessibilityEvent accessibilityEvent) {
        super.mo3296b(view, accessibilityEvent);
        mo3561a(accessibilityEvent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0628c mo3570b(int i) {
        if (i == -1) {
            return m3232c();
        }
        return m3237f(i);
    }

    /* renamed from: a */
    public final void mo3564a(boolean z, int i, Rect rect) {
        int i2 = this.f2948l;
        if (i2 != Integer.MIN_VALUE) {
            mo3565a(i2);
        }
        if (z) {
            m3230b(i, rect);
        }
    }

    /* renamed from: c */
    private boolean m3233c(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return mo3572c(i);
        }
        if (i2 == 2) {
            return mo3565a(i);
        }
        if (i2 == 64) {
            return m3239h(i);
        }
        if (i2 != 128) {
            return mo3567a(i, i2, bundle);
        }
        return m3235d(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3571b(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m3233c(i, i2, bundle);
        }
        return m3226a(i2, bundle);
    }

    /* renamed from: a */
    private void m3225a(int i, Rect rect) {
        mo3570b(i).mo3318a(rect);
    }

    /* renamed from: a */
    private static Rect m3224a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: c */
    public final boolean mo3572c(int i) {
        if (!this.f2945i.isFocused() && !this.f2945i.requestFocus()) {
            return false;
        }
        int i2 = this.f2948l;
        if (i2 == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo3565a(i2);
        }
        this.f2948l = i;
        mo3560a(i, true);
        mo3566a(i, 8);
        return true;
    }

    /* renamed from: a */
    public final boolean mo3566a(int i, int i2) {
        if (i == Integer.MIN_VALUE || !this.f2944h.isEnabled()) {
            return false;
        }
        ViewParent parent = this.f2945i.getParent();
        if (parent == null) {
            return false;
        }
        return C0660m.m3067a(parent, this.f2945i, m3228b(i, i2));
    }

    /* renamed from: a */
    public void mo3292a(View view, C0628c cVar) {
        super.mo3292a(view, cVar);
        mo3562a(cVar);
    }

    /* renamed from: a */
    private boolean m3226a(int i, Bundle bundle) {
        return ViewCompat.m2830a(this.f2945i, i, bundle);
    }

    /* renamed from: a */
    private boolean m3227a(Rect rect) {
        boolean z = false;
        if (rect != null && !rect.isEmpty()) {
            if (this.f2945i.getWindowVisibility() != 0) {
                return false;
            }
            ViewParent parent = this.f2945i.getParent();
            while (parent instanceof View) {
                View view = (View) parent;
                if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                    return false;
                }
                parent = view.getParent();
            }
            if (parent != null) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo3565a(int i) {
        if (this.f2948l != i) {
            return false;
        }
        this.f2948l = Integer.MIN_VALUE;
        mo3560a(i, false);
        mo3566a(i, 8);
        return true;
    }
}
