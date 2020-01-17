package app.zenly.locator.chat.p054n5;

import android.view.View;
import android.view.View.OnClickListener;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p265d.C7697b;

/* renamed from: app.zenly.locator.chat.n5.c */
public final class C2112c {

    /* renamed from: a */
    private OnClickListener f6607a;

    /* renamed from: b */
    private boolean f6608b;

    /* renamed from: c */
    private final View f6609c;

    public C2112c(View view) {
        C12932j.m33818b(view, "btnRecenter");
        this.f6609c = view;
    }

    /* renamed from: a */
    public final void mo7910a(OnClickListener onClickListener) {
        if (!C12932j.m33817a((Object) this.f6607a, (Object) onClickListener)) {
            this.f6607a = onClickListener;
            this.f6609c.setOnClickListener(this.f6607a);
        }
    }

    /* renamed from: a */
    public final void mo7911a(boolean z) {
        if (this.f6608b != z) {
            this.f6608b = z;
            if (this.f6608b) {
                C7697b.m18730a(this.f6609c, 0, null, 3, null);
            } else {
                C7697b.m18736b(this.f6609c, 0, null, 3, null);
            }
        }
    }
}
