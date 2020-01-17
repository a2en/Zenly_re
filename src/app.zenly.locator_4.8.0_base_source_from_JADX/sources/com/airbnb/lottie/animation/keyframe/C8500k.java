package com.airbnb.lottie.animation.keyframe;

import android.graphics.Path;
import com.airbnb.lottie.model.content.C8571k;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8659a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.k */
public class C8500k extends BaseKeyframeAnimation<C8571k, Path> {

    /* renamed from: l */
    private final C8571k f21731l = new C8571k();

    /* renamed from: m */
    private final Path f21732m = new Path();

    public C8500k(List<C8659a<C8571k>> list) {
        super(list);
    }

    /* renamed from: a */
    public Path m19629a(C8659a<C8571k> aVar, float f) {
        this.f21731l.mo23124a((C8571k) aVar.f22236b, (C8571k) aVar.f22237c, f);
        C8657g.m20187a(this.f21731l, this.f21732m);
        return this.f21732m;
    }
}
