package androidx.transition;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class Slide extends Visibility {

    /* renamed from: Q */
    private static final C1201g f4527Q = new C1195a();

    /* renamed from: R */
    private static final C1201g f4528R = new C1196b();

    /* renamed from: S */
    private static final C1201g f4529S = new C1197c();

    /* renamed from: T */
    private static final C1201g f4530T = new C1198d();

    /* renamed from: U */
    private static final C1201g f4531U = new C1199e();

    /* renamed from: V */
    private static final C1201g f4532V = new C1200f();

    /* renamed from: P */
    private int f4533P = 80;

    /* renamed from: androidx.transition.Slide$a */
    static class C1195a extends C1202h {
        C1195a() {
            super(null);
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    static class C1196b extends C1202h {
        C1196b() {
            super(null);
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    static class C1197c extends C1203i {
        C1197c() {
            super(null);
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    static class C1198d extends C1202h {
        C1198d() {
            super(null);
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    static class C1199e extends C1202h {
        C1199e() {
            super(null);
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    static class C1200f extends C1203i {
        C1200f() {
            super(null);
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    private interface C1201g {
    }

    /* renamed from: androidx.transition.Slide$h */
    private static abstract class C1202h implements C1201g {
        private C1202h() {
        }

        /* synthetic */ C1202h(C1195a aVar) {
            this();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    private static abstract class C1203i implements C1201g {
        private C1203i() {
        }

        /* synthetic */ C1203i(C1195a aVar) {
            this();
        }
    }

    static {
        new DecelerateInterpolator();
        new AccelerateInterpolator();
    }

    public Slide() {
        mo6003b(80);
    }

    /* renamed from: d */
    private void m5799d(C1241n nVar) {
        int[] iArr = new int[2];
        nVar.f4646b.getLocationOnScreen(iArr);
        nVar.f4645a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: a */
    public void mo5962a(C1241n nVar) {
        super.mo5962a(nVar);
        m5799d(nVar);
    }

    /* renamed from: b */
    public void mo6003b(int i) {
        if (i == 3 || i == 5 || i == 48 || i == 80 || i == 8388611 || i == 8388613) {
            this.f4533P = i;
            C1234i iVar = new C1234i();
            iVar.mo6093a(i);
            mo6018a((C1239l) iVar);
            return;
        }
        throw new IllegalArgumentException("Invalid slide direction");
    }

    /* renamed from: c */
    public void mo5963c(C1241n nVar) {
        super.mo5963c(nVar);
        m5799d(nVar);
    }

    /* renamed from: q */
    public int mo6004q() {
        return this.f4533P;
    }
}
