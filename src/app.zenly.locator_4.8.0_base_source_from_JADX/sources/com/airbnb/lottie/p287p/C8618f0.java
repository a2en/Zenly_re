package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.content.C8573m;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.p.f0 */
class C8618f0 {

    /* renamed from: a */
    private static C8631a f22146a = C8631a.m20077a("nm", "hd", "it");

    /* renamed from: a */
    static C8573m m20046a(C8630c cVar, C8506c cVar2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22146a);
            if (a == 0) {
                str = cVar.mo23238k();
            } else if (a == 1) {
                z = cVar.mo23234g();
            } else if (a != 2) {
                cVar.mo23240m();
            } else {
                cVar.mo23227a();
                while (cVar.mo23233f()) {
                    ContentModel a2 = C8619g.m20047a(cVar, cVar2);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                cVar.mo23230c();
            }
        }
        return new C8573m(str, arrayList, z);
    }
}
