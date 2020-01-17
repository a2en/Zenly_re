package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.core.view.h */
public class C0646h {

    /* renamed from: a */
    private int f2816a;

    /* renamed from: b */
    private int f2817b;

    public C0646h(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo3408a(View view, View view2, int i) {
        mo3409a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void mo3409a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f2817b = i;
        } else {
            this.f2816a = i;
        }
    }

    /* renamed from: a */
    public int mo3405a() {
        return this.f2816a | this.f2817b;
    }

    /* renamed from: a */
    public void mo3406a(View view) {
        mo3407a(view, 0);
    }

    /* renamed from: a */
    public void mo3407a(View view, int i) {
        if (i == 1) {
            this.f2817b = 0;
        } else {
            this.f2816a = 0;
        }
    }
}
