package app.zenly.locator.p143s.p146j;

import android.animation.ArgbEvaluator;
import android.animation.RectEvaluator;
import android.animation.TypeEvaluator;
import android.graphics.Rect;
import app.zenly.locator.p143s.p151o.C5466b;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.j.c */
public final class C5433c {

    /* renamed from: a */
    private static final C5434a f13987a = new C5434a();

    /* renamed from: app.zenly.locator.s.j.c$a */
    private static final class C5434a implements TypeEvaluator<int[]> {
        /* renamed from: a */
        public int[] evaluate(float f, int[] iArr, int[] iArr2) {
            C12932j.m33818b(iArr, "startValue");
            C12932j.m33818b(iArr2, "endValue");
            int[] iArr3 = new int[iArr.length];
            int length = iArr3.length;
            for (int i = 0; i < length; i++) {
                iArr3[i] = C5466b.f14065a.mo13085a(iArr[i], iArr2[i], f);
            }
            return iArr3;
        }
    }

    static {
        new C5433c();
        new ArgbEvaluator();
    }

    private C5433c() {
    }

    /* renamed from: a */
    public static final TypeEvaluator<int[]> m15444a() {
        return f13987a;
    }

    /* renamed from: a */
    public static final TypeEvaluator<Rect> m15445a(Rect rect) {
        C12932j.m33818b(rect, "reuseRect");
        return new RectEvaluator(rect);
    }
}
