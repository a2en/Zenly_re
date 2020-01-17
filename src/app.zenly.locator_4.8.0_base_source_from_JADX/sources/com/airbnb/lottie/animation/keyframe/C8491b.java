package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8661c;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.b */
public class C8491b extends C8494e<Float> {
    public C8491b(List<C8659a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo22908b(C8659a<Float> aVar, float f) {
        if (aVar.f22236b == null || aVar.f22237c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C8661c<A> cVar = this.f21712e;
        if (cVar != null) {
            Float f2 = (Float) cVar.mo23298a(aVar.f22239e, aVar.f22240f.floatValue(), aVar.f22236b, aVar.f22237c, f, mo22901d(), mo22902e());
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        return C8657g.m20191c(aVar.mo23293e(), aVar.mo23290b(), f);
    }

    /* renamed from: i */
    public float mo22907i() {
        return mo22908b(mo22894a(), mo22900c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Float m19608a(C8659a<Float> aVar, float f) {
        return Float.valueOf(mo22908b(aVar, f));
    }
}
