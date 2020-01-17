package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.content.C8567h;
import com.airbnb.lottie.model.content.C8567h.C8568a;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.z */
class C8650z {

    /* renamed from: a */
    private static final C8631a f22212a = C8631a.m20077a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* renamed from: a */
    static C8567h m20144a(C8630c cVar, C8506c cVar2) throws IOException {
        String str = null;
        C8568a aVar = null;
        C8543b bVar = null;
        AnimatableValue animatableValue = null;
        C8543b bVar2 = null;
        C8543b bVar3 = null;
        C8543b bVar4 = null;
        C8543b bVar5 = null;
        C8543b bVar6 = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            switch (cVar.mo23225a(f22212a)) {
                case 0:
                    str = cVar.mo23238k();
                    break;
                case 1:
                    aVar = C8568a.m19855a(cVar.mo23236i());
                    break;
                case 2:
                    bVar = C8613d.m20030a(cVar, cVar2, false);
                    break;
                case 3:
                    animatableValue = C8607a.m20015b(cVar, cVar2);
                    break;
                case 4:
                    bVar2 = C8613d.m20030a(cVar, cVar2, false);
                    break;
                case 5:
                    bVar4 = C8613d.m20035c(cVar, cVar2);
                    break;
                case 6:
                    bVar6 = C8613d.m20030a(cVar, cVar2, false);
                    break;
                case 7:
                    bVar3 = C8613d.m20035c(cVar, cVar2);
                    break;
                case 8:
                    bVar5 = C8613d.m20030a(cVar, cVar2, false);
                    break;
                case 9:
                    z = cVar.mo23234g();
                    break;
                default:
                    cVar.mo23239l();
                    cVar.mo23240m();
                    break;
            }
        }
        C8567h hVar = new C8567h(str, aVar, bVar, animatableValue, bVar2, bVar3, bVar4, bVar5, bVar6, z);
        return hVar;
    }
}
