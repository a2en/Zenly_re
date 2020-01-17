package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8544c;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.animatable.C8547f;
import com.airbnb.lottie.model.content.C8561d;
import com.airbnb.lottie.model.content.C8562e;
import com.airbnb.lottie.model.content.C8575o.C8577b;
import com.airbnb.lottie.model.content.C8575o.C8578c;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.p.n */
class C8637n {

    /* renamed from: a */
    private static C8631a f22192a = C8631a.m20077a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C8631a f22193b = C8631a.m20077a("p", "k");

    /* renamed from: c */
    private static final C8631a f22194c = C8631a.m20077a("n", "v");

    /* renamed from: a */
    static C8561d m20111a(C8630c cVar, C8506c cVar2) throws IOException {
        C8544c cVar3;
        C8630c cVar4 = cVar;
        C8506c cVar5 = cVar2;
        ArrayList arrayList = new ArrayList();
        String str = null;
        C8562e eVar = null;
        C8544c cVar6 = null;
        C8545d dVar = null;
        C8547f fVar = null;
        C8547f fVar2 = null;
        C8543b bVar = null;
        C8577b bVar2 = null;
        C8578c cVar7 = null;
        float f = 0.0f;
        C8543b bVar3 = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            switch (cVar4.mo23225a(f22192a)) {
                case 0:
                    str = cVar.mo23238k();
                    break;
                case 1:
                    int i = -1;
                    cVar.mo23229b();
                    while (cVar.mo23233f()) {
                        int a = cVar4.mo23225a(f22193b);
                        if (a != 0) {
                            cVar3 = cVar6;
                            if (a != 1) {
                                cVar.mo23239l();
                                cVar.mo23240m();
                            } else {
                                cVar6 = C8613d.m20031a(cVar4, cVar5, i);
                            }
                        } else {
                            cVar3 = cVar6;
                            i = cVar.mo23236i();
                        }
                        cVar6 = cVar3;
                    }
                    C8544c cVar8 = cVar6;
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
                    bVar = C8613d.m20035c(cVar, cVar2);
                    break;
                case 7:
                    bVar2 = C8577b.values()[cVar.mo23236i() - 1];
                    break;
                case 8:
                    cVar7 = C8578c.values()[cVar.mo23236i() - 1];
                    break;
                case 9:
                    f = (float) cVar.mo23235h();
                    break;
                case 10:
                    z = cVar.mo23234g();
                    break;
                case 11:
                    cVar.mo23227a();
                    while (cVar.mo23233f()) {
                        cVar.mo23229b();
                        String str2 = null;
                        C8543b bVar4 = null;
                        while (cVar.mo23233f()) {
                            int a2 = cVar4.mo23225a(f22194c);
                            if (a2 != 0) {
                                C8543b bVar5 = bVar3;
                                if (a2 != 1) {
                                    cVar.mo23239l();
                                    cVar.mo23240m();
                                } else {
                                    bVar4 = C8613d.m20035c(cVar, cVar2);
                                }
                                bVar3 = bVar5;
                            } else {
                                C8543b bVar6 = bVar3;
                                str2 = cVar.mo23238k();
                            }
                        }
                        C8543b bVar7 = bVar3;
                        cVar.mo23231d();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                cVar5.mo22929a(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar7;
                        }
                    }
                    C8543b bVar8 = bVar3;
                    cVar.mo23230c();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar3 = bVar8;
                    break;
                default:
                    cVar.mo23239l();
                    cVar.mo23240m();
                    break;
            }
        }
        C8561d dVar2 = new C8561d(str, eVar, cVar6, dVar, fVar, fVar2, bVar, bVar2, cVar7, f, arrayList, bVar3, z);
        return dVar2;
    }
}
