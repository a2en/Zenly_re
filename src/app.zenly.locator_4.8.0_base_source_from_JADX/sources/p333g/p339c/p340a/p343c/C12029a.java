package p333g.p339c.p340a.p343c;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: g.c.a.c.a */
public class C12029a extends FilterInputStream {

    /* renamed from: e */
    private int f31335e;

    /* renamed from: f */
    private int f31336f;

    public C12029a(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (i >= 0) {
            this.f31335e = i;
            this.f31336f = -1;
        } else {
            throw new IllegalArgumentException("limit must be >= 0");
        }
    }

    public int available() throws IOException {
        return Math.min(this.in.available(), this.f31335e);
    }

    public void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f31336f = this.f31335e;
        }
    }

    public int read() throws IOException {
        if (this.f31335e == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f31335e--;
        }
        return read;
    }

    public void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f31336f != -1) {
            this.in.reset();
            this.f31335e = this.f31336f;
        } else {
            throw new IOException("mark not set");
        }
    }

    public long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, (long) this.f31335e));
        this.f31335e = (int) (((long) this.f31335e) - skip);
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f31335e;
        if (i3 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.f31335e -= read;
        }
        return read;
    }
}
