package p214e.p229f.p232b;

import androidx.constraintlayout.solver.widgets.C0439e;
import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.C0444f;
import java.util.Arrays;
import java.util.HashMap;
import p214e.p229f.p232b.C7605i.C7606a;

/* renamed from: e.f.b.e */
public class C7600e {

    /* renamed from: q */
    private static int f19120q = 1000;

    /* renamed from: r */
    public static C7602f f19121r;

    /* renamed from: a */
    int f19122a = 0;

    /* renamed from: b */
    private HashMap<String, C7605i> f19123b = null;

    /* renamed from: c */
    private C7601a f19124c;

    /* renamed from: d */
    private int f19125d = 32;

    /* renamed from: e */
    private int f19126e;

    /* renamed from: f */
    C7597b[] f19127f;

    /* renamed from: g */
    public boolean f19128g;

    /* renamed from: h */
    public boolean f19129h;

    /* renamed from: i */
    private boolean[] f19130i;

    /* renamed from: j */
    int f19131j;

    /* renamed from: k */
    int f19132k;

    /* renamed from: l */
    private int f19133l;

    /* renamed from: m */
    final C7598c f19134m;

    /* renamed from: n */
    private C7605i[] f19135n;

    /* renamed from: o */
    private int f19136o;

    /* renamed from: p */
    private final C7601a f19137p;

    /* renamed from: e.f.b.e$a */
    interface C7601a {
        /* renamed from: a */
        C7605i mo19679a(C7600e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo19681a(C7601a aVar);

        /* renamed from: a */
        void mo19682a(C7605i iVar);

        void clear();

        C7605i getKey();
    }

    public C7600e() {
        int i = this.f19125d;
        this.f19126e = i;
        this.f19127f = null;
        this.f19128g = false;
        this.f19129h = false;
        this.f19130i = new boolean[i];
        this.f19131j = 1;
        this.f19132k = 0;
        this.f19133l = i;
        this.f19135n = new C7605i[f19120q];
        this.f19136o = 0;
        C7597b[] bVarArr = new C7597b[i];
        this.f19127f = new C7597b[i];
        m18457j();
        this.f19134m = new C7598c();
        this.f19124c = new C7599d(this.f19134m);
        this.f19137p = new C7597b(this.f19134m);
    }

    /* renamed from: d */
    private final void m18453d(C7597b bVar) {
        if (this.f19132k > 0) {
            bVar.f19115d.mo19663a(bVar, this.f19127f);
            if (bVar.f19115d.f19101a == 0) {
                bVar.f19116e = true;
            }
        }
    }

    /* renamed from: g */
    private void m18454g() {
        for (int i = 0; i < this.f19132k; i++) {
            C7597b bVar = this.f19127f[i];
            bVar.f19112a.f19174e = bVar.f19113b;
        }
    }

    /* renamed from: h */
    public static C7602f m18455h() {
        return f19121r;
    }

    /* renamed from: i */
    private void m18456i() {
        this.f19125d *= 2;
        this.f19127f = (C7597b[]) Arrays.copyOf(this.f19127f, this.f19125d);
        C7598c cVar = this.f19134m;
        cVar.f19119c = (C7605i[]) Arrays.copyOf(cVar.f19119c, this.f19125d);
        int i = this.f19125d;
        this.f19130i = new boolean[i];
        this.f19126e = i;
        this.f19133l = i;
        C7602f fVar = f19121r;
        if (fVar != null) {
            fVar.f19143c++;
            fVar.f19154n = Math.max(fVar.f19154n, (long) i);
            C7602f fVar2 = f19121r;
            fVar2.f19139B = fVar2.f19154n;
        }
    }

    /* renamed from: j */
    private void m18457j() {
        int i = 0;
        while (true) {
            C7597b[] bVarArr = this.f19127f;
            if (i < bVarArr.length) {
                C7597b bVar = bVarArr[i];
                if (bVar != null) {
                    this.f19134m.f19117a.release(bVar);
                }
                this.f19127f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public C7605i mo19701a(Object obj) {
        C7605i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f19131j + 1 >= this.f19126e) {
            m18456i();
        }
        if (obj instanceof C0439e) {
            C0439e eVar = (C0439e) obj;
            iVar = eVar.mo2518f();
            if (iVar == null) {
                eVar.mo2508a(this.f19134m);
                iVar = eVar.mo2518f();
            }
            int i = iVar.f19171b;
            if (i == -1 || i > this.f19122a || this.f19134m.f19119c[i] == null) {
                if (iVar.f19171b != -1) {
                    iVar.mo19722a();
                }
                this.f19122a++;
                this.f19131j++;
                int i2 = this.f19122a;
                iVar.f19171b = i2;
                iVar.f19176g = C7606a.UNRESTRICTED;
                this.f19134m.f19119c[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: b */
    public C7597b mo19711b() {
        C7597b bVar = (C7597b) this.f19134m.f19117a.acquire();
        if (bVar == null) {
            bVar = new C7597b(this.f19134m);
        } else {
            bVar.mo19693d();
        }
        C7605i.m18484b();
        return bVar;
    }

    /* renamed from: c */
    public C7605i mo19714c() {
        C7602f fVar = f19121r;
        if (fVar != null) {
            fVar.f19152l++;
        }
        if (this.f19131j + 1 >= this.f19126e) {
            m18456i();
        }
        C7605i a = m18449a(C7606a.SLACK, (String) null);
        this.f19122a++;
        this.f19131j++;
        int i = this.f19122a;
        a.f19171b = i;
        this.f19134m.f19119c[i] = a;
        return a;
    }

    /* renamed from: e */
    public void mo19717e() throws Exception {
        C7602f fVar = f19121r;
        if (fVar != null) {
            fVar.f19144d++;
        }
        if (this.f19128g || this.f19129h) {
            C7602f fVar2 = f19121r;
            if (fVar2 != null) {
                fVar2.f19156p++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f19132k) {
                    z = true;
                    break;
                } else if (!this.f19127f[i].f19116e) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo19705a(this.f19124c);
                return;
            }
            C7602f fVar3 = f19121r;
            if (fVar3 != null) {
                fVar3.f19155o++;
            }
            m18454g();
            return;
        }
        mo19705a(this.f19124c);
    }

    /* renamed from: f */
    public void mo19718f() {
        C7598c cVar;
        int i = 0;
        while (true) {
            cVar = this.f19134m;
            C7605i[] iVarArr = cVar.f19119c;
            if (i >= iVarArr.length) {
                break;
            }
            C7605i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo19722a();
            }
            i++;
        }
        cVar.f19118b.mo19719a(this.f19135n, this.f19136o);
        this.f19136o = 0;
        Arrays.fill(this.f19134m.f19119c, null);
        HashMap<String, C7605i> hashMap = this.f19123b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f19122a = 0;
        this.f19124c.clear();
        this.f19131j = 1;
        for (int i2 = 0; i2 < this.f19132k; i2++) {
            this.f19127f[i2].f19114c = false;
        }
        m18457j();
        this.f19132k = 0;
    }

    /* renamed from: b */
    private void m18451b(C7597b bVar) {
        bVar.mo19672a(this, 0);
    }

    /* renamed from: d */
    public C7598c mo19716d() {
        return this.f19134m;
    }

    /* renamed from: b */
    public int mo19710b(Object obj) {
        C7605i f = ((C0439e) obj).mo2518f();
        if (f != null) {
            return (int) (f.f19174e + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    private int m18450b(C7601a aVar) throws Exception {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f19132k) {
                z = false;
                break;
            }
            C7597b[] bVarArr = this.f19127f;
            if (bVarArr[i].f19112a.f19176g != C7606a.UNRESTRICTED && bVarArr[i].f19113b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C7602f fVar = f19121r;
            if (fVar != null) {
                fVar.f19150j++;
            }
            i2++;
            int i3 = 0;
            int i4 = -1;
            int i5 = -1;
            float f2 = Float.MAX_VALUE;
            int i6 = 0;
            while (i3 < this.f19132k) {
                C7597b bVar = this.f19127f[i3];
                if (bVar.f19112a.f19176g != C7606a.UNRESTRICTED && !bVar.f19116e && bVar.f19113b < f) {
                    int i7 = 1;
                    while (i7 < this.f19131j) {
                        C7605i iVar = this.f19134m.f19119c[i7];
                        float b = bVar.f19115d.mo19668b(iVar);
                        if (b > f) {
                            int i8 = i6;
                            float f3 = f2;
                            int i9 = i5;
                            int i10 = i4;
                            for (int i11 = 0; i11 < 7; i11++) {
                                float f4 = iVar.f19175f[i11] / b;
                                if ((f4 < f3 && i11 == i8) || i11 > i8) {
                                    i9 = i7;
                                    i10 = i3;
                                    f3 = f4;
                                    i8 = i11;
                                }
                            }
                            i4 = i10;
                            i5 = i9;
                            f2 = f3;
                            i6 = i8;
                        }
                        i7++;
                        f = 0.0f;
                    }
                }
                i3++;
                f = 0.0f;
            }
            if (i4 != -1) {
                C7597b bVar2 = this.f19127f[i4];
                bVar2.f19112a.f19172c = -1;
                C7602f fVar2 = f19121r;
                if (fVar2 != null) {
                    fVar2.f19149i++;
                }
                bVar2.mo19694d(this.f19134m.f19119c[i5]);
                C7605i iVar2 = bVar2.f19112a;
                iVar2.f19172c = i4;
                iVar2.mo19726c(bVar2);
            } else {
                z2 = true;
            }
            if (i2 > this.f19131j / 2) {
                z2 = true;
            }
            f = 0.0f;
        }
        return i2;
    }

    /* renamed from: c */
    private final void m18452c(C7597b bVar) {
        C7597b[] bVarArr = this.f19127f;
        int i = this.f19132k;
        if (bVarArr[i] != null) {
            this.f19134m.f19117a.release(bVarArr[i]);
        }
        C7597b[] bVarArr2 = this.f19127f;
        int i2 = this.f19132k;
        bVarArr2[i2] = bVar;
        C7605i iVar = bVar.f19112a;
        iVar.f19172c = i2;
        this.f19132k = i2 + 1;
        iVar.mo19726c(bVar);
    }

    /* renamed from: a */
    public C7605i mo19699a() {
        C7602f fVar = f19121r;
        if (fVar != null) {
            fVar.f19153m++;
        }
        if (this.f19131j + 1 >= this.f19126e) {
            m18456i();
        }
        C7605i a = m18449a(C7606a.SLACK, (String) null);
        this.f19122a++;
        this.f19131j++;
        int i = this.f19122a;
        a.f19171b = i;
        this.f19134m.f19119c[i] = a;
        return a;
    }

    /* renamed from: c */
    public void mo19715c(C7605i iVar, C7605i iVar2, int i, int i2) {
        C7597b b = mo19711b();
        C7605i c = mo19714c();
        c.f19173d = 0;
        b.mo19685b(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo19704a(b, (int) (b.f19115d.mo19668b(c) * -1.0f), i2);
        }
        mo19703a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19704a(C7597b bVar, int i, int i2) {
        bVar.mo19673a(mo19700a(i2, (String) null), i);
    }

    /* renamed from: a */
    public C7605i mo19700a(int i, String str) {
        C7602f fVar = f19121r;
        if (fVar != null) {
            fVar.f19151k++;
        }
        if (this.f19131j + 1 >= this.f19126e) {
            m18456i();
        }
        C7605i a = m18449a(C7606a.ERROR, str);
        this.f19122a++;
        this.f19131j++;
        int i2 = this.f19122a;
        a.f19171b = i2;
        a.f19173d = i;
        this.f19134m.f19119c[i2] = a;
        this.f19124c.mo19682a(a);
        return a;
    }

    /* renamed from: b */
    public void mo19712b(C7605i iVar, C7605i iVar2, int i, int i2) {
        C7597b b = mo19711b();
        C7605i c = mo19714c();
        c.f19173d = 0;
        b.mo19677a(iVar, iVar2, c, i);
        if (i2 != 6) {
            mo19704a(b, (int) (b.f19115d.mo19668b(c) * -1.0f), i2);
        }
        mo19703a(b);
    }

    /* renamed from: a */
    private C7605i m18449a(C7606a aVar, String str) {
        C7605i iVar = (C7605i) this.f19134m.f19118b.acquire();
        if (iVar == null) {
            iVar = new C7605i(aVar, str);
            iVar.mo19724a(aVar, str);
        } else {
            iVar.mo19722a();
            iVar.mo19724a(aVar, str);
        }
        int i = this.f19136o;
        int i2 = f19120q;
        if (i >= i2) {
            f19120q = i2 * 2;
            this.f19135n = (C7605i[]) Arrays.copyOf(this.f19135n, f19120q);
        }
        C7605i[] iVarArr = this.f19135n;
        int i3 = this.f19136o;
        this.f19136o = i3 + 1;
        iVarArr[i3] = iVar;
        return iVar;
    }

    /* renamed from: b */
    public void mo19713b(C7605i iVar, C7605i iVar2, int i, boolean z) {
        C7597b b = mo19711b();
        C7605i c = mo19714c();
        c.f19173d = 0;
        b.mo19685b(iVar, iVar2, c, i);
        if (z) {
            mo19704a(b, (int) (b.f19115d.mo19668b(c) * -1.0f), 1);
        }
        mo19703a(b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19705a(C7601a aVar) throws Exception {
        C7602f fVar = f19121r;
        if (fVar != null) {
            fVar.f19160t++;
            fVar.f19161u = Math.max(fVar.f19161u, (long) this.f19131j);
            C7602f fVar2 = f19121r;
            fVar2.f19162v = Math.max(fVar2.f19162v, (long) this.f19132k);
        }
        m18453d((C7597b) aVar);
        m18450b(aVar);
        m18447a(aVar, false);
        m18454g();
    }

    /* renamed from: a */
    public void mo19703a(C7597b bVar) {
        if (bVar != null) {
            C7602f fVar = f19121r;
            if (fVar != null) {
                fVar.f19145e++;
                if (bVar.f19116e) {
                    fVar.f19146f++;
                }
            }
            if (this.f19132k + 1 >= this.f19133l || this.f19131j + 1 >= this.f19126e) {
                m18456i();
            }
            boolean z = false;
            if (!bVar.f19116e) {
                m18453d(bVar);
                if (!bVar.mo19691c()) {
                    bVar.mo19680a();
                    if (bVar.mo19683a(this)) {
                        C7605i a = mo19699a();
                        bVar.f19112a = a;
                        m18452c(bVar);
                        this.f19137p.mo19681a((C7601a) bVar);
                        m18447a(this.f19137p, true);
                        if (a.f19172c == -1) {
                            if (bVar.f19112a == a) {
                                C7605i c = bVar.mo19690c(a);
                                if (c != null) {
                                    C7602f fVar2 = f19121r;
                                    if (fVar2 != null) {
                                        fVar2.f19149i++;
                                    }
                                    bVar.mo19694d(c);
                                }
                            }
                            if (!bVar.f19116e) {
                                bVar.f19112a.mo19726c(bVar);
                            }
                            this.f19132k--;
                        }
                        z = true;
                    }
                    if (!bVar.mo19687b()) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (!z) {
                m18452c(bVar);
            }
        }
    }

    /* renamed from: a */
    private final int m18447a(C7601a aVar, boolean z) {
        C7602f fVar = f19121r;
        if (fVar != null) {
            fVar.f19147g++;
        }
        for (int i = 0; i < this.f19131j; i++) {
            this.f19130i[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            C7602f fVar2 = f19121r;
            if (fVar2 != null) {
                fVar2.f19148h++;
            }
            i2++;
            if (i2 >= this.f19131j * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.f19130i[aVar.getKey().f19171b] = true;
            }
            C7605i a = aVar.mo19679a(this, this.f19130i);
            if (a != null) {
                boolean[] zArr = this.f19130i;
                int i3 = a.f19171b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.f19132k; i5++) {
                    C7597b bVar = this.f19127f[i5];
                    if (bVar.f19112a.f19176g != C7606a.UNRESTRICTED && !bVar.f19116e && bVar.mo19688b(a)) {
                        float b = bVar.f19115d.mo19668b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f19113b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C7597b bVar2 = this.f19127f[i4];
                    bVar2.f19112a.f19172c = -1;
                    C7602f fVar3 = f19121r;
                    if (fVar3 != null) {
                        fVar3.f19149i++;
                    }
                    bVar2.mo19694d(a);
                    C7605i iVar = bVar2.f19112a;
                    iVar.f19172c = i4;
                    iVar.mo19726c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    /* renamed from: a */
    public void mo19708a(C7605i iVar, C7605i iVar2, int i, boolean z) {
        C7597b b = mo19711b();
        C7605i c = mo19714c();
        c.f19173d = 0;
        b.mo19677a(iVar, iVar2, c, i);
        if (z) {
            mo19704a(b, (int) (b.f19115d.mo19668b(c) * -1.0f), 1);
        }
        mo19703a(b);
    }

    /* renamed from: a */
    public void mo19707a(C7605i iVar, C7605i iVar2, int i, float f, C7605i iVar3, C7605i iVar4, int i2, int i3) {
        int i4 = i3;
        C7597b b = mo19711b();
        b.mo19675a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i4 != 6) {
            b.mo19672a(this, i4);
        }
        mo19703a(b);
    }

    /* renamed from: a */
    public void mo19709a(C7605i iVar, C7605i iVar2, C7605i iVar3, C7605i iVar4, float f, int i) {
        C7597b b = mo19711b();
        b.mo19678a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            b.mo19672a(this, i);
        }
        mo19703a(b);
    }

    /* renamed from: a */
    public C7597b mo19698a(C7605i iVar, C7605i iVar2, int i, int i2) {
        C7597b b = mo19711b();
        b.mo19674a(iVar, iVar2, i);
        if (i2 != 6) {
            b.mo19672a(this, i2);
        }
        mo19703a(b);
        return b;
    }

    /* renamed from: a */
    public void mo19706a(C7605i iVar, int i) {
        int i2 = iVar.f19172c;
        if (i2 != -1) {
            C7597b bVar = this.f19127f[i2];
            if (bVar.f19116e) {
                bVar.f19113b = (float) i;
            } else if (bVar.f19115d.f19101a == 0) {
                bVar.f19116e = true;
                bVar.f19113b = (float) i;
            } else {
                C7597b b = mo19711b();
                b.mo19689c(iVar, i);
                mo19703a(b);
            }
        } else {
            C7597b b2 = mo19711b();
            b2.mo19684b(iVar, i);
            mo19703a(b2);
        }
    }

    /* renamed from: a */
    public static C7597b m18448a(C7600e eVar, C7605i iVar, C7605i iVar2, C7605i iVar3, float f, boolean z) {
        C7597b b = eVar.mo19711b();
        if (z) {
            eVar.m18451b(b);
        }
        b.mo19676a(iVar, iVar2, iVar3, f);
        return b;
    }

    /* renamed from: a */
    public void mo19702a(C0444f fVar, C0444f fVar2, float f, int i) {
        C0444f fVar3 = fVar;
        C0444f fVar4 = fVar2;
        C7605i a = mo19701a((Object) fVar3.mo2539a(C0443d.LEFT));
        C7605i a2 = mo19701a((Object) fVar3.mo2539a(C0443d.TOP));
        C7605i a3 = mo19701a((Object) fVar3.mo2539a(C0443d.RIGHT));
        C7605i a4 = mo19701a((Object) fVar3.mo2539a(C0443d.BOTTOM));
        C7605i a5 = mo19701a((Object) fVar4.mo2539a(C0443d.LEFT));
        C7605i a6 = mo19701a((Object) fVar4.mo2539a(C0443d.TOP));
        C7605i a7 = mo19701a((Object) fVar4.mo2539a(C0443d.RIGHT));
        C7605i a8 = mo19701a((Object) fVar4.mo2539a(C0443d.BOTTOM));
        C7597b b = mo19711b();
        double d = (double) f;
        C7605i iVar = a3;
        double d2 = (double) i;
        C7605i iVar2 = a7;
        b.mo19686b(a2, a4, a6, a8, (float) (Math.sin(d) * d2));
        mo19703a(b);
        C7597b b2 = mo19711b();
        b2.mo19686b(a, iVar, a5, iVar2, (float) (Math.cos(d) * d2));
        mo19703a(b2);
    }
}
