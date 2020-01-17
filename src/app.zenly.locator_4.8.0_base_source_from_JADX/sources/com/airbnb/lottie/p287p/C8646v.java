package com.airbnb.lottie.p287p;

import com.airbnb.lottie.model.content.C8565g;
import com.airbnb.lottie.model.content.C8565g.C8566a;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.v */
class C8646v {

    /* renamed from: a */
    private static final C8631a f22209a = C8631a.m20077a("nm", "mm", "hd");

    /* renamed from: a */
    static C8565g m20138a(C8630c cVar) throws IOException {
        String str = null;
        C8566a aVar = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22209a);
            if (a == 0) {
                str = cVar.mo23238k();
            } else if (a == 1) {
                aVar = C8566a.m19844a(cVar.mo23236i());
            } else if (a != 2) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                z = cVar.mo23234g();
            }
        }
        return new C8565g(str, aVar, z);
    }
}
