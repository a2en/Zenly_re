package com.airbnb.lottie.p287p;

import android.graphics.PointF;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.y */
public class C8649y implements C8626j0<PointF> {

    /* renamed from: a */
    public static final C8649y f22211a = new C8649y();

    private C8649y() {
    }

    /* renamed from: a */
    public PointF m20143a(C8630c cVar, float f) throws IOException {
        C8632b peek = cVar.peek();
        if (peek == C8632b.BEGIN_ARRAY) {
            return C8639p.m20119d(cVar, f);
        }
        if (peek == C8632b.BEGIN_OBJECT) {
            return C8639p.m20119d(cVar, f);
        }
        if (peek == C8632b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.mo23235h()) * f, ((float) cVar.mo23235h()) * f);
            while (cVar.mo23233f()) {
                cVar.mo23240m();
            }
            return pointF;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot convert json to point. Next token is ");
        sb.append(peek);
        throw new IllegalArgumentException(sb.toString());
    }
}
