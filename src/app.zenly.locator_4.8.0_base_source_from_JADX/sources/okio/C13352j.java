package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: okio.j */
public final class C13352j implements Source {

    /* renamed from: e */
    private int f34632e = 0;

    /* renamed from: f */
    private final BufferedSource f34633f;

    /* renamed from: g */
    private final Inflater f34634g;

    /* renamed from: h */
    private final C13353k f34635h;

    /* renamed from: i */
    private final CRC32 f34636i = new CRC32();

    public C13352j(Source source) {
        if (source != null) {
            this.f34634g = new Inflater(true);
            this.f34633f = C13354l.m35375a(source);
            this.f34635h = new C13353k(this.f34633f, this.f34634g);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    private void m35368a() throws IOException {
        this.f34633f.require(10);
        byte a = this.f34633f.buffer().mo38482a(3);
        boolean z = ((a >> 1) & 1) == 1;
        if (z) {
            m35370a(this.f34633f.buffer(), 0, 10);
        }
        m35369a("ID1ID2", 8075, (int) this.f34633f.readShort());
        this.f34633f.skip(8);
        if (((a >> 2) & 1) == 1) {
            this.f34633f.require(2);
            if (z) {
                m35370a(this.f34633f.buffer(), 0, 2);
            }
            long readShortLe = (long) this.f34633f.buffer().readShortLe();
            this.f34633f.require(readShortLe);
            if (z) {
                m35370a(this.f34633f.buffer(), 0, readShortLe);
            }
            this.f34633f.skip(readShortLe);
        }
        if (((a >> 3) & 1) == 1) {
            long indexOf = this.f34633f.indexOf(0);
            if (indexOf != -1) {
                if (z) {
                    m35370a(this.f34633f.buffer(), 0, indexOf + 1);
                }
                this.f34633f.skip(indexOf + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((a >> 4) & 1) == 1) {
            long indexOf2 = this.f34633f.indexOf(0);
            if (indexOf2 != -1) {
                if (z) {
                    m35370a(this.f34633f.buffer(), 0, indexOf2 + 1);
                }
                this.f34633f.skip(indexOf2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m35369a("FHCRC", (int) this.f34633f.readShortLe(), (int) (short) ((int) this.f34636i.getValue()));
            this.f34636i.reset();
        }
    }

    /* renamed from: b */
    private void m35371b() throws IOException {
        m35369a("CRC", this.f34633f.readIntLe(), (int) this.f34636i.getValue());
        m35369a("ISIZE", this.f34633f.readIntLe(), (int) this.f34634g.getBytesWritten());
    }

    public void close() throws IOException {
        this.f34635h.close();
    }

    public long read(C13342c cVar, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f34632e == 0) {
                m35368a();
                this.f34632e = 1;
            }
            if (this.f34632e == 1) {
                long j2 = cVar.f34606f;
                long read = this.f34635h.read(cVar, j);
                if (read != -1) {
                    m35370a(cVar, j2, read);
                    return read;
                }
                this.f34632e = 2;
            }
            if (this.f34632e == 2) {
                m35371b();
                this.f34632e = 3;
                if (!this.f34633f.exhausted()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public C13368t timeout() {
        return this.f34633f.timeout();
    }

    /* renamed from: a */
    private void m35370a(C13342c cVar, long j, long j2) {
        C13365q qVar = cVar.f34605e;
        while (true) {
            int i = qVar.f34665c;
            int i2 = qVar.f34664b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            qVar = qVar.f34668f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) qVar.f34664b) + j);
            int min = (int) Math.min((long) (qVar.f34665c - i3), j2);
            this.f34636i.update(qVar.f34663a, i3, min);
            j2 -= (long) min;
            qVar = qVar.f34668f;
            j = 0;
        }
    }

    /* renamed from: a */
    private void m35369a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
