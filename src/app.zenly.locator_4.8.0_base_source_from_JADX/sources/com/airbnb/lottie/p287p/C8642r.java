package com.airbnb.lottie.p287p;

import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.animation.keyframe.C8496g;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import com.airbnb.lottie.value.C8659a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.p.r */
class C8642r {

    /* renamed from: a */
    static C8631a f22201a = C8631a.m20077a("k");

    /* renamed from: a */
    static <T> List<C8659a<T>> m20127a(C8630c cVar, C8506c cVar2, float f, C8626j0<T> j0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.peek() == C8632b.STRING) {
            cVar2.mo22928a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.mo23229b();
        while (cVar.mo23233f()) {
            if (cVar.mo23225a(f22201a) != 0) {
                cVar.mo23240m();
            } else if (cVar.peek() == C8632b.BEGIN_ARRAY) {
                cVar.mo23227a();
                if (cVar.peek() == C8632b.NUMBER) {
                    arrayList.add(C8641q.m20123a(cVar, cVar2, f, j0Var, false));
                } else {
                    while (cVar.mo23233f()) {
                        arrayList.add(C8641q.m20123a(cVar, cVar2, f, j0Var, true));
                    }
                }
                cVar.mo23230c();
            } else {
                arrayList.add(C8641q.m20123a(cVar, cVar2, f, j0Var, false));
            }
        }
        cVar.mo23231d();
        m20128a(arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public static <T> void m20128a(List<? extends C8659a<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C8659a aVar = (C8659a) list.get(i2);
            i2++;
            C8659a aVar2 = (C8659a) list.get(i2);
            aVar.f22240f = Float.valueOf(aVar2.f22239e);
            if (aVar.f22237c == null) {
                T t = aVar2.f22236b;
                if (t != null) {
                    aVar.f22237c = t;
                    if (aVar instanceof C8496g) {
                        ((C8496g) aVar).mo22913h();
                    }
                }
            }
        }
        C8659a aVar3 = (C8659a) list.get(i);
        if ((aVar3.f22236b == null || aVar3.f22237c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
