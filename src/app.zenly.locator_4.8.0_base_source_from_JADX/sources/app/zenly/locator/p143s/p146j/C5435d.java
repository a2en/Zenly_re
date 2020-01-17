package app.zenly.locator.p143s.p146j;

import android.view.View;
import android.view.ViewPropertyAnimator;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.util.C3238u;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.ClosedFloatingPointRange;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.s.j.d */
public final class C5435d {

    /* renamed from: app.zenly.locator.s.j.d$a */
    static final class C5436a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f13988e;

        /* renamed from: f */
        final /* synthetic */ float f13989f;

        /* renamed from: g */
        final /* synthetic */ float f13990g;

        /* renamed from: h */
        final /* synthetic */ long f13991h;

        /* renamed from: i */
        final /* synthetic */ ClosedFloatingPointRange f13992i;

        /* renamed from: j */
        final /* synthetic */ ClosedFloatingPointRange f13993j;

        /* renamed from: k */
        final /* synthetic */ float f13994k;

        /* renamed from: l */
        final /* synthetic */ boolean f13995l;

        C5436a(View view, float f, float f2, long j, ClosedFloatingPointRange closedFloatingPointRange, ClosedFloatingPointRange closedFloatingPointRange2, float f3, boolean z) {
            this.f13988e = view;
            this.f13989f = f;
            this.f13990g = f2;
            this.f13991h = j;
            this.f13992i = closedFloatingPointRange;
            this.f13993j = closedFloatingPointRange2;
            this.f13994k = f3;
            this.f13995l = z;
        }

        public final void run() {
            C5435d.m15451b(this.f13988e, this.f13989f, this.f13990g, this.f13991h, this.f13992i, this.f13993j, this.f13994k, !this.f13995l);
        }
    }

    /* renamed from: app.zenly.locator.s.j.d$b */
    static final class C5437b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f13996e;

        /* renamed from: f */
        final /* synthetic */ float f13997f;

        /* renamed from: g */
        final /* synthetic */ float f13998g;

        /* renamed from: h */
        final /* synthetic */ float f13999h;

        /* renamed from: i */
        final /* synthetic */ float f14000i;

        /* renamed from: j */
        final /* synthetic */ boolean f14001j;

        C5437b(View view, float f, float f2, float f3, float f4, boolean z) {
            this.f13996e = view;
            this.f13997f = f;
            this.f13998g = f2;
            this.f13999h = f3;
            this.f14000i = f4;
            this.f14001j = z;
        }

        public final void run() {
            View view = this.f13996e;
            float f = this.f13997f;
            float f2 = this.f13998g;
            ClosedFloatingPointRange a = C12971j.m33881a(2.0f, 5.0f);
            float f3 = this.f13999h;
            C5435d.m15451b(view, f, f2, 4000, a, C12971j.m33881a(f3 - 0.05f, f3 + 0.05f), this.f14000i, this.f14001j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m15451b(View view, float f, float f2, long j, ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, float f3, boolean z) {
        ViewPropertyAnimator a = m15447a(view, f + (C3238u.m10269a(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue()) * ((float) (z ? -1 : 1))), C3238u.m10269a(((Number) closedFloatingPointRange2.getStart()).floatValue(), ((Number) closedFloatingPointRange2.getEndInclusive()).floatValue()), f2, view.getTranslationY(), view.getAlpha(), j / ((long) f3));
        C5436a aVar = new C5436a(view, f, f2, j, closedFloatingPointRange, closedFloatingPointRange2, f3, z);
        a.withEndAction(aVar);
    }

    /* renamed from: a */
    public static final ViewPropertyAnimator m15447a(View view, float f, float f2, float f3, float f4, float f5, long j) {
        C12932j.m33818b(view, "$this$animate");
        view.requestLayout();
        ViewPropertyAnimator interpolator = view.animate().rotation(f).translationX(C3200e0.m10181a(view.getContext(), f3)).translationY(C3200e0.m10181a(view.getContext(), f4)).scaleX(f2).scaleY(f2).alpha(f5).setDuration(j).setInterpolator(C7657c.m18643b());
        C12932j.m33815a((Object) interpolator, "animate()\n        .rotat…s.accelerateDecelerate())");
        return interpolator;
    }

    /* renamed from: a */
    public static /* synthetic */ ViewPropertyAnimator m15449a(View view, float f, float f2, float f3, long j, float f4, float f5, float f6, boolean z, int i, Object obj) {
        int i2 = i;
        return m15448a(view, f, f2, f3, j, (i2 & 16) != 0 ? 1.0f : f4, (i2 & 32) != 0 ? 1.0f : f5, (i2 & 64) != 0 ? 1.0f : f6, (i2 & 128) != 0 ? false : z);
    }

    /* renamed from: a */
    public static final ViewPropertyAnimator m15448a(View view, float f, float f2, float f3, long j, float f4, float f5, float f6, boolean z) {
        View view2 = view;
        C12932j.m33818b(view, "$this$animateShowAndWave");
        float f7 = f2;
        ViewPropertyAnimator interpolator = m15447a(view, f, f4, f7, f3, f5, j).setInterpolator(C7657c.m18648d(f6));
        C5437b bVar = new C5437b(view, f, f7, f4, f6, z);
        ViewPropertyAnimator withEndAction = interpolator.withEndAction(bVar);
        C12932j.m33815a((Object) withEndAction, "animate(defaultRotation,…ted = inverted)\n        }");
        return withEndAction;
    }
}
