package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.j0 */
final class C10331j0 extends C10319h0 {

    /* renamed from: a */
    private int f27024a;

    /* renamed from: b */
    private int f27025b;

    /* renamed from: c */
    private int f27026c;

    /* renamed from: d */
    private int f27027d;

    /* renamed from: e */
    private int f27028e;

    private C10331j0(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.f27028e = Integer.MAX_VALUE;
        this.f27024a = i2 + i;
        this.f27026c = i;
        this.f27027d = this.f27026c;
    }

    /* renamed from: a */
    public final int mo27951a() {
        return this.f27026c - this.f27027d;
    }

    /* renamed from: b */
    public final int mo27952b(int i) throws zzco {
        if (i >= 0) {
            int a = i + mo27951a();
            int i2 = this.f27028e;
            if (a <= i2) {
                this.f27028e = a;
                this.f27024a += this.f27025b;
                int i3 = this.f27024a;
                int i4 = i3 - this.f27027d;
                int i5 = this.f27028e;
                if (i4 > i5) {
                    this.f27025b = i4 - i5;
                    this.f27024a = i3 - this.f27025b;
                } else {
                    this.f27025b = 0;
                }
                return i2;
            }
            throw zzco.m26829a();
        }
        throw new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}
