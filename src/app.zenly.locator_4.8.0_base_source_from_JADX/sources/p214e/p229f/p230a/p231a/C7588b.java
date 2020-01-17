package p214e.p229f.p230a.p231a;

/* renamed from: e.f.a.a.b */
public abstract class C7588b {

    /* renamed from: e.f.a.a.b$a */
    static class C7589a extends C7588b {

        /* renamed from: a */
        double f19067a;

        /* renamed from: b */
        double[] f19068b;

        C7589a(double d, double[] dArr) {
            this.f19067a = d;
            this.f19068b = dArr;
        }

        /* renamed from: a */
        public void mo19630a(double d, double[] dArr) {
            double[] dArr2 = this.f19068b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        /* renamed from: b */
        public void mo19633b(double d, double[] dArr) {
            for (int i = 0; i < this.f19068b.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        /* renamed from: a */
        public void mo19631a(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.f19068b;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public double mo19629a(double d, int i) {
            return this.f19068b[i];
        }

        /* renamed from: a */
        public double[] mo19632a() {
            return new double[]{this.f19067a};
        }
    }

    /* renamed from: a */
    public static C7588b m18366a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i == 0) {
            return new C7593e(dArr, dArr2);
        }
        if (i != 2) {
            return new C7592d(dArr, dArr2);
        }
        return new C7589a(dArr[0], dArr2[0]);
    }

    /* renamed from: a */
    public abstract double mo19629a(double d, int i);

    /* renamed from: a */
    public abstract void mo19630a(double d, double[] dArr);

    /* renamed from: a */
    public abstract void mo19631a(double d, float[] fArr);

    /* renamed from: a */
    public abstract double[] mo19632a();

    /* renamed from: b */
    public abstract void mo19633b(double d, double[] dArr);

    /* renamed from: a */
    public static C7588b m18367a(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C7586a(iArr, dArr, dArr2);
    }
}
