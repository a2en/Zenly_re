package p214e.p229f.p230a.p231a;

import androidx.constraintlayout.motion.widget.C0362o;

/* renamed from: e.f.a.a.g */
public class C7595g extends C0362o {

    /* renamed from: a */
    private float f19088a;

    /* renamed from: b */
    private float f19089b;

    /* renamed from: c */
    private float f19090c;

    /* renamed from: d */
    private float f19091d;

    /* renamed from: e */
    private float f19092e;

    /* renamed from: f */
    private float f19093f;

    /* renamed from: g */
    private float f19094g;

    /* renamed from: h */
    private float f19095h;

    /* renamed from: i */
    private float f19096i;

    /* renamed from: j */
    private int f19097j;

    /* renamed from: k */
    private boolean f19098k = false;

    /* renamed from: l */
    private float f19099l;

    /* renamed from: m */
    private float f19100m;

    /* renamed from: b */
    private float m18403b(float f) {
        float f2 = this.f19091d;
        if (f <= f2) {
            float f3 = this.f19088a;
            return (f3 * f) + ((((this.f19089b - f3) * f) * f) / (f2 * 2.0f));
        }
        int i = this.f19097j;
        if (i == 1) {
            return this.f19094g;
        }
        float f4 = f - f2;
        float f5 = this.f19092e;
        if (f4 < f5) {
            float f6 = this.f19094g;
            float f7 = this.f19089b;
            return f6 + (f7 * f4) + ((((this.f19090c - f7) * f4) * f4) / (f5 * 2.0f));
        } else if (i == 2) {
            return this.f19095h;
        } else {
            float f8 = f4 - f5;
            float f9 = this.f19093f;
            if (f8 >= f9) {
                return this.f19096i;
            }
            float f10 = this.f19095h;
            float f11 = this.f19090c;
            return (f10 + (f11 * f8)) - (((f11 * f8) * f8) / (f9 * 2.0f));
        }
    }

    /* renamed from: a */
    public float mo19653a(float f) {
        float f2 = this.f19091d;
        if (f <= f2) {
            float f3 = this.f19088a;
            return f3 + (((this.f19089b - f3) * f) / f2);
        }
        int i = this.f19097j;
        if (i == 1) {
            return 0.0f;
        }
        float f4 = f - f2;
        float f5 = this.f19092e;
        if (f4 < f5) {
            float f6 = this.f19089b;
            return f6 + (((this.f19090c - f6) * f4) / f5);
        } else if (i == 2) {
            return this.f19095h;
        } else {
            float f7 = f4 - f5;
            float f8 = this.f19093f;
            if (f7 >= f8) {
                return this.f19096i;
            }
            float f9 = this.f19090c;
            return f9 - ((f7 * f9) / f8);
        }
    }

    public float getInterpolation(float f) {
        float b = m18403b(f);
        this.f19100m = f;
        return this.f19098k ? this.f19099l - b : this.f19099l + b;
    }

    /* renamed from: a */
    public void mo19654a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f19099l = f;
        this.f19098k = f > f2;
        if (this.f19098k) {
            m18402a(-f3, f - f2, f5, f6, f4);
        } else {
            m18402a(f3, f2 - f, f5, f6, f4);
        }
    }

    /* renamed from: a */
    public float mo2292a() {
        return mo19653a(this.f19100m);
    }

    /* renamed from: a */
    private void m18402a(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f19088a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f2 - ((((-f) / f3) * f) / 2.0f)) * f3));
            if (sqrt < f4) {
                this.f19097j = 2;
                this.f19088a = f;
                this.f19089b = sqrt;
                this.f19090c = 0.0f;
                this.f19091d = (sqrt - f) / f3;
                this.f19092e = sqrt / f3;
                this.f19094g = ((f + sqrt) * this.f19091d) / 2.0f;
                this.f19095h = f2;
                this.f19096i = f2;
                return;
            }
            this.f19097j = 3;
            this.f19088a = f;
            this.f19089b = f4;
            this.f19090c = f4;
            this.f19091d = (f4 - f) / f3;
            this.f19093f = f4 / f3;
            float f8 = ((f + f4) * this.f19091d) / 2.0f;
            float f9 = (this.f19093f * f4) / 2.0f;
            this.f19092e = ((f2 - f8) - f9) / f4;
            this.f19094g = f8;
            this.f19095h = f2 - f9;
            this.f19096i = f2;
        } else if (f7 >= f2) {
            float f10 = (2.0f * f2) / f;
            this.f19097j = 1;
            this.f19088a = f;
            this.f19089b = 0.0f;
            this.f19094g = f2;
            this.f19091d = f10;
        } else {
            float f11 = f2 - f7;
            float f12 = f11 / f;
            if (f12 + f6 < f5) {
                this.f19097j = 2;
                this.f19088a = f;
                this.f19089b = f;
                this.f19090c = 0.0f;
                this.f19094g = f11;
                this.f19095h = f2;
                this.f19091d = f12;
                this.f19092e = f6;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f3 * f2) + ((f * f) / 2.0f)));
            float f13 = (sqrt2 - f) / f3;
            this.f19091d = f13;
            float f14 = sqrt2 / f3;
            this.f19092e = f14;
            if (sqrt2 < f4) {
                this.f19097j = 2;
                this.f19088a = f;
                this.f19089b = sqrt2;
                this.f19090c = 0.0f;
                this.f19091d = f13;
                this.f19092e = f14;
                this.f19094g = ((f + sqrt2) * this.f19091d) / 2.0f;
                this.f19095h = f2;
                return;
            }
            this.f19097j = 3;
            this.f19088a = f;
            this.f19089b = f4;
            this.f19090c = f4;
            this.f19091d = (f4 - f) / f3;
            this.f19093f = f4 / f3;
            float f15 = ((f + f4) * this.f19091d) / 2.0f;
            float f16 = (this.f19093f * f4) / 2.0f;
            this.f19092e = ((f2 - f15) - f16) / f4;
            this.f19094g = f15;
            this.f19095h = f2 - f16;
            this.f19096i = f2;
        }
    }
}
