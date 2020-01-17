package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8661c;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.d */
public class C8493d extends C8494e<Integer> {
    public C8493d(List<C8659a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo22909b(C8659a<Integer> aVar, float f) {
        if (aVar.f22236b == null || aVar.f22237c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8661c<A> cVar = this.f21712e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo23298a(aVar.f22239e, aVar.f22240f.floatValue(), aVar.f22236b, aVar.f22237c, f, mo22901d(), mo22902e());
            if (num != null) {
                return num.intValue();
            }
        }
        return C8657g.m20184a(aVar.mo23294f(), aVar.mo23291c(), f);
    }

    /* renamed from: i */
    public int mo22907i() {
        return mo22909b(mo22894a(), mo22900c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Integer m19614a(C8659a<Integer> aVar, float f) {
        return Integer.valueOf(mo22909b(aVar, f));
    }
}
