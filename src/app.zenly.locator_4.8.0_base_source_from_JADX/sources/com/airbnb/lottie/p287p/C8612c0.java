package com.airbnb.lottie.p287p;

import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import com.airbnb.lottie.value.C8662d;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.c0 */
public class C8612c0 implements C8626j0<C8662d> {

    /* renamed from: a */
    public static final C8612c0 f22140a = new C8612c0();

    private C8612c0() {
    }

    /* renamed from: a */
    public C8662d m20028a(C8630c cVar, float f) throws IOException {
        boolean z = cVar.peek() == C8632b.BEGIN_ARRAY;
        if (z) {
            cVar.mo23227a();
        }
        float h = (float) cVar.mo23235h();
        float h2 = (float) cVar.mo23235h();
        while (cVar.mo23233f()) {
            cVar.mo23240m();
        }
        if (z) {
            cVar.mo23230c();
        }
        return new C8662d((h / 100.0f) * f, (h2 / 100.0f) * f);
    }
}
