package p333g.p369e.p370a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: g.e.a.b */
class C12102b implements Closeable {

    /* renamed from: e */
    private final InputStream f31522e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Charset f31523f;

    /* renamed from: g */
    private byte[] f31524g;

    /* renamed from: h */
    private int f31525h;

    /* renamed from: i */
    private int f31526i;

    /* renamed from: g.e.a.b$a */
    class C12103a extends ByteArrayOutputStream {
        C12103a(int i) {
            super(i);
        }

        public String toString() {
            int i = this.count;
            try {
                return new String(this.buf, 0, (i <= 0 || this.buf[i + -1] != 13) ? this.count : i - 1, C12102b.this.f31523f.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C12102b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    private void m31962b() throws IOException {
        InputStream inputStream = this.f31522e;
        byte[] bArr = this.f31524g;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f31525h = 0;
            this.f31526i = read;
            return;
        }
        throw new EOFException();
    }

    public void close() throws IOException {
        synchronized (this.f31522e) {
            if (this.f31524g != null) {
                this.f31524g = null;
                this.f31522e.close();
            }
        }
    }

    public C12102b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C12104c.f31528a)) {
            this.f31522e = inputStream;
            this.f31523f = charset;
            this.f31524g = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: a */
    public String mo35833a() throws IOException {
        int i;
        int i2;
        synchronized (this.f31522e) {
            if (this.f31524g != null) {
                if (this.f31525h >= this.f31526i) {
                    m31962b();
                }
                for (int i3 = this.f31525h; i3 != this.f31526i; i3++) {
                    if (this.f31524g[i3] == 10) {
                        if (i3 != this.f31525h) {
                            i2 = i3 - 1;
                            if (this.f31524g[i2] == 13) {
                                String str = new String(this.f31524g, this.f31525h, i2 - this.f31525h, this.f31523f.name());
                                this.f31525h = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f31524g, this.f31525h, i2 - this.f31525h, this.f31523f.name());
                        this.f31525h = i3 + 1;
                        return str2;
                    }
                }
                C12103a aVar = new C12103a((this.f31526i - this.f31525h) + 80);
                loop1:
                while (true) {
                    aVar.write(this.f31524g, this.f31525h, this.f31526i - this.f31525h);
                    this.f31526i = -1;
                    m31962b();
                    i = this.f31525h;
                    while (true) {
                        if (i != this.f31526i) {
                            if (this.f31524g[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.f31525h) {
                    aVar.write(this.f31524g, this.f31525h, i - this.f31525h);
                }
                this.f31525h = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }
}
