package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.image.C9732e;

/* renamed from: com.facebook.imagepipeline.producers.o0 */
public final class C9861o0 {
    /* renamed from: a */
    public static int m24553a(int i) {
        return (int) (((float) i) * 1.3333334f);
    }

    /* renamed from: a */
    public static boolean m24554a(int i, int i2, C9701e eVar) {
        boolean z = true;
        if (eVar == null) {
            if (((float) m24553a(i)) < 2048.0f || m24553a(i2) < 2048) {
                z = false;
            }
            return z;
        }
        if (m24553a(i) < eVar.f25355a || m24553a(i2) < eVar.f25356b) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m24555a(C9732e eVar, C9701e eVar2) {
        if (eVar == null) {
            return false;
        }
        int i = eVar.mo26435i();
        if (i == 90 || i == 270) {
            return m24554a(eVar.mo26430f(), eVar.mo26438l(), eVar2);
        }
        return m24554a(eVar.mo26438l(), eVar.mo26430f(), eVar2);
    }
}
