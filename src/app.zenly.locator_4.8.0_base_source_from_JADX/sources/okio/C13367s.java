package okio;

import java.util.Arrays;

/* renamed from: okio.s */
final class C13367s extends C13346d {

    /* renamed from: j */
    final transient byte[][] f34672j;

    /* renamed from: k */
    final transient int[] f34673k;

    C13367s(C13342c cVar, int i) {
        super(null);
        C13370u.m35433a(cVar.f34606f, 0, (long) i);
        int i2 = 0;
        C13365q qVar = cVar.f34605e;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = qVar.f34665c;
            int i6 = qVar.f34664b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                qVar = qVar.f34668f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f34672j = new byte[i4][];
        this.f34673k = new int[(i4 * 2)];
        C13365q qVar2 = cVar.f34605e;
        int i7 = 0;
        while (i2 < i) {
            this.f34672j[i7] = qVar2.f34663a;
            i2 += qVar2.f34665c - qVar2.f34664b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f34673k;
            iArr[i7] = i2;
            iArr[this.f34672j.length + i7] = qVar2.f34664b;
            qVar2.f34666d = true;
            i7++;
            qVar2 = qVar2.f34668f;
        }
    }

    /* renamed from: k */
    private C13346d m35403k() {
        return new C13346d(mo38531i());
    }

    private Object writeReplace() {
        return m35403k();
    }

    /* renamed from: a */
    public String mo38515a() {
        return m35403k().mo38515a();
    }

    /* renamed from: b */
    public String mo38520b() {
        return m35403k().mo38520b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public byte[] mo38522c() {
        return mo38531i();
    }

    /* renamed from: d */
    public C13346d mo38524d() {
        return m35403k().mo38524d();
    }

    /* renamed from: e */
    public C13346d mo38525e() {
        return m35403k().mo38525e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (mo38518a(0, r5, 0, mo38528g()) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof okio.C13346d
            r2 = 0
            if (r1 == 0) goto L_0x0020
            okio.d r5 = (okio.C13346d) r5
            int r1 = r5.mo38528g()
            int r3 = r4.mo38528g()
            if (r1 != r3) goto L_0x0020
            int r1 = r4.mo38528g()
            boolean r5 = r4.mo38518a(r2, r5, r2, r1)
            if (r5 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13367s.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public C13346d mo38527f() {
        return m35403k().mo38527f();
    }

    /* renamed from: g */
    public int mo38528g() {
        return this.f34673k[this.f34672j.length - 1];
    }

    /* renamed from: h */
    public C13346d mo38529h() {
        return m35403k().mo38529h();
    }

    public int hashCode() {
        int i = this.f34619f;
        if (i != 0) {
            return i;
        }
        int length = this.f34672j.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f34672j[i2];
            int[] iArr = this.f34673k;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f34619f = i3;
        return i3;
    }

    /* renamed from: i */
    public byte[] mo38531i() {
        int[] iArr = this.f34673k;
        byte[][] bArr = this.f34672j;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f34673k;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f34672j[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: j */
    public String mo38532j() {
        return m35403k().mo38532j();
    }

    public String toString() {
        return m35403k().toString();
    }

    /* renamed from: b */
    private int m35402b(int i) {
        int binarySearch = Arrays.binarySearch(this.f34673k, 0, this.f34672j.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: a */
    public C13346d mo38516a(int i, int i2) {
        return m35403k().mo38516a(i, i2);
    }

    /* renamed from: a */
    public byte mo38513a(int i) {
        int i2;
        C13370u.m35433a((long) this.f34673k[this.f34672j.length - 1], (long) i, 1);
        int b = m35402b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f34673k[b - 1];
        }
        int[] iArr = this.f34673k;
        byte[][] bArr = this.f34672j;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38517a(C13342c cVar) {
        int length = this.f34672j.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f34673k;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C13365q qVar = new C13365q(this.f34672j[i], i3, (i3 + i4) - i2, true, false);
            C13365q qVar2 = cVar.f34605e;
            if (qVar2 == null) {
                qVar.f34669g = qVar;
                qVar.f34668f = qVar;
                cVar.f34605e = qVar;
            } else {
                qVar2.f34669g.mo38571a(qVar);
            }
            i++;
            i2 = i4;
        }
        cVar.f34606f += (long) i2;
    }

    /* renamed from: a */
    public boolean mo38518a(int i, C13346d dVar, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo38528g() - i3) {
            return false;
        }
        int b = m35402b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f34673k[b - 1];
            }
            int min = Math.min(i3, ((this.f34673k[b] - i4) + i4) - i);
            int[] iArr = this.f34673k;
            byte[][] bArr = this.f34672j;
            if (!dVar.mo38519a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo38519a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo38528g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m35402b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f34673k[b - 1];
            }
            int min = Math.min(i3, ((this.f34673k[b] - i4) + i4) - i);
            int[] iArr = this.f34673k;
            byte[][] bArr2 = this.f34672j;
            if (!C13370u.m35435a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }
}
