package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.k */
final class C11878k extends InputStream {

    /* renamed from: e */
    private final InputStream f30773e;

    /* renamed from: f */
    private long f30774f;

    /* renamed from: g */
    private long f30775g;

    /* renamed from: h */
    private long f30776h;

    /* renamed from: i */
    private long f30777i;

    public C11878k(InputStream inputStream) {
        this(inputStream, 4096);
    }

    /* renamed from: b */
    private void m31195b(long j) {
        try {
            if (this.f30775g >= this.f30774f || this.f30774f > this.f30776h) {
                this.f30775g = this.f30774f;
                this.f30773e.mark((int) (j - this.f30774f));
            } else {
                this.f30773e.reset();
                this.f30773e.mark((int) (j - this.f30775g));
                m31194a(this.f30775g, this.f30774f);
            }
            this.f30776h = j;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to mark: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public long mo35119a(int i) {
        long j = this.f30774f + ((long) i);
        if (this.f30776h < j) {
            m31195b(j);
        }
        return this.f30774f;
    }

    public int available() throws IOException {
        return this.f30773e.available();
    }

    public void close() throws IOException {
        this.f30773e.close();
    }

    public void mark(int i) {
        this.f30777i = mo35119a(i);
    }

    public boolean markSupported() {
        return this.f30773e.markSupported();
    }

    public int read() throws IOException {
        int read = this.f30773e.read();
        if (read != -1) {
            this.f30774f++;
        }
        return read;
    }

    public void reset() throws IOException {
        mo35120a(this.f30777i);
    }

    public long skip(long j) throws IOException {
        long skip = this.f30773e.skip(j);
        this.f30774f += skip;
        return skip;
    }

    public C11878k(InputStream inputStream, int i) {
        this.f30777i = -1;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, i);
        }
        this.f30773e = inputStream;
    }

    public int read(byte[] bArr) throws IOException {
        int read = this.f30773e.read(bArr);
        if (read != -1) {
            this.f30774f += (long) read;
        }
        return read;
    }

    /* renamed from: a */
    public void mo35120a(long j) throws IOException {
        if (this.f30774f > this.f30776h || j < this.f30775g) {
            throw new IOException("Cannot reset");
        }
        this.f30773e.reset();
        m31194a(this.f30775g, j);
        this.f30774f = j;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f30773e.read(bArr, i, i2);
        if (read != -1) {
            this.f30774f += (long) read;
        }
        return read;
    }

    /* renamed from: a */
    private void m31194a(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.f30773e.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }
}
