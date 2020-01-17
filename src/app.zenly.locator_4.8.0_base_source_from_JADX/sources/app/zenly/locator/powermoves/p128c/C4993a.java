package app.zenly.locator.powermoves.p128c;

import android.view.View;
import androidx.dynamicanimation.animation.C0730f;
import androidx.dynamicanimation.animation.C0731g;
import androidx.dynamicanimation.animation.DynamicAnimation;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.powermoves.c.a */
public final class C4993a {

    /* renamed from: a */
    public static final C4993a f13022a = new C4993a();

    private C4993a() {
    }

    /* renamed from: a */
    public final C0730f mo12236a(View view, float f) {
        C12932j.m33818b(view, "view");
        C0730f fVar = new C0730f(view, DynamicAnimation.f2980m, 0.0f);
        C0731g f2 = fVar.mo3675f();
        String str = "spring";
        C12932j.m33815a((Object) f2, str);
        f2.mo3680a(0.35f);
        C0731g f3 = fVar.mo3675f();
        C12932j.m33815a((Object) f3, str);
        f3.mo3684c(400.0f);
        fVar.mo3618b(-f);
        fVar.mo3612a(f);
        fVar.mo3624e(f);
        return fVar;
    }
}
