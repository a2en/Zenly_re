package com.facebook.common.memory;

import com.facebook.common.internal.C9536j;
import java.io.InputStream;

/* renamed from: com.facebook.common.memory.d */
public class C9548d extends InputStream {

    /* renamed from: e */
    final PooledByteBuffer f24734e;

    /* renamed from: f */
    int f24735f = 0;

    /* renamed from: g */
    int f24736g = 0;

    public C9548d(PooledByteBuffer pooledByteBuffer) {
        C9536j.m23275a(!pooledByteBuffer.isClosed());
        C9536j.m23271a(pooledByteBuffer);
        this.f24734e = pooledByteBuffer;
    }

    public int available() {
        return this.f24734e.size() - this.f24735f;
    }

    public void mark(int i) {
        this.f24736g = this.f24735f;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f24734e;
        int i = this.f24735f;
        this.f24735f = i + 1;
        return pooledByteBuffer.read(i) & 255;
    }

    public void reset() {
        this.f24735f = this.f24736g;
    }

    public long skip(long j) {
        C9536j.m23275a(j >= 0);
        int min = Math.min((int) j, available());
        this.f24735f += min;
        return (long) min;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("length=");
            sb.append(bArr.length);
            sb.append("; regionStart=");
            sb.append(i);
            sb.append("; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.f24734e.read(this.f24735f, bArr, i, min);
        this.f24735f += min;
        return min;
    }
}
