package p214e.p229f.p232b;

import p214e.p229f.p232b.C7605i.C7606a;

/* renamed from: e.f.b.b */
public class C7597b implements C7601a {

    /* renamed from: a */
    C7605i f19112a = null;

    /* renamed from: b */
    float f19113b = 0.0f;

    /* renamed from: c */
    boolean f19114c;

    /* renamed from: d */
    public final C7596a f19115d;

    /* renamed from: e */
    boolean f19116e = false;

    public C7597b(C7598c cVar) {
        this.f19115d = new C7596a(this, cVar);
    }

    /* renamed from: a */
    public C7597b mo19674a(C7605i iVar, C7605i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f19113b = (float) i;
        }
        if (!z) {
            this.f19115d.mo19664a(iVar, -1.0f);
            this.f19115d.mo19664a(iVar2, 1.0f);
        } else {
            this.f19115d.mo19664a(iVar, 1.0f);
            this.f19115d.mo19664a(iVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo19687b() {
        C7605i iVar = this.f19112a;
        return iVar != null && (iVar.f19176g == C7606a.UNRESTRICTED || this.f19113b >= 0.0f);
    }

    /* renamed from: c */
    public C7597b mo19689c(C7605i iVar, int i) {
        if (i < 0) {
            this.f19113b = (float) (i * -1);
            this.f19115d.mo19664a(iVar, 1.0f);
        } else {
            this.f19113b = (float) i;
            this.f19115d.mo19664a(iVar, -1.0f);
        }
        return this;
    }

    public void clear() {
        this.f19115d.mo19660a();
        this.f19112a = null;
        this.f19113b = 0.0f;
    }

    /* renamed from: d */
    public void mo19693d() {
        this.f19112a = null;
        this.f19115d.mo19660a();
        this.f19113b = 0.0f;
        this.f19116e = false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo19695e() {
        /*
            r10 = this;
            e.f.b.i r0 = r10.f19112a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            e.f.b.i r1 = r10.f19112a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f19113b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f19113b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L_0x0057
        L_0x0056:
            r1 = 0
        L_0x0057:
            e.f.b.a r5 = r10.f19115d
            int r5 = r5.f19101a
        L_0x005b:
            if (r2 >= r5) goto L_0x00ea
            e.f.b.a r6 = r10.f19115d
            e.f.b.i r6 = r6.mo19657a(r2)
            if (r6 != 0) goto L_0x0067
            goto L_0x00e6
        L_0x0067:
            e.f.b.a r7 = r10.f19115d
            float r7 = r7.mo19667b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x0073
            goto L_0x00e6
        L_0x0073:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0091
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b6
        L_0x0091:
            if (r8 <= 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00b8
        L_0x00a5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00b6:
            float r7 = r7 * r9
        L_0x00b8:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e5
        L_0x00ce:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e5:
            r1 = 1
        L_0x00e6:
            int r2 = r2 + 1
            goto L_0x005b
        L_0x00ea:
            if (r1 != 0) goto L_0x00fd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00fd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p229f.p232b.C7597b.mo19695e():java.lang.String");
    }

    public C7605i getKey() {
        return this.f19112a;
    }

    public String toString() {
        return mo19695e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo19688b(C7605i iVar) {
        return this.f19115d.mo19666a(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C7597b mo19684b(C7605i iVar, int i) {
        this.f19112a = iVar;
        float f = (float) i;
        iVar.f19174e = f;
        this.f19113b = f;
        this.f19116e = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C7605i mo19690c(C7605i iVar) {
        return this.f19115d.mo19659a((boolean[]) null, iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo19694d(C7605i iVar) {
        C7605i iVar2 = this.f19112a;
        if (iVar2 != null) {
            this.f19115d.mo19664a(iVar2, -1.0f);
            this.f19112a = null;
        }
        float a = this.f19115d.mo19656a(iVar, true) * -1.0f;
        this.f19112a = iVar;
        if (a != 1.0f) {
            this.f19113b /= a;
            this.f19115d.mo19661a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7597b mo19673a(C7605i iVar, int i) {
        this.f19115d.mo19664a(iVar, (float) i);
        return this;
    }

    /* renamed from: c */
    public boolean mo19691c() {
        return this.f19112a == null && this.f19113b == 0.0f && this.f19115d.f19101a == 0;
    }

    /* renamed from: a */
    public C7597b mo19677a(C7605i iVar, C7605i iVar2, C7605i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f19113b = (float) i;
        }
        if (!z) {
            this.f19115d.mo19664a(iVar, -1.0f);
            this.f19115d.mo19664a(iVar2, 1.0f);
            this.f19115d.mo19664a(iVar3, 1.0f);
        } else {
            this.f19115d.mo19664a(iVar, 1.0f);
            this.f19115d.mo19664a(iVar2, -1.0f);
            this.f19115d.mo19664a(iVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C7597b mo19685b(C7605i iVar, C7605i iVar2, C7605i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f19113b = (float) i;
        }
        if (!z) {
            this.f19115d.mo19664a(iVar, -1.0f);
            this.f19115d.mo19664a(iVar2, 1.0f);
            this.f19115d.mo19664a(iVar3, -1.0f);
        } else {
            this.f19115d.mo19664a(iVar, 1.0f);
            this.f19115d.mo19664a(iVar2, -1.0f);
            this.f19115d.mo19664a(iVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C7597b mo19671a(float f, float f2, float f3, C7605i iVar, C7605i iVar2, C7605i iVar3, C7605i iVar4) {
        this.f19113b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f19115d.mo19664a(iVar, 1.0f);
            this.f19115d.mo19664a(iVar2, -1.0f);
            this.f19115d.mo19664a(iVar4, 1.0f);
            this.f19115d.mo19664a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f19115d.mo19664a(iVar, 1.0f);
            this.f19115d.mo19664a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f19115d.mo19664a(iVar3, 1.0f);
            this.f19115d.mo19664a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f19115d.mo19664a(iVar, 1.0f);
            this.f19115d.mo19664a(iVar2, -1.0f);
            this.f19115d.mo19664a(iVar4, f4);
            this.f19115d.mo19664a(iVar3, -f4);
        }
        return this;
    }

    /* renamed from: b */
    public C7597b mo19686b(C7605i iVar, C7605i iVar2, C7605i iVar3, C7605i iVar4, float f) {
        this.f19115d.mo19664a(iVar3, 0.5f);
        this.f19115d.mo19664a(iVar4, 0.5f);
        this.f19115d.mo19664a(iVar, -0.5f);
        this.f19115d.mo19664a(iVar2, -0.5f);
        this.f19113b = -f;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7597b mo19675a(C7605i iVar, C7605i iVar2, int i, float f, C7605i iVar3, C7605i iVar4, int i2) {
        if (iVar2 == iVar3) {
            this.f19115d.mo19664a(iVar, 1.0f);
            this.f19115d.mo19664a(iVar4, 1.0f);
            this.f19115d.mo19664a(iVar2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f19115d.mo19664a(iVar, 1.0f);
            this.f19115d.mo19664a(iVar2, -1.0f);
            this.f19115d.mo19664a(iVar3, -1.0f);
            this.f19115d.mo19664a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f19113b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f19115d.mo19664a(iVar, -1.0f);
            this.f19115d.mo19664a(iVar2, 1.0f);
            this.f19113b = (float) i;
        } else if (f >= 1.0f) {
            this.f19115d.mo19664a(iVar3, -1.0f);
            this.f19115d.mo19664a(iVar4, 1.0f);
            this.f19113b = (float) i2;
        } else {
            float f2 = 1.0f - f;
            this.f19115d.mo19664a(iVar, f2 * 1.0f);
            this.f19115d.mo19664a(iVar2, f2 * -1.0f);
            this.f19115d.mo19664a(iVar3, -1.0f * f);
            this.f19115d.mo19664a(iVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f19113b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C7597b mo19672a(C7600e eVar, int i) {
        this.f19115d.mo19664a(eVar.mo19700a(i, "ep"), 1.0f);
        this.f19115d.mo19664a(eVar.mo19700a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7597b mo19676a(C7605i iVar, C7605i iVar2, C7605i iVar3, float f) {
        this.f19115d.mo19664a(iVar, -1.0f);
        this.f19115d.mo19664a(iVar2, 1.0f - f);
        this.f19115d.mo19664a(iVar3, f);
        return this;
    }

    /* renamed from: a */
    public C7597b mo19678a(C7605i iVar, C7605i iVar2, C7605i iVar3, C7605i iVar4, float f) {
        this.f19115d.mo19664a(iVar, -1.0f);
        this.f19115d.mo19664a(iVar2, 1.0f);
        this.f19115d.mo19664a(iVar3, f);
        this.f19115d.mo19664a(iVar4, -f);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19680a() {
        float f = this.f19113b;
        if (f < 0.0f) {
            this.f19113b = f * -1.0f;
            this.f19115d.mo19669b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo19683a(C7600e eVar) {
        boolean z;
        C7605i a = this.f19115d.mo19658a(eVar);
        if (a == null) {
            z = true;
        } else {
            mo19694d(a);
            z = false;
        }
        if (this.f19115d.f19101a == 0) {
            this.f19116e = true;
        }
        return z;
    }

    /* renamed from: a */
    public C7605i mo19679a(C7600e eVar, boolean[] zArr) {
        return this.f19115d.mo19659a(zArr, (C7605i) null);
    }

    /* renamed from: a */
    public void mo19681a(C7601a aVar) {
        if (aVar instanceof C7597b) {
            C7597b bVar = (C7597b) aVar;
            this.f19112a = null;
            this.f19115d.mo19660a();
            int i = 0;
            while (true) {
                C7596a aVar2 = bVar.f19115d;
                if (i < aVar2.f19101a) {
                    this.f19115d.mo19665a(aVar2.mo19657a(i), bVar.f19115d.mo19667b(i), true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19682a(C7605i iVar) {
        int i = iVar.f19173d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.f19115d.mo19664a(iVar, f);
    }
}
