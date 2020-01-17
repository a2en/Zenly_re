package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8661c;
import com.airbnb.lottie.value.C8662d;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.j */
public class C8499j extends C8494e<C8662d> {

    /* renamed from: l */
    private final C8662d f21730l = new C8662d();

    public C8499j(List<C8659a<C8662d>> list) {
        super(list);
    }

    /* renamed from: a */
    public C8662d m19627a(C8659a<C8662d> aVar, float f) {
        T t = aVar.f22236b;
        if (t != null) {
            T t2 = aVar.f22237c;
            if (t2 != null) {
                C8662d dVar = (C8662d) t;
                C8662d dVar2 = (C8662d) t2;
                C8661c<A> cVar = this.f21712e;
                if (cVar != null) {
                    C8662d dVar3 = (C8662d) cVar.mo23298a(aVar.f22239e, aVar.f22240f.floatValue(), dVar, dVar2, f, mo22901d(), mo22902e());
                    if (dVar3 != null) {
                        return dVar3;
                    }
                }
                this.f21730l.mo23304b(C8657g.m20191c(dVar.mo23301a(), dVar2.mo23301a(), f), C8657g.m20191c(dVar.mo23303b(), dVar2.mo23303b(), f));
                return this.f21730l;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
