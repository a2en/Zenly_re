package com.airbnb.lottie.p289q;

/* renamed from: com.airbnb.lottie.q.f */
public class C8656f {

    /* renamed from: a */
    private float f22226a;

    /* renamed from: b */
    private int f22227b;

    /* renamed from: a */
    public void mo23286a(float f) {
        this.f22226a += f;
        this.f22227b++;
        int i = this.f22227b;
        if (i == Integer.MAX_VALUE) {
            this.f22226a /= 2.0f;
            this.f22227b = i / 2;
        }
    }
}
