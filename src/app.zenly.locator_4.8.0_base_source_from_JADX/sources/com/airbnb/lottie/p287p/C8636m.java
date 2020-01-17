package com.airbnb.lottie.p287p;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.C8544c;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.animatable.C8547f;
import com.airbnb.lottie.model.content.C8560c;
import com.airbnb.lottie.model.content.C8562e;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.m */
class C8636m {

    /* renamed from: a */
    private static final C8631a f22190a = C8631a.m20077a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b */
    private static final C8631a f22191b = C8631a.m20077a("p", "k");

    /* renamed from: a */
    static C8560c m20110a(C8630c cVar, C8506c cVar2) throws IOException {
        FillType fillType = FillType.WINDING;
        String str = null;
        C8562e eVar = null;
        C8544c cVar3 = null;
        C8545d dVar = null;
        C8547f fVar = null;
        C8547f fVar2 = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            switch (cVar.mo23225a(f22190a)) {
                case 0:
                    str = cVar.mo23238k();
                    break;
                case 1:
                    int i = -1;
                    cVar.mo23229b();
                    while (cVar.mo23233f()) {
                        int a = cVar.mo23225a(f22191b);
                        if (a == 0) {
                            i = cVar.mo23236i();
                        } else if (a != 1) {
                            cVar.mo23239l();
                            cVar.mo23240m();
                        } else {
                            cVar3 = C8613d.m20031a(cVar, cVar2, i);
                        }
                    }
                    cVar.mo23231d();
                    break;
                case 2:
                    dVar = C8613d.m20036d(cVar, cVar2);
                    break;
                case 3:
                    eVar = cVar.mo23236i() == 1 ? C8562e.LINEAR : C8562e.RADIAL;
                    break;
                case 4:
                    fVar = C8613d.m20037e(cVar, cVar2);
                    break;
                case 5:
                    fVar2 = C8613d.m20037e(cVar, cVar2);
                    break;
                case 6:
                    fillType = cVar.mo23236i() == 1 ? FillType.WINDING : FillType.EVEN_ODD;
                    break;
                case 7:
                    z = cVar.mo23234g();
                    break;
                default:
                    cVar.mo23239l();
                    cVar.mo23240m();
                    break;
            }
        }
        C8560c cVar4 = new C8560c(str, eVar, fillType, cVar3, dVar, fVar, fVar2, null, null, z);
        return cVar4;
    }
}
