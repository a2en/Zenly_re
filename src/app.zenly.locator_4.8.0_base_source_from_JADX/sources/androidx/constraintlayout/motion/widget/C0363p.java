package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.View.MeasureSpec;
import androidx.constraintlayout.widget.C0467a;
import androidx.constraintlayout.widget.C0467a.C0469b;
import androidx.constraintlayout.widget.C0473c.C0474a;
import androidx.constraintlayout.widget.C0473c.C0476c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p214e.p229f.p230a.p231a.C7590c;

/* renamed from: androidx.constraintlayout.motion.widget.p */
class C0363p implements Comparable<C0363p> {

    /* renamed from: s */
    static String[] f1647s = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: e */
    C7590c f1648e;

    /* renamed from: f */
    int f1649f = 0;

    /* renamed from: g */
    float f1650g;

    /* renamed from: h */
    float f1651h;

    /* renamed from: i */
    float f1652i;

    /* renamed from: j */
    float f1653j;

    /* renamed from: k */
    float f1654k;

    /* renamed from: l */
    float f1655l;

    /* renamed from: m */
    float f1656m = Float.NaN;

    /* renamed from: n */
    int f1657n = C0328c.f1473e;

    /* renamed from: o */
    LinkedHashMap<String, C0467a> f1658o = new LinkedHashMap<>();

    /* renamed from: p */
    int f1659p = 0;

    /* renamed from: q */
    double[] f1660q = new double[18];

    /* renamed from: r */
    double[] f1661r = new double[18];

    public C0363p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2364a(C0351h hVar, C0363p pVar, C0363p pVar2) {
        C0351h hVar2 = hVar;
        C0363p pVar3 = pVar;
        C0363p pVar4 = pVar2;
        float f = ((float) hVar2.f1474a) / 100.0f;
        this.f1650g = f;
        this.f1649f = hVar2.f1536i;
        float f2 = Float.isNaN(hVar2.f1537j) ? f : hVar2.f1537j;
        float f3 = Float.isNaN(hVar2.f1538k) ? f : hVar2.f1538k;
        float f4 = pVar4.f1654k;
        float f5 = pVar3.f1654k;
        float f6 = f4 - f5;
        float f7 = pVar4.f1655l;
        float f8 = pVar3.f1655l;
        float f9 = f7 - f8;
        this.f1651h = this.f1650g;
        float f10 = pVar3.f1652i;
        float f11 = (f5 / 2.0f) + f10;
        float f12 = pVar3.f1653j;
        float f13 = (pVar4.f1652i + (f4 / 2.0f)) - f11;
        float f14 = (pVar4.f1653j + (f7 / 2.0f)) - (f12 + (f8 / 2.0f));
        float f15 = f6 * f2;
        float f16 = f15 / 2.0f;
        this.f1652i = (float) ((int) ((f10 + (f13 * f)) - f16));
        float f17 = f9 * f3;
        float f18 = f17 / 2.0f;
        this.f1653j = (float) ((int) ((f12 + (f14 * f)) - f18));
        this.f1654k = (float) ((int) (f5 + f15));
        this.f1655l = (float) ((int) (f8 + f17));
        C0351h hVar3 = hVar;
        float f19 = Float.isNaN(hVar3.f1539l) ? f : hVar3.f1539l;
        float f20 = 0.0f;
        float f21 = Float.isNaN(hVar3.f1542o) ? 0.0f : hVar3.f1542o;
        if (!Float.isNaN(hVar3.f1540m)) {
            f = hVar3.f1540m;
        }
        if (!Float.isNaN(hVar3.f1541n)) {
            f20 = hVar3.f1541n;
        }
        this.f1659p = 2;
        C0363p pVar5 = pVar;
        this.f1652i = (float) ((int) (((pVar5.f1652i + (f19 * f13)) + (f20 * f14)) - f16));
        this.f1653j = (float) ((int) (((pVar5.f1653j + (f13 * f21)) + (f14 * f)) - f18));
        this.f1648e = C7590c.m18378a(hVar3.f1534g);
        this.f1657n = hVar3.f1535h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2369b(C0351h hVar, C0363p pVar, C0363p pVar2) {
        C0351h hVar2 = hVar;
        C0363p pVar3 = pVar;
        C0363p pVar4 = pVar2;
        float f = ((float) hVar2.f1474a) / 100.0f;
        this.f1650g = f;
        this.f1649f = hVar2.f1536i;
        float f2 = Float.isNaN(hVar2.f1537j) ? f : hVar2.f1537j;
        float f3 = Float.isNaN(hVar2.f1538k) ? f : hVar2.f1538k;
        float f4 = pVar4.f1654k - pVar3.f1654k;
        float f5 = pVar4.f1655l - pVar3.f1655l;
        this.f1651h = this.f1650g;
        if (!Float.isNaN(hVar2.f1539l)) {
            f = hVar2.f1539l;
        }
        float f6 = pVar3.f1652i;
        float f7 = pVar3.f1654k;
        float f8 = (f7 / 2.0f) + f6;
        float f9 = pVar3.f1653j;
        float f10 = pVar3.f1655l;
        float f11 = (pVar4.f1652i + (pVar4.f1654k / 2.0f)) - f8;
        float f12 = (pVar4.f1653j + (pVar4.f1655l / 2.0f)) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f;
        float f14 = f4 * f2;
        float f15 = f14 / 2.0f;
        this.f1652i = (float) ((int) ((f6 + f13) - f15));
        float f16 = f * f12;
        float f17 = f5 * f3;
        float f18 = f17 / 2.0f;
        this.f1653j = (float) ((int) ((f9 + f16) - f18));
        this.f1654k = (float) ((int) (f7 + f14));
        this.f1655l = (float) ((int) (f10 + f17));
        C0351h hVar3 = hVar;
        float f19 = Float.isNaN(hVar3.f1540m) ? 0.0f : hVar3.f1540m;
        float f20 = (-f12) * f19;
        float f21 = f11 * f19;
        this.f1659p = 1;
        C0363p pVar5 = pVar;
        this.f1652i = (float) ((int) ((pVar5.f1652i + f13) - f15));
        this.f1653j = (float) ((int) ((pVar5.f1653j + f16) - f18));
        this.f1652i += f20;
        this.f1653j += f21;
        this.f1648e = C7590c.m18378a(hVar3.f1534g);
        this.f1657n = hVar3.f1535h;
    }

    public C0363p(int i, int i2, C0351h hVar, C0363p pVar, C0363p pVar2) {
        int i3 = hVar.f1543p;
        if (i3 == 1) {
            mo2369b(hVar, pVar, pVar2);
        } else if (i3 != 2) {
            mo2364a(hVar, pVar, pVar2);
        } else {
            mo2362a(i, i2, hVar, pVar, pVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2362a(int i, int i2, C0351h hVar, C0363p pVar, C0363p pVar2) {
        C0351h hVar2 = hVar;
        C0363p pVar3 = pVar;
        C0363p pVar4 = pVar2;
        float f = ((float) hVar2.f1474a) / 100.0f;
        this.f1650g = f;
        this.f1649f = hVar2.f1536i;
        float f2 = Float.isNaN(hVar2.f1537j) ? f : hVar2.f1537j;
        float f3 = Float.isNaN(hVar2.f1538k) ? f : hVar2.f1538k;
        float f4 = pVar4.f1654k;
        float f5 = pVar3.f1654k;
        float f6 = f4 - f5;
        float f7 = pVar4.f1655l;
        float f8 = pVar3.f1655l;
        float f9 = f7 - f8;
        this.f1651h = this.f1650g;
        float f10 = pVar3.f1652i;
        float f11 = (f5 / 2.0f) + f10;
        float f12 = pVar3.f1653j;
        float f13 = pVar4.f1652i + (f4 / 2.0f);
        float f14 = (pVar4.f1653j + (f7 / 2.0f)) - (f12 + (f8 / 2.0f));
        float f15 = f6 * f2;
        this.f1652i = (float) ((int) ((f10 + ((f13 - f11) * f)) - (f15 / 2.0f)));
        float f16 = f9 * f3;
        this.f1653j = (float) ((int) ((f12 + (f14 * f)) - (f16 / 2.0f)));
        this.f1654k = (float) ((int) (f5 + f15));
        this.f1655l = (float) ((int) (f8 + f16));
        this.f1659p = 3;
        C0351h hVar3 = hVar;
        if (!Float.isNaN(hVar3.f1539l)) {
            this.f1652i = (float) ((int) (hVar3.f1539l * ((float) ((int) (((float) i) - this.f1654k)))));
        }
        if (!Float.isNaN(hVar3.f1540m)) {
            this.f1653j = (float) ((int) (hVar3.f1540m * ((float) ((int) (((float) i2) - this.f1655l)))));
        }
        this.f1648e = C7590c.m18378a(hVar3.f1534g);
        this.f1657n = hVar3.f1535h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2370b(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f1652i;
        float f2 = this.f1653j;
        float f3 = this.f1654k;
        float f4 = this.f1655l;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 0) {
                if (i3 == 1) {
                    f = f5;
                } else if (i3 == 2) {
                    f2 = f5;
                } else if (i3 == 3) {
                    f3 = f5;
                } else if (i3 == 4) {
                    f4 = f5;
                }
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        boolean isNaN = Float.isNaN(Float.NaN);
        boolean isNaN2 = Float.isNaN(Float.NaN);
        float f8 = f + 0.0f;
        float f9 = f2 + 0.0f;
        float f10 = f6 + 0.0f;
        float f11 = f2 + 0.0f;
        float f12 = f6 + 0.0f;
        float f13 = f7 + 0.0f;
        float f14 = f + 0.0f;
        float f15 = f7 + 0.0f;
        int i4 = i + 1;
        fArr[i] = f8;
        int i5 = i4 + 1;
        fArr[i4] = f9;
        int i6 = i5 + 1;
        fArr[i5] = f10;
        int i7 = i6 + 1;
        fArr[i6] = f11;
        int i8 = i7 + 1;
        fArr[i7] = f12;
        int i9 = i8 + 1;
        fArr[i8] = f13;
        int i10 = i9 + 1;
        fArr[i9] = f14;
        fArr[i10] = f15;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2371b(String str) {
        return this.f1658o.containsKey(str);
    }

    /* renamed from: a */
    private boolean m1655a(float f, float f2) {
        boolean z = true;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) == Float.isNaN(f2)) {
                z = false;
            }
            return z;
        }
        if (Math.abs(f - f2) <= 1.0E-6f) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2365a(C0363p pVar, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | m1655a(this.f1651h, pVar.f1651h);
        zArr[1] = zArr[1] | m1655a(this.f1652i, pVar.f1652i) | z;
        zArr[2] = z | m1655a(this.f1653j, pVar.f1653j) | zArr[2];
        zArr[3] = zArr[3] | m1655a(this.f1654k, pVar.f1654k);
        zArr[4] = m1655a(this.f1655l, pVar.f1655l) | zArr[4];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2368a(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f1652i;
        float f2 = this.f1653j;
        float f3 = this.f1654k;
        float f4 = this.f1655l;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2363a(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f;
        View view2 = view;
        int[] iArr2 = iArr;
        float f2 = this.f1652i;
        float f3 = this.f1653j;
        float f4 = this.f1654k;
        float f5 = this.f1655l;
        if (iArr2.length != 0 && this.f1660q.length <= iArr2[iArr2.length - 1]) {
            int i = iArr2[iArr2.length - 1] + 1;
            this.f1660q = new double[i];
            this.f1661r = new double[i];
        }
        Arrays.fill(this.f1660q, Double.NaN);
        int i2 = 0;
        for (int i3 = 0; i3 < iArr2.length; i3++) {
            this.f1660q[iArr2[i3]] = dArr[i3];
            this.f1661r[iArr2[i3]] = dArr2[i3];
        }
        float f6 = f2;
        float f7 = f3;
        float f8 = f4;
        float f9 = f5;
        float f10 = Float.NaN;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (true) {
            double[] dArr4 = this.f1660q;
            if (i2 >= dArr4.length) {
                break;
            }
            boolean isNaN = Double.isNaN(dArr4[i2]);
            double d = 0.0d;
            if (!isNaN || !(dArr3 == null || dArr3[i2] == 0.0d)) {
                if (dArr3 != null) {
                    d = dArr3[i2];
                }
                if (!Double.isNaN(this.f1660q[i2])) {
                    d = this.f1660q[i2] + d;
                }
                f = f10;
                float f15 = (float) d;
                float f16 = (float) this.f1661r[i2];
                if (i2 != 0) {
                    if (i2 == 1) {
                        f6 = f15;
                        f11 = f16;
                    } else if (i2 == 2) {
                        f7 = f15;
                        f13 = f16;
                    } else if (i2 == 3) {
                        f8 = f15;
                        f12 = f16;
                    } else if (i2 == 4) {
                        f9 = f15;
                        f14 = f16;
                    } else if (i2 == 5) {
                        f10 = f15;
                        i2++;
                    }
                }
            } else {
                f = f10;
            }
            f10 = f;
            i2++;
        }
        float f17 = f10;
        if (!Float.isNaN(f17)) {
            float f18 = Float.NaN;
            if (Float.isNaN(Float.NaN)) {
                f18 = 0.0f;
            }
            view2.setRotation((float) (((double) f18) + ((double) f17) + Math.toDegrees(Math.atan2((double) (f13 + (f14 / 2.0f)), (double) (f11 + (f12 / 2.0f))))));
        } else if (!Float.isNaN(Float.NaN)) {
            view2.setRotation(Float.NaN);
        }
        float f19 = f6 + 0.5f;
        int i4 = (int) f19;
        float f20 = f7 + 0.5f;
        int i5 = (int) f20;
        int i6 = (int) (f19 + f8);
        int i7 = (int) (f20 + f9);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (!(i8 == view.getWidth() && i9 == view.getHeight())) {
            view2.measure(MeasureSpec.makeMeasureSpec(i8, 1073741824), MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view2.layout(i4, i5, i6, i7);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2361a(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 != 0) {
                if (i2 == 1) {
                    f3 = f7;
                } else if (i2 == 2) {
                    f5 = f7;
                } else if (i2 == 3) {
                    f4 = f7;
                } else if (i2 == 4) {
                    f6 = f7;
                }
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        float f10 = (f6 * 1.0f) + f9;
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (f10 * f2) + 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2367a(double[] dArr, int[] iArr) {
        float[] fArr = {this.f1651h, this.f1652i, this.f1653j, this.f1654k, this.f1655l, this.f1656m};
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] < fArr.length) {
                int i3 = i + 1;
                dArr[i] = (double) fArr[iArr[i2]];
                i = i3;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2358a(String str) {
        return ((C0467a) this.f1658o.get(str)).mo2756c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2359a(String str, double[] dArr, int i) {
        C0467a aVar = (C0467a) this.f1658o.get(str);
        if (aVar.mo2756c() == 1) {
            dArr[i] = (double) aVar.mo2755b();
            return 1;
        }
        int c = aVar.mo2756c();
        float[] fArr = new float[c];
        aVar.mo2754a(fArr);
        int i2 = 0;
        while (i2 < c) {
            int i3 = i + 1;
            dArr[i] = (double) fArr[i2];
            i2++;
            i = i3;
        }
        return c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2360a(float f, float f2, float f3, float f4) {
        this.f1652i = f;
        this.f1653j = f2;
        this.f1654k = f3;
        this.f1655l = f4;
    }

    /* renamed from: a */
    public int compareTo(C0363p pVar) {
        return Float.compare(this.f1651h, pVar.f1651h);
    }

    /* renamed from: a */
    public void mo2366a(C0474a aVar) {
        this.f1648e = C7590c.m18378a(aVar.f2227c.f2297c);
        C0476c cVar = aVar.f2227c;
        this.f1657n = cVar.f2298d;
        this.f1656m = cVar.f2301g;
        this.f1649f = cVar.f2299e;
        float f = aVar.f2226b.f2306e;
        for (String str : aVar.f2230f.keySet()) {
            C0467a aVar2 = (C0467a) aVar.f2230f.get(str);
            if (aVar2.mo2751a() != C0469b.STRING_TYPE) {
                this.f1658o.put(str, aVar2);
            }
        }
    }
}
