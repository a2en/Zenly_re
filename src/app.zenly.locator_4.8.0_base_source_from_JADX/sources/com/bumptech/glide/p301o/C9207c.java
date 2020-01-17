package com.bumptech.glide.p301o;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.o.c */
public final class C9207c extends FilterInputStream {

    /* renamed from: e */
    private final long f23870e;

    /* renamed from: f */
    private int f23871f;

    private C9207c(InputStream inputStream, long j) {
        super(inputStream);
        this.f23870e = j;
    }

    /* renamed from: a */
    public static InputStream m22065a(InputStream inputStream, long j) {
        return new C9207c(inputStream, j);
    }

    public synchronized int available() throws IOException {
        return (int) Math.max(this.f23870e - ((long) this.f23871f), (long) this.in.available());
    }

    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        m22064a(read >= 0 ? 1 : -1);
        return read;
    }

    /* renamed from: a */
    private int m22064a(int i) throws IOException {
        if (i >= 0) {
            this.f23871f += i;
        } else if (this.f23870e - ((long) this.f23871f) > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read all expected data, expected: ");
            sb.append(this.f23870e);
            sb.append(", but read: ");
            sb.append(this.f23871f);
            throw new IOException(sb.toString());
        }
        return i;
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int read;
        read = super.read(bArr, i, i2);
        m22064a(read);
        return read;
    }
}
