package com.google.android.gms.internal.firebase_messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.firebase_messaging.j */
final class C10460j extends FilterInputStream {

    /* renamed from: e */
    private long f27377e;

    /* renamed from: f */
    private long f27378f = -1;

    C10460j(InputStream inputStream, long j) {
        super(inputStream);
        C10456f.m26842a(inputStream);
        this.f27377e = 1048576;
    }

    public final int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.f27377e);
    }

    public final synchronized void mark(int i) {
        this.in.mark(i);
        this.f27378f = this.f27377e;
    }

    public final int read() throws IOException {
        if (this.f27377e == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f27377e--;
        }
        return read;
    }

    public final synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f27378f != -1) {
            this.in.reset();
            this.f27377e = this.f27378f;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.f27377e));
        this.f27377e -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f27377e;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.f27377e -= (long) read;
        }
        return read;
    }
}
