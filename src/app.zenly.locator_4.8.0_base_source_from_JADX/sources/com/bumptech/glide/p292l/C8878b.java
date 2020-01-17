package com.bumptech.glide.p292l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.bumptech.glide.l.b */
class C8878b implements Closeable {

    /* renamed from: e */
    private final InputStream f23155e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Charset f23156f;

    /* renamed from: g */
    private byte[] f23157g;

    /* renamed from: h */
    private int f23158h;

    /* renamed from: i */
    private int f23159i;

    /* renamed from: com.bumptech.glide.l.b$a */
    class C8879a extends ByteArrayOutputStream {
        C8879a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C8878b.this.f23156f.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C8878b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: c */
    private void m21315c() throws IOException {
        InputStream inputStream = this.f23155e;
        byte[] bArr = this.f23157g;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f23158h = 0;
            this.f23159i = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public String mo24214b() throws IOException {
        int i;
        int i2;
        synchronized (this.f23155e) {
            if (this.f23157g != null) {
                if (this.f23158h >= this.f23159i) {
                    m21315c();
                }
                for (int i3 = this.f23158h; i3 != this.f23159i; i3++) {
                    if (this.f23157g[i3] == 10) {
                        if (i3 != this.f23158h) {
                            i2 = i3 - 1;
                            if (this.f23157g[i2] == 13) {
                                String str = new String(this.f23157g, this.f23158h, i2 - this.f23158h, this.f23156f.name());
                                this.f23158h = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f23157g, this.f23158h, i2 - this.f23158h, this.f23156f.name());
                        this.f23158h = i3 + 1;
                        return str2;
                    }
                }
                C8879a aVar = new C8879a((this.f23159i - this.f23158h) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f23157g, this.f23158h, this.f23159i - this.f23158h);
                    this.f23159i = -1;
                    m21315c();
                    i = this.f23158h;
                    while (true) {
                        if (i != this.f23159i) {
                            if (this.f23157g[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f23158h) {
                    aVar.write(this.f23157g, this.f23158h, i - this.f23158h);
                }
                this.f23158h = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public void close() throws IOException {
        synchronized (this.f23155e) {
            if (this.f23157g != null) {
                this.f23157g = null;
                this.f23155e.close();
            }
        }
    }

    public C8878b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C8880c.f23161a)) {
            this.f23155e = inputStream;
            this.f23156f = charset;
            this.f23157g = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public boolean mo24213a() {
        return this.f23159i == -1;
    }
}
