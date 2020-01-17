package com.airbnb.lottie.p287p;

import com.airbnb.lottie.model.C8557c;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.k */
class C8627k {

    /* renamed from: a */
    private static final C8631a f22157a = C8631a.m20077a("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    static C8557c m20057a(C8630c cVar) throws IOException {
        cVar.mo23229b();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22157a);
            if (a == 0) {
                str = cVar.mo23238k();
            } else if (a == 1) {
                str2 = cVar.mo23238k();
            } else if (a == 2) {
                str3 = cVar.mo23238k();
            } else if (a != 3) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                f = (float) cVar.mo23235h();
            }
        }
        cVar.mo23231d();
        return new C8557c(str, str2, str3, f);
    }
}
