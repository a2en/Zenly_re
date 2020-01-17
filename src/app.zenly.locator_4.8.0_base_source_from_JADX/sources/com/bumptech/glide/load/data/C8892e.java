package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.e */
public final class C8892e extends FilterInputStream {

    /* renamed from: g */
    private static final byte[] f23193g = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: h */
    private static final int f23194h = f23193g.length;

    /* renamed from: i */
    private static final int f23195i = (f23194h + 2);

    /* renamed from: e */
    private final byte f23196e;

    /* renamed from: f */
    private int f23197f;

    public C8892e(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot add invalid orientation: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.f23196e = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read() throws java.io.IOException {
        /*
            r3 = this;
            int r0 = r3.f23197f
            r1 = 2
            if (r0 < r1) goto L_0x0017
            int r2 = f23195i
            if (r0 <= r2) goto L_0x000a
            goto L_0x0017
        L_0x000a:
            if (r0 != r2) goto L_0x000f
            byte r0 = r3.f23196e
            goto L_0x001b
        L_0x000f:
            byte[] r2 = f23193g
            int r0 = r0 - r1
            byte r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            goto L_0x001b
        L_0x0017:
            int r0 = super.read()
        L_0x001b:
            r1 = -1
            if (r0 == r1) goto L_0x0024
            int r1 = r3.f23197f
            int r1 = r1 + 1
            r3.f23197f = r1
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.C8892e.read():int");
    }

    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) throws IOException {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f23197f = (int) (((long) this.f23197f) + skip);
        }
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f23197f;
        int i5 = f23195i;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f23196e;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f23193g, this.f23197f - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f23197f += i3;
        }
        return i3;
    }
}
