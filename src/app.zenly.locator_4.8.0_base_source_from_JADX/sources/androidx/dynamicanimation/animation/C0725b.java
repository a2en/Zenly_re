package androidx.dynamicanimation.animation;

/* renamed from: androidx.dynamicanimation.animation.b */
public final class C0725b extends DynamicAnimation<C0725b> {

    /* renamed from: t */
    private final C0726a f3018t = new C0726a();

    /* renamed from: androidx.dynamicanimation.animation.b$a */
    static final class C0726a implements C0729e {

        /* renamed from: a */
        private float f3019a = -4.2f;

        /* renamed from: b */
        private float f3020b;

        /* renamed from: c */
        private final C0715p f3021c = new C0715p();

        C0726a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0715p mo3667a(float f, float f2, long j) {
            float f3 = (float) j;
            this.f3021c.f3001b = (float) (((double) f2) * Math.exp((double) ((f3 / 1000.0f) * this.f3019a)));
            C0715p pVar = this.f3021c;
            float f4 = this.f3019a;
            pVar.f3000a = (float) (((double) (f - (f2 / f4))) + (((double) (f2 / f4)) * Math.exp((double) ((f4 * f3) / 1000.0f))));
            C0715p pVar2 = this.f3021c;
            if (mo3669a(pVar2.f3000a, pVar2.f3001b)) {
                this.f3021c.f3001b = 0.0f;
            }
            return this.f3021c;
        }

        /* renamed from: a */
        public boolean mo3669a(float f, float f2) {
            return Math.abs(f2) < this.f3020b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3668a(float f) {
            this.f3020b = f * 62.5f;
        }
    }

    public C0725b(C0728d dVar) {
        super(dVar);
        this.f3018t.mo3668a(mo3617b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3666a(float f, float f2) {
        return f >= this.f2993g || f <= this.f2994h || this.f3018t.mo3669a(f, f2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo3619b(long j) {
        C0715p a = this.f3018t.mo3667a(this.f2988b, this.f2987a, j);
        this.f2988b = a.f3000a;
        this.f2987a = a.f3001b;
        float f = this.f2988b;
        float f2 = this.f2994h;
        if (f < f2) {
            this.f2988b = f2;
            return true;
        }
        float f3 = this.f2993g;
        if (f > f3) {
            this.f2988b = f3;
            return true;
        } else if (mo3666a(f, this.f2987a)) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo3625f(float f) {
        this.f3018t.mo3668a(f);
    }
}
