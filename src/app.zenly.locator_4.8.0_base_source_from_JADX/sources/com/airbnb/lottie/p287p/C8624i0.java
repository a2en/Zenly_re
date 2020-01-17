package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.content.C8579p;
import com.airbnb.lottie.model.content.C8579p.C8580a;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.i0 */
class C8624i0 {

    /* renamed from: a */
    private static C8631a f22154a = C8631a.m20077a("s", "e", "o", "nm", "m", "hd");

    /* renamed from: a */
    static C8579p m20054a(C8630c cVar, C8506c cVar2) throws IOException {
        String str = null;
        C8580a aVar = null;
        C8543b bVar = null;
        C8543b bVar2 = null;
        C8543b bVar3 = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22154a);
            if (a == 0) {
                bVar = C8613d.m20030a(cVar, cVar2, false);
            } else if (a == 1) {
                bVar2 = C8613d.m20030a(cVar, cVar2, false);
            } else if (a == 2) {
                bVar3 = C8613d.m20030a(cVar, cVar2, false);
            } else if (a == 3) {
                str = cVar.mo23238k();
            } else if (a == 4) {
                aVar = C8580a.m19900a(cVar.mo23236i());
            } else if (a != 5) {
                cVar.mo23240m();
            } else {
                z = cVar.mo23234g();
            }
        }
        C8579p pVar = new C8579p(str, aVar, bVar, bVar2, bVar3, z);
        return pVar;
    }
}
