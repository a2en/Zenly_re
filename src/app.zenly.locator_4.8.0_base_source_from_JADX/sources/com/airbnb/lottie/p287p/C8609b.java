package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.C8542a;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8552k;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.b */
public class C8609b {

    /* renamed from: a */
    private static C8631a f22135a = C8631a.m20077a("a");

    /* renamed from: b */
    private static C8631a f22136b = C8631a.m20077a("fc", "sc", "sw", "t");

    /* renamed from: a */
    public static C8552k m20017a(C8630c cVar, C8506c cVar2) throws IOException {
        cVar.mo23229b();
        C8552k kVar = null;
        while (cVar.mo23233f()) {
            if (cVar.mo23225a(f22135a) != 0) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                kVar = m20018b(cVar, cVar2);
            }
        }
        cVar.mo23231d();
        return kVar == null ? new C8552k(null, null, null, null) : kVar;
    }

    /* renamed from: b */
    private static C8552k m20018b(C8630c cVar, C8506c cVar2) throws IOException {
        cVar.mo23229b();
        C8542a aVar = null;
        C8542a aVar2 = null;
        C8543b bVar = null;
        C8543b bVar2 = null;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22136b);
            if (a == 0) {
                aVar = C8613d.m20029a(cVar, cVar2);
            } else if (a == 1) {
                aVar2 = C8613d.m20029a(cVar, cVar2);
            } else if (a == 2) {
                bVar = C8613d.m20035c(cVar, cVar2);
            } else if (a != 3) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                bVar2 = C8613d.m20035c(cVar, cVar2);
            }
        }
        cVar.mo23231d();
        return new C8552k(aVar, aVar2, bVar, bVar2);
    }
}
