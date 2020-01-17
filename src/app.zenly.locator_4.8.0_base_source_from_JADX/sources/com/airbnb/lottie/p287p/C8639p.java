package com.airbnb.lottie.p287p;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.p.p */
class C8639p {

    /* renamed from: a */
    private static final C8631a f22196a = C8631a.m20077a("x", "y");

    /* renamed from: com.airbnb.lottie.p.p$a */
    static /* synthetic */ class C8640a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22197a = new int[C8632b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.airbnb.lottie.p.k0.c$b[] r0 = com.airbnb.lottie.p287p.p288k0.C8630c.C8632b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22197a = r0
                int[] r0 = f22197a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.airbnb.lottie.p.k0.c$b r1 = com.airbnb.lottie.p287p.p288k0.C8630c.C8632b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f22197a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.airbnb.lottie.p.k0.c$b r1 = com.airbnb.lottie.p287p.p288k0.C8630c.C8632b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f22197a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.airbnb.lottie.p.k0.c$b r1 = com.airbnb.lottie.p287p.p288k0.C8630c.C8632b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p287p.C8639p.C8640a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static int m20114a(C8630c cVar) throws IOException {
        cVar.mo23227a();
        int h = (int) (cVar.mo23235h() * 255.0d);
        int h2 = (int) (cVar.mo23235h() * 255.0d);
        int h3 = (int) (cVar.mo23235h() * 255.0d);
        while (cVar.mo23233f()) {
            cVar.mo23240m();
        }
        cVar.mo23230c();
        return Color.argb(255, h, h2, h3);
    }

    /* renamed from: b */
    private static PointF m20117b(C8630c cVar, float f) throws IOException {
        float h = (float) cVar.mo23235h();
        float h2 = (float) cVar.mo23235h();
        while (cVar.mo23233f()) {
            cVar.mo23240m();
        }
        return new PointF(h * f, h2 * f);
    }

    /* renamed from: c */
    private static PointF m20118c(C8630c cVar, float f) throws IOException {
        cVar.mo23229b();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22196a);
            if (a == 0) {
                f2 = m20116b(cVar);
            } else if (a != 1) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                f3 = m20116b(cVar);
            }
        }
        cVar.mo23231d();
        return new PointF(f2 * f, f3 * f);
    }

    /* renamed from: d */
    static PointF m20119d(C8630c cVar, float f) throws IOException {
        int i = C8640a.f22197a[cVar.peek().ordinal()];
        if (i == 1) {
            return m20117b(cVar, f);
        }
        if (i == 2) {
            return m20115a(cVar, f);
        }
        if (i == 3) {
            return m20118c(cVar, f);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown point starts with ");
        sb.append(cVar.peek());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    static List<PointF> m20120e(C8630c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.mo23227a();
        while (cVar.peek() == C8632b.BEGIN_ARRAY) {
            cVar.mo23227a();
            arrayList.add(m20119d(cVar, f));
            cVar.mo23230c();
        }
        cVar.mo23230c();
        return arrayList;
    }

    /* renamed from: b */
    static float m20116b(C8630c cVar) throws IOException {
        C8632b peek = cVar.peek();
        int i = C8640a.f22197a[peek.ordinal()];
        if (i == 1) {
            return (float) cVar.mo23235h();
        }
        if (i == 2) {
            cVar.mo23227a();
            float h = (float) cVar.mo23235h();
            while (cVar.mo23233f()) {
                cVar.mo23240m();
            }
            cVar.mo23230c();
            return h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown value for token of type ");
        sb.append(peek);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private static PointF m20115a(C8630c cVar, float f) throws IOException {
        cVar.mo23227a();
        float h = (float) cVar.mo23235h();
        float h2 = (float) cVar.mo23235h();
        while (cVar.peek() != C8632b.END_ARRAY) {
            cVar.mo23240m();
        }
        cVar.mo23230c();
        return new PointF(h * f, h2 * f);
    }
}
