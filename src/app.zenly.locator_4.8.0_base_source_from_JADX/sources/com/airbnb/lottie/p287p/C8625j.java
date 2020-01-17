package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.C8581d;
import com.airbnb.lottie.model.content.C8573m;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.p.j */
class C8625j {

    /* renamed from: a */
    private static final C8631a f22155a = C8631a.m20077a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b */
    private static final C8631a f22156b = C8631a.m20077a("shapes");

    /* renamed from: a */
    static C8581d m20055a(C8630c cVar, C8506c cVar2) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.mo23229b();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        char c = 0;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22155a);
            if (a == 0) {
                c = cVar.mo23238k().charAt(0);
            } else if (a == 1) {
                d = cVar.mo23235h();
            } else if (a == 2) {
                d2 = cVar.mo23235h();
            } else if (a == 3) {
                str = cVar.mo23238k();
            } else if (a == 4) {
                str2 = cVar.mo23238k();
            } else if (a != 5) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                cVar.mo23229b();
                while (cVar.mo23233f()) {
                    if (cVar.mo23225a(f22156b) != 0) {
                        cVar.mo23239l();
                        cVar.mo23240m();
                    } else {
                        cVar.mo23227a();
                        while (cVar.mo23233f()) {
                            arrayList.add((C8573m) C8619g.m20047a(cVar, cVar2));
                        }
                        cVar.mo23230c();
                    }
                }
                cVar.mo23231d();
            }
        }
        cVar.mo23231d();
        C8581d dVar = new C8581d(arrayList, c, d, d2, str, str2);
        return dVar;
    }
}
