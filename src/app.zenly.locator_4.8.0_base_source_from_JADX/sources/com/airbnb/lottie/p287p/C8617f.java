package com.airbnb.lottie.p287p;

import android.graphics.Color;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.f */
public class C8617f implements C8626j0<Integer> {

    /* renamed from: a */
    public static final C8617f f22145a = new C8617f();

    private C8617f() {
    }

    /* renamed from: a */
    public Integer m20045a(C8630c cVar, float f) throws IOException {
        boolean z = cVar.peek() == C8632b.BEGIN_ARRAY;
        if (z) {
            cVar.mo23227a();
        }
        double h = cVar.mo23235h();
        double h2 = cVar.mo23235h();
        double h3 = cVar.mo23235h();
        double h4 = cVar.mo23235h();
        if (z) {
            cVar.mo23230c();
        }
        if (h <= 1.0d && h2 <= 1.0d && h3 <= 1.0d && h4 <= 1.0d) {
            h *= 255.0d;
            h2 *= 255.0d;
            h3 *= 255.0d;
            h4 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) h4, (int) h, (int) h2, (int) h3));
    }
}
