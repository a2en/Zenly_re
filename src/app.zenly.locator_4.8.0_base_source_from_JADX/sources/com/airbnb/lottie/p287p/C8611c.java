package com.airbnb.lottie.p287p;

import android.graphics.PointF;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.animatable.C8546e;
import com.airbnb.lottie.model.animatable.C8548g;
import com.airbnb.lottie.model.animatable.C8550i;
import com.airbnb.lottie.model.animatable.C8553l;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8662d;
import java.io.IOException;
import java.util.List;

/* renamed from: com.airbnb.lottie.p.c */
public class C8611c {

    /* renamed from: a */
    private static C8631a f22138a = C8631a.m20077a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    private static C8631a f22139b = C8631a.m20077a("k");

    /* renamed from: a */
    public static C8553l m20020a(C8630c cVar, C8506c cVar2) throws IOException {
        C8630c cVar3 = cVar;
        C8506c cVar4 = cVar2;
        boolean z = false;
        boolean z2 = cVar.peek() == C8632b.BEGIN_OBJECT;
        if (z2) {
            cVar.mo23229b();
        }
        C8543b bVar = null;
        C8546e eVar = null;
        AnimatableValue animatableValue = null;
        C8548g gVar = null;
        C8543b bVar2 = null;
        C8543b bVar3 = null;
        C8545d dVar = null;
        C8543b bVar4 = null;
        C8543b bVar5 = null;
        while (cVar.mo23233f()) {
            switch (cVar3.mo23225a(f22138a)) {
                case 0:
                    cVar.mo23229b();
                    while (cVar.mo23233f()) {
                        if (cVar3.mo23225a(f22139b) != 0) {
                            cVar.mo23239l();
                            cVar.mo23240m();
                        } else {
                            eVar = C8607a.m20014a(cVar, cVar2);
                        }
                    }
                    cVar.mo23231d();
                    break;
                case 1:
                    animatableValue = C8607a.m20015b(cVar, cVar2);
                    break;
                case 2:
                    gVar = C8613d.m20038f(cVar, cVar2);
                    break;
                case 3:
                    cVar4.mo22928a("Lottie doesn't support 3D layers.");
                    break;
                case 4:
                    break;
                case 5:
                    dVar = C8613d.m20036d(cVar, cVar2);
                    continue;
                case 6:
                    bVar4 = C8613d.m20030a(cVar3, cVar4, z);
                    continue;
                case 7:
                    bVar5 = C8613d.m20030a(cVar3, cVar4, z);
                    continue;
                case 8:
                    bVar2 = C8613d.m20030a(cVar3, cVar4, z);
                    continue;
                case 9:
                    bVar3 = C8613d.m20030a(cVar3, cVar4, z);
                    continue;
                default:
                    cVar.mo23239l();
                    cVar.mo23240m();
                    break;
            }
            C8543b a = C8613d.m20030a(cVar3, cVar4, z);
            if (a.getKeyframes().isEmpty()) {
                C8659a aVar = r1;
                List keyframes = a.getKeyframes();
                C8659a aVar2 = new C8659a(cVar2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(cVar2.mo22936e()));
                keyframes.add(aVar);
            } else if (((C8659a) a.getKeyframes().get(0)).f22236b == null) {
                List keyframes2 = a.getKeyframes();
                C8659a aVar3 = new C8659a(cVar2, Float.valueOf(0.0f), Float.valueOf(0.0f), null, 0.0f, Float.valueOf(cVar2.mo22936e()));
                keyframes2.set(0, aVar3);
                bVar = a;
                z = false;
            }
            bVar = a;
            z = false;
        }
        if (z2) {
            cVar.mo23231d();
        }
        C8546e eVar2 = m20023a(eVar) ? null : eVar;
        AnimatableValue animatableValue2 = m20021a(animatableValue) ? null : animatableValue;
        C8543b bVar6 = m20022a(bVar) ? null : bVar;
        if (m20024a(gVar)) {
            gVar = null;
        }
        C8553l lVar = new C8553l(eVar2, animatableValue2, gVar, bVar6, dVar, bVar4, bVar5, m20026c(bVar2) ? null : bVar2, m20025b(bVar3) ? null : bVar3);
        return lVar;
    }

    /* renamed from: b */
    private static boolean m20025b(C8543b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C8659a) bVar.getKeyframes().get(0)).f22236b).floatValue() == 0.0f);
    }

    /* renamed from: c */
    private static boolean m20026c(C8543b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C8659a) bVar.getKeyframes().get(0)).f22236b).floatValue() == 0.0f);
    }

    /* renamed from: a */
    private static boolean m20023a(C8546e eVar) {
        return eVar == null || (eVar.isStatic() && ((PointF) ((C8659a) eVar.getKeyframes().get(0)).f22236b).equals(0.0f, 0.0f));
    }

    /* renamed from: a */
    private static boolean m20021a(AnimatableValue<PointF, PointF> animatableValue) {
        if (animatableValue == null || (!(animatableValue instanceof C8550i) && animatableValue.isStatic() && ((PointF) ((C8659a) animatableValue.getKeyframes().get(0)).f22236b).equals(0.0f, 0.0f))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m20022a(C8543b bVar) {
        return bVar == null || (bVar.isStatic() && ((Float) ((C8659a) bVar.getKeyframes().get(0)).f22236b).floatValue() == 0.0f);
    }

    /* renamed from: a */
    private static boolean m20024a(C8548g gVar) {
        return gVar == null || (gVar.isStatic() && ((C8662d) ((C8659a) gVar.getKeyframes().get(0)).f22236b).mo23302a(1.0f, 1.0f));
    }
}
