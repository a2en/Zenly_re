package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8659a;

/* renamed from: com.airbnb.lottie.animation.keyframe.g */
public class C8496g extends C8659a<PointF> {

    /* renamed from: o */
    private Path f21723o;

    /* renamed from: p */
    private final C8659a<PointF> f21724p;

    public C8496g(C8506c cVar, C8659a<PointF> aVar) {
        super(cVar, aVar.f22236b, aVar.f22237c, aVar.f22238d, aVar.f22239e, aVar.f22240f);
        this.f21724p = aVar;
        mo22913h();
    }

    /* renamed from: h */
    public void mo22913h() {
        boolean z;
        T t;
        T t2 = this.f22237c;
        if (t2 != null) {
            T t3 = this.f22236b;
            if (t3 != null && ((PointF) t3).equals(((PointF) t2).x, ((PointF) t2).y)) {
                z = true;
                t = this.f22237c;
                if (t != null && !z) {
                    PointF pointF = (PointF) this.f22236b;
                    PointF pointF2 = (PointF) t;
                    C8659a<PointF> aVar = this.f21724p;
                    this.f21723o = C8658h.m20197a(pointF, pointF2, aVar.f22247m, aVar.f22248n);
                    return;
                }
            }
        }
        z = false;
        t = this.f22237c;
        if (t != null) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Path mo22914i() {
        return this.f21723o;
    }
}
