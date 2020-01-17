package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C8547f;
import com.airbnb.lottie.model.content.C8558a;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.e */
class C8615e {

    /* renamed from: a */
    private static C8631a f22143a = C8631a.m20077a("nm", "p", "s", "hd", "d");

    /* renamed from: a */
    static C8558a m20042a(C8630c cVar, C8506c cVar2, int i) throws IOException {
        boolean z = i == 3;
        String str = null;
        AnimatableValue animatableValue = null;
        C8547f fVar = null;
        boolean z2 = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22143a);
            if (a == 0) {
                str = cVar.mo23238k();
            } else if (a == 1) {
                animatableValue = C8607a.m20015b(cVar, cVar2);
            } else if (a == 2) {
                fVar = C8613d.m20037e(cVar, cVar2);
            } else if (a == 3) {
                z2 = cVar.mo23234g();
            } else if (a != 4) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                z = cVar.mo23236i() == 3;
            }
        }
        C8558a aVar = new C8558a(str, animatableValue, fVar, z, z2);
        return aVar;
    }
}
