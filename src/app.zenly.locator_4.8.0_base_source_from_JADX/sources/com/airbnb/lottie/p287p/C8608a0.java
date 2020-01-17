package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8547f;
import com.airbnb.lottie.model.content.C8569i;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.a0 */
class C8608a0 {

    /* renamed from: a */
    private static C8631a f22134a = C8631a.m20077a("nm", "p", "s", "r", "hd");

    /* renamed from: a */
    static C8569i m20016a(C8630c cVar, C8506c cVar2) throws IOException {
        String str = null;
        AnimatableValue animatableValue = null;
        C8547f fVar = null;
        C8543b bVar = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22134a);
            if (a == 0) {
                str = cVar.mo23238k();
            } else if (a == 1) {
                animatableValue = C8607a.m20015b(cVar, cVar2);
            } else if (a == 2) {
                fVar = C8613d.m20037e(cVar, cVar2);
            } else if (a == 3) {
                bVar = C8613d.m20035c(cVar, cVar2);
            } else if (a != 4) {
                cVar.mo23240m();
            } else {
                z = cVar.mo23234g();
            }
        }
        C8569i iVar = new C8569i(str, animatableValue, fVar, bVar, z);
        return iVar;
    }
}
