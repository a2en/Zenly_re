package p214e.p229f.p230a.p231a;

import java.util.Arrays;

/* renamed from: e.f.a.a.a */
class C7586a extends C7588b {

    /* renamed from: a */
    private final double[] f19046a;

    /* renamed from: b */
    C7587a[] f19047b;

    /* renamed from: e.f.a.a.a$a */
    private static class C7587a {

        /* renamed from: s */
        private static double[] f19048s = new double[91];

        /* renamed from: a */
        double[] f19049a;

        /* renamed from: b */
        double f19050b;

        /* renamed from: c */
        double f19051c;

        /* renamed from: d */
        double f19052d;

        /* renamed from: e */
        double f19053e;

        /* renamed from: f */
        double f19054f;

        /* renamed from: g */
        double f19055g;

        /* renamed from: h */
        double f19056h;

        /* renamed from: i */
        double f19057i;

        /* renamed from: j */
        double f19058j;

        /* renamed from: k */
        double f19059k;

        /* renamed from: l */
        double f19060l;

        /* renamed from: m */
        double f19061m;

        /* renamed from: n */
        double f19062n;

        /* renamed from: o */
        double f19063o;

        /* renamed from: p */
        double f19064p;

        /* renamed from: q */
        boolean f19065q;

        /* renamed from: r */
        boolean f19066r = false;

        C7587a(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            int i2 = i;
            double d7 = d3;
            double d8 = d4;
            double d9 = d5;
            double d10 = d6;
            boolean z = false;
            if (i2 == 1) {
                z = true;
            }
            this.f19065q = z;
            this.f19051c = d;
            this.f19052d = d2;
            this.f19057i = 1.0d / (this.f19052d - this.f19051c);
            if (3 == i2) {
                this.f19066r = true;
            }
            double d11 = d9 - d7;
            double d12 = d4;
            double d13 = d10 - d12;
            if (this.f19066r || Math.abs(d11) < 0.001d || Math.abs(d13) < 0.001d) {
                this.f19066r = true;
                this.f19053e = d7;
                this.f19054f = d9;
                this.f19055g = d12;
                this.f19056h = d10;
                this.f19050b = Math.hypot(d13, d11);
                this.f19062n = this.f19050b * this.f19057i;
                double d14 = this.f19052d;
                double d15 = this.f19051c;
                this.f19060l = d11 / (d14 - d15);
                this.f19061m = d13 / (d14 - d15);
                return;
            }
            this.f19049a = new double[101];
            this.f19058j = d11 * ((double) (this.f19065q ? -1 : 1));
            this.f19059k = d13 * ((double) (this.f19065q ? 1 : -1));
            this.f19060l = this.f19065q ? d9 : d7;
            this.f19061m = this.f19065q ? d12 : d10;
            m18355a(d3, d4, d5, d6);
            this.f19062n = this.f19050b * this.f19057i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public double mo19634a() {
            double d = this.f19058j * this.f19064p;
            double hypot = this.f19062n / Math.hypot(d, (-this.f19059k) * this.f19063o);
            if (this.f19065q) {
                d = -d;
            }
            return d * hypot;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public double mo19636b() {
            double d = (-this.f19059k) * this.f19063o;
            double hypot = this.f19062n / Math.hypot(this.f19058j * this.f19064p, d);
            return this.f19065q ? (-d) * hypot : d * hypot;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public double mo19638c() {
            return this.f19060l + (this.f19058j * this.f19063o);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public double mo19640d() {
            return this.f19061m + (this.f19059k * this.f19064p);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public double mo19642e(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f19049a;
            double length = d * ((double) (dArr.length - 1));
            int i = (int) length;
            return dArr[i] + ((length - ((double) i)) * (dArr[i + 1] - dArr[i]));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo19643f(double d) {
            double e = mo19642e((this.f19065q ? this.f19052d - d : d - this.f19051c) * this.f19057i) * 1.5707963267948966d;
            this.f19063o = Math.sin(e);
            this.f19064p = Math.cos(e);
        }

        /* renamed from: c */
        public double mo19639c(double d) {
            double d2 = (d - this.f19051c) * this.f19057i;
            double d3 = this.f19053e;
            return d3 + (d2 * (this.f19054f - d3));
        }

        /* renamed from: d */
        public double mo19641d(double d) {
            double d2 = (d - this.f19051c) * this.f19057i;
            double d3 = this.f19055g;
            return d3 + (d2 * (this.f19056h - d3));
        }

        /* renamed from: a */
        public double mo19635a(double d) {
            return this.f19060l;
        }

        /* renamed from: b */
        public double mo19637b(double d) {
            return this.f19061m;
        }

        /* renamed from: a */
        private void m18355a(double d, double d2, double d3, double d4) {
            double d5;
            double d6 = d3 - d;
            double d7 = d2 - d4;
            int i = 0;
            double d8 = 0.0d;
            double d9 = 0.0d;
            double d10 = 0.0d;
            while (true) {
                double[] dArr = f19048s;
                if (i >= dArr.length) {
                    break;
                }
                double d11 = d8;
                double radians = Math.toRadians((((double) i) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d6;
                double cos = Math.cos(radians) * d7;
                if (i > 0) {
                    d5 = d11 + Math.hypot(sin - d9, cos - d10);
                    f19048s[i] = d5;
                } else {
                    d5 = d11;
                }
                i++;
                d10 = cos;
                double d12 = sin;
                d8 = d5;
                d9 = d12;
            }
            double d13 = d8;
            this.f19050b = d13;
            int i2 = 0;
            while (true) {
                double[] dArr2 = f19048s;
                if (i2 >= dArr2.length) {
                    break;
                }
                dArr2[i2] = dArr2[i2] / d13;
                i2++;
            }
            int i3 = 0;
            while (true) {
                double[] dArr3 = this.f19049a;
                if (i3 < dArr3.length) {
                    double length = ((double) i3) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f19048s, length);
                    if (binarySearch >= 0) {
                        this.f19049a[i3] = (double) (binarySearch / (f19048s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f19049a[i3] = 0.0d;
                    } else {
                        int i4 = -binarySearch;
                        int i5 = i4 - 2;
                        int i6 = i4 - 1;
                        double d14 = (double) i5;
                        double[] dArr4 = f19048s;
                        this.f19049a[i3] = (d14 + ((length - dArr4[i5]) / (dArr4[i6] - dArr4[i5]))) / ((double) (dArr4.length - 1));
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public C7586a(int[] iArr, double[] dArr, double[][] dArr2) {
        double[] dArr3 = dArr;
        this.f19046a = dArr3;
        this.f19047b = new C7587a[(dArr3.length - 1)];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (i < this.f19047b.length) {
            int i4 = iArr[i];
            int i5 = 2;
            if (i4 == 0) {
                i5 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i5 = 1;
            } else if (i4 == 2) {
                i2 = 2;
            } else if (i4 != 3) {
                i5 = i3;
            } else {
                if (i2 != 1) {
                    i5 = 1;
                }
                i2 = i5;
            }
            C7587a[] aVarArr = this.f19047b;
            int i6 = i + 1;
            C7587a aVar = new C7587a(i5, dArr3[i], dArr3[i6], dArr2[i][0], dArr2[i][1], dArr2[i6][0], dArr2[i6][1]);
            aVarArr[i] = aVar;
            i = i6;
            i3 = i5;
        }
    }

    /* renamed from: a */
    public void mo19630a(double d, double[] dArr) {
        C7587a[] aVarArr = this.f19047b;
        if (d < aVarArr[0].f19051c) {
            d = aVarArr[0].f19051c;
        }
        C7587a[] aVarArr2 = this.f19047b;
        if (d > aVarArr2[aVarArr2.length - 1].f19052d) {
            d = aVarArr2[aVarArr2.length - 1].f19052d;
        }
        int i = 0;
        while (true) {
            C7587a[] aVarArr3 = this.f19047b;
            if (i >= aVarArr3.length) {
                return;
            }
            if (d > aVarArr3[i].f19052d) {
                i++;
            } else if (aVarArr3[i].f19066r) {
                dArr[0] = aVarArr3[i].mo19639c(d);
                dArr[1] = this.f19047b[i].mo19641d(d);
                return;
            } else {
                aVarArr3[i].mo19643f(d);
                dArr[0] = this.f19047b[i].mo19638c();
                dArr[1] = this.f19047b[i].mo19640d();
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo19633b(double d, double[] dArr) {
        C7587a[] aVarArr = this.f19047b;
        if (d < aVarArr[0].f19051c) {
            d = aVarArr[0].f19051c;
        } else if (d > aVarArr[aVarArr.length - 1].f19052d) {
            d = aVarArr[aVarArr.length - 1].f19052d;
        }
        int i = 0;
        while (true) {
            C7587a[] aVarArr2 = this.f19047b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f19052d) {
                i++;
            } else if (aVarArr2[i].f19066r) {
                dArr[0] = aVarArr2[i].mo19635a(d);
                dArr[1] = this.f19047b[i].mo19637b(d);
                return;
            } else {
                aVarArr2[i].mo19643f(d);
                dArr[0] = this.f19047b[i].mo19634a();
                dArr[1] = this.f19047b[i].mo19636b();
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo19631a(double d, float[] fArr) {
        C7587a[] aVarArr = this.f19047b;
        if (d < aVarArr[0].f19051c) {
            d = aVarArr[0].f19051c;
        } else if (d > aVarArr[aVarArr.length - 1].f19052d) {
            d = aVarArr[aVarArr.length - 1].f19052d;
        }
        int i = 0;
        while (true) {
            C7587a[] aVarArr2 = this.f19047b;
            if (i >= aVarArr2.length) {
                return;
            }
            if (d > aVarArr2[i].f19052d) {
                i++;
            } else if (aVarArr2[i].f19066r) {
                fArr[0] = (float) aVarArr2[i].mo19639c(d);
                fArr[1] = (float) this.f19047b[i].mo19641d(d);
                return;
            } else {
                aVarArr2[i].mo19643f(d);
                fArr[0] = (float) this.f19047b[i].mo19638c();
                fArr[1] = (float) this.f19047b[i].mo19640d();
                return;
            }
        }
    }

    /* renamed from: a */
    public double mo19629a(double d, int i) {
        C7587a[] aVarArr = this.f19047b;
        int i2 = 0;
        if (d < aVarArr[0].f19051c) {
            d = aVarArr[0].f19051c;
        } else if (d > aVarArr[aVarArr.length - 1].f19052d) {
            d = aVarArr[aVarArr.length - 1].f19052d;
        }
        while (true) {
            C7587a[] aVarArr2 = this.f19047b;
            if (i2 >= aVarArr2.length) {
                return Double.NaN;
            }
            if (d > aVarArr2[i2].f19052d) {
                i2++;
            } else if (!aVarArr2[i2].f19066r) {
                aVarArr2[i2].mo19643f(d);
                if (i == 0) {
                    return this.f19047b[i2].mo19638c();
                }
                return this.f19047b[i2].mo19640d();
            } else if (i == 0) {
                return aVarArr2[i2].mo19639c(d);
            } else {
                return aVarArr2[i2].mo19641d(d);
            }
        }
    }

    /* renamed from: a */
    public double[] mo19632a() {
        return this.f19046a;
    }
}
