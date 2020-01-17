package com.airbnb.lottie.animation.keyframe;

import com.airbnb.lottie.model.content.C8559b;
import com.airbnb.lottie.value.C8659a;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.c */
public class C8492c extends C8494e<C8559b> {

    /* renamed from: l */
    private final C8559b f21719l;

    public C8492c(List<C8659a<C8559b>> list) {
        super(list);
        int i = 0;
        C8559b bVar = (C8559b) ((C8659a) list.get(0)).f22236b;
        if (bVar != null) {
            i = bVar.mo23072c();
        }
        this.f21719l = new C8559b(new float[i], new int[i]);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C8559b m19612a(C8659a<C8559b> aVar, float f) {
        this.f21719l.mo23069a((C8559b) aVar.f22236b, (C8559b) aVar.f22237c, f);
        return this.f21719l;
    }
}
