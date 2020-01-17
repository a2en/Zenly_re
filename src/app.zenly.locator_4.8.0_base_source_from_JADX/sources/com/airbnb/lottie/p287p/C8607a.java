package com.airbnb.lottie.p287p;

import android.graphics.PointF;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8546e;
import com.airbnb.lottie.model.animatable.C8550i;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8659a;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.airbnb.lottie.p.a */
public class C8607a {

    /* renamed from: a */
    private static C8631a f22133a = C8631a.m20077a("k", "x", "y");

    /* renamed from: a */
    public static C8546e m20014a(C8630c cVar, C8506c cVar2) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.peek() == C8632b.BEGIN_ARRAY) {
            cVar.mo23227a();
            while (cVar.mo23233f()) {
                arrayList.add(C8647w.m20139a(cVar, cVar2));
            }
            cVar.mo23230c();
            C8642r.m20128a(arrayList);
        } else {
            arrayList.add(new C8659a(C8639p.m20119d(cVar, C8658h.m20192a())));
        }
        return new C8546e(arrayList);
    }

    /* renamed from: b */
    static AnimatableValue<PointF, PointF> m20015b(C8630c cVar, C8506c cVar2) throws IOException {
        cVar.mo23229b();
        C8546e eVar = null;
        boolean z = false;
        C8543b bVar = null;
        C8543b bVar2 = null;
        while (cVar.peek() != C8632b.END_OBJECT) {
            int a = cVar.mo23225a(f22133a);
            if (a != 0) {
                if (a != 1) {
                    if (a != 2) {
                        cVar.mo23239l();
                        cVar.mo23240m();
                    } else if (cVar.peek() == C8632b.STRING) {
                        cVar.mo23240m();
                    } else {
                        bVar2 = C8613d.m20035c(cVar, cVar2);
                    }
                } else if (cVar.peek() == C8632b.STRING) {
                    cVar.mo23240m();
                } else {
                    bVar = C8613d.m20035c(cVar, cVar2);
                }
                z = true;
            } else {
                eVar = m20014a(cVar, cVar2);
            }
        }
        cVar.mo23231d();
        if (z) {
            cVar2.mo22928a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C8550i(bVar, bVar2);
    }
}
