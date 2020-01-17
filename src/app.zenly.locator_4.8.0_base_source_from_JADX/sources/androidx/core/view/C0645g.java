package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.g */
public class C0645g {

    /* renamed from: a */
    private ViewParent f2811a;

    /* renamed from: b */
    private ViewParent f2812b;

    /* renamed from: c */
    private final View f2813c;

    /* renamed from: d */
    private boolean f2814d;

    /* renamed from: e */
    private int[] f2815e;

    public C0645g(View view) {
        this.f2813c = view;
    }

    /* renamed from: d */
    private ViewParent m3011d(int i) {
        if (i == 0) {
            return this.f2811a;
        }
        if (i != 1) {
            return null;
        }
        return this.f2812b;
    }

    /* renamed from: a */
    public void mo3391a(boolean z) {
        if (this.f2814d) {
            ViewCompat.m2810J(this.f2813c);
        }
        this.f2814d = z;
    }

    /* renamed from: b */
    public boolean mo3401b() {
        return this.f2814d;
    }

    /* renamed from: c */
    public void mo3403c() {
        mo3404c(0);
    }

    /* renamed from: b */
    public boolean mo3402b(int i) {
        return mo3396a(i, 0);
    }

    /* renamed from: c */
    public void mo3404c(int i) {
        ViewParent d = m3011d(i);
        if (d != null) {
            C0660m.m3061a(d, this.f2813c, i);
            m3009a(i, (ViewParent) null);
        }
    }

    /* renamed from: b */
    private boolean m3010b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (mo3401b()) {
            ViewParent d = m3011d(i5);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr4 != null) {
                    this.f2813c.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    int[] d2 = m3012d();
                    d2[0] = 0;
                    d2[1] = 0;
                    iArr3 = d2;
                } else {
                    iArr3 = iArr2;
                }
                C0660m.m3062a(d, this.f2813c, i, i2, i3, i4, i5, iArr3);
                if (iArr4 != null) {
                    this.f2813c.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: d */
    private int[] m3012d() {
        if (this.f2815e == null) {
            this.f2815e = new int[2];
        }
        return this.f2815e;
    }

    /* renamed from: a */
    public boolean mo3392a() {
        return mo3395a(0);
    }

    /* renamed from: a */
    public boolean mo3395a(int i) {
        return m3011d(i) != null;
    }

    /* renamed from: a */
    public boolean mo3396a(int i, int i2) {
        if (mo3395a(i2)) {
            return true;
        }
        if (mo3401b()) {
            View view = this.f2813c;
            for (ViewParent parent = this.f2813c.getParent(); parent != null; parent = parent.getParent()) {
                if (C0660m.m3068b(parent, view, this.f2813c, i, i2)) {
                    m3009a(i2, parent);
                    C0660m.m3064a(parent, view, this.f2813c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3397a(int i, int i2, int i3, int i4, int[] iArr) {
        return m3010b(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: a */
    public boolean mo3398a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m3010b(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: a */
    public void mo3390a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m3010b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public boolean mo3399a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3400a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo3400a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (mo3401b()) {
            ViewParent d = m3011d(i3);
            if (d == null) {
                return false;
            }
            boolean z = true;
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f2813c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    iArr = m3012d();
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C0660m.m3063a(d, this.f2813c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f2813c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    z = false;
                }
                return z;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3394a(float f, float f2, boolean z) {
        if (mo3401b()) {
            ViewParent d = m3011d(0);
            if (d != null) {
                return C0660m.m3066a(d, this.f2813c, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3393a(float f, float f2) {
        if (mo3401b()) {
            ViewParent d = m3011d(0);
            if (d != null) {
                return C0660m.m3065a(d, this.f2813c, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m3009a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f2811a = viewParent;
        } else if (i == 1) {
            this.f2812b = viewParent;
        }
    }
}
