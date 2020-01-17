package com.facebook.imagepipeline.transcoder;

import com.facebook.common.internal.C9536j;
import com.facebook.common.logging.C9543a;
import com.facebook.imageformat.C9650b;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.image.C9732e;

/* renamed from: com.facebook.imagepipeline.transcoder.a */
public class C9890a {
    /* renamed from: a */
    public static int m24708a(C9702f fVar, C9701e eVar, C9732e eVar2, int i) {
        int i2;
        if (!C9732e.m24070d(eVar2)) {
            return 1;
        }
        float a = m24706a(fVar, eVar, eVar2);
        if (eVar2.mo26432g() == C9650b.f25197a) {
            i2 = m24710b(a);
        } else {
            i2 = m24707a(a);
        }
        int max = Math.max(eVar2.mo26430f(), eVar2.mo26438l());
        float f = eVar != null ? eVar.f25357c : (float) i;
        while (((float) (max / i2)) > f) {
            i2 = eVar2.mo26432g() == C9650b.f25197a ? i2 * 2 : i2 + 1;
        }
        return i2;
    }

    /* renamed from: b */
    public static int m24710b(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            int i2 = i * 2;
            double d = 1.0d / ((double) i2);
            if (d + (0.3333333432674408d * d) <= ((double) f)) {
                return i;
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public static float m24706a(C9702f fVar, C9701e eVar, C9732e eVar2) {
        C9536j.m23275a(C9732e.m24070d(eVar2));
        if (eVar == null || eVar.f25356b <= 0 || eVar.f25355a <= 0 || eVar2.mo26438l() == 0 || eVar2.mo26430f() == 0) {
            return 1.0f;
        }
        int a = m24709a(fVar, eVar2);
        boolean z = a == 90 || a == 270;
        int f = z ? eVar2.mo26430f() : eVar2.mo26438l();
        int l = z ? eVar2.mo26438l() : eVar2.mo26430f();
        float f2 = ((float) eVar.f25355a) / ((float) f);
        float f3 = ((float) eVar.f25356b) / ((float) l);
        float max = Math.max(f2, f3);
        C9543a.m23319b("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f", Integer.valueOf(eVar.f25355a), Integer.valueOf(eVar.f25356b), Integer.valueOf(f), Integer.valueOf(l), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(max));
        return max;
    }

    /* renamed from: a */
    public static int m24707a(float f) {
        if (f > 0.6666667f) {
            return 1;
        }
        int i = 2;
        while (true) {
            double d = (double) i;
            if ((1.0d / d) + ((1.0d / (Math.pow(d, 2.0d) - d)) * 0.3333333432674408d) <= ((double) f)) {
                return i - 1;
            }
            i++;
        }
    }

    /* renamed from: a */
    private static int m24709a(C9702f fVar, C9732e eVar) {
        boolean z = false;
        if (!fVar.mo26274d()) {
            return 0;
        }
        int i = eVar.mo26435i();
        if (i == 0 || i == 90 || i == 180 || i == 270) {
            z = true;
        }
        C9536j.m23275a(z);
        return i;
    }
}
