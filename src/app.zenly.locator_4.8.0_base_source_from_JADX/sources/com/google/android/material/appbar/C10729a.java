package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: com.google.android.material.appbar.a */
class C10729a {

    /* renamed from: a */
    private final View f27877a;

    /* renamed from: b */
    private int f27878b;

    /* renamed from: c */
    private int f27879c;

    /* renamed from: d */
    private int f27880d;

    /* renamed from: e */
    private int f27881e;

    public C10729a(View view) {
        this.f27877a = view;
    }

    /* renamed from: c */
    private void m27344c() {
        View view = this.f27877a;
        ViewCompat.m2848e(view, this.f27880d - (view.getTop() - this.f27878b));
        View view2 = this.f27877a;
        ViewCompat.m2846d(view2, this.f27881e - (view2.getLeft() - this.f27879c));
    }

    /* renamed from: a */
    public boolean mo30624a(int i) {
        if (this.f27881e == i) {
            return false;
        }
        this.f27881e = i;
        m27344c();
        return true;
    }

    /* renamed from: b */
    public void mo30625b() {
        this.f27878b = this.f27877a.getTop();
        this.f27879c = this.f27877a.getLeft();
        m27344c();
    }

    /* renamed from: a */
    public int mo30623a() {
        return this.f27880d;
    }

    /* renamed from: b */
    public boolean mo30626b(int i) {
        if (this.f27880d == i) {
            return false;
        }
        this.f27880d = i;
        m27344c();
        return true;
    }
}
