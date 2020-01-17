package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: okio.k */
public final class C13353k implements Source {

    /* renamed from: e */
    private final BufferedSource f34637e;

    /* renamed from: f */
    private final Inflater f34638f;

    /* renamed from: g */
    private int f34639g;

    /* renamed from: h */
    private boolean f34640h;

    C13353k(BufferedSource bufferedSource, Inflater inflater) {
        if (bufferedSource == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f34637e = bufferedSource;
            this.f34638f = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: b */
    private void m35372b() throws IOException {
        int i = this.f34639g;
        if (i != 0) {
            int remaining = i - this.f34638f.getRemaining();
            this.f34639g -= remaining;
            this.f34637e.skip((long) remaining);
        }
    }

    /* renamed from: a */
    public final boolean mo38549a() throws IOException {
        if (!this.f34638f.needsInput()) {
            return false;
        }
        m35372b();
        if (this.f34638f.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f34637e.exhausted()) {
            return true;
        } else {
            C13365q qVar = this.f34637e.buffer().f34605e;
            int i = qVar.f34665c;
            int i2 = qVar.f34664b;
            this.f34639g = i - i2;
            this.f34638f.setInput(qVar.f34663a, i2, this.f34639g);
            return false;
        }
    }

    public void close() throws IOException {
        if (!this.f34640h) {
            this.f34638f.end();
            this.f34640h = true;
            this.f34637e.close();
        }
    }

    public long read(C13342c cVar, long j) throws IOException {
        C13365q b;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f34640h) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo38549a();
                try {
                    b = cVar.mo38490b(1);
                    int inflate = this.f34638f.inflate(b.f34663a, b.f34665c, (int) Math.min(j, (long) (8192 - b.f34665c)));
                    if (inflate > 0) {
                        b.f34665c += inflate;
                        long j2 = (long) inflate;
                        cVar.f34606f += j2;
                        return j2;
                    } else if (this.f34638f.finished()) {
                        break;
                    } else if (this.f34638f.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            m35372b();
            if (b.f34664b == b.f34665c) {
                cVar.f34605e = b.mo38574b();
                C13366r.m35401a(b);
            }
            return -1;
        }
    }

    public C13368t timeout() {
        return this.f34637e.timeout();
    }
}
