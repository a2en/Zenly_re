package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8553l;
import com.airbnb.lottie.model.content.C8570j;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.appsflyer.share.Constants;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.b0 */
class C8610b0 {

    /* renamed from: a */
    private static C8631a f22137a = C8631a.m20077a("nm", Constants.URL_CAMPAIGN, "o", "tr", "hd");

    /* renamed from: a */
    static C8570j m20019a(C8630c cVar, C8506c cVar2) throws IOException {
        String str = null;
        C8543b bVar = null;
        C8543b bVar2 = null;
        C8553l lVar = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22137a);
            if (a == 0) {
                str = cVar.mo23238k();
            } else if (a == 1) {
                bVar = C8613d.m20030a(cVar, cVar2, false);
            } else if (a == 2) {
                bVar2 = C8613d.m20030a(cVar, cVar2, false);
            } else if (a == 3) {
                lVar = C8611c.m20020a(cVar, cVar2);
            } else if (a != 4) {
                cVar.mo23240m();
            } else {
                z = cVar.mo23234g();
            }
        }
        C8570j jVar = new C8570j(str, bVar, bVar2, lVar, z);
        return jVar;
    }
}
