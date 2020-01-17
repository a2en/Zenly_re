package p214e.p229f.p230a.p231a;

/* renamed from: e.f.a.a.d */
public class C7592d extends C7588b {

    /* renamed from: a */
    private double[] f19078a;

    /* renamed from: b */
    private double[][] f19079b;

    public C7592d(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f19078a = dArr;
        this.f19079b = dArr2;
        if (length2 > 2) {
            double d = 0.0d;
            double d2 = 0.0d;
            int i = 0;
            while (i < dArr.length) {
                double d3 = dArr2[i][0];
                double d4 = dArr2[i][0];
                if (i > 0) {
                    Math.hypot(d3 - d2, d4 - d);
                }
                i++;
                d2 = d3;
                d = d4;
            }
        }
    }

    /* renamed from: a */
    public void mo19630a(double d, double[] dArr) {
        double[] dArr2 = this.f19078a;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.f19079b[0].length;
        if (d <= dArr2[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = this.f19079b[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr2[i3]) {
            while (i < length2) {
                dArr[i] = this.f19079b[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f19078a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.f19079b[i4][i5];
                }
            }
            double[] dArr3 = this.f19078a;
            int i6 = i4 + 1;
            if (d < dArr3[i6]) {
                double d2 = (d - dArr3[i4]) / (dArr3[i6] - dArr3[i4]);
                while (i < length2) {
                    double[][] dArr4 = this.f19079b;
                    dArr[i] = (dArr4[i4][i] * (1.0d - d2)) + (dArr4[i6][i] * d2);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* renamed from: b */
    public void mo19633b(double d, double[] dArr) {
        double[] dArr2 = this.f19078a;
        int length = dArr2.length;
        int length2 = this.f19079b[0].length;
        if (d <= dArr2[0]) {
            d = dArr2[0];
        } else {
            int i = length - 1;
            if (d >= dArr2[i]) {
                d = dArr2[i];
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.f19078a;
            int i3 = i2 + 1;
            if (d <= dArr3[i3]) {
                double d2 = dArr3[i3] - dArr3[i2];
                double d3 = dArr3[i2];
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.f19079b;
                    dArr[i4] = (dArr4[i3][i4] - dArr4[i2][i4]) / d2;
                }
                return;
            }
            i2 = i3;
        }
    }

    /* renamed from: a */
    public void mo19631a(double d, float[] fArr) {
        double[] dArr = this.f19078a;
        int length = dArr.length;
        int i = 0;
        int length2 = this.f19079b[0].length;
        if (d <= dArr[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) this.f19079b[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        if (d >= dArr[i3]) {
            while (i < length2) {
                fArr[i] = (float) this.f19079b[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < i3) {
            if (d == this.f19078a[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.f19079b[i4][i5];
                }
            }
            double[] dArr2 = this.f19078a;
            int i6 = i4 + 1;
            if (d < dArr2[i6]) {
                double d2 = (d - dArr2[i4]) / (dArr2[i6] - dArr2[i4]);
                while (i < length2) {
                    double[][] dArr3 = this.f19079b;
                    fArr[i] = (float) ((dArr3[i4][i] * (1.0d - d2)) + (dArr3[i6][i] * d2));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* renamed from: a */
    public double mo19629a(double d, int i) {
        double[] dArr = this.f19078a;
        int length = dArr.length;
        int i2 = 0;
        if (d <= dArr[0]) {
            return this.f19079b[0][i];
        }
        int i3 = length - 1;
        if (d >= dArr[i3]) {
            return this.f19079b[i3][i];
        }
        while (i2 < i3) {
            double[] dArr2 = this.f19078a;
            if (d == dArr2[i2]) {
                return this.f19079b[i2][i];
            }
            int i4 = i2 + 1;
            if (d < dArr2[i4]) {
                double d2 = (d - dArr2[i2]) / (dArr2[i4] - dArr2[i2]);
                double[][] dArr3 = this.f19079b;
                return (dArr3[i2][i] * (1.0d - d2)) + (dArr3[i4][i] * d2);
            }
            i2 = i4;
        }
        return 0.0d;
    }

    /* renamed from: a */
    public double[] mo19632a() {
        return this.f19078a;
    }
}
