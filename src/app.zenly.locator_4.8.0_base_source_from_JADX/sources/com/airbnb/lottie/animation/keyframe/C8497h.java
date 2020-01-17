package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8661c;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.h */
public class C8497h extends C8494e<PointF> {

    /* renamed from: l */
    private final PointF f21725l = new PointF();

    /* renamed from: m */
    private final float[] f21726m = new float[2];

    /* renamed from: n */
    private C8496g f21727n;

    /* renamed from: o */
    private PathMeasure f21728o = new PathMeasure();

    public C8497h(List<? extends C8659a<PointF>> list) {
        super(list);
    }

    /* renamed from: a */
    public PointF m19623a(C8659a<PointF> aVar, float f) {
        C8496g gVar = (C8496g) aVar;
        Path i = gVar.mo22914i();
        if (i == null) {
            return (PointF) aVar.f22236b;
        }
        C8661c<A> cVar = this.f21712e;
        if (cVar != null) {
            PointF pointF = (PointF) cVar.mo23298a(gVar.f22239e, gVar.f22240f.floatValue(), gVar.f22236b, gVar.f22237c, mo22901d(), f, mo22902e());
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f21727n != gVar) {
            this.f21728o.setPath(i, false);
            this.f21727n = gVar;
        }
        PathMeasure pathMeasure = this.f21728o;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.f21726m, null);
        PointF pointF2 = this.f21725l;
        float[] fArr = this.f21726m;
        pointF2.set(fArr[0], fArr[1]);
        return this.f21725l;
    }
}
