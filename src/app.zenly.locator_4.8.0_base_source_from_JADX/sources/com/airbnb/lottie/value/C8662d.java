package com.airbnb.lottie.value;

/* renamed from: com.airbnb.lottie.value.d */
public class C8662d {

    /* renamed from: a */
    private float f22251a;

    /* renamed from: b */
    private float f22252b;

    public C8662d(float f, float f2) {
        this.f22251a = f;
        this.f22252b = f2;
    }

    /* renamed from: a */
    public float mo23301a() {
        return this.f22251a;
    }

    /* renamed from: b */
    public float mo23303b() {
        return this.f22252b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo23301a());
        sb.append("x");
        sb.append(mo23303b());
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo23302a(float f, float f2) {
        return this.f22251a == f && this.f22252b == f2;
    }

    /* renamed from: b */
    public void mo23304b(float f, float f2) {
        this.f22251a = f;
        this.f22252b = f2;
    }

    public C8662d() {
        this(1.0f, 1.0f);
    }
}
