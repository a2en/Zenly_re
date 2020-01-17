package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.clearcut.f0 */
class C10305f0 extends C10298e0 {

    /* renamed from: h */
    protected final byte[] f26988h;

    C10305f0(byte[] bArr) {
        this.f26988h = bArr;
    }

    /* renamed from: a */
    public byte mo27798a(int i) {
        return this.f26988h[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo27900a(int i, int i2, int i3) {
        return C10292d1.m26014a(i, this.f26988h, mo27799d(), i3);
    }

    /* renamed from: a */
    public final C10431y mo27901a(int i, int i2) {
        int b = C10431y.m26594b(0, i2, size());
        return b == 0 ? C10431y.f27328f : new C10272b0(this.f26988h, mo27799d(), b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo27902a(Charset charset) {
        return new String(this.f26988h, mo27799d(), size(), charset);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27903a(C10425x xVar) throws IOException {
        xVar.mo28185a(this.f26988h, mo27799d(), size());
    }

    /* renamed from: a */
    public final boolean mo27904a() {
        int d = mo27799d();
        return C10360m3.m26329a(this.f26988h, d, size() + d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo27905a(C10431y yVar, int i, int i2) {
        if (i2 > yVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > yVar.size()) {
            int size2 = yVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(yVar instanceof C10305f0)) {
            return yVar.mo27901a(0, i2).equals(mo27901a(0, i2));
        } else {
            C10305f0 f0Var = (C10305f0) yVar;
            byte[] bArr = this.f26988h;
            byte[] bArr2 = f0Var.f26988h;
            int d = mo27799d() + i2;
            int d2 = mo27799d();
            int d3 = f0Var.mo27799d();
            while (d2 < d) {
                if (bArr[d2] != bArr2[d3]) {
                    return false;
                }
                d2++;
                d3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo27799d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10431y) || size() != ((C10431y) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C10305f0)) {
            return obj.equals(this);
        }
        C10305f0 f0Var = (C10305f0) obj;
        int b = mo28190b();
        int b2 = f0Var.mo28190b();
        if (b == 0 || b2 == 0 || b == b2) {
            return mo27905a((C10431y) f0Var, 0, size());
        }
        return false;
    }

    public int size() {
        return this.f26988h.length;
    }
}
