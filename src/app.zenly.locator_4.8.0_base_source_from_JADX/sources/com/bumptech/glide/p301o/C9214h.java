package com.bumptech.glide.p301o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.o.h */
public class C9214h extends FilterInputStream {

    /* renamed from: e */
    private int f23883e = Integer.MIN_VALUE;

    public C9214h(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private long m22080a(long j) {
        int i = this.f23883e;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE && j > ((long) i)) {
            j = (long) i;
        }
        return j;
    }

    /* renamed from: b */
    private void m22081b(long j) {
        int i = this.f23883e;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f23883e = (int) (((long) i) - j);
        }
    }

    public int available() throws IOException {
        int i = this.f23883e;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f23883e = i;
    }

    public int read() throws IOException {
        if (m22080a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m22081b(1);
        return read;
    }

    public synchronized void reset() throws IOException {
        super.reset();
        this.f23883e = Integer.MIN_VALUE;
    }

    public long skip(long j) throws IOException {
        long a = m22080a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m22081b(skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int a = (int) m22080a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m22081b((long) read);
        return read;
    }
}
