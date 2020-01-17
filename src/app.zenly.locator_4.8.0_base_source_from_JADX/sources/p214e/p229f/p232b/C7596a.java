package p214e.p229f.p232b;

import java.util.Arrays;
import p214e.p229f.p232b.C7605i.C7606a;

/* renamed from: e.f.b.a */
public class C7596a {

    /* renamed from: a */
    int f19101a = 0;

    /* renamed from: b */
    private final C7597b f19102b;

    /* renamed from: c */
    private final C7598c f19103c;

    /* renamed from: d */
    private int f19104d = 8;

    /* renamed from: e */
    private C7605i f19105e = null;

    /* renamed from: f */
    private int[] f19106f;

    /* renamed from: g */
    private int[] f19107g;

    /* renamed from: h */
    private float[] f19108h;

    /* renamed from: i */
    private int f19109i;

    /* renamed from: j */
    private int f19110j;

    /* renamed from: k */
    private boolean f19111k;

    C7596a(C7597b bVar, C7598c cVar) {
        int i = this.f19104d;
        this.f19106f = new int[i];
        this.f19107g = new int[i];
        this.f19108h = new float[i];
        this.f19109i = -1;
        this.f19110j = -1;
        this.f19111k = false;
        this.f19102b = bVar;
        this.f19103c = cVar;
    }

    /* renamed from: a */
    public final void mo19664a(C7605i iVar, float f) {
        if (f == 0.0f) {
            mo19656a(iVar, true);
            return;
        }
        int i = this.f19109i;
        if (i == -1) {
            this.f19109i = 0;
            float[] fArr = this.f19108h;
            int i2 = this.f19109i;
            fArr[i2] = f;
            this.f19106f[i2] = iVar.f19171b;
            this.f19107g[i2] = -1;
            iVar.f19179j++;
            iVar.mo19723a(this.f19102b);
            this.f19101a++;
            if (!this.f19111k) {
                this.f19110j++;
                int i3 = this.f19110j;
                int[] iArr = this.f19106f;
                if (i3 >= iArr.length) {
                    this.f19111k = true;
                    this.f19110j = iArr.length - 1;
                }
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i != -1 && i4 < this.f19101a) {
            int[] iArr2 = this.f19106f;
            int i6 = iArr2[i];
            int i7 = iVar.f19171b;
            if (i6 == i7) {
                this.f19108h[i] = f;
                return;
            }
            if (iArr2[i] < i7) {
                i5 = i;
            }
            i = this.f19107g[i];
            i4++;
        }
        int i8 = this.f19110j;
        int i9 = i8 + 1;
        if (this.f19111k) {
            int[] iArr3 = this.f19106f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f19106f;
        if (i8 >= iArr4.length && this.f19101a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f19106f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f19106f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            this.f19104d *= 2;
            this.f19111k = false;
            this.f19110j = i8 - 1;
            this.f19108h = Arrays.copyOf(this.f19108h, this.f19104d);
            this.f19106f = Arrays.copyOf(this.f19106f, this.f19104d);
            this.f19107g = Arrays.copyOf(this.f19107g, this.f19104d);
        }
        this.f19106f[i8] = iVar.f19171b;
        this.f19108h[i8] = f;
        if (i5 != -1) {
            int[] iArr7 = this.f19107g;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.f19107g[i8] = this.f19109i;
            this.f19109i = i8;
        }
        iVar.f19179j++;
        iVar.mo19723a(this.f19102b);
        this.f19101a++;
        if (!this.f19111k) {
            this.f19110j++;
        }
        if (this.f19101a >= this.f19106f.length) {
            this.f19111k = true;
        }
        int i11 = this.f19110j;
        int[] iArr8 = this.f19106f;
        if (i11 >= iArr8.length) {
            this.f19111k = true;
            this.f19110j = iArr8.length - 1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo19669b() {
        int i = this.f19109i;
        int i2 = 0;
        while (i != -1 && i2 < this.f19101a) {
            float[] fArr = this.f19108h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f19107g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f19109i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f19101a) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(this.f19108h[i]);
            sb3.append(" : ");
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            sb5.append(this.f19103c.f19119c[this.f19106f[i]]);
            str = sb5.toString();
            i = this.f19107g[i];
            i2++;
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final float mo19667b(int i) {
        int i2 = this.f19109i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f19101a) {
            if (i3 == i) {
                return this.f19108h[i2];
            }
            i2 = this.f19107g[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo19668b(C7605i iVar) {
        int i = this.f19109i;
        int i2 = 0;
        while (i != -1 && i2 < this.f19101a) {
            if (this.f19106f[i] == iVar.f19171b) {
                return this.f19108h[i];
            }
            i = this.f19107g[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19665a(C7605i iVar, float f, boolean z) {
        if (f != 0.0f) {
            int i = this.f19109i;
            if (i == -1) {
                this.f19109i = 0;
                float[] fArr = this.f19108h;
                int i2 = this.f19109i;
                fArr[i2] = f;
                this.f19106f[i2] = iVar.f19171b;
                this.f19107g[i2] = -1;
                iVar.f19179j++;
                iVar.mo19723a(this.f19102b);
                this.f19101a++;
                if (!this.f19111k) {
                    this.f19110j++;
                    int i3 = this.f19110j;
                    int[] iArr = this.f19106f;
                    if (i3 >= iArr.length) {
                        this.f19111k = true;
                        this.f19110j = iArr.length - 1;
                    }
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i != -1 && i4 < this.f19101a) {
                int[] iArr2 = this.f19106f;
                int i6 = iArr2[i];
                int i7 = iVar.f19171b;
                if (i6 == i7) {
                    float[] fArr2 = this.f19108h;
                    fArr2[i] = fArr2[i] + f;
                    if (fArr2[i] == 0.0f) {
                        if (i == this.f19109i) {
                            this.f19109i = this.f19107g[i];
                        } else {
                            int[] iArr3 = this.f19107g;
                            iArr3[i5] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo19725b(this.f19102b);
                        }
                        if (this.f19111k) {
                            this.f19110j = i;
                        }
                        iVar.f19179j--;
                        this.f19101a--;
                    }
                    return;
                }
                if (iArr2[i] < i7) {
                    i5 = i;
                }
                i = this.f19107g[i];
                i4++;
            }
            int i8 = this.f19110j;
            int i9 = i8 + 1;
            if (this.f19111k) {
                int[] iArr4 = this.f19106f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f19106f;
            if (i8 >= iArr5.length && this.f19101a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f19106f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f19106f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                this.f19104d *= 2;
                this.f19111k = false;
                this.f19110j = i8 - 1;
                this.f19108h = Arrays.copyOf(this.f19108h, this.f19104d);
                this.f19106f = Arrays.copyOf(this.f19106f, this.f19104d);
                this.f19107g = Arrays.copyOf(this.f19107g, this.f19104d);
            }
            this.f19106f[i8] = iVar.f19171b;
            this.f19108h[i8] = f;
            if (i5 != -1) {
                int[] iArr8 = this.f19107g;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.f19107g[i8] = this.f19109i;
                this.f19109i = i8;
            }
            iVar.f19179j++;
            iVar.mo19723a(this.f19102b);
            this.f19101a++;
            if (!this.f19111k) {
                this.f19110j++;
            }
            int i11 = this.f19110j;
            int[] iArr9 = this.f19106f;
            if (i11 >= iArr9.length) {
                this.f19111k = true;
                this.f19110j = iArr9.length - 1;
            }
        }
    }

    /* renamed from: a */
    public final float mo19656a(C7605i iVar, boolean z) {
        if (this.f19105e == iVar) {
            this.f19105e = null;
        }
        int i = this.f19109i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f19101a) {
            if (this.f19106f[i] == iVar.f19171b) {
                if (i == this.f19109i) {
                    this.f19109i = this.f19107g[i];
                } else {
                    int[] iArr = this.f19107g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo19725b(this.f19102b);
                }
                iVar.f19179j--;
                this.f19101a--;
                this.f19106f[i] = -1;
                if (this.f19111k) {
                    this.f19110j = i;
                }
                return this.f19108h[i];
            }
            i2++;
            i3 = i;
            i = this.f19107g[i];
        }
        return 0.0f;
    }

    /* renamed from: a */
    public final void mo19660a() {
        int i = this.f19109i;
        int i2 = 0;
        while (i != -1 && i2 < this.f19101a) {
            C7605i iVar = this.f19103c.f19119c[this.f19106f[i]];
            if (iVar != null) {
                iVar.mo19725b(this.f19102b);
            }
            i = this.f19107g[i];
            i2++;
        }
        this.f19109i = -1;
        this.f19110j = -1;
        this.f19111k = false;
        this.f19101a = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo19666a(C7605i iVar) {
        int i = this.f19109i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f19101a) {
            if (this.f19106f[i] == iVar.f19171b) {
                return true;
            }
            i = this.f19107g[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19661a(float f) {
        int i = this.f19109i;
        int i2 = 0;
        while (i != -1 && i2 < this.f19101a) {
            float[] fArr = this.f19108h;
            fArr[i] = fArr[i] / f;
            i = this.f19107g[i];
            i2++;
        }
    }

    /* renamed from: a */
    private boolean m18407a(C7605i iVar, C7600e eVar) {
        return iVar.f19179j <= 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008f A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p214e.p229f.p232b.C7605i mo19658a(p214e.p229f.p232b.C7600e r15) {
        /*
            r14 = this;
            int r0 = r14.f19109i
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000a:
            r9 = -1
            if (r0 == r9) goto L_0x0097
            int r9 = r14.f19101a
            if (r2 >= r9) goto L_0x0097
            float[] r9 = r14.f19108h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            e.f.b.c r12 = r14.f19103c
            e.f.b.i[] r12 = r12.f19119c
            int[] r13 = r14.f19106f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x0035
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0041
            r9[r0] = r3
            e.f.b.b r9 = r14.f19102b
            r12.mo19725b(r9)
            goto L_0x0040
        L_0x0035:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0041
            r9[r0] = r3
            e.f.b.b r9 = r14.f19102b
            r12.mo19725b(r9)
        L_0x0040:
            r10 = 0
        L_0x0041:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x008f
            e.f.b.i$a r11 = r12.f19176g
            e.f.b.i$a r13 = p214e.p229f.p232b.C7605i.C7606a.UNRESTRICTED
            if (r11 != r13) goto L_0x006b
            if (r4 != 0) goto L_0x0056
            boolean r4 = r14.m18407a(r12, r15)
        L_0x0052:
            r6 = r4
            r5 = r10
            r4 = r12
            goto L_0x008f
        L_0x0056:
            int r11 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x005f
            boolean r4 = r14.m18407a(r12, r15)
            goto L_0x0052
        L_0x005f:
            if (r6 != 0) goto L_0x008f
            boolean r11 = r14.m18407a(r12, r15)
            if (r11 == 0) goto L_0x008f
            r5 = r10
            r4 = r12
            r6 = 1
            goto L_0x008f
        L_0x006b:
            if (r4 != 0) goto L_0x008f
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L_0x008f
            if (r1 != 0) goto L_0x007b
            boolean r1 = r14.m18407a(r12, r15)
        L_0x0077:
            r8 = r1
            r7 = r10
            r1 = r12
            goto L_0x008f
        L_0x007b:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L_0x0084
            boolean r1 = r14.m18407a(r12, r15)
            goto L_0x0077
        L_0x0084:
            if (r8 != 0) goto L_0x008f
            boolean r11 = r14.m18407a(r12, r15)
            if (r11 == 0) goto L_0x008f
            r7 = r10
            r1 = r12
            r8 = 1
        L_0x008f:
            int[] r9 = r14.f19107g
            r0 = r9[r0]
            int r2 = r2 + 1
            goto L_0x000a
        L_0x0097:
            if (r4 == 0) goto L_0x009a
            return r4
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p229f.p232b.C7596a.mo19658a(e.f.b.e):e.f.b.i");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19662a(C7597b bVar, C7597b bVar2, boolean z) {
        int i = this.f19109i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f19101a) {
                int i3 = this.f19106f[i];
                C7605i iVar = bVar2.f19112a;
                if (i3 == iVar.f19171b) {
                    float f = this.f19108h[i];
                    mo19656a(iVar, z);
                    C7596a aVar = bVar2.f19115d;
                    int i4 = aVar.f19109i;
                    int i5 = 0;
                    while (i4 != -1 && i5 < aVar.f19101a) {
                        mo19665a(this.f19103c.f19119c[aVar.f19106f[i4]], aVar.f19108h[i4] * f, z);
                        i4 = aVar.f19107g[i4];
                        i5++;
                    }
                    bVar.f19113b += bVar2.f19113b * f;
                    if (z) {
                        bVar2.f19112a.mo19725b(bVar);
                    }
                    i = this.f19109i;
                } else {
                    i = this.f19107g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19663a(C7597b bVar, C7597b[] bVarArr) {
        int i = this.f19109i;
        while (true) {
            int i2 = 0;
            while (i != -1 && i2 < this.f19101a) {
                C7605i iVar = this.f19103c.f19119c[this.f19106f[i]];
                if (iVar.f19172c != -1) {
                    float f = this.f19108h[i];
                    mo19656a(iVar, true);
                    C7597b bVar2 = bVarArr[iVar.f19172c];
                    if (!bVar2.f19116e) {
                        C7596a aVar = bVar2.f19115d;
                        int i3 = aVar.f19109i;
                        int i4 = 0;
                        while (i3 != -1 && i4 < aVar.f19101a) {
                            mo19665a(this.f19103c.f19119c[aVar.f19106f[i3]], aVar.f19108h[i3] * f, true);
                            i3 = aVar.f19107g[i3];
                            i4++;
                        }
                    }
                    bVar.f19113b += bVar2.f19113b * f;
                    bVar2.f19112a.mo19725b(bVar);
                    i = this.f19109i;
                } else {
                    i = this.f19107g[i];
                    i2++;
                }
            }
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7605i mo19659a(boolean[] zArr, C7605i iVar) {
        int i = this.f19109i;
        int i2 = 0;
        C7605i iVar2 = null;
        float f = 0.0f;
        while (i != -1 && i2 < this.f19101a) {
            if (this.f19108h[i] < 0.0f) {
                C7605i iVar3 = this.f19103c.f19119c[this.f19106f[i]];
                if ((zArr == null || !zArr[iVar3.f19171b]) && iVar3 != iVar) {
                    C7606a aVar = iVar3.f19176g;
                    if (aVar == C7606a.SLACK || aVar == C7606a.ERROR) {
                        float f2 = this.f19108h[i];
                        if (f2 < f) {
                            iVar2 = iVar3;
                            f = f2;
                        }
                    }
                }
            }
            i = this.f19107g[i];
            i2++;
        }
        return iVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C7605i mo19657a(int i) {
        int i2 = this.f19109i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f19101a) {
            if (i3 == i) {
                return this.f19103c.f19119c[this.f19106f[i2]];
            }
            i2 = this.f19107g[i2];
            i3++;
        }
        return null;
    }
}
