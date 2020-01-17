package p333g.p339c.p340a.p343c;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.c.a.c.b */
public class C12030b extends FilterInputStream {

    /* renamed from: e */
    private final byte[] f31337e;

    /* renamed from: f */
    private int f31338f;

    /* renamed from: g */
    private int f31339g;

    public C12030b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (bArr != null) {
            this.f31337e = bArr;
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    private int m31690a() {
        int i = this.f31338f;
        byte[] bArr = this.f31337e;
        if (i >= bArr.length) {
            return -1;
        }
        this.f31338f = i + 1;
        return bArr[i] & 255;
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f31339g = this.f31338f;
        }
    }

    public int read() throws IOException {
        int read = this.in.read();
        if (read != -1) {
            return read;
        }
        return m31690a();
    }

    public void reset() throws IOException {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f31338f = this.f31339g;
            return;
        }
        throw new IOException("mark is not supported");
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int a = m31690a();
            if (a == -1) {
                break;
            }
            bArr[i + i3] = (byte) a;
            i3++;
        }
        if (i3 <= 0) {
            i3 = -1;
        }
        return i3;
    }
}
