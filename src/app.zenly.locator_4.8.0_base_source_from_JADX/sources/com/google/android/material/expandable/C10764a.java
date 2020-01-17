package com.google.android.material.expandable;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.expandable.a */
public final class C10764a {

    /* renamed from: a */
    private final View f28024a;

    /* renamed from: b */
    private boolean f28025b = false;

    /* renamed from: c */
    private int f28026c = 0;

    public C10764a(ExpandableWidget expandableWidget) {
        this.f28024a = (View) expandableWidget;
    }

    /* renamed from: d */
    private void m27598d() {
        ViewParent parent = this.f28024a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).mo2809a(this.f28024a);
        }
    }

    /* renamed from: a */
    public boolean mo31046a(boolean z) {
        if (this.f28025b == z) {
            return false;
        }
        this.f28025b = z;
        m27598d();
        return true;
    }

    /* renamed from: b */
    public boolean mo31047b() {
        return this.f28025b;
    }

    /* renamed from: c */
    public Bundle mo31048c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f28025b);
        bundle.putInt("expandedComponentIdHint", this.f28026c);
        return bundle;
    }

    /* renamed from: a */
    public void mo31045a(Bundle bundle) {
        this.f28025b = bundle.getBoolean("expanded", false);
        this.f28026c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f28025b) {
            m27598d();
        }
    }

    /* renamed from: a */
    public void mo31044a(int i) {
        this.f28026c = i;
    }

    /* renamed from: a */
    public int mo31043a() {
        return this.f28026c;
    }
}
