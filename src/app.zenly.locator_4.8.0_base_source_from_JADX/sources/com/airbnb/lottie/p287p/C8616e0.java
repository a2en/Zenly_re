package com.airbnb.lottie.p287p;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.C8542a;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.content.C8572l;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.appsflyer.share.Constants;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.e0 */
class C8616e0 {

    /* renamed from: a */
    private static final C8631a f22144a = C8631a.m20077a("nm", Constants.URL_CAMPAIGN, "o", "fillEnabled", "r", "hd");

    /* renamed from: a */
    static C8572l m20043a(C8630c cVar, C8506c cVar2) throws IOException {
        String str = null;
        C8542a aVar = null;
        C8545d dVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22144a);
            if (a == 0) {
                str = cVar.mo23238k();
            } else if (a == 1) {
                aVar = C8613d.m20029a(cVar, cVar2);
            } else if (a == 2) {
                dVar = C8613d.m20036d(cVar, cVar2);
            } else if (a == 3) {
                z = cVar.mo23234g();
            } else if (a == 4) {
                i = cVar.mo23236i();
            } else if (a != 5) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                z2 = cVar.mo23234g();
            }
        }
        C8572l lVar = new C8572l(str, z, i == 1 ? FillType.WINDING : FillType.EVEN_ODD, aVar, dVar, z2);
        return lVar;
    }
}
