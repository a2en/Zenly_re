package com.crashlytics.android.core;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.crashlytics.android.core.g */
final class C9318g implements Flushable {

    /* renamed from: e */
    private final byte[] f24178e;

    /* renamed from: f */
    private final int f24179f;

    /* renamed from: g */
    private int f24180g = 0;

    /* renamed from: h */
    private final OutputStream f24181h;

    /* renamed from: com.crashlytics.android.core.g$a */
    static class C9319a extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        C9319a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C9318g(OutputStream outputStream, byte[] bArr) {
        this.f24181h = outputStream;
        this.f24178e = bArr;
        this.f24179f = bArr.length;
    }

    /* renamed from: a */
    public static C9318g m22478a(OutputStream outputStream) {
        return m22479a(outputStream, 4096);
    }

    /* renamed from: b */
    public static int m22481b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m22486b(boolean z) {
        return 1;
    }

    /* renamed from: c */
    public static int m22487c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: c */
    public static int m22488c(C9311d dVar) {
        return m22495j(dVar.mo25073b()) + dVar.mo25073b();
    }

    /* renamed from: e */
    public static int m22490e(int i, int i2) {
        return m22497l(i) + m22493h(i2);
    }

    /* renamed from: h */
    public static int m22493h(int i) {
        return m22494i(i);
    }

    /* renamed from: i */
    public static int m22494i(int i) {
        if (i >= 0) {
            return m22495j(i);
        }
        return 10;
    }

    /* renamed from: j */
    public static int m22495j(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: k */
    public static int m22496k(int i) {
        return m22495j(m22499n(i));
    }

    /* renamed from: l */
    public static int m22497l(int i) {
        return m22495j(C9422w0.m22791a(i, 0));
    }

    /* renamed from: m */
    public static int m22498m(int i) {
        return m22495j(i);
    }

    /* renamed from: n */
    public static int m22499n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* renamed from: b */
    public void mo25103b(int i, int i2) throws IOException {
        mo25107c(i, 0);
        mo25111f(i2);
    }

    /* renamed from: d */
    public void mo25109d(int i, int i2) throws IOException {
        mo25107c(i, 0);
        mo25113g(i2);
    }

    /* renamed from: f */
    public void mo25111f(int i) throws IOException {
        mo25110e(m22499n(i));
    }

    public void flush() throws IOException {
        if (this.f24181h != null) {
            m22480a();
        }
    }

    /* renamed from: g */
    public void mo25113g(int i) throws IOException {
        mo25110e(i);
    }

    /* renamed from: a */
    public static C9318g m22479a(OutputStream outputStream, int i) {
        return new C9318g(outputStream, new byte[i]);
    }

    /* renamed from: f */
    public static int m22491f(int i, int i2) {
        return m22497l(i) + m22496k(i2);
    }

    /* renamed from: g */
    public static int m22492g(int i, int i2) {
        return m22497l(i) + m22498m(i2);
    }

    /* renamed from: e */
    public void mo25110e(int i) throws IOException {
        while ((i & -128) != 0) {
            mo25106c((i & 127) | 128);
            i >>>= 7;
        }
        mo25106c(i);
    }

    /* renamed from: d */
    public static int m22489d(long j) {
        return m22487c(j);
    }

    /* renamed from: a */
    public void mo25091a(int i, float f) throws IOException {
        mo25107c(i, 5);
        mo25089a(f);
    }

    /* renamed from: b */
    public void mo25104b(long j) throws IOException {
        mo25096a(j);
    }

    /* renamed from: c */
    public void mo25106c(int i) throws IOException {
        mo25088a((byte) i);
    }

    /* renamed from: b */
    public void mo25102b(int i) throws IOException {
        if (i >= 0) {
            mo25110e(i);
        } else {
            mo25096a((long) i);
        }
    }

    /* renamed from: c */
    public void mo25107c(int i, int i2) throws IOException {
        mo25110e(C9422w0.m22791a(i, i2));
    }

    /* renamed from: d */
    public void mo25108d(int i) throws IOException {
        mo25106c(i & 255);
        mo25106c((i >> 8) & 255);
        mo25106c((i >> 16) & 255);
        mo25106c((i >> 24) & 255);
    }

    /* renamed from: a */
    public void mo25093a(int i, long j) throws IOException {
        mo25107c(i, 0);
        mo25104b(j);
    }

    /* renamed from: b */
    public static int m22482b(int i, float f) {
        return m22497l(i) + m22481b(f);
    }

    /* renamed from: b */
    public static int m22483b(int i, long j) {
        return m22497l(i) + m22489d(j);
    }

    /* renamed from: a */
    public void mo25095a(int i, boolean z) throws IOException {
        mo25107c(i, 0);
        mo25099a(z);
    }

    /* renamed from: b */
    public static int m22485b(int i, boolean z) {
        return m22497l(i) + m22486b(z);
    }

    /* renamed from: b */
    public static int m22484b(int i, C9311d dVar) {
        return m22497l(i) + m22488c(dVar);
    }

    /* renamed from: a */
    public void mo25094a(int i, C9311d dVar) throws IOException {
        mo25107c(i, 2);
        mo25097a(dVar);
    }

    /* renamed from: b */
    public void mo25105b(C9311d dVar) throws IOException {
        mo25098a(dVar, 0, dVar.mo25073b());
    }

    /* renamed from: a */
    public void mo25092a(int i, int i2) throws IOException {
        mo25107c(i, 0);
        mo25090a(i2);
    }

    /* renamed from: a */
    public void mo25089a(float f) throws IOException {
        mo25108d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public void mo25099a(boolean z) throws IOException {
        mo25106c(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo25097a(C9311d dVar) throws IOException {
        mo25110e(dVar.mo25073b());
        mo25105b(dVar);
    }

    /* renamed from: a */
    public void mo25090a(int i) throws IOException {
        mo25102b(i);
    }

    /* renamed from: a */
    private void m22480a() throws IOException {
        OutputStream outputStream = this.f24181h;
        if (outputStream != null) {
            outputStream.write(this.f24178e, 0, this.f24180g);
            this.f24180g = 0;
            return;
        }
        throw new C9319a();
    }

    /* renamed from: a */
    public void mo25088a(byte b) throws IOException {
        if (this.f24180g == this.f24179f) {
            m22480a();
        }
        byte[] bArr = this.f24178e;
        int i = this.f24180g;
        this.f24180g = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    public void mo25100a(byte[] bArr) throws IOException {
        mo25101a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo25101a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f24179f;
        int i4 = this.f24180g;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f24178e, i4, i2);
            this.f24180g += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f24178e, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f24180g = this.f24179f;
        m22480a();
        if (i7 <= this.f24179f) {
            System.arraycopy(bArr, i6, this.f24178e, 0, i7);
            this.f24180g = i7;
            return;
        }
        this.f24181h.write(bArr, i6, i7);
    }

    /* renamed from: a */
    public void mo25098a(C9311d dVar, int i, int i2) throws IOException {
        int i3 = this.f24179f;
        int i4 = this.f24180g;
        if (i3 - i4 >= i2) {
            dVar.mo25072a(this.f24178e, i, i4, i2);
            this.f24180g += i2;
            return;
        }
        int i5 = i3 - i4;
        dVar.mo25072a(this.f24178e, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f24180g = this.f24179f;
        m22480a();
        if (i7 <= this.f24179f) {
            dVar.mo25072a(this.f24178e, i6, 0, i7);
            this.f24180g = i7;
            return;
        }
        InputStream a = dVar.mo25071a();
        long j = (long) i6;
        if (j == a.skip(j)) {
            while (i7 > 0) {
                int min = Math.min(i7, this.f24179f);
                int read = a.read(this.f24178e, 0, min);
                if (read == min) {
                    this.f24181h.write(this.f24178e, 0, read);
                    i7 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    /* renamed from: a */
    public void mo25096a(long j) throws IOException {
        while ((-128 & j) != 0) {
            mo25106c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        mo25106c((int) j);
    }
}
