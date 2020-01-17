package com.airbnb.lottie.model.content;

import com.airbnb.lottie.p289q.C8652b;
import com.airbnb.lottie.p289q.C8657g;

/* renamed from: com.airbnb.lottie.model.content.b */
public class C8559b {

    /* renamed from: a */
    private final float[] f21893a;

    /* renamed from: b */
    private final int[] f21894b;

    public C8559b(float[] fArr, int[] iArr) {
        this.f21893a = fArr;
        this.f21894b = iArr;
    }

    /* renamed from: a */
    public int[] mo23070a() {
        return this.f21894b;
    }

    /* renamed from: b */
    public float[] mo23071b() {
        return this.f21893a;
    }

    /* renamed from: c */
    public int mo23072c() {
        return this.f21894b.length;
    }

    /* renamed from: a */
    public void mo23069a(C8559b bVar, C8559b bVar2, float f) {
        if (bVar.f21894b.length == bVar2.f21894b.length) {
            for (int i = 0; i < bVar.f21894b.length; i++) {
                this.f21893a[i] = C8657g.m20191c(bVar.f21893a[i], bVar2.f21893a[i], f);
                this.f21894b[i] = C8652b.m20151a(f, bVar.f21894b[i], bVar2.f21894b[i]);
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot interpolate between gradients. Lengths vary (");
        sb.append(bVar.f21894b.length);
        sb.append(" vs ");
        sb.append(bVar2.f21894b.length);
        sb.append(")");
        throw new IllegalArgumentException(sb.toString());
    }
}
