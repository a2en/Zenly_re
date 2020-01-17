package app.zenly.locator.dashboard.p074a0;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.dashboard.a0.b */
public final class C3299b {

    /* renamed from: a */
    private int f9179a = 5;

    /* renamed from: b */
    private int f9180b = this.f9179a;

    /* renamed from: c */
    private final BottomSheetBehavior<View> f9181c;

    public C3299b(BottomSheetBehavior<View> bottomSheetBehavior) {
        C12932j.m33818b(bottomSheetBehavior, "bottomSheetBehavior");
        this.f9181c = bottomSheetBehavior;
    }

    /* renamed from: a */
    public final boolean mo9789a() {
        return this.f9180b == 5;
    }

    /* renamed from: b */
    public final void mo9790b() {
        this.f9180b = 5;
    }

    /* renamed from: c */
    public final void mo9791c() {
        this.f9181c.mo30690c(this.f9180b);
        mo9790b();
    }

    /* renamed from: d */
    public final void mo9792d() {
        this.f9180b = this.f9179a;
    }

    /* renamed from: a */
    public final void mo9788a(int i) {
        if (i == 3 || i == 4 || i == 5) {
            this.f9179a = i;
        }
    }
}
