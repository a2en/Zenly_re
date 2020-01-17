package androidx.dynamicanimation.animation;

/* renamed from: androidx.dynamicanimation.animation.g */
public final class C0731g implements C0729e {

    /* renamed from: a */
    double f3026a = Math.sqrt(1500.0d);

    /* renamed from: b */
    double f3027b = 0.5d;

    /* renamed from: c */
    private boolean f3028c = false;

    /* renamed from: d */
    private double f3029d;

    /* renamed from: e */
    private double f3030e;

    /* renamed from: f */
    private double f3031f;

    /* renamed from: g */
    private double f3032g;

    /* renamed from: h */
    private double f3033h;

    /* renamed from: i */
    private double f3034i = Double.MAX_VALUE;

    /* renamed from: j */
    private final C0715p f3035j = new C0715p();

    public C0731g() {
    }

    /* renamed from: a */
    public C0731g mo3680a(float f) {
        if (f >= 0.0f) {
            this.f3027b = (double) f;
            this.f3028c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    /* renamed from: b */
    public C0731g mo3683b(float f) {
        this.f3034i = (double) f;
        return this;
    }

    /* renamed from: c */
    public C0731g mo3684c(float f) {
        if (f > 0.0f) {
            this.f3026a = Math.sqrt((double) f);
            this.f3028c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* renamed from: b */
    private void m3422b() {
        if (!this.f3028c) {
            if (this.f3034i != Double.MAX_VALUE) {
                double d = this.f3027b;
                if (d > 1.0d) {
                    double d2 = -d;
                    double d3 = this.f3026a;
                    this.f3031f = (d2 * d3) + (d3 * Math.sqrt((d * d) - 1.0d));
                    double d4 = this.f3027b;
                    double d5 = -d4;
                    double d6 = this.f3026a;
                    this.f3032g = (d5 * d6) - (d6 * Math.sqrt((d4 * d4) - 1.0d));
                } else if (d >= 0.0d && d < 1.0d) {
                    this.f3033h = this.f3026a * Math.sqrt(1.0d - (d * d));
                }
                this.f3028c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    /* renamed from: a */
    public float mo3678a() {
        return (float) this.f3034i;
    }

    /* renamed from: a */
    public boolean mo3682a(float f, float f2) {
        return ((double) Math.abs(f2)) < this.f3030e && ((double) Math.abs(f - mo3678a())) < this.f3029d;
    }

    public C0731g(float f) {
        this.f3034i = (double) f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0715p mo3679a(double d, double d2, long j) {
        double d3;
        double d4;
        m3422b();
        double d5 = ((double) j) / 1000.0d;
        double d6 = d - this.f3034i;
        double d7 = this.f3027b;
        if (d7 > 1.0d) {
            double d8 = this.f3032g;
            double d9 = (d8 * d6) - d2;
            double d10 = this.f3031f;
            double d11 = d6 - (d9 / (d8 - d10));
            double d12 = ((d6 * d8) - d2) / (d8 - d10);
            d4 = (Math.pow(2.718281828459045d, d8 * d5) * d11) + (Math.pow(2.718281828459045d, this.f3031f * d5) * d12);
            double d13 = this.f3032g;
            double pow = d11 * d13 * Math.pow(2.718281828459045d, d13 * d5);
            double d14 = this.f3031f;
            d3 = pow + (d12 * d14 * Math.pow(2.718281828459045d, d14 * d5));
        } else if (d7 == 1.0d) {
            double d15 = this.f3026a;
            double d16 = d2 + (d15 * d6);
            double d17 = d6 + (d16 * d5);
            d4 = Math.pow(2.718281828459045d, (-d15) * d5) * d17;
            double pow2 = d17 * Math.pow(2.718281828459045d, (-this.f3026a) * d5);
            double d18 = this.f3026a;
            d3 = (d16 * Math.pow(2.718281828459045d, (-d18) * d5)) + (pow2 * (-d18));
        } else {
            double d19 = 1.0d / this.f3033h;
            double d20 = this.f3026a;
            double d21 = d19 * ((d7 * d20 * d6) + d2);
            double pow3 = Math.pow(2.718281828459045d, (-d7) * d20 * d5) * ((Math.cos(this.f3033h * d5) * d6) + (Math.sin(this.f3033h * d5) * d21));
            double d22 = this.f3026a;
            double d23 = (-d22) * pow3;
            double d24 = this.f3027b;
            double d25 = d23 * d24;
            double pow4 = Math.pow(2.718281828459045d, (-d24) * d22 * d5);
            double d26 = this.f3033h;
            double d27 = pow3;
            double sin = (-d26) * d6 * Math.sin(d26 * d5);
            double d28 = this.f3033h;
            d3 = d25 + (pow4 * (sin + (d21 * d28 * Math.cos(d28 * d5))));
            d4 = d27;
        }
        C0715p pVar = this.f3035j;
        pVar.f3000a = (float) (d4 + this.f3034i);
        pVar.f3001b = (float) d3;
        return pVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3681a(double d) {
        this.f3029d = Math.abs(d);
        this.f3030e = this.f3029d * 62.5d;
    }
}
