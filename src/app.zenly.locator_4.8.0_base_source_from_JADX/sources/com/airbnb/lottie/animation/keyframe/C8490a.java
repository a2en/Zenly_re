package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.p289q.C8652b;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8661c;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.a */
public class C8490a extends C8494e<Integer> {
    public C8490a(List<C8659a<Integer>> list) {
        super(list);
    }

    /* renamed from: b */
    public int mo22906b(C8659a<Integer> aVar, float f) {
        T t = aVar.f22236b;
        if (t == null || aVar.f22237c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t).intValue();
        int intValue2 = ((Integer) aVar.f22237c).intValue();
        C8661c<A> cVar = this.f21712e;
        if (cVar != null) {
            Integer num = (Integer) cVar.mo23298a(aVar.f22239e, aVar.f22240f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, mo22901d(), mo22902e());
            if (num != null) {
                return num.intValue();
            }
        }
        return C8652b.m20151a(C8657g.m20181a(f, 0.0f, 1.0f), intValue, intValue2);
    }

    /* renamed from: i */
    public int mo22907i() {
        return mo22906b(mo22894a(), mo22900c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Integer m19604a(C8659a<Integer> aVar, float f) {
        return Integer.valueOf(mo22906b(aVar, f));
    }
}
