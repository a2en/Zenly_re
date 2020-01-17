package com.airbnb.lottie.model.p284i;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8474c;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.content.C8573m;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.i.f */
public class C8596f extends C8586a {

    /* renamed from: w */
    private final C8474c f22091w;

    C8596f(C8515e eVar, C8592d dVar) {
        super(eVar, dVar);
        this.f22091w = new C8474c(eVar, this, new C8573m("__container", dVar.mo23201l(), false));
        this.f22091w.setContents(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23181a(Canvas canvas, Matrix matrix, int i) {
        this.f22091w.draw(canvas, matrix, i);
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        this.f22091w.getBounds(rectF, this.f22032m, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23183a(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        this.f22091w.resolveKeyPath(eVar, i, list, eVar2);
    }
}
