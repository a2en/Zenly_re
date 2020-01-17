package com.airbnb.lottie.animation.keyframe;

import android.graphics.PointF;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8661c;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.i */
public class C8498i extends C8494e<PointF> {

    /* renamed from: l */
    private final PointF f21729l = new PointF();

    public C8498i(List<C8659a<PointF>> list) {
        super(list);
    }

    /* renamed from: a */
    public PointF m19625a(C8659a<PointF> aVar, float f) {
        T t = aVar.f22236b;
        if (t != null) {
            T t2 = aVar.f22237c;
            if (t2 != null) {
                PointF pointF = (PointF) t;
                PointF pointF2 = (PointF) t2;
                C8661c<A> cVar = this.f21712e;
                if (cVar != null) {
                    PointF pointF3 = (PointF) cVar.mo23298a(aVar.f22239e, aVar.f22240f.floatValue(), pointF, pointF2, f, mo22901d(), mo22902e());
                    if (pointF3 != null) {
                        return pointF3;
                    }
                }
                PointF pointF4 = this.f21729l;
                float f2 = pointF.x;
                float f3 = f2 + ((pointF2.x - f2) * f);
                float f4 = pointF.y;
                pointF4.set(f3, f4 + (f * (pointF2.y - f4)));
                return this.f21729l;
            }
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
