package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0655j;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.appcompat.widget.c0 */
class C0245c0 implements OnLongClickListener, OnHoverListener, OnAttachStateChangeListener {

    /* renamed from: n */
    private static C0245c0 f1120n;

    /* renamed from: o */
    private static C0245c0 f1121o;

    /* renamed from: e */
    private final View f1122e;

    /* renamed from: f */
    private final CharSequence f1123f;

    /* renamed from: g */
    private final int f1124g;

    /* renamed from: h */
    private final Runnable f1125h = new C0246a();

    /* renamed from: i */
    private final Runnable f1126i = new C0247b();

    /* renamed from: j */
    private int f1127j;

    /* renamed from: k */
    private int f1128k;

    /* renamed from: l */
    private C0249d0 f1129l;

    /* renamed from: m */
    private boolean f1130m;

    /* renamed from: androidx.appcompat.widget.c0$a */
    class C0246a implements Runnable {
        C0246a() {
        }

        public void run() {
            C0245c0.this.mo1876a(false);
        }
    }

    /* renamed from: androidx.appcompat.widget.c0$b */
    class C0247b implements Runnable {
        C0247b() {
        }

        public void run() {
            C0245c0.this.mo1875a();
        }
    }

    private C0245c0(View view, CharSequence charSequence) {
        this.f1122e = view;
        this.f1123f = charSequence;
        this.f1124g = C0655j.m3053a(ViewConfiguration.get(this.f1122e.getContext()));
        m949c();
        this.f1122e.setOnLongClickListener(this);
        this.f1122e.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m945a(View view, CharSequence charSequence) {
        C0245c0 c0Var = f1120n;
        if (c0Var != null && c0Var.f1122e == view) {
            m946a((C0245c0) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            C0245c0 c0Var2 = f1121o;
            if (c0Var2 != null && c0Var2.f1122e == view) {
                c0Var2.mo1875a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C0245c0(view, charSequence);
    }

    /* renamed from: b */
    private void m948b() {
        this.f1122e.removeCallbacks(this.f1125h);
    }

    /* renamed from: c */
    private void m949c() {
        this.f1127j = Integer.MAX_VALUE;
        this.f1128k = Integer.MAX_VALUE;
    }

    /* renamed from: d */
    private void m950d() {
        this.f1122e.postDelayed(this.f1125h, (long) ViewConfiguration.getLongPressTimeout());
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1129l != null && this.f1130m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1122e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m949c();
                mo1875a();
            }
        } else if (this.f1122e.isEnabled() && this.f1129l == null && m947a(motionEvent)) {
            m946a(this);
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1127j = view.getWidth() / 2;
        this.f1128k = view.getHeight() / 2;
        mo1876a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        mo1875a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1876a(boolean z) {
        long j;
        int i;
        long j2;
        if (ViewCompat.m2802B(this.f1122e)) {
            m946a((C0245c0) null);
            C0245c0 c0Var = f1121o;
            if (c0Var != null) {
                c0Var.mo1875a();
            }
            f1121o = this;
            this.f1130m = z;
            this.f1129l = new C0249d0(this.f1122e.getContext());
            this.f1129l.mo1892a(this.f1122e, this.f1127j, this.f1128k, this.f1130m, this.f1123f);
            this.f1122e.addOnAttachStateChangeListener(this);
            if (this.f1130m) {
                j = 2500;
            } else {
                if ((ViewCompat.m2869v(this.f1122e) & 1) == 1) {
                    j2 = 3000;
                    i = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i);
            }
            this.f1122e.removeCallbacks(this.f1126i);
            this.f1122e.postDelayed(this.f1126i, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1875a() {
        if (f1121o == this) {
            f1121o = null;
            C0249d0 d0Var = this.f1129l;
            if (d0Var != null) {
                d0Var.mo1891a();
                this.f1129l = null;
                m949c();
                this.f1122e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1120n == this) {
            m946a((C0245c0) null);
        }
        this.f1122e.removeCallbacks(this.f1126i);
    }

    /* renamed from: a */
    private static void m946a(C0245c0 c0Var) {
        C0245c0 c0Var2 = f1120n;
        if (c0Var2 != null) {
            c0Var2.m948b();
        }
        f1120n = c0Var;
        C0245c0 c0Var3 = f1120n;
        if (c0Var3 != null) {
            c0Var3.m950d();
        }
    }

    /* renamed from: a */
    private boolean m947a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f1127j) <= this.f1124g && Math.abs(y - this.f1128k) <= this.f1124g) {
            return false;
        }
        this.f1127j = x;
        this.f1128k = y;
        return true;
    }
}
