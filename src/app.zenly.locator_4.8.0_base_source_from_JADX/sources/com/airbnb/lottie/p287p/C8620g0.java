package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.C8549h;
import com.airbnb.lottie.model.content.C8574n;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.g0 */
class C8620g0 {

    /* renamed from: a */
    static C8631a f22148a = C8631a.m20077a("nm", "ind", "ks", "hd");

    /* renamed from: a */
    static C8574n m20048a(C8630c cVar, C8506c cVar2) throws IOException {
        int i = 0;
        String str = null;
        C8549h hVar = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22148a);
            if (a == 0) {
                str = cVar.mo23238k();
            } else if (a == 1) {
                i = cVar.mo23236i();
            } else if (a == 2) {
                hVar = C8613d.m20039g(cVar, cVar2);
            } else if (a != 3) {
                cVar.mo23240m();
            } else {
                z = cVar.mo23234g();
            }
        }
        return new C8574n(str, i, hVar, z);
    }
}
