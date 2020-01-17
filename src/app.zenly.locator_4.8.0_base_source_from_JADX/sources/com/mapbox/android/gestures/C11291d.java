package com.mapbox.android.gestures;

/* renamed from: com.mapbox.android.gestures.d */
public class C11291d {

    /* renamed from: a */
    private final float f29181a;

    /* renamed from: b */
    private final float f29182b;

    /* renamed from: c */
    private final float f29183c;

    /* renamed from: d */
    private final float f29184d;

    /* renamed from: e */
    private final float f29185e;

    public C11291d(float f, float f2, float f3, float f4) {
        this.f29181a = f;
        this.f29182b = f2;
        this.f29183c = f3;
        this.f29184d = f4;
        Math.sqrt((double) ((f * f) + (f2 * f2)));
        this.f29185e = (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }

    /* renamed from: a */
    public float mo32813a() {
        return this.f29183c;
    }

    /* renamed from: b */
    public float mo32814b() {
        return this.f29185e;
    }

    /* renamed from: c */
    public float mo32815c() {
        return this.f29184d;
    }

    /* renamed from: d */
    public float mo32816d() {
        return this.f29181a;
    }

    /* renamed from: e */
    public float mo32817e() {
        return this.f29182b;
    }
}
